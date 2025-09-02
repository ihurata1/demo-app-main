package io.mavsdk.log_streaming

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
import io.mavsdk.log_streaming.LogStreamingServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.log_streaming.LogStreamingService.
 */
public object LogStreamingServiceGrpcKt {
  public const val SERVICE_NAME: String = LogStreamingServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val startLogStreamingMethod:
      MethodDescriptor<LogStreamingProto.StartLogStreamingRequest, LogStreamingProto.StartLogStreamingResponse>
    @JvmStatic
    get() = LogStreamingServiceGrpc.getStartLogStreamingMethod()

  public val stopLogStreamingMethod:
      MethodDescriptor<LogStreamingProto.StopLogStreamingRequest, LogStreamingProto.StopLogStreamingResponse>
    @JvmStatic
    get() = LogStreamingServiceGrpc.getStopLogStreamingMethod()

  public val subscribeLogStreamingRawMethod:
      MethodDescriptor<LogStreamingProto.SubscribeLogStreamingRawRequest, LogStreamingProto.LogStreamingRawResponse>
    @JvmStatic
    get() = LogStreamingServiceGrpc.getSubscribeLogStreamingRawMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.log_streaming.LogStreamingService service as
   * suspending coroutines.
   */
  @StubFor(LogStreamingServiceGrpc::class)
  public class LogStreamingServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<LogStreamingServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): LogStreamingServiceCoroutineStub
        = LogStreamingServiceCoroutineStub(channel, callOptions)

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
    public suspend fun startLogStreaming(request: LogStreamingProto.StartLogStreamingRequest,
        headers: Metadata = Metadata()): LogStreamingProto.StartLogStreamingResponse = unaryRpc(
      channel,
      LogStreamingServiceGrpc.getStartLogStreamingMethod(),
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
    public suspend fun stopLogStreaming(request: LogStreamingProto.StopLogStreamingRequest,
        headers: Metadata = Metadata()): LogStreamingProto.StopLogStreamingResponse = unaryRpc(
      channel,
      LogStreamingServiceGrpc.getStopLogStreamingMethod(),
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
    public fun subscribeLogStreamingRaw(request: LogStreamingProto.SubscribeLogStreamingRawRequest,
        headers: Metadata = Metadata()): Flow<LogStreamingProto.LogStreamingRawResponse> =
        serverStreamingRpc(
      channel,
      LogStreamingServiceGrpc.getSubscribeLogStreamingRawMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.log_streaming.LogStreamingService service based on
   * Kotlin coroutines.
   */
  public abstract class LogStreamingServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.log_streaming.LogStreamingService.StartLogStreaming.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startLogStreaming(request: LogStreamingProto.StartLogStreamingRequest):
        LogStreamingProto.StartLogStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.log_streaming.LogStreamingService.StartLogStreaming is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.log_streaming.LogStreamingService.StopLogStreaming.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopLogStreaming(request: LogStreamingProto.StopLogStreamingRequest):
        LogStreamingProto.StopLogStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.log_streaming.LogStreamingService.StopLogStreaming is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.log_streaming.LogStreamingService.SubscribeLogStreamingRaw.
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
        fun subscribeLogStreamingRaw(request: LogStreamingProto.SubscribeLogStreamingRawRequest):
        Flow<LogStreamingProto.LogStreamingRawResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.log_streaming.LogStreamingService.SubscribeLogStreamingRaw is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LogStreamingServiceGrpc.getStartLogStreamingMethod(),
      implementation = ::startLogStreaming
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LogStreamingServiceGrpc.getStopLogStreamingMethod(),
      implementation = ::stopLogStreaming
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = LogStreamingServiceGrpc.getSubscribeLogStreamingRawMethod(),
      implementation = ::subscribeLogStreamingRaw
    )).build()
  }
}
