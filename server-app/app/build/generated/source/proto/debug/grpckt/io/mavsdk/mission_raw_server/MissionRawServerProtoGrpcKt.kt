package io.mavsdk.mission_raw_server

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
import io.mavsdk.mission_raw_server.MissionRawServerServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.mission_raw_server.MissionRawServerService.
 */
public object MissionRawServerServiceGrpcKt {
  public const val SERVICE_NAME: String = MissionRawServerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeIncomingMissionMethod:
      MethodDescriptor<MissionRawServerProto.SubscribeIncomingMissionRequest, MissionRawServerProto.IncomingMissionResponse>
    @JvmStatic
    get() = MissionRawServerServiceGrpc.getSubscribeIncomingMissionMethod()

  public val subscribeCurrentItemChangedMethod:
      MethodDescriptor<MissionRawServerProto.SubscribeCurrentItemChangedRequest, MissionRawServerProto.CurrentItemChangedResponse>
    @JvmStatic
    get() = MissionRawServerServiceGrpc.getSubscribeCurrentItemChangedMethod()

  public val setCurrentItemCompleteMethod:
      MethodDescriptor<MissionRawServerProto.SetCurrentItemCompleteRequest, MissionRawServerProto.SetCurrentItemCompleteResponse>
    @JvmStatic
    get() = MissionRawServerServiceGrpc.getSetCurrentItemCompleteMethod()

  public val subscribeClearAllMethod:
      MethodDescriptor<MissionRawServerProto.SubscribeClearAllRequest, MissionRawServerProto.ClearAllResponse>
    @JvmStatic
    get() = MissionRawServerServiceGrpc.getSubscribeClearAllMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.mission_raw_server.MissionRawServerService service
   * as suspending coroutines.
   */
  @StubFor(MissionRawServerServiceGrpc::class)
  public class MissionRawServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MissionRawServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        MissionRawServerServiceCoroutineStub = MissionRawServerServiceCoroutineStub(channel,
        callOptions)

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
        fun subscribeIncomingMission(request: MissionRawServerProto.SubscribeIncomingMissionRequest,
        headers: Metadata = Metadata()): Flow<MissionRawServerProto.IncomingMissionResponse> =
        serverStreamingRpc(
      channel,
      MissionRawServerServiceGrpc.getSubscribeIncomingMissionMethod(),
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
        fun subscribeCurrentItemChanged(request: MissionRawServerProto.SubscribeCurrentItemChangedRequest,
        headers: Metadata = Metadata()): Flow<MissionRawServerProto.CurrentItemChangedResponse> =
        serverStreamingRpc(
      channel,
      MissionRawServerServiceGrpc.getSubscribeCurrentItemChangedMethod(),
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
        fun setCurrentItemComplete(request: MissionRawServerProto.SetCurrentItemCompleteRequest,
        headers: Metadata = Metadata()): MissionRawServerProto.SetCurrentItemCompleteResponse =
        unaryRpc(
      channel,
      MissionRawServerServiceGrpc.getSetCurrentItemCompleteMethod(),
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
    public fun subscribeClearAll(request: MissionRawServerProto.SubscribeClearAllRequest,
        headers: Metadata = Metadata()): Flow<MissionRawServerProto.ClearAllResponse> =
        serverStreamingRpc(
      channel,
      MissionRawServerServiceGrpc.getSubscribeClearAllMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.mission_raw_server.MissionRawServerService service
   * based on Kotlin coroutines.
   */
  public abstract class MissionRawServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission_raw_server.MissionRawServerService.SubscribeIncomingMission.
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
        fun subscribeIncomingMission(request: MissionRawServerProto.SubscribeIncomingMissionRequest):
        Flow<MissionRawServerProto.IncomingMissionResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw_server.MissionRawServerService.SubscribeIncomingMission is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission_raw_server.MissionRawServerService.SubscribeCurrentItemChanged.
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
        fun subscribeCurrentItemChanged(request: MissionRawServerProto.SubscribeCurrentItemChangedRequest):
        Flow<MissionRawServerProto.CurrentItemChangedResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw_server.MissionRawServerService.SubscribeCurrentItemChanged is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.mission_raw_server.MissionRawServerService.SetCurrentItemComplete.
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
        fun setCurrentItemComplete(request: MissionRawServerProto.SetCurrentItemCompleteRequest):
        MissionRawServerProto.SetCurrentItemCompleteResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw_server.MissionRawServerService.SetCurrentItemComplete is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.mission_raw_server.MissionRawServerService.SubscribeClearAll.
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
    public open fun subscribeClearAll(request: MissionRawServerProto.SubscribeClearAllRequest):
        Flow<MissionRawServerProto.ClearAllResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mission_raw_server.MissionRawServerService.SubscribeClearAll is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServerServiceGrpc.getSubscribeIncomingMissionMethod(),
      implementation = ::subscribeIncomingMission
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServerServiceGrpc.getSubscribeCurrentItemChangedMethod(),
      implementation = ::subscribeCurrentItemChanged
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServerServiceGrpc.getSetCurrentItemCompleteMethod(),
      implementation = ::setCurrentItemComplete
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = MissionRawServerServiceGrpc.getSubscribeClearAllMethod(),
      implementation = ::subscribeClearAll
    )).build()
  }
}
