package io.mavsdk.geofence

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
import io.mavsdk.geofence.GeofenceServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.geofence.GeofenceService.
 */
public object GeofenceServiceGrpcKt {
  public const val SERVICE_NAME: String = GeofenceServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val uploadGeofenceMethod:
      MethodDescriptor<GeofenceProto.UploadGeofenceRequest, GeofenceProto.UploadGeofenceResponse>
    @JvmStatic
    get() = GeofenceServiceGrpc.getUploadGeofenceMethod()

  public val clearGeofenceMethod:
      MethodDescriptor<GeofenceProto.ClearGeofenceRequest, GeofenceProto.ClearGeofenceResponse>
    @JvmStatic
    get() = GeofenceServiceGrpc.getClearGeofenceMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.geofence.GeofenceService service as suspending
   * coroutines.
   */
  @StubFor(GeofenceServiceGrpc::class)
  public class GeofenceServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GeofenceServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GeofenceServiceCoroutineStub =
        GeofenceServiceCoroutineStub(channel, callOptions)

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
    public suspend fun uploadGeofence(request: GeofenceProto.UploadGeofenceRequest,
        headers: Metadata = Metadata()): GeofenceProto.UploadGeofenceResponse = unaryRpc(
      channel,
      GeofenceServiceGrpc.getUploadGeofenceMethod(),
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
    public suspend fun clearGeofence(request: GeofenceProto.ClearGeofenceRequest, headers: Metadata
        = Metadata()): GeofenceProto.ClearGeofenceResponse = unaryRpc(
      channel,
      GeofenceServiceGrpc.getClearGeofenceMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.geofence.GeofenceService service based on Kotlin
   * coroutines.
   */
  public abstract class GeofenceServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.geofence.GeofenceService.UploadGeofence.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun uploadGeofence(request: GeofenceProto.UploadGeofenceRequest):
        GeofenceProto.UploadGeofenceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.geofence.GeofenceService.UploadGeofence is unimplemented"))

    /**
     * Returns the response to an RPC for mavsdk.rpc.geofence.GeofenceService.ClearGeofence.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun clearGeofence(request: GeofenceProto.ClearGeofenceRequest):
        GeofenceProto.ClearGeofenceResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.geofence.GeofenceService.ClearGeofence is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeofenceServiceGrpc.getUploadGeofenceMethod(),
      implementation = ::uploadGeofence
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GeofenceServiceGrpc.getClearGeofenceMethod(),
      implementation = ::clearGeofence
    )).build()
  }
}
