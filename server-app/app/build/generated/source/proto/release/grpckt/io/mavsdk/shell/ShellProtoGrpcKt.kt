package io.mavsdk.shell

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
import io.mavsdk.shell.ShellServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.shell.ShellService.
 */
public object ShellServiceGrpcKt {
  public const val SERVICE_NAME: String = ShellServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val sendMethod: MethodDescriptor<ShellProto.SendRequest, ShellProto.SendResponse>
    @JvmStatic
    get() = ShellServiceGrpc.getSendMethod()

  public val subscribeReceiveMethod:
      MethodDescriptor<ShellProto.SubscribeReceiveRequest, ShellProto.ReceiveResponse>
    @JvmStatic
    get() = ShellServiceGrpc.getSubscribeReceiveMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.shell.ShellService service as suspending coroutines.
   */
  @StubFor(ShellServiceGrpc::class)
  public class ShellServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ShellServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ShellServiceCoroutineStub =
        ShellServiceCoroutineStub(channel, callOptions)

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
    public suspend fun send(request: ShellProto.SendRequest, headers: Metadata = Metadata()):
        ShellProto.SendResponse = unaryRpc(
      channel,
      ShellServiceGrpc.getSendMethod(),
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
    public fun subscribeReceive(request: ShellProto.SubscribeReceiveRequest, headers: Metadata =
        Metadata()): Flow<ShellProto.ReceiveResponse> = serverStreamingRpc(
      channel,
      ShellServiceGrpc.getSubscribeReceiveMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.shell.ShellService service based on Kotlin
   * coroutines.
   */
  public abstract class ShellServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.shell.ShellService.Send.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun send(request: ShellProto.SendRequest): ShellProto.SendResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.shell.ShellService.Send is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.shell.ShellService.SubscribeReceive.
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
    public open fun subscribeReceive(request: ShellProto.SubscribeReceiveRequest):
        Flow<ShellProto.ReceiveResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.shell.ShellService.SubscribeReceive is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ShellServiceGrpc.getSendMethod(),
      implementation = ::send
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ShellServiceGrpc.getSubscribeReceiveMethod(),
      implementation = ::subscribeReceive
    )).build()
  }
}
