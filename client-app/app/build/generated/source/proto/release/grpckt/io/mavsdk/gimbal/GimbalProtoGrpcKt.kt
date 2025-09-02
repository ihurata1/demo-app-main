package io.mavsdk.gimbal

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
import io.mavsdk.gimbal.GimbalServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.gimbal.GimbalService.
 */
public object GimbalServiceGrpcKt {
  public const val SERVICE_NAME: String = GimbalServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val setAnglesMethod:
      MethodDescriptor<GimbalProto.SetAnglesRequest, GimbalProto.SetAnglesResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSetAnglesMethod()

  public val setPitchAndYawMethod:
      MethodDescriptor<GimbalProto.SetPitchAndYawRequest, GimbalProto.SetPitchAndYawResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSetPitchAndYawMethod()

  public val setPitchRateAndYawRateMethod:
      MethodDescriptor<GimbalProto.SetPitchRateAndYawRateRequest, GimbalProto.SetPitchRateAndYawRateResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSetPitchRateAndYawRateMethod()

  public val setModeMethod:
      MethodDescriptor<GimbalProto.SetModeRequest, GimbalProto.SetModeResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSetModeMethod()

  public val setRoiLocationMethod:
      MethodDescriptor<GimbalProto.SetRoiLocationRequest, GimbalProto.SetRoiLocationResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSetRoiLocationMethod()

  public val takeControlMethod:
      MethodDescriptor<GimbalProto.TakeControlRequest, GimbalProto.TakeControlResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getTakeControlMethod()

  public val releaseControlMethod:
      MethodDescriptor<GimbalProto.ReleaseControlRequest, GimbalProto.ReleaseControlResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getReleaseControlMethod()

  public val subscribeControlMethod:
      MethodDescriptor<GimbalProto.SubscribeControlRequest, GimbalProto.ControlResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSubscribeControlMethod()

  public val subscribeAttitudeMethod:
      MethodDescriptor<GimbalProto.SubscribeAttitudeRequest, GimbalProto.AttitudeResponse>
    @JvmStatic
    get() = GimbalServiceGrpc.getSubscribeAttitudeMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.gimbal.GimbalService service as suspending
   * coroutines.
   */
  @StubFor(GimbalServiceGrpc::class)
  public class GimbalServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GimbalServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GimbalServiceCoroutineStub =
        GimbalServiceCoroutineStub(channel, callOptions)

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
    public suspend fun setAngles(request: GimbalProto.SetAnglesRequest, headers: Metadata =
        Metadata()): GimbalProto.SetAnglesResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getSetAnglesMethod(),
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
    public suspend fun setPitchAndYaw(request: GimbalProto.SetPitchAndYawRequest, headers: Metadata
        = Metadata()): GimbalProto.SetPitchAndYawResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getSetPitchAndYawMethod(),
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
    public suspend fun setPitchRateAndYawRate(request: GimbalProto.SetPitchRateAndYawRateRequest,
        headers: Metadata = Metadata()): GimbalProto.SetPitchRateAndYawRateResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getSetPitchRateAndYawRateMethod(),
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
    public suspend fun setMode(request: GimbalProto.SetModeRequest, headers: Metadata = Metadata()):
        GimbalProto.SetModeResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getSetModeMethod(),
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
    public suspend fun setRoiLocation(request: GimbalProto.SetRoiLocationRequest, headers: Metadata
        = Metadata()): GimbalProto.SetRoiLocationResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getSetRoiLocationMethod(),
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
    public suspend fun takeControl(request: GimbalProto.TakeControlRequest, headers: Metadata =
        Metadata()): GimbalProto.TakeControlResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getTakeControlMethod(),
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
    public suspend fun releaseControl(request: GimbalProto.ReleaseControlRequest, headers: Metadata
        = Metadata()): GimbalProto.ReleaseControlResponse = unaryRpc(
      channel,
      GimbalServiceGrpc.getReleaseControlMethod(),
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
    public fun subscribeControl(request: GimbalProto.SubscribeControlRequest, headers: Metadata =
        Metadata()): Flow<GimbalProto.ControlResponse> = serverStreamingRpc(
      channel,
      GimbalServiceGrpc.getSubscribeControlMethod(),
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
    public fun subscribeAttitude(request: GimbalProto.SubscribeAttitudeRequest, headers: Metadata =
        Metadata()): Flow<GimbalProto.AttitudeResponse> = serverStreamingRpc(
      channel,
      GimbalServiceGrpc.getSubscribeAttitudeMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.gimbal.GimbalService service based on Kotlin
   * coroutines.
   */
  public abstract class GimbalServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.SetAngles.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setAngles(request: GimbalProto.SetAnglesRequest):
        GimbalProto.SetAnglesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SetAngles is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.SetPitchAndYaw.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setPitchAndYaw(request: GimbalProto.SetPitchAndYawRequest):
        GimbalProto.SetPitchAndYawResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SetPitchAndYaw is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.SetPitchRateAndYawRate.
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
        fun setPitchRateAndYawRate(request: GimbalProto.SetPitchRateAndYawRateRequest):
        GimbalProto.SetPitchRateAndYawRateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SetPitchRateAndYawRate is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.SetMode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setMode(request: GimbalProto.SetModeRequest):
        GimbalProto.SetModeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SetMode is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.SetRoiLocation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRoiLocation(request: GimbalProto.SetRoiLocationRequest):
        GimbalProto.SetRoiLocationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SetRoiLocation is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.TakeControl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun takeControl(request: GimbalProto.TakeControlRequest):
        GimbalProto.TakeControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.TakeControl is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gimbal.GimbalService.ReleaseControl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun releaseControl(request: GimbalProto.ReleaseControlRequest):
        GimbalProto.ReleaseControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.ReleaseControl is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.gimbal.GimbalService.SubscribeControl.
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
    public open fun subscribeControl(request: GimbalProto.SubscribeControlRequest):
        Flow<GimbalProto.ControlResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SubscribeControl is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.gimbal.GimbalService.SubscribeAttitude.
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
    public open fun subscribeAttitude(request: GimbalProto.SubscribeAttitudeRequest):
        Flow<GimbalProto.AttitudeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gimbal.GimbalService.SubscribeAttitude is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSetAnglesMethod(),
      implementation = ::setAngles
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSetPitchAndYawMethod(),
      implementation = ::setPitchAndYaw
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSetPitchRateAndYawRateMethod(),
      implementation = ::setPitchRateAndYawRate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSetModeMethod(),
      implementation = ::setMode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSetRoiLocationMethod(),
      implementation = ::setRoiLocation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getTakeControlMethod(),
      implementation = ::takeControl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getReleaseControlMethod(),
      implementation = ::releaseControl
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSubscribeControlMethod(),
      implementation = ::subscribeControl
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = GimbalServiceGrpc.getSubscribeAttitudeMethod(),
      implementation = ::subscribeAttitude
    )).build()
  }
}
