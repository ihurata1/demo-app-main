package io.mavsdk.info

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
import io.mavsdk.info.InfoServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.info.InfoService.
 */
public object InfoServiceGrpcKt {
  public const val SERVICE_NAME: String = InfoServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getFlightInformationMethod:
      MethodDescriptor<InfoProto.GetFlightInformationRequest, InfoProto.GetFlightInformationResponse>
    @JvmStatic
    get() = InfoServiceGrpc.getGetFlightInformationMethod()

  public val getIdentificationMethod:
      MethodDescriptor<InfoProto.GetIdentificationRequest, InfoProto.GetIdentificationResponse>
    @JvmStatic
    get() = InfoServiceGrpc.getGetIdentificationMethod()

  public val getProductMethod:
      MethodDescriptor<InfoProto.GetProductRequest, InfoProto.GetProductResponse>
    @JvmStatic
    get() = InfoServiceGrpc.getGetProductMethod()

  public val getVersionMethod:
      MethodDescriptor<InfoProto.GetVersionRequest, InfoProto.GetVersionResponse>
    @JvmStatic
    get() = InfoServiceGrpc.getGetVersionMethod()

  public val getSpeedFactorMethod:
      MethodDescriptor<InfoProto.GetSpeedFactorRequest, InfoProto.GetSpeedFactorResponse>
    @JvmStatic
    get() = InfoServiceGrpc.getGetSpeedFactorMethod()

  public val subscribeFlightInformationMethod:
      MethodDescriptor<InfoProto.SubscribeFlightInformationRequest, InfoProto.FlightInformationResponse>
    @JvmStatic
    get() = InfoServiceGrpc.getSubscribeFlightInformationMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.info.InfoService service as suspending coroutines.
   */
  @StubFor(InfoServiceGrpc::class)
  public class InfoServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<InfoServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): InfoServiceCoroutineStub =
        InfoServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getFlightInformation(request: InfoProto.GetFlightInformationRequest,
        headers: Metadata = Metadata()): InfoProto.GetFlightInformationResponse = unaryRpc(
      channel,
      InfoServiceGrpc.getGetFlightInformationMethod(),
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
    public suspend fun getIdentification(request: InfoProto.GetIdentificationRequest,
        headers: Metadata = Metadata()): InfoProto.GetIdentificationResponse = unaryRpc(
      channel,
      InfoServiceGrpc.getGetIdentificationMethod(),
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
    public suspend fun getProduct(request: InfoProto.GetProductRequest, headers: Metadata =
        Metadata()): InfoProto.GetProductResponse = unaryRpc(
      channel,
      InfoServiceGrpc.getGetProductMethod(),
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
    public suspend fun getVersion(request: InfoProto.GetVersionRequest, headers: Metadata =
        Metadata()): InfoProto.GetVersionResponse = unaryRpc(
      channel,
      InfoServiceGrpc.getGetVersionMethod(),
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
    public suspend fun getSpeedFactor(request: InfoProto.GetSpeedFactorRequest, headers: Metadata =
        Metadata()): InfoProto.GetSpeedFactorResponse = unaryRpc(
      channel,
      InfoServiceGrpc.getGetSpeedFactorMethod(),
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
    public fun subscribeFlightInformation(request: InfoProto.SubscribeFlightInformationRequest,
        headers: Metadata = Metadata()): Flow<InfoProto.FlightInformationResponse> =
        serverStreamingRpc(
      channel,
      InfoServiceGrpc.getSubscribeFlightInformationMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.info.InfoService service based on Kotlin coroutines.
   */
  public abstract class InfoServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.info.InfoService.GetFlightInformation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getFlightInformation(request: InfoProto.GetFlightInformationRequest):
        InfoProto.GetFlightInformationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.info.InfoService.GetFlightInformation is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.info.InfoService.GetIdentification.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getIdentification(request: InfoProto.GetIdentificationRequest):
        InfoProto.GetIdentificationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.info.InfoService.GetIdentification is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.info.InfoService.GetProduct.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getProduct(request: InfoProto.GetProductRequest):
        InfoProto.GetProductResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.info.InfoService.GetProduct is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.info.InfoService.GetVersion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getVersion(request: InfoProto.GetVersionRequest):
        InfoProto.GetVersionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.info.InfoService.GetVersion is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.info.InfoService.GetSpeedFactor.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSpeedFactor(request: InfoProto.GetSpeedFactorRequest):
        InfoProto.GetSpeedFactorResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.info.InfoService.GetSpeedFactor is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.info.InfoService.SubscribeFlightInformation.
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
        fun subscribeFlightInformation(request: InfoProto.SubscribeFlightInformationRequest):
        Flow<InfoProto.FlightInformationResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.info.InfoService.SubscribeFlightInformation is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InfoServiceGrpc.getGetFlightInformationMethod(),
      implementation = ::getFlightInformation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InfoServiceGrpc.getGetIdentificationMethod(),
      implementation = ::getIdentification
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InfoServiceGrpc.getGetProductMethod(),
      implementation = ::getProduct
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InfoServiceGrpc.getGetVersionMethod(),
      implementation = ::getVersion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = InfoServiceGrpc.getGetSpeedFactorMethod(),
      implementation = ::getSpeedFactor
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = InfoServiceGrpc.getSubscribeFlightInformationMethod(),
      implementation = ::subscribeFlightInformation
    )).build()
  }
}
