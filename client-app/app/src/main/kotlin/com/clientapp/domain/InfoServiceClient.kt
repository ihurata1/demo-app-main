package com.clientapp.domain

import android.util.Log
import io.grpc.Grpc
import io.grpc.InsecureChannelCredentials
import io.grpc.ManagedChannel
import io.mavsdk.info.InfoProto
import io.mavsdk.info.InfoServiceGrpcKt
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart

class InfoServiceClient(private val serverHost: String, private val serverPort: Int) {

    companion object {
        private const val TAG = "InfoServiceClient"
    }

    private var channel: ManagedChannel? = null
    private var infoServiceStub: InfoServiceGrpcKt.InfoServiceCoroutineStub? = null

    fun connect() {
        try {
            channel = Grpc.newChannelBuilder("$serverHost:$serverPort", InsecureChannelCredentials.create())
                .keepAliveTime(30, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveWithoutCalls(true)
                .maxInboundMessageSize(4 * 1024 * 1024)
                .build()
            
            infoServiceStub = InfoServiceGrpcKt.InfoServiceCoroutineStub(channel!!)
            Log.d(TAG, "InfoService client connected to $serverHost:$serverPort")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to connect InfoService client", e)
            throw e
        }
    }

    fun disconnect() {
        try {
            channel?.shutdown()
            channel = null
            infoServiceStub = null
            Log.d(TAG, "InfoService client disconnected")
        } catch (e: Exception) {
            Log.e(TAG, "Error disconnecting InfoService client", e)
        }
    }

    suspend fun getFlightInformation(): InfoProto.GetFlightInformationResponse {
        val stub = infoServiceStub ?: throw IllegalStateException("InfoService client not connected")
        
        val request = InfoProto.GetFlightInformationRequest.newBuilder().build()
        
        return try {
            stub.getFlightInformation(request)
        } catch (e: Exception) {
            Log.e(TAG, "Error getting flight information", e)
            throw e
        }
    }

    suspend fun getProduct(): InfoProto.GetProductResponse {
        val stub = infoServiceStub ?: throw IllegalStateException("InfoService client not connected")
        
        val request = InfoProto.GetProductRequest.newBuilder().build()
        
        return try {
            stub.getProduct(request)
        } catch (e: Exception) {
            Log.e(TAG, "Error getting product information", e)
            throw e
        }
    }

    suspend fun getIdentification(): InfoProto.GetIdentificationResponse {
        val stub = infoServiceStub ?: throw IllegalStateException("InfoService client not connected")
        
        val request = InfoProto.GetIdentificationRequest.newBuilder().build()
        
        return try {
            stub.getIdentification(request)
        } catch (e: Exception) {
            Log.e(TAG, "Error getting identification", e)
            throw e
        }
    }

    suspend fun getVersion(): InfoProto.GetVersionResponse {
        val stub = infoServiceStub ?: throw IllegalStateException("InfoService client not connected")
        
        val request = InfoProto.GetVersionRequest.newBuilder().build()
        
        return try {
            stub.getVersion(request)
        } catch (e: Exception) {
            Log.e(TAG, "Error getting version information", e)
            throw e
        }
    }

    suspend fun getSpeedFactor(): InfoProto.GetSpeedFactorResponse {
        val stub = infoServiceStub ?: throw IllegalStateException("InfoService client not connected")
        
        val request = InfoProto.GetSpeedFactorRequest.newBuilder().build()
        
        return try {
            stub.getSpeedFactor(request)
        } catch (e: Exception) {
            Log.e(TAG, "Error getting speed factor", e)
            throw e
        }
    }

    fun subscribeFlightInformation(): Flow<InfoProto.FlightInformationResponse> {
        val stub = infoServiceStub ?: throw IllegalStateException("InfoService client not connected")
        
        val request = InfoProto.SubscribeFlightInformationRequest.newBuilder().build()
        
        return stub.subscribeFlightInformation(request)
            .onStart {
                Log.d(TAG, "Started subscribing to flight information")
            }
            .catch { exception ->
                Log.e(TAG, "Error in flight information subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "Flight information subscription completed with error", cause)
                } else {
                    Log.d(TAG, "Flight information subscription completed successfully")
                }
            }
    }

    fun isConnected(): Boolean {
        return channel != null && !channel!!.isShutdown
    }
}

