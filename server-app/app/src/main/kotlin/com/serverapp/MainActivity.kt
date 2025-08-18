package com.serverapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.*
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.SocketChannel
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.handler.codec.string.StringDecoder
import io.netty.handler.codec.string.StringEncoder
import kotlinx.coroutines.*
import java.net.InetSocketAddress
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.ConcurrentHashMap

class MainActivity : AppCompatActivity() {
    private lateinit var statusText: TextView
    private lateinit var serverButton: Button
    private lateinit var messageInput: EditText
    private lateinit var sendToClientButton: Button
    private lateinit var clientsSpinner: Spinner
    private lateinit var messagesScrollView: ScrollView
    private lateinit var messagesContainer: LinearLayout
    
    private var server: ChannelFuture? = null
    private var isServerRunning = false
    private val port = 50051
    private val dateFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    
    // Connected clients management
    private val connectedClients = ConcurrentHashMap<String, Channel>()
    private lateinit var clientsAdapter: ArrayAdapter<String>
    private val clientsList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupUI()
        
        serverButton.setOnClickListener {
            if (isServerRunning) {
                stopServer()
            } else {
                startServer()
            }
        }
        
        sendToClientButton.setOnClickListener {
            sendMessageToClient()
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
        
        // Client selection section
        val clientsLabel = TextView(this).apply {
            text = "Bağlı Client'lar:"
            setPadding(0, 24, 0, 8)
        }
        
        clientsAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, clientsList)
        clientsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        
        clientsSpinner = Spinner(this).apply {
            adapter = clientsAdapter
            isEnabled = false
        }
        
        // Message sending section
        val messageLabel = TextView(this).apply {
            text = "Client'a Mesaj Gönder:"
            setPadding(0, 24, 0, 8)
        }
        
        messageInput = EditText(this).apply {
            hint = "Server mesajını yazın..."
            isEnabled = false
        }
        
        sendToClientButton = Button(this).apply {
            text = "Mesaj Gönder"
            isEnabled = false
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
        layout.addView(clientsLabel)
        layout.addView(clientsSpinner)
        layout.addView(messageLabel)
        layout.addView(messageInput)
        layout.addView(sendToClientButton)
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

    private fun updateClientsSpinner() {
        runOnUiThread {
            clientsList.clear()
            if (connectedClients.isEmpty()) {
                clientsList.add("Bağlı client yok")
                clientsSpinner.isEnabled = false
                sendToClientButton.isEnabled = false
                messageInput.isEnabled = false
            } else {
                clientsList.add("Tüm Client'lar")
                clientsList.addAll(connectedClients.keys)
                clientsSpinner.isEnabled = true
                sendToClientButton.isEnabled = true
                messageInput.isEnabled = true
            }
            clientsAdapter.notifyDataSetChanged()
        }
    }

    private fun startServer() {
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                val bossGroup = NioEventLoopGroup(1)
                val workerGroup = NioEventLoopGroup()
                
                val bootstrap = ServerBootstrap()
                bootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel::class.java)
                    .childHandler(object : ChannelInitializer<SocketChannel>() {
                        override fun initChannel(ch: SocketChannel) {
                            ch.pipeline().addLast(
                                StringDecoder(),
                                StringEncoder(),
                                ServerHandler()
                            )
                        }
                    })
                
                server = bootstrap.bind(InetSocketAddress("0.0.0.0", port)).sync()
                
                withContext(Dispatchers.Main) {
                    isServerRunning = true
                    statusText.text = "Server çalışıyor (Port: $port)"
                    serverButton.text = "Server Durdur"
                    showToast("Server başlatıldı - Port: $port")
                    addLogMessage("Server başlatıldı - Port: $port", "SERVER")
                }
                
                server?.channel()?.closeFuture()?.sync()
                
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
                // Disconnect all clients
                connectedClients.values.forEach { it.close() }
                connectedClients.clear()
                
                server?.channel()?.close()?.sync()
                
                withContext(Dispatchers.Main) {
                    isServerRunning = false
                    statusText.text = "Server durduruldu"
                    serverButton.text = "Server Başlat"
                    messageInput.isEnabled = false
                    sendToClientButton.isEnabled = false
                    clientsSpinner.isEnabled = false
                    showToast("Server durduruldu")
                    addLogMessage("Server durduruldu", "SERVER")
                    updateClientsSpinner()
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Server durdurma hatası: ${e.message}")
                    addLogMessage("Server durdurma hatası: ${e.message}", "ERROR")
                }
            }
        }
    }

    private fun sendMessageToClient() {
        val message = messageInput.text.toString().trim()
        if (message.isEmpty()) {
            showToast("Lütfen bir mesaj yazın")
            return
        }
        
        val selectedClient = clientsSpinner.selectedItem?.toString()
        if (selectedClient == null || selectedClient == "Bağlı client yok") {
            showToast("Mesaj gönderilecek client yok")
            return
        }
        
        lifecycleScope.launch(Dispatchers.IO) {
            try {
                if (selectedClient == "Tüm Client'lar") {
                    // Send to all clients
                    var sentCount = 0
                    connectedClients.values.forEach { channel ->
                        try {
                            channel.writeAndFlush("🖥️ Server: $message")
                            sentCount++
                        } catch (e: Exception) {
                            // Client might be disconnected
                        }
                    }
                    
                    withContext(Dispatchers.Main) {
                        messageInput.text.clear()
                        addLogMessage("Mesaj tüm client'lara gönderildi ($sentCount client): $message", "SEND")
                        showToast("Mesaj $sentCount client'a gönderildi")
                    }
                } else {
                    // Send to specific client
                    val clientChannel = connectedClients[selectedClient]
                    if (clientChannel != null && clientChannel.isActive) {
                        clientChannel.writeAndFlush("🖥️ Server: $message")
                        
                        withContext(Dispatchers.Main) {
                            messageInput.text.clear()
                            addLogMessage("Mesaj gönderildi ($selectedClient): $message", "SEND")
                            showToast("Mesaj gönderildi")
                        }
                    } else {
                        withContext(Dispatchers.Main) {
                            showToast("Client bağlantısı mevcut değil")
                            addLogMessage("Client bağlantısı mevcut değil: $selectedClient", "ERROR")
                        }
                    }
                }
                
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    showToast("Mesaj gönderme hatası: ${e.message}")
                    addLogMessage("Mesaj gönderme hatası: ${e.message}", "ERROR")
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

    inner class ServerHandler : ChannelInboundHandlerAdapter() {
        override fun channelRead(ctx: ChannelHandlerContext, msg: Any) {
            val message = msg.toString()
            val clientAddress = ctx.channel().remoteAddress().toString()
            
            addLogMessage("Mesaj alındı ($clientAddress): $message", "RECEIVE")
            
            // Echo the message back to the client
            ctx.writeAndFlush("Echo: $message")
        }

        override fun channelActive(ctx: ChannelHandlerContext) {
            val clientAddress = ctx.channel().remoteAddress().toString()
            connectedClients[clientAddress] = ctx.channel()
            
            addLogMessage("Client bağlandı: $clientAddress", "CLIENT")
            updateClientsSpinner()
            runOnUiThread {
                showToast("Yeni client bağlandı")
            }
        }

        override fun channelInactive(ctx: ChannelHandlerContext) {
            val clientAddress = ctx.channel().remoteAddress().toString()
            connectedClients.remove(clientAddress)
            
            addLogMessage("Client bağlantısı kesildi: $clientAddress", "CLIENT")
            updateClientsSpinner()
            runOnUiThread {
                showToast("Client bağlantısı kesildi")
            }
        }

        override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) {
            val clientAddress = ctx.channel().remoteAddress().toString()
            addLogMessage("Client hatası ($clientAddress): ${cause.message}", "ERROR")
            ctx.close()
        }
    }
} 