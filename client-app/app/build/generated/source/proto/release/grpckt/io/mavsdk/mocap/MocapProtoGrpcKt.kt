package io.mavsdk.mocap

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
import io.mavsdk.mocap.MocapServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.mocap.MocapService.
 */
public object MocapServiceGrpcKt {
  public const val SERVICE_NAME: String = MocapServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val setVisionPositionEstimateMethod:
      MethodDescriptor<MocapProto.SetVisionPositionEstimateRequest, MocapProto.SetVisionPositionEstimateResponse>
    @JvmStatic
    get() = MocapServiceGrpc.getSetVisionPositionEstimateMethod()

  public val setAttitudePositionMocapMethod:
      MethodDescriptor<MocapProto.SetAttitudePositionMocapRequest, MocapProto.SetAttitudePositionMocapResponse>
    @JvmStatic
    get() = MocapServiceGrpc.getSetAttitudePositionMocapMethod()

  public val setOdometryMethod:
      MethodDescriptor<MocapProto.SetOdometryRequest, MocapProto.SetOdometryResponse>
    @JvmStatic
    get() = MocapServiceGrpc.getSetOdometryMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.mocap.MocapService service as suspending coroutines.
   */
  @StubFor(MocapServiceGrpc::class)
  public class MocapServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<MocapServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): MocapServiceCoroutineStub =
        MocapServiceCoroutineStub(channel, callOptions)

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
        fun setVisionPositionEstimate(request: MocapProto.SetVisionPositionEstimateRequest,
        headers: Metadata = Metadata()): MocapProto.SetVisionPositionEstimateResponse = unaryRpc(
      channel,
      MocapServiceGrpc.getSetVisionPositionEstimateMethod(),
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
    public suspend fun setAttitudePositionMocap(request: MocapProto.SetAttitudePositionMocapRequest,
        headers: Metadata = Metadata()): MocapProto.SetAttitudePositionMocapResponse = unaryRpc(
      channel,
      MocapServiceGrpc.getSetAttitudePositionMocapMethod(),
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
    public suspend fun setOdometry(request: MocapProto.SetOdometryRequest, headers: Metadata =
        Metadata()): MocapProto.SetOdometryResponse = unaryRpc(
      channel,
      MocapServiceGrpc.getSetOdometryMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.mocap.MocapService service based on Kotlin
   * coroutines.
   */
  public abstract class MocapServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.mocap.MocapService.SetVisionPositionEstimate.
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
        fun setVisionPositionEstimate(request: MocapProto.SetVisionPositionEstimateRequest):
        MocapProto.SetVisionPositionEstimateResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mocap.MocapService.SetVisionPositionEstimate is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mocap.MocapService.SetAttitudePositionMocap.
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
        fun setAttitudePositionMocap(request: MocapProto.SetAttitudePositionMocapRequest):
        MocapProto.SetAttitudePositionMocapResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mocap.MocapService.SetAttitudePositionMocap is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.mocap.MocapService.SetOdometry.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun setOdometry(request: MocapProto.SetOdometryRequest):
        MocapProto.SetOdometryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.mocap.MocapService.SetOdometry is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MocapServiceGrpc.getSetVisionPositionEstimateMethod(),
      implementation = ::setVisionPositionEstimate
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MocapServiceGrpc.getSetAttitudePositionMocapMethod(),
      implementation = ::setAttitudePositionMocap
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = MocapServiceGrpc.getSetOdometryMethod(),
      implementation = ::setOdometry
    )).build()
  }
}
