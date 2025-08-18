package io.mavsdk.winch

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
import io.mavsdk.winch.WinchServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.winch.WinchService.
 */
public object WinchServiceGrpcKt {
  public const val SERVICE_NAME: String = WinchServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeStatusMethod:
      MethodDescriptor<WinchProto.SubscribeStatusRequest, WinchProto.StatusResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getSubscribeStatusMethod()

  public val relaxMethod: MethodDescriptor<WinchProto.RelaxRequest, WinchProto.RelaxResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getRelaxMethod()

  public val relativeLengthControlMethod:
      MethodDescriptor<WinchProto.RelativeLengthControlRequest, WinchProto.RelativeLengthControlResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getRelativeLengthControlMethod()

  public val rateControlMethod:
      MethodDescriptor<WinchProto.RateControlRequest, WinchProto.RateControlResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getRateControlMethod()

  public val lockMethod: MethodDescriptor<WinchProto.LockRequest, WinchProto.LockResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getLockMethod()

  public val deliverMethod: MethodDescriptor<WinchProto.DeliverRequest, WinchProto.DeliverResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getDeliverMethod()

  public val holdMethod: MethodDescriptor<WinchProto.HoldRequest, WinchProto.HoldResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getHoldMethod()

  public val retractMethod: MethodDescriptor<WinchProto.RetractRequest, WinchProto.RetractResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getRetractMethod()

  public val loadLineMethod:
      MethodDescriptor<WinchProto.LoadLineRequest, WinchProto.LoadLineResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getLoadLineMethod()

  public val abandonLineMethod:
      MethodDescriptor<WinchProto.AbandonLineRequest, WinchProto.AbandonLineResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getAbandonLineMethod()

  public val loadPayloadMethod:
      MethodDescriptor<WinchProto.LoadPayloadRequest, WinchProto.LoadPayloadResponse>
    @JvmStatic
    get() = WinchServiceGrpc.getLoadPayloadMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.winch.WinchService service as suspending coroutines.
   */
  @StubFor(WinchServiceGrpc::class)
  public class WinchServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<WinchServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): WinchServiceCoroutineStub =
        WinchServiceCoroutineStub(channel, callOptions)

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
    public fun subscribeStatus(request: WinchProto.SubscribeStatusRequest, headers: Metadata =
        Metadata()): Flow<WinchProto.StatusResponse> = serverStreamingRpc(
      channel,
      WinchServiceGrpc.getSubscribeStatusMethod(),
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
    public suspend fun relax(request: WinchProto.RelaxRequest, headers: Metadata = Metadata()):
        WinchProto.RelaxResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getRelaxMethod(),
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
    public suspend fun relativeLengthControl(request: WinchProto.RelativeLengthControlRequest,
        headers: Metadata = Metadata()): WinchProto.RelativeLengthControlResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getRelativeLengthControlMethod(),
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
    public suspend fun rateControl(request: WinchProto.RateControlRequest, headers: Metadata =
        Metadata()): WinchProto.RateControlResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getRateControlMethod(),
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
    public suspend fun lock(request: WinchProto.LockRequest, headers: Metadata = Metadata()):
        WinchProto.LockResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getLockMethod(),
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
    public suspend fun deliver(request: WinchProto.DeliverRequest, headers: Metadata = Metadata()):
        WinchProto.DeliverResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getDeliverMethod(),
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
    public suspend fun hold(request: WinchProto.HoldRequest, headers: Metadata = Metadata()):
        WinchProto.HoldResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getHoldMethod(),
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
    public suspend fun retract(request: WinchProto.RetractRequest, headers: Metadata = Metadata()):
        WinchProto.RetractResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getRetractMethod(),
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
    public suspend fun loadLine(request: WinchProto.LoadLineRequest, headers: Metadata =
        Metadata()): WinchProto.LoadLineResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getLoadLineMethod(),
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
    public suspend fun abandonLine(request: WinchProto.AbandonLineRequest, headers: Metadata =
        Metadata()): WinchProto.AbandonLineResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getAbandonLineMethod(),
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
    public suspend fun loadPayload(request: WinchProto.LoadPayloadRequest, headers: Metadata =
        Metadata()): WinchProto.LoadPayloadResponse = unaryRpc(
      channel,
      WinchServiceGrpc.getLoadPayloadMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.winch.WinchService service based on Kotlin
   * coroutines.
   */
  public abstract class WinchServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for mavsdk.rpc.winch.WinchService.SubscribeStatus.
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
    public open fun subscribeStatus(request: WinchProto.SubscribeStatusRequest):
        Flow<WinchProto.StatusResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.SubscribeStatus is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.Relax.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun relax(request: WinchProto.RelaxRequest): WinchProto.RelaxResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.Relax is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.RelativeLengthControl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun relativeLengthControl(request: WinchProto.RelativeLengthControlRequest):
        WinchProto.RelativeLengthControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.RelativeLengthControl is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.RateControl.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun rateControl(request: WinchProto.RateControlRequest):
        WinchProto.RateControlResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.RateControl is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.Lock.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun lock(request: WinchProto.LockRequest): WinchProto.LockResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.Lock is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.Deliver.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deliver(request: WinchProto.DeliverRequest): WinchProto.DeliverResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.Deliver is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.Hold.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun hold(request: WinchProto.HoldRequest): WinchProto.HoldResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.Hold is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.Retract.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun retract(request: WinchProto.RetractRequest): WinchProto.RetractResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.Retract is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.LoadLine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loadLine(request: WinchProto.LoadLineRequest):
        WinchProto.LoadLineResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.LoadLine is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.AbandonLine.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun abandonLine(request: WinchProto.AbandonLineRequest):
        WinchProto.AbandonLineResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.AbandonLine is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.winch.WinchService.LoadPayload.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun loadPayload(request: WinchProto.LoadPayloadRequest):
        WinchProto.LoadPayloadResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.winch.WinchService.LoadPayload is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getSubscribeStatusMethod(),
      implementation = ::subscribeStatus
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getRelaxMethod(),
      implementation = ::relax
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getRelativeLengthControlMethod(),
      implementation = ::relativeLengthControl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getRateControlMethod(),
      implementation = ::rateControl
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getLockMethod(),
      implementation = ::lock
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getDeliverMethod(),
      implementation = ::deliver
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getHoldMethod(),
      implementation = ::hold
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getRetractMethod(),
      implementation = ::retract
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getLoadLineMethod(),
      implementation = ::loadLine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getAbandonLineMethod(),
      implementation = ::abandonLine
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = WinchServiceGrpc.getLoadPayloadMethod(),
      implementation = ::loadPayload
    )).build()
  }
}
