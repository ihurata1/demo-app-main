package io.mavsdk.tune

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
import io.mavsdk.tune.TuneServiceGrpc.getServiceDescriptor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for mavsdk.rpc.tune.TuneService.
 */
public object TuneServiceGrpcKt {
  public const val SERVICE_NAME: String = TuneServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val playTuneMethod: MethodDescriptor<TuneProto.PlayTuneRequest, TuneProto.PlayTuneResponse>
    @JvmStatic
    get() = TuneServiceGrpc.getPlayTuneMethod()

  /**
   * A stub for issuing RPCs to a(n) mavsdk.rpc.tune.TuneService service as suspending coroutines.
   */
  @StubFor(TuneServiceGrpc::class)
  public class TuneServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TuneServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TuneServiceCoroutineStub =
        TuneServiceCoroutineStub(channel, callOptions)

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
    public suspend fun playTune(request: TuneProto.PlayTuneRequest, headers: Metadata = Metadata()):
        TuneProto.PlayTuneResponse = unaryRpc(
      channel,
      TuneServiceGrpc.getPlayTuneMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the mavsdk.rpc.tune.TuneService service based on Kotlin coroutines.
   */
  public abstract class TuneServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for mavsdk.rpc.tune.TuneService.PlayTune.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun playTune(request: TuneProto.PlayTuneRequest): TuneProto.PlayTuneResponse
        = throw
        StatusException(UNIMPLEMENTED.withDescription("Method mavsdk.rpc.tune.TuneService.PlayTune is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TuneServiceGrpc.getPlayTuneMethod(),
      implementation = ::playTune
    )).build()
  }
}
