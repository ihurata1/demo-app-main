package com.serverapp

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.serverapp.domain.BLEManager
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
    private var isBLEAdvertising = false
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
        
        // Set up mock drone info
        updateMockDroneInfo()
        
        bleButton.setOnClickListener {
            if (isBLEAdvertising) {
                stopBLEAdvertising()
            } else {
                startBLEAdvertising()
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
            text = "BLE Demo - Server (Peripheral)"
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
            text = "BLE Advertising Başlat"
            setPadding(0, 8, 0, 8)
        }
        
        // Device Info
        deviceInfoText = TextView(this).apply {
            text = "Drone: DJI Mavic 3 | Serial: 1234567890"
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
                    "ERROR" -> "❌"
                    "SUCCESS" -> "✅"
                    else -> "ℹ️"
                }
                text = "[$timestamp] $emoji $message"
                setPadding(8, 8, 8, 8)
                setBackgroundColor(when (type) {
                    "BLE" -> 0xFFE8F5E8.toInt()
                    "CONNECTION" -> 0xFFE3F2FD.toInt()
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
    private fun startBLEAdvertising() {
        if (!hasBluetoothPermissions()) {
            requestBluetoothPermissions()
            return
        }
        
        if (!bluetoothAdapter.isEnabled) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult(enableBtIntent, ENABLE_BLUETOOTH_REQUEST_CODE)
            return
        }
        
        bleManager.startAdvertising()
        addLogMessage("BLE advertising başlatılıyor...", "BLE")
    }
    
    private fun stopBLEAdvertising() {
        bleManager.stopAdvertising()
        addLogMessage("BLE advertising durduruluyor...", "BLE")
    }
    
    private fun updateMockDroneInfo() {
        val mockDroneInfo = BLEManager.DroneInfo(
            brand = "DJI",
            model = "Mavic 3",
            serialNumber = "1234567890"
        )
        bleManager.updateDroneInfo(mockDroneInfo)
        deviceInfoText.text = "Drone: ${mockDroneInfo.brand} ${mockDroneInfo.model} | Serial: ${mockDroneInfo.serialNumber}"
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
            ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED
        }
    }
    
    private fun requestBluetoothPermissions() {
        val permissions = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            arrayOf(
                Manifest.permission.BLUETOOTH_ADVERTISE,
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
                    startBLEAdvertising()
                } else {
                    addLogMessage("Bluetooth etkinleştirilmedi", "ERROR")
                    showToast("Bluetooth etkinleştirilmedi")
                }
            }
        }
    }
    
    private val bleCallback = object : BLEManager.BLECallback {
        override fun onAdvertisingStarted() {
            runOnUiThread {
                isBLEAdvertising = true
                statusText.text = "BLE aktif - Advertising"
                statusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
                bleButton.text = "BLE Advertising Durdur"
                addLogMessage("BLE advertising başlatıldı", "SUCCESS")
                showToast("BLE advertising başlatıldı")
            }
        }
        
        override fun onAdvertisingFailed(errorCode: Int, message: String) {
            runOnUiThread {
                isBLEAdvertising = false
                statusText.text = "BLE hatası: $message"
                statusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Advertising Başlat"
                addLogMessage("BLE advertising hatası: $message", "ERROR")
                showToast("BLE hatası: $message")
            }
        }
        
        override fun onAdvertisingStopped() {
            runOnUiThread {
                isBLEAdvertising = false
                statusText.text = "BLE kapalı"
                statusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Advertising Başlat"
                addLogMessage("BLE advertising durduruldu", "BLE")
                showToast("BLE advertising durduruldu")
            }
        }
        
        override fun onConnectionStateChanged(device: BluetoothDevice, isConnected: Boolean) {
            val status = if (isConnected) "bağlandı" else "bağlantısı kesildi"
            addLogMessage("BLE cihaz ${device.address} $status", "CONNECTION")
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
