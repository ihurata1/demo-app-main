package io.mavsdk.action

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
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import io.mavsdk.action.ActionServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.action.ActionService.
 */
public object ActionServiceGrpcKt {
  public const val SERVICE_NAME: String = ActionServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val armMethod: MethodDescriptor<ActionProto.ArmRequest, ActionProto.ArmResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getArmMethod()

  public val armForceMethod:
      MethodDescriptor<ActionProto.ArmForceRequest, ActionProto.ArmForceResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getArmForceMethod()

  public val disarmMethod: MethodDescriptor<ActionProto.DisarmRequest, ActionProto.DisarmResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getDisarmMethod()

  public val takeoffMethod:
      MethodDescriptor<ActionProto.TakeoffRequest, ActionProto.TakeoffResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getTakeoffMethod()

  public val landMethod: MethodDescriptor<ActionProto.LandRequest, ActionProto.LandResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getLandMethod()

  public val rebootMethod: MethodDescriptor<ActionProto.RebootRequest, ActionProto.RebootResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getRebootMethod()

  public val shutdownMethod:
      MethodDescriptor<ActionProto.ShutdownRequest, ActionProto.ShutdownResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getShutdownMethod()

  public val terminateMethod:
      MethodDescriptor<ActionProto.TerminateRequest, ActionProto.TerminateResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getTerminateMethod()

  public val killMethod: MethodDescriptor<ActionProto.KillRequest, ActionProto.KillResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getKillMethod()

  public val returnToLaunchMethod:
      MethodDescriptor<ActionProto.ReturnToLaunchRequest, ActionProto.ReturnToLaunchResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getReturnToLaunchMethod()

  public val gotoLocationMethod:
      MethodDescriptor<ActionProto.GotoLocationRequest, ActionProto.GotoLocationResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getGotoLocationMethod()

  public val doOrbitMethod:
      MethodDescriptor<ActionProto.DoOrbitRequest, ActionProto.DoOrbitResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getDoOrbitMethod()

  public val holdMethod: MethodDescriptor<ActionProto.HoldRequest, ActionProto.HoldResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getHoldMethod()

  public val setActuatorMethod:
      MethodDescriptor<ActionProto.SetActuatorRequest, ActionProto.SetActuatorResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getSetActuatorMethod()

  public val transitionToFixedwingMethod:
      MethodDescriptor<ActionProto.TransitionToFixedwingRequest, ActionProto.TransitionToFixedwingResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getTransitionToFixedwingMethod()

  public val transitionToMulticopterMethod:
      MethodDescriptor<ActionProto.TransitionToMulticopterRequest, ActionProto.TransitionToMulticopterResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getTransitionToMulticopterMethod()

  public val getTakeoffAltitudeMethod:
      MethodDescriptor<ActionProto.GetTakeoffAltitudeRequest, ActionProto.GetTakeoffAltitudeResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getGetTakeoffAltitudeMethod()

  public val setTakeoffAltitudeMethod:
      MethodDescriptor<ActionProto.SetTakeoffAltitudeRequest, ActionProto.SetTakeoffAltitudeResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getSetTakeoffAltitudeMethod()

  public val getMaximumSpeedMethod:
      MethodDescriptor<ActionProto.GetMaximumSpeedRequest, ActionProto.GetMaximumSpeedResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getGetMaximumSpeedMethod()

  public val setMaximumSpeedMethod:
      MethodDescriptor<ActionProto.SetMaximumSpeedRequest, ActionProto.SetMaximumSpeedResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getSetMaximumSpeedMethod()

  public val getReturnToLaunchAltitudeMethod:
      MethodDescriptor<ActionProto.GetReturnToLaunchAltitudeRequest, ActionProto.GetReturnToLaunchAltitudeResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getGetReturnToLaunchAltitudeMethod()

  public val setReturnToLaunchAltitudeMethod:
      MethodDescriptor<ActionProto.SetReturnToLaunchAltitudeRequest, ActionProto.SetReturnToLaunchAltitudeResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getSetReturnToLaunchAltitudeMethod()

  public val setCurrentSpeedMethod:
      MethodDescriptor<ActionProto.SetCurrentSpeedRequest, ActionProto.SetCurrentSpeedResponse>
    @JvmStatic
    get() = ActionServiceGrpc.getSetCurrentSpeedMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.action.ActionService service as suspending
   * coroutines.
   */
  @StubFor(ActionServiceGrpc::class)
  public class ActionServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ActionServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ActionServiceCoroutineStub =
        ActionServiceCoroutineStub(channel, callOptions)

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
    public suspend fun arm(request: ActionProto.ArmRequest, headers: Metadata = Metadata()):
        ActionProto.ArmResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getArmMethod(),
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
    public suspend fun armForce(request: ActionProto.ArmForceRequest, headers: Metadata =
        Metadata()): ActionProto.ArmForceResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getArmForceMethod(),
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
    public suspend fun disarm(request: ActionProto.DisarmRequest, headers: Metadata = Metadata()):
        ActionProto.DisarmResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getDisarmMethod(),
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
    public suspend fun takeoff(request: ActionProto.TakeoffRequest, headers: Metadata = Metadata()):
        ActionProto.TakeoffResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getTakeoffMethod(),
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
    public suspend fun land(request: ActionProto.LandRequest, headers: Metadata = Metadata()):
        ActionProto.LandResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getLandMethod(),
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
    public suspend fun reboot(request: ActionProto.RebootRequest, headers: Metadata = Metadata()):
        ActionProto.RebootResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getRebootMethod(),
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
    public suspend fun shutdown(request: ActionProto.ShutdownRequest, headers: Metadata =
        Metadata()): ActionProto.ShutdownResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getShutdownMethod(),
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
    public suspend fun terminate(request: ActionProto.TerminateRequest, headers: Metadata =
        Metadata()): ActionProto.TerminateResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getTerminateMethod(),
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
    public suspend fun kill(request: ActionProto.KillRequest, headers: Metadata = Metadata()):
        ActionProto.KillResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getKillMethod(),
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
    public suspend fun returnToLaunch(request: ActionProto.ReturnToLaunchRequest, headers: Metadata
        = Metadata()): ActionProto.ReturnToLaunchResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getReturnToLaunchMethod(),
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
    public suspend fun gotoLocation(request: ActionProto.GotoLocationRequest, headers: Metadata =
        Metadata()): ActionProto.GotoLocationResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getGotoLocationMethod(),
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
    public suspend fun doOrbit(request: ActionProto.DoOrbitRequest, headers: Metadata = Metadata()):
        ActionProto.DoOrbitResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getDoOrbitMethod(),
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
    public suspend fun hold(request: ActionProto.HoldRequest, headers: Metadata = Metadata()):
        ActionProto.HoldResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getHoldMethod(),
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
    public suspend fun setActuator(request: ActionProto.SetActuatorRequest, headers: Metadata =
        Metadata()): ActionProto.SetActuatorResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getSetActuatorMethod(),
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
    public suspend fun transitionToFixedwing(request: ActionProto.TransitionToFixedwingRequest,
        headers: Metadata = Metadata()): ActionProto.TransitionToFixedwingResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getTransitionToFixedwingMethod(),
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
    public suspend fun transitionToMulticopter(request: ActionProto.TransitionToMulticopterRequest,
        headers: Metadata = Metadata()): ActionProto.TransitionToMulticopterResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getTransitionToMulticopterMethod(),
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
    public suspend fun getTakeoffAltitude(request: ActionProto.GetTakeoffAltitudeRequest,
        headers: Metadata = Metadata()): ActionProto.GetTakeoffAltitudeResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getGetTakeoffAltitudeMethod(),
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
    public suspend fun setTakeoffAltitude(request: ActionProto.SetTakeoffAltitudeRequest,
        headers: Metadata = Metadata()): ActionProto.SetTakeoffAltitudeResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getSetTakeoffAltitudeMethod(),
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
    public suspend fun getMaximumSpeed(request: ActionProto.GetMaximumSpeedRequest,
        headers: Metadata = Metadata()): ActionProto.GetMaximumSpeedResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getGetMaximumSpeedMethod(),
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
    public suspend fun setMaximumSpeed(request: ActionProto.SetMaximumSpeedRequest,
        headers: Metadata = Metadata()): ActionProto.SetMaximumSpeedResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getSetMaximumSpeedMethod(),
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
        fun getReturnToLaunchAltitude(request: ActionProto.GetReturnToLaunchAltitudeRequest,
        headers: Metadata = Metadata()): ActionProto.GetReturnToLaunchAltitudeResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getGetReturnToLaunchAltitudeMethod(),
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
        fun setReturnToLaunchAltitude(request: ActionProto.SetReturnToLaunchAltitudeRequest,
        headers: Metadata = Metadata()): ActionProto.SetReturnToLaunchAltitudeResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getSetReturnToLaunchAltitudeMethod(),
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
    public suspend fun setCurrentSpeed(request: ActionProto.SetCurrentSpeedRequest,
        headers: Metadata = Metadata()): ActionProto.SetCurrentSpeedResponse = unaryRpc(
      channel,
      ActionServiceGrpc.getSetCurrentSpeedMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.action.ActionService service based on Kotlin
   * coroutines.
   */
  public abstract class ActionServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Arm.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun arm(request: ActionProto.ArmRequest): ActionProto.ArmResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Arm is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.ArmForce.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun armForce(request: ActionProto.ArmForceRequest):
        ActionProto.ArmForceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.ArmForce is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Disarm.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun disarm(request: ActionProto.DisarmRequest): ActionProto.DisarmResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Disarm is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Takeoff.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun takeoff(request: ActionProto.TakeoffRequest):
        ActionProto.TakeoffResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Takeoff is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Land.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun land(request: ActionProto.LandRequest): ActionProto.LandResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Land is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Reboot.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun reboot(request: ActionProto.RebootRequest): ActionProto.RebootResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Reboot is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Shutdown.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun shutdown(request: ActionProto.ShutdownRequest):
        ActionProto.ShutdownResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Shutdown is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Terminate.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun terminate(request: ActionProto.TerminateRequest):
        ActionProto.TerminateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Terminate is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Kill.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun kill(request: ActionProto.KillRequest): ActionProto.KillResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Kill is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.ReturnToLaunch.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun returnToLaunch(request: ActionProto.ReturnToLaunchRequest):
        ActionProto.ReturnToLaunchResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.ReturnToLaunch is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.GotoLocation.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun gotoLocation(request: ActionProto.GotoLocationRequest):
        ActionProto.GotoLocationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.GotoLocation is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.DoOrbit.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun doOrbit(request: ActionProto.DoOrbitRequest):
        ActionProto.DoOrbitResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.DoOrbit is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.Hold.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun hold(request: ActionProto.HoldRequest): ActionProto.HoldResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.Hold is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.SetActuator.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setActuator(request: ActionProto.SetActuatorRequest):
        ActionProto.SetActuatorResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.SetActuator is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.TransitionToFixedwing.
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
        fun transitionToFixedwing(request: ActionProto.TransitionToFixedwingRequest):
        ActionProto.TransitionToFixedwingResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.TransitionToFixedwing is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.TransitionToMulticopter.
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
        fun transitionToMulticopter(request: ActionProto.TransitionToMulticopterRequest):
        ActionProto.TransitionToMulticopterResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.TransitionToMulticopter is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.GetTakeoffAltitude.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTakeoffAltitude(request: ActionProto.GetTakeoffAltitudeRequest):
        ActionProto.GetTakeoffAltitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.GetTakeoffAltitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.SetTakeoffAltitude.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setTakeoffAltitude(request: ActionProto.SetTakeoffAltitudeRequest):
        ActionProto.SetTakeoffAltitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.SetTakeoffAltitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.GetMaximumSpeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMaximumSpeed(request: ActionProto.GetMaximumSpeedRequest):
        ActionProto.GetMaximumSpeedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.GetMaximumSpeed is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.SetMaximumSpeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setMaximumSpeed(request: ActionProto.SetMaximumSpeedRequest):
        ActionProto.SetMaximumSpeedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.SetMaximumSpeed is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.GetReturnToLaunchAltitude.
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
        fun getReturnToLaunchAltitude(request: ActionProto.GetReturnToLaunchAltitudeRequest):
        ActionProto.GetReturnToLaunchAltitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.GetReturnToLaunchAltitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.SetReturnToLaunchAltitude.
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
        fun setReturnToLaunchAltitude(request: ActionProto.SetReturnToLaunchAltitudeRequest):
        ActionProto.SetReturnToLaunchAltitudeResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.SetReturnToLaunchAltitude is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.action.ActionService.SetCurrentSpeed.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setCurrentSpeed(request: ActionProto.SetCurrentSpeedRequest):
        ActionProto.SetCurrentSpeedResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.action.ActionService.SetCurrentSpeed is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getArmMethod(),
      implementation = ::arm
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getArmForceMethod(),
      implementation = ::armForce
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getDisarmMethod(),
      implementation = ::disarm
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getTakeoffMethod(),
      implementation = ::takeoff
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getLandMethod(),
      implementation = ::land
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getRebootMethod(),
      implementation = ::reboot
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getShutdownMethod(),
      implementation = ::shutdown
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getTerminateMethod(),
      implementation = ::terminate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getKillMethod(),
      implementation = ::kill
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getReturnToLaunchMethod(),
      implementation = ::returnToLaunch
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getGotoLocationMethod(),
      implementation = ::gotoLocation
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getDoOrbitMethod(),
      implementation = ::doOrbit
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getHoldMethod(),
      implementation = ::hold
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getSetActuatorMethod(),
      implementation = ::setActuator
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getTransitionToFixedwingMethod(),
      implementation = ::transitionToFixedwing
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getTransitionToMulticopterMethod(),
      implementation = ::transitionToMulticopter
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getGetTakeoffAltitudeMethod(),
      implementation = ::getTakeoffAltitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getSetTakeoffAltitudeMethod(),
      implementation = ::setTakeoffAltitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getGetMaximumSpeedMethod(),
      implementation = ::getMaximumSpeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getSetMaximumSpeedMethod(),
      implementation = ::setMaximumSpeed
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getGetReturnToLaunchAltitudeMethod(),
      implementation = ::getReturnToLaunchAltitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getSetReturnToLaunchAltitudeMethod(),
      implementation = ::setReturnToLaunchAltitude
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ActionServiceGrpc.getSetCurrentSpeedMethod(),
      implementation = ::setCurrentSpeed
    )).build()
  }
}
