package io.mavsdk.failure;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Inject failures into system to test failsafes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/failure/failure.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FailureServiceGrpc {

  private FailureServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.failure.FailureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.failure.FailureProto.InjectRequest,
      io.mavsdk.failure.FailureProto.InjectResponse> getInjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Inject",
      requestType = io.mavsdk.failure.FailureProto.InjectRequest.class,
      responseType = io.mavsdk.failure.FailureProto.InjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.failure.FailureProto.InjectRequest,
      io.mavsdk.failure.FailureProto.InjectResponse> getInjectMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.failure.FailureProto.InjectRequest, io.mavsdk.failure.FailureProto.InjectResponse> getInjectMethod;
    if ((getInjectMethod = FailureServiceGrpc.getInjectMethod) == null) {
      synchronized (FailureServiceGrpc.class) {
        if ((getInjectMethod = FailureServiceGrpc.getInjectMethod) == null) {
          FailureServiceGrpc.getInjectMethod = getInjectMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.failure.FailureProto.InjectRequest, io.mavsdk.failure.FailureProto.InjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Inject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.failure.FailureProto.InjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.failure.FailureProto.InjectResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getInjectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FailureServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FailureServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FailureServiceStub>() {
        @java.lang.Override
        public FailureServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FailureServiceStub(channel, callOptions);
        }
      };
    return FailureServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FailureServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FailureServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FailureServiceBlockingStub>() {
        @java.lang.Override
        public FailureServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FailureServiceBlockingStub(channel, callOptions);
        }
      };
    return FailureServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FailureServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FailureServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FailureServiceFutureStub>() {
        @java.lang.Override
        public FailureServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FailureServiceFutureStub(channel, callOptions);
        }
      };
    return FailureServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Inject failures into system to test failsafes.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Injects a failure.
     * </pre>
     */
    default void inject(io.mavsdk.failure.FailureProto.InjectRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.failure.FailureProto.InjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInjectMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FailureService.
   * <pre>
   * Inject failures into system to test failsafes.
   * </pre>
   */
  public static abstract class FailureServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FailureServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FailureService.
   * <pre>
   * Inject failures into system to test failsafes.
   * </pre>
   */
  public static final class FailureServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FailureServiceStub> {
    private FailureServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FailureServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FailureServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Injects a failure.
     * </pre>
     */
    public void inject(io.mavsdk.failure.FailureProto.InjectRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.failure.FailureProto.InjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInjectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FailureService.
   * <pre>
   * Inject failures into system to test failsafes.
   * </pre>
   */
  public static final class FailureServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FailureServiceBlockingStub> {
    private FailureServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FailureServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FailureServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Injects a failure.
     * </pre>
     */
    public io.mavsdk.failure.FailureProto.InjectResponse inject(io.mavsdk.failure.FailureProto.InjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInjectMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FailureService.
   * <pre>
   * Inject failures into system to test failsafes.
   * </pre>
   */
  public static final class FailureServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FailureServiceFutureStub> {
    private FailureServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FailureServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FailureServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Injects a failure.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.failure.FailureProto.InjectResponse> inject(
        io.mavsdk.failure.FailureProto.InjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInjectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INJECT = 0;

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
        case METHODID_INJECT:
          serviceImpl.inject((io.mavsdk.failure.FailureProto.InjectRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.failure.FailureProto.InjectResponse>) responseObserver);
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
          getInjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.failure.FailureProto.InjectRequest,
              io.mavsdk.failure.FailureProto.InjectResponse>(
                service, METHODID_INJECT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FailureServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getInjectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
