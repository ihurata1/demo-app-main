package io.mavsdk.component_metadata

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
import io.mavsdk.component_metadata.ComponentMetadataServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.component_metadata.ComponentMetadataService.
 */
public object ComponentMetadataServiceGrpcKt {
  public const val SERVICE_NAME: String = ComponentMetadataServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val requestComponentMethod:
      MethodDescriptor<ComponentMetadataProto.RequestComponentRequest, ComponentMetadataProto.RequestComponentResponse>
    @JvmStatic
    get() = ComponentMetadataServiceGrpc.getRequestComponentMethod()

  public val requestAutopilotComponentMethod:
      MethodDescriptor<ComponentMetadataProto.RequestAutopilotComponentRequest, ComponentMetadataProto.RequestAutopilotComponentResponse>
    @JvmStatic
    get() = ComponentMetadataServiceGrpc.getRequestAutopilotComponentMethod()

  public val subscribeMetadataAvailableMethod:
      MethodDescriptor<ComponentMetadataProto.SubscribeMetadataAvailableRequest, ComponentMetadataProto.MetadataAvailableResponse>
    @JvmStatic
    get() = ComponentMetadataServiceGrpc.getSubscribeMetadataAvailableMethod()

  public val getMetadataMethod:
      MethodDescriptor<ComponentMetadataProto.GetMetadataRequest, ComponentMetadataProto.GetMetadataResponse>
    @JvmStatic
    get() = ComponentMetadataServiceGrpc.getGetMetadataMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.component_metadata.ComponentMetadataService service
   * as suspending coroutines.
   */
  @StubFor(ComponentMetadataServiceGrpc::class)
  public class ComponentMetadataServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ComponentMetadataServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ComponentMetadataServiceCoroutineStub = ComponentMetadataServiceCoroutineStub(channel,
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
    public suspend fun requestComponent(request: ComponentMetadataProto.RequestComponentRequest,
        headers: Metadata = Metadata()): ComponentMetadataProto.RequestComponentResponse = unaryRpc(
      channel,
      ComponentMetadataServiceGrpc.getRequestComponentMethod(),
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
        fun requestAutopilotComponent(request: ComponentMetadataProto.RequestAutopilotComponentRequest,
        headers: Metadata = Metadata()): ComponentMetadataProto.RequestAutopilotComponentResponse =
        unaryRpc(
      channel,
      ComponentMetadataServiceGrpc.getRequestAutopilotComponentMethod(),
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
        fun subscribeMetadataAvailable(request: ComponentMetadataProto.SubscribeMetadataAvailableRequest,
        headers: Metadata = Metadata()): Flow<ComponentMetadataProto.MetadataAvailableResponse> =
        serverStreamingRpc(
      channel,
      ComponentMetadataServiceGrpc.getSubscribeMetadataAvailableMethod(),
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
    public suspend fun getMetadata(request: ComponentMetadataProto.GetMetadataRequest,
        headers: Metadata = Metadata()): ComponentMetadataProto.GetMetadataResponse = unaryRpc(
      channel,
      ComponentMetadataServiceGrpc.getGetMetadataMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.component_metadata.ComponentMetadataService service
   * based on Kotlin coroutines.
   */
  public abstract class ComponentMetadataServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.component_metadata.ComponentMetadataService.RequestComponent.
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
        fun requestComponent(request: ComponentMetadataProto.RequestComponentRequest):
        ComponentMetadataProto.RequestComponentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.component_metadata.ComponentMetadataService.RequestComponent is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.component_metadata.ComponentMetadataService.RequestAutopilotComponent.
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
        fun requestAutopilotComponent(request: ComponentMetadataProto.RequestAutopilotComponentRequest):
        ComponentMetadataProto.RequestAutopilotComponentResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.component_metadata.ComponentMetadataService.RequestAutopilotComponent is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.component_metadata.ComponentMetadataService.SubscribeMetadataAvailable.
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
        fun subscribeMetadataAvailable(request: ComponentMetadataProto.SubscribeMetadataAvailableRequest):
        Flow<ComponentMetadataProto.MetadataAvailableResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.component_metadata.ComponentMetadataService.SubscribeMetadataAvailable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.component_metadata.ComponentMetadataService.GetMetadata.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMetadata(request: ComponentMetadataProto.GetMetadataRequest):
        ComponentMetadataProto.GetMetadataResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.component_metadata.ComponentMetadataService.GetMetadata is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComponentMetadataServiceGrpc.getRequestComponentMethod(),
      implementation = ::requestComponent
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComponentMetadataServiceGrpc.getRequestAutopilotComponentMethod(),
      implementation = ::requestAutopilotComponent
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ComponentMetadataServiceGrpc.getSubscribeMetadataAvailableMethod(),
      implementation = ::subscribeMetadataAvailable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ComponentMetadataServiceGrpc.getGetMetadataMethod(),
      implementation = ::getMetadata
    )).build()
  }
}
