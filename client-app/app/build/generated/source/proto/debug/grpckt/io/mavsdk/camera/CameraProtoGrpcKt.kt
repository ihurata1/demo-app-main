package io.mavsdk.camera

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
import io.mavsdk.camera.CameraServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.camera.CameraService.
 */
public object CameraServiceGrpcKt {
  public const val SERVICE_NAME: String = CameraServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val prepareMethod:
      MethodDescriptor<CameraProto.PrepareRequest, CameraProto.PrepareResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getPrepareMethod()

  public val takePhotoMethod:
      MethodDescriptor<CameraProto.TakePhotoRequest, CameraProto.TakePhotoResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getTakePhotoMethod()

  public val startPhotoIntervalMethod:
      MethodDescriptor<CameraProto.StartPhotoIntervalRequest, CameraProto.StartPhotoIntervalResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getStartPhotoIntervalMethod()

  public val stopPhotoIntervalMethod:
      MethodDescriptor<CameraProto.StopPhotoIntervalRequest, CameraProto.StopPhotoIntervalResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getStopPhotoIntervalMethod()

  public val startVideoMethod:
      MethodDescriptor<CameraProto.StartVideoRequest, CameraProto.StartVideoResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getStartVideoMethod()

  public val stopVideoMethod:
      MethodDescriptor<CameraProto.StopVideoRequest, CameraProto.StopVideoResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getStopVideoMethod()

  public val startVideoStreamingMethod:
      MethodDescriptor<CameraProto.StartVideoStreamingRequest, CameraProto.StartVideoStreamingResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getStartVideoStreamingMethod()

  public val stopVideoStreamingMethod:
      MethodDescriptor<CameraProto.StopVideoStreamingRequest, CameraProto.StopVideoStreamingResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getStopVideoStreamingMethod()

  public val setModeMethod:
      MethodDescriptor<CameraProto.SetModeRequest, CameraProto.SetModeResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSetModeMethod()

  public val listPhotosMethod:
      MethodDescriptor<CameraProto.ListPhotosRequest, CameraProto.ListPhotosResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getListPhotosMethod()

  public val subscribeModeMethod:
      MethodDescriptor<CameraProto.SubscribeModeRequest, CameraProto.ModeResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribeModeMethod()

  public val subscribeInformationMethod:
      MethodDescriptor<CameraProto.SubscribeInformationRequest, CameraProto.InformationResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribeInformationMethod()

  public val subscribeVideoStreamInfoMethod:
      MethodDescriptor<CameraProto.SubscribeVideoStreamInfoRequest, CameraProto.VideoStreamInfoResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribeVideoStreamInfoMethod()

  public val subscribeCaptureInfoMethod:
      MethodDescriptor<CameraProto.SubscribeCaptureInfoRequest, CameraProto.CaptureInfoResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribeCaptureInfoMethod()

  public val subscribeStatusMethod:
      MethodDescriptor<CameraProto.SubscribeStatusRequest, CameraProto.StatusResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribeStatusMethod()

  public val subscribeCurrentSettingsMethod:
      MethodDescriptor<CameraProto.SubscribeCurrentSettingsRequest, CameraProto.CurrentSettingsResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribeCurrentSettingsMethod()

  public val subscribePossibleSettingOptionsMethod:
      MethodDescriptor<CameraProto.SubscribePossibleSettingOptionsRequest, CameraProto.PossibleSettingOptionsResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSubscribePossibleSettingOptionsMethod()

  public val setSettingMethod:
      MethodDescriptor<CameraProto.SetSettingRequest, CameraProto.SetSettingResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSetSettingMethod()

  public val getSettingMethod:
      MethodDescriptor<CameraProto.GetSettingRequest, CameraProto.GetSettingResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getGetSettingMethod()

  public val formatStorageMethod:
      MethodDescriptor<CameraProto.FormatStorageRequest, CameraProto.FormatStorageResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getFormatStorageMethod()

  public val selectCameraMethod:
      MethodDescriptor<CameraProto.SelectCameraRequest, CameraProto.SelectCameraResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getSelectCameraMethod()

  public val resetSettingsMethod:
      MethodDescriptor<CameraProto.ResetSettingsRequest, CameraProto.ResetSettingsResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getResetSettingsMethod()

  public val zoomInStartMethod:
      MethodDescriptor<CameraProto.ZoomInStartRequest, CameraProto.ZoomInStartResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getZoomInStartMethod()

  public val zoomOutStartMethod:
      MethodDescriptor<CameraProto.ZoomOutStartRequest, CameraProto.ZoomOutStartResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getZoomOutStartMethod()

  public val zoomStopMethod:
      MethodDescriptor<CameraProto.ZoomStopRequest, CameraProto.ZoomStopResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getZoomStopMethod()

  public val zoomRangeMethod:
      MethodDescriptor<CameraProto.ZoomRangeRequest, CameraProto.ZoomRangeResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getZoomRangeMethod()

  public val trackPointMethod:
      MethodDescriptor<CameraProto.TrackPointRequest, CameraProto.TrackPointResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getTrackPointMethod()

  public val trackRectangleMethod:
      MethodDescriptor<CameraProto.TrackRectangleRequest, CameraProto.TrackRectangleResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getTrackRectangleMethod()

  public val trackStopMethod:
      MethodDescriptor<CameraProto.TrackStopRequest, CameraProto.TrackStopResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getTrackStopMethod()

  public val focusInStartMethod:
      MethodDescriptor<CameraProto.FocusInStartRequest, CameraProto.FocusInStartResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getFocusInStartMethod()

  public val focusOutStartMethod:
      MethodDescriptor<CameraProto.FocusOutStartRequest, CameraProto.FocusOutStartResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getFocusOutStartMethod()

  public val focusStopMethod:
      MethodDescriptor<CameraProto.FocusStopRequest, CameraProto.FocusStopResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getFocusStopMethod()

  public val focusRangeMethod:
      MethodDescriptor<CameraProto.FocusRangeRequest, CameraProto.FocusRangeResponse>
    @JvmStatic
    get() = CameraServiceGrpc.getFocusRangeMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.camera.CameraService service as suspending
   * coroutines.
   */
  @StubFor(CameraServiceGrpc::class)
  public class CameraServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CameraServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CameraServiceCoroutineStub =
        CameraServiceCoroutineStub(channel, callOptions)

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
    public suspend fun prepare(request: CameraProto.PrepareRequest, headers: Metadata = Metadata()):
        CameraProto.PrepareResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getPrepareMethod(),
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
    public suspend fun takePhoto(request: CameraProto.TakePhotoRequest, headers: Metadata =
        Metadata()): CameraProto.TakePhotoResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getTakePhotoMethod(),
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
    public suspend fun startPhotoInterval(request: CameraProto.StartPhotoIntervalRequest,
        headers: Metadata = Metadata()): CameraProto.StartPhotoIntervalResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getStartPhotoIntervalMethod(),
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
    public suspend fun stopPhotoInterval(request: CameraProto.StopPhotoIntervalRequest,
        headers: Metadata = Metadata()): CameraProto.StopPhotoIntervalResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getStopPhotoIntervalMethod(),
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
    public suspend fun startVideo(request: CameraProto.StartVideoRequest, headers: Metadata =
        Metadata()): CameraProto.StartVideoResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getStartVideoMethod(),
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
    public suspend fun stopVideo(request: CameraProto.StopVideoRequest, headers: Metadata =
        Metadata()): CameraProto.StopVideoResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getStopVideoMethod(),
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
    public suspend fun startVideoStreaming(request: CameraProto.StartVideoStreamingRequest,
        headers: Metadata = Metadata()): CameraProto.StartVideoStreamingResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getStartVideoStreamingMethod(),
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
    public suspend fun stopVideoStreaming(request: CameraProto.StopVideoStreamingRequest,
        headers: Metadata = Metadata()): CameraProto.StopVideoStreamingResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getStopVideoStreamingMethod(),
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
    public suspend fun setMode(request: CameraProto.SetModeRequest, headers: Metadata = Metadata()):
        CameraProto.SetModeResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getSetModeMethod(),
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
    public suspend fun listPhotos(request: CameraProto.ListPhotosRequest, headers: Metadata =
        Metadata()): CameraProto.ListPhotosResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getListPhotosMethod(),
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
    public fun subscribeMode(request: CameraProto.SubscribeModeRequest, headers: Metadata =
        Metadata()): Flow<CameraProto.ModeResponse> = serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribeModeMethod(),
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
    public fun subscribeInformation(request: CameraProto.SubscribeInformationRequest,
        headers: Metadata = Metadata()): Flow<CameraProto.InformationResponse> = serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribeInformationMethod(),
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
    public fun subscribeVideoStreamInfo(request: CameraProto.SubscribeVideoStreamInfoRequest,
        headers: Metadata = Metadata()): Flow<CameraProto.VideoStreamInfoResponse> =
        serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribeVideoStreamInfoMethod(),
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
    public fun subscribeCaptureInfo(request: CameraProto.SubscribeCaptureInfoRequest,
        headers: Metadata = Metadata()): Flow<CameraProto.CaptureInfoResponse> = serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribeCaptureInfoMethod(),
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
    public fun subscribeStatus(request: CameraProto.SubscribeStatusRequest, headers: Metadata =
        Metadata()): Flow<CameraProto.StatusResponse> = serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribeStatusMethod(),
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
    public fun subscribeCurrentSettings(request: CameraProto.SubscribeCurrentSettingsRequest,
        headers: Metadata = Metadata()): Flow<CameraProto.CurrentSettingsResponse> =
        serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribeCurrentSettingsMethod(),
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
        fun subscribePossibleSettingOptions(request: CameraProto.SubscribePossibleSettingOptionsRequest,
        headers: Metadata = Metadata()): Flow<CameraProto.PossibleSettingOptionsResponse> =
        serverStreamingRpc(
      channel,
      CameraServiceGrpc.getSubscribePossibleSettingOptionsMethod(),
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
    public suspend fun setSetting(request: CameraProto.SetSettingRequest, headers: Metadata =
        Metadata()): CameraProto.SetSettingResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getSetSettingMethod(),
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
    public suspend fun getSetting(request: CameraProto.GetSettingRequest, headers: Metadata =
        Metadata()): CameraProto.GetSettingResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getGetSettingMethod(),
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
    public suspend fun formatStorage(request: CameraProto.FormatStorageRequest, headers: Metadata =
        Metadata()): CameraProto.FormatStorageResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getFormatStorageMethod(),
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
    public suspend fun selectCamera(request: CameraProto.SelectCameraRequest, headers: Metadata =
        Metadata()): CameraProto.SelectCameraResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getSelectCameraMethod(),
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
    public suspend fun resetSettings(request: CameraProto.ResetSettingsRequest, headers: Metadata =
        Metadata()): CameraProto.ResetSettingsResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getResetSettingsMethod(),
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
    public suspend fun zoomInStart(request: CameraProto.ZoomInStartRequest, headers: Metadata =
        Metadata()): CameraProto.ZoomInStartResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getZoomInStartMethod(),
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
    public suspend fun zoomOutStart(request: CameraProto.ZoomOutStartRequest, headers: Metadata =
        Metadata()): CameraProto.ZoomOutStartResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getZoomOutStartMethod(),
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
    public suspend fun zoomStop(request: CameraProto.ZoomStopRequest, headers: Metadata =
        Metadata()): CameraProto.ZoomStopResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getZoomStopMethod(),
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
    public suspend fun zoomRange(request: CameraProto.ZoomRangeRequest, headers: Metadata =
        Metadata()): CameraProto.ZoomRangeResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getZoomRangeMethod(),
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
    public suspend fun trackPoint(request: CameraProto.TrackPointRequest, headers: Metadata =
        Metadata()): CameraProto.TrackPointResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getTrackPointMethod(),
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
    public suspend fun trackRectangle(request: CameraProto.TrackRectangleRequest, headers: Metadata
        = Metadata()): CameraProto.TrackRectangleResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getTrackRectangleMethod(),
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
    public suspend fun trackStop(request: CameraProto.TrackStopRequest, headers: Metadata =
        Metadata()): CameraProto.TrackStopResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getTrackStopMethod(),
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
    public suspend fun focusInStart(request: CameraProto.FocusInStartRequest, headers: Metadata =
        Metadata()): CameraProto.FocusInStartResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getFocusInStartMethod(),
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
    public suspend fun focusOutStart(request: CameraProto.FocusOutStartRequest, headers: Metadata =
        Metadata()): CameraProto.FocusOutStartResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getFocusOutStartMethod(),
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
    public suspend fun focusStop(request: CameraProto.FocusStopRequest, headers: Metadata =
        Metadata()): CameraProto.FocusStopResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getFocusStopMethod(),
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
    public suspend fun focusRange(request: CameraProto.FocusRangeRequest, headers: Metadata =
        Metadata()): CameraProto.FocusRangeResponse = unaryRpc(
      channel,
      CameraServiceGrpc.getFocusRangeMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.camera.CameraService service based on Kotlin
   * coroutines.
   */
  public abstract class CameraServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.Prepare.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun prepare(request: CameraProto.PrepareRequest):
        CameraProto.PrepareResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.Prepare is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.TakePhoto.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun takePhoto(request: CameraProto.TakePhotoRequest):
        CameraProto.TakePhotoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.TakePhoto is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.StartPhotoInterval.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startPhotoInterval(request: CameraProto.StartPhotoIntervalRequest):
        CameraProto.StartPhotoIntervalResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.StartPhotoInterval is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.StopPhotoInterval.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopPhotoInterval(request: CameraProto.StopPhotoIntervalRequest):
        CameraProto.StopPhotoIntervalResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.StopPhotoInterval is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.StartVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startVideo(request: CameraProto.StartVideoRequest):
        CameraProto.StartVideoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.StartVideo is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.StopVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopVideo(request: CameraProto.StopVideoRequest):
        CameraProto.StopVideoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.StopVideo is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.StartVideoStreaming.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun startVideoStreaming(request: CameraProto.StartVideoStreamingRequest):
        CameraProto.StartVideoStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.StartVideoStreaming is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.StopVideoStreaming.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun stopVideoStreaming(request: CameraProto.StopVideoStreamingRequest):
        CameraProto.StopVideoStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.StopVideoStreaming is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.SetMode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setMode(request: CameraProto.SetModeRequest):
        CameraProto.SetModeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SetMode is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.ListPhotos.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listPhotos(request: CameraProto.ListPhotosRequest):
        CameraProto.ListPhotosResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.ListPhotos is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.camera.CameraService.SubscribeMode.
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
    public open fun subscribeMode(request: CameraProto.SubscribeModeRequest):
        Flow<CameraProto.ModeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribeMode is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera.CameraService.SubscribeInformation.
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
    public open fun subscribeInformation(request: CameraProto.SubscribeInformationRequest):
        Flow<CameraProto.InformationResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribeInformation is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera.CameraService.SubscribeVideoStreamInfo.
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
    public open fun subscribeVideoStreamInfo(request: CameraProto.SubscribeVideoStreamInfoRequest):
        Flow<CameraProto.VideoStreamInfoResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribeVideoStreamInfo is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera.CameraService.SubscribeCaptureInfo.
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
    public open fun subscribeCaptureInfo(request: CameraProto.SubscribeCaptureInfoRequest):
        Flow<CameraProto.CaptureInfoResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribeCaptureInfo is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.camera.CameraService.SubscribeStatus.
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
    public open fun subscribeStatus(request: CameraProto.SubscribeStatusRequest):
        Flow<CameraProto.StatusResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribeStatus is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera.CameraService.SubscribeCurrentSettings.
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
    public open fun subscribeCurrentSettings(request: CameraProto.SubscribeCurrentSettingsRequest):
        Flow<CameraProto.CurrentSettingsResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribeCurrentSettings is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera.CameraService.SubscribePossibleSettingOptions.
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
        fun subscribePossibleSettingOptions(request: CameraProto.SubscribePossibleSettingOptionsRequest):
        Flow<CameraProto.PossibleSettingOptionsResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SubscribePossibleSettingOptions is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.SetSetting.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setSetting(request: CameraProto.SetSettingRequest):
        CameraProto.SetSettingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SetSetting is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.GetSetting.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getSetting(request: CameraProto.GetSettingRequest):
        CameraProto.GetSettingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.GetSetting is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.FormatStorage.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun formatStorage(request: CameraProto.FormatStorageRequest):
        CameraProto.FormatStorageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.FormatStorage is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.SelectCamera.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun selectCamera(request: CameraProto.SelectCameraRequest):
        CameraProto.SelectCameraResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.SelectCamera is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.ResetSettings.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun resetSettings(request: CameraProto.ResetSettingsRequest):
        CameraProto.ResetSettingsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.ResetSettings is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.ZoomInStart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun zoomInStart(request: CameraProto.ZoomInStartRequest):
        CameraProto.ZoomInStartResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.ZoomInStart is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.ZoomOutStart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun zoomOutStart(request: CameraProto.ZoomOutStartRequest):
        CameraProto.ZoomOutStartResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.ZoomOutStart is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.ZoomStop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun zoomStop(request: CameraProto.ZoomStopRequest):
        CameraProto.ZoomStopResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.ZoomStop is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.ZoomRange.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun zoomRange(request: CameraProto.ZoomRangeRequest):
        CameraProto.ZoomRangeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.ZoomRange is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.TrackPoint.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun trackPoint(request: CameraProto.TrackPointRequest):
        CameraProto.TrackPointResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.TrackPoint is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.TrackRectangle.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun trackRectangle(request: CameraProto.TrackRectangleRequest):
        CameraProto.TrackRectangleResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.TrackRectangle is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.TrackStop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun trackStop(request: CameraProto.TrackStopRequest):
        CameraProto.TrackStopResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.TrackStop is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.FocusInStart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun focusInStart(request: CameraProto.FocusInStartRequest):
        CameraProto.FocusInStartResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.FocusInStart is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.FocusOutStart.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun focusOutStart(request: CameraProto.FocusOutStartRequest):
        CameraProto.FocusOutStartResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.FocusOutStart is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.FocusStop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun focusStop(request: CameraProto.FocusStopRequest):
        CameraProto.FocusStopResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.FocusStop is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.camera.CameraService.FocusRange.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun focusRange(request: CameraProto.FocusRangeRequest):
        CameraProto.FocusRangeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera.CameraService.FocusRange is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getPrepareMethod(),
      implementation = ::prepare
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getTakePhotoMethod(),
      implementation = ::takePhoto
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getStartPhotoIntervalMethod(),
      implementation = ::startPhotoInterval
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getStopPhotoIntervalMethod(),
      implementation = ::stopPhotoInterval
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getStartVideoMethod(),
      implementation = ::startVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getStopVideoMethod(),
      implementation = ::stopVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getStartVideoStreamingMethod(),
      implementation = ::startVideoStreaming
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getStopVideoStreamingMethod(),
      implementation = ::stopVideoStreaming
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSetModeMethod(),
      implementation = ::setMode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getListPhotosMethod(),
      implementation = ::listPhotos
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribeModeMethod(),
      implementation = ::subscribeMode
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribeInformationMethod(),
      implementation = ::subscribeInformation
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribeVideoStreamInfoMethod(),
      implementation = ::subscribeVideoStreamInfo
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribeCaptureInfoMethod(),
      implementation = ::subscribeCaptureInfo
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribeStatusMethod(),
      implementation = ::subscribeStatus
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribeCurrentSettingsMethod(),
      implementation = ::subscribeCurrentSettings
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSubscribePossibleSettingOptionsMethod(),
      implementation = ::subscribePossibleSettingOptions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSetSettingMethod(),
      implementation = ::setSetting
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getGetSettingMethod(),
      implementation = ::getSetting
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getFormatStorageMethod(),
      implementation = ::formatStorage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getSelectCameraMethod(),
      implementation = ::selectCamera
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getResetSettingsMethod(),
      implementation = ::resetSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getZoomInStartMethod(),
      implementation = ::zoomInStart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getZoomOutStartMethod(),
      implementation = ::zoomOutStart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getZoomStopMethod(),
      implementation = ::zoomStop
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getZoomRangeMethod(),
      implementation = ::zoomRange
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getTrackPointMethod(),
      implementation = ::trackPoint
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getTrackRectangleMethod(),
      implementation = ::trackRectangle
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getTrackStopMethod(),
      implementation = ::trackStop
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getFocusInStartMethod(),
      implementation = ::focusInStart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getFocusOutStartMethod(),
      implementation = ::focusOutStart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getFocusStopMethod(),
      implementation = ::focusStop
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServiceGrpc.getFocusRangeMethod(),
      implementation = ::focusRange
    )).build()
  }
}
