package io.mavsdk.follow_me

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
import io.mavsdk.follow_me.FollowMeServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.follow_me.FollowMeService.
 */
public object FollowMeServiceGrpcKt {
  public const val SERVICE_NAME: String = FollowMeServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getConfigMethod:
      MethodDescriptor<FollowMeProto.GetConfigRequest, FollowMeProto.GetConfigResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getGetConfigMethod()

  public val setConfigMethod:
      MethodDescriptor<FollowMeProto.SetConfigRequest, FollowMeProto.SetConfigResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getSetConfigMethod()

  public val isActiveMethod:
      MethodDescriptor<FollowMeProto.IsActiveRequest, FollowMeProto.IsActiveResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getIsActiveMethod()

  public val setTargetLocationMethod:
      MethodDescriptor<FollowMeProto.SetTargetLocationRequest, FollowMeProto.SetTargetLocationResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getSetTargetLocationMethod()

  public val getLastLocationMethod:
      MethodDescriptor<FollowMeProto.GetLastLocationRequest, FollowMeProto.GetLastLocationResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getGetLastLocationMethod()

  public val startMethod: MethodDescriptor<FollowMeProto.StartRequest, FollowMeProto.StartResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getStartMethod()

  public val stopMethod: MethodDescriptor<FollowMeProto.StopRequest, FollowMeProto.StopResponse>
    @JvmStatic
    get() = FollowMeServiceGrpc.getStopMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.follow_me.FollowMeService service as suspending
   * coroutines.
   */
  @StubFor(FollowMeServiceGrpc::class)
  public class FollowMeServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FollowMeServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FollowMeServiceCoroutineStub =
        FollowMeServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getConfig(request: FollowMeProto.GetConfigRequest, headers: Metadata =
        Metadata()): FollowMeProto.GetConfigResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getGetConfigMethod(),
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
    public suspend fun setConfig(request: FollowMeProto.SetConfigRequest, headers: Metadata =
        Metadata()): FollowMeProto.SetConfigResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getSetConfigMethod(),
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
    public suspend fun isActive(request: FollowMeProto.IsActiveRequest, headers: Metadata =
        Metadata()): FollowMeProto.IsActiveResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getIsActiveMethod(),
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
    public suspend fun setTargetLocation(request: FollowMeProto.SetTargetLocationRequest,
        headers: Metadata = Metadata()): FollowMeProto.SetTargetLocationResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getSetTargetLocationMethod(),
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
    public suspend fun getLastLocation(request: FollowMeProto.GetLastLocationRequest,
        headers: Metadata = Metadata()): FollowMeProto.GetLastLocationResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getGetLastLocationMethod(),
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
    public suspend fun start(request: FollowMeProto.StartRequest, headers: Metadata = Metadata()):
        FollowMeProto.StartResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getStartMethod(),
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
    public suspend fun stop(request: FollowMeProto.StopRequest, headers: Metadata = Metadata()):
        FollowMeProto.StopResponse = unaryRpc(
      channel,
      FollowMeServiceGrpc.getStopMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.follow_me.FollowMeService service based on Kotlin
   * coroutines.
   */
  public abstract class FollowMeServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.GetConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getConfig(request: FollowMeProto.GetConfigRequest):
        FollowMeProto.GetConfigResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.GetConfig is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.SetConfig.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setConfig(request: FollowMeProto.SetConfigRequest):
        FollowMeProto.SetConfigResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.SetConfig is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.IsActive.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isActive(request: FollowMeProto.IsActiveRequest):
        FollowMeProto.IsActiveResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.IsActive is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.SetTargetLocation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setTargetLocation(request: FollowMeProto.SetTargetLocationRequest):
        FollowMeProto.SetTargetLocationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.SetTargetLocation is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.GetLastLocation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getLastLocation(request: FollowMeProto.GetLastLocationRequest):
        FollowMeProto.GetLastLocationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.GetLastLocation is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.Start.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun start(request: FollowMeProto.StartRequest): FollowMeProto.StartResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.Start is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.follow_me.FollowMeService.Stop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stop(request: FollowMeProto.StopRequest): FollowMeProto.StopResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.follow_me.FollowMeService.Stop is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getGetConfigMethod(),
      implementation = ::getConfig
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getSetConfigMethod(),
      implementation = ::setConfig
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getIsActiveMethod(),
      implementation = ::isActive
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getSetTargetLocationMethod(),
      implementation = ::setTargetLocation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getGetLastLocationMethod(),
      implementation = ::getLastLocation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getStartMethod(),
      implementation = ::start
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FollowMeServiceGrpc.getStopMethod(),
      implementation = ::stop
    )).build()
  }
}
