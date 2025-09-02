package io.mavsdk.telemetry

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
import io.mavsdk.telemetry.TelemetryServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.telemetry.TelemetryService.
 */
public object TelemetryServiceGrpcKt {
  public const val SERVICE_NAME: String = TelemetryServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribePositionMethod:
      MethodDescriptor<TelemetryProto.SubscribePositionRequest, TelemetryProto.PositionResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribePositionMethod()

  public val subscribeHomeMethod:
      MethodDescriptor<TelemetryProto.SubscribeHomeRequest, TelemetryProto.HomeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeHomeMethod()

  public val subscribeInAirMethod:
      MethodDescriptor<TelemetryProto.SubscribeInAirRequest, TelemetryProto.InAirResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeInAirMethod()

  public val subscribeLandedStateMethod:
      MethodDescriptor<TelemetryProto.SubscribeLandedStateRequest, TelemetryProto.LandedStateResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeLandedStateMethod()

  public val subscribeArmedMethod:
      MethodDescriptor<TelemetryProto.SubscribeArmedRequest, TelemetryProto.ArmedResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeArmedMethod()

  public val subscribeVtolStateMethod:
      MethodDescriptor<TelemetryProto.SubscribeVtolStateRequest, TelemetryProto.VtolStateResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeVtolStateMethod()

  public val subscribeAttitudeQuaternionMethod:
      MethodDescriptor<TelemetryProto.SubscribeAttitudeQuaternionRequest, TelemetryProto.AttitudeQuaternionResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeAttitudeQuaternionMethod()

  public val subscribeAttitudeEulerMethod:
      MethodDescriptor<TelemetryProto.SubscribeAttitudeEulerRequest, TelemetryProto.AttitudeEulerResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeAttitudeEulerMethod()

  public val subscribeAttitudeAngularVelocityBodyMethod:
      MethodDescriptor<TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest, TelemetryProto.AttitudeAngularVelocityBodyResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeAttitudeAngularVelocityBodyMethod()

  public val subscribeCameraAttitudeQuaternionMethod:
      MethodDescriptor<TelemetryProto.SubscribeCameraAttitudeQuaternionRequest, TelemetryProto.CameraAttitudeQuaternionResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeCameraAttitudeQuaternionMethod()

  public val subscribeCameraAttitudeEulerMethod:
      MethodDescriptor<TelemetryProto.SubscribeCameraAttitudeEulerRequest, TelemetryProto.CameraAttitudeEulerResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeCameraAttitudeEulerMethod()

  public val subscribeVelocityNedMethod:
      MethodDescriptor<TelemetryProto.SubscribeVelocityNedRequest, TelemetryProto.VelocityNedResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeVelocityNedMethod()

  public val subscribeGpsInfoMethod:
      MethodDescriptor<TelemetryProto.SubscribeGpsInfoRequest, TelemetryProto.GpsInfoResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeGpsInfoMethod()

  public val subscribeRawGpsMethod:
      MethodDescriptor<TelemetryProto.SubscribeRawGpsRequest, TelemetryProto.RawGpsResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeRawGpsMethod()

  public val subscribeBatteryMethod:
      MethodDescriptor<TelemetryProto.SubscribeBatteryRequest, TelemetryProto.BatteryResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeBatteryMethod()

  public val subscribeFlightModeMethod:
      MethodDescriptor<TelemetryProto.SubscribeFlightModeRequest, TelemetryProto.FlightModeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeFlightModeMethod()

  public val subscribeHealthMethod:
      MethodDescriptor<TelemetryProto.SubscribeHealthRequest, TelemetryProto.HealthResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeHealthMethod()

  public val subscribeRcStatusMethod:
      MethodDescriptor<TelemetryProto.SubscribeRcStatusRequest, TelemetryProto.RcStatusResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeRcStatusMethod()

  public val subscribeStatusTextMethod:
      MethodDescriptor<TelemetryProto.SubscribeStatusTextRequest, TelemetryProto.StatusTextResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeStatusTextMethod()

  public val subscribeActuatorControlTargetMethod:
      MethodDescriptor<TelemetryProto.SubscribeActuatorControlTargetRequest, TelemetryProto.ActuatorControlTargetResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeActuatorControlTargetMethod()

  public val subscribeActuatorOutputStatusMethod:
      MethodDescriptor<TelemetryProto.SubscribeActuatorOutputStatusRequest, TelemetryProto.ActuatorOutputStatusResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeActuatorOutputStatusMethod()

  public val subscribeOdometryMethod:
      MethodDescriptor<TelemetryProto.SubscribeOdometryRequest, TelemetryProto.OdometryResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeOdometryMethod()

  public val subscribePositionVelocityNedMethod:
      MethodDescriptor<TelemetryProto.SubscribePositionVelocityNedRequest, TelemetryProto.PositionVelocityNedResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribePositionVelocityNedMethod()

  public val subscribeGroundTruthMethod:
      MethodDescriptor<TelemetryProto.SubscribeGroundTruthRequest, TelemetryProto.GroundTruthResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeGroundTruthMethod()

  public val subscribeFixedwingMetricsMethod:
      MethodDescriptor<TelemetryProto.SubscribeFixedwingMetricsRequest, TelemetryProto.FixedwingMetricsResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeFixedwingMetricsMethod()

  public val subscribeImuMethod:
      MethodDescriptor<TelemetryProto.SubscribeImuRequest, TelemetryProto.ImuResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeImuMethod()

  public val subscribeScaledImuMethod:
      MethodDescriptor<TelemetryProto.SubscribeScaledImuRequest, TelemetryProto.ScaledImuResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeScaledImuMethod()

  public val subscribeRawImuMethod:
      MethodDescriptor<TelemetryProto.SubscribeRawImuRequest, TelemetryProto.RawImuResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeRawImuMethod()

  public val subscribeHealthAllOkMethod:
      MethodDescriptor<TelemetryProto.SubscribeHealthAllOkRequest, TelemetryProto.HealthAllOkResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeHealthAllOkMethod()

  public val subscribeUnixEpochTimeMethod:
      MethodDescriptor<TelemetryProto.SubscribeUnixEpochTimeRequest, TelemetryProto.UnixEpochTimeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeUnixEpochTimeMethod()

  public val subscribeDistanceSensorMethod:
      MethodDescriptor<TelemetryProto.SubscribeDistanceSensorRequest, TelemetryProto.DistanceSensorResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeDistanceSensorMethod()

  public val subscribeScaledPressureMethod:
      MethodDescriptor<TelemetryProto.SubscribeScaledPressureRequest, TelemetryProto.ScaledPressureResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeScaledPressureMethod()

  public val subscribeHeadingMethod:
      MethodDescriptor<TelemetryProto.SubscribeHeadingRequest, TelemetryProto.HeadingResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeHeadingMethod()

  public val subscribeAltitudeMethod:
      MethodDescriptor<TelemetryProto.SubscribeAltitudeRequest, TelemetryProto.AltitudeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSubscribeAltitudeMethod()

  public val setRatePositionMethod:
      MethodDescriptor<TelemetryProto.SetRatePositionRequest, TelemetryProto.SetRatePositionResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRatePositionMethod()

  public val setRateHomeMethod:
      MethodDescriptor<TelemetryProto.SetRateHomeRequest, TelemetryProto.SetRateHomeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateHomeMethod()

  public val setRateInAirMethod:
      MethodDescriptor<TelemetryProto.SetRateInAirRequest, TelemetryProto.SetRateInAirResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateInAirMethod()

  public val setRateLandedStateMethod:
      MethodDescriptor<TelemetryProto.SetRateLandedStateRequest, TelemetryProto.SetRateLandedStateResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateLandedStateMethod()

  public val setRateVtolStateMethod:
      MethodDescriptor<TelemetryProto.SetRateVtolStateRequest, TelemetryProto.SetRateVtolStateResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateVtolStateMethod()

  public val setRateAttitudeQuaternionMethod:
      MethodDescriptor<TelemetryProto.SetRateAttitudeQuaternionRequest, TelemetryProto.SetRateAttitudeQuaternionResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateAttitudeQuaternionMethod()

  public val setRateAttitudeEulerMethod:
      MethodDescriptor<TelemetryProto.SetRateAttitudeEulerRequest, TelemetryProto.SetRateAttitudeEulerResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateAttitudeEulerMethod()

  public val setRateCameraAttitudeMethod:
      MethodDescriptor<TelemetryProto.SetRateCameraAttitudeRequest, TelemetryProto.SetRateCameraAttitudeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateCameraAttitudeMethod()

  public val setRateVelocityNedMethod:
      MethodDescriptor<TelemetryProto.SetRateVelocityNedRequest, TelemetryProto.SetRateVelocityNedResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateVelocityNedMethod()

  public val setRateGpsInfoMethod:
      MethodDescriptor<TelemetryProto.SetRateGpsInfoRequest, TelemetryProto.SetRateGpsInfoResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateGpsInfoMethod()

  public val setRateBatteryMethod:
      MethodDescriptor<TelemetryProto.SetRateBatteryRequest, TelemetryProto.SetRateBatteryResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateBatteryMethod()

  public val setRateRcStatusMethod:
      MethodDescriptor<TelemetryProto.SetRateRcStatusRequest, TelemetryProto.SetRateRcStatusResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateRcStatusMethod()

  public val setRateActuatorControlTargetMethod:
      MethodDescriptor<TelemetryProto.SetRateActuatorControlTargetRequest, TelemetryProto.SetRateActuatorControlTargetResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateActuatorControlTargetMethod()

  public val setRateActuatorOutputStatusMethod:
      MethodDescriptor<TelemetryProto.SetRateActuatorOutputStatusRequest, TelemetryProto.SetRateActuatorOutputStatusResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateActuatorOutputStatusMethod()

  public val setRateOdometryMethod:
      MethodDescriptor<TelemetryProto.SetRateOdometryRequest, TelemetryProto.SetRateOdometryResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateOdometryMethod()

  public val setRatePositionVelocityNedMethod:
      MethodDescriptor<TelemetryProto.SetRatePositionVelocityNedRequest, TelemetryProto.SetRatePositionVelocityNedResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRatePositionVelocityNedMethod()

  public val setRateGroundTruthMethod:
      MethodDescriptor<TelemetryProto.SetRateGroundTruthRequest, TelemetryProto.SetRateGroundTruthResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateGroundTruthMethod()

  public val setRateFixedwingMetricsMethod:
      MethodDescriptor<TelemetryProto.SetRateFixedwingMetricsRequest, TelemetryProto.SetRateFixedwingMetricsResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateFixedwingMetricsMethod()

  public val setRateImuMethod:
      MethodDescriptor<TelemetryProto.SetRateImuRequest, TelemetryProto.SetRateImuResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateImuMethod()

  public val setRateScaledImuMethod:
      MethodDescriptor<TelemetryProto.SetRateScaledImuRequest, TelemetryProto.SetRateScaledImuResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateScaledImuMethod()

  public val setRateRawImuMethod:
      MethodDescriptor<TelemetryProto.SetRateRawImuRequest, TelemetryProto.SetRateRawImuResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateRawImuMethod()

  public val setRateUnixEpochTimeMethod:
      MethodDescriptor<TelemetryProto.SetRateUnixEpochTimeRequest, TelemetryProto.SetRateUnixEpochTimeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateUnixEpochTimeMethod()

  public val setRateDistanceSensorMethod:
      MethodDescriptor<TelemetryProto.SetRateDistanceSensorRequest, TelemetryProto.SetRateDistanceSensorResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateDistanceSensorMethod()

  public val setRateAltitudeMethod:
      MethodDescriptor<TelemetryProto.SetRateAltitudeRequest, TelemetryProto.SetRateAltitudeResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getSetRateAltitudeMethod()

  public val getGpsGlobalOriginMethod:
      MethodDescriptor<TelemetryProto.GetGpsGlobalOriginRequest, TelemetryProto.GetGpsGlobalOriginResponse>
    @JvmStatic
    get() = TelemetryServiceGrpc.getGetGpsGlobalOriginMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.telemetry.TelemetryService service as suspending
   * coroutines.
   */
  @StubFor(TelemetryServiceGrpc::class)
  public class TelemetryServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TelemetryServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TelemetryServiceCoroutineStub =
        TelemetryServiceCoroutineStub(channel, callOptions)

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
    public fun subscribePosition(request: TelemetryProto.SubscribePositionRequest, headers: Metadata
        = Metadata()): Flow<TelemetryProto.PositionResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribePositionMethod(),
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
    public fun subscribeHome(request: TelemetryProto.SubscribeHomeRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.HomeResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeHomeMethod(),
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
    public fun subscribeInAir(request: TelemetryProto.SubscribeInAirRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.InAirResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeInAirMethod(),
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
    public fun subscribeLandedState(request: TelemetryProto.SubscribeLandedStateRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.LandedStateResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeLandedStateMethod(),
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
    public fun subscribeArmed(request: TelemetryProto.SubscribeArmedRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.ArmedResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeArmedMethod(),
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
    public fun subscribeVtolState(request: TelemetryProto.SubscribeVtolStateRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.VtolStateResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeVtolStateMethod(),
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
        fun subscribeAttitudeQuaternion(request: TelemetryProto.SubscribeAttitudeQuaternionRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.AttitudeQuaternionResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeAttitudeQuaternionMethod(),
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
    public fun subscribeAttitudeEuler(request: TelemetryProto.SubscribeAttitudeEulerRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.AttitudeEulerResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeAttitudeEulerMethod(),
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
        fun subscribeAttitudeAngularVelocityBody(request: TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.AttitudeAngularVelocityBodyResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeAttitudeAngularVelocityBodyMethod(),
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
        fun subscribeCameraAttitudeQuaternion(request: TelemetryProto.SubscribeCameraAttitudeQuaternionRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.CameraAttitudeQuaternionResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeCameraAttitudeQuaternionMethod(),
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
        fun subscribeCameraAttitudeEuler(request: TelemetryProto.SubscribeCameraAttitudeEulerRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.CameraAttitudeEulerResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeCameraAttitudeEulerMethod(),
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
    public fun subscribeVelocityNed(request: TelemetryProto.SubscribeVelocityNedRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.VelocityNedResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeVelocityNedMethod(),
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
    public fun subscribeGpsInfo(request: TelemetryProto.SubscribeGpsInfoRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.GpsInfoResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeGpsInfoMethod(),
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
    public fun subscribeRawGps(request: TelemetryProto.SubscribeRawGpsRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.RawGpsResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeRawGpsMethod(),
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
    public fun subscribeBattery(request: TelemetryProto.SubscribeBatteryRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.BatteryResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeBatteryMethod(),
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
    public fun subscribeFlightMode(request: TelemetryProto.SubscribeFlightModeRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.FlightModeResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeFlightModeMethod(),
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
    public fun subscribeHealth(request: TelemetryProto.SubscribeHealthRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.HealthResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeHealthMethod(),
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
    public fun subscribeRcStatus(request: TelemetryProto.SubscribeRcStatusRequest, headers: Metadata
        = Metadata()): Flow<TelemetryProto.RcStatusResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeRcStatusMethod(),
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
    public fun subscribeStatusText(request: TelemetryProto.SubscribeStatusTextRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.StatusTextResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeStatusTextMethod(),
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
        fun subscribeActuatorControlTarget(request: TelemetryProto.SubscribeActuatorControlTargetRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.ActuatorControlTargetResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeActuatorControlTargetMethod(),
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
        fun subscribeActuatorOutputStatus(request: TelemetryProto.SubscribeActuatorOutputStatusRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.ActuatorOutputStatusResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeActuatorOutputStatusMethod(),
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
    public fun subscribeOdometry(request: TelemetryProto.SubscribeOdometryRequest, headers: Metadata
        = Metadata()): Flow<TelemetryProto.OdometryResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeOdometryMethod(),
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
        fun subscribePositionVelocityNed(request: TelemetryProto.SubscribePositionVelocityNedRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.PositionVelocityNedResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribePositionVelocityNedMethod(),
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
    public fun subscribeGroundTruth(request: TelemetryProto.SubscribeGroundTruthRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.GroundTruthResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeGroundTruthMethod(),
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
    public fun subscribeFixedwingMetrics(request: TelemetryProto.SubscribeFixedwingMetricsRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.FixedwingMetricsResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeFixedwingMetricsMethod(),
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
    public fun subscribeImu(request: TelemetryProto.SubscribeImuRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.ImuResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeImuMethod(),
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
    public fun subscribeScaledImu(request: TelemetryProto.SubscribeScaledImuRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.ScaledImuResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeScaledImuMethod(),
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
    public fun subscribeRawImu(request: TelemetryProto.SubscribeRawImuRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.RawImuResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeRawImuMethod(),
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
    public fun subscribeHealthAllOk(request: TelemetryProto.SubscribeHealthAllOkRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.HealthAllOkResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeHealthAllOkMethod(),
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
    public fun subscribeUnixEpochTime(request: TelemetryProto.SubscribeUnixEpochTimeRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.UnixEpochTimeResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeUnixEpochTimeMethod(),
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
    public fun subscribeDistanceSensor(request: TelemetryProto.SubscribeDistanceSensorRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.DistanceSensorResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeDistanceSensorMethod(),
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
    public fun subscribeScaledPressure(request: TelemetryProto.SubscribeScaledPressureRequest,
        headers: Metadata = Metadata()): Flow<TelemetryProto.ScaledPressureResponse> =
        serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeScaledPressureMethod(),
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
    public fun subscribeHeading(request: TelemetryProto.SubscribeHeadingRequest, headers: Metadata =
        Metadata()): Flow<TelemetryProto.HeadingResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeHeadingMethod(),
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
    public fun subscribeAltitude(request: TelemetryProto.SubscribeAltitudeRequest, headers: Metadata
        = Metadata()): Flow<TelemetryProto.AltitudeResponse> = serverStreamingRpc(
      channel,
      TelemetryServiceGrpc.getSubscribeAltitudeMethod(),
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
    public suspend fun setRatePosition(request: TelemetryProto.SetRatePositionRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRatePositionResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRatePositionMethod(),
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
    public suspend fun setRateHome(request: TelemetryProto.SetRateHomeRequest, headers: Metadata =
        Metadata()): TelemetryProto.SetRateHomeResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateHomeMethod(),
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
    public suspend fun setRateInAir(request: TelemetryProto.SetRateInAirRequest, headers: Metadata =
        Metadata()): TelemetryProto.SetRateInAirResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateInAirMethod(),
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
    public suspend fun setRateLandedState(request: TelemetryProto.SetRateLandedStateRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateLandedStateResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateLandedStateMethod(),
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
    public suspend fun setRateVtolState(request: TelemetryProto.SetRateVtolStateRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateVtolStateResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateVtolStateMethod(),
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
    public suspend
        fun setRateAttitudeQuaternion(request: TelemetryProto.SetRateAttitudeQuaternionRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateAttitudeQuaternionResponse =
        unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateAttitudeQuaternionMethod(),
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
    public suspend fun setRateAttitudeEuler(request: TelemetryProto.SetRateAttitudeEulerRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateAttitudeEulerResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateAttitudeEulerMethod(),
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
    public suspend fun setRateCameraAttitude(request: TelemetryProto.SetRateCameraAttitudeRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateCameraAttitudeResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateCameraAttitudeMethod(),
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
    public suspend fun setRateVelocityNed(request: TelemetryProto.SetRateVelocityNedRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateVelocityNedResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateVelocityNedMethod(),
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
    public suspend fun setRateGpsInfo(request: TelemetryProto.SetRateGpsInfoRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateGpsInfoResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateGpsInfoMethod(),
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
    public suspend fun setRateBattery(request: TelemetryProto.SetRateBatteryRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateBatteryResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateBatteryMethod(),
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
    public suspend fun setRateRcStatus(request: TelemetryProto.SetRateRcStatusRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateRcStatusResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateRcStatusMethod(),
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
    public suspend
        fun setRateActuatorControlTarget(request: TelemetryProto.SetRateActuatorControlTargetRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateActuatorControlTargetResponse =
        unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateActuatorControlTargetMethod(),
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
    public suspend
        fun setRateActuatorOutputStatus(request: TelemetryProto.SetRateActuatorOutputStatusRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateActuatorOutputStatusResponse =
        unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateActuatorOutputStatusMethod(),
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
    public suspend fun setRateOdometry(request: TelemetryProto.SetRateOdometryRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateOdometryResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateOdometryMethod(),
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
    public suspend
        fun setRatePositionVelocityNed(request: TelemetryProto.SetRatePositionVelocityNedRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRatePositionVelocityNedResponse =
        unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRatePositionVelocityNedMethod(),
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
    public suspend fun setRateGroundTruth(request: TelemetryProto.SetRateGroundTruthRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateGroundTruthResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateGroundTruthMethod(),
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
    public suspend
        fun setRateFixedwingMetrics(request: TelemetryProto.SetRateFixedwingMetricsRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateFixedwingMetricsResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateFixedwingMetricsMethod(),
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
    public suspend fun setRateImu(request: TelemetryProto.SetRateImuRequest, headers: Metadata =
        Metadata()): TelemetryProto.SetRateImuResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateImuMethod(),
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
    public suspend fun setRateScaledImu(request: TelemetryProto.SetRateScaledImuRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateScaledImuResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateScaledImuMethod(),
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
    public suspend fun setRateRawImu(request: TelemetryProto.SetRateRawImuRequest, headers: Metadata
        = Metadata()): TelemetryProto.SetRateRawImuResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateRawImuMethod(),
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
    public suspend fun setRateUnixEpochTime(request: TelemetryProto.SetRateUnixEpochTimeRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateUnixEpochTimeResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateUnixEpochTimeMethod(),
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
    public suspend fun setRateDistanceSensor(request: TelemetryProto.SetRateDistanceSensorRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateDistanceSensorResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateDistanceSensorMethod(),
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
    public suspend fun setRateAltitude(request: TelemetryProto.SetRateAltitudeRequest,
        headers: Metadata = Metadata()): TelemetryProto.SetRateAltitudeResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getSetRateAltitudeMethod(),
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
    public suspend fun getGpsGlobalOrigin(request: TelemetryProto.GetGpsGlobalOriginRequest,
        headers: Metadata = Metadata()): TelemetryProto.GetGpsGlobalOriginResponse = unaryRpc(
      channel,
      TelemetryServiceGrpc.getGetGpsGlobalOriginMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.telemetry.TelemetryService service based on Kotlin
   * coroutines.
   */
  public abstract class TelemetryServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribePosition.
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
    public open fun subscribePosition(request: TelemetryProto.SubscribePositionRequest):
        Flow<TelemetryProto.PositionResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribePosition is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeHome.
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
    public open fun subscribeHome(request: TelemetryProto.SubscribeHomeRequest):
        Flow<TelemetryProto.HomeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeHome is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeInAir.
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
    public open fun subscribeInAir(request: TelemetryProto.SubscribeInAirRequest):
        Flow<TelemetryProto.InAirResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeInAir is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeLandedState.
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
    public open fun subscribeLandedState(request: TelemetryProto.SubscribeLandedStateRequest):
        Flow<TelemetryProto.LandedStateResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeLandedState is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeArmed.
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
    public open fun subscribeArmed(request: TelemetryProto.SubscribeArmedRequest):
        Flow<TelemetryProto.ArmedResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeArmed is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeVtolState.
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
    public open fun subscribeVtolState(request: TelemetryProto.SubscribeVtolStateRequest):
        Flow<TelemetryProto.VtolStateResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeVtolState is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeAttitudeQuaternion.
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
        fun subscribeAttitudeQuaternion(request: TelemetryProto.SubscribeAttitudeQuaternionRequest):
        Flow<TelemetryProto.AttitudeQuaternionResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeAttitudeQuaternion is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeAttitudeEuler.
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
    public open fun subscribeAttitudeEuler(request: TelemetryProto.SubscribeAttitudeEulerRequest):
        Flow<TelemetryProto.AttitudeEulerResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeAttitudeEuler is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeAttitudeAngularVelocityBody.
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
        fun subscribeAttitudeAngularVelocityBody(request: TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest):
        Flow<TelemetryProto.AttitudeAngularVelocityBodyResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeAttitudeAngularVelocityBody is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeCameraAttitudeQuaternion.
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
        fun subscribeCameraAttitudeQuaternion(request: TelemetryProto.SubscribeCameraAttitudeQuaternionRequest):
        Flow<TelemetryProto.CameraAttitudeQuaternionResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeCameraAttitudeQuaternion is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeCameraAttitudeEuler.
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
        fun subscribeCameraAttitudeEuler(request: TelemetryProto.SubscribeCameraAttitudeEulerRequest):
        Flow<TelemetryProto.CameraAttitudeEulerResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeCameraAttitudeEuler is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeVelocityNed.
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
    public open fun subscribeVelocityNed(request: TelemetryProto.SubscribeVelocityNedRequest):
        Flow<TelemetryProto.VelocityNedResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeVelocityNed is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeGpsInfo.
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
    public open fun subscribeGpsInfo(request: TelemetryProto.SubscribeGpsInfoRequest):
        Flow<TelemetryProto.GpsInfoResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeGpsInfo is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeRawGps.
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
    public open fun subscribeRawGps(request: TelemetryProto.SubscribeRawGpsRequest):
        Flow<TelemetryProto.RawGpsResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeRawGps is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeBattery.
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
    public open fun subscribeBattery(request: TelemetryProto.SubscribeBatteryRequest):
        Flow<TelemetryProto.BatteryResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeBattery is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeFlightMode.
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
    public open fun subscribeFlightMode(request: TelemetryProto.SubscribeFlightModeRequest):
        Flow<TelemetryProto.FlightModeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeFlightMode is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeHealth.
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
    public open fun subscribeHealth(request: TelemetryProto.SubscribeHealthRequest):
        Flow<TelemetryProto.HealthResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeHealth is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeRcStatus.
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
    public open fun subscribeRcStatus(request: TelemetryProto.SubscribeRcStatusRequest):
        Flow<TelemetryProto.RcStatusResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeRcStatus is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeStatusText.
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
    public open fun subscribeStatusText(request: TelemetryProto.SubscribeStatusTextRequest):
        Flow<TelemetryProto.StatusTextResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeStatusText is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeActuatorControlTarget.
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
        fun subscribeActuatorControlTarget(request: TelemetryProto.SubscribeActuatorControlTargetRequest):
        Flow<TelemetryProto.ActuatorControlTargetResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeActuatorControlTarget is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeActuatorOutputStatus.
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
        fun subscribeActuatorOutputStatus(request: TelemetryProto.SubscribeActuatorOutputStatusRequest):
        Flow<TelemetryProto.ActuatorOutputStatusResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeActuatorOutputStatus is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeOdometry.
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
    public open fun subscribeOdometry(request: TelemetryProto.SubscribeOdometryRequest):
        Flow<TelemetryProto.OdometryResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeOdometry is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribePositionVelocityNed.
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
        fun subscribePositionVelocityNed(request: TelemetryProto.SubscribePositionVelocityNedRequest):
        Flow<TelemetryProto.PositionVelocityNedResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribePositionVelocityNed is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeGroundTruth.
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
    public open fun subscribeGroundTruth(request: TelemetryProto.SubscribeGroundTruthRequest):
        Flow<TelemetryProto.GroundTruthResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeGroundTruth is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeFixedwingMetrics.
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
        fun subscribeFixedwingMetrics(request: TelemetryProto.SubscribeFixedwingMetricsRequest):
        Flow<TelemetryProto.FixedwingMetricsResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeFixedwingMetrics is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeImu.
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
    public open fun subscribeImu(request: TelemetryProto.SubscribeImuRequest):
        Flow<TelemetryProto.ImuResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeImu is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeScaledImu.
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
    public open fun subscribeScaledImu(request: TelemetryProto.SubscribeScaledImuRequest):
        Flow<TelemetryProto.ScaledImuResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeScaledImu is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeRawImu.
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
    public open fun subscribeRawImu(request: TelemetryProto.SubscribeRawImuRequest):
        Flow<TelemetryProto.RawImuResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeRawImu is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeHealthAllOk.
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
    public open fun subscribeHealthAllOk(request: TelemetryProto.SubscribeHealthAllOkRequest):
        Flow<TelemetryProto.HealthAllOkResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeHealthAllOk is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeUnixEpochTime.
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
    public open fun subscribeUnixEpochTime(request: TelemetryProto.SubscribeUnixEpochTimeRequest):
        Flow<TelemetryProto.UnixEpochTimeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeUnixEpochTime is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeDistanceSensor.
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
    public open fun subscribeDistanceSensor(request: TelemetryProto.SubscribeDistanceSensorRequest):
        Flow<TelemetryProto.DistanceSensorResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeDistanceSensor is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeScaledPressure.
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
    public open fun subscribeScaledPressure(request: TelemetryProto.SubscribeScaledPressureRequest):
        Flow<TelemetryProto.ScaledPressureResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeScaledPressure is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeHeading.
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
    public open fun subscribeHeading(request: TelemetryProto.SubscribeHeadingRequest):
        Flow<TelemetryProto.HeadingResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeHeading is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SubscribeAltitude.
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
    public open fun subscribeAltitude(request: TelemetryProto.SubscribeAltitudeRequest):
        Flow<TelemetryProto.AltitudeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SubscribeAltitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRatePosition.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRatePosition(request: TelemetryProto.SetRatePositionRequest):
        TelemetryProto.SetRatePositionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRatePosition is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateHome.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateHome(request: TelemetryProto.SetRateHomeRequest):
        TelemetryProto.SetRateHomeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateHome is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateInAir.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateInAir(request: TelemetryProto.SetRateInAirRequest):
        TelemetryProto.SetRateInAirResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateInAir is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateLandedState.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateLandedState(request: TelemetryProto.SetRateLandedStateRequest):
        TelemetryProto.SetRateLandedStateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateLandedState is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateVtolState.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateVtolState(request: TelemetryProto.SetRateVtolStateRequest):
        TelemetryProto.SetRateVtolStateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateVtolState is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateAttitudeQuaternion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateAttitudeQuaternion(request: TelemetryProto.SetRateAttitudeQuaternionRequest):
        TelemetryProto.SetRateAttitudeQuaternionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateAttitudeQuaternion is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateAttitudeEuler.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateAttitudeEuler(request: TelemetryProto.SetRateAttitudeEulerRequest):
        TelemetryProto.SetRateAttitudeEulerResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateAttitudeEuler is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateCameraAttitude.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateCameraAttitude(request: TelemetryProto.SetRateCameraAttitudeRequest):
        TelemetryProto.SetRateCameraAttitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateCameraAttitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateVelocityNed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateVelocityNed(request: TelemetryProto.SetRateVelocityNedRequest):
        TelemetryProto.SetRateVelocityNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateVelocityNed is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateGpsInfo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateGpsInfo(request: TelemetryProto.SetRateGpsInfoRequest):
        TelemetryProto.SetRateGpsInfoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateGpsInfo is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateBattery.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateBattery(request: TelemetryProto.SetRateBatteryRequest):
        TelemetryProto.SetRateBatteryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateBattery is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateRcStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateRcStatus(request: TelemetryProto.SetRateRcStatusRequest):
        TelemetryProto.SetRateRcStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateRcStatus is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateActuatorControlTarget.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateActuatorControlTarget(request: TelemetryProto.SetRateActuatorControlTargetRequest):
        TelemetryProto.SetRateActuatorControlTargetResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateActuatorControlTarget is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateActuatorOutputStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateActuatorOutputStatus(request: TelemetryProto.SetRateActuatorOutputStatusRequest):
        TelemetryProto.SetRateActuatorOutputStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateActuatorOutputStatus is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateOdometry.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateOdometry(request: TelemetryProto.SetRateOdometryRequest):
        TelemetryProto.SetRateOdometryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateOdometry is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRatePositionVelocityNed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRatePositionVelocityNed(request: TelemetryProto.SetRatePositionVelocityNedRequest):
        TelemetryProto.SetRatePositionVelocityNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRatePositionVelocityNed is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateGroundTruth.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateGroundTruth(request: TelemetryProto.SetRateGroundTruthRequest):
        TelemetryProto.SetRateGroundTruthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateGroundTruth is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateFixedwingMetrics.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateFixedwingMetrics(request: TelemetryProto.SetRateFixedwingMetricsRequest):
        TelemetryProto.SetRateFixedwingMetricsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateFixedwingMetrics is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateImu.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateImu(request: TelemetryProto.SetRateImuRequest):
        TelemetryProto.SetRateImuResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateImu is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateScaledImu.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateScaledImu(request: TelemetryProto.SetRateScaledImuRequest):
        TelemetryProto.SetRateScaledImuResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateScaledImu is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateRawImu.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateRawImu(request: TelemetryProto.SetRateRawImuRequest):
        TelemetryProto.SetRateRawImuResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateRawImu is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateUnixEpochTime.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateUnixEpochTime(request: TelemetryProto.SetRateUnixEpochTimeRequest):
        TelemetryProto.SetRateUnixEpochTimeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateUnixEpochTime is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry.TelemetryService.SetRateDistanceSensor.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend
        fun setRateDistanceSensor(request: TelemetryProto.SetRateDistanceSensorRequest):
        TelemetryProto.SetRateDistanceSensorResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateDistanceSensor is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.SetRateAltitude.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateAltitude(request: TelemetryProto.SetRateAltitudeRequest):
        TelemetryProto.SetRateAltitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.SetRateAltitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.telemetry.TelemetryService.GetGpsGlobalOrigin.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getGpsGlobalOrigin(request: TelemetryProto.GetGpsGlobalOriginRequest):
        TelemetryProto.GetGpsGlobalOriginResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry.TelemetryService.GetGpsGlobalOrigin is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribePositionMethod(),
      implementation = ::subscribePosition
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeHomeMethod(),
      implementation = ::subscribeHome
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeInAirMethod(),
      implementation = ::subscribeInAir
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeLandedStateMethod(),
      implementation = ::subscribeLandedState
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeArmedMethod(),
      implementation = ::subscribeArmed
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeVtolStateMethod(),
      implementation = ::subscribeVtolState
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeAttitudeQuaternionMethod(),
      implementation = ::subscribeAttitudeQuaternion
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeAttitudeEulerMethod(),
      implementation = ::subscribeAttitudeEuler
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeAttitudeAngularVelocityBodyMethod(),
      implementation = ::subscribeAttitudeAngularVelocityBody
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeCameraAttitudeQuaternionMethod(),
      implementation = ::subscribeCameraAttitudeQuaternion
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeCameraAttitudeEulerMethod(),
      implementation = ::subscribeCameraAttitudeEuler
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeVelocityNedMethod(),
      implementation = ::subscribeVelocityNed
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeGpsInfoMethod(),
      implementation = ::subscribeGpsInfo
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeRawGpsMethod(),
      implementation = ::subscribeRawGps
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeBatteryMethod(),
      implementation = ::subscribeBattery
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeFlightModeMethod(),
      implementation = ::subscribeFlightMode
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeHealthMethod(),
      implementation = ::subscribeHealth
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeRcStatusMethod(),
      implementation = ::subscribeRcStatus
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeStatusTextMethod(),
      implementation = ::subscribeStatusText
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeActuatorControlTargetMethod(),
      implementation = ::subscribeActuatorControlTarget
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeActuatorOutputStatusMethod(),
      implementation = ::subscribeActuatorOutputStatus
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeOdometryMethod(),
      implementation = ::subscribeOdometry
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribePositionVelocityNedMethod(),
      implementation = ::subscribePositionVelocityNed
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeGroundTruthMethod(),
      implementation = ::subscribeGroundTruth
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeFixedwingMetricsMethod(),
      implementation = ::subscribeFixedwingMetrics
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeImuMethod(),
      implementation = ::subscribeImu
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeScaledImuMethod(),
      implementation = ::subscribeScaledImu
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeRawImuMethod(),
      implementation = ::subscribeRawImu
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeHealthAllOkMethod(),
      implementation = ::subscribeHealthAllOk
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeUnixEpochTimeMethod(),
      implementation = ::subscribeUnixEpochTime
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeDistanceSensorMethod(),
      implementation = ::subscribeDistanceSensor
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeScaledPressureMethod(),
      implementation = ::subscribeScaledPressure
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeHeadingMethod(),
      implementation = ::subscribeHeading
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSubscribeAltitudeMethod(),
      implementation = ::subscribeAltitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRatePositionMethod(),
      implementation = ::setRatePosition
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateHomeMethod(),
      implementation = ::setRateHome
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateInAirMethod(),
      implementation = ::setRateInAir
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateLandedStateMethod(),
      implementation = ::setRateLandedState
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateVtolStateMethod(),
      implementation = ::setRateVtolState
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateAttitudeQuaternionMethod(),
      implementation = ::setRateAttitudeQuaternion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateAttitudeEulerMethod(),
      implementation = ::setRateAttitudeEuler
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateCameraAttitudeMethod(),
      implementation = ::setRateCameraAttitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateVelocityNedMethod(),
      implementation = ::setRateVelocityNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateGpsInfoMethod(),
      implementation = ::setRateGpsInfo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateBatteryMethod(),
      implementation = ::setRateBattery
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateRcStatusMethod(),
      implementation = ::setRateRcStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateActuatorControlTargetMethod(),
      implementation = ::setRateActuatorControlTarget
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateActuatorOutputStatusMethod(),
      implementation = ::setRateActuatorOutputStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateOdometryMethod(),
      implementation = ::setRateOdometry
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRatePositionVelocityNedMethod(),
      implementation = ::setRatePositionVelocityNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateGroundTruthMethod(),
      implementation = ::setRateGroundTruth
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateFixedwingMetricsMethod(),
      implementation = ::setRateFixedwingMetrics
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateImuMethod(),
      implementation = ::setRateImu
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateScaledImuMethod(),
      implementation = ::setRateScaledImu
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateRawImuMethod(),
      implementation = ::setRateRawImu
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateUnixEpochTimeMethod(),
      implementation = ::setRateUnixEpochTime
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateDistanceSensorMethod(),
      implementation = ::setRateDistanceSensor
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getSetRateAltitudeMethod(),
      implementation = ::setRateAltitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServiceGrpc.getGetGpsGlobalOriginMethod(),
      implementation = ::getGpsGlobalOrigin
    )).build()
  }
}
