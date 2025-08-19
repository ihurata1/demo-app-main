package com.clientapp.domain

import android.util.Log
import io.grpc.Grpc
import io.grpc.InsecureChannelCredentials
import io.grpc.ManagedChannel
import io.mavsdk.core.CoreProto
import io.mavsdk.core.CoreServiceGrpcKt
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart

class CoreServiceClient(private val serverHost: String, private val serverPort: Int) {

    companion object {
        private const val TAG = "CoreServiceClient"
    }

    private var channel: ManagedChannel? = null
    private var coreServiceStub: CoreServiceGrpcKt.CoreServiceCoroutineStub? = null

    fun connect() {
        try {
            channel = Grpc.newChannelBuilder("$serverHost:$serverPort", InsecureChannelCredentials.create())
                .keepAliveTime(30, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveWithoutCalls(true)
                .maxInboundMessageSize(4 * 1024 * 1024)
                .build()
            
            coreServiceStub = CoreServiceGrpcKt.CoreServiceCoroutineStub(channel!!)
            Log.d(TAG, "CoreService client connected to $serverHost:$serverPort")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to connect CoreService client", e)
            throw e
        }
    }

    fun disconnect() {
        try {
            channel?.shutdown()
            channel = null
            coreServiceStub = null
            Log.d(TAG, "CoreService client disconnected")
        } catch (e: Exception) {
            Log.e(TAG, "Error disconnecting CoreService client", e)
        }
    }

    fun subscribeToConnectionState(): Flow<CoreProto.ConnectionStateResponse> {
        val stub = coreServiceStub ?: throw IllegalStateException("CoreService client not connected")
        
        val request = CoreProto.SubscribeConnectionStateRequest.newBuilder().build()
        
        return stub.subscribeConnectionState(request)
            .onStart {
                Log.d(TAG, "Started subscribing to connection state")
            }
            .catch { exception ->
                Log.e(TAG, "Error in connection state subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "Connection state subscription completed with error", cause)
                } else {
                    Log.d(TAG, "Connection state subscription completed successfully")
                }
            }
    }

    fun isConnected(): Boolean {
        return channel != null && !channel!!.isShutdown
    }
} 