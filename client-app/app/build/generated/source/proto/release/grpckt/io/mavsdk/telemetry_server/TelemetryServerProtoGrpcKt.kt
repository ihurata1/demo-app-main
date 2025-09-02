package io.mavsdk.telemetry_server

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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.mavsdk.telemetry_server.TelemetryServerServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.telemetry_server.TelemetryServerService.
 */
public object TelemetryServerServiceGrpcKt {
  public const val SERVICE_NAME: String = TelemetryServerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val publishPositionMethod:
      MethodDescriptor<TelemetryServerProto.PublishPositionRequest, TelemetryServerProto.PublishPositionResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishPositionMethod()

  public val publishHomeMethod:
      MethodDescriptor<TelemetryServerProto.PublishHomeRequest, TelemetryServerProto.PublishHomeResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishHomeMethod()

  public val publishSysStatusMethod:
      MethodDescriptor<TelemetryServerProto.PublishSysStatusRequest, TelemetryServerProto.PublishSysStatusResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishSysStatusMethod()

  public val publishExtendedSysStateMethod:
      MethodDescriptor<TelemetryServerProto.PublishExtendedSysStateRequest, TelemetryServerProto.PublishExtendedSysStateResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishExtendedSysStateMethod()

  public val publishRawGpsMethod:
      MethodDescriptor<TelemetryServerProto.PublishRawGpsRequest, TelemetryServerProto.PublishRawGpsResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishRawGpsMethod()

  public val publishBatteryMethod:
      MethodDescriptor<TelemetryServerProto.PublishBatteryRequest, TelemetryServerProto.PublishBatteryResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishBatteryMethod()

  public val publishStatusTextMethod:
      MethodDescriptor<TelemetryServerProto.PublishStatusTextRequest, TelemetryServerProto.PublishStatusTextResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishStatusTextMethod()

  public val publishOdometryMethod:
      MethodDescriptor<TelemetryServerProto.PublishOdometryRequest, TelemetryServerProto.PublishOdometryResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishOdometryMethod()

  public val publishPositionVelocityNedMethod:
      MethodDescriptor<TelemetryServerProto.PublishPositionVelocityNedRequest, TelemetryServerProto.PublishPositionVelocityNedResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishPositionVelocityNedMethod()

  public val publishGroundTruthMethod:
      MethodDescriptor<TelemetryServerProto.PublishGroundTruthRequest, TelemetryServerProto.PublishGroundTruthResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishGroundTruthMethod()

  public val publishImuMethod:
      MethodDescriptor<TelemetryServerProto.PublishImuRequest, TelemetryServerProto.PublishImuResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishImuMethod()

  public val publishScaledImuMethod:
      MethodDescriptor<TelemetryServerProto.PublishScaledImuRequest, TelemetryServerProto.PublishScaledImuResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishScaledImuMethod()

  public val publishRawImuMethod:
      MethodDescriptor<TelemetryServerProto.PublishRawImuRequest, TelemetryServerProto.PublishRawImuResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishRawImuMethod()

  public val publishUnixEpochTimeMethod:
      MethodDescriptor<TelemetryServerProto.PublishUnixEpochTimeRequest, TelemetryServerProto.PublishUnixEpochTimeResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishUnixEpochTimeMethod()

  public val publishDistanceSensorMethod:
      MethodDescriptor<TelemetryServerProto.PublishDistanceSensorRequest, TelemetryServerProto.PublishDistanceSensorResponse>
    @JvmStatic
    get() = TelemetryServerServiceGrpc.getPublishDistanceSensorMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.telemetry_server.TelemetryServerService service as
   * suspending coroutines.
   */
  @StubFor(TelemetryServerServiceGrpc::class)
  public class TelemetryServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TelemetryServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        TelemetryServerServiceCoroutineStub = TelemetryServerServiceCoroutineStub(channel,
        callOptions)

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
    public suspend fun publishPosition(request: TelemetryServerProto.PublishPositionRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishPositionResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishPositionMethod(),
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
    public suspend fun publishHome(request: TelemetryServerProto.PublishHomeRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishHomeResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishHomeMethod(),
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
    public suspend fun publishSysStatus(request: TelemetryServerProto.PublishSysStatusRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishSysStatusResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishSysStatusMethod(),
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
        fun publishExtendedSysState(request: TelemetryServerProto.PublishExtendedSysStateRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishExtendedSysStateResponse =
        unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishExtendedSysStateMethod(),
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
    public suspend fun publishRawGps(request: TelemetryServerProto.PublishRawGpsRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishRawGpsResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishRawGpsMethod(),
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
    public suspend fun publishBattery(request: TelemetryServerProto.PublishBatteryRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishBatteryResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishBatteryMethod(),
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
    public suspend fun publishStatusText(request: TelemetryServerProto.PublishStatusTextRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishStatusTextResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishStatusTextMethod(),
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
    public suspend fun publishOdometry(request: TelemetryServerProto.PublishOdometryRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishOdometryResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishOdometryMethod(),
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
        fun publishPositionVelocityNed(request: TelemetryServerProto.PublishPositionVelocityNedRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishPositionVelocityNedResponse =
        unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishPositionVelocityNedMethod(),
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
    public suspend fun publishGroundTruth(request: TelemetryServerProto.PublishGroundTruthRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishGroundTruthResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishGroundTruthMethod(),
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
    public suspend fun publishImu(request: TelemetryServerProto.PublishImuRequest, headers: Metadata
        = Metadata()): TelemetryServerProto.PublishImuResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishImuMethod(),
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
    public suspend fun publishScaledImu(request: TelemetryServerProto.PublishScaledImuRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishScaledImuResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishScaledImuMethod(),
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
    public suspend fun publishRawImu(request: TelemetryServerProto.PublishRawImuRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishRawImuResponse = unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishRawImuMethod(),
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
        fun publishUnixEpochTime(request: TelemetryServerProto.PublishUnixEpochTimeRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishUnixEpochTimeResponse =
        unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishUnixEpochTimeMethod(),
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
        fun publishDistanceSensor(request: TelemetryServerProto.PublishDistanceSensorRequest,
        headers: Metadata = Metadata()): TelemetryServerProto.PublishDistanceSensorResponse =
        unaryRpc(
      channel,
      TelemetryServerServiceGrpc.getPublishDistanceSensorMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.telemetry_server.TelemetryServerService service based
   * on Kotlin coroutines.
   */
  public abstract class TelemetryServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishPosition.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishPosition(request: TelemetryServerProto.PublishPositionRequest):
        TelemetryServerProto.PublishPositionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishPosition is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishHome.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishHome(request: TelemetryServerProto.PublishHomeRequest):
        TelemetryServerProto.PublishHomeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishHome is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishSysStatus.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishSysStatus(request: TelemetryServerProto.PublishSysStatusRequest):
        TelemetryServerProto.PublishSysStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishSysStatus is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishExtendedSysState.
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
        fun publishExtendedSysState(request: TelemetryServerProto.PublishExtendedSysStateRequest):
        TelemetryServerProto.PublishExtendedSysStateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishExtendedSysState is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishRawGps.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishRawGps(request: TelemetryServerProto.PublishRawGpsRequest):
        TelemetryServerProto.PublishRawGpsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishRawGps is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishBattery.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishBattery(request: TelemetryServerProto.PublishBatteryRequest):
        TelemetryServerProto.PublishBatteryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishBattery is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishStatusText.
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
        fun publishStatusText(request: TelemetryServerProto.PublishStatusTextRequest):
        TelemetryServerProto.PublishStatusTextResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishStatusText is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishOdometry.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishOdometry(request: TelemetryServerProto.PublishOdometryRequest):
        TelemetryServerProto.PublishOdometryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishOdometry is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishPositionVelocityNed.
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
        fun publishPositionVelocityNed(request: TelemetryServerProto.PublishPositionVelocityNedRequest):
        TelemetryServerProto.PublishPositionVelocityNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishPositionVelocityNed is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishGroundTruth.
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
        fun publishGroundTruth(request: TelemetryServerProto.PublishGroundTruthRequest):
        TelemetryServerProto.PublishGroundTruthResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishGroundTruth is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishImu.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishImu(request: TelemetryServerProto.PublishImuRequest):
        TelemetryServerProto.PublishImuResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishImu is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishScaledImu.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishScaledImu(request: TelemetryServerProto.PublishScaledImuRequest):
        TelemetryServerProto.PublishScaledImuResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishScaledImu is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishRawImu.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun publishRawImu(request: TelemetryServerProto.PublishRawImuRequest):
        TelemetryServerProto.PublishRawImuResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishRawImu is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishUnixEpochTime.
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
        fun publishUnixEpochTime(request: TelemetryServerProto.PublishUnixEpochTimeRequest):
        TelemetryServerProto.PublishUnixEpochTimeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishUnixEpochTime is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.telemetry_server.TelemetryServerService.PublishDistanceSensor.
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
        fun publishDistanceSensor(request: TelemetryServerProto.PublishDistanceSensorRequest):
        TelemetryServerProto.PublishDistanceSensorResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.telemetry_server.TelemetryServerService.PublishDistanceSensor is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishPositionMethod(),
      implementation = ::publishPosition
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishHomeMethod(),
      implementation = ::publishHome
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishSysStatusMethod(),
      implementation = ::publishSysStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishExtendedSysStateMethod(),
      implementation = ::publishExtendedSysState
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishRawGpsMethod(),
      implementation = ::publishRawGps
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishBatteryMethod(),
      implementation = ::publishBattery
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishStatusTextMethod(),
      implementation = ::publishStatusText
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishOdometryMethod(),
      implementation = ::publishOdometry
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishPositionVelocityNedMethod(),
      implementation = ::publishPositionVelocityNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishGroundTruthMethod(),
      implementation = ::publishGroundTruth
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishImuMethod(),
      implementation = ::publishImu
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishScaledImuMethod(),
      implementation = ::publishScaledImu
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishRawImuMethod(),
      implementation = ::publishRawImu
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishUnixEpochTimeMethod(),
      implementation = ::publishUnixEpochTime
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TelemetryServerServiceGrpc.getPublishDistanceSensorMethod(),
      implementation = ::publishDistanceSensor
    )).build()
  }
}
