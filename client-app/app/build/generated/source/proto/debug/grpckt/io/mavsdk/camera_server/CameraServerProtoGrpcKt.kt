package io.mavsdk.camera_server

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
import io.mavsdk.camera_server.CameraServerServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.camera_server.CameraServerService.
 */
public object CameraServerServiceGrpcKt {
  public const val SERVICE_NAME: String = CameraServerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val setInformationMethod:
      MethodDescriptor<CameraServerProto.SetInformationRequest, CameraServerProto.SetInformationResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSetInformationMethod()

  public val setVideoStreamingMethod:
      MethodDescriptor<CameraServerProto.SetVideoStreamingRequest, CameraServerProto.SetVideoStreamingResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSetVideoStreamingMethod()

  public val setInProgressMethod:
      MethodDescriptor<CameraServerProto.SetInProgressRequest, CameraServerProto.SetInProgressResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSetInProgressMethod()

  public val subscribeTakePhotoMethod:
      MethodDescriptor<CameraServerProto.SubscribeTakePhotoRequest, CameraServerProto.TakePhotoResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeTakePhotoMethod()

  public val respondTakePhotoMethod:
      MethodDescriptor<CameraServerProto.RespondTakePhotoRequest, CameraServerProto.RespondTakePhotoResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondTakePhotoMethod()

  public val subscribeStartVideoMethod:
      MethodDescriptor<CameraServerProto.SubscribeStartVideoRequest, CameraServerProto.StartVideoResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeStartVideoMethod()

  public val respondStartVideoMethod:
      MethodDescriptor<CameraServerProto.RespondStartVideoRequest, CameraServerProto.RespondStartVideoResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondStartVideoMethod()

  public val subscribeStopVideoMethod:
      MethodDescriptor<CameraServerProto.SubscribeStopVideoRequest, CameraServerProto.StopVideoResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeStopVideoMethod()

  public val respondStopVideoMethod:
      MethodDescriptor<CameraServerProto.RespondStopVideoRequest, CameraServerProto.RespondStopVideoResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondStopVideoMethod()

  public val subscribeStartVideoStreamingMethod:
      MethodDescriptor<CameraServerProto.SubscribeStartVideoStreamingRequest, CameraServerProto.StartVideoStreamingResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeStartVideoStreamingMethod()

  public val respondStartVideoStreamingMethod:
      MethodDescriptor<CameraServerProto.RespondStartVideoStreamingRequest, CameraServerProto.RespondStartVideoStreamingResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondStartVideoStreamingMethod()

  public val subscribeStopVideoStreamingMethod:
      MethodDescriptor<CameraServerProto.SubscribeStopVideoStreamingRequest, CameraServerProto.StopVideoStreamingResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeStopVideoStreamingMethod()

  public val respondStopVideoStreamingMethod:
      MethodDescriptor<CameraServerProto.RespondStopVideoStreamingRequest, CameraServerProto.RespondStopVideoStreamingResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondStopVideoStreamingMethod()

  public val subscribeSetModeMethod:
      MethodDescriptor<CameraServerProto.SubscribeSetModeRequest, CameraServerProto.SetModeResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeSetModeMethod()

  public val respondSetModeMethod:
      MethodDescriptor<CameraServerProto.RespondSetModeRequest, CameraServerProto.RespondSetModeResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondSetModeMethod()

  public val subscribeStorageInformationMethod:
      MethodDescriptor<CameraServerProto.SubscribeStorageInformationRequest, CameraServerProto.StorageInformationResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeStorageInformationMethod()

  public val respondStorageInformationMethod:
      MethodDescriptor<CameraServerProto.RespondStorageInformationRequest, CameraServerProto.RespondStorageInformationResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondStorageInformationMethod()

  public val subscribeCaptureStatusMethod:
      MethodDescriptor<CameraServerProto.SubscribeCaptureStatusRequest, CameraServerProto.CaptureStatusResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeCaptureStatusMethod()

  public val respondCaptureStatusMethod:
      MethodDescriptor<CameraServerProto.RespondCaptureStatusRequest, CameraServerProto.RespondCaptureStatusResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondCaptureStatusMethod()

  public val subscribeFormatStorageMethod:
      MethodDescriptor<CameraServerProto.SubscribeFormatStorageRequest, CameraServerProto.FormatStorageResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeFormatStorageMethod()

  public val respondFormatStorageMethod:
      MethodDescriptor<CameraServerProto.RespondFormatStorageRequest, CameraServerProto.RespondFormatStorageResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondFormatStorageMethod()

  public val subscribeResetSettingsMethod:
      MethodDescriptor<CameraServerProto.SubscribeResetSettingsRequest, CameraServerProto.ResetSettingsResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeResetSettingsMethod()

  public val respondResetSettingsMethod:
      MethodDescriptor<CameraServerProto.RespondResetSettingsRequest, CameraServerProto.RespondResetSettingsResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondResetSettingsMethod()

  public val subscribeZoomInStartMethod:
      MethodDescriptor<CameraServerProto.SubscribeZoomInStartRequest, CameraServerProto.ZoomInStartResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeZoomInStartMethod()

  public val respondZoomInStartMethod:
      MethodDescriptor<CameraServerProto.RespondZoomInStartRequest, CameraServerProto.RespondZoomInStartResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondZoomInStartMethod()

  public val subscribeZoomOutStartMethod:
      MethodDescriptor<CameraServerProto.SubscribeZoomOutStartRequest, CameraServerProto.ZoomOutStartResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeZoomOutStartMethod()

  public val respondZoomOutStartMethod:
      MethodDescriptor<CameraServerProto.RespondZoomOutStartRequest, CameraServerProto.RespondZoomOutStartResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondZoomOutStartMethod()

  public val subscribeZoomStopMethod:
      MethodDescriptor<CameraServerProto.SubscribeZoomStopRequest, CameraServerProto.ZoomStopResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeZoomStopMethod()

  public val respondZoomStopMethod:
      MethodDescriptor<CameraServerProto.RespondZoomStopRequest, CameraServerProto.RespondZoomStopResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondZoomStopMethod()

  public val subscribeZoomRangeMethod:
      MethodDescriptor<CameraServerProto.SubscribeZoomRangeRequest, CameraServerProto.ZoomRangeResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeZoomRangeMethod()

  public val respondZoomRangeMethod:
      MethodDescriptor<CameraServerProto.RespondZoomRangeRequest, CameraServerProto.RespondZoomRangeResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondZoomRangeMethod()

  public val setTrackingRectangleStatusMethod:
      MethodDescriptor<CameraServerProto.SetTrackingRectangleStatusRequest, CameraServerProto.SetTrackingRectangleStatusResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSetTrackingRectangleStatusMethod()

  public val setTrackingOffStatusMethod:
      MethodDescriptor<CameraServerProto.SetTrackingOffStatusRequest, CameraServerProto.SetTrackingOffStatusResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSetTrackingOffStatusMethod()

  public val subscribeTrackingPointCommandMethod:
      MethodDescriptor<CameraServerProto.SubscribeTrackingPointCommandRequest, CameraServerProto.TrackingPointCommandResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeTrackingPointCommandMethod()

  public val subscribeTrackingRectangleCommandMethod:
      MethodDescriptor<CameraServerProto.SubscribeTrackingRectangleCommandRequest, CameraServerProto.TrackingRectangleCommandResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeTrackingRectangleCommandMethod()

  public val subscribeTrackingOffCommandMethod:
      MethodDescriptor<CameraServerProto.SubscribeTrackingOffCommandRequest, CameraServerProto.TrackingOffCommandResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getSubscribeTrackingOffCommandMethod()

  public val respondTrackingPointCommandMethod:
      MethodDescriptor<CameraServerProto.RespondTrackingPointCommandRequest, CameraServerProto.RespondTrackingPointCommandResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondTrackingPointCommandMethod()

  public val respondTrackingRectangleCommandMethod:
      MethodDescriptor<CameraServerProto.RespondTrackingRectangleCommandRequest, CameraServerProto.RespondTrackingRectangleCommandResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondTrackingRectangleCommandMethod()

  public val respondTrackingOffCommandMethod:
      MethodDescriptor<CameraServerProto.RespondTrackingOffCommandRequest, CameraServerProto.RespondTrackingOffCommandResponse>
    @JvmStatic
    get() = CameraServerServiceGrpc.getRespondTrackingOffCommandMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.camera_server.CameraServerService service as
   * suspending coroutines.
   */
  @StubFor(CameraServerServiceGrpc::class)
  public class CameraServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CameraServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CameraServerServiceCoroutineStub
        = CameraServerServiceCoroutineStub(channel, callOptions)

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
    public suspend fun setInformation(request: CameraServerProto.SetInformationRequest,
        headers: Metadata = Metadata()): CameraServerProto.SetInformationResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getSetInformationMethod(),
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
    public suspend fun setVideoStreaming(request: CameraServerProto.SetVideoStreamingRequest,
        headers: Metadata = Metadata()): CameraServerProto.SetVideoStreamingResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getSetVideoStreamingMethod(),
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
    public suspend fun setInProgress(request: CameraServerProto.SetInProgressRequest,
        headers: Metadata = Metadata()): CameraServerProto.SetInProgressResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getSetInProgressMethod(),
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
    public fun subscribeTakePhoto(request: CameraServerProto.SubscribeTakePhotoRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.TakePhotoResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeTakePhotoMethod(),
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
    public suspend fun respondTakePhoto(request: CameraServerProto.RespondTakePhotoRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondTakePhotoResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondTakePhotoMethod(),
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
    public fun subscribeStartVideo(request: CameraServerProto.SubscribeStartVideoRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.StartVideoResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeStartVideoMethod(),
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
    public suspend fun respondStartVideo(request: CameraServerProto.RespondStartVideoRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondStartVideoResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondStartVideoMethod(),
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
    public fun subscribeStopVideo(request: CameraServerProto.SubscribeStopVideoRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.StopVideoResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeStopVideoMethod(),
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
    public suspend fun respondStopVideo(request: CameraServerProto.RespondStopVideoRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondStopVideoResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondStopVideoMethod(),
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
        fun subscribeStartVideoStreaming(request: CameraServerProto.SubscribeStartVideoStreamingRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.StartVideoStreamingResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeStartVideoStreamingMethod(),
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
        fun respondStartVideoStreaming(request: CameraServerProto.RespondStartVideoStreamingRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondStartVideoStreamingResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondStartVideoStreamingMethod(),
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
        fun subscribeStopVideoStreaming(request: CameraServerProto.SubscribeStopVideoStreamingRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.StopVideoStreamingResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeStopVideoStreamingMethod(),
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
        fun respondStopVideoStreaming(request: CameraServerProto.RespondStopVideoStreamingRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondStopVideoStreamingResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondStopVideoStreamingMethod(),
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
    public fun subscribeSetMode(request: CameraServerProto.SubscribeSetModeRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.SetModeResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeSetModeMethod(),
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
    public suspend fun respondSetMode(request: CameraServerProto.RespondSetModeRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondSetModeResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondSetModeMethod(),
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
        fun subscribeStorageInformation(request: CameraServerProto.SubscribeStorageInformationRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.StorageInformationResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeStorageInformationMethod(),
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
        fun respondStorageInformation(request: CameraServerProto.RespondStorageInformationRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondStorageInformationResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondStorageInformationMethod(),
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
    public fun subscribeCaptureStatus(request: CameraServerProto.SubscribeCaptureStatusRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.CaptureStatusResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeCaptureStatusMethod(),
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
    public suspend fun respondCaptureStatus(request: CameraServerProto.RespondCaptureStatusRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondCaptureStatusResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondCaptureStatusMethod(),
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
    public fun subscribeFormatStorage(request: CameraServerProto.SubscribeFormatStorageRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.FormatStorageResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeFormatStorageMethod(),
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
    public suspend fun respondFormatStorage(request: CameraServerProto.RespondFormatStorageRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondFormatStorageResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondFormatStorageMethod(),
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
    public fun subscribeResetSettings(request: CameraServerProto.SubscribeResetSettingsRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.ResetSettingsResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeResetSettingsMethod(),
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
    public suspend fun respondResetSettings(request: CameraServerProto.RespondResetSettingsRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondResetSettingsResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondResetSettingsMethod(),
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
    public fun subscribeZoomInStart(request: CameraServerProto.SubscribeZoomInStartRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.ZoomInStartResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeZoomInStartMethod(),
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
    public suspend fun respondZoomInStart(request: CameraServerProto.RespondZoomInStartRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondZoomInStartResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondZoomInStartMethod(),
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
    public fun subscribeZoomOutStart(request: CameraServerProto.SubscribeZoomOutStartRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.ZoomOutStartResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeZoomOutStartMethod(),
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
    public suspend fun respondZoomOutStart(request: CameraServerProto.RespondZoomOutStartRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondZoomOutStartResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondZoomOutStartMethod(),
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
    public fun subscribeZoomStop(request: CameraServerProto.SubscribeZoomStopRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.ZoomStopResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeZoomStopMethod(),
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
    public suspend fun respondZoomStop(request: CameraServerProto.RespondZoomStopRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondZoomStopResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondZoomStopMethod(),
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
    public fun subscribeZoomRange(request: CameraServerProto.SubscribeZoomRangeRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.ZoomRangeResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeZoomRangeMethod(),
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
    public suspend fun respondZoomRange(request: CameraServerProto.RespondZoomRangeRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondZoomRangeResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondZoomRangeMethod(),
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
        fun setTrackingRectangleStatus(request: CameraServerProto.SetTrackingRectangleStatusRequest,
        headers: Metadata = Metadata()): CameraServerProto.SetTrackingRectangleStatusResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getSetTrackingRectangleStatusMethod(),
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
    public suspend fun setTrackingOffStatus(request: CameraServerProto.SetTrackingOffStatusRequest,
        headers: Metadata = Metadata()): CameraServerProto.SetTrackingOffStatusResponse = unaryRpc(
      channel,
      CameraServerServiceGrpc.getSetTrackingOffStatusMethod(),
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
        fun subscribeTrackingPointCommand(request: CameraServerProto.SubscribeTrackingPointCommandRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.TrackingPointCommandResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeTrackingPointCommandMethod(),
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
        fun subscribeTrackingRectangleCommand(request: CameraServerProto.SubscribeTrackingRectangleCommandRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.TrackingRectangleCommandResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeTrackingRectangleCommandMethod(),
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
        fun subscribeTrackingOffCommand(request: CameraServerProto.SubscribeTrackingOffCommandRequest,
        headers: Metadata = Metadata()): Flow<CameraServerProto.TrackingOffCommandResponse> =
        serverStreamingRpc(
      channel,
      CameraServerServiceGrpc.getSubscribeTrackingOffCommandMethod(),
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
        fun respondTrackingPointCommand(request: CameraServerProto.RespondTrackingPointCommandRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondTrackingPointCommandResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondTrackingPointCommandMethod(),
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
        fun respondTrackingRectangleCommand(request: CameraServerProto.RespondTrackingRectangleCommandRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondTrackingRectangleCommandResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondTrackingRectangleCommandMethod(),
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
        fun respondTrackingOffCommand(request: CameraServerProto.RespondTrackingOffCommandRequest,
        headers: Metadata = Metadata()): CameraServerProto.RespondTrackingOffCommandResponse =
        unaryRpc(
      channel,
      CameraServerServiceGrpc.getRespondTrackingOffCommandMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.camera_server.CameraServerService service based on
   * Kotlin coroutines.
   */
  public abstract class CameraServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SetInformation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setInformation(request: CameraServerProto.SetInformationRequest):
        CameraServerProto.SetInformationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SetInformation is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SetVideoStreaming.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setVideoStreaming(request: CameraServerProto.SetVideoStreamingRequest):
        CameraServerProto.SetVideoStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SetVideoStreaming is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SetInProgress.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setInProgress(request: CameraServerProto.SetInProgressRequest):
        CameraServerProto.SetInProgressResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SetInProgress is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeTakePhoto.
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
    public open fun subscribeTakePhoto(request: CameraServerProto.SubscribeTakePhotoRequest):
        Flow<CameraServerProto.TakePhotoResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeTakePhoto is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondTakePhoto.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun respondTakePhoto(request: CameraServerProto.RespondTakePhotoRequest):
        CameraServerProto.RespondTakePhotoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondTakePhoto is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeStartVideo.
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
    public open fun subscribeStartVideo(request: CameraServerProto.SubscribeStartVideoRequest):
        Flow<CameraServerProto.StartVideoResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeStartVideo is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondStartVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun respondStartVideo(request: CameraServerProto.RespondStartVideoRequest):
        CameraServerProto.RespondStartVideoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondStartVideo is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeStopVideo.
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
    public open fun subscribeStopVideo(request: CameraServerProto.SubscribeStopVideoRequest):
        Flow<CameraServerProto.StopVideoResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeStopVideo is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondStopVideo.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun respondStopVideo(request: CameraServerProto.RespondStopVideoRequest):
        CameraServerProto.RespondStopVideoResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondStopVideo is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeStartVideoStreaming.
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
        fun subscribeStartVideoStreaming(request: CameraServerProto.SubscribeStartVideoStreamingRequest):
        Flow<CameraServerProto.StartVideoStreamingResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeStartVideoStreaming is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondStartVideoStreaming.
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
        fun respondStartVideoStreaming(request: CameraServerProto.RespondStartVideoStreamingRequest):
        CameraServerProto.RespondStartVideoStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondStartVideoStreaming is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeStopVideoStreaming.
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
        fun subscribeStopVideoStreaming(request: CameraServerProto.SubscribeStopVideoStreamingRequest):
        Flow<CameraServerProto.StopVideoStreamingResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeStopVideoStreaming is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondStopVideoStreaming.
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
        fun respondStopVideoStreaming(request: CameraServerProto.RespondStopVideoStreamingRequest):
        CameraServerProto.RespondStopVideoStreamingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondStopVideoStreaming is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeSetMode.
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
    public open fun subscribeSetMode(request: CameraServerProto.SubscribeSetModeRequest):
        Flow<CameraServerProto.SetModeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeSetMode is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondSetMode.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun respondSetMode(request: CameraServerProto.RespondSetModeRequest):
        CameraServerProto.RespondSetModeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondSetMode is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeStorageInformation.
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
        fun subscribeStorageInformation(request: CameraServerProto.SubscribeStorageInformationRequest):
        Flow<CameraServerProto.StorageInformationResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeStorageInformation is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondStorageInformation.
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
        fun respondStorageInformation(request: CameraServerProto.RespondStorageInformationRequest):
        CameraServerProto.RespondStorageInformationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondStorageInformation is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeCaptureStatus.
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
        fun subscribeCaptureStatus(request: CameraServerProto.SubscribeCaptureStatusRequest):
        Flow<CameraServerProto.CaptureStatusResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeCaptureStatus is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondCaptureStatus.
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
        fun respondCaptureStatus(request: CameraServerProto.RespondCaptureStatusRequest):
        CameraServerProto.RespondCaptureStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondCaptureStatus is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeFormatStorage.
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
        fun subscribeFormatStorage(request: CameraServerProto.SubscribeFormatStorageRequest):
        Flow<CameraServerProto.FormatStorageResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeFormatStorage is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondFormatStorage.
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
        fun respondFormatStorage(request: CameraServerProto.RespondFormatStorageRequest):
        CameraServerProto.RespondFormatStorageResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondFormatStorage is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeResetSettings.
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
        fun subscribeResetSettings(request: CameraServerProto.SubscribeResetSettingsRequest):
        Flow<CameraServerProto.ResetSettingsResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeResetSettings is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondResetSettings.
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
        fun respondResetSettings(request: CameraServerProto.RespondResetSettingsRequest):
        CameraServerProto.RespondResetSettingsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondResetSettings is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomInStart.
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
    public open fun subscribeZoomInStart(request: CameraServerProto.SubscribeZoomInStartRequest):
        Flow<CameraServerProto.ZoomInStartResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomInStart is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondZoomInStart.
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
        fun respondZoomInStart(request: CameraServerProto.RespondZoomInStartRequest):
        CameraServerProto.RespondZoomInStartResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondZoomInStart is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomOutStart.
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
    public open fun subscribeZoomOutStart(request: CameraServerProto.SubscribeZoomOutStartRequest):
        Flow<CameraServerProto.ZoomOutStartResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomOutStart is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondZoomOutStart.
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
        fun respondZoomOutStart(request: CameraServerProto.RespondZoomOutStartRequest):
        CameraServerProto.RespondZoomOutStartResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondZoomOutStart is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomStop.
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
    public open fun subscribeZoomStop(request: CameraServerProto.SubscribeZoomStopRequest):
        Flow<CameraServerProto.ZoomStopResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomStop is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondZoomStop.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun respondZoomStop(request: CameraServerProto.RespondZoomStopRequest):
        CameraServerProto.RespondZoomStopResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondZoomStop is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomRange.
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
    public open fun subscribeZoomRange(request: CameraServerProto.SubscribeZoomRangeRequest):
        Flow<CameraServerProto.ZoomRangeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeZoomRange is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondZoomRange.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun respondZoomRange(request: CameraServerProto.RespondZoomRangeRequest):
        CameraServerProto.RespondZoomRangeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondZoomRange is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SetTrackingRectangleStatus.
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
        fun setTrackingRectangleStatus(request: CameraServerProto.SetTrackingRectangleStatusRequest):
        CameraServerProto.SetTrackingRectangleStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SetTrackingRectangleStatus is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SetTrackingOffStatus.
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
        fun setTrackingOffStatus(request: CameraServerProto.SetTrackingOffStatusRequest):
        CameraServerProto.SetTrackingOffStatusResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SetTrackingOffStatus is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeTrackingPointCommand.
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
        fun subscribeTrackingPointCommand(request: CameraServerProto.SubscribeTrackingPointCommandRequest):
        Flow<CameraServerProto.TrackingPointCommandResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeTrackingPointCommand is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeTrackingRectangleCommand.
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
        fun subscribeTrackingRectangleCommand(request: CameraServerProto.SubscribeTrackingRectangleCommandRequest):
        Flow<CameraServerProto.TrackingRectangleCommandResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeTrackingRectangleCommand is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.SubscribeTrackingOffCommand.
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
        fun subscribeTrackingOffCommand(request: CameraServerProto.SubscribeTrackingOffCommandRequest):
        Flow<CameraServerProto.TrackingOffCommandResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.SubscribeTrackingOffCommand is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondTrackingPointCommand.
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
        fun respondTrackingPointCommand(request: CameraServerProto.RespondTrackingPointCommandRequest):
        CameraServerProto.RespondTrackingPointCommandResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondTrackingPointCommand is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondTrackingRectangleCommand.
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
        fun respondTrackingRectangleCommand(request: CameraServerProto.RespondTrackingRectangleCommandRequest):
        CameraServerProto.RespondTrackingRectangleCommandResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondTrackingRectangleCommand is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.camera_server.CameraServerService.RespondTrackingOffCommand.
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
        fun respondTrackingOffCommand(request: CameraServerProto.RespondTrackingOffCommandRequest):
        CameraServerProto.RespondTrackingOffCommandResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.camera_server.CameraServerService.RespondTrackingOffCommand is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSetInformationMethod(),
      implementation = ::setInformation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSetVideoStreamingMethod(),
      implementation = ::setVideoStreaming
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSetInProgressMethod(),
      implementation = ::setInProgress
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeTakePhotoMethod(),
      implementation = ::subscribeTakePhoto
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondTakePhotoMethod(),
      implementation = ::respondTakePhoto
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeStartVideoMethod(),
      implementation = ::subscribeStartVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondStartVideoMethod(),
      implementation = ::respondStartVideo
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeStopVideoMethod(),
      implementation = ::subscribeStopVideo
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondStopVideoMethod(),
      implementation = ::respondStopVideo
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeStartVideoStreamingMethod(),
      implementation = ::subscribeStartVideoStreaming
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondStartVideoStreamingMethod(),
      implementation = ::respondStartVideoStreaming
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeStopVideoStreamingMethod(),
      implementation = ::subscribeStopVideoStreaming
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondStopVideoStreamingMethod(),
      implementation = ::respondStopVideoStreaming
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeSetModeMethod(),
      implementation = ::subscribeSetMode
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondSetModeMethod(),
      implementation = ::respondSetMode
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeStorageInformationMethod(),
      implementation = ::subscribeStorageInformation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondStorageInformationMethod(),
      implementation = ::respondStorageInformation
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeCaptureStatusMethod(),
      implementation = ::subscribeCaptureStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondCaptureStatusMethod(),
      implementation = ::respondCaptureStatus
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeFormatStorageMethod(),
      implementation = ::subscribeFormatStorage
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondFormatStorageMethod(),
      implementation = ::respondFormatStorage
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeResetSettingsMethod(),
      implementation = ::subscribeResetSettings
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondResetSettingsMethod(),
      implementation = ::respondResetSettings
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeZoomInStartMethod(),
      implementation = ::subscribeZoomInStart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondZoomInStartMethod(),
      implementation = ::respondZoomInStart
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeZoomOutStartMethod(),
      implementation = ::subscribeZoomOutStart
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondZoomOutStartMethod(),
      implementation = ::respondZoomOutStart
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeZoomStopMethod(),
      implementation = ::subscribeZoomStop
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondZoomStopMethod(),
      implementation = ::respondZoomStop
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeZoomRangeMethod(),
      implementation = ::subscribeZoomRange
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondZoomRangeMethod(),
      implementation = ::respondZoomRange
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSetTrackingRectangleStatusMethod(),
      implementation = ::setTrackingRectangleStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSetTrackingOffStatusMethod(),
      implementation = ::setTrackingOffStatus
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeTrackingPointCommandMethod(),
      implementation = ::subscribeTrackingPointCommand
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeTrackingRectangleCommandMethod(),
      implementation = ::subscribeTrackingRectangleCommand
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getSubscribeTrackingOffCommandMethod(),
      implementation = ::subscribeTrackingOffCommand
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondTrackingPointCommandMethod(),
      implementation = ::respondTrackingPointCommand
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondTrackingRectangleCommandMethod(),
      implementation = ::respondTrackingRectangleCommand
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CameraServerServiceGrpc.getRespondTrackingOffCommandMethod(),
      implementation = ::respondTrackingOffCommand
    )).build()
  }
}
