package io.mavsdk.action_server

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
import io.mavsdk.action_server.ActionServerServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.action_server.ActionServerService.
 */
public object ActionServerServiceGrpcKt {
  public const val SERVICE_NAME: String = ActionServerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeArmDisarmMethod:
      MethodDescriptor<ActionServerProto.SubscribeArmDisarmRequest, ActionServerProto.ArmDisarmResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeArmDisarmMethod()

  public val subscribeFlightModeChangeMethod:
      MethodDescriptor<ActionServerProto.SubscribeFlightModeChangeRequest, ActionServerProto.FlightModeChangeResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeFlightModeChangeMethod()

  public val subscribeTakeoffMethod:
      MethodDescriptor<ActionServerProto.SubscribeTakeoffRequest, ActionServerProto.TakeoffResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeTakeoffMethod()

  public val subscribeLandMethod:
      MethodDescriptor<ActionServerProto.SubscribeLandRequest, ActionServerProto.LandResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeLandMethod()

  public val subscribeRebootMethod:
      MethodDescriptor<ActionServerProto.SubscribeRebootRequest, ActionServerProto.RebootResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeRebootMethod()

  public val subscribeShutdownMethod:
      MethodDescriptor<ActionServerProto.SubscribeShutdownRequest, ActionServerProto.ShutdownResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeShutdownMethod()

  public val subscribeTerminateMethod:
      MethodDescriptor<ActionServerProto.SubscribeTerminateRequest, ActionServerProto.TerminateResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSubscribeTerminateMethod()

  public val setAllowTakeoffMethod:
      MethodDescriptor<ActionServerProto.SetAllowTakeoffRequest, ActionServerProto.SetAllowTakeoffResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSetAllowTakeoffMethod()

  public val setArmableMethod:
      MethodDescriptor<ActionServerProto.SetArmableRequest, ActionServerProto.SetArmableResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSetArmableMethod()

  public val setDisarmableMethod:
      MethodDescriptor<ActionServerProto.SetDisarmableRequest, ActionServerProto.SetDisarmableResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSetDisarmableMethod()

  public val setAllowableFlightModesMethod:
      MethodDescriptor<ActionServerProto.SetAllowableFlightModesRequest, ActionServerProto.SetAllowableFlightModesResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getSetAllowableFlightModesMethod()

  public val getAllowableFlightModesMethod:
      MethodDescriptor<ActionServerProto.GetAllowableFlightModesRequest, ActionServerProto.GetAllowableFlightModesResponse>
    @JvmStatic
    get() = ActionServerServiceGrpc.getGetAllowableFlightModesMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.action_server.ActionServerService service as
   * suspending coroutines.
   */
  @StubFor(ActionServerServiceGrpc::class)
  public class ActionServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ActionServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ActionServerServiceCoroutineStub
        = ActionServerServiceCoroutineStub(channel, callOptions)

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
    public fun subscribeArmDisarm(request: ActionServerProto.SubscribeArmDisarmRequest,
        headers: Metadata = Metadata()): Flow<ActionServerProto.ArmDisarmResponse> =
        serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeArmDisarmMethod(),
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
        fun subscribeFlightModeChange(request: ActionServerProto.SubscribeFlightModeChangeRequest,
        headers: Metadata = Metadata()): Flow<ActionServerProto.FlightModeChangeResponse> =
        serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeFlightModeChangeMethod(),
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
    public fun subscribeTakeoff(request: ActionServerProto.SubscribeTakeoffRequest,
        headers: Metadata = Metadata()): Flow<ActionServerProto.TakeoffResponse> =
        serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeTakeoffMethod(),
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
    public fun subscribeLand(request: ActionServerProto.SubscribeLandRequest, headers: Metadata =
        Metadata()): Flow<ActionServerProto.LandResponse> = serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeLandMethod(),
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
    public fun subscribeReboot(request: ActionServerProto.SubscribeRebootRequest, headers: Metadata
        = Metadata()): Flow<ActionServerProto.RebootResponse> = serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeRebootMethod(),
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
    public fun subscribeShutdown(request: ActionServerProto.SubscribeShutdownRequest,
        headers: Metadata = Metadata()): Flow<ActionServerProto.ShutdownResponse> =
        serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeShutdownMethod(),
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
    public fun subscribeTerminate(request: ActionServerProto.SubscribeTerminateRequest,
        headers: Metadata = Metadata()): Flow<ActionServerProto.TerminateResponse> =
        serverStreamingRpc(
      channel,
      ActionServerServiceGrpc.getSubscribeTerminateMethod(),
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
    public suspend fun setAllowTakeoff(request: ActionServerProto.SetAllowTakeoffRequest,
        headers: Metadata = Metadata()): ActionServerProto.SetAllowTakeoffResponse = unaryRpc(
      channel,
      ActionServerServiceGrpc.getSetAllowTakeoffMethod(),
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
    public suspend fun setArmable(request: ActionServerProto.SetArmableRequest, headers: Metadata =
        Metadata()): ActionServerProto.SetArmableResponse = unaryRpc(
      channel,
      ActionServerServiceGrpc.getSetArmableMethod(),
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
    public suspend fun setDisarmable(request: ActionServerProto.SetDisarmableRequest,
        headers: Metadata = Metadata()): ActionServerProto.SetDisarmableResponse = unaryRpc(
      channel,
      ActionServerServiceGrpc.getSetDisarmableMethod(),
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
        fun setAllowableFlightModes(request: ActionServerProto.SetAllowableFlightModesRequest,
        headers: Metadata = Metadata()): ActionServerProto.SetAllowableFlightModesResponse =
        unaryRpc(
      channel,
      ActionServerServiceGrpc.getSetAllowableFlightModesMethod(),
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
        fun getAllowableFlightModes(request: ActionServerProto.GetAllowableFlightModesRequest,
        headers: Metadata = Metadata()): ActionServerProto.GetAllowableFlightModesResponse =
        unaryRpc(
      channel,
      ActionServerServiceGrpc.getGetAllowableFlightModesMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.action_server.ActionServerService service based on
   * Kotlin coroutines.
   */
  public abstract class ActionServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeArmDisarm.
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
    public open fun subscribeArmDisarm(request: ActionServerProto.SubscribeArmDisarmRequest):
        Flow<ActionServerProto.ArmDisarmResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeArmDisarm is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeFlightModeChange.
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
        fun subscribeFlightModeChange(request: ActionServerProto.SubscribeFlightModeChangeRequest):
        Flow<ActionServerProto.FlightModeChangeResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeFlightModeChange is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeTakeoff.
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
    public open fun subscribeTakeoff(request: ActionServerProto.SubscribeTakeoffRequest):
        Flow<ActionServerProto.TakeoffResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeTakeoff is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeLand.
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
    public open fun subscribeLand(request: ActionServerProto.SubscribeLandRequest):
        Flow<ActionServerProto.LandResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeLand is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeReboot.
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
    public open fun subscribeReboot(request: ActionServerProto.SubscribeRebootRequest):
        Flow<ActionServerProto.RebootResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeReboot is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeShutdown.
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
    public open fun subscribeShutdown(request: ActionServerProto.SubscribeShutdownRequest):
        Flow<ActionServerProto.ShutdownResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeShutdown is unimplemented"))

    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SubscribeTerminate.
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
    public open fun subscribeTerminate(request: ActionServerProto.SubscribeTerminateRequest):
        Flow<ActionServerProto.TerminateResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SubscribeTerminate is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SetAllowTakeoff.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setAllowTakeoff(request: ActionServerProto.SetAllowTakeoffRequest):
        ActionServerProto.SetAllowTakeoffResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SetAllowTakeoff is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action_server.ActionServerService.SetArmable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setArmable(request: ActionServerProto.SetArmableRequest):
        ActionServerProto.SetArmableResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SetArmable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SetDisarmable.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setDisarmable(request: ActionServerProto.SetDisarmableRequest):
        ActionServerProto.SetDisarmableResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SetDisarmable is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.SetAllowableFlightModes.
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
        fun setAllowableFlightModes(request: ActionServerProto.SetAllowableFlightModesRequest):
        ActionServerProto.SetAllowableFlightModesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.SetAllowableFlightModes is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.action_server.ActionServerService.GetAllowableFlightModes.
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
        fun getAllowableFlightModes(request: ActionServerProto.GetAllowableFlightModesRequest):
        ActionServerProto.GetAllowableFlightModesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action_server.ActionServerService.GetAllowableFlightModes is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeArmDisarmMethod(),
      implementation = ::subscribeArmDisarm
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeFlightModeChangeMethod(),
      implementation = ::subscribeFlightModeChange
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeTakeoffMethod(),
      implementation = ::subscribeTakeoff
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeLandMethod(),
      implementation = ::subscribeLand
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeRebootMethod(),
      implementation = ::subscribeReboot
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeShutdownMethod(),
      implementation = ::subscribeShutdown
    ))
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSubscribeTerminateMethod(),
      implementation = ::subscribeTerminate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSetAllowTakeoffMethod(),
      implementation = ::setAllowTakeoff
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSetArmableMethod(),
      implementation = ::setArmable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSetDisarmableMethod(),
      implementation = ::setDisarmable
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getSetAllowableFlightModesMethod(),
      implementation = ::setAllowableFlightModes
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServerServiceGrpc.getGetAllowableFlightModesMethod(),
      implementation = ::getAllowableFlightModes
    )).build()
  }
}
