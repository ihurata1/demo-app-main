package io.mavsdk.calibration

import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.serverStreamingRpc
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.serverStreamingServerMethodDefinition
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.mavsdk.calibration.CalibrationServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.calibration.CalibrationService.
 */
public object CalibrationServiceGrpcKt {
  public const val SERVICE_NAME: String = CalibrationServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeCalibrateGyroMethod:
      MethodDescriptor<CalibrationProto.SubscribeCalibrateGyroRequest, CalibrationProto.CalibrateGyroResponse>
    @JvmStatic
    get() = CalibrationServiceGrpc.getSubscribeCalibrateGyroMethod()

  public val subscribeCalibrateAccelerometerMethod:
      MethodDescriptor<CalibrationProto.SubscribeCalibrateAccelerometerRequest, CalibrationProto.CalibrateAccelerometerResponse>
    @JvmStatic
    get() = CalibrationServiceGrpc.getSubscribeCalibrateAccelerometerMethod()

  public val subscribeCalibrateMagnetometerMethod:
      MethodDescriptor<CalibrationProto.SubscribeCalibrateMagnetometerRequest, CalibrationProto.CalibrateMagnetometerResponse>
    @JvmStatic
    get() = CalibrationServiceGrpc.getSubscribeCalibrateMagnetometerMethod()

  public val subscribeCalibrateLevelHorizonMethod:
      MethodDescriptor<CalibrationProto.SubscribeCalibrateLevelHorizonRequest, CalibrationProto.CalibrateLevelHorizonResponse>
    @JvmStatic
    get() = CalibrationServiceGrpc.getSubscribeCalibrateLevelHorizonMethod()

  public val subscribeCalibrateGimbalAccelerometerMethod:
      MethodDescriptor<CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest, CalibrationProto.CalibrateGimbalAccelerometerResponse>
    @JvmStatic
    get() = CalibrationServiceGrpc.getSubscribeCalibrateGimbalAccelerometerMethod()

  public val cancelMethod:
      MethodDescriptor<CalibrationProto.CancelRequest, CalibrationProto.CancelResponse>
    @JvmStatic
    get() = CalibrationServiceGrpc.getCancelMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.calibration.CalibrationService service as suspending
   * coroutines.
   */
  @StubFor(CalibrationServiceGrpc::class)
  public class CalibrationServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CalibrationServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CalibrationServiceCoroutineStub
        = CalibrationServiceCoroutineStub(channel, callOptions)

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public fun subscribeCalibrateGyro(request: CalibrationProto.SubscribeCalibrateGyroRequest,
        headers: Metadata = Metadata()): Flow<CalibrationProto.CalibrateGyroResponse> =
        serverStreamingRpc(
      channel,
      CalibrationServiceGrpc.getSubscribeCalibrateGyroMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public
        fun subscribeCalibrateAccelerometer(request: CalibrationProto.SubscribeCalibrateAccelerometerRequest,
        headers: Metadata = Metadata()): Flow<CalibrationProto.CalibrateAccelerometerResponse> =
        serverStreamingRpc(
      channel,
      CalibrationServiceGrpc.getSubscribeCalibrateAccelerometerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public
        fun subscribeCalibrateMagnetometer(request: CalibrationProto.SubscribeCalibrateMagnetometerRequest,
        headers: Metadata = Metadata()): Flow<CalibrationProto.CalibrateMagnetometerResponse> =
        serverStreamingRpc(
      channel,
      CalibrationServiceGrpc.getSubscribeCalibrateMagnetometerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public
        fun subscribeCalibrateLevelHorizon(request: CalibrationProto.SubscribeCalibrateLevelHorizonRequest,
        headers: Metadata = Metadata()): Flow<CalibrationProto.CalibrateLevelHorizonResponse> =
        serverStreamingRpc(
      channel,
      CalibrationServiceGrpc.getSubscribeCalibrateLevelHorizonMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Returns a [Flow] that, when collected, executes this RPC and emits responses from the
     * server as they arrive.  That flow finishes normally if the server closes its response with
     * [`Status.OK`][io.grpc.Status], and fails by throwing a [StatusException] otherwise.  If
     * collecting the flow downstream fails exceptionally (including via cancellation), the RPC
     * is cancelled with that exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return A flow that, when collected, emits the responses from the server.
     */
    public
        fun subscribeCalibrateGimbalAccelerometer(request: CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest,
        headers: Metadata = Metadata()): Flow<CalibrationProto.CalibrateGimbalAccelerometerResponse>
        = serverStreamingRpc(
      channel,
      CalibrationServiceGrpc.getSubscribeCalibrateGimbalAccelerometerMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun cancel(request: CalibrationProto.CancelRequest, headers: Metadata =
        Metadata()): CalibrationProto.CancelResponse = unaryRpc(
      channel,
      CalibrationServiceGrpc.getCancelMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.calibration.CalibrationService service based on
   * Kotlin coroutines.
   */
  public abstract class CalibrationServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateGyro.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open fun subscribeCalibrateGyro(request: CalibrationProto.SubscribeCalibrateGyroRequest):
        Flow<CalibrationProto.CalibrateGyroResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateGyro is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateAccelerometer.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open
        fun subscribeCalibrateAccelerometer(request: CalibrationProto.SubscribeCalibrateAccelerometerRequest):
        Flow<CalibrationProto.CalibrateAccelerometerResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateAccelerometer is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateMagnetometer.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open
        fun subscribeCalibrateMagnetometer(request: CalibrationProto.SubscribeCalibrateMagnetometerRequest):
        Flow<CalibrationProto.CalibrateMagnetometerResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateMagnetometer is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateLevelHorizon.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open
        fun subscribeCalibrateLevelHorizon(request: CalibrationProto.SubscribeCalibrateLevelHorizonRequest):
        Flow<CalibrationProto.CalibrateLevelHorizonResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateLevelHorizon is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateGimbalAccelerometer.
     *
     * If creating or collecting the returned flow fails with a [StatusException], the RPC
     * will fail with the corresponding [io.grpc.Status].  If it fails with a
     * [java.util.concurrent.CancellationException], the RPC will fail with status
     * `Status.CANCELLED`.  If creating
     * or collecting the returned flow fails for any other reason, the RPC will fail with
     * `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open
        fun subscribeCalibrateGimbalAccelerometer(request: CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest):
        Flow<CalibrationProto.CalibrateGimbalAccelerometerResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.calibration.CalibrationService.SubscribeCalibrateGimbalAccelerometer is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.calibration.CalibrationService.Cancel.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cancel(request: CalibrationProto.CancelRequest):
        CalibrationProto.CancelResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.calibration.CalibrationService.Cancel is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CalibrationServiceGrpc.getSubscribeCalibrateGyroMethod(),
      implementation = ::subscribeCalibrateGyro
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CalibrationServiceGrpc.getSubscribeCalibrateAccelerometerMethod(),
      implementation = ::subscribeCalibrateAccelerometer
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CalibrationServiceGrpc.getSubscribeCalibrateMagnetometerMethod(),
      implementation = ::subscribeCalibrateMagnetometer
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CalibrationServiceGrpc.getSubscribeCalibrateLevelHorizonMethod(),
      implementation = ::subscribeCalibrateLevelHorizon
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CalibrationServiceGrpc.getSubscribeCalibrateGimbalAccelerometerMethod(),
      implementation = ::subscribeCalibrateGimbalAccelerometer
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CalibrationServiceGrpc.getCancelMethod(),
      implementation = ::cancel
    )).build()
  }
}
