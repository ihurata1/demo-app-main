package io.mavsdk.param_server

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
import io.mavsdk.param_server.ParamServerServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.param_server.ParamServerService.
 */
public object ParamServerServiceGrpcKt {
  public const val SERVICE_NAME: String = ParamServerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val retrieveParamIntMethod:
      MethodDescriptor<ParamServerProto.RetrieveParamIntRequest, ParamServerProto.RetrieveParamIntResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getRetrieveParamIntMethod()

  public val provideParamIntMethod:
      MethodDescriptor<ParamServerProto.ProvideParamIntRequest, ParamServerProto.ProvideParamIntResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getProvideParamIntMethod()

  public val retrieveParamFloatMethod:
      MethodDescriptor<ParamServerProto.RetrieveParamFloatRequest, ParamServerProto.RetrieveParamFloatResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getRetrieveParamFloatMethod()

  public val provideParamFloatMethod:
      MethodDescriptor<ParamServerProto.ProvideParamFloatRequest, ParamServerProto.ProvideParamFloatResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getProvideParamFloatMethod()

  public val retrieveParamCustomMethod:
      MethodDescriptor<ParamServerProto.RetrieveParamCustomRequest, ParamServerProto.RetrieveParamCustomResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getRetrieveParamCustomMethod()

  public val provideParamCustomMethod:
      MethodDescriptor<ParamServerProto.ProvideParamCustomRequest, ParamServerProto.ProvideParamCustomResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getProvideParamCustomMethod()

  public val retrieveAllParamsMethod:
      MethodDescriptor<ParamServerProto.RetrieveAllParamsRequest, ParamServerProto.RetrieveAllParamsResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getRetrieveAllParamsMethod()

  public val subscribeChangedParamIntMethod:
      MethodDescriptor<ParamServerProto.SubscribeChangedParamIntRequest, ParamServerProto.ChangedParamIntResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getSubscribeChangedParamIntMethod()

  public val subscribeChangedParamFloatMethod:
      MethodDescriptor<ParamServerProto.SubscribeChangedParamFloatRequest, ParamServerProto.ChangedParamFloatResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getSubscribeChangedParamFloatMethod()

  public val subscribeChangedParamCustomMethod:
      MethodDescriptor<ParamServerProto.SubscribeChangedParamCustomRequest, ParamServerProto.ChangedParamCustomResponse>
    @JvmStatic
    get() = ParamServerServiceGrpc.getSubscribeChangedParamCustomMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.param_server.ParamServerService service as
   * suspending coroutines.
   */
  @StubFor(ParamServerServiceGrpc::class)
  public class ParamServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ParamServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ParamServerServiceCoroutineStub
        = ParamServerServiceCoroutineStub(channel, callOptions)

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
    public suspend fun retrieveParamInt(request: ParamServerProto.RetrieveParamIntRequest,
        headers: Metadata = Metadata()): ParamServerProto.RetrieveParamIntResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getRetrieveParamIntMethod(),
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
    public suspend fun provideParamInt(request: ParamServerProto.ProvideParamIntRequest,
        headers: Metadata = Metadata()): ParamServerProto.ProvideParamIntResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getProvideParamIntMethod(),
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
    public suspend fun retrieveParamFloat(request: ParamServerProto.RetrieveParamFloatRequest,
        headers: Metadata = Metadata()): ParamServerProto.RetrieveParamFloatResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getRetrieveParamFloatMethod(),
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
    public suspend fun provideParamFloat(request: ParamServerProto.ProvideParamFloatRequest,
        headers: Metadata = Metadata()): ParamServerProto.ProvideParamFloatResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getProvideParamFloatMethod(),
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
    public suspend fun retrieveParamCustom(request: ParamServerProto.RetrieveParamCustomRequest,
        headers: Metadata = Metadata()): ParamServerProto.RetrieveParamCustomResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getRetrieveParamCustomMethod(),
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
    public suspend fun provideParamCustom(request: ParamServerProto.ProvideParamCustomRequest,
        headers: Metadata = Metadata()): ParamServerProto.ProvideParamCustomResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getProvideParamCustomMethod(),
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
    public suspend fun retrieveAllParams(request: ParamServerProto.RetrieveAllParamsRequest,
        headers: Metadata = Metadata()): ParamServerProto.RetrieveAllParamsResponse = unaryRpc(
      channel,
      ParamServerServiceGrpc.getRetrieveAllParamsMethod(),
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
    public fun subscribeChangedParamInt(request: ParamServerProto.SubscribeChangedParamIntRequest,
        headers: Metadata = Metadata()): Flow<ParamServerProto.ChangedParamIntResponse> =
        serverStreamingRpc(
      channel,
      ParamServerServiceGrpc.getSubscribeChangedParamIntMethod(),
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
        fun subscribeChangedParamFloat(request: ParamServerProto.SubscribeChangedParamFloatRequest,
        headers: Metadata = Metadata()): Flow<ParamServerProto.ChangedParamFloatResponse> =
        serverStreamingRpc(
      channel,
      ParamServerServiceGrpc.getSubscribeChangedParamFloatMethod(),
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
        fun subscribeChangedParamCustom(request: ParamServerProto.SubscribeChangedParamCustomRequest,
        headers: Metadata = Metadata()): Flow<ParamServerProto.ChangedParamCustomResponse> =
        serverStreamingRpc(
      channel,
      ParamServerServiceGrpc.getSubscribeChangedParamCustomMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.param_server.ParamServerService service based on
   * Kotlin coroutines.
   */
  public abstract class ParamServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.RetrieveParamInt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun retrieveParamInt(request: ParamServerProto.RetrieveParamIntRequest):
        ParamServerProto.RetrieveParamIntResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.RetrieveParamInt is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.ProvideParamInt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provideParamInt(request: ParamServerProto.ProvideParamIntRequest):
        ParamServerProto.ProvideParamIntResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.ProvideParamInt is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.RetrieveParamFloat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun retrieveParamFloat(request: ParamServerProto.RetrieveParamFloatRequest):
        ParamServerProto.RetrieveParamFloatResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.RetrieveParamFloat is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.ProvideParamFloat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provideParamFloat(request: ParamServerProto.ProvideParamFloatRequest):
        ParamServerProto.ProvideParamFloatResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.ProvideParamFloat is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.RetrieveParamCustom.
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
        fun retrieveParamCustom(request: ParamServerProto.RetrieveParamCustomRequest):
        ParamServerProto.RetrieveParamCustomResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.RetrieveParamCustom is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.ProvideParamCustom.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun provideParamCustom(request: ParamServerProto.ProvideParamCustomRequest):
        ParamServerProto.ProvideParamCustomResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.ProvideParamCustom is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.RetrieveAllParams.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun retrieveAllParams(request: ParamServerProto.RetrieveAllParamsRequest):
        ParamServerProto.RetrieveAllParamsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.RetrieveAllParams is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.SubscribeChangedParamInt.
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
        fun subscribeChangedParamInt(request: ParamServerProto.SubscribeChangedParamIntRequest):
        Flow<ParamServerProto.ChangedParamIntResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.SubscribeChangedParamInt is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.SubscribeChangedParamFloat.
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
        fun subscribeChangedParamFloat(request: ParamServerProto.SubscribeChangedParamFloatRequest):
        Flow<ParamServerProto.ChangedParamFloatResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.SubscribeChangedParamFloat is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.param_server.ParamServerService.SubscribeChangedParamCustom.
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
        fun subscribeChangedParamCustom(request: ParamServerProto.SubscribeChangedParamCustomRequest):
        Flow<ParamServerProto.ChangedParamCustomResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param_server.ParamServerService.SubscribeChangedParamCustom is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getRetrieveParamIntMethod(),
      implementation = ::retrieveParamInt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getProvideParamIntMethod(),
      implementation = ::provideParamInt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getRetrieveParamFloatMethod(),
      implementation = ::retrieveParamFloat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getProvideParamFloatMethod(),
      implementation = ::provideParamFloat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getRetrieveParamCustomMethod(),
      implementation = ::retrieveParamCustom
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getProvideParamCustomMethod(),
      implementation = ::provideParamCustom
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getRetrieveAllParamsMethod(),
      implementation = ::retrieveAllParams
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getSubscribeChangedParamIntMethod(),
      implementation = ::subscribeChangedParamInt
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getSubscribeChangedParamFloatMethod(),
      implementation = ::subscribeChangedParamFloat
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ParamServerServiceGrpc.getSubscribeChangedParamCustomMethod(),
      implementation = ::subscribeChangedParamCustom
    )).build()
  }
}
