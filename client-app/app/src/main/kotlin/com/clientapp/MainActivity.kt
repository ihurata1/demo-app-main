package com.clientapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.clientapp.domain.CoreServiceClient
import android.util.Log
import io.netty.bootstrap.Bootstrap
import io.netty.channel.*
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioSocketChannel
import io.netty.handler.codec.string.StringDecoder
import io.netty.handler.codec.string.StringEncoder
import kotlinx.coroutines.*
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var statusText: TextView
    private lateinit var connectButton: Button
    private lateinit var messageInput: EditText
    private lateinit var sendButton: Button
    private lateinit var messagesScrollView: ScrollView
    private lateinit var messagesContainer: LinearLayout
    private lateinit var droneStatusCard: LinearLayout
    private lateinit var droneStatusIcon: TextView
    private lateinit var droneStatusText: TextView
    private lateinit var droneConnectionDetails: TextView
    
    private var client: Channel? = null
    private var isConnected = false
    private var eventLoopGroup: NioEventLoopGroup? = null
    private val serverHost = "10.34.34.48"
    private val serverPort = 50051
    private val grpcServerPort = 50052
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    
    // Drone connection state
    private var isDroneConnected = false
    private lateinit var coreServiceClient: CoreServiceClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUI()
        
        // Initialize CoreService client
        coreServiceClient = CoreServiceClient(serverHost, grpcServerPort)
        
        connectButton.setOnClickListener {
            if (isConnected) {
                disconnectFromServer()
            } else {
                connectToServer()
            }
        }
        
        sendButton.setOnClickListener {
            sendMessage()
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
            text = "Bağlantı bekleniyor..."
            setPadding(0, 0, 0, 16)
        }
        
        // Connect button
        connectButton = Button(this).apply {
            text = "Server'a Bağlan"
        }
        
        // Drone Status Card
        createDroneStatusCard(layout)
        
        // Message input section
        val inputLabel = TextView(this).apply {
            text = "Mesaj Gönder:"
            setPadding(0, 24, 0, 8)
        }
        
        messageInput = EditText(this).apply {
            hint = "Mesajınızı yazın..."
            isEnabled = false
        }
        
        sendButton = Button(this).apply {
            text = "Gönder"
            isEnabled = false
        }
        
        // Messages section
        val messagesLabel = TextView(this).apply {
            text = "Gelen Mesajlar:"
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
        layout.addView(inputLabel)
        layout.addView(messageInput)
        layout.addView(sendButton)
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
                eventLoopGroup = NioEventLoopGroup()
                val bootstrap = Bootstrap()
                bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel::class.java)
                    .handler(object : ChannelInitializer<SocketChannel>() {
                        override fun initChannel(ch: SocketChannel) {
                            ch.pipeline().addLast(
                                StringDecoder(),
                                StringEncoder(),
                                ClientHandler()
                            )
                        }
                    })

                val future = bootstrap.connect(serverHost, serverPort).sync()
                client = future.channel()
                
                withContext(Dispatchers.Main) {
                    isConnected = true
                    statusText.text = "✅ Server'a bağlandı ($serverHost:$serverPort)"
                    connectButton.text = "Bağlantıyı Kes"
                    messageInput.isEnabled = true
                    sendButton.isEnabled = true
                    showToast("Server'a bağlanıldı")
                    addMessageToUI("Bağlantı kuruldu", true)
                    
                    // Start drone connection subscription
                    startDroneConnectionSubscription()
                }
                
                // Keep the connection alive by waiting for it to close
                client?.closeFuture()?.sync()
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Bağlantı hatası: ${e.message}")
                    addMessageToUI("Bağlantı hatası: ${e.message}", true)
                    
                    // Reset UI state on connection failure
                    isConnected = false
                    statusText.text = "❌ Bağlantı başarısız"
                    connectButton.text = "Server'a Bağlan"
                    messageInput.isEnabled = false
                    sendButton.isEnabled = false
                }
            } finally {
                // Clean up when connection ends
                eventLoopGroup?.shutdownGracefully()
                withContext(Dispatchers.Main) {
                    if (isConnected) {
                        isConnected = false
                        statusText.text = "❌ Bağlantı kesildi"
                        connectButton.text = "Server'a Bağlan"
                        messageInput.isEnabled = false
                        sendButton.isEnabled = false
                        addMessageToUI("Bağlantı kesildi", true)
                    }
                }
            }
        }
    }

    private fun disconnectFromServer() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                isConnected = false
                client?.close()?.sync()
                
                withContext(Dispatchers.Main) {
                    statusText.text = "❌ Bağlantı kesildi"
                    connectButton.text = "Server'a Bağlan"
                    messageInput.isEnabled = false
                    sendButton.isEnabled = false
                    showToast("Bağlantı kesildi")
                    addMessageToUI("Bağlantı kesildi", true)
                    
                    // Disconnect CoreService client and reset drone status
                    coreServiceClient.disconnect()
                    updateDroneStatus(false)
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Bağlantı kesme hatası: ${e.message}")
                }
            } finally {
                eventLoopGroup?.shutdownGracefully()
            }
        }
    }

    private fun sendMessage() {
        val message = messageInput.text.toString().trim()
        if (message.isNotEmpty() && isConnected) {
            lifecycleScope.launch(Dispatchers.IO) {
                try {
                    client?.writeAndFlush(message)
                    
                    withContext(Dispatchers.Main) {
                        addMessageToUI(message, false)
                        messageInput.text.clear()
                    }
                    
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        showToast("Mesaj gönderme hatası: ${e.message}")
                    }
                }
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleScope.launch(Dispatchers.IO) {
            if (isConnected) {
                client?.close()
            }
            eventLoopGroup?.shutdownGracefully()
        }
    }

    inner class ClientHandler : ChannelInboundHandlerAdapter() {
        override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
            val response = msg.toString()
            addMessageToUI(response, true)
        }

        override fun channelActive(ctx: ChannelHandlerContext) {
            // Bağlantı kurulduğunda çağrılır - extra log için
            addMessageToUI("Kanal aktif oldu", true)
        }

        override fun channelInactive(ctx: ChannelHandlerContext) {
            runOnUiThread {
                if (isConnected) {
                    isConnected = false
                    statusText.text = "❌ Server bağlantısı kesildi"
                    connectButton.text = "Server'a Bağlan"
                    messageInput.isEnabled = false
                    sendButton.isEnabled = false
                    addMessageToUI("Server bağlantısı kesildi", true)
                }
            }
        }

        override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
            runOnUiThread {
                showToast("İletişim hatası: ${cause.message}")
                addMessageToUI("Hata: ${cause.message}", true)
            }
            ctx.close()
        }
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
} 