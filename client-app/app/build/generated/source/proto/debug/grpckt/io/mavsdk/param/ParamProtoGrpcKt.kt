package io.mavsdk.`param`

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
import io.mavsdk.`param`.ParamServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.param.ParamService.
 */
public object ParamServiceGrpcKt {
  public const val SERVICE_NAME: String = ParamServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getParamIntMethod:
      MethodDescriptor<ParamProto.GetParamIntRequest, ParamProto.GetParamIntResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getGetParamIntMethod()

  public val setParamIntMethod:
      MethodDescriptor<ParamProto.SetParamIntRequest, ParamProto.SetParamIntResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getSetParamIntMethod()

  public val getParamFloatMethod:
      MethodDescriptor<ParamProto.GetParamFloatRequest, ParamProto.GetParamFloatResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getGetParamFloatMethod()

  public val setParamFloatMethod:
      MethodDescriptor<ParamProto.SetParamFloatRequest, ParamProto.SetParamFloatResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getSetParamFloatMethod()

  public val getParamCustomMethod:
      MethodDescriptor<ParamProto.GetParamCustomRequest, ParamProto.GetParamCustomResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getGetParamCustomMethod()

  public val setParamCustomMethod:
      MethodDescriptor<ParamProto.SetParamCustomRequest, ParamProto.SetParamCustomResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getSetParamCustomMethod()

  public val getAllParamsMethod:
      MethodDescriptor<ParamProto.GetAllParamsRequest, ParamProto.GetAllParamsResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getGetAllParamsMethod()

  public val selectComponentMethod:
      MethodDescriptor<ParamProto.SelectComponentRequest, ParamProto.SelectComponentResponse>
    @JvmStatic
    get() = ParamServiceGrpc.getSelectComponentMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.param.ParamService service as suspending coroutines.
   */
  @StubFor(ParamServiceGrpc::class)
  public class ParamServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ParamServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ParamServiceCoroutineStub =
        ParamServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getParamInt(request: ParamProto.GetParamIntRequest, headers: Metadata =
        Metadata()): ParamProto.GetParamIntResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getGetParamIntMethod(),
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
    public suspend fun setParamInt(request: ParamProto.SetParamIntRequest, headers: Metadata =
        Metadata()): ParamProto.SetParamIntResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getSetParamIntMethod(),
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
    public suspend fun getParamFloat(request: ParamProto.GetParamFloatRequest, headers: Metadata =
        Metadata()): ParamProto.GetParamFloatResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getGetParamFloatMethod(),
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
    public suspend fun setParamFloat(request: ParamProto.SetParamFloatRequest, headers: Metadata =
        Metadata()): ParamProto.SetParamFloatResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getSetParamFloatMethod(),
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
    public suspend fun getParamCustom(request: ParamProto.GetParamCustomRequest, headers: Metadata =
        Metadata()): ParamProto.GetParamCustomResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getGetParamCustomMethod(),
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
    public suspend fun setParamCustom(request: ParamProto.SetParamCustomRequest, headers: Metadata =
        Metadata()): ParamProto.SetParamCustomResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getSetParamCustomMethod(),
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
    public suspend fun getAllParams(request: ParamProto.GetAllParamsRequest, headers: Metadata =
        Metadata()): ParamProto.GetAllParamsResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getGetAllParamsMethod(),
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
    public suspend fun selectComponent(request: ParamProto.SelectComponentRequest, headers: Metadata
        = Metadata()): ParamProto.SelectComponentResponse = unaryRpc(
      channel,
      ParamServiceGrpc.getSelectComponentMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.param.ParamService service based on Kotlin
   * coroutines.
   */
  public abstract class ParamServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.GetParamInt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getParamInt(request: ParamProto.GetParamIntRequest):
        ParamProto.GetParamIntResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.GetParamInt is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.SetParamInt.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setParamInt(request: ParamProto.SetParamIntRequest):
        ParamProto.SetParamIntResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.SetParamInt is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.GetParamFloat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getParamFloat(request: ParamProto.GetParamFloatRequest):
        ParamProto.GetParamFloatResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.GetParamFloat is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.SetParamFloat.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setParamFloat(request: ParamProto.SetParamFloatRequest):
        ParamProto.SetParamFloatResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.SetParamFloat is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.GetParamCustom.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getParamCustom(request: ParamProto.GetParamCustomRequest):
        ParamProto.GetParamCustomResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.GetParamCustom is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.SetParamCustom.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setParamCustom(request: ParamProto.SetParamCustomRequest):
        ParamProto.SetParamCustomResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.SetParamCustom is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.GetAllParams.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getAllParams(request: ParamProto.GetAllParamsRequest):
        ParamProto.GetAllParamsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.GetAllParams is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.param.ParamService.SelectComponent.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun selectComponent(request: ParamProto.SelectComponentRequest):
        ParamProto.SelectComponentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.param.ParamService.SelectComponent is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getGetParamIntMethod(),
      implementation = ::getParamInt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getSetParamIntMethod(),
      implementation = ::setParamInt
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getGetParamFloatMethod(),
      implementation = ::getParamFloat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getSetParamFloatMethod(),
      implementation = ::setParamFloat
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getGetParamCustomMethod(),
      implementation = ::getParamCustom
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getSetParamCustomMethod(),
      implementation = ::setParamCustom
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getGetAllParamsMethod(),
      implementation = ::getAllParams
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ParamServiceGrpc.getSelectComponentMethod(),
      implementation = ::selectComponent
    )).build()
  }
}
