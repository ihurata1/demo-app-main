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
import androidx.lifecycle.lifecycleScope
import com.serverapp.domain.BLEManager
import com.serverapp.domain.CoreServiceImpl
import com.serverapp.domain.TelemetryServiceImpl
import io.grpc.Grpc
import io.grpc.InsecureServerCredentials
import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var statusText: TextView
    private lateinit var serverButton: Button
    private lateinit var droneConnectionButton: Button
    private lateinit var droneStatusText: TextView
    private lateinit var messagesScrollView: ScrollView
    private lateinit var messagesContainer: LinearLayout
    
    // BLE UI elements
    private lateinit var bleStatusText: TextView
    private lateinit var bleButton: Button
    private lateinit var bleDeviceInfoText: TextView
    
    private var isServerRunning = false
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    

    
    // Drone connection management
    private lateinit var coreService: CoreServiceImpl
    private lateinit var telemetryService: TelemetryServiceImpl
    private var isDroneConnected = false
    private var grpcServer: io.grpc.Server? = null
    private val grpcPort = 50051
    
    // BLE management
    private lateinit var bleManager: BLEManager
    private var isBLEAdvertising = false
    private val ENABLE_BLUETOOTH_REQUEST_CODE = 1001
    private val BLUETOOTH_PERMISSIONS_REQUEST_CODE = 1002
    
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
        
        // Initialize Services
        coreService = CoreServiceImpl()
        telemetryService = TelemetryServiceImpl()
        
        // Initialize BLE Manager
        bleManager = BLEManager(this)
        bleManager.setCallback(bleCallback)
        
        // Set up mock drone info
        updateMockDroneInfo()
        
        serverButton.setOnClickListener {
            if (isServerRunning) {
                stopServer()
            } else {
                startServer()
            }
        }
        
        droneConnectionButton.setOnClickListener {
            toggleDroneConnection()
        }
        
        bleButton.setOnClickListener {
            if (isBLEAdvertising) {
                stopBLEAdvertising()
            } else {
                startBLEAdvertising()
            }
        }
        
        // Add BLE Demo button
        val bleDemoButton = Button(this).apply {
            text = "BLE Demo'yu Aç"
            setPadding(0, 8, 0, 8)
            setOnClickListener {
                val intent = Intent(this@MainActivity, BLEDemoActivity::class.java)
                startActivity(intent)
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
            text = "Server App"
            textSize = 24f
            setPadding(0, 0, 0, 24)
        }
        
        // Status
        statusText = TextView(this).apply {
            text = "Server hazır"
            setPadding(0, 0, 0, 16)
        }
        
        // Server control button
        serverButton = Button(this).apply {
            text = "Server Başlat"
        }
        
        // Drone connection section
        val droneLabel = TextView(this).apply {
            text = "Drone Bağlantısı:"
            setPadding(0, 24, 0, 8)
            textSize = 16f
        }
        
        droneStatusText = TextView(this).apply {
            text = "Drone bağlı değil"
            setPadding(0, 0, 0, 8)
            setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
        
        droneConnectionButton = Button(this).apply {
            text = "Drone'a Bağlan"
            setPadding(0, 8, 0, 8)
        }
        
        // BLE section
        val bleLabel = TextView(this).apply {
            text = "BLE Advertising:"
            setPadding(0, 24, 0, 8)
            textSize = 16f
        }
        
        bleStatusText = TextView(this).apply {
            text = "BLE kapalı"
            setPadding(0, 0, 0, 8)
            setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
        
        bleButton = Button(this).apply {
            text = "BLE Başlat"
            setPadding(0, 8, 0, 8)
        }
        
        bleDeviceInfoText = TextView(this).apply {
            text = "Drone: DJI Mavic 3 | Serial: 1234567890"
            setPadding(0, 0, 0, 8)
            setTextColor(resources.getColor(android.R.color.holo_blue_dark))
        }
        
        // BLE Demo button
        val bleDemoButton = Button(this).apply {
            text = "BLE Demo'yu Aç"
            setPadding(0, 8, 0, 8)
            setOnClickListener {
                val intent = Intent(this@MainActivity, BLEDemoActivity::class.java)
                startActivity(intent)
            }
        }
        
        // Messages log section
        val logLabel = TextView(this).apply {
            text = "Server Log:"
            setPadding(0, 24, 0, 8)
            textSize = 16f
        }
        
        messagesContainer = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
        }
        
        messagesScrollView = ScrollView(this).apply {
            addView(messagesContainer)
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
        layout.addView(serverButton)
        layout.addView(droneLabel)
        layout.addView(droneStatusText)
        layout.addView(droneConnectionButton)
        layout.addView(bleLabel)
        layout.addView(bleStatusText)
        layout.addView(bleButton)
        layout.addView(bleDeviceInfoText)
        layout.addView(bleDemoButton)
        layout.addView(logLabel)
        layout.addView(messagesScrollView)
        
        setContentView(layout)
    }

    private fun addLogMessage(message: String, type: String = "INFO") {
        runOnUiThread {
            val messageView = TextView(this).apply {
                val timestamp = dateFormat.format(Date())
                val emoji = when (type) {
                    "SERVER" -> "🖥️"
                    "CLIENT" -> "📱"
                    "SEND" -> "📤"
                    "RECEIVE" -> "📨"
                    "ERROR" -> "❌"
                    "SUCCESS" -> "✅"
                    else -> "ℹ️"
                }
                text = "[$timestamp] $emoji $message"
                setPadding(8, 8, 8, 8)
                setBackgroundColor(when (type) {
                    "SERVER" -> 0xFFE8F5E8.toInt()
                    "CLIENT" -> 0xFFE3F2FD.toInt()
                    "SEND" -> 0xFFFFF3E0.toInt()
                    "RECEIVE" -> 0xFFF3E5F5.toInt()
                    "ERROR" -> 0xFFFFEBEE.toInt()
                    else -> 0xFFF5F5F5.toInt()
                })
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(0, 0, 0, 8)
                }
            }
            
            messagesContainer.addView(messageView)
            
            // Auto scroll to bottom
            messagesScrollView.post {
                messagesScrollView.fullScroll(ScrollView.FOCUS_DOWN)
            }
        }
    }



    private fun startServer() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                // Start gRPC server
                startGrpcServer()
                
                withContext(Dispatchers.Main) {
                    isServerRunning = true
                    statusText.text = "gRPC Server çalışıyor (Port: $grpcPort)"
                    serverButton.text = "Server Durdur"
                    showToast("gRPC Server başlatıldı - Port: $grpcPort")
                    addLogMessage("gRPC Server başlatıldı - Port: $grpcPort", "SERVER")
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Server başlatılamadı: ${e.message}")
                    addLogMessage("Server başlatılamadı: ${e.message}", "ERROR")
                }
            }
        }
    }

    private fun stopServer() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                // Stop gRPC server
                stopGrpcServer()
                
                withContext(Dispatchers.Main) {
                    isServerRunning = false
                    statusText.text = "Server durduruldu"
                    serverButton.text = "Server Başlat"
                    showToast("Server durduruldu")
                    addLogMessage("Server durduruldu", "SERVER")
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Server durdurma hatası: ${e.message}")
                    addLogMessage("Server durdurma hatası: ${e.message}", "ERROR")
                }
            }
        }
    }



    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }





    private fun toggleDroneConnection() {
        isDroneConnected = !isDroneConnected
        coreService.setConnectionState(isDroneConnected)
        
        // Start/stop telemetry simulation
        if (isDroneConnected) {
            telemetryService.startSimulation()
        } else {
            telemetryService.stopSimulation()
        }
        
        runOnUiThread {
            if (isDroneConnected) {
                droneStatusText.text = "Drone bağlı - Telemetri aktif"
                droneStatusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
                droneConnectionButton.text = "Drone Bağlantısını Kes"
                addLogMessage("Drone bağlantısı kuruldu - Telemetri simülasyonu başlatıldı", "DRONE")
                showToast("Drone'a bağlanıldı - Telemetri aktif")
            } else {
                droneStatusText.text = "Drone bağlı değil"
                droneStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                droneConnectionButton.text = "Drone'a Bağlan"
                addLogMessage("Drone bağlantısı kesildi - Telemetri simülasyonu durduruldu", "DRONE")
                showToast("Drone bağlantısı kesildi")
            }
        }
    }

    private fun startGrpcServer() {
        try {
            grpcServer = Grpc.newServerBuilderForPort(grpcPort, InsecureServerCredentials.create())
                .addService(coreService)
                .addService(telemetryService)
                .keepAliveTime(30, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
                .permitKeepAliveWithoutCalls(true)
                .maxInboundMessageSize(4 * 1024 * 1024)
                .build()
                .start()
            
            Log.d("MainActivity", "gRPC Server started on port $grpcPort")
            addLogMessage("gRPC Server başlatıldı - Port: $grpcPort", "GRPC")
            
            // Add shutdown hook
            Runtime.getRuntime().addShutdownHook(Thread {
                Log.d("MainActivity", "Shutting down gRPC server")
                grpcServer?.shutdown()
            })
        } catch (e: Exception) {
            Log.e("MainActivity", "Failed to start gRPC server", e)
            addLogMessage("gRPC Server başlatılamadı: ${e.message}", "ERROR")
            throw e
        }
    }

    private fun stopGrpcServer() {
        try {
            grpcServer?.shutdown()
            grpcServer = null
            Log.d("MainActivity", "gRPC Server stopped")
            addLogMessage("gRPC Server durduruldu", "GRPC")
        } catch (e: Exception) {
            Log.e("MainActivity", "Error stopping gRPC server", e)
            addLogMessage("gRPC Server durdurma hatası: ${e.message}", "ERROR")
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
        bleDeviceInfoText.text = "Drone: ${mockDroneInfo.brand} ${mockDroneInfo.model} | Serial: ${mockDroneInfo.serialNumber}"
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
                    addLogMessage("Bluetooth etkinleştirildi", "BLE")
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
                bleStatusText.text = "BLE aktif - Advertising"
                bleStatusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
                bleButton.text = "BLE Durdur"
                addLogMessage("BLE advertising başlatıldı", "BLE")
                showToast("BLE advertising başlatıldı")
            }
        }
        
        override fun onAdvertisingFailed(errorCode: Int, message: String) {
            runOnUiThread {
                isBLEAdvertising = false
                bleStatusText.text = "BLE hatası: $message"
                bleStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Başlat"
                addLogMessage("BLE advertising hatası: $message", "ERROR")
                showToast("BLE hatası: $message")
            }
        }
        
        override fun onAdvertisingStopped() {
            runOnUiThread {
                isBLEAdvertising = false
                bleStatusText.text = "BLE kapalı"
                bleStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Başlat"
                addLogMessage("BLE advertising durduruldu", "BLE")
                showToast("BLE advertising durduruldu")
            }
        }
        
        override fun onConnectionStateChanged(device: BluetoothDevice, isConnected: Boolean) {
            val status = if (isConnected) "bağlandı" else "bağlantısı kesildi"
            addLogMessage("BLE cihaz ${device.address} $status", "BLE")
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        if (isServerRunning) {
            stopServer()
        }
        bleManager.cleanup()
    }
} 