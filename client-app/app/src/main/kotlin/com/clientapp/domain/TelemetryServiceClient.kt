package com.clientapp.domain

import android.util.Log
import io.grpc.Grpc
import io.grpc.InsecureChannelCredentials
import io.grpc.ManagedChannel
import io.mavsdk.telemetry.TelemetryProto
import io.mavsdk.telemetry.TelemetryServiceGrpcKt
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart

class TelemetryServiceClient(private val serverHost: String, private val serverPort: Int) {

    companion object {
        private const val TAG = "TelemetryServiceClient"
    }

    private var channel: ManagedChannel? = null
    private var telemetryServiceStub: TelemetryServiceGrpcKt.TelemetryServiceCoroutineStub? = null

    fun connect() {
        try {
            channel = Grpc.newChannelBuilder("$serverHost:$serverPort", InsecureChannelCredentials.create())
                .keepAliveTime(30, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveTimeout(5, java.util.concurrent.TimeUnit.SECONDS)
                .keepAliveWithoutCalls(true)
                .maxInboundMessageSize(4 * 1024 * 1024)
                .build()
            
            telemetryServiceStub = TelemetryServiceGrpcKt.TelemetryServiceCoroutineStub(channel!!)
            Log.d(TAG, "TelemetryService client connected to $serverHost:$serverPort")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to connect TelemetryService client", e)
            throw e
        }
    }

    fun disconnect() {
        try {
            channel?.shutdown()
            channel = null
            telemetryServiceStub = null
            Log.d(TAG, "TelemetryService client disconnected")
        } catch (e: Exception) {
            Log.e(TAG, "Error disconnecting TelemetryService client", e)
        }
    }

    fun subscribeToPosition(): Flow<TelemetryProto.PositionResponse> {
        val stub = telemetryServiceStub ?: throw IllegalStateException("TelemetryService client not connected")
        val request = TelemetryProto.SubscribePositionRequest.newBuilder().build()
        
        return stub.subscribePosition(request)
            .onStart {
                Log.d(TAG, "Started subscribing to position")
            }
            .catch { exception ->
                Log.e(TAG, "Error in position subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "Position subscription completed with error", cause)
                } else {
                    Log.d(TAG, "Position subscription completed successfully")
                }
            }
    }

    fun subscribeToAltitude(): Flow<TelemetryProto.AltitudeResponse> {
        val stub = telemetryServiceStub ?: throw IllegalStateException("TelemetryService client not connected")
        val request = TelemetryProto.SubscribeAltitudeRequest.newBuilder().build()
        
        return stub.subscribeAltitude(request)
            .onStart {
                Log.d(TAG, "Started subscribing to altitude")
            }
            .catch { exception ->
                Log.e(TAG, "Error in altitude subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "Altitude subscription completed with error", cause)
                } else {
                    Log.d(TAG, "Altitude subscription completed successfully")
                }
            }
    }

    fun subscribeToAttitude(): Flow<TelemetryProto.AttitudeEulerResponse> {
        val stub = telemetryServiceStub ?: throw IllegalStateException("TelemetryService client not connected")
        val request = TelemetryProto.SubscribeAttitudeEulerRequest.newBuilder().build()
        
        return stub.subscribeAttitudeEuler(request)
            .onStart {
                Log.d(TAG, "Started subscribing to attitude")
            }
            .catch { exception ->
                Log.e(TAG, "Error in attitude subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "Attitude subscription completed with error", cause)
                } else {
                    Log.d(TAG, "Attitude subscription completed successfully")
                }
            }
    }

    fun subscribeToVelocity(): Flow<TelemetryProto.VelocityNedResponse> {
        val stub = telemetryServiceStub ?: throw IllegalStateException("TelemetryService client not connected")
        val request = TelemetryProto.SubscribeVelocityNedRequest.newBuilder().build()
        
        return stub.subscribeVelocityNed(request)
            .onStart {
                Log.d(TAG, "Started subscribing to velocity")
            }
            .catch { exception ->
                Log.e(TAG, "Error in velocity subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "Velocity subscription completed with error", cause)
                } else {
                    Log.d(TAG, "Velocity subscription completed successfully")
                }
            }
    }

    fun subscribeToInAir(): Flow<TelemetryProto.InAirResponse> {
        val stub = telemetryServiceStub ?: throw IllegalStateException("TelemetryService client not connected")
        val request = TelemetryProto.SubscribeInAirRequest.newBuilder().build()
        
        return stub.subscribeInAir(request)
            .onStart {
                Log.d(TAG, "Started subscribing to in-air status")
            }
            .catch { exception ->
                Log.e(TAG, "Error in in-air subscription", exception)
                throw exception
            }
            .onCompletion { cause ->
                if (cause != null) {
                    Log.e(TAG, "In-air subscription completed with error", cause)
                } else {
                    Log.d(TAG, "In-air subscription completed successfully")
                }
            }
    }

    fun isConnected(): Boolean {
        return channel != null && !channel!!.isShutdown
    }
} 