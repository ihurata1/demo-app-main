package io.mavsdk.gripper

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
import io.mavsdk.gripper.GripperServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.gripper.GripperService.
 */
public object GripperServiceGrpcKt {
  public const val SERVICE_NAME: String = GripperServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val grabMethod: MethodDescriptor<GripperProto.GrabRequest, GripperProto.GrabResponse>
    @JvmStatic
    get() = GripperServiceGrpc.getGrabMethod()

  public val releaseMethod:
      MethodDescriptor<GripperProto.ReleaseRequest, GripperProto.ReleaseResponse>
    @JvmStatic
    get() = GripperServiceGrpc.getReleaseMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.gripper.GripperService service as suspending
   * coroutines.
   */
  @StubFor(GripperServiceGrpc::class)
  public class GripperServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GripperServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GripperServiceCoroutineStub =
        GripperServiceCoroutineStub(channel, callOptions)

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
    public suspend fun grab(request: GripperProto.GrabRequest, headers: Metadata = Metadata()):
        GripperProto.GrabResponse = unaryRpc(
      channel,
      GripperServiceGrpc.getGrabMethod(),
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
    public suspend fun release(request: GripperProto.ReleaseRequest, headers: Metadata =
        Metadata()): GripperProto.ReleaseResponse = unaryRpc(
      channel,
      GripperServiceGrpc.getReleaseMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.gripper.GripperService service based on Kotlin
   * coroutines.
   */
  public abstract class GripperServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.gripper.GripperService.Grab.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun grab(request: GripperProto.GrabRequest): GripperProto.GrabResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gripper.GripperService.Grab is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.gripper.GripperService.Release.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun release(request: GripperProto.ReleaseRequest):
        GripperProto.ReleaseResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.gripper.GripperService.Release is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GripperServiceGrpc.getGrabMethod(),
      implementation = ::grab
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GripperServiceGrpc.getReleaseMethod(),
      implementation = ::release
    )).build()
  }
}
