package io.mavsdk.tune;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable creating and sending a tune to be played on the system.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/tune/tune.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TuneServiceGrpc {

  private TuneServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.tune.TuneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.tune.TuneProto.PlayTuneRequest,
      io.mavsdk.tune.TuneProto.PlayTuneResponse> getPlayTuneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PlayTune",
      requestType = io.mavsdk.tune.TuneProto.PlayTuneRequest.class,
      responseType = io.mavsdk.tune.TuneProto.PlayTuneResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.tune.TuneProto.PlayTuneRequest,
      io.mavsdk.tune.TuneProto.PlayTuneResponse> getPlayTuneMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.tune.TuneProto.PlayTuneRequest, io.mavsdk.tune.TuneProto.PlayTuneResponse> getPlayTuneMethod;
    if ((getPlayTuneMethod = TuneServiceGrpc.getPlayTuneMethod) == null) {
      synchronized (TuneServiceGrpc.class) {
        if ((getPlayTuneMethod = TuneServiceGrpc.getPlayTuneMethod) == null) {
          TuneServiceGrpc.getPlayTuneMethod = getPlayTuneMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.tune.TuneProto.PlayTuneRequest, io.mavsdk.tune.TuneProto.PlayTuneResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PlayTune"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.tune.TuneProto.PlayTuneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.tune.TuneProto.PlayTuneResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPlayTuneMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TuneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TuneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TuneServiceStub>() {
        @java.lang.Override
        public TuneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TuneServiceStub(channel, callOptions);
        }
      };
    return TuneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TuneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TuneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TuneServiceBlockingStub>() {
        @java.lang.Override
        public TuneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TuneServiceBlockingStub(channel, callOptions);
        }
      };
    return TuneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TuneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TuneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TuneServiceFutureStub>() {
        @java.lang.Override
        public TuneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TuneServiceFutureStub(channel, callOptions);
        }
      };
    return TuneServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable creating and sending a tune to be played on the system.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send a tune to be played by the system.
     * </pre>
     */
    default void playTune(io.mavsdk.tune.TuneProto.PlayTuneRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.tune.TuneProto.PlayTuneResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPlayTuneMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TuneService.
   * <pre>
   * Enable creating and sending a tune to be played on the system.
   * </pre>
   */
  public static abstract class TuneServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TuneServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TuneService.
   * <pre>
   * Enable creating and sending a tune to be played on the system.
   * </pre>
   */
  public static final class TuneServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TuneServiceStub> {
    private TuneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TuneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TuneServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a tune to be played by the system.
     * </pre>
     */
    public void playTune(io.mavsdk.tune.TuneProto.PlayTuneRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.tune.TuneProto.PlayTuneResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPlayTuneMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TuneService.
   * <pre>
   * Enable creating and sending a tune to be played on the system.
   * </pre>
   */
  public static final class TuneServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TuneServiceBlockingStub> {
    private TuneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TuneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TuneServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a tune to be played by the system.
     * </pre>
     */
    public io.mavsdk.tune.TuneProto.PlayTuneResponse playTune(io.mavsdk.tune.TuneProto.PlayTuneRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPlayTuneMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TuneService.
   * <pre>
   * Enable creating and sending a tune to be played on the system.
   * </pre>
   */
  public static final class TuneServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TuneServiceFutureStub> {
    private TuneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TuneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TuneServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a tune to be played by the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.tune.TuneProto.PlayTuneResponse> playTune(
        io.mavsdk.tune.TuneProto.PlayTuneRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPlayTuneMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY_TUNE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY_TUNE:
          serviceImpl.playTune((io.mavsdk.tune.TuneProto.PlayTuneRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.tune.TuneProto.PlayTuneResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPlayTuneMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.tune.TuneProto.PlayTuneRequest,
              io.mavsdk.tune.TuneProto.PlayTuneResponse>(
                service, METHODID_PLAY_TUNE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TuneServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getPlayTuneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
