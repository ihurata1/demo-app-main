package io.mavsdk.mission

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
import io.mavsdk.mission.MissionServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.mission.MissionService.
 */
public object MissionServiceGrpcKt {
  public const val SERVICE_NAME: String = MissionServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val uploadMissionMethod:
      MethodDescriptor<MissionProto.UploadMissionRequest, MissionProto.UploadMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getUploadMissionMethod()

  public val subscribeUploadMissionWithProgressMethod:
      MethodDescriptor<MissionProto.SubscribeUploadMissionWithProgressRequest, MissionProto.UploadMissionWithProgressResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getSubscribeUploadMissionWithProgressMethod()

  public val cancelMissionUploadMethod:
      MethodDescriptor<MissionProto.CancelMissionUploadRequest, MissionProto.CancelMissionUploadResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getCancelMissionUploadMethod()

  public val downloadMissionMethod:
      MethodDescriptor<MissionProto.DownloadMissionRequest, MissionProto.DownloadMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getDownloadMissionMethod()

  public val subscribeDownloadMissionWithProgressMethod:
      MethodDescriptor<MissionProto.SubscribeDownloadMissionWithProgressRequest, MissionProto.DownloadMissionWithProgressResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getSubscribeDownloadMissionWithProgressMethod()

  public val cancelMissionDownloadMethod:
      MethodDescriptor<MissionProto.CancelMissionDownloadRequest, MissionProto.CancelMissionDownloadResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getCancelMissionDownloadMethod()

  public val startMissionMethod:
      MethodDescriptor<MissionProto.StartMissionRequest, MissionProto.StartMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getStartMissionMethod()

  public val pauseMissionMethod:
      MethodDescriptor<MissionProto.PauseMissionRequest, MissionProto.PauseMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getPauseMissionMethod()

  public val clearMissionMethod:
      MethodDescriptor<MissionProto.ClearMissionRequest, MissionProto.ClearMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getClearMissionMethod()

  public val setCurrentMissionItemMethod:
      MethodDescriptor<MissionProto.SetCurrentMissionItemRequest, MissionProto.SetCurrentMissionItemResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getSetCurrentMissionItemMethod()

  public val isMissionFinishedMethod:
      MethodDescriptor<MissionProto.IsMissionFinishedRequest, MissionProto.IsMissionFinishedResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getIsMissionFinishedMethod()

  public val subscribeMissionProgressMethod:
      MethodDescriptor<MissionProto.SubscribeMissionProgressRequest, MissionProto.MissionProgressResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getSubscribeMissionProgressMethod()

  public val getReturnToLaunchAfterMissionMethod:
      MethodDescriptor<MissionProto.GetReturnToLaunchAfterMissionRequest, MissionProto.GetReturnToLaunchAfterMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getGetReturnToLaunchAfterMissionMethod()

  public val setReturnToLaunchAfterMissionMethod:
      MethodDescriptor<MissionProto.SetReturnToLaunchAfterMissionRequest, MissionProto.SetReturnToLaunchAfterMissionResponse>
    @JvmStatic
    get() = MissionServiceGrpc.getSetReturnToLaunchAfterMissionMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.mission.MissionService service as suspending
   * coroutines.
   */
  @StubFor(MissionServiceGrpc::class)
  public class MissionServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MissionServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MissionServiceCoroutineStub =
        MissionServiceCoroutineStub(channel, callOptions)

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
    public suspend fun uploadMission(request: MissionProto.UploadMissionRequest, headers: Metadata =
        Metadata()): MissionProto.UploadMissionResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getUploadMissionMethod(),
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
        fun subscribeUploadMissionWithProgress(request: MissionProto.SubscribeUploadMissionWithProgressRequest,
        headers: Metadata = Metadata()): Flow<MissionProto.UploadMissionWithProgressResponse> =
        serverStreamingRpc(
      channel,
      MissionServiceGrpc.getSubscribeUploadMissionWithProgressMethod(),
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
    public suspend fun cancelMissionUpload(request: MissionProto.CancelMissionUploadRequest,
        headers: Metadata = Metadata()): MissionProto.CancelMissionUploadResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getCancelMissionUploadMethod(),
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
    public suspend fun downloadMission(request: MissionProto.DownloadMissionRequest,
        headers: Metadata = Metadata()): MissionProto.DownloadMissionResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getDownloadMissionMethod(),
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
        fun subscribeDownloadMissionWithProgress(request: MissionProto.SubscribeDownloadMissionWithProgressRequest,
        headers: Metadata = Metadata()): Flow<MissionProto.DownloadMissionWithProgressResponse> =
        serverStreamingRpc(
      channel,
      MissionServiceGrpc.getSubscribeDownloadMissionWithProgressMethod(),
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
    public suspend fun cancelMissionDownload(request: MissionProto.CancelMissionDownloadRequest,
        headers: Metadata = Metadata()): MissionProto.CancelMissionDownloadResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getCancelMissionDownloadMethod(),
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
    public suspend fun startMission(request: MissionProto.StartMissionRequest, headers: Metadata =
        Metadata()): MissionProto.StartMissionResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getStartMissionMethod(),
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
    public suspend fun pauseMission(request: MissionProto.PauseMissionRequest, headers: Metadata =
        Metadata()): MissionProto.PauseMissionResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getPauseMissionMethod(),
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
    public suspend fun clearMission(request: MissionProto.ClearMissionRequest, headers: Metadata =
        Metadata()): MissionProto.ClearMissionResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getClearMissionMethod(),
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
    public suspend fun setCurrentMissionItem(request: MissionProto.SetCurrentMissionItemRequest,
        headers: Metadata = Metadata()): MissionProto.SetCurrentMissionItemResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getSetCurrentMissionItemMethod(),
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
    public suspend fun isMissionFinished(request: MissionProto.IsMissionFinishedRequest,
        headers: Metadata = Metadata()): MissionProto.IsMissionFinishedResponse = unaryRpc(
      channel,
      MissionServiceGrpc.getIsMissionFinishedMethod(),
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
    public fun subscribeMissionProgress(request: MissionProto.SubscribeMissionProgressRequest,
        headers: Metadata = Metadata()): Flow<MissionProto.MissionProgressResponse> =
        serverStreamingRpc(
      channel,
      MissionServiceGrpc.getSubscribeMissionProgressMethod(),
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
        fun getReturnToLaunchAfterMission(request: MissionProto.GetReturnToLaunchAfterMissionRequest,
        headers: Metadata = Metadata()): MissionProto.GetReturnToLaunchAfterMissionResponse =
        unaryRpc(
      channel,
      MissionServiceGrpc.getGetReturnToLaunchAfterMissionMethod(),
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
        fun setReturnToLaunchAfterMission(request: MissionProto.SetReturnToLaunchAfterMissionRequest,
        headers: Metadata = Metadata()): MissionProto.SetReturnToLaunchAfterMissionResponse =
        unaryRpc(
      channel,
      MissionServiceGrpc.getSetReturnToLaunchAfterMissionMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.mission.MissionService service based on Kotlin
   * coroutines.
   */
  public abstract class MissionServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.UploadMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadMission(request: MissionProto.UploadMissionRequest):
        MissionProto.UploadMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.UploadMission is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission.MissionService.SubscribeUploadMissionWithProgress.
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
        fun subscribeUploadMissionWithProgress(request: MissionProto.SubscribeUploadMissionWithProgressRequest):
        Flow<MissionProto.UploadMissionWithProgressResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.SubscribeUploadMissionWithProgress is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.CancelMissionUpload.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun cancelMissionUpload(request: MissionProto.CancelMissionUploadRequest):
        MissionProto.CancelMissionUploadResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.CancelMissionUpload is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.DownloadMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadMission(request: MissionProto.DownloadMissionRequest):
        MissionProto.DownloadMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.DownloadMission is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission.MissionService.SubscribeDownloadMissionWithProgress.
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
        fun subscribeDownloadMissionWithProgress(request: MissionProto.SubscribeDownloadMissionWithProgressRequest):
        Flow<MissionProto.DownloadMissionWithProgressResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.SubscribeDownloadMissionWithProgress is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.CancelMissionDownload.
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
        fun cancelMissionDownload(request: MissionProto.CancelMissionDownloadRequest):
        MissionProto.CancelMissionDownloadResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.CancelMissionDownload is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.StartMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startMission(request: MissionProto.StartMissionRequest):
        MissionProto.StartMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.StartMission is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.PauseMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pauseMission(request: MissionProto.PauseMissionRequest):
        MissionProto.PauseMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.PauseMission is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.ClearMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clearMission(request: MissionProto.ClearMissionRequest):
        MissionProto.ClearMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.ClearMission is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.SetCurrentMissionItem.
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
        fun setCurrentMissionItem(request: MissionProto.SetCurrentMissionItemRequest):
        MissionProto.SetCurrentMissionItemResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.SetCurrentMissionItem is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission.MissionService.IsMissionFinished.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun isMissionFinished(request: MissionProto.IsMissionFinishedRequest):
        MissionProto.IsMissionFinishedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.IsMissionFinished is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission.MissionService.SubscribeMissionProgress.
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
    public open fun subscribeMissionProgress(request: MissionProto.SubscribeMissionProgressRequest):
        Flow<MissionProto.MissionProgressResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.SubscribeMissionProgress is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission.MissionService.GetReturnToLaunchAfterMission.
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
        fun getReturnToLaunchAfterMission(request: MissionProto.GetReturnToLaunchAfterMissionRequest):
        MissionProto.GetReturnToLaunchAfterMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.GetReturnToLaunchAfterMission is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission.MissionService.SetReturnToLaunchAfterMission.
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
        fun setReturnToLaunchAfterMission(request: MissionProto.SetReturnToLaunchAfterMissionRequest):
        MissionProto.SetReturnToLaunchAfterMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission.MissionService.SetReturnToLaunchAfterMission is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getUploadMissionMethod(),
      implementation = ::uploadMission
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getSubscribeUploadMissionWithProgressMethod(),
      implementation = ::subscribeUploadMissionWithProgress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getCancelMissionUploadMethod(),
      implementation = ::cancelMissionUpload
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getDownloadMissionMethod(),
      implementation = ::downloadMission
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getSubscribeDownloadMissionWithProgressMethod(),
      implementation = ::subscribeDownloadMissionWithProgress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getCancelMissionDownloadMethod(),
      implementation = ::cancelMissionDownload
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getStartMissionMethod(),
      implementation = ::startMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getPauseMissionMethod(),
      implementation = ::pauseMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getClearMissionMethod(),
      implementation = ::clearMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getSetCurrentMissionItemMethod(),
      implementation = ::setCurrentMissionItem
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getIsMissionFinishedMethod(),
      implementation = ::isMissionFinished
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getSubscribeMissionProgressMethod(),
      implementation = ::subscribeMissionProgress
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getGetReturnToLaunchAfterMissionMethod(),
      implementation = ::getReturnToLaunchAfterMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionServiceGrpc.getSetReturnToLaunchAfterMissionMethod(),
      implementation = ::setReturnToLaunchAfterMission
    )).build()
  }
}
