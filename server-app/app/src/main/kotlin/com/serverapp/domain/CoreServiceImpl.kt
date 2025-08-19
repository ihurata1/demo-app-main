package com.serverapp.domain

import android.util.Log
import io.mavsdk.core.CoreProto
import io.mavsdk.core.CoreServiceGrpcKt
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch

class CoreServiceImpl : CoreServiceGrpcKt.CoreServiceCoroutineImplBase() {

    companion object {
        private const val TAG = "ServerCoreService"
    }

    // Track the current connection state
    private val connectionStateFlow = MutableStateFlow(false)
    private var currentConnectionState: Boolean = false

    init {
        Log.d(TAG, "Initializing Server CoreServiceImpl")
    }

    override fun subscribeConnectionState(request: CoreProto.SubscribeConnectionStateRequest): Flow<CoreProto.ConnectionStateResponse> {
        Log.d(TAG, "Subscription started for connection state.")
        return callbackFlow {
            // Helper method to send the current connection state
            fun sendCurrentConnectionState() {
                val response = CoreProto.ConnectionStateResponse.newBuilder()
                    .setConnectionState(
                        CoreProto.ConnectionState.newBuilder()
                            .setIsConnected(currentConnectionState)
                            .build()
                    )
                    .build()
                trySend(response).isSuccess
                Log.d(TAG, "Emitted connection state: $currentConnectionState")
            }

            // Emit initial state immediately
            sendCurrentConnectionState()

            // Listen for state changes
            val job = launch {
                connectionStateFlow.collect { isConnected ->
                    currentConnectionState = isConnected
                    sendCurrentConnectionState()
                }
            }

            // Clean up when the flow is closed
            awaitClose {
                Log.d(TAG, "Connection state subscription closed.")
            }
        }
    }

    // Method to manually set connection state (for server control)
    fun setConnectionState(isConnected: Boolean) {
        Log.d(TAG, "Manually setting connection state to: $isConnected")
        currentConnectionState = isConnected
        connectionStateFlow.value = isConnected
    }

    fun getCurrentConnectionState(): Boolean {
        return currentConnectionState
    }
} 