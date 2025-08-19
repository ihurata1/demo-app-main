package com.serverapp

import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
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
    
    private var isServerRunning = false
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    

    
    // Drone connection management
    private lateinit var coreService: CoreServiceImpl
    private lateinit var telemetryService: TelemetryServiceImpl
    private var isDroneConnected = false
    private var grpcServer: io.grpc.Server? = null
    private val grpcPort = 50052

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUI()
        
        // Initialize Services
        coreService = CoreServiceImpl()
        telemetryService = TelemetryServiceImpl()
        
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

    override fun onDestroy() {
        super.onDestroy()
        if (isServerRunning) {
            stopServer()
        }
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
} 