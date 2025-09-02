package io.mavsdk.gripper;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows users to send gripper actions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/gripper/gripper.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GripperServiceGrpc {

  private GripperServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.gripper.GripperService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gripper.GripperProto.GrabRequest,
      io.mavsdk.gripper.GripperProto.GrabResponse> getGrabMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Grab",
      requestType = io.mavsdk.gripper.GripperProto.GrabRequest.class,
      responseType = io.mavsdk.gripper.GripperProto.GrabResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gripper.GripperProto.GrabRequest,
      io.mavsdk.gripper.GripperProto.GrabResponse> getGrabMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gripper.GripperProto.GrabRequest, io.mavsdk.gripper.GripperProto.GrabResponse> getGrabMethod;
    if ((getGrabMethod = GripperServiceGrpc.getGrabMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getGrabMethod = GripperServiceGrpc.getGrabMethod) == null) {
          GripperServiceGrpc.getGrabMethod = getGrabMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gripper.GripperProto.GrabRequest, io.mavsdk.gripper.GripperProto.GrabResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Grab"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gripper.GripperProto.GrabRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gripper.GripperProto.GrabResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGrabMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gripper.GripperProto.ReleaseRequest,
      io.mavsdk.gripper.GripperProto.ReleaseResponse> getReleaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Release",
      requestType = io.mavsdk.gripper.GripperProto.ReleaseRequest.class,
      responseType = io.mavsdk.gripper.GripperProto.ReleaseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gripper.GripperProto.ReleaseRequest,
      io.mavsdk.gripper.GripperProto.ReleaseResponse> getReleaseMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gripper.GripperProto.ReleaseRequest, io.mavsdk.gripper.GripperProto.ReleaseResponse> getReleaseMethod;
    if ((getReleaseMethod = GripperServiceGrpc.getReleaseMethod) == null) {
      synchronized (GripperServiceGrpc.class) {
        if ((getReleaseMethod = GripperServiceGrpc.getReleaseMethod) == null) {
          GripperServiceGrpc.getReleaseMethod = getReleaseMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gripper.GripperProto.ReleaseRequest, io.mavsdk.gripper.GripperProto.ReleaseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Release"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gripper.GripperProto.ReleaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gripper.GripperProto.ReleaseResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReleaseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GripperServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GripperServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GripperServiceStub>() {
        @java.lang.Override
        public GripperServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GripperServiceStub(channel, callOptions);
        }
      };
    return GripperServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GripperServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GripperServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GripperServiceBlockingStub>() {
        @java.lang.Override
        public GripperServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GripperServiceBlockingStub(channel, callOptions);
        }
      };
    return GripperServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GripperServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GripperServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GripperServiceFutureStub>() {
        @java.lang.Override
        public GripperServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GripperServiceFutureStub(channel, callOptions);
        }
      };
    return GripperServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows users to send gripper actions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Gripper grab cargo.
     * </pre>
     */
    default void grab(io.mavsdk.gripper.GripperProto.GrabRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gripper.GripperProto.GrabResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGrabMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gripper release cargo.
     * </pre>
     */
    default void release(io.mavsdk.gripper.GripperProto.ReleaseRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gripper.GripperProto.ReleaseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GripperService.
   * <pre>
   * Allows users to send gripper actions.
   * </pre>
   */
  public static abstract class GripperServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GripperServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GripperService.
   * <pre>
   * Allows users to send gripper actions.
   * </pre>
   */
  public static final class GripperServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GripperServiceStub> {
    private GripperServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GripperServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GripperServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gripper grab cargo.
     * </pre>
     */
    public void grab(io.mavsdk.gripper.GripperProto.GrabRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gripper.GripperProto.GrabResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGrabMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gripper release cargo.
     * </pre>
     */
    public void release(io.mavsdk.gripper.GripperProto.ReleaseRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gripper.GripperProto.ReleaseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GripperService.
   * <pre>
   * Allows users to send gripper actions.
   * </pre>
   */
  public static final class GripperServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GripperServiceBlockingStub> {
    private GripperServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GripperServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GripperServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gripper grab cargo.
     * </pre>
     */
    public io.mavsdk.gripper.GripperProto.GrabResponse grab(io.mavsdk.gripper.GripperProto.GrabRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGrabMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gripper release cargo.
     * </pre>
     */
    public io.mavsdk.gripper.GripperProto.ReleaseResponse release(io.mavsdk.gripper.GripperProto.ReleaseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GripperService.
   * <pre>
   * Allows users to send gripper actions.
   * </pre>
   */
  public static final class GripperServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GripperServiceFutureStub> {
    private GripperServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GripperServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GripperServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gripper grab cargo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gripper.GripperProto.GrabResponse> grab(
        io.mavsdk.gripper.GripperProto.GrabRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGrabMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gripper release cargo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gripper.GripperProto.ReleaseResponse> release(
        io.mavsdk.gripper.GripperProto.ReleaseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GRAB = 0;
  private static final int METHODID_RELEASE = 1;

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
        case METHODID_GRAB:
          serviceImpl.grab((io.mavsdk.gripper.GripperProto.GrabRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gripper.GripperProto.GrabResponse>) responseObserver);
          break;
        case METHODID_RELEASE:
          serviceImpl.release((io.mavsdk.gripper.GripperProto.ReleaseRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gripper.GripperProto.ReleaseResponse>) responseObserver);
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
          getGrabMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gripper.GripperProto.GrabRequest,
              io.mavsdk.gripper.GripperProto.GrabResponse>(
                service, METHODID_GRAB)))
        .addMethod(
          getReleaseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gripper.GripperProto.ReleaseRequest,
              io.mavsdk.gripper.GripperProto.ReleaseResponse>(
                service, METHODID_RELEASE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GripperServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGrabMethod())
              .addMethod(getReleaseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
