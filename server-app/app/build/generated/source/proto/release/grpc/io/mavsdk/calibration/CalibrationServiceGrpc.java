package io.mavsdk.calibration;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable to calibrate sensors of a drone such as gyro, accelerometer, and magnetometer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/calibration/calibration.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalibrationServiceGrpc {

  private CalibrationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.calibration.CalibrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse> getSubscribeCalibrateGyroMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCalibrateGyro",
      requestType = io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest.class,
      responseType = io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse> getSubscribeCalibrateGyroMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest, io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse> getSubscribeCalibrateGyroMethod;
    if ((getSubscribeCalibrateGyroMethod = CalibrationServiceGrpc.getSubscribeCalibrateGyroMethod) == null) {
      synchronized (CalibrationServiceGrpc.class) {
        if ((getSubscribeCalibrateGyroMethod = CalibrationServiceGrpc.getSubscribeCalibrateGyroMethod) == null) {
          CalibrationServiceGrpc.getSubscribeCalibrateGyroMethod = getSubscribeCalibrateGyroMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest, io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCalibrateGyro"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCalibrateGyroMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse> getSubscribeCalibrateAccelerometerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCalibrateAccelerometer",
      requestType = io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest.class,
      responseType = io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse> getSubscribeCalibrateAccelerometerMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest, io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse> getSubscribeCalibrateAccelerometerMethod;
    if ((getSubscribeCalibrateAccelerometerMethod = CalibrationServiceGrpc.getSubscribeCalibrateAccelerometerMethod) == null) {
      synchronized (CalibrationServiceGrpc.class) {
        if ((getSubscribeCalibrateAccelerometerMethod = CalibrationServiceGrpc.getSubscribeCalibrateAccelerometerMethod) == null) {
          CalibrationServiceGrpc.getSubscribeCalibrateAccelerometerMethod = getSubscribeCalibrateAccelerometerMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest, io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCalibrateAccelerometer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCalibrateAccelerometerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse> getSubscribeCalibrateMagnetometerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCalibrateMagnetometer",
      requestType = io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest.class,
      responseType = io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse> getSubscribeCalibrateMagnetometerMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest, io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse> getSubscribeCalibrateMagnetometerMethod;
    if ((getSubscribeCalibrateMagnetometerMethod = CalibrationServiceGrpc.getSubscribeCalibrateMagnetometerMethod) == null) {
      synchronized (CalibrationServiceGrpc.class) {
        if ((getSubscribeCalibrateMagnetometerMethod = CalibrationServiceGrpc.getSubscribeCalibrateMagnetometerMethod) == null) {
          CalibrationServiceGrpc.getSubscribeCalibrateMagnetometerMethod = getSubscribeCalibrateMagnetometerMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest, io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCalibrateMagnetometer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCalibrateMagnetometerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse> getSubscribeCalibrateLevelHorizonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCalibrateLevelHorizon",
      requestType = io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest.class,
      responseType = io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse> getSubscribeCalibrateLevelHorizonMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest, io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse> getSubscribeCalibrateLevelHorizonMethod;
    if ((getSubscribeCalibrateLevelHorizonMethod = CalibrationServiceGrpc.getSubscribeCalibrateLevelHorizonMethod) == null) {
      synchronized (CalibrationServiceGrpc.class) {
        if ((getSubscribeCalibrateLevelHorizonMethod = CalibrationServiceGrpc.getSubscribeCalibrateLevelHorizonMethod) == null) {
          CalibrationServiceGrpc.getSubscribeCalibrateLevelHorizonMethod = getSubscribeCalibrateLevelHorizonMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest, io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCalibrateLevelHorizon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCalibrateLevelHorizonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse> getSubscribeCalibrateGimbalAccelerometerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCalibrateGimbalAccelerometer",
      requestType = io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest.class,
      responseType = io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest,
      io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse> getSubscribeCalibrateGimbalAccelerometerMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest, io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse> getSubscribeCalibrateGimbalAccelerometerMethod;
    if ((getSubscribeCalibrateGimbalAccelerometerMethod = CalibrationServiceGrpc.getSubscribeCalibrateGimbalAccelerometerMethod) == null) {
      synchronized (CalibrationServiceGrpc.class) {
        if ((getSubscribeCalibrateGimbalAccelerometerMethod = CalibrationServiceGrpc.getSubscribeCalibrateGimbalAccelerometerMethod) == null) {
          CalibrationServiceGrpc.getSubscribeCalibrateGimbalAccelerometerMethod = getSubscribeCalibrateGimbalAccelerometerMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest, io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCalibrateGimbalAccelerometer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCalibrateGimbalAccelerometerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.CancelRequest,
      io.mavsdk.calibration.CalibrationProto.CancelResponse> getCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Cancel",
      requestType = io.mavsdk.calibration.CalibrationProto.CancelRequest.class,
      responseType = io.mavsdk.calibration.CalibrationProto.CancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.CancelRequest,
      io.mavsdk.calibration.CalibrationProto.CancelResponse> getCancelMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.calibration.CalibrationProto.CancelRequest, io.mavsdk.calibration.CalibrationProto.CancelResponse> getCancelMethod;
    if ((getCancelMethod = CalibrationServiceGrpc.getCancelMethod) == null) {
      synchronized (CalibrationServiceGrpc.class) {
        if ((getCancelMethod = CalibrationServiceGrpc.getCancelMethod) == null) {
          CalibrationServiceGrpc.getCancelMethod = getCancelMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.calibration.CalibrationProto.CancelRequest, io.mavsdk.calibration.CalibrationProto.CancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Cancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.calibration.CalibrationProto.CancelResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalibrationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalibrationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalibrationServiceStub>() {
        @java.lang.Override
        public CalibrationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalibrationServiceStub(channel, callOptions);
        }
      };
    return CalibrationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalibrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalibrationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalibrationServiceBlockingStub>() {
        @java.lang.Override
        public CalibrationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalibrationServiceBlockingStub(channel, callOptions);
        }
      };
    return CalibrationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalibrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalibrationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalibrationServiceFutureStub>() {
        @java.lang.Override
        public CalibrationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalibrationServiceFutureStub(channel, callOptions);
        }
      };
    return CalibrationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable to calibrate sensors of a drone such as gyro, accelerometer, and magnetometer.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Perform gyro calibration.
     * </pre>
     */
    default void subscribeCalibrateGyro(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCalibrateGyroMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform accelerometer calibration.
     * </pre>
     */
    default void subscribeCalibrateAccelerometer(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCalibrateAccelerometerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform magnetometer calibration.
     * </pre>
     */
    default void subscribeCalibrateMagnetometer(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCalibrateMagnetometerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform board level horizon calibration.
     * </pre>
     */
    default void subscribeCalibrateLevelHorizon(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCalibrateLevelHorizonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform gimbal accelerometer calibration.
     * </pre>
     */
    default void subscribeCalibrateGimbalAccelerometer(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCalibrateGimbalAccelerometerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel ongoing calibration process.
     * </pre>
     */
    default void cancel(io.mavsdk.calibration.CalibrationProto.CancelRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CancelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CalibrationService.
   * <pre>
   * Enable to calibrate sensors of a drone such as gyro, accelerometer, and magnetometer.
   * </pre>
   */
  public static abstract class CalibrationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CalibrationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CalibrationService.
   * <pre>
   * Enable to calibrate sensors of a drone such as gyro, accelerometer, and magnetometer.
   * </pre>
   */
  public static final class CalibrationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CalibrationServiceStub> {
    private CalibrationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalibrationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalibrationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Perform gyro calibration.
     * </pre>
     */
    public void subscribeCalibrateGyro(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCalibrateGyroMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform accelerometer calibration.
     * </pre>
     */
    public void subscribeCalibrateAccelerometer(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCalibrateAccelerometerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform magnetometer calibration.
     * </pre>
     */
    public void subscribeCalibrateMagnetometer(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCalibrateMagnetometerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform board level horizon calibration.
     * </pre>
     */
    public void subscribeCalibrateLevelHorizon(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCalibrateLevelHorizonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform gimbal accelerometer calibration.
     * </pre>
     */
    public void subscribeCalibrateGimbalAccelerometer(io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCalibrateGimbalAccelerometerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel ongoing calibration process.
     * </pre>
     */
    public void cancel(io.mavsdk.calibration.CalibrationProto.CancelRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CancelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CalibrationService.
   * <pre>
   * Enable to calibrate sensors of a drone such as gyro, accelerometer, and magnetometer.
   * </pre>
   */
  public static final class CalibrationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CalibrationServiceBlockingStub> {
    private CalibrationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalibrationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalibrationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Perform gyro calibration.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse> subscribeCalibrateGyro(
        io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCalibrateGyroMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform accelerometer calibration.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse> subscribeCalibrateAccelerometer(
        io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCalibrateAccelerometerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform magnetometer calibration.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse> subscribeCalibrateMagnetometer(
        io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCalibrateMagnetometerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform board level horizon calibration.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse> subscribeCalibrateLevelHorizon(
        io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCalibrateLevelHorizonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform gimbal accelerometer calibration.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse> subscribeCalibrateGimbalAccelerometer(
        io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCalibrateGimbalAccelerometerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel ongoing calibration process.
     * </pre>
     */
    public io.mavsdk.calibration.CalibrationProto.CancelResponse cancel(io.mavsdk.calibration.CalibrationProto.CancelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CalibrationService.
   * <pre>
   * Enable to calibrate sensors of a drone such as gyro, accelerometer, and magnetometer.
   * </pre>
   */
  public static final class CalibrationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CalibrationServiceFutureStub> {
    private CalibrationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalibrationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalibrationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Cancel ongoing calibration process.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.calibration.CalibrationProto.CancelResponse> cancel(
        io.mavsdk.calibration.CalibrationProto.CancelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_CALIBRATE_GYRO = 0;
  private static final int METHODID_SUBSCRIBE_CALIBRATE_ACCELEROMETER = 1;
  private static final int METHODID_SUBSCRIBE_CALIBRATE_MAGNETOMETER = 2;
  private static final int METHODID_SUBSCRIBE_CALIBRATE_LEVEL_HORIZON = 3;
  private static final int METHODID_SUBSCRIBE_CALIBRATE_GIMBAL_ACCELEROMETER = 4;
  private static final int METHODID_CANCEL = 5;

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
        case METHODID_SUBSCRIBE_CALIBRATE_GYRO:
          serviceImpl.subscribeCalibrateGyro((io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CALIBRATE_ACCELEROMETER:
          serviceImpl.subscribeCalibrateAccelerometer((io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CALIBRATE_MAGNETOMETER:
          serviceImpl.subscribeCalibrateMagnetometer((io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CALIBRATE_LEVEL_HORIZON:
          serviceImpl.subscribeCalibrateLevelHorizon((io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CALIBRATE_GIMBAL_ACCELEROMETER:
          serviceImpl.subscribeCalibrateGimbalAccelerometer((io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse>) responseObserver);
          break;
        case METHODID_CANCEL:
          serviceImpl.cancel((io.mavsdk.calibration.CalibrationProto.CancelRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.calibration.CalibrationProto.CancelResponse>) responseObserver);
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
          getSubscribeCalibrateGyroMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGyroRequest,
              io.mavsdk.calibration.CalibrationProto.CalibrateGyroResponse>(
                service, METHODID_SUBSCRIBE_CALIBRATE_GYRO)))
        .addMethod(
          getSubscribeCalibrateAccelerometerMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateAccelerometerRequest,
              io.mavsdk.calibration.CalibrationProto.CalibrateAccelerometerResponse>(
                service, METHODID_SUBSCRIBE_CALIBRATE_ACCELEROMETER)))
        .addMethod(
          getSubscribeCalibrateMagnetometerMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateMagnetometerRequest,
              io.mavsdk.calibration.CalibrationProto.CalibrateMagnetometerResponse>(
                service, METHODID_SUBSCRIBE_CALIBRATE_MAGNETOMETER)))
        .addMethod(
          getSubscribeCalibrateLevelHorizonMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateLevelHorizonRequest,
              io.mavsdk.calibration.CalibrationProto.CalibrateLevelHorizonResponse>(
                service, METHODID_SUBSCRIBE_CALIBRATE_LEVEL_HORIZON)))
        .addMethod(
          getSubscribeCalibrateGimbalAccelerometerMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.calibration.CalibrationProto.SubscribeCalibrateGimbalAccelerometerRequest,
              io.mavsdk.calibration.CalibrationProto.CalibrateGimbalAccelerometerResponse>(
                service, METHODID_SUBSCRIBE_CALIBRATE_GIMBAL_ACCELEROMETER)))
        .addMethod(
          getCancelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.calibration.CalibrationProto.CancelRequest,
              io.mavsdk.calibration.CalibrationProto.CancelResponse>(
                service, METHODID_CANCEL)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalibrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeCalibrateGyroMethod())
              .addMethod(getSubscribeCalibrateAccelerometerMethod())
              .addMethod(getSubscribeCalibrateMagnetometerMethod())
              .addMethod(getSubscribeCalibrateLevelHorizonMethod())
              .addMethod(getSubscribeCalibrateGimbalAccelerometerMethod())
              .addMethod(getCancelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
