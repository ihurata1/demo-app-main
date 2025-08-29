package com.serverapp.domain

import android.Manifest
import android.bluetooth.*
import android.bluetooth.le.*
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.ParcelUuid
import android.util.Log
import androidx.core.app.ActivityCompat
import org.json.JSONObject
import org.json.JSONException
import java.nio.ByteBuffer
import java.util.*

/**
 * BLE Manager for handling all Bluetooth Low Energy operations
 * Manages advertising drone information (brand, model, serial number)
 */
class BLEManager(private val context: Context) {
    
    companion object {
        private const val TAG = "BLEManager"
        private const val SERVICE_UUID = "25AE1441-05D3-4C5B-8281-93D4E07420CF"
        private const val CHAR_FOR_READ_UUID = "25AE1442-05D3-4C5B-8281-93D4E07420CF"
        private const val CHAR_FOR_WRITE_UUID = "25AE1443-05D3-4C5B-8281-93D4E07420CF"
        private const val CHAR_FOR_INDICATE_UUID = "25AE1444-05D3-4C5B-8281-93D4E07420CF"
        private const val CCC_DESCRIPTOR_UUID = "00002902-0000-1000-8000-00805f9b34fb"
        
        // BLE advertising data size limits - with Service UUID
        private const val MAX_MANUFACTURER_DATA_SIZE = 12 // bytes (with Service UUID)
        private const val MANUFACTURER_ID = 2218 // DJI manufacturer ID
        
        // TLV (Type-Length-Value) format constants
        private const val TLV_TYPE_VENDOR_ID = 0x01.toByte()
        private const val TLV_TYPE_VENDOR_NAME = 0x02.toByte()
        private const val TLV_TYPE_SERIAL_SHORT = 0x03.toByte()
        
        // Data limits for compact TLV format (12 bytes total)
        private const val VENDOR_NAME_MAX_LENGTH = 3 // "DJI"
        private const val SERIAL_SHORT_MAX_LENGTH = 6 // First 6 chars of serial (compact)
        
        // Request codes
        private const val ENABLE_BLUETOOTH_REQUEST_CODE = 1001
        private const val BLUETOOTH_PERMISSIONS_REQUEST_CODE = 1002
    }
    
    data class DroneInfo(
        val brand: String = "DJI",
        val model: String = "",
        val serialNumber: String = ""
    ) {
        /**
         * Converts DroneInfo to JSON format
         * Example: {"brand":"DJI","model":"DJI_MINI_3_PRO","serialNumber":"1581F4XFC232U007W2AL"}
         */
        fun toJson(): String {
            return try {
                JSONObject().apply {
                    put("brand", brand)
                    put("model", model)
                    put("serialNumber", serialNumber)
                }.toString()
            } catch (e: JSONException) {
                Log.e(TAG, "Error creating JSON: ${e.message}")
                // Fallback to pipe-separated format
                "$brand|$model|$serialNumber"
            }
        }
        
        companion object {
            /**
             * Creates DroneInfo from JSON string
             * Supports both JSON and old pipe-separated format
             */
            fun fromJson(jsonString: String): DroneInfo? {
                return try {
                    val json = JSONObject(jsonString)
                    DroneInfo(
                        brand = json.optString("brand", "DJI"),
                        model = json.optString("model", ""),
                        serialNumber = json.optString("serialNumber", "")
                    )
                } catch (e: JSONException) {
                    Log.e(TAG, "Error parsing JSON: ${e.message}")
                    // Fallback: try old pipe-separated format
                    val parts = jsonString.split("|")
                    if (parts.size >= 3) {
                        DroneInfo(parts[0], parts[1], parts[2])
                    } else {
                        null
                    }
                }
            }
        }
    }
    
    interface BLECallback {
        fun onAdvertisingStarted()
        fun onAdvertisingFailed(errorCode: Int, message: String)
        fun onAdvertisingStopped()
        fun onConnectionStateChanged(device: BluetoothDevice, isConnected: Boolean)
    }
    
    private val bluetoothManager: BluetoothManager by lazy {
        context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    }
    
    private val bluetoothAdapter: BluetoothAdapter by lazy {
        bluetoothManager.adapter
    }
    
    private val bleAdvertiser: BluetoothLeAdvertiser by lazy {
        bluetoothAdapter.bluetoothLeAdvertiser
    }
    
    private var gattServer: BluetoothGattServer? = null
    private val subscribedDevices = mutableSetOf<BluetoothDevice>()
    private val handler = Handler(Looper.getMainLooper())
    
    private var isAdvertising = false
    private var callback: BLECallback? = null
    private var currentDroneInfo = DroneInfo()
    
    // Throttling mechanism to prevent spam logging
    private var lastResponseTime = 0L
    private var responseCount = 0
    private val RESPONSE_LOG_INTERVAL_MS = 5000L // Log every 5 seconds max
    
    private val advertiseSettings = AdvertiseSettings.Builder()
        .setAdvertiseMode(AdvertiseSettings.ADVERTISE_MODE_BALANCED)
        .setTxPowerLevel(AdvertiseSettings.ADVERTISE_TX_POWER_MEDIUM)
        .setConnectable(true)
        .build()
    
    fun setCallback(callback: BLECallback) {
        this.callback = callback
    }
    
    fun updateDroneInfo(droneInfo: DroneInfo) {
        currentDroneInfo = droneInfo
        Log.d(TAG, "Drone info updated: $droneInfo")
        
        // If advertising, restart with new data
        if (isAdvertising) {
            stopAdvertising()
            handler.postDelayed({ startAdvertising() }, 500)
        }
    }
    
    fun startAdvertising() {
        Log.d(TAG, "Starting BLE advertising...")
        
        ensureBluetoothReady { isReady, message ->
            if (isReady) {
                startBLEAdvertising()
            } else {
                Log.e(TAG, "Cannot start advertising: $message")
                callback?.onAdvertisingFailed(-1, message)
            }
        }
    }
    
    fun stopAdvertising() {
        Log.d(TAG, "Stopping BLE advertising...")
        
        if (isAdvertising) {
            isAdvertising = false
            bleAdvertiser.stopAdvertising(simpleAdvertiseCallback)
            stopGattServer()
            callback?.onAdvertisingStopped()
        }
    }
    
    fun isAdvertising(): Boolean = isAdvertising
    
    private fun startBLEAdvertising() {
        try {
            val manufacturerData = createTLVManufacturerData(currentDroneInfo)
            
            Log.d(TAG, "TLV Manufacturer data size: ${manufacturerData.size} bytes")
            Log.d(TAG, "TLV Manufacturer data: ${manufacturerData.joinToString(" ") { "%02x".format(it) }}")
            
            // TLV format with Service UUID for scanner compatibility
            val advertiseData = AdvertiseData.Builder()
                .setIncludeDeviceName(false) // Save space
                .setIncludeTxPowerLevel(false) // Save space
                .addServiceUuid(ParcelUuid.fromString(SERVICE_UUID)) // Add Service UUID back for compatibility
                .addManufacturerData(MANUFACTURER_ID, manufacturerData)
                .build()
            
            Log.d(TAG, "Starting TLV advertising (Service UUID: $SERVICE_UUID, Manufacturer ID: $MANUFACTURER_ID)...")
            
            startGattServer()
            bleAdvertiser.startAdvertising(advertiseSettings, advertiseData, simpleAdvertiseCallback)
            isAdvertising = true
            
        } catch (e: Exception) {
            Log.e(TAG, "Failed to start advertising: ${e.message}", e)
            callback?.onAdvertisingFailed(-1, e.message ?: "Unknown error")
        }
    }
    
    /**
     * Creates TLV formatted manufacturer data
     * Format: [TYPE][LENGTH][VALUE] for each field
     * - Vendor ID: 2218 (DJI)
     * - Vendor Name: "DJI" 
     * - Serial Short: First 6 chars of serial number
     */
    private fun createTLVManufacturerData(droneInfo: DroneInfo): ByteArray {
        try {
            // Calculate required size first
            val vendorNameBytes = droneInfo.brand.take(VENDOR_NAME_MAX_LENGTH).toByteArray(Charsets.UTF_8)
            val serialShort = droneInfo.serialNumber.take(SERIAL_SHORT_MAX_LENGTH)
            val serialShortBytes = serialShort.toByteArray(Charsets.UTF_8)
            
            val requiredSize = 4 + // TLV 1: Vendor ID (1+1+2)
                              2 + vendorNameBytes.size + // TLV 2: Vendor Name (1+1+N)
                              2 + serialShortBytes.size   // TLV 3: Serial Short (1+1+N)
            
            Log.d(TAG, "📊 TLV Size calculation: ${requiredSize}B (limit: ${MAX_MANUFACTURER_DATA_SIZE}B)")
            
            if (requiredSize > MAX_MANUFACTURER_DATA_SIZE) {
                Log.w(TAG, "⚠️ TLV data too large ($requiredSize > $MAX_MANUFACTURER_DATA_SIZE), using fallback")
                // Fallback: just serial number
                return serialShort.toByteArray(Charsets.UTF_8).take(MAX_MANUFACTURER_DATA_SIZE).toByteArray()
            }
            
            val buffer = ByteBuffer.allocate(requiredSize)
            
            // TLV 1: Vendor ID (2218 = DJI)
            buffer.put(TLV_TYPE_VENDOR_ID)
            buffer.put(2.toByte()) // Length: 2 bytes for vendor ID
            buffer.putShort(MANUFACTURER_ID.toShort()) // DJI vendor ID: 2218
            
            // TLV 2: Vendor Name ("DJI")
            buffer.put(TLV_TYPE_VENDOR_NAME)
            buffer.put(vendorNameBytes.size.toByte())
            buffer.put(vendorNameBytes)
            
            // TLV 3: Serial Short (first 6 chars)
            buffer.put(TLV_TYPE_SERIAL_SHORT)
            buffer.put(serialShortBytes.size.toByte())
            buffer.put(serialShortBytes)
            
            val result = buffer.array()
            
            Log.d(TAG, "📡 TLV Data - Vendor: ${droneInfo.brand}, Serial: '$serialShort' (${result.size}B)")
            Log.d(TAG, "📋 Full info via GATT: ${droneInfo.brand}|${droneInfo.model}|${droneInfo.serialNumber}")
            
            return result
            
        } catch (e: Exception) {
            Log.e(TAG, "Error creating TLV manufacturer data: ${e.message}", e)
            // Fallback: simple format
            val fallback = droneInfo.serialNumber.take(10).toByteArray(Charsets.UTF_8)
            Log.d(TAG, "🔄 Using fallback data: ${fallback.size}B")
            return fallback
        }
    }
    
    /**
     * Converts hex string to byte array
     */
    private fun hexStringToByteArray(hex: String): ByteArray {
        val len = hex.length
        val data = ByteArray(len / 2)
        var i = 0
        while (i < len) {
            data[i / 2] = ((Character.digit(hex[i], 16) shl 4) + Character.digit(hex[i + 1], 16)).toByte()
            i += 2
        }
        return data
    }
    
    /**
     * Parses TLV formatted manufacturer data
     * Format: [TYPE][LENGTH][VALUE] for each field
     */
    fun parseTLVManufacturerData(data: ByteArray): DroneInfo? {
        try {
            if (data.isEmpty()) return null
            
            val buffer = ByteBuffer.wrap(data)
            var vendorId = 0
            var vendorName = ""
            var serialShort = ""
            
            while (buffer.remaining() >= 2) {
                val type = buffer.get()
                val length = buffer.get().toInt() and 0xFF
                
                if (buffer.remaining() < length) break
                
                when (type) {
                    TLV_TYPE_VENDOR_ID -> {
                        if (length == 2) {
                            vendorId = buffer.short.toInt() and 0xFFFF
                        } else {
                            buffer.position(buffer.position() + length)
                        }
                    }
                    TLV_TYPE_VENDOR_NAME -> {
                        val nameBytes = ByteArray(length)
                        buffer.get(nameBytes)
                        vendorName = String(nameBytes, Charsets.UTF_8)
                    }
                    TLV_TYPE_SERIAL_SHORT -> {
                        val serialBytes = ByteArray(length)
                        buffer.get(serialBytes)
                        serialShort = String(serialBytes, Charsets.UTF_8)
                    }
                    else -> {
                        // Skip unknown TLV types
                        buffer.position(buffer.position() + length)
                    }
                }
            }
            
            Log.d(TAG, "📱 TLV Parsed - Vendor ID: $vendorId, Name: '$vendorName', Serial: '$serialShort'")
            
            return DroneInfo(vendorName.ifEmpty { "DJI" }, "DJI_DRONE", serialShort)
            
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing TLV manufacturer data: ${e.message}", e)
            return null
        }
    }
    
    private fun ensureBluetoothReady(callback: (Boolean, String) -> Unit) {
        if (!bluetoothAdapter.isEnabled) {
            callback(false, "Bluetooth is not enabled")
            return
        }
        
        if (!hasBluetoothPermissions()) {
            callback(false, "Bluetooth permissions not granted")
            return
        }
        
        if (!bluetoothAdapter.isMultipleAdvertisementSupported) {
            callback(false, "BLE advertising not supported on this device")
            return
        }
        
        callback(true, "Bluetooth ready")
    }
    
    private fun hasBluetoothPermissions(): Boolean {
        val permissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            arrayOf(
                Manifest.permission.BLUETOOTH_ADVERTISE,
                Manifest.permission.BLUETOOTH_CONNECT
            )
        } else {
            arrayOf(
                Manifest.permission.BLUETOOTH,
                Manifest.permission.BLUETOOTH_ADMIN
            )
        }
        
        return permissions.all { permission ->
            ActivityCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED
        }
    }
    
    private fun startGattServer() {
        try {
            gattServer = bluetoothManager.openGattServer(context, gattServerCallback)
            
            val service = BluetoothGattService(
                UUID.fromString(SERVICE_UUID),
                BluetoothGattService.SERVICE_TYPE_PRIMARY
            )
            
            val charForRead = BluetoothGattCharacteristic(
                UUID.fromString(CHAR_FOR_READ_UUID),
                BluetoothGattCharacteristic.PROPERTY_READ,
                BluetoothGattCharacteristic.PERMISSION_READ
            )
            
            val charForWrite = BluetoothGattCharacteristic(
                UUID.fromString(CHAR_FOR_WRITE_UUID),
                BluetoothGattCharacteristic.PROPERTY_WRITE,
                BluetoothGattCharacteristic.PERMISSION_WRITE
            )
            
            val charForIndicate = BluetoothGattCharacteristic(
                UUID.fromString(CHAR_FOR_INDICATE_UUID),
                BluetoothGattCharacteristic.PROPERTY_INDICATE,
                BluetoothGattCharacteristic.PERMISSION_READ
            )
            
            val descriptor = BluetoothGattDescriptor(
                UUID.fromString(CCC_DESCRIPTOR_UUID),
                BluetoothGattDescriptor.PERMISSION_READ or BluetoothGattDescriptor.PERMISSION_WRITE
            )
            
            charForIndicate.addDescriptor(descriptor)
            
            service.addCharacteristic(charForRead)
            service.addCharacteristic(charForWrite)
            service.addCharacteristic(charForIndicate)
            
            gattServer?.addService(service)
            
            Log.d(TAG, "GATT server started successfully")
            
        } catch (e: Exception) {
            Log.e(TAG, "Failed to start GATT server: ${e.message}", e)
        }
    }
    
    private fun stopGattServer() {
        gattServer?.close()
        gattServer = null
        subscribedDevices.clear()
        Log.d(TAG, "GATT server stopped")
    }
    
    private val simpleAdvertiseCallback = object : AdvertiseCallback() {
        override fun onStartSuccess(settingsInEffect: AdvertiseSettings) {
            Log.d(TAG, "✅ BLE advertising started (Manufacturer ID: $MANUFACTURER_ID)")
            callback?.onAdvertisingStarted()
        }
        
        override fun onStartFailure(errorCode: Int) {
            isAdvertising = false
            val errorMessage = when (errorCode) {
                ADVERTISE_FAILED_DATA_TOO_LARGE -> "Data too large"
                ADVERTISE_FAILED_TOO_MANY_ADVERTISERS -> "Too many advertisers"
                ADVERTISE_FAILED_ALREADY_STARTED -> "Already started"
                ADVERTISE_FAILED_INTERNAL_ERROR -> "Internal error"
                ADVERTISE_FAILED_FEATURE_UNSUPPORTED -> "Feature unsupported"
                else -> "Unknown error ($errorCode)"
            }
            
            Log.e(TAG, "❌ BLE advertising failed: $errorMessage")
            callback?.onAdvertisingFailed(errorCode, errorMessage)
        }
    }
    
    private val gattServerCallback = object : BluetoothGattServerCallback() {
        override fun onConnectionStateChange(device: BluetoothDevice, status: Int, newState: Int) {
            val isConnected = newState == BluetoothProfile.STATE_CONNECTED
            Log.d(TAG, "Device ${device.address} connection state: $isConnected")
            
            if (!isConnected) {
                subscribedDevices.remove(device)
            }
            
            callback?.onConnectionStateChanged(device, isConnected)
        }
        
        override fun onCharacteristicReadRequest(
            device: BluetoothDevice,
            requestId: Int,
            offset: Int,
            characteristic: BluetoothGattCharacteristic
        ) {
            when (characteristic.uuid) {
                UUID.fromString(CHAR_FOR_READ_UUID) -> {
                    // Send complete drone information as JSON via GATT
                    val jsonInfo = currentDroneInfo.toJson()
                    val jsonBytes = jsonInfo.toByteArray(Charsets.UTF_8)
                    
                    // BLE GATT has size limitations, typically 512 bytes max
                    val maxGattSize = 512
                    val fullData = if (jsonBytes.size > maxGattSize) {
                        Log.w(TAG, "JSON too large for GATT (${jsonBytes.size} bytes), creating minimal JSON")
                        // Create a minimal valid JSON if original is too large
                        val minimalDroneInfo = DroneInfo(
                            brand = currentDroneInfo.brand,
                            model = if (currentDroneInfo.model.length > 20) currentDroneInfo.model.substring(0, 20) else currentDroneInfo.model,
                            serialNumber = if (currentDroneInfo.serialNumber.length > 30) currentDroneInfo.serialNumber.substring(0, 30) else currentDroneInfo.serialNumber
                        )
                        minimalDroneInfo.toJson().toByteArray(Charsets.UTF_8)
                    } else {
                        jsonBytes
                    }
                    
                    // Handle offset correctly - send only the portion of data requested
                    val responseData = if (offset < fullData.size) {
                        fullData.copyOfRange(offset, fullData.size)
                    } else {
                        // If offset is beyond our data, send empty array
                        ByteArray(0)
                    }
                    
                    gattServer?.sendResponse(
                        device,
                        requestId,
                        BluetoothGatt.GATT_SUCCESS,
                        offset,  // Use the actual offset instead of 0
                        responseData
                    )
                    
                    // Debug: Log what we're actually sending
                    if (responseData.isNotEmpty()) {
                        val sentString = String(responseData, Charsets.UTF_8)
                        Log.d(TAG, "Sent from offset $offset (${responseData.size} bytes): $sentString")
                    } else {
                        Log.d(TAG, "Sent empty response for offset $offset (data size: ${fullData.size})")
                    }
                    
                    // Throttled logging to prevent spam
                    val currentTime = System.currentTimeMillis()
                    responseCount++
                    
                    if (currentTime - lastResponseTime >= RESPONSE_LOG_INTERVAL_MS) {
                        if (responseCount == 1) {
                            Log.d(TAG, "Drone info sent as JSON via GATT: $jsonInfo")
                        } else {
                            Log.d(TAG, "Drone info sent as JSON via GATT ($responseCount times in ${(currentTime - lastResponseTime)/1000}s): $jsonInfo")
                        }
                        lastResponseTime = currentTime
                        responseCount = 0
                    }
                }
                else -> {
                    gattServer?.sendResponse(device, requestId, BluetoothGatt.GATT_FAILURE, 0, null)
                    Log.w(TAG, "Unknown characteristic read request: ${characteristic.uuid}")
                }
            }
        }
        
        override fun onCharacteristicWriteRequest(
            device: BluetoothDevice,
            requestId: Int,
            characteristic: BluetoothGattCharacteristic,
            preparedWrite: Boolean,
            responseNeeded: Boolean,
            offset: Int,
            value: ByteArray?
        ) {
            when (characteristic.uuid) {
                UUID.fromString(CHAR_FOR_WRITE_UUID) -> {
                    val receivedData = value?.toString(Charsets.UTF_8) ?: ""
                    Log.d(TAG, "Write request received: $receivedData")
                    
                    if (responseNeeded) {
                        gattServer?.sendResponse(
                            device,
                            requestId,
                            BluetoothGatt.GATT_SUCCESS,
                            0,
                            "OK".toByteArray(Charsets.UTF_8)
                        )
                    }
                }
                else -> {
                    if (responseNeeded) {
                        gattServer?.sendResponse(device, requestId, BluetoothGatt.GATT_FAILURE, 0, null)
                    }
                    Log.w(TAG, "Unknown characteristic write request: ${characteristic.uuid}")
                }
            }
        }
        
        override fun onDescriptorReadRequest(
            device: BluetoothDevice,
            requestId: Int,
            offset: Int,
            descriptor: BluetoothGattDescriptor
        ) {
            when (descriptor.uuid) {
                UUID.fromString(CCC_DESCRIPTOR_UUID) -> {
                    val returnValue = if (subscribedDevices.contains(device)) {
                        BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                    } else {
                        BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
                    }
                    gattServer?.sendResponse(device, requestId, BluetoothGatt.GATT_SUCCESS, 0, returnValue)
                }
                else -> {
                    gattServer?.sendResponse(device, requestId, BluetoothGatt.GATT_FAILURE, 0, null)
                }
            }
        }
        
        override fun onDescriptorWriteRequest(
            device: BluetoothDevice,
            requestId: Int,
            descriptor: BluetoothGattDescriptor,
            preparedWrite: Boolean,
            responseNeeded: Boolean,
            offset: Int,
            value: ByteArray
        ) {
            when (descriptor.uuid) {
                UUID.fromString(CCC_DESCRIPTOR_UUID) -> {
                    var status = BluetoothGatt.GATT_REQUEST_NOT_SUPPORTED
                    
                    if (descriptor.characteristic.uuid == UUID.fromString(CHAR_FOR_INDICATE_UUID)) {
                        when {
                            Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) -> {
                                subscribedDevices.add(device)
                                status = BluetoothGatt.GATT_SUCCESS
                                Log.d(TAG, "Device ${device.address} subscribed to indications")
                            }
                            Arrays.equals(value, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE) -> {
                                subscribedDevices.remove(device)
                                status = BluetoothGatt.GATT_SUCCESS
                                Log.d(TAG, "Device ${device.address} unsubscribed from indications")
                            }
                        }
                    }
                    
                    if (responseNeeded) {
                        gattServer?.sendResponse(device, requestId, status, 0, null)
                    }
                }
                else -> {
                    if (responseNeeded) {
                        gattServer?.sendResponse(device, requestId, BluetoothGatt.GATT_FAILURE, 0, null)
                    }
                }
            }
        }
    }
    
    fun cleanup() {
        stopAdvertising()
        handler.removeCallbacksAndMessages(null)
        Log.d(TAG, "BLEManager cleaned up")
    }
}
