package com.clientapp

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.clientapp.domain.BLEManager
import com.clientapp.domain.CoreServiceClient
import com.clientapp.domain.TelemetryServiceClient
import com.clientapp.domain.InfoServiceClient
import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*
import io.mavsdk.info.InfoProto

class MainActivity : AppCompatActivity() {
    private lateinit var statusText: TextView
    private lateinit var connectButton: Button
    private lateinit var messagesScrollView: ScrollView
    private lateinit var messagesContainer: LinearLayout
    private lateinit var droneStatusCard: LinearLayout
    private lateinit var droneStatusIcon: TextView
    private lateinit var droneStatusText: TextView
    private lateinit var droneConnectionDetails: TextView
    
    // Telemetry UI elements
    private lateinit var telemetryCard: LinearLayout
    private lateinit var positionText: TextView
    private lateinit var altitudeText: TextView
    private lateinit var attitudeText: TextView
    private lateinit var velocityText: TextView
    private lateinit var inAirText: TextView
    
    private var isConnected = false
    private var serverHost = "192.168.1.100" // Default IP, will be updated from user input
    private val grpcServerPort = 50051
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    
    // SharedPreferences for storing server IP
    private lateinit var sharedPreferences: SharedPreferences
    private val PREFS_NAME = "ClientAppPrefs"
    private val KEY_SERVER_IP = "server_ip"
    
    // Drone connection state
    private var isDroneConnected = false
    private lateinit var coreServiceClient: CoreServiceClient
    private lateinit var telemetryServiceClient: TelemetryServiceClient
    private lateinit var infoServiceClient: InfoServiceClient
    
    // BLE management
    private lateinit var bleManager: BLEManager
    private var isBLEScanning = false
    private val ENABLE_BLUETOOTH_REQUEST_CODE = 1001
    private val BLUETOOTH_PERMISSIONS_REQUEST_CODE = 1002
    
    // BLE UI elements
    private lateinit var bleStatusText: TextView
    private lateinit var bleButton: Button
    private lateinit var bleDeviceInfoText: TextView
    
    // Bluetooth adapter
    private val bluetoothManager: BluetoothManager by lazy {
        getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
    }
    private val bluetoothAdapter: BluetoothAdapter by lazy {
        bluetoothManager.adapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        
        // Load saved server IP or show dialog for first time
        loadOrRequestServerIP()
        
        setupUI()
        
        // Initialize gRPC clients with current IP
        initializeGrpcClients()
        
        connectButton.setOnClickListener {
            if (isConnected) {
                disconnectFromServer()
            } else {
                connectToServer()
            }
        }
        
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
            text = "Client App"
            textSize = 24f
            setPadding(0, 0, 0, 24)
        }
        
        // Status
        statusText = TextView(this).apply {
            text = "Server IP: $serverHost | Bağlantı bekleniyor..."
            setPadding(0, 0, 0, 16)
        }
        
        // Connect button
        connectButton = Button(this).apply {
            text = "Server'a Bağlan"
        }
        
        // IP Change button
        val ipChangeButton = Button(this).apply {
            text = "Server IP Değiştir"
            setPadding(0, 8, 0, 8)
            setOnClickListener {
                showChangeIPDialog()
            }
        }
        
        // BLE section
        val bleLabel = TextView(this).apply {
            text = "BLE Scanning:"
            setPadding(0, 24, 0, 8)
            textSize = 16f
        }
        
        bleStatusText = TextView(this).apply {
            text = "BLE kapalı"
            setPadding(0, 0, 0, 8)
            setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
        
        bleButton = Button(this).apply {
            text = "BLE Taramayı Başlat"
            setPadding(0, 8, 0, 8)
        }
        
        bleDeviceInfoText = TextView(this).apply {
            text = "Henüz cihaz bulunamadı"
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
        
        // Drone Status Card
        createDroneStatusCard(layout)
        
        // Telemetry Card
        createTelemetryCard(layout)
        
        // Drone Info Card
        createDroneInfoCard(layout)
        
        // Messages section
        val messagesLabel = TextView(this).apply {
            text = "System Log:"
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
        layout.addView(connectButton)
        layout.addView(ipChangeButton)
        layout.addView(bleLabel)
        layout.addView(bleStatusText)
        layout.addView(bleButton)
        layout.addView(bleDeviceInfoText)
        layout.addView(bleDemoButton)
        layout.addView(messagesLabel)
        layout.addView(messagesScrollView)
        
        setContentView(layout)
    }

    private fun addMessageToUI(message: String, isFromServer: Boolean = true) {
        runOnUiThread {
            val messageView = TextView(this).apply {
                val timestamp = dateFormat.format(Date())
                val prefix = if (isFromServer) "📨 Server" else "📤 Ben"
                text = "[$timestamp] $prefix: $message"
                setPadding(8, 8, 8, 8)
                setBackgroundColor(if (isFromServer) 0xFFE3F2FD.toInt() else 0xFFF3E5F5.toInt())
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

    private fun connectToServer() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                withContext(Dispatchers.Main) {
                    isConnected = true
                    connectButton.text = "Bağlantıyı Kes"
                    showToast("gRPC Server'a bağlanıldı")
                    addMessageToUI("gRPC bağlantısı kuruldu", true)
                    
                    // Update status text
                    updateStatusText()
                    
                    // Start drone connection subscription
                    startDroneConnectionSubscription()
                    
                    // Start telemetry subscriptions
                    startTelemetrySubscriptions()
                    
                    // Start info service subscriptions
                    startInfoServiceSubscriptions()
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Bağlantı hatası: ${e.message}")
                    addMessageToUI("Bağlantı hatası: ${e.message}", true)
                    
                    // Reset UI state on connection failure
                    isConnected = false
                    connectButton.text = "Server'a Bağlan"
                    
                    // Update status text
                    updateStatusText()
                }
            }
        }
    }

    private fun disconnectFromServer() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                isConnected = false
                
                withContext(Dispatchers.Main) {
                    connectButton.text = "Server'a Bağlan"
                    showToast("Bağlantı kesildi")
                    addMessageToUI("gRPC bağlantısı kesildi", true)
                    
                    // Update status text
                    updateStatusText()
                    
                    // Disconnect gRPC clients and reset drone status
                    coreServiceClient.disconnect()
                    telemetryServiceClient.disconnect()
                    infoServiceClient.disconnect()
                    updateDroneStatus(false)
                    resetTelemetryDisplay()
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Bağlantı kesme hatası: ${e.message}")
                }
            }
        }
    }



    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    
    // IP Management Methods
    private fun loadOrRequestServerIP() {
        val savedIP = sharedPreferences.getString(KEY_SERVER_IP, null)
        if (savedIP != null) {
            serverHost = savedIP
            Log.d("MainActivity", "Loaded saved server IP: $serverHost")
        } else {
            // First time - show dialog to input server IP
            showServerIPDialog()
        }
    }
    
    private fun showServerIPDialog() {
        val input = EditText(this).apply {
            hint = "Server IP adresini girin (örn: 192.168.1.100)"
            setText(serverHost)
        }
        
        AlertDialog.Builder(this)
            .setTitle("Server IP Adresi")
            .setMessage("Bağlanmak istediğiniz server'ın IP adresini girin:")
            .setView(input)
            .setPositiveButton("Bağlan") { _, _ ->
                val newIP = input.text.toString().trim()
                if (isValidIPAddress(newIP)) {
                    serverHost = newIP
                    sharedPreferences.edit().putString(KEY_SERVER_IP, newIP).apply()
                    Log.d("MainActivity", "Server IP updated to: $serverHost")
                    showToast("Server IP güncellendi: $serverHost")
                    
                    // Reinitialize gRPC clients with new IP
                    initializeGrpcClients()
                    
                    // Update status text
                    updateStatusText()
                } else {
                    showToast("Geçersiz IP adresi! Tekrar deneyin.")
                    showServerIPDialog() // Show dialog again
                }
            }
            .setNegativeButton("İptal") { _, _ ->
                // Use default IP if user cancels
                serverHost = "192.168.1.100"
                sharedPreferences.edit().putString(KEY_SERVER_IP, serverHost).apply()
                Log.d("MainActivity", "Using default IP: $serverHost")
            }
            .setCancelable(false) // User must make a choice
            .show()
    }
    
    private fun showChangeIPDialog() {
        val input = EditText(this).apply {
            hint = "Server IP adresini girin (örn: 192.168.1.100)"
            setText(serverHost)
        }
        
        AlertDialog.Builder(this)
            .setTitle("Server IP Değiştir")
            .setMessage("Yeni server IP adresini girin:")
            .setView(input)
            .setPositiveButton("Güncelle") { _, _ ->
                val newIP = input.text.toString().trim()
                if (isValidIPAddress(newIP)) {
                    // Disconnect if currently connected
                    if (isConnected) {
                        disconnectFromServer()
                    }
                    
                    serverHost = newIP
                    sharedPreferences.edit().putString(KEY_SERVER_IP, newIP).apply()
                    Log.d("MainActivity", "Server IP updated to: $serverHost")
                    showToast("Server IP güncellendi: $serverHost")
                    
                    // Reinitialize gRPC clients with new IP
                    initializeGrpcClients()
                    
                    // Update status text
                    updateStatusText()
                } else {
                    showToast("Geçersiz IP adresi! Tekrar deneyin.")
                }
            }
            .setNegativeButton("İptal", null)
            .show()
    }
    
    private fun isValidIPAddress(ip: String): Boolean {
        val parts = ip.split(".")
        if (parts.size != 4) return false
        
        return parts.all { part ->
            try {
                val num = part.toInt()
                num in 0..255
            } catch (e: NumberFormatException) {
                false
            }
        }
    }
    
    private fun initializeGrpcClients() {
        coreServiceClient = CoreServiceClient(serverHost, grpcServerPort)
        telemetryServiceClient = TelemetryServiceClient(serverHost, grpcServerPort)
        infoServiceClient = InfoServiceClient(serverHost, grpcServerPort)
        Log.d("MainActivity", "gRPC clients initialized with IP: $serverHost:$grpcServerPort")
        
        // Update status text to show current IP
        updateStatusText()
    }
    
    private fun updateStatusText() {
        val currentStatus = if (isConnected) "✅ gRPC Server'a bağlanıldı" else "Bağlantı bekleniyor..."
        statusText.text = "Server IP: $serverHost | $currentStatus"
    }





    private fun createDroneStatusCard(parentLayout: LinearLayout) {
        // Drone Status Card Container
        droneStatusCard = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setPadding(24, 16, 24, 16)
            setBackgroundColor(0xFFF8F9FA.toInt())
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 16, 0, 16)
            }
        }

        // Status Icon
        droneStatusIcon = TextView(this).apply {
            text = "🔴"
            textSize = 24f
            setPadding(0, 0, 16, 0)
        }

        // Status Text Container
        val statusTextContainer = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT,
                1f
            )
        }

        droneStatusText = TextView(this).apply {
            text = "Drone Bağlantısı"
            textSize = 16f
            setTextColor(0xFF212529.toInt())
        }

        droneConnectionDetails = TextView(this).apply {
            text = "Bağlantı bekleniyor..."
            textSize = 14f
            setTextColor(0xFF6C757D.toInt())
            setPadding(0, 4, 0, 0)
        }

        statusTextContainer.addView(droneStatusText)
        statusTextContainer.addView(droneConnectionDetails)

        droneStatusCard.addView(droneStatusIcon)
        droneStatusCard.addView(statusTextContainer)

        parentLayout.addView(droneStatusCard)
    }

    private fun updateDroneStatus(isConnected: Boolean) {
        runOnUiThread {
            isDroneConnected = isConnected
            if (isConnected) {
                droneStatusIcon.text = "🟢"
                droneStatusText.text = "Drone Bağlı"
                droneConnectionDetails.text = "Bağlantı aktif - Veri alınıyor"
                droneStatusCard.setBackgroundColor(0xFFE8F5E8.toInt())
            } else {
                droneStatusIcon.text = "🔴"
                droneStatusText.text = "Drone Bağlı Değil"
                droneConnectionDetails.text = "Bağlantı bekleniyor..."
                droneStatusCard.setBackgroundColor(0xFFFFF5F5.toInt())
            }
        }
    }

    private fun startDroneConnectionSubscription() {
        lifecycleScope.launch(Dispatchers.IO) {
            var retryCount = 0
            val maxRetries = 5
            
            while (retryCount < maxRetries) {
                try {
                    Log.d("MainActivity", "Attempting to connect to gRPC server (attempt ${retryCount + 1}/$maxRetries)")
                    Log.d("MainActivity", "Connecting to gRPC server at $serverHost:$grpcServerPort")
                    
                    // Connect CoreService client
                    coreServiceClient.connect()
                    
                    withContext(Dispatchers.Main) {
                        addMessageToUI("gRPC server'a bağlanıldı", true)
                    }
                    
                    // Subscribe to connection state
                    coreServiceClient.subscribeToConnectionState().collect { response ->
                        val connectionState = response.connectionState
                        val isConnected = connectionState.isConnected
                        
                        Log.d("MainActivity", "Received drone connection state: $isConnected")
                        
                        withContext(Dispatchers.Main) {
                            updateDroneStatus(isConnected)
                            addMessageToUI("Drone durumu güncellendi: ${if (isConnected) "Bağlı" else "Bağlı değil"}", true)
                        }
                    }
                    
                    // If we reach here, connection was successful
                    break
                    
                } catch (e: Exception) {
                    retryCount++
                    Log.e("MainActivity", "Error in drone connection subscription (attempt $retryCount)", e)
                    
                    withContext(Dispatchers.Main) {
                        updateDroneStatus(false)
                        if (retryCount < maxRetries) {
                            addMessageToUI("gRPC bağlantı hatası (deneme $retryCount/$maxRetries): ${e.message}", true)
                        } else {
                            addMessageToUI("gRPC bağlantısı kurulamadı. Server'ın çalıştığından emin olun.", true)
                        }
                    }
                    
                    if (retryCount < maxRetries) {
                        delay(2000) // Wait 2 seconds before retry
                    }
                }
            }
        }
    }

    private fun createTelemetryCard(parentLayout: LinearLayout) {
        // Telemetry Card Container
        telemetryCard = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
            setBackgroundColor(0xFFF0F8FF.toInt())
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 16, 0, 16)
            }
        }

        // Telemetry Header
        val telemetryHeader = TextView(this).apply {
            text = "🛸 Drone Telemetri"
            textSize = 18f
            setTextColor(0xFF1976D2.toInt())
            setPadding(0, 0, 0, 12)
        }

        // Position
        positionText = TextView(this).apply {
            text = "📍 Konum: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Altitude
        altitudeText = TextView(this).apply {
            text = "⬆️ Yükseklik: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Attitude
        attitudeText = TextView(this).apply {
            text = "🔄 Açı: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Velocity
        velocityText = TextView(this).apply {
            text = "💨 Hız: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // In Air
        inAirText = TextView(this).apply {
            text = "✈️ Uçuş: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        telemetryCard.addView(telemetryHeader)
        telemetryCard.addView(positionText)
        telemetryCard.addView(altitudeText)
        telemetryCard.addView(attitudeText)
        telemetryCard.addView(velocityText)
        telemetryCard.addView(inAirText)

        parentLayout.addView(telemetryCard)
    }

    private fun createDroneInfoCard(parentLayout: LinearLayout) {
        // Drone Info Card Container
        val droneInfoCard = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
            setBackgroundColor(0xFFE8F5E8.toInt())
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 16, 0, 16)
            }
        }

        // Drone Info Header
        val droneInfoHeader = TextView(this).apply {
            text = "ℹ️ Drone Bilgileri"
            textSize = 18f
            setTextColor(0xFF2E7D32.toInt())
            setPadding(0, 0, 0, 12)
        }

        // Product Info
        val productText = TextView(this).apply {
            text = "📱 Model: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Serial Number
        val serialText = TextView(this).apply {
            text = "🔢 Seri No: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Flight Time
        val flightTimeText = TextView(this).apply {
            text = "⏱️ Uçuş Süresi: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Version Info
        val versionText = TextView(this).apply {
            text = "📋 Versiyon: Bekleniyor..."
            textSize = 14f
            setPadding(0, 4, 0, 4)
        }

        // Refresh Button
        val refreshButton = Button(this).apply {
            text = "🔄 Bilgileri Yenile"
            setOnClickListener {
                refreshDroneInfo()
            }
        }

        droneInfoCard.addView(droneInfoHeader)
        droneInfoCard.addView(productText)
        droneInfoCard.addView(serialText)
        droneInfoCard.addView(flightTimeText)
        droneInfoCard.addView(versionText)
        droneInfoCard.addView(refreshButton)

        parentLayout.addView(droneInfoCard)
    }

    private fun refreshDroneInfo() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                // Connect to InfoService if not already connected
                if (!infoServiceClient.isConnected()) {
                    infoServiceClient.connect()
                }

                // Get all drone information
                val productResponse = infoServiceClient.getProduct()
                val identificationResponse = infoServiceClient.getIdentification()
                val flightInfoResponse = infoServiceClient.getFlightInformation()
                val versionResponse = infoServiceClient.getVersion()

                withContext(Dispatchers.Main) {
                    // Update UI with drone information
                    updateDroneInfoDisplay(
                        productResponse.product,
                        identificationResponse.identification,
                        flightInfoResponse.flightInfo,
                        versionResponse.version
                    )
                    addMessageToUI("Drone bilgileri güncellendi", true)
                }

            } catch (e: Exception) {
                Log.e("MainActivity", "Error refreshing drone info", e)
                withContext(Dispatchers.Main) {
                    addMessageToUI("Drone bilgileri alınamadı: ${e.message}", true)
                }
            }
        }
    }

    private fun updateDroneInfoDisplay(
        product: InfoProto.Product,
        identification: InfoProto.Identification,
        flightInfo: InfoProto.FlightInfo,
        version: InfoProto.Version
    ) {
        // Find the TextViews in the drone info card and update them
        val droneInfoCard = findViewById<LinearLayout>(android.R.id.content)
            .findViewById<LinearLayout>(android.R.id.content)
            .getChildAt(0) as? LinearLayout
        
        droneInfoCard?.let { card ->
            // Update product info
            val productText = card.getChildAt(1) as? TextView
            productText?.text = "📱 Model: ${product.vendorName} ${product.productName}"
            
            // Update serial number
            val serialText = card.getChildAt(2) as? TextView
            serialText?.text = "🔢 Seri No: ${identification.hardwareUid}"
            
            // Update flight time
            val flightTimeText = card.getChildAt(3) as? TextView
            val flightTimeMinutes = flightInfo.durationSinceArmingMs / 1000 / 60
            val flightTimeSeconds = (flightInfo.durationSinceArmingMs / 1000) % 60
            flightTimeText?.text = "⏱️ Uçuş Süresi: ${flightTimeMinutes}:${String.format("%02d", flightTimeSeconds)}"
            
            // Update version info
            val versionText = card.getChildAt(4) as? TextView
            versionText?.text = "📋 Versiyon: ${version.flightSwMajor}.${version.flightSwMinor}.${version.flightSwPatch}"
        }
    }

    private fun startTelemetrySubscriptions() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                // Connect telemetry client
                telemetryServiceClient.connect()
                
                withContext(Dispatchers.Main) {
                    addMessageToUI("Telemetri servisi bağlandı", true)
                }
                
                // Start all telemetry subscriptions in parallel
                launch { subscribeToPosition() }
                launch { subscribeToAltitude() }
                launch { subscribeToAttitude() }
                launch { subscribeToVelocity() }
                launch { subscribeToInAir() }
                
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting telemetry subscriptions", e)
                withContext(Dispatchers.Main) {
                    addMessageToUI("Telemetri bağlantı hatası: ${e.message}", true)
                }
            }
        }
    }

    private fun startInfoServiceSubscriptions() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                // Connect InfoService client
                infoServiceClient.connect()
                
                withContext(Dispatchers.Main) {
                    addMessageToUI("Info servisi bağlandı", true)
                }
                
                // Start flight information subscription
                launch { subscribeToFlightInformation() }
                
            } catch (e: Exception) {
                Log.e("MainActivity", "Error starting info service subscriptions", e)
                withContext(Dispatchers.Main) {
                    addMessageToUI("Info servisi bağlantı hatası: ${e.message}", true)
                }
            }
        }
    }

    private suspend fun subscribeToFlightInformation() {
        try {
            infoServiceClient.subscribeFlightInformation().collect { response ->
                val flightInfo = response.flightInfo
                withContext(Dispatchers.Main) {
                    // Update flight time display
                    updateFlightTimeDisplay(flightInfo.durationSinceArmingMs)
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Flight information subscription error", e)
        }
    }

    private fun updateFlightTimeDisplay(durationMs: Int) {
        val flightTimeMinutes = durationMs / 1000 / 60
        val flightTimeSeconds = (durationMs / 1000) % 60
        
        // Find and update the flight time text in the drone info card
        val droneInfoCard = findViewById<LinearLayout>(android.R.id.content)
            .findViewById<LinearLayout>(android.R.id.content)
            .getChildAt(0) as? LinearLayout
        
        droneInfoCard?.let { card ->
            val flightTimeText = card.getChildAt(3) as? TextView
            flightTimeText?.text = "⏱️ Uçuş Süresi: ${flightTimeMinutes}:${String.format("%02d", flightTimeSeconds)}"
        }
    }

    private suspend fun subscribeToPosition() {
        try {
            telemetryServiceClient.subscribeToPosition().collect { response ->
                val position = response.position
                withContext(Dispatchers.Main) {
                    positionText.text = "📍 Konum: ${String.format("%.6f", position.latitudeDeg)}, ${String.format("%.6f", position.longitudeDeg)}"
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Position subscription error", e)
        }
    }

    private suspend fun subscribeToAltitude() {
        try {
            telemetryServiceClient.subscribeToAltitude().collect { response ->
                val altitude = response.altitude
                withContext(Dispatchers.Main) {
                    altitudeText.text = "⬆️ Yükseklik: ${String.format("%.1f", altitude.altitudeAmslM)} m"
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Altitude subscription error", e)
        }
    }

    private suspend fun subscribeToAttitude() {
        try {
            telemetryServiceClient.subscribeToAttitude().collect { response ->
                val attitude = response.attitudeEuler
                withContext(Dispatchers.Main) {
                    attitudeText.text = "🔄 Açı: R:${String.format("%.1f", attitude.rollDeg)}° P:${String.format("%.1f", attitude.pitchDeg)}° Y:${String.format("%.1f", attitude.yawDeg)}°"
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Attitude subscription error", e)
        }
    }

    private suspend fun subscribeToVelocity() {
        try {
            telemetryServiceClient.subscribeToVelocity().collect { response ->
                val velocity = response.velocityNed
                val speed = kotlin.math.sqrt((velocity.northMS * velocity.northMS + velocity.eastMS * velocity.eastMS).toDouble())
                withContext(Dispatchers.Main) {
                    velocityText.text = "💨 Hız: ${String.format("%.1f", speed)} m/s"
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Velocity subscription error", e)
        }
    }

    private suspend fun subscribeToInAir() {
        try {
            telemetryServiceClient.subscribeToInAir().collect { response ->
                val inAir = response.isInAir
                withContext(Dispatchers.Main) {
                    inAirText.text = "✈️ Uçuş: ${if (inAir) "Havada ✅" else "Yerde ❌"}"
                }
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "InAir subscription error", e)
        }
    }

    private fun resetTelemetryDisplay() {
        positionText.text = "📍 Konum: Bekleniyor..."
        altitudeText.text = "⬆️ Yükseklik: Bekleniyor..."
        attitudeText.text = "🔄 Açı: Bekleniyor..."
        velocityText.text = "💨 Hız: Bekleniyor..."
        inAirText.text = "✈️ Uçuş: Bekleniyor..."
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
        addMessageToUI("BLE taraması başlatılıyor...", false)
    }
    
    private fun stopBLEScanning() {
        bleManager.stopScanning()
        addMessageToUI("BLE taraması durduruluyor...", false)
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
                    addMessageToUI("Bluetooth etkinleştirildi", false)
                    startBLEScanning()
                } else {
                    addMessageToUI("Bluetooth etkinleştirilmedi", false)
                    showToast("Bluetooth etkinleştirilmedi")
                }
            }
        }
    }
    
    private val bleCallback = object : BLEManager.BLECallback {
        override fun onDeviceDiscovered(device: BluetoothDevice, droneInfo: BLEManager.DroneInfo?) {
            val deviceName = device.name ?: "Unknown Device"
            val info = droneInfo?.let { " - ${it.brand} ${it.serialNumber}" } ?: ""
            addMessageToUI("BLE cihaz bulundu: $deviceName$info", false)
            bleDeviceInfoText.text = "Bulunan: $deviceName$info"
        }
        
        override fun onDeviceConnected(device: BluetoothDevice) {
            val deviceName = device.name ?: "Unknown Device"
            addMessageToUI("BLE cihaza bağlanıldı: $deviceName", false)
            bleStatusText.text = "BLE bağlı - $deviceName"
            bleStatusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
        }
        
        override fun onDeviceDisconnected(device: BluetoothDevice) {
            val deviceName = device.name ?: "Unknown Device"
            addMessageToUI("BLE cihaz bağlantısı kesildi: $deviceName", false)
            bleStatusText.text = "BLE kapalı"
            bleStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
        
        override fun onFullDeviceInfoReceived(device: BluetoothDevice, droneInfo: BLEManager.DroneInfo) {
            val deviceName = device.name ?: "Unknown Device"
            addMessageToUI("Drone bilgisi alındı: ${droneInfo.brand} ${droneInfo.model} - ${droneInfo.serialNumber}", false)
            bleDeviceInfoText.text = "Drone: ${droneInfo.brand} ${droneInfo.model} | Serial: ${droneInfo.serialNumber}"
        }
        
        override fun onScanStarted() {
            runOnUiThread {
                isBLEScanning = true
                bleStatusText.text = "BLE aktif - Tarama"
                bleStatusText.setTextColor(resources.getColor(android.R.color.holo_green_dark))
                bleButton.text = "BLE Taramayı Durdur"
                addMessageToUI("BLE taraması başlatıldı", false)
            }
        }
        
        override fun onScanStopped() {
            runOnUiThread {
                isBLEScanning = false
                bleStatusText.text = "BLE kapalı"
                bleStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Taramayı Başlat"
                addMessageToUI("BLE taraması durduruldu", false)
            }
        }
        
        override fun onScanFailed(errorCode: Int, message: String) {
            runOnUiThread {
                isBLEScanning = false
                bleStatusText.text = "BLE hatası: $message"
                bleStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
                bleButton.text = "BLE Taramayı Başlat"
                addMessageToUI("BLE tarama hatası: $message", false)
            }
        }
        
        override fun onConnectionFailed(device: BluetoothDevice, error: String) {
            val deviceName = device.name ?: "Unknown Device"
            addMessageToUI("BLE bağlantı hatası: $deviceName - $error", false)
            bleStatusText.text = "BLE bağlantı hatası"
            bleStatusText.setTextColor(resources.getColor(android.R.color.holo_red_dark))
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        if (isConnected) {
            coreServiceClient.disconnect()
            telemetryServiceClient.disconnect()
        }
        bleManager.cleanup()
    }
} 