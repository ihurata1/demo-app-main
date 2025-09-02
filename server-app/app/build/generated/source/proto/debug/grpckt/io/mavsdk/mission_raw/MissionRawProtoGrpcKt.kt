package io.mavsdk.mission_raw

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
import io.mavsdk.mission_raw.MissionRawServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.mission_raw.MissionRawService.
 */
public object MissionRawServiceGrpcKt {
  public const val SERVICE_NAME: String = MissionRawServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val uploadMissionMethod:
      MethodDescriptor<MissionRawProto.UploadMissionRequest, MissionRawProto.UploadMissionResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getUploadMissionMethod()

  public val uploadGeofenceMethod:
      MethodDescriptor<MissionRawProto.UploadGeofenceRequest, MissionRawProto.UploadGeofenceResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getUploadGeofenceMethod()

  public val uploadRallyPointsMethod:
      MethodDescriptor<MissionRawProto.UploadRallyPointsRequest, MissionRawProto.UploadRallyPointsResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getUploadRallyPointsMethod()

  public val cancelMissionUploadMethod:
      MethodDescriptor<MissionRawProto.CancelMissionUploadRequest, MissionRawProto.CancelMissionUploadResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getCancelMissionUploadMethod()

  public val downloadMissionMethod:
      MethodDescriptor<MissionRawProto.DownloadMissionRequest, MissionRawProto.DownloadMissionResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getDownloadMissionMethod()

  public val cancelMissionDownloadMethod:
      MethodDescriptor<MissionRawProto.CancelMissionDownloadRequest, MissionRawProto.CancelMissionDownloadResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getCancelMissionDownloadMethod()

  public val startMissionMethod:
      MethodDescriptor<MissionRawProto.StartMissionRequest, MissionRawProto.StartMissionResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getStartMissionMethod()

  public val pauseMissionMethod:
      MethodDescriptor<MissionRawProto.PauseMissionRequest, MissionRawProto.PauseMissionResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getPauseMissionMethod()

  public val clearMissionMethod:
      MethodDescriptor<MissionRawProto.ClearMissionRequest, MissionRawProto.ClearMissionResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getClearMissionMethod()

  public val setCurrentMissionItemMethod:
      MethodDescriptor<MissionRawProto.SetCurrentMissionItemRequest, MissionRawProto.SetCurrentMissionItemResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getSetCurrentMissionItemMethod()

  public val subscribeMissionProgressMethod:
      MethodDescriptor<MissionRawProto.SubscribeMissionProgressRequest, MissionRawProto.MissionProgressResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getSubscribeMissionProgressMethod()

  public val subscribeMissionChangedMethod:
      MethodDescriptor<MissionRawProto.SubscribeMissionChangedRequest, MissionRawProto.MissionChangedResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getSubscribeMissionChangedMethod()

  public val importQgroundcontrolMissionMethod:
      MethodDescriptor<MissionRawProto.ImportQgroundcontrolMissionRequest, MissionRawProto.ImportQgroundcontrolMissionResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getImportQgroundcontrolMissionMethod()

  public val importQgroundcontrolMissionFromStringMethod:
      MethodDescriptor<MissionRawProto.ImportQgroundcontrolMissionFromStringRequest, MissionRawProto.ImportQgroundcontrolMissionFromStringResponse>
    @JvmStatic
    get() = MissionRawServiceGrpc.getImportQgroundcontrolMissionFromStringMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.mission_raw.MissionRawService service as suspending
   * coroutines.
   */
  @StubFor(MissionRawServiceGrpc::class)
  public class MissionRawServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MissionRawServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MissionRawServiceCoroutineStub =
        MissionRawServiceCoroutineStub(channel, callOptions)

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
    public suspend fun uploadMission(request: MissionRawProto.UploadMissionRequest,
        headers: Metadata = Metadata()): MissionRawProto.UploadMissionResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getUploadMissionMethod(),
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
    public suspend fun uploadGeofence(request: MissionRawProto.UploadGeofenceRequest,
        headers: Metadata = Metadata()): MissionRawProto.UploadGeofenceResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getUploadGeofenceMethod(),
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
    public suspend fun uploadRallyPoints(request: MissionRawProto.UploadRallyPointsRequest,
        headers: Metadata = Metadata()): MissionRawProto.UploadRallyPointsResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getUploadRallyPointsMethod(),
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
    public suspend fun cancelMissionUpload(request: MissionRawProto.CancelMissionUploadRequest,
        headers: Metadata = Metadata()): MissionRawProto.CancelMissionUploadResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getCancelMissionUploadMethod(),
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
    public suspend fun downloadMission(request: MissionRawProto.DownloadMissionRequest,
        headers: Metadata = Metadata()): MissionRawProto.DownloadMissionResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getDownloadMissionMethod(),
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
    public suspend fun cancelMissionDownload(request: MissionRawProto.CancelMissionDownloadRequest,
        headers: Metadata = Metadata()): MissionRawProto.CancelMissionDownloadResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getCancelMissionDownloadMethod(),
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
    public suspend fun startMission(request: MissionRawProto.StartMissionRequest, headers: Metadata
        = Metadata()): MissionRawProto.StartMissionResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getStartMissionMethod(),
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
    public suspend fun pauseMission(request: MissionRawProto.PauseMissionRequest, headers: Metadata
        = Metadata()): MissionRawProto.PauseMissionResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getPauseMissionMethod(),
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
    public suspend fun clearMission(request: MissionRawProto.ClearMissionRequest, headers: Metadata
        = Metadata()): MissionRawProto.ClearMissionResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getClearMissionMethod(),
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
    public suspend fun setCurrentMissionItem(request: MissionRawProto.SetCurrentMissionItemRequest,
        headers: Metadata = Metadata()): MissionRawProto.SetCurrentMissionItemResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getSetCurrentMissionItemMethod(),
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
    public fun subscribeMissionProgress(request: MissionRawProto.SubscribeMissionProgressRequest,
        headers: Metadata = Metadata()): Flow<MissionRawProto.MissionProgressResponse> =
        serverStreamingRpc(
      channel,
      MissionRawServiceGrpc.getSubscribeMissionProgressMethod(),
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
    public fun subscribeMissionChanged(request: MissionRawProto.SubscribeMissionChangedRequest,
        headers: Metadata = Metadata()): Flow<MissionRawProto.MissionChangedResponse> =
        serverStreamingRpc(
      channel,
      MissionRawServiceGrpc.getSubscribeMissionChangedMethod(),
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
        fun importQgroundcontrolMission(request: MissionRawProto.ImportQgroundcontrolMissionRequest,
        headers: Metadata = Metadata()): MissionRawProto.ImportQgroundcontrolMissionResponse =
        unaryRpc(
      channel,
      MissionRawServiceGrpc.getImportQgroundcontrolMissionMethod(),
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
        fun importQgroundcontrolMissionFromString(request: MissionRawProto.ImportQgroundcontrolMissionFromStringRequest,
        headers: Metadata = Metadata()):
        MissionRawProto.ImportQgroundcontrolMissionFromStringResponse = unaryRpc(
      channel,
      MissionRawServiceGrpc.getImportQgroundcontrolMissionFromStringMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.mission_raw.MissionRawService service based on Kotlin
   * coroutines.
   */
  public abstract class MissionRawServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.mission_raw.MissionRawService.UploadMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadMission(request: MissionRawProto.UploadMissionRequest):
        MissionRawProto.UploadMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.UploadMission is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission_raw.MissionRawService.UploadGeofence.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadGeofence(request: MissionRawProto.UploadGeofenceRequest):
        MissionRawProto.UploadGeofenceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.UploadGeofence is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.UploadRallyPoints.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadRallyPoints(request: MissionRawProto.UploadRallyPointsRequest):
        MissionRawProto.UploadRallyPointsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.UploadRallyPoints is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.CancelMissionUpload.
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
        fun cancelMissionUpload(request: MissionRawProto.CancelMissionUploadRequest):
        MissionRawProto.CancelMissionUploadResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.CancelMissionUpload is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission_raw.MissionRawService.DownloadMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun downloadMission(request: MissionRawProto.DownloadMissionRequest):
        MissionRawProto.DownloadMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.DownloadMission is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.CancelMissionDownload.
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
        fun cancelMissionDownload(request: MissionRawProto.CancelMissionDownloadRequest):
        MissionRawProto.CancelMissionDownloadResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.CancelMissionDownload is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission_raw.MissionRawService.StartMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startMission(request: MissionRawProto.StartMissionRequest):
        MissionRawProto.StartMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.StartMission is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission_raw.MissionRawService.PauseMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun pauseMission(request: MissionRawProto.PauseMissionRequest):
        MissionRawProto.PauseMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.PauseMission is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mission_raw.MissionRawService.ClearMission.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clearMission(request: MissionRawProto.ClearMissionRequest):
        MissionRawProto.ClearMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.ClearMission is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.SetCurrentMissionItem.
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
        fun setCurrentMissionItem(request: MissionRawProto.SetCurrentMissionItemRequest):
        MissionRawProto.SetCurrentMissionItemResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.SetCurrentMissionItem is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.SubscribeMissionProgress.
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
        fun subscribeMissionProgress(request: MissionRawProto.SubscribeMissionProgressRequest):
        Flow<MissionRawProto.MissionProgressResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.SubscribeMissionProgress is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.SubscribeMissionChanged.
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
        fun subscribeMissionChanged(request: MissionRawProto.SubscribeMissionChangedRequest):
        Flow<MissionRawProto.MissionChangedResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.SubscribeMissionChanged is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.ImportQgroundcontrolMission.
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
        fun importQgroundcontrolMission(request: MissionRawProto.ImportQgroundcontrolMissionRequest):
        MissionRawProto.ImportQgroundcontrolMissionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.ImportQgroundcontrolMission is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw.MissionRawService.ImportQgroundcontrolMissionFromString.
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
        fun importQgroundcontrolMissionFromString(request: MissionRawProto.ImportQgroundcontrolMissionFromStringRequest):
        MissionRawProto.ImportQgroundcontrolMissionFromStringResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw.MissionRawService.ImportQgroundcontrolMissionFromString is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getUploadMissionMethod(),
      implementation = ::uploadMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getUploadGeofenceMethod(),
      implementation = ::uploadGeofence
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getUploadRallyPointsMethod(),
      implementation = ::uploadRallyPoints
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getCancelMissionUploadMethod(),
      implementation = ::cancelMissionUpload
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getDownloadMissionMethod(),
      implementation = ::downloadMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getCancelMissionDownloadMethod(),
      implementation = ::cancelMissionDownload
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getStartMissionMethod(),
      implementation = ::startMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getPauseMissionMethod(),
      implementation = ::pauseMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getClearMissionMethod(),
      implementation = ::clearMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getSetCurrentMissionItemMethod(),
      implementation = ::setCurrentMissionItem
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getSubscribeMissionProgressMethod(),
      implementation = ::subscribeMissionProgress
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getSubscribeMissionChangedMethod(),
      implementation = ::subscribeMissionChanged
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getImportQgroundcontrolMissionMethod(),
      implementation = ::importQgroundcontrolMission
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServiceGrpc.getImportQgroundcontrolMissionFromStringMethod(),
      implementation = ::importQgroundcontrolMissionFromString
    )).build()
  }
}
