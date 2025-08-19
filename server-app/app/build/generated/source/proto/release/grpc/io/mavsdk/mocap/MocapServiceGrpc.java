package io.mavsdk.mocap;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * Allows interfacing a vehicle with a motion capture system in
 * order to allow navigation without global positioning sources available
 * (e.g. indoors, or when flying under a bridge. etc.).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/mocap/mocap.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MocapServiceGrpc {

  private MocapServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.mocap.MocapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest,
      io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse> getSetVisionPositionEstimateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVisionPositionEstimate",
      requestType = io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest.class,
      responseType = io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest,
      io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse> getSetVisionPositionEstimateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest, io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse> getSetVisionPositionEstimateMethod;
    if ((getSetVisionPositionEstimateMethod = MocapServiceGrpc.getSetVisionPositionEstimateMethod) == null) {
      synchronized (MocapServiceGrpc.class) {
        if ((getSetVisionPositionEstimateMethod = MocapServiceGrpc.getSetVisionPositionEstimateMethod) == null) {
          MocapServiceGrpc.getSetVisionPositionEstimateMethod = getSetVisionPositionEstimateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest, io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVisionPositionEstimate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetVisionPositionEstimateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest,
      io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse> getSetAttitudePositionMocapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAttitudePositionMocap",
      requestType = io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest.class,
      responseType = io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest,
      io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse> getSetAttitudePositionMocapMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest, io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse> getSetAttitudePositionMocapMethod;
    if ((getSetAttitudePositionMocapMethod = MocapServiceGrpc.getSetAttitudePositionMocapMethod) == null) {
      synchronized (MocapServiceGrpc.class) {
        if ((getSetAttitudePositionMocapMethod = MocapServiceGrpc.getSetAttitudePositionMocapMethod) == null) {
          MocapServiceGrpc.getSetAttitudePositionMocapMethod = getSetAttitudePositionMocapMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest, io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAttitudePositionMocap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAttitudePositionMocapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetOdometryRequest,
      io.mavsdk.mocap.MocapProto.SetOdometryResponse> getSetOdometryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOdometry",
      requestType = io.mavsdk.mocap.MocapProto.SetOdometryRequest.class,
      responseType = io.mavsdk.mocap.MocapProto.SetOdometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetOdometryRequest,
      io.mavsdk.mocap.MocapProto.SetOdometryResponse> getSetOdometryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mocap.MocapProto.SetOdometryRequest, io.mavsdk.mocap.MocapProto.SetOdometryResponse> getSetOdometryMethod;
    if ((getSetOdometryMethod = MocapServiceGrpc.getSetOdometryMethod) == null) {
      synchronized (MocapServiceGrpc.class) {
        if ((getSetOdometryMethod = MocapServiceGrpc.getSetOdometryMethod) == null) {
          MocapServiceGrpc.getSetOdometryMethod = getSetOdometryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mocap.MocapProto.SetOdometryRequest, io.mavsdk.mocap.MocapProto.SetOdometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOdometry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mocap.MocapProto.SetOdometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mocap.MocapProto.SetOdometryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetOdometryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MocapServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MocapServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MocapServiceStub>() {
        @java.lang.Override
        public MocapServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MocapServiceStub(channel, callOptions);
        }
      };
    return MocapServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MocapServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MocapServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MocapServiceBlockingStub>() {
        @java.lang.Override
        public MocapServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MocapServiceBlockingStub(channel, callOptions);
        }
      };
    return MocapServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MocapServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MocapServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MocapServiceFutureStub>() {
        @java.lang.Override
        public MocapServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MocapServiceFutureStub(channel, callOptions);
        }
      };
    return MocapServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * Allows interfacing a vehicle with a motion capture system in
   * order to allow navigation without global positioning sources available
   * (e.g. indoors, or when flying under a bridge. etc.).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send Global position/attitude estimate from a vision source.
     * </pre>
     */
    default void setVisionPositionEstimate(io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetVisionPositionEstimateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send motion capture attitude and position.
     * </pre>
     */
    default void setAttitudePositionMocap(io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAttitudePositionMocapMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send odometry information with an external interface.
     * </pre>
     */
    default void setOdometry(io.mavsdk.mocap.MocapProto.SetOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetOdometryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOdometryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MocapService.
   * <pre>
   **
   * Allows interfacing a vehicle with a motion capture system in
   * order to allow navigation without global positioning sources available
   * (e.g. indoors, or when flying under a bridge. etc.).
   * </pre>
   */
  public static abstract class MocapServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MocapServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MocapService.
   * <pre>
   **
   * Allows interfacing a vehicle with a motion capture system in
   * order to allow navigation without global positioning sources available
   * (e.g. indoors, or when flying under a bridge. etc.).
   * </pre>
   */
  public static final class MocapServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MocapServiceStub> {
    private MocapServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MocapServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MocapServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Global position/attitude estimate from a vision source.
     * </pre>
     */
    public void setVisionPositionEstimate(io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetVisionPositionEstimateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send motion capture attitude and position.
     * </pre>
     */
    public void setAttitudePositionMocap(io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAttitudePositionMocapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send odometry information with an external interface.
     * </pre>
     */
    public void setOdometry(io.mavsdk.mocap.MocapProto.SetOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetOdometryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOdometryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MocapService.
   * <pre>
   **
   * Allows interfacing a vehicle with a motion capture system in
   * order to allow navigation without global positioning sources available
   * (e.g. indoors, or when flying under a bridge. etc.).
   * </pre>
   */
  public static final class MocapServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MocapServiceBlockingStub> {
    private MocapServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MocapServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MocapServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Global position/attitude estimate from a vision source.
     * </pre>
     */
    public io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse setVisionPositionEstimate(io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetVisionPositionEstimateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send motion capture attitude and position.
     * </pre>
     */
    public io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse setAttitudePositionMocap(io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAttitudePositionMocapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send odometry information with an external interface.
     * </pre>
     */
    public io.mavsdk.mocap.MocapProto.SetOdometryResponse setOdometry(io.mavsdk.mocap.MocapProto.SetOdometryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOdometryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MocapService.
   * <pre>
   **
   * Allows interfacing a vehicle with a motion capture system in
   * order to allow navigation without global positioning sources available
   * (e.g. indoors, or when flying under a bridge. etc.).
   * </pre>
   */
  public static final class MocapServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MocapServiceFutureStub> {
    private MocapServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MocapServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MocapServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send Global position/attitude estimate from a vision source.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse> setVisionPositionEstimate(
        io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetVisionPositionEstimateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send motion capture attitude and position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse> setAttitudePositionMocap(
        io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAttitudePositionMocapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send odometry information with an external interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mocap.MocapProto.SetOdometryResponse> setOdometry(
        io.mavsdk.mocap.MocapProto.SetOdometryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOdometryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_VISION_POSITION_ESTIMATE = 0;
  private static final int METHODID_SET_ATTITUDE_POSITION_MOCAP = 1;
  private static final int METHODID_SET_ODOMETRY = 2;

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
        case METHODID_SET_VISION_POSITION_ESTIMATE:
          serviceImpl.setVisionPositionEstimate((io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse>) responseObserver);
          break;
        case METHODID_SET_ATTITUDE_POSITION_MOCAP:
          serviceImpl.setAttitudePositionMocap((io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse>) responseObserver);
          break;
        case METHODID_SET_ODOMETRY:
          serviceImpl.setOdometry((io.mavsdk.mocap.MocapProto.SetOdometryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mocap.MocapProto.SetOdometryResponse>) responseObserver);
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
          getSetVisionPositionEstimateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateRequest,
              io.mavsdk.mocap.MocapProto.SetVisionPositionEstimateResponse>(
                service, METHODID_SET_VISION_POSITION_ESTIMATE)))
        .addMethod(
          getSetAttitudePositionMocapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapRequest,
              io.mavsdk.mocap.MocapProto.SetAttitudePositionMocapResponse>(
                service, METHODID_SET_ATTITUDE_POSITION_MOCAP)))
        .addMethod(
          getSetOdometryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mocap.MocapProto.SetOdometryRequest,
              io.mavsdk.mocap.MocapProto.SetOdometryResponse>(
                service, METHODID_SET_ODOMETRY)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MocapServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetVisionPositionEstimateMethod())
              .addMethod(getSetAttitudePositionMocapMethod())
              .addMethod(getSetOdometryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
