package io.mavsdk.offboard

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
import io.mavsdk.offboard.OffboardServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.offboard.OffboardService.
 */
public object OffboardServiceGrpcKt {
  public const val SERVICE_NAME: String = OffboardServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val startMethod: MethodDescriptor<OffboardProto.StartRequest, OffboardProto.StartResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getStartMethod()

  public val stopMethod: MethodDescriptor<OffboardProto.StopRequest, OffboardProto.StopResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getStopMethod()

  public val isActiveMethod:
      MethodDescriptor<OffboardProto.IsActiveRequest, OffboardProto.IsActiveResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getIsActiveMethod()

  public val setAttitudeMethod:
      MethodDescriptor<OffboardProto.SetAttitudeRequest, OffboardProto.SetAttitudeResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetAttitudeMethod()

  public val setActuatorControlMethod:
      MethodDescriptor<OffboardProto.SetActuatorControlRequest, OffboardProto.SetActuatorControlResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetActuatorControlMethod()

  public val setAttitudeRateMethod:
      MethodDescriptor<OffboardProto.SetAttitudeRateRequest, OffboardProto.SetAttitudeRateResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetAttitudeRateMethod()

  public val setPositionNedMethod:
      MethodDescriptor<OffboardProto.SetPositionNedRequest, OffboardProto.SetPositionNedResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetPositionNedMethod()

  public val setPositionGlobalMethod:
      MethodDescriptor<OffboardProto.SetPositionGlobalRequest, OffboardProto.SetPositionGlobalResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetPositionGlobalMethod()

  public val setVelocityBodyMethod:
      MethodDescriptor<OffboardProto.SetVelocityBodyRequest, OffboardProto.SetVelocityBodyResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetVelocityBodyMethod()

  public val setVelocityNedMethod:
      MethodDescriptor<OffboardProto.SetVelocityNedRequest, OffboardProto.SetVelocityNedResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetVelocityNedMethod()

  public val setPositionVelocityNedMethod:
      MethodDescriptor<OffboardProto.SetPositionVelocityNedRequest, OffboardProto.SetPositionVelocityNedResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetPositionVelocityNedMethod()

  public val setPositionVelocityAccelerationNedMethod:
      MethodDescriptor<OffboardProto.SetPositionVelocityAccelerationNedRequest, OffboardProto.SetPositionVelocityAccelerationNedResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetPositionVelocityAccelerationNedMethod()

  public val setAccelerationNedMethod:
      MethodDescriptor<OffboardProto.SetAccelerationNedRequest, OffboardProto.SetAccelerationNedResponse>
    @JvmStatic
    get() = OffboardServiceGrpc.getSetAccelerationNedMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.offboard.OffboardService service as suspending
   * coroutines.
   */
  @StubFor(OffboardServiceGrpc::class)
  public class OffboardServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<OffboardServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): OffboardServiceCoroutineStub =
        OffboardServiceCoroutineStub(channel, callOptions)

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
    public suspend fun start(request: OffboardProto.StartRequest, headers: Metadata = Metadata()):
        OffboardProto.StartResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getStartMethod(),
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
    public suspend fun stop(request: OffboardProto.StopRequest, headers: Metadata = Metadata()):
        OffboardProto.StopResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getStopMethod(),
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
    public suspend fun isActive(request: OffboardProto.IsActiveRequest, headers: Metadata =
        Metadata()): OffboardProto.IsActiveResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getIsActiveMethod(),
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
    public suspend fun setAttitude(request: OffboardProto.SetAttitudeRequest, headers: Metadata =
        Metadata()): OffboardProto.SetAttitudeResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetAttitudeMethod(),
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
    public suspend fun setActuatorControl(request: OffboardProto.SetActuatorControlRequest,
        headers: Metadata = Metadata()): OffboardProto.SetActuatorControlResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetActuatorControlMethod(),
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
    public suspend fun setAttitudeRate(request: OffboardProto.SetAttitudeRateRequest,
        headers: Metadata = Metadata()): OffboardProto.SetAttitudeRateResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetAttitudeRateMethod(),
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
    public suspend fun setPositionNed(request: OffboardProto.SetPositionNedRequest,
        headers: Metadata = Metadata()): OffboardProto.SetPositionNedResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetPositionNedMethod(),
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
    public suspend fun setPositionGlobal(request: OffboardProto.SetPositionGlobalRequest,
        headers: Metadata = Metadata()): OffboardProto.SetPositionGlobalResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetPositionGlobalMethod(),
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
    public suspend fun setVelocityBody(request: OffboardProto.SetVelocityBodyRequest,
        headers: Metadata = Metadata()): OffboardProto.SetVelocityBodyResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetVelocityBodyMethod(),
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
    public suspend fun setVelocityNed(request: OffboardProto.SetVelocityNedRequest,
        headers: Metadata = Metadata()): OffboardProto.SetVelocityNedResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetVelocityNedMethod(),
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
    public suspend fun setPositionVelocityNed(request: OffboardProto.SetPositionVelocityNedRequest,
        headers: Metadata = Metadata()): OffboardProto.SetPositionVelocityNedResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetPositionVelocityNedMethod(),
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
        fun setPositionVelocityAccelerationNed(request: OffboardProto.SetPositionVelocityAccelerationNedRequest,
        headers: Metadata = Metadata()): OffboardProto.SetPositionVelocityAccelerationNedResponse =
        unaryRpc(
      channel,
      OffboardServiceGrpc.getSetPositionVelocityAccelerationNedMethod(),
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
    public suspend fun setAccelerationNed(request: OffboardProto.SetAccelerationNedRequest,
        headers: Metadata = Metadata()): OffboardProto.SetAccelerationNedResponse = unaryRpc(
      channel,
      OffboardServiceGrpc.getSetAccelerationNedMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.offboard.OffboardService service based on Kotlin
   * coroutines.
   */
  public abstract class OffboardServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.Start.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun start(request: OffboardProto.StartRequest): OffboardProto.StartResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.Start is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.Stop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stop(request: OffboardProto.StopRequest): OffboardProto.StopResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.Stop is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.IsActive.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isActive(request: OffboardProto.IsActiveRequest):
        OffboardProto.IsActiveResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.IsActive is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetAttitude.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setAttitude(request: OffboardProto.SetAttitudeRequest):
        OffboardProto.SetAttitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetAttitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetActuatorControl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setActuatorControl(request: OffboardProto.SetActuatorControlRequest):
        OffboardProto.SetActuatorControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetActuatorControl is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetAttitudeRate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setAttitudeRate(request: OffboardProto.SetAttitudeRateRequest):
        OffboardProto.SetAttitudeRateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetAttitudeRate is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetPositionNed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setPositionNed(request: OffboardProto.SetPositionNedRequest):
        OffboardProto.SetPositionNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetPositionNed is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetPositionGlobal.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setPositionGlobal(request: OffboardProto.SetPositionGlobalRequest):
        OffboardProto.SetPositionGlobalResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetPositionGlobal is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetVelocityBody.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setVelocityBody(request: OffboardProto.SetVelocityBodyRequest):
        OffboardProto.SetVelocityBodyResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetVelocityBody is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetVelocityNed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setVelocityNed(request: OffboardProto.SetVelocityNedRequest):
        OffboardProto.SetVelocityNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetVelocityNed is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.offboard.OffboardService.SetPositionVelocityNed.
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
        fun setPositionVelocityNed(request: OffboardProto.SetPositionVelocityNedRequest):
        OffboardProto.SetPositionVelocityNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetPositionVelocityNed is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.offboard.OffboardService.SetPositionVelocityAccelerationNed.
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
        fun setPositionVelocityAccelerationNed(request: OffboardProto.SetPositionVelocityAccelerationNedRequest):
        OffboardProto.SetPositionVelocityAccelerationNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetPositionVelocityAccelerationNed is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.offboard.OffboardService.SetAccelerationNed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setAccelerationNed(request: OffboardProto.SetAccelerationNedRequest):
        OffboardProto.SetAccelerationNedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.offboard.OffboardService.SetAccelerationNed is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getStartMethod(),
      implementation = ::start
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getStopMethod(),
      implementation = ::stop
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getIsActiveMethod(),
      implementation = ::isActive
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetAttitudeMethod(),
      implementation = ::setAttitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetActuatorControlMethod(),
      implementation = ::setActuatorControl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetAttitudeRateMethod(),
      implementation = ::setAttitudeRate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetPositionNedMethod(),
      implementation = ::setPositionNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetPositionGlobalMethod(),
      implementation = ::setPositionGlobal
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetVelocityBodyMethod(),
      implementation = ::setVelocityBody
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetVelocityNedMethod(),
      implementation = ::setVelocityNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetPositionVelocityNedMethod(),
      implementation = ::setPositionVelocityNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetPositionVelocityAccelerationNedMethod(),
      implementation = ::setPositionVelocityAccelerationNed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = OffboardServiceGrpc.getSetAccelerationNedMethod(),
      implementation = ::setAccelerationNed
    )).build()
  }
}
