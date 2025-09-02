package io.mavsdk.manual_control

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
import io.mavsdk.manual_control.ManualControlServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.manual_control.ManualControlService.
 */
public object ManualControlServiceGrpcKt {
  public const val SERVICE_NAME: String = ManualControlServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val startPositionControlMethod:
      MethodDescriptor<ManualControlProto.StartPositionControlRequest, ManualControlProto.StartPositionControlResponse>
    @JvmStatic
    get() = ManualControlServiceGrpc.getStartPositionControlMethod()

  public val startAltitudeControlMethod:
      MethodDescriptor<ManualControlProto.StartAltitudeControlRequest, ManualControlProto.StartAltitudeControlResponse>
    @JvmStatic
    get() = ManualControlServiceGrpc.getStartAltitudeControlMethod()

  public val setManualControlInputMethod:
      MethodDescriptor<ManualControlProto.SetManualControlInputRequest, ManualControlProto.SetManualControlInputResponse>
    @JvmStatic
    get() = ManualControlServiceGrpc.getSetManualControlInputMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.manual_control.ManualControlService service as
   * suspending coroutines.
   */
  @StubFor(ManualControlServiceGrpc::class)
  public class ManualControlServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ManualControlServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ManualControlServiceCoroutineStub = ManualControlServiceCoroutineStub(channel, callOptions)

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
    public suspend fun startPositionControl(request: ManualControlProto.StartPositionControlRequest,
        headers: Metadata = Metadata()): ManualControlProto.StartPositionControlResponse = unaryRpc(
      channel,
      ManualControlServiceGrpc.getStartPositionControlMethod(),
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
    public suspend fun startAltitudeControl(request: ManualControlProto.StartAltitudeControlRequest,
        headers: Metadata = Metadata()): ManualControlProto.StartAltitudeControlResponse = unaryRpc(
      channel,
      ManualControlServiceGrpc.getStartAltitudeControlMethod(),
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
        fun setManualControlInput(request: ManualControlProto.SetManualControlInputRequest,
        headers: Metadata = Metadata()): ManualControlProto.SetManualControlInputResponse =
        unaryRpc(
      channel,
      ManualControlServiceGrpc.getSetManualControlInputMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.manual_control.ManualControlService service based on
   * Kotlin coroutines.
   */
  public abstract class ManualControlServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.manual_control.ManualControlService.StartPositionControl.
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
        fun startPositionControl(request: ManualControlProto.StartPositionControlRequest):
        ManualControlProto.StartPositionControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.manual_control.ManualControlService.StartPositionControl is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.manual_control.ManualControlService.StartAltitudeControl.
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
        fun startAltitudeControl(request: ManualControlProto.StartAltitudeControlRequest):
        ManualControlProto.StartAltitudeControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.manual_control.ManualControlService.StartAltitudeControl is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.manual_control.ManualControlService.SetManualControlInput.
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
        fun setManualControlInput(request: ManualControlProto.SetManualControlInputRequest):
        ManualControlProto.SetManualControlInputResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.manual_control.ManualControlService.SetManualControlInput is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ManualControlServiceGrpc.getStartPositionControlMethod(),
      implementation = ::startPositionControl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ManualControlServiceGrpc.getStartAltitudeControlMethod(),
      implementation = ::startAltitudeControl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ManualControlServiceGrpc.getSetManualControlInputMethod(),
      implementation = ::setManualControlInput
    )).build()
  }
}
