package com.clientapp

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.clientapp.domain.BLEManager
import java.text.SimpleDateFormat
import java.util.*

class BLEDemoActivity : AppCompatActivity() {
    
    companion object {
        private const val TAG = "BLEDemoActivity"
        private const val ENABLE_BLUETOOTH_REQUEST_CODE = 1001
        private const val BLUETOOTH_PERMISSIONS_REQUEST_CODE = 1002
    }
    
    private lateinit var statusText: TextView
    private lateinit var bleButton: Button
    private lateinit var deviceInfoText: TextView
    private lateinit var logContainer: LinearLayout
    private lateinit var logScrollView: ScrollView
    
    private lateinit var bleManager: BLEManager
    private var isBLEScanning = false
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    
    // Bluetooth adapter
    private val bluetoothManager: BluetoothManager by lazy {
        getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    }
    private val bluetoothAdapter: BluetoothAdapter by lazy {
        bluetoothManager.adapter
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUI()
        
        // Initialize BLE Manager
        bleManager = BLEManager(this)
        bleManager.setCallback(bleCallback)
        
        bleButton.setOnClickListener {
            if (isBLEScanning) {
                stopBLEScanning()
            } else {
                startBLEScanning()
            }
        }
    }
    
    private fun setupUI() {
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 32, 32, 32)
        }
        
        // Header
        val headerText = TextView(this).apply {
            text = "BLE Demo - Client (Central)"
            textSize = 24f
            setPadding(0, 0, 0, 24)
        }
        
        // Status
        statusText = TextView(this).apply {
            text = "BLE hazır"
            setPadding(0, 0, 0, 16)
        }
        
        // BLE Button
        bleButton = Button(this).apply {
            text = "BLE Taramayı Başlat"
            setPadding(0, 8, 0, 8)
        }
        
        // Device Info
        deviceInfoText = TextView(this).apply {
            text = "Henüz cihaz bulunamadı"
            setPadding(0, 16, 0, 8)
            setTextColor(resources.getColor(android.R.color.holo_blue_dark))
        }
        
        // Log section
        val logLabel = TextView(this).apply {
            text = "BLE Log:"
            setPadding(0, 24, 0, 8)
            textSize = 16f
        }
        
        logContainer = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
        }
        
        logScrollView = ScrollView(this).apply {
            addView(logContainer)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                400
            ).apply {
                setMargins(0, 8, 0, 0)
            }
            setBackgroundColor(0xFFF5F5F5.toInt())
            setPadding(16, 16, 16, 16)
        }
        
        // Add all views to layout
        layout.addView(headerText)
        layout.addView(statusText)
        layout.addView(bleButton)
        layout.addView(deviceInfoText)
        layout.addView(logLabel)
        layout.addView(logScrollView)
        
        setContentView(layout)
    }
    
    private fun addLogMessage(message: String, type: String = "INFO") {
        runOnUiThread {
            val messageView = TextView(this).apply {
                val timestamp = dateFormat.format(Date())
                val emoji = when (type) {
                    "BLE" -> "📡"
                    "CONNECTION" -> "🔗"
                    "DEVICE" -> "📱"
                    "ERROR" -> "❌"
                    "SUCCESS" -> "✅"
                    else -> "ℹ️"
                }
                text = "[$timestamp] $emoji $message"
                setPadding(8, 8, 8, 8)
                setBackgroundColor(when (type) {
                    "BLE" -> 0xFFE8F5E8.toInt()
                    "CONNECTION" -> 0xFFE3F2FD.toInt()
                    "DEVICE" -> 0xFFFFF3E0.toInt()
                    "ERROR" -> 0xFFFFEBEE.toInt()
                    "SUCCESS" -> 0xFFE8F5E8.toInt()
                    else -> 0xFFF5F5F5.toInt()
                })
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 0, 0, 8)
                }
            }
            
            logContainer.addView(messageView)
            
            // Auto scroll to bottom
            logScrollView.post {
                logScrollView.fullScroll(ScrollView.FOCUS_DOWN)
            }
        }
    }
    
    // BLE Methods
    private fun startBLEScanning() {
        if (!hasBluetoothPermissions()) {
            requestBluetoothPermissions()
            return
        }
        
        if (!bluetoothAdapter.isEnabled) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult(enableBtIntent, ENABLE_BLUETOOTH_REQUEST_CODE)
            return
        }
        
        bleManager.startScanning()
        addLogMessage("BLE taraması başlatılıyor...", "BLE")
    }
    
    private fun stopBLEScanning() {
        bleManager.stopScanning()
        addLogMessage("BLE taraması durduruluyor...", "BLE")
    }
    
    private fun hasBluetoothPermissions(): Boolean {
        val permissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            arrayOf(
                Manifest.permission.BLUETOOTH_SCAN,
                Manifest.permission.BLUETOOTH_CONNECT
            )
        } else {
            arrayOf(
                Manifest.permission.BLUETOOTH,
                Manifest.permission.BLUETOOTH_ADMIN
            )
        }
        
        return permissions.all { permission ->
            ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
        }
    }
    
    private fun requestBluetoothPermissions() {
        val permissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            arrayOf(
                Manifest.permission.BLUETOOTH_SCAN,
                Manifest.permission.BLUETOOTH_CONNECT,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        } else {
            arrayOf(
                Manifest.permission.BLUETOOTH,
                Manifest.permission.BLUETOOTH_ADMIN,
                Manifest.permission.ACCESS_FINE_LOCATION
            )
        }
        
        ActivityCompat.requestPermissions(this, permissions, BLUETOOTH_PERMISSIONS_REQUEST_CODE)
    }
    
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        
        when (requestCode) {
            ENABLE_BLUETOOTH_REQUEST_CODE -> {
                if (resultCode == RESULT_OK) {
                    addLogMessage("Bluetooth etkinleştirildi", "SUCCESS")
                    startBLEScanning()
                } else {
                    addLogMessage("Bluetooth etkinleştirilmedi", "ERROR")
                    showToast("Bluetooth etkinleştirilmedi")
                }
            }
        }
    }
    
    private val bleCallback = object : BLEManager.BLECallback {
        override fun onDeviceDiscovered(device: BluetoothDevice, droneInfo: BLEManager.DroneInfo?) {
            val deviceName = device.name ?: "Unknown Device"
            val info = droneInfo?.let { " - ${it.brand} ${it.serialNumber}" } ?: ""
            addLogMessage("BLE cihaz bulundu: $deviceName$info", "DEVICE")
            deviceInfoText.text = "Bulunan: $deviceName$info"
        }
        
        override fun onDeviceConnected(device: BluetoothDevice) {
            val deviceName = device.name ?: "Unknown Device"
            addLogMessage("BLE cihaza bağlanıldı: $deviceName", "CONNECTION")
            statusText.text = "BLE bağlı - $deviceName"
            statusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
        }
        
        override fun onDeviceDisconnected(device: BluetoothDevice) {
            val deviceName = device.name ?: "Unknown Device"
            addLogMessage("BLE cihaz bağlantısı kesildi: $deviceName", "CONNECTION")
            statusText.text = "BLE kapalı"
            statusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
        
        override fun onFullDeviceInfoReceived(device: BluetoothDevice, droneInfo: BLEManager.DroneInfo) {
            val deviceName = device.name ?: "Unknown Device"
            addLogMessage("Drone bilgisi alındı: ${droneInfo.brand} ${droneInfo.model} - ${droneInfo.serialNumber}", "SUCCESS")
            deviceInfoText.text = "Drone: ${droneInfo.brand} ${droneInfo.model} | Serial: ${droneInfo.serialNumber}"
        }
        
        override fun onScanStarted() {
            runOnUiThread {
                isBLEScanning = true
                statusText.text = "BLE aktif - Tarama"
                statusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
                bleButton.text = "BLE Taramayı Durdur"
                addLogMessage("BLE taraması başlatıldı", "BLE")
            }
        }
        
        override fun onScanStopped() {
            runOnUiThread {
                isBLEScanning = false
                statusText.text = "BLE kapalı"
                statusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Taramayı Başlat"
                addLogMessage("BLE taraması durduruldu", "BLE")
            }
        }
        
        override fun onScanFailed(errorCode: Int, message: String) {
            runOnUiThread {
                isBLEScanning = false
                statusText.text = "BLE hatası: $message"
                statusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Taramayı Başlat"
                addLogMessage("BLE tarama hatası: $message", "ERROR")
            }
        }
        
        override fun onConnectionFailed(device: BluetoothDevice, error: String) {
            val deviceName = device.name ?: "Unknown Device"
            addLogMessage("BLE bağlantı hatası: $deviceName - $error", "ERROR")
            statusText.text = "BLE bağlantı hatası"
            statusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
    }
    
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    
    override fun onDestroy() {
        super.onDestroy()
        bleManager.cleanup()
    }
}

