package com.serverapp.domain

import android.util.Log
import io.mavsdk.telemetry.TelemetryProto
import io.mavsdk.telemetry.TelemetryServiceGrpcKt
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.launch
import kotlin.math.cos
import kotlin.math.sin
import kotlin.random.Random

class TelemetryServiceImpl : TelemetryServiceGrpcKt.TelemetryServiceCoroutineImplBase() {

    companion object {
        private const val TAG = "TelemetryServiceImpl"
    }

    // Simulation parameters
    private var simulationTime = 0.0
    private val baseLatitude = 41.0082 // Istanbul coordinates
    private val baseLongitude = 28.9784
    private var baseAltitude = 100.0
    private var isSimulationRunning = false

    init {
        Log.d(TAG, "Initializing TelemetryServiceImpl")
    }

    fun startSimulation() {
        isSimulationRunning = true
        Log.d(TAG, "Telemetry simulation started")
    }

    fun stopSimulation() {
        isSimulationRunning = false
        simulationTime = 0.0
        Log.d(TAG, "Telemetry simulation stopped")
    }

    override fun subscribePosition(request: TelemetryProto.SubscribePositionRequest): Flow<TelemetryProto.PositionResponse> {
        Log.d(TAG, "subscribePosition called")
        return callbackFlow {
            val job = launch {
                while (isSimulationRunning) {
                    try {
                        // Generate circular flight pattern
                        val radius = 0.001 // ~100 meters in degrees
                        val lat = baseLatitude + radius * sin(simulationTime * 0.1)
                        val lng = baseLongitude + radius * cos(simulationTime * 0.1)
                        val alt = baseAltitude + sin(simulationTime * 0.05) * 20 // Altitude variation

                        val response = TelemetryProto.PositionResponse.newBuilder()
                            .setPosition(
                                TelemetryProto.Position.newBuilder()
                                    .setLatitudeDeg(lat)
                                    .setLongitudeDeg(lng)
                                    .setAbsoluteAltitudeM(alt.toFloat())
                                    .setRelativeAltitudeM((alt - 50).toFloat())
                                    .build()
                            )
                            .build()

                        trySend(response).isSuccess
                        simulationTime += 1.0
                        delay(1000) // Send every second
                    } catch (e: Exception) {
                        Log.e(TAG, "Error in position simulation", e)
                    }
                }
            }

            awaitClose {
                Log.d(TAG, "Position subscription closed")
            }
        }
    }

    override fun subscribeAltitude(request: TelemetryProto.SubscribeAltitudeRequest): Flow<TelemetryProto.AltitudeResponse> {
        Log.d(TAG, "subscribeAltitude called")
        return callbackFlow {
            val job = launch {
                while (isSimulationRunning) {
                    try {
                        // Generate varying altitude
                        val altitude = baseAltitude + sin(simulationTime * 0.05) * 30
                        
                        val response = TelemetryProto.AltitudeResponse.newBuilder()
                            .setAltitude(
                                TelemetryProto.Altitude.newBuilder()
                                    .setAltitudeAmslM(altitude.toFloat())
                                    .setAltitudeLocalM((altitude - 50).toFloat())
                                    .setAltitudeRelativeM((altitude - baseAltitude).toFloat())
                                    .setAltitudeTerrainM(altitude.toFloat())
                                    .build()
                            )
                            .build()

                        trySend(response).isSuccess
                        delay(1000)
                    } catch (e: Exception) {
                        Log.e(TAG, "Error in altitude simulation", e)
                    }
                }
            }

            awaitClose {
                Log.d(TAG, "Altitude subscription closed")
            }
        }
    }

    override fun subscribeAttitudeEuler(request: TelemetryProto.SubscribeAttitudeEulerRequest): Flow<TelemetryProto.AttitudeEulerResponse> {
        Log.d(TAG, "subscribeAttitudeEuler called")
        return callbackFlow {
            val job = launch {
                while (isSimulationRunning) {
                    try {
                        // Generate realistic attitude changes
                        val roll = sin(simulationTime * 0.3) * 15 // ±15 degrees
                        val pitch = cos(simulationTime * 0.2) * 10 // ±10 degrees  
                        val yaw = (simulationTime * 2) % 360 // Slow rotation

                        val response = TelemetryProto.AttitudeEulerResponse.newBuilder()
                            .setAttitudeEuler(
                                TelemetryProto.EulerAngle.newBuilder()
                                    .setRollDeg(roll.toFloat())
                                    .setPitchDeg(pitch.toFloat())
                                    .setYawDeg(yaw.toFloat())
                                    .setTimestampUs(System.currentTimeMillis() * 1000)
                                    .build()
                            )
                            .build()

                        trySend(response).isSuccess
                        delay(100) // 10 Hz update rate
                    } catch (e: Exception) {
                        Log.e(TAG, "Error in attitude simulation", e)
                    }
                }
            }

            awaitClose {
                Log.d(TAG, "Attitude subscription closed")
            }
        }
    }

    override fun subscribeVelocityNed(request: TelemetryProto.SubscribeVelocityNedRequest): Flow<TelemetryProto.VelocityNedResponse> {
        Log.d(TAG, "subscribeVelocityNed called")
        return callbackFlow {
            val job = launch {
                while (isSimulationRunning) {
                    try {
                        // Generate velocity for circular pattern
                        val speed = 5.0 // 5 m/s
                        val north = speed * cos(simulationTime * 0.1)
                        val east = speed * sin(simulationTime * 0.1)
                        val down = sin(simulationTime * 0.05) * 2 // Vertical movement

                        val response = TelemetryProto.VelocityNedResponse.newBuilder()
                            .setVelocityNed(
                                TelemetryProto.VelocityNed.newBuilder()
                                    .setNorthMS(north.toFloat())
                                    .setEastMS(east.toFloat())
                                    .setDownMS(down.toFloat())
                                    .build()
                            )
                            .build()

                        trySend(response).isSuccess
                        delay(200) // 5 Hz update rate
                    } catch (e: Exception) {
                        Log.e(TAG, "Error in velocity simulation", e)
                    }
                }
            }

            awaitClose {
                Log.d(TAG, "Velocity subscription closed")
            }
        }
    }

    override fun subscribeInAir(request: TelemetryProto.SubscribeInAirRequest): Flow<TelemetryProto.InAirResponse> {
        Log.d(TAG, "subscribeInAir called")
        return callbackFlow {
            val job = launch {
                while (isSimulationRunning) {
                    try {
                        // Simulate in-air status (mostly true during simulation)
                        val inAir = baseAltitude > 50 && isSimulationRunning
                        
                        val response = TelemetryProto.InAirResponse.newBuilder()
                            .setIsInAir(inAir)
                            .build()

                        trySend(response).isSuccess
                        delay(2000) // Update every 2 seconds
                    } catch (e: Exception) {
                        Log.e(TAG, "Error in in-air simulation", e)
                    }
                }
            }

            awaitClose {
                Log.d(TAG, "In air subscription closed")
            }
        }
    }
} 