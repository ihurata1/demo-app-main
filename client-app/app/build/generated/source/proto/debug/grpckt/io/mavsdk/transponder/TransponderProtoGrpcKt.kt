package io.mavsdk.transponder

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
import io.mavsdk.transponder.TransponderServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.transponder.TransponderService.
 */
public object TransponderServiceGrpcKt {
  public const val SERVICE_NAME: String = TransponderServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeTransponderMethod:
      MethodDescriptor<TransponderProto.SubscribeTransponderRequest, TransponderProto.TransponderResponse>
    @JvmStatic
    get() = TransponderServiceGrpc.getSubscribeTransponderMethod()

  public val setRateTransponderMethod:
      MethodDescriptor<TransponderProto.SetRateTransponderRequest, TransponderProto.SetRateTransponderResponse>
    @JvmStatic
    get() = TransponderServiceGrpc.getSetRateTransponderMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.transponder.TransponderService service as suspending
   * coroutines.
   */
  @StubFor(TransponderServiceGrpc::class)
  public class TransponderServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TransponderServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TransponderServiceCoroutineStub
        = TransponderServiceCoroutineStub(channel, callOptions)

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
    public fun subscribeTransponder(request: TransponderProto.SubscribeTransponderRequest,
        headers: Metadata = Metadata()): Flow<TransponderProto.TransponderResponse> =
        serverStreamingRpc(
      channel,
      TransponderServiceGrpc.getSubscribeTransponderMethod(),
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
    public suspend fun setRateTransponder(request: TransponderProto.SetRateTransponderRequest,
        headers: Metadata = Metadata()): TransponderProto.SetRateTransponderResponse = unaryRpc(
      channel,
      TransponderServiceGrpc.getSetRateTransponderMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.transponder.TransponderService service based on
   * Kotlin coroutines.
   */
  public abstract class TransponderServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.transponder.TransponderService.SubscribeTransponder.
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
    public open fun subscribeTransponder(request: TransponderProto.SubscribeTransponderRequest):
        Flow<TransponderProto.TransponderResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.transponder.TransponderService.SubscribeTransponder is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.transponder.TransponderService.SetRateTransponder.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setRateTransponder(request: TransponderProto.SetRateTransponderRequest):
        TransponderProto.SetRateTransponderResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.transponder.TransponderService.SetRateTransponder is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = TransponderServiceGrpc.getSubscribeTransponderMethod(),
      implementation = ::subscribeTransponder
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TransponderServiceGrpc.getSetRateTransponderMethod(),
      implementation = ::setRateTransponder
    )).build()
  }
}
