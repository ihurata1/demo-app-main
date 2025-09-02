package com.serverapp.domain

import android.util.Log
import io.mavsdk.info.InfoProto
import io.mavsdk.info.InfoProto.GetFlightInformationRequest
import io.mavsdk.info.InfoServiceGrpcKt
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow

class InfoServiceImpl : InfoServiceGrpcKt.InfoServiceCoroutineImplBase() {

    companion object {
        private const val TAG = "InfoServiceImpl"
    }

    override suspend fun getFlightInformation(request: InfoProto.GetFlightInformationRequest): InfoProto.GetFlightInformationResponse {
        Log.d(TAG, "Fetching flight information.")

        val flightInfoBuilder = InfoProto.FlightInfo.newBuilder()
        val flightIdentification = InfoProto.Identification.newBuilder()

        // Mock data for now - will be replaced with DJI SDK calls
        val flightUid = 120 // 2 minutes in seconds
        val droneSerialNumber = "DJI123456789"

        // Update the FlightInfo message with the obtained UID
        flightInfoBuilder.durationSinceArmingMs = flightUid
        flightIdentification.hardwareUid = droneSerialNumber

        return InfoProto.GetFlightInformationResponse.newBuilder()
            .setInfoResult(InfoProto.InfoResult.newBuilder().setResult(InfoProto.InfoResult.Result.RESULT_SUCCESS).build())
            .setFlightInfo(flightInfoBuilder.build())
            .build()
    }

    override suspend fun getProduct(request: InfoProto.GetProductRequest): InfoProto.GetProductResponse {
        // Mock data for now - will be replaced with DJI SDK calls
        val modelName = "DJI Mini 3 Pro"

        val productBuilder = InfoProto.Product.newBuilder()
            .setVendorName("DJI")
            .setProductName(modelName) // mesela "DJI Mini 3 Pro"

        return InfoProto.GetProductResponse.newBuilder()
            .setInfoResult(InfoProto.InfoResult.newBuilder().setResult(InfoProto.InfoResult.Result.RESULT_SUCCESS))
            .setProduct(productBuilder)
            .build()
    }

    override suspend fun getIdentification(request: InfoProto.GetIdentificationRequest): InfoProto.GetIdentificationResponse {
        Log.d(TAG, "Fetching identification.")

        val flightIdentification = InfoProto.Identification.newBuilder()

        // Mock data for now - will be replaced with DJI SDK calls
        val droneSerialNumber = "DJI123456789"

        // Update the FlightInfo message with the obtained UID
        flightIdentification.hardwareUid = droneSerialNumber

        return InfoProto.GetIdentificationResponse.newBuilder()
            .setInfoResult(InfoProto.InfoResult.newBuilder().setResult(InfoProto.InfoResult.Result.RESULT_SUCCESS).build())
            .setIdentification(flightIdentification.build())
            .build()
    }

    // Subscribe to flight information updates
    override fun subscribeFlightInformation(request: InfoProto.SubscribeFlightInformationRequest): Flow<InfoProto.FlightInformationResponse> {
        return callbackFlow {
            val listenerTag = "InfoServiceFlightInformationListener"

            // Initial emission of flight information
            fun sendFlightInformation(flightTime: Int) {
                Log.d(TAG, "Flight time: $flightTime")

                val flightInfo = InfoProto.FlightInfo.newBuilder()
                    .setDurationSinceArmingMs(flightTime)
                    .build()

                val response = InfoProto.FlightInformationResponse.newBuilder()
                    .setFlightInfo(flightInfo)
                    .build()

                trySend(response).isSuccess
                Log.d(TAG, "Emitted flight information: $flightInfo")
            }

            // Emit initial flight information
            sendFlightInformation(120) // 2 minutes in seconds

            // For now, just emit a single value - will be replaced with DJI SDK listener
            // In the future, this will listen to actual flight controller updates

            // Clean up when the flow is closed
            awaitClose {
                Log.d(TAG, "Flight information subscription closed.")
            }
        }
    }

    // Helper method to send the current flight information

    override suspend fun getVersion(request: InfoProto.GetVersionRequest): InfoProto.GetVersionResponse {
        Log.d(TAG, "Fetching version information.")
        
        val versionBuilder = InfoProto.Version.newBuilder()
            .setFlightSwMajor(1)
            .setFlightSwMinor(0)
            .setFlightSwPatch(0)
            .setFlightSwGitHash("abc123def456")
            .setFlightSwVendorMajor(1)
            .setFlightSwVendorMinor(0)
            .setFlightSwVendorPatch(0)
            .setOsSwMajor(1)
            .setOsSwMinor(0)
            .setOsSwPatch(0)
            .setOsSwGitHash("abc123def456")

        return InfoProto.GetVersionResponse.newBuilder()
            .setInfoResult(InfoProto.InfoResult.newBuilder().setResult(InfoProto.InfoResult.Result.RESULT_SUCCESS).build())
            .setVersion(versionBuilder.build())
            .build()
    }

    override suspend fun getSpeedFactor(request: InfoProto.GetSpeedFactorRequest): InfoProto.GetSpeedFactorResponse {
        Log.d(TAG, "Fetching speed factor.")
        
        val speedFactor = 1.0 // Default speed factor (Double)
        
        return InfoProto.GetSpeedFactorResponse.newBuilder()
            .setInfoResult(InfoProto.InfoResult.newBuilder().setResult(InfoProto.InfoResult.Result.RESULT_SUCCESS).build())
            .setSpeedFactor(speedFactor)
            .build()
    }
}
