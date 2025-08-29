package com.clientapp.domain

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
import androidx.core.content.ContextCompat
import org.json.JSONObject
import org.json.JSONException
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.util.*
import java.util.concurrent.atomic.AtomicBoolean

/**
 * BLE Manager for handling all Bluetooth Low Energy operations
 * Manages scanning and connecting to BLE peripherals
 */
class BLEManager(private val context: Context) {
    
    companion object {
        private const val TAG = "BLEManager"
        private const val SERVICE_UUID = "25AE1441-05D3-4C5B-8281-93D4E07420CF"
        private const val READ_CHAR_UUID = "25AE1442-05D3-4C5B-8281-93D4E07420CF"
        
        // TLV type constants
        private const val TLV_TYPE_VENDOR_ID = 0x01.toByte()
        private const val TLV_TYPE_VENDOR_NAME = 0x02.toByte()
        private const val TLV_TYPE_SERIAL_SHORT = 0x03.toByte()
        
        private const val DJI_MANUFACTURER_ID = 2218 // DJI Manufacturer ID
        
        // Connection timeout
        private const val CONNECTION_TIMEOUT_MS = 10000L // 10 seconds
        
        // Buffer limits for data protection
        private const val MAX_BUFFER_SIZE = 2048 // 2KB max buffer size
        private const val MAX_JSON_SIZE = 1024 // 1KB max JSON size
    }
    
    data class DroneInfo(
        val brand: String = "DJI",
        val model: String = "",
        val serialNumber: String = ""
    ) {
        companion object {
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
                    // Fallback: try pipe-separated format
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
        fun onDeviceDiscovered(device: BluetoothDevice, droneInfo: DroneInfo?)
        fun onDeviceConnected(device: BluetoothDevice)
        fun onDeviceDisconnected(device: BluetoothDevice)
        fun onFullDeviceInfoReceived(device: BluetoothDevice, droneInfo: DroneInfo)
        fun onScanStarted()
        fun onScanStopped()
        fun onScanFailed(errorCode: Int, message: String)
        fun onConnectionFailed(device: BluetoothDevice, error: String)
    }
    
    private val bluetoothManager: BluetoothManager by lazy {
        context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    }
    
    private val bluetoothAdapter: BluetoothAdapter by lazy {
        bluetoothManager.adapter
    }
    
    private val bleScanner: BluetoothLeScanner by lazy {
        bluetoothAdapter.bluetoothLeScanner
    }
    
    private var connectedGatt: BluetoothGatt? = null
    private val handler = Handler(Looper.getMainLooper())
    
    // Thread-safe flags
    private val isScanning = AtomicBoolean(false)
    private val isConnecting = AtomicBoolean(false)
    private val hasReceivedDeviceInfo = AtomicBoolean(false)
    private val isProcessingData = AtomicBoolean(false)
    private val hasReadCharacteristic = AtomicBoolean(false)
    
    private val dataBuffer = StringBuilder()
    private val dataBufferLock = Object()
    
    private var callback: BLECallback? = null
    private var connectionTimeoutRunnable: Runnable? = null
    
    fun setCallback(callback: BLECallback) {
        this.callback = callback
    }
    
    fun startScanning() {
        if (isScanning.get()) {
            Log.d(TAG, "Already scanning, ignoring request")
            return
        }
        
        if (!hasAllPermissions()) {
            Log.e(TAG, "Required permissions not granted")
            callback?.onScanFailed(-1, "Required permissions not granted")
            return
        }
        
        if (!bluetoothAdapter.isEnabled) {
            Log.e(TAG, "Bluetooth is not enabled")
            callback?.onScanFailed(-1, "Bluetooth is not enabled")
            return
        }
        
        resetConnectionState()
        startBLEScan()
    }
    
    fun stopScanning() {
        if (isScanning.get()) {
            bleScanner.stopScan(scanCallback)
            isScanning.set(false)
            callback?.onScanStopped()
        }
    }
    
    fun disconnectDevice() {
        Log.d(TAG, "Disconnecting device")
        disconnectAndCleanup()
    }
    
    private fun startBLEScan() {
        Log.d(TAG, "Setting up BLE scan with service UUID filter")
        
        val filter = ScanFilter.Builder()
            .setServiceUuid(ParcelUuid.fromString(SERVICE_UUID))
            .build()
        
        val settings = ScanSettings.Builder()
            .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
            .build()
        
        val filters = listOf(filter)
        
        Log.d(TAG, "Starting BLE scan")
        bleScanner.startScan(filters, settings, scanCallback)
        isScanning.set(true)
        callback?.onScanStarted()
    }
    
    private val scanCallback = object : ScanCallback() {
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            Log.d(TAG, "BLE scan result received")
            
            val device = result.device
            val deviceName = device.name ?: "Unknown Device"
            Log.d(TAG, "Device discovered: $deviceName (${device.address})")
            
            // Extract and parse manufacturer-specific data
            var droneInfo: DroneInfo? = null
            
            val scanRecord = result.scanRecord
            if (scanRecord != null) {
                val manufacturerSpecificData = scanRecord.manufacturerSpecificData
                if (manufacturerSpecificData.size() > 0) {
                    val manufacturerId = manufacturerSpecificData.keyAt(0)
                    val manufacturerData = manufacturerSpecificData.get(manufacturerId)
                    Log.d(TAG, "Raw manufacturer data: ${bytesToHex(manufacturerData)}")
                    
                    droneInfo = parseTLVManufacturerData(manufacturerData)
                    if (droneInfo != null) {
                        Log.d(TAG, "TLV Parsed - Brand: '${droneInfo.brand}', Serial: '${droneInfo.serialNumber}'")
                    }
                }
            }
            
            callback?.onDeviceDiscovered(device, droneInfo)
            
            // Stop scanning before connecting
            if (isScanning.get()) {
                Log.d(TAG, "Stopping BLE scan before connecting to device")
                bleScanner.stopScan(this)
                isScanning.set(false)
            }
            
            // Connect to the device only if not already connecting
            if (!isConnecting.get()) {
                connectToDevice(device)
            }
        }
        
        override fun onScanFailed(errorCode: Int) {
            Log.e(TAG, "BLE scan failed with error code: $errorCode")
            isScanning.set(false)
            val errorMessage = when (errorCode) {
                SCAN_FAILED_ALREADY_STARTED -> "Scan already started"
                SCAN_FAILED_APPLICATION_REGISTRATION_FAILED -> "Application registration failed"
                SCAN_FAILED_FEATURE_UNSUPPORTED -> "Feature unsupported"
                SCAN_FAILED_INTERNAL_ERROR -> "Internal error"
                else -> "Unknown error ($errorCode)"
            }
            callback?.onScanFailed(errorCode, errorMessage)
        }
    }
    
    private fun connectToDevice(device: BluetoothDevice) {
        if (!isConnecting.compareAndSet(false, true)) {
            Log.d(TAG, "Already connecting to a device, ignoring connection request")
            return
        }
        
        Log.d(TAG, "Connecting to device: ${device.address}")
        
        // Set connection timeout
        connectionTimeoutRunnable = Runnable {
            Log.w(TAG, "Connection timeout reached, disconnecting")
            disconnectAndCleanup()
            callback?.onConnectionFailed(device, "Connection timeout")
        }
        handler.postDelayed(connectionTimeoutRunnable!!, CONNECTION_TIMEOUT_MS)
        
        connectedGatt = device.connectGatt(context, false, gattCallback)
    }
    
    private fun disconnectAndCleanup() {
        Log.d(TAG, "Disconnecting and cleaning up GATT connection")
        
        // Cancel timeout
        connectionTimeoutRunnable?.let {
            handler.removeCallbacks(it)
            connectionTimeoutRunnable = null
        }
        
        // Close GATT connection
        connectedGatt?.let { gatt ->
            try {
                gatt.disconnect()
                gatt.close()
            } catch (e: Exception) {
                Log.e(TAG, "Error during GATT cleanup: ${e.message}")
            } finally {
                connectedGatt = null
            }
        }
        
        // Reset connection state
        isConnecting.set(false)
    }
    
    private fun resetConnectionState() {
        Log.d(TAG, "Resetting connection state")
        hasReceivedDeviceInfo.set(false)
        isProcessingData.set(false)
        hasReadCharacteristic.set(false)
        synchronized(dataBufferLock) {
            dataBuffer.setLength(0)
        }
        disconnectAndCleanup()
    }
    
    private val gattCallback = object : BluetoothGattCallback() {
        override fun onConnectionStateChange(gatt: BluetoothGatt, status: Int, newState: Int) {
            if (status == BluetoothGatt.GATT_SUCCESS && newState == BluetoothProfile.STATE_CONNECTED) {
                Log.i(TAG, "Connected to GATT server, discovering services")
                // Cancel timeout since we're connected
                connectionTimeoutRunnable?.let {
                    handler.removeCallbacks(it)
                    connectionTimeoutRunnable = null
                }
                callback?.onDeviceConnected(gatt.device)
                gatt.discoverServices()
            } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
                Log.i(TAG, "Disconnected from GATT server")
                callback?.onDeviceDisconnected(gatt.device)
                disconnectAndCleanup()
            } else if (status != BluetoothGatt.GATT_SUCCESS) {
                Log.e(TAG, "Connection failed with status: $status")
                callback?.onConnectionFailed(gatt.device, "Connection failed with status: $status")
                disconnectAndCleanup()
            }
        }
        
        override fun onServicesDiscovered(gatt: BluetoothGatt, status: Int) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                val service = gatt.getService(UUID.fromString(SERVICE_UUID))
                if (service != null) {
                    Log.i(TAG, "Service found: $SERVICE_UUID")
                    val readCharacteristic = service.getCharacteristic(UUID.fromString(READ_CHAR_UUID))
                    if (readCharacteristic != null) {
                        // Ensure we only read the characteristic once
                        if (!hasReadCharacteristic.compareAndSet(false, true)) {
                            Log.d(TAG, "Characteristic already read, disconnecting")
                            gatt.disconnect()
                            return
                        }
                        
                        Log.i(TAG, "Reading drone info characteristic...")
                        
                        // Explicitly disable notifications to prevent spam
                        gatt.setCharacteristicNotification(readCharacteristic, false)
                        
                        // Read the characteristic once
                        if (!gatt.readCharacteristic(readCharacteristic)) {
                            Log.e(TAG, "Failed to initiate characteristic read")
                            gatt.disconnect()
                        }
                    } else {
                        Log.w(TAG, "Read characteristic not found: $READ_CHAR_UUID")
                        gatt.disconnect()
                    }
                } else {
                    Log.w(TAG, "Desired service not found: $SERVICE_UUID")
                    gatt.disconnect()
                }
            } else {
                Log.w(TAG, "Service discovery failed, status: $status")
                gatt.disconnect()
            }
        }
        
        override fun onCharacteristicRead(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic, status: Int) {
            if (status == BluetoothGatt.GATT_SUCCESS) {
                processCharacteristicData(gatt, characteristic.value, "onCharacteristicRead")
            } else {
                Log.e(TAG, "Characteristic read failed: $status")
                gatt.disconnect()
            }
        }
        
        override fun onCharacteristicChanged(gatt: BluetoothGatt, characteristic: BluetoothGattCharacteristic) {
            Log.d(TAG, "Characteristic changed notification received - this should not happen!")
            // We explicitly disabled notifications, so this shouldn't occur
            // If it does, we'll process it but immediately disconnect
            processCharacteristicData(gatt, characteristic.value, "onCharacteristicChanged")
        }
    }
    
    /**
     * Processes characteristic data from both read and notification callbacks
     * Uses atomic operations to ensure only the first response is processed
     */
    private fun processCharacteristicData(gatt: BluetoothGatt, data: ByteArray, source: String) {
        // Use atomic operation to ensure only one thread processes data
        if (!isProcessingData.compareAndSet(false, true)) {
            Log.d(TAG, "Data processing already in progress, ignoring duplicate from $source")
            return
        }
        
        try {
            if (hasReceivedDeviceInfo.get()) {
                Log.d(TAG, "Device info already received, ignoring duplicate from $source")
                return
            }
            
            if (data.isEmpty()) {
                Log.w(TAG, "No data received from characteristic via $source")
                return
            }
            
            // Try to parse the data directly first
            val chunk = String(data)
            Log.d(TAG, "Received data (${data.size} bytes): ${chunk.take(100)}${if (chunk.length > 100) "..." else ""}")
            
            // Try to parse as JSON directly first
            try {
                if (chunk.startsWith("{") && chunk.endsWith("}")) {
                    val droneInfo = DroneInfo.fromJson(chunk)
                    if (droneInfo != null) {
                        Log.i(TAG, "Successfully parsed direct JSON: $chunk")
                        processValidJson(chunk, gatt)
                        return
                    }
                }
            } catch (e: Exception) {
                Log.d(TAG, "Direct JSON parsing failed, trying buffer approach: ${e.message}")
            }
            
            // If direct parsing fails, use buffer approach
            val extractedJson: String?
            synchronized(dataBufferLock) {
                // Check buffer size before appending
                if (dataBuffer.length + chunk.length > MAX_BUFFER_SIZE) {
                    Log.w(TAG, "Buffer overflow protection: clearing buffer (was ${dataBuffer.length} bytes)")
                    dataBuffer.setLength(0)
                }
                
                dataBuffer.append(chunk)
                val buffered = dataBuffer.toString()
                extractedJson = extractFirstCompleteJson(buffered)
                
                if (extractedJson != null) {
                    // Validate JSON size and truncate if necessary
                    val finalJson = if (extractedJson.length > MAX_JSON_SIZE) {
                        Log.w(TAG, "JSON too large (${extractedJson.length} bytes), truncating")
                        extractedJson.substring(0, MAX_JSON_SIZE)
                    } else {
                        extractedJson
                    }
                    
                    // Clear buffer after successful JSON extraction
                    dataBuffer.setLength(0)
                    Log.d(TAG, "Buffer cleared after successful JSON extraction")
                    
                    // Process the final JSON
                    Log.i(TAG, "Complete JSON extracted from $source: $finalJson")
                    processValidJson(finalJson, gatt)
                    return
                }
            }
            
            if (extractedJson == null) {
                Log.d(TAG, "No complete JSON yet, waiting for more data... Buffer length: ${dataBuffer.length}")
                return // Wait for more data
            }
            
        } finally {
            // Always disconnect after processing to prevent repeated notifications
            Log.i(TAG, "Disconnecting after processing data from $source")
            gatt.disconnect()
            isProcessingData.set(false)
        }
    }
    
    /**
     * Extracts the first complete JSON object from the given string by brace counting.
     * Returns null if not found yet.
     */
    private fun extractFirstCompleteJson(s: String): String? {
        if (s.isEmpty()) return null
        
        // Find first opening brace
        val start = s.indexOf('{')
        if (start < 0) return null
        
        // Safety check - prevent infinite loops with very long strings
        val maxLength = minOf(s.length, MAX_JSON_SIZE)
        
        var depth = 0
        var inString = false
        var escaped = false
        
        for (i in start until maxLength) {
            val c = s[i]
            
            if (escaped) {
                escaped = false
                continue
            }
            
            if (c == '\\') {
                escaped = true
                continue
            }
            
            if (c == '"') {
                inString = !inString
                continue
            }
            
            if (!inString) {
                when (c) {
                    '{' -> depth++
                    '}' -> {
                        depth--
                        if (depth == 0) {
                            val extractedJson = s.substring(start, i + 1)
                            Log.d(TAG, "Extracted JSON (${extractedJson.length} chars): ${extractedJson.take(100)}...")
                            return extractedJson
                        }
                    }
                }
            }
        }
        
        Log.d(TAG, "No complete JSON found in string of length ${s.length}")
        return null
    }
    
    /**
     * Process a valid JSON string and notify listeners
     */
    private fun processValidJson(json: String, gatt: BluetoothGatt) {
        // Mark as received so we ignore further notifications
        hasReceivedDeviceInfo.set(true)
        
        Log.i(TAG, "Processing valid JSON: $json")
        
        val droneInfo = DroneInfo.fromJson(json)
        if (droneInfo != null) {
            Log.i(TAG, "Parsed drone info - Brand: ${droneInfo.brand}, Model: ${droneInfo.model}, Serial: ${droneInfo.serialNumber}")
            
            callback?.onFullDeviceInfoReceived(gatt.device, droneInfo)
            Log.i(TAG, "Full drone info successfully parsed and sent to listeners")
        } else {
            Log.w(TAG, "Failed to parse drone info from extracted JSON")
        }
    }
    
    // TLV Parser for manufacturer data
    private fun parseTLVManufacturerData(data: ByteArray): DroneInfo? {
        if (data.size < 2) {
            Log.d(TAG, "Data too short for TLV parsing")
            return null
        }
        
        var index = 0
        var vendorId = 0
        var vendorName = ""
        var serialShort = ""
        
        Log.d(TAG, "Parsing TLV data (${data.size} bytes)")
        
        while (index + 1 < data.size) {
            val type = data[index]
            val length = data[index + 1].toInt() and 0xFF
            index += 2
            
            Log.d(TAG, "TLV - Type: 0x${String.format("%02X", type)}, Length: $length")
            
            if (index + length > data.size) {
                Log.d(TAG, "TLV length exceeds data bounds")
                break
            }
            
            when (type) {
                TLV_TYPE_VENDOR_ID -> {
                    if (length == 2) {
                        val buffer = ByteBuffer.wrap(data, index, 2)
                        buffer.order(ByteOrder.LITTLE_ENDIAN)
                        vendorId = buffer.short.toInt() and 0xFFFF
                        Log.d(TAG, "TLV Vendor ID: $vendorId")
                    }
                }
                TLV_TYPE_VENDOR_NAME -> {
                    vendorName = String(data, index, length)
                    Log.d(TAG, "TLV Vendor Name: '$vendorName'")
                }
                TLV_TYPE_SERIAL_SHORT -> {
                    serialShort = String(data, index, length)
                    Log.d(TAG, "TLV Serial Short: '$serialShort'")
                }
                else -> {
                    Log.d(TAG, "TLV Unknown type: 0x${String.format("%02X", type)}")
                }
            }
            
            index += length
        }
        
        return if (vendorId == DJI_MANUFACTURER_ID || vendorName.isNotEmpty() || serialShort.isNotEmpty()) {
            DroneInfo(vendorName.ifEmpty { "DJI" }, "DJI_DRONE", serialShort)
        } else {
            null
        }
    }
    
    private fun bytesToHex(bytes: ByteArray): String {
        return bytes.joinToString("") { "%02x".format(it) }
    }
    
    private fun hasAllPermissions(): Boolean {
        val result = ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_CONNECT) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_SCAN) == PackageManager.PERMISSION_GRANTED &&
                ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        Log.d(TAG, "Permissions check result: $result")
        return result
    }
    
    fun cleanup() {
        Log.d(TAG, "Cleaning up BLE resources")
        resetConnectionState()
        handler.removeCallbacksAndMessages(null)
    }
}
