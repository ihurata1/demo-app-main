package io.mavsdk.log_files

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
import io.mavsdk.log_files.LogFilesServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.log_files.LogFilesService.
 */
public object LogFilesServiceGrpcKt {
  public const val SERVICE_NAME: String = LogFilesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getEntriesMethod:
      MethodDescriptor<LogFilesProto.GetEntriesRequest, LogFilesProto.GetEntriesResponse>
    @JvmStatic
    get() = LogFilesServiceGrpc.getGetEntriesMethod()

  public val subscribeDownloadLogFileMethod:
      MethodDescriptor<LogFilesProto.SubscribeDownloadLogFileRequest, LogFilesProto.DownloadLogFileResponse>
    @JvmStatic
    get() = LogFilesServiceGrpc.getSubscribeDownloadLogFileMethod()

  public val eraseAllLogFilesMethod:
      MethodDescriptor<LogFilesProto.EraseAllLogFilesRequest, LogFilesProto.EraseAllLogFilesResponse>
    @JvmStatic
    get() = LogFilesServiceGrpc.getEraseAllLogFilesMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.log_files.LogFilesService service as suspending
   * coroutines.
   */
  @StubFor(LogFilesServiceGrpc::class)
  public class LogFilesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<LogFilesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): LogFilesServiceCoroutineStub =
        LogFilesServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getEntries(request: LogFilesProto.GetEntriesRequest, headers: Metadata =
        Metadata()): LogFilesProto.GetEntriesResponse = unaryRpc(
      channel,
      LogFilesServiceGrpc.getGetEntriesMethod(),
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
    public fun subscribeDownloadLogFile(request: LogFilesProto.SubscribeDownloadLogFileRequest,
        headers: Metadata = Metadata()): Flow<LogFilesProto.DownloadLogFileResponse> =
        serverStreamingRpc(
      channel,
      LogFilesServiceGrpc.getSubscribeDownloadLogFileMethod(),
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
    public suspend fun eraseAllLogFiles(request: LogFilesProto.EraseAllLogFilesRequest,
        headers: Metadata = Metadata()): LogFilesProto.EraseAllLogFilesResponse = unaryRpc(
      channel,
      LogFilesServiceGrpc.getEraseAllLogFilesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.log_files.LogFilesService service based on Kotlin
   * coroutines.
   */
  public abstract class LogFilesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.log_files.LogFilesService.GetEntries.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getEntries(request: LogFilesProto.GetEntriesRequest):
        LogFilesProto.GetEntriesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.log_files.LogFilesService.GetEntries is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.log_files.LogFilesService.SubscribeDownloadLogFile.
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
        fun subscribeDownloadLogFile(request: LogFilesProto.SubscribeDownloadLogFileRequest):
        Flow<LogFilesProto.DownloadLogFileResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.log_files.LogFilesService.SubscribeDownloadLogFile is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.log_files.LogFilesService.EraseAllLogFiles.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun eraseAllLogFiles(request: LogFilesProto.EraseAllLogFilesRequest):
        LogFilesProto.EraseAllLogFilesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.log_files.LogFilesService.EraseAllLogFiles is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LogFilesServiceGrpc.getGetEntriesMethod(),
      implementation = ::getEntries
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = LogFilesServiceGrpc.getSubscribeDownloadLogFileMethod(),
      implementation = ::subscribeDownloadLogFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = LogFilesServiceGrpc.getEraseAllLogFilesMethod(),
      implementation = ::eraseAllLogFiles
    )).build()
  }
}
