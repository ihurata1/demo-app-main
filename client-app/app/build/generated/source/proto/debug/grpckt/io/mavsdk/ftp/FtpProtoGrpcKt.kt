package io.mavsdk.ftp

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
import io.mavsdk.ftp.FtpServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.ftp.FtpService.
 */
public object FtpServiceGrpcKt {
  public const val SERVICE_NAME: String = FtpServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeDownloadMethod:
      MethodDescriptor<FtpProto.SubscribeDownloadRequest, FtpProto.DownloadResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getSubscribeDownloadMethod()

  public val subscribeUploadMethod:
      MethodDescriptor<FtpProto.SubscribeUploadRequest, FtpProto.UploadResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getSubscribeUploadMethod()

  public val listDirectoryMethod:
      MethodDescriptor<FtpProto.ListDirectoryRequest, FtpProto.ListDirectoryResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getListDirectoryMethod()

  public val createDirectoryMethod:
      MethodDescriptor<FtpProto.CreateDirectoryRequest, FtpProto.CreateDirectoryResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getCreateDirectoryMethod()

  public val removeDirectoryMethod:
      MethodDescriptor<FtpProto.RemoveDirectoryRequest, FtpProto.RemoveDirectoryResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getRemoveDirectoryMethod()

  public val removeFileMethod:
      MethodDescriptor<FtpProto.RemoveFileRequest, FtpProto.RemoveFileResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getRemoveFileMethod()

  public val renameMethod: MethodDescriptor<FtpProto.RenameRequest, FtpProto.RenameResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getRenameMethod()

  public val areFilesIdenticalMethod:
      MethodDescriptor<FtpProto.AreFilesIdenticalRequest, FtpProto.AreFilesIdenticalResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getAreFilesIdenticalMethod()

  public val setTargetCompidMethod:
      MethodDescriptor<FtpProto.SetTargetCompidRequest, FtpProto.SetTargetCompidResponse>
    @JvmStatic
    get() = FtpServiceGrpc.getSetTargetCompidMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.ftp.FtpService service as suspending coroutines.
   */
  @StubFor(FtpServiceGrpc::class)
  public class FtpServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<FtpServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): FtpServiceCoroutineStub =
        FtpServiceCoroutineStub(channel, callOptions)

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
    public fun subscribeDownload(request: FtpProto.SubscribeDownloadRequest, headers: Metadata =
        Metadata()): Flow<FtpProto.DownloadResponse> = serverStreamingRpc(
      channel,
      FtpServiceGrpc.getSubscribeDownloadMethod(),
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
    public fun subscribeUpload(request: FtpProto.SubscribeUploadRequest, headers: Metadata =
        Metadata()): Flow<FtpProto.UploadResponse> = serverStreamingRpc(
      channel,
      FtpServiceGrpc.getSubscribeUploadMethod(),
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
    public suspend fun listDirectory(request: FtpProto.ListDirectoryRequest, headers: Metadata =
        Metadata()): FtpProto.ListDirectoryResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getListDirectoryMethod(),
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
    public suspend fun createDirectory(request: FtpProto.CreateDirectoryRequest, headers: Metadata =
        Metadata()): FtpProto.CreateDirectoryResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getCreateDirectoryMethod(),
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
    public suspend fun removeDirectory(request: FtpProto.RemoveDirectoryRequest, headers: Metadata =
        Metadata()): FtpProto.RemoveDirectoryResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getRemoveDirectoryMethod(),
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
    public suspend fun removeFile(request: FtpProto.RemoveFileRequest, headers: Metadata =
        Metadata()): FtpProto.RemoveFileResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getRemoveFileMethod(),
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
    public suspend fun rename(request: FtpProto.RenameRequest, headers: Metadata = Metadata()):
        FtpProto.RenameResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getRenameMethod(),
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
    public suspend fun areFilesIdentical(request: FtpProto.AreFilesIdenticalRequest,
        headers: Metadata = Metadata()): FtpProto.AreFilesIdenticalResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getAreFilesIdenticalMethod(),
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
    public suspend fun setTargetCompid(request: FtpProto.SetTargetCompidRequest, headers: Metadata =
        Metadata()): FtpProto.SetTargetCompidResponse = unaryRpc(
      channel,
      FtpServiceGrpc.getSetTargetCompidMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.ftp.FtpService service based on Kotlin coroutines.
   */
  public abstract class FtpServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.ftp.FtpService.SubscribeDownload.
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
    public open fun subscribeDownload(request: FtpProto.SubscribeDownloadRequest):
        Flow<FtpProto.DownloadResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.SubscribeDownload is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.ftp.FtpService.SubscribeUpload.
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
    public open fun subscribeUpload(request: FtpProto.SubscribeUploadRequest):
        Flow<FtpProto.UploadResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.SubscribeUpload is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.ListDirectory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listDirectory(request: FtpProto.ListDirectoryRequest):
        FtpProto.ListDirectoryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.ListDirectory is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.CreateDirectory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createDirectory(request: FtpProto.CreateDirectoryRequest):
        FtpProto.CreateDirectoryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.CreateDirectory is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.RemoveDirectory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeDirectory(request: FtpProto.RemoveDirectoryRequest):
        FtpProto.RemoveDirectoryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.RemoveDirectory is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.RemoveFile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun removeFile(request: FtpProto.RemoveFileRequest):
        FtpProto.RemoveFileResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.RemoveFile is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.Rename.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rename(request: FtpProto.RenameRequest): FtpProto.RenameResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.Rename is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.AreFilesIdentical.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun areFilesIdentical(request: FtpProto.AreFilesIdenticalRequest):
        FtpProto.AreFilesIdenticalResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.AreFilesIdentical is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.ftp.FtpService.SetTargetCompid.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setTargetCompid(request: FtpProto.SetTargetCompidRequest):
        FtpProto.SetTargetCompidResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.ftp.FtpService.SetTargetCompid is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getSubscribeDownloadMethod(),
      implementation = ::subscribeDownload
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getSubscribeUploadMethod(),
      implementation = ::subscribeUpload
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getListDirectoryMethod(),
      implementation = ::listDirectory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getCreateDirectoryMethod(),
      implementation = ::createDirectory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getRemoveDirectoryMethod(),
      implementation = ::removeDirectory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getRemoveFileMethod(),
      implementation = ::removeFile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getRenameMethod(),
      implementation = ::rename
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getAreFilesIdenticalMethod(),
      implementation = ::areFilesIdentical
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = FtpServiceGrpc.getSetTargetCompidMethod(),
      implementation = ::setTargetCompid
    )).build()
  }
}
