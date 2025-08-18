package com.serverapp.proto

import com.serverapp.proto.CommunicationServiceGrpc.getServiceDescriptor
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
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for service.CommunicationService.
 */
public object CommunicationServiceGrpcKt {
  public const val SERVICE_NAME: String = CommunicationServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val sendMessageMethod: MethodDescriptor<MessageRequest, MessageResponse>
    @JvmStatic
    get() = CommunicationServiceGrpc.getSendMessageMethod()

  public val streamMessagesMethod: MethodDescriptor<MessageRequest, MessageResponse>
    @JvmStatic
    get() = CommunicationServiceGrpc.getStreamMessagesMethod()

  /**
   * A stub for issuing RPCs to a(n) service.CommunicationService service as suspending coroutines.
   */
  @StubFor(CommunicationServiceGrpc::class)
  public class CommunicationServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CommunicationServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        CommunicationServiceCoroutineStub = CommunicationServiceCoroutineStub(channel, callOptions)

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
    public suspend fun sendMessage(request: MessageRequest, headers: Metadata = Metadata()):
        MessageResponse = unaryRpc(
      channel,
      CommunicationServiceGrpc.getSendMessageMethod(),
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
    public fun streamMessages(request: MessageRequest, headers: Metadata = Metadata()):
        Flow<MessageResponse> = serverStreamingRpc(
      channel,
      CommunicationServiceGrpc.getStreamMessagesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the service.CommunicationService service based on Kotlin coroutines.
   */
  public abstract class CommunicationServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for service.CommunicationService.SendMessage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun sendMessage(request: MessageRequest): MessageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method service.CommunicationService.SendMessage is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for service.CommunicationService.StreamMessages.
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
    public open fun streamMessages(request: MessageRequest): Flow<MessageResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method service.CommunicationService.StreamMessages is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CommunicationServiceGrpc.getSendMessageMethod(),
      implementation = ::sendMessage
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CommunicationServiceGrpc.getStreamMessagesMethod(),
      implementation = ::streamMessages
    )).build()
  }
}
