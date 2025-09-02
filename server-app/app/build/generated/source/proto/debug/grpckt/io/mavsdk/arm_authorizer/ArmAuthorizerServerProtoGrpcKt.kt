package io.mavsdk.arm_authorizer

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
import io.mavsdk.arm_authorizer.ArmAuthorizerServerServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic
import kotlinx.coroutines.flow.Flow

/**
 * Holder for Kotlin coroutine-based client and server APIs for
 * mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.
 */
public object ArmAuthorizerServerServiceGrpcKt {
  public const val SERVICE_NAME: String = ArmAuthorizerServerServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val subscribeArmAuthorizationMethod:
      MethodDescriptor<ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest, ArmAuthorizerServerProto.ArmAuthorizationResponse>
    @JvmStatic
    get() = ArmAuthorizerServerServiceGrpc.getSubscribeArmAuthorizationMethod()

  public val acceptArmAuthorizationMethod:
      MethodDescriptor<ArmAuthorizerServerProto.AcceptArmAuthorizationRequest, ArmAuthorizerServerProto.AcceptArmAuthorizationResponse>
    @JvmStatic
    get() = ArmAuthorizerServerServiceGrpc.getAcceptArmAuthorizationMethod()

  public val rejectArmAuthorizationMethod:
      MethodDescriptor<ArmAuthorizerServerProto.RejectArmAuthorizationRequest, ArmAuthorizerServerProto.RejectArmAuthorizationResponse>
    @JvmStatic
    get() = ArmAuthorizerServerServiceGrpc.getRejectArmAuthorizationMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService
   * service as suspending coroutines.
   */
  @StubFor(ArmAuthorizerServerServiceGrpc::class)
  public class ArmAuthorizerServerServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ArmAuthorizerServerServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions):
        ArmAuthorizerServerServiceCoroutineStub = ArmAuthorizerServerServiceCoroutineStub(channel,
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
        fun subscribeArmAuthorization(request: ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest,
        headers: Metadata = Metadata()): Flow<ArmAuthorizerServerProto.ArmAuthorizationResponse> =
        serverStreamingRpc(
      channel,
      ArmAuthorizerServerServiceGrpc.getSubscribeArmAuthorizationMethod(),
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
        fun acceptArmAuthorization(request: ArmAuthorizerServerProto.AcceptArmAuthorizationRequest,
        headers: Metadata = Metadata()): ArmAuthorizerServerProto.AcceptArmAuthorizationResponse =
        unaryRpc(
      channel,
      ArmAuthorizerServerServiceGrpc.getAcceptArmAuthorizationMethod(),
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
        fun rejectArmAuthorization(request: ArmAuthorizerServerProto.RejectArmAuthorizationRequest,
        headers: Metadata = Metadata()): ArmAuthorizerServerProto.RejectArmAuthorizationResponse =
        unaryRpc(
      channel,
      ArmAuthorizerServerServiceGrpc.getRejectArmAuthorizationMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService
   * service based on Kotlin coroutines.
   */
  public abstract class ArmAuthorizerServerServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns a [Flow] of responses to an RPC for
     * mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.SubscribeArmAuthorization.
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
        fun subscribeArmAuthorization(request: ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest):
        Flow<ArmAuthorizerServerProto.ArmAuthorizationResponse> = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.SubscribeArmAuthorization is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.AcceptArmAuthorization.
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
        fun acceptArmAuthorization(request: ArmAuthorizerServerProto.AcceptArmAuthorizationRequest):
        ArmAuthorizerServerProto.AcceptArmAuthorizationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.AcceptArmAuthorization is unimplemented"))

    /**
     * Returns the response to an RPC for
     * mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.RejectArmAuthorization.
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
        fun rejectArmAuthorization(request: ArmAuthorizerServerProto.RejectArmAuthorizationRequest):
        ArmAuthorizerServerProto.RejectArmAuthorizationResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService.RejectArmAuthorization is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(serverStreamingServerMethodDefinition(
      context = this.context,
      descriptor = ArmAuthorizerServerServiceGrpc.getSubscribeArmAuthorizationMethod(),
      implementation = ::subscribeArmAuthorization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ArmAuthorizerServerServiceGrpc.getAcceptArmAuthorizationMethod(),
      implementation = ::acceptArmAuthorization
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ArmAuthorizerServerServiceGrpc.getRejectArmAuthorizationMethod(),
      implementation = ::rejectArmAuthorization
    )).build()
  }
}
