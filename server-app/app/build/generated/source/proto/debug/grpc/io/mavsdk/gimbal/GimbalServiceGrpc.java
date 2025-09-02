package io.mavsdk.gimbal;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide control over a gimbal.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/gimbal/gimbal.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GimbalServiceGrpc {

  private GimbalServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.gimbal.GimbalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetAnglesRequest,
      io.mavsdk.gimbal.GimbalProto.SetAnglesResponse> getSetAnglesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAngles",
      requestType = io.mavsdk.gimbal.GimbalProto.SetAnglesRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.SetAnglesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetAnglesRequest,
      io.mavsdk.gimbal.GimbalProto.SetAnglesResponse> getSetAnglesMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetAnglesRequest, io.mavsdk.gimbal.GimbalProto.SetAnglesResponse> getSetAnglesMethod;
    if ((getSetAnglesMethod = GimbalServiceGrpc.getSetAnglesMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSetAnglesMethod = GimbalServiceGrpc.getSetAnglesMethod) == null) {
          GimbalServiceGrpc.getSetAnglesMethod = getSetAnglesMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SetAnglesRequest, io.mavsdk.gimbal.GimbalProto.SetAnglesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAngles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetAnglesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetAnglesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAnglesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest,
      io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse> getSetPitchAndYawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPitchAndYaw",
      requestType = io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest,
      io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse> getSetPitchAndYawMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest, io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse> getSetPitchAndYawMethod;
    if ((getSetPitchAndYawMethod = GimbalServiceGrpc.getSetPitchAndYawMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSetPitchAndYawMethod = GimbalServiceGrpc.getSetPitchAndYawMethod) == null) {
          GimbalServiceGrpc.getSetPitchAndYawMethod = getSetPitchAndYawMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest, io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPitchAndYaw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPitchAndYawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest,
      io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse> getSetPitchRateAndYawRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPitchRateAndYawRate",
      requestType = io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest,
      io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse> getSetPitchRateAndYawRateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest, io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse> getSetPitchRateAndYawRateMethod;
    if ((getSetPitchRateAndYawRateMethod = GimbalServiceGrpc.getSetPitchRateAndYawRateMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSetPitchRateAndYawRateMethod = GimbalServiceGrpc.getSetPitchRateAndYawRateMethod) == null) {
          GimbalServiceGrpc.getSetPitchRateAndYawRateMethod = getSetPitchRateAndYawRateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest, io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPitchRateAndYawRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPitchRateAndYawRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetModeRequest,
      io.mavsdk.gimbal.GimbalProto.SetModeResponse> getSetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMode",
      requestType = io.mavsdk.gimbal.GimbalProto.SetModeRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.SetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetModeRequest,
      io.mavsdk.gimbal.GimbalProto.SetModeResponse> getSetModeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetModeRequest, io.mavsdk.gimbal.GimbalProto.SetModeResponse> getSetModeMethod;
    if ((getSetModeMethod = GimbalServiceGrpc.getSetModeMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSetModeMethod = GimbalServiceGrpc.getSetModeMethod) == null) {
          GimbalServiceGrpc.getSetModeMethod = getSetModeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SetModeRequest, io.mavsdk.gimbal.GimbalProto.SetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest,
      io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse> getSetRoiLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRoiLocation",
      requestType = io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest,
      io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse> getSetRoiLocationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest, io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse> getSetRoiLocationMethod;
    if ((getSetRoiLocationMethod = GimbalServiceGrpc.getSetRoiLocationMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSetRoiLocationMethod = GimbalServiceGrpc.getSetRoiLocationMethod) == null) {
          GimbalServiceGrpc.getSetRoiLocationMethod = getSetRoiLocationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest, io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRoiLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRoiLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.TakeControlRequest,
      io.mavsdk.gimbal.GimbalProto.TakeControlResponse> getTakeControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakeControl",
      requestType = io.mavsdk.gimbal.GimbalProto.TakeControlRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.TakeControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.TakeControlRequest,
      io.mavsdk.gimbal.GimbalProto.TakeControlResponse> getTakeControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.TakeControlRequest, io.mavsdk.gimbal.GimbalProto.TakeControlResponse> getTakeControlMethod;
    if ((getTakeControlMethod = GimbalServiceGrpc.getTakeControlMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getTakeControlMethod = GimbalServiceGrpc.getTakeControlMethod) == null) {
          GimbalServiceGrpc.getTakeControlMethod = getTakeControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.TakeControlRequest, io.mavsdk.gimbal.GimbalProto.TakeControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakeControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.TakeControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.TakeControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTakeControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest,
      io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse> getReleaseControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseControl",
      requestType = io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest,
      io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse> getReleaseControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest, io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse> getReleaseControlMethod;
    if ((getReleaseControlMethod = GimbalServiceGrpc.getReleaseControlMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getReleaseControlMethod = GimbalServiceGrpc.getReleaseControlMethod) == null) {
          GimbalServiceGrpc.getReleaseControlMethod = getReleaseControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest, io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReleaseControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest,
      io.mavsdk.gimbal.GimbalProto.ControlResponse> getSubscribeControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeControl",
      requestType = io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.ControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest,
      io.mavsdk.gimbal.GimbalProto.ControlResponse> getSubscribeControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest, io.mavsdk.gimbal.GimbalProto.ControlResponse> getSubscribeControlMethod;
    if ((getSubscribeControlMethod = GimbalServiceGrpc.getSubscribeControlMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSubscribeControlMethod = GimbalServiceGrpc.getSubscribeControlMethod) == null) {
          GimbalServiceGrpc.getSubscribeControlMethod = getSubscribeControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest, io.mavsdk.gimbal.GimbalProto.ControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.ControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest,
      io.mavsdk.gimbal.GimbalProto.AttitudeResponse> getSubscribeAttitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeAttitude",
      requestType = io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest.class,
      responseType = io.mavsdk.gimbal.GimbalProto.AttitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest,
      io.mavsdk.gimbal.GimbalProto.AttitudeResponse> getSubscribeAttitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest, io.mavsdk.gimbal.GimbalProto.AttitudeResponse> getSubscribeAttitudeMethod;
    if ((getSubscribeAttitudeMethod = GimbalServiceGrpc.getSubscribeAttitudeMethod) == null) {
      synchronized (GimbalServiceGrpc.class) {
        if ((getSubscribeAttitudeMethod = GimbalServiceGrpc.getSubscribeAttitudeMethod) == null) {
          GimbalServiceGrpc.getSubscribeAttitudeMethod = getSubscribeAttitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest, io.mavsdk.gimbal.GimbalProto.AttitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeAttitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.gimbal.GimbalProto.AttitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeAttitudeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GimbalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GimbalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GimbalServiceStub>() {
        @java.lang.Override
        public GimbalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GimbalServiceStub(channel, callOptions);
        }
      };
    return GimbalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GimbalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GimbalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GimbalServiceBlockingStub>() {
        @java.lang.Override
        public GimbalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GimbalServiceBlockingStub(channel, callOptions);
        }
      };
    return GimbalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GimbalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GimbalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GimbalServiceFutureStub>() {
        @java.lang.Override
        public GimbalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GimbalServiceFutureStub(channel, callOptions);
        }
      };
    return GimbalServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide control over a gimbal.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Set gimbal roll, pitch and yaw angles.
     * This sets the desired roll, pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    default void setAngles(io.mavsdk.gimbal.GimbalProto.SetAnglesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetAnglesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAnglesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set gimbal pitch and yaw angles.
     * This sets the desired pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    default void setPitchAndYaw(io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPitchAndYawMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set gimbal angular rates around pitch and yaw axes.
     * This sets the desired angular rates around pitch and yaw axes of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually reach the angular rate.
     * </pre>
     */
    default void setPitchRateAndYawRate(io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPitchRateAndYawRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set gimbal mode.
     * This sets the desired yaw mode of a gimbal.
     * Will return when the command is accepted. However, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    default void setMode(io.mavsdk.gimbal.GimbalProto.SetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set gimbal region of interest (ROI).
     * This sets a region of interest that the gimbal will point to.
     * The gimbal will continue to point to the specified region until it
     * receives a new command.
     * The function will return when the command is accepted, however, it might
     * take the gimbal longer to actually rotate to the ROI.
     * </pre>
     */
    default void setRoiLocation(io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRoiLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Take control.
     * There can be only two components in control of a gimbal at any given time.
     * One with "primary" control, and one with "secondary" control. The way the
     * secondary control is implemented is not specified and hence depends on the
     * vehicle.
     * Components are expected to be cooperative, which means that they can
     * override each other and should therefore do it carefully.
     * </pre>
     */
    default void takeControl(io.mavsdk.gimbal.GimbalProto.TakeControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.TakeControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Release control.
     * Release control, such that other components can control the gimbal.
     * </pre>
     */
    default void releaseControl(io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to control status updates.
     * This allows a component to know if it has primary, secondary or
     * no control over the gimbal. Also, it gives the system and component ids
     * of the other components in control (if any).
     * </pre>
     */
    default void subscribeControl(io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.ControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to attitude updates.
     * This gets you the gimbal's attitude and angular rate.
     * </pre>
     */
    default void subscribeAttitude(io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.AttitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeAttitudeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GimbalService.
   * <pre>
   * Provide control over a gimbal.
   * </pre>
   */
  public static abstract class GimbalServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GimbalServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GimbalService.
   * <pre>
   * Provide control over a gimbal.
   * </pre>
   */
  public static final class GimbalServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GimbalServiceStub> {
    private GimbalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GimbalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GimbalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set gimbal roll, pitch and yaw angles.
     * This sets the desired roll, pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public void setAngles(io.mavsdk.gimbal.GimbalProto.SetAnglesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetAnglesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAnglesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set gimbal pitch and yaw angles.
     * This sets the desired pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public void setPitchAndYaw(io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPitchAndYawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set gimbal angular rates around pitch and yaw axes.
     * This sets the desired angular rates around pitch and yaw axes of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually reach the angular rate.
     * </pre>
     */
    public void setPitchRateAndYawRate(io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPitchRateAndYawRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set gimbal mode.
     * This sets the desired yaw mode of a gimbal.
     * Will return when the command is accepted. However, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public void setMode(io.mavsdk.gimbal.GimbalProto.SetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set gimbal region of interest (ROI).
     * This sets a region of interest that the gimbal will point to.
     * The gimbal will continue to point to the specified region until it
     * receives a new command.
     * The function will return when the command is accepted, however, it might
     * take the gimbal longer to actually rotate to the ROI.
     * </pre>
     */
    public void setRoiLocation(io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRoiLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Take control.
     * There can be only two components in control of a gimbal at any given time.
     * One with "primary" control, and one with "secondary" control. The way the
     * secondary control is implemented is not specified and hence depends on the
     * vehicle.
     * Components are expected to be cooperative, which means that they can
     * override each other and should therefore do it carefully.
     * </pre>
     */
    public void takeControl(io.mavsdk.gimbal.GimbalProto.TakeControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.TakeControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Release control.
     * Release control, such that other components can control the gimbal.
     * </pre>
     */
    public void releaseControl(io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to control status updates.
     * This allows a component to know if it has primary, secondary or
     * no control over the gimbal. Also, it gives the system and component ids
     * of the other components in control (if any).
     * </pre>
     */
    public void subscribeControl(io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.ControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to attitude updates.
     * This gets you the gimbal's attitude and angular rate.
     * </pre>
     */
    public void subscribeAttitude(io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.AttitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeAttitudeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GimbalService.
   * <pre>
   * Provide control over a gimbal.
   * </pre>
   */
  public static final class GimbalServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GimbalServiceBlockingStub> {
    private GimbalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GimbalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GimbalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set gimbal roll, pitch and yaw angles.
     * This sets the desired roll, pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.SetAnglesResponse setAngles(io.mavsdk.gimbal.GimbalProto.SetAnglesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAnglesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set gimbal pitch and yaw angles.
     * This sets the desired pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse setPitchAndYaw(io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPitchAndYawMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set gimbal angular rates around pitch and yaw axes.
     * This sets the desired angular rates around pitch and yaw axes of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually reach the angular rate.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse setPitchRateAndYawRate(io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPitchRateAndYawRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set gimbal mode.
     * This sets the desired yaw mode of a gimbal.
     * Will return when the command is accepted. However, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.SetModeResponse setMode(io.mavsdk.gimbal.GimbalProto.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set gimbal region of interest (ROI).
     * This sets a region of interest that the gimbal will point to.
     * The gimbal will continue to point to the specified region until it
     * receives a new command.
     * The function will return when the command is accepted, however, it might
     * take the gimbal longer to actually rotate to the ROI.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse setRoiLocation(io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRoiLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Take control.
     * There can be only two components in control of a gimbal at any given time.
     * One with "primary" control, and one with "secondary" control. The way the
     * secondary control is implemented is not specified and hence depends on the
     * vehicle.
     * Components are expected to be cooperative, which means that they can
     * override each other and should therefore do it carefully.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.TakeControlResponse takeControl(io.mavsdk.gimbal.GimbalProto.TakeControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Release control.
     * Release control, such that other components can control the gimbal.
     * </pre>
     */
    public io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse releaseControl(io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to control status updates.
     * This allows a component to know if it has primary, secondary or
     * no control over the gimbal. Also, it gives the system and component ids
     * of the other components in control (if any).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.gimbal.GimbalProto.ControlResponse> subscribeControl(
        io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to attitude updates.
     * This gets you the gimbal's attitude and angular rate.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.gimbal.GimbalProto.AttitudeResponse> subscribeAttitude(
        io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeAttitudeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GimbalService.
   * <pre>
   * Provide control over a gimbal.
   * </pre>
   */
  public static final class GimbalServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GimbalServiceFutureStub> {
    private GimbalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GimbalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GimbalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set gimbal roll, pitch and yaw angles.
     * This sets the desired roll, pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.SetAnglesResponse> setAngles(
        io.mavsdk.gimbal.GimbalProto.SetAnglesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAnglesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set gimbal pitch and yaw angles.
     * This sets the desired pitch and yaw angles of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse> setPitchAndYaw(
        io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPitchAndYawMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set gimbal angular rates around pitch and yaw axes.
     * This sets the desired angular rates around pitch and yaw axes of a gimbal.
     * Will return when the command is accepted, however, it might
     * take the gimbal longer to actually reach the angular rate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse> setPitchRateAndYawRate(
        io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPitchRateAndYawRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set gimbal mode.
     * This sets the desired yaw mode of a gimbal.
     * Will return when the command is accepted. However, it might
     * take the gimbal longer to actually be set to the new angles.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.SetModeResponse> setMode(
        io.mavsdk.gimbal.GimbalProto.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set gimbal region of interest (ROI).
     * This sets a region of interest that the gimbal will point to.
     * The gimbal will continue to point to the specified region until it
     * receives a new command.
     * The function will return when the command is accepted, however, it might
     * take the gimbal longer to actually rotate to the ROI.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse> setRoiLocation(
        io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRoiLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Take control.
     * There can be only two components in control of a gimbal at any given time.
     * One with "primary" control, and one with "secondary" control. The way the
     * secondary control is implemented is not specified and hence depends on the
     * vehicle.
     * Components are expected to be cooperative, which means that they can
     * override each other and should therefore do it carefully.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.TakeControlResponse> takeControl(
        io.mavsdk.gimbal.GimbalProto.TakeControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Release control.
     * Release control, such that other components can control the gimbal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse> releaseControl(
        io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseControlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_ANGLES = 0;
  private static final int METHODID_SET_PITCH_AND_YAW = 1;
  private static final int METHODID_SET_PITCH_RATE_AND_YAW_RATE = 2;
  private static final int METHODID_SET_MODE = 3;
  private static final int METHODID_SET_ROI_LOCATION = 4;
  private static final int METHODID_TAKE_CONTROL = 5;
  private static final int METHODID_RELEASE_CONTROL = 6;
  private static final int METHODID_SUBSCRIBE_CONTROL = 7;
  private static final int METHODID_SUBSCRIBE_ATTITUDE = 8;

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
        case METHODID_SET_ANGLES:
          serviceImpl.setAngles((io.mavsdk.gimbal.GimbalProto.SetAnglesRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetAnglesResponse>) responseObserver);
          break;
        case METHODID_SET_PITCH_AND_YAW:
          serviceImpl.setPitchAndYaw((io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse>) responseObserver);
          break;
        case METHODID_SET_PITCH_RATE_AND_YAW_RATE:
          serviceImpl.setPitchRateAndYawRate((io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse>) responseObserver);
          break;
        case METHODID_SET_MODE:
          serviceImpl.setMode((io.mavsdk.gimbal.GimbalProto.SetModeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetModeResponse>) responseObserver);
          break;
        case METHODID_SET_ROI_LOCATION:
          serviceImpl.setRoiLocation((io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse>) responseObserver);
          break;
        case METHODID_TAKE_CONTROL:
          serviceImpl.takeControl((io.mavsdk.gimbal.GimbalProto.TakeControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.TakeControlResponse>) responseObserver);
          break;
        case METHODID_RELEASE_CONTROL:
          serviceImpl.releaseControl((io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CONTROL:
          serviceImpl.subscribeControl((io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.ControlResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ATTITUDE:
          serviceImpl.subscribeAttitude((io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.gimbal.GimbalProto.AttitudeResponse>) responseObserver);
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
          getSetAnglesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SetAnglesRequest,
              io.mavsdk.gimbal.GimbalProto.SetAnglesResponse>(
                service, METHODID_SET_ANGLES)))
        .addMethod(
          getSetPitchAndYawMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SetPitchAndYawRequest,
              io.mavsdk.gimbal.GimbalProto.SetPitchAndYawResponse>(
                service, METHODID_SET_PITCH_AND_YAW)))
        .addMethod(
          getSetPitchRateAndYawRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateRequest,
              io.mavsdk.gimbal.GimbalProto.SetPitchRateAndYawRateResponse>(
                service, METHODID_SET_PITCH_RATE_AND_YAW_RATE)))
        .addMethod(
          getSetModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SetModeRequest,
              io.mavsdk.gimbal.GimbalProto.SetModeResponse>(
                service, METHODID_SET_MODE)))
        .addMethod(
          getSetRoiLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SetRoiLocationRequest,
              io.mavsdk.gimbal.GimbalProto.SetRoiLocationResponse>(
                service, METHODID_SET_ROI_LOCATION)))
        .addMethod(
          getTakeControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.TakeControlRequest,
              io.mavsdk.gimbal.GimbalProto.TakeControlResponse>(
                service, METHODID_TAKE_CONTROL)))
        .addMethod(
          getReleaseControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.ReleaseControlRequest,
              io.mavsdk.gimbal.GimbalProto.ReleaseControlResponse>(
                service, METHODID_RELEASE_CONTROL)))
        .addMethod(
          getSubscribeControlMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SubscribeControlRequest,
              io.mavsdk.gimbal.GimbalProto.ControlResponse>(
                service, METHODID_SUBSCRIBE_CONTROL)))
        .addMethod(
          getSubscribeAttitudeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.gimbal.GimbalProto.SubscribeAttitudeRequest,
              io.mavsdk.gimbal.GimbalProto.AttitudeResponse>(
                service, METHODID_SUBSCRIBE_ATTITUDE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GimbalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetAnglesMethod())
              .addMethod(getSetPitchAndYawMethod())
              .addMethod(getSetPitchRateAndYawRateMethod())
              .addMethod(getSetModeMethod())
              .addMethod(getSetRoiLocationMethod())
              .addMethod(getTakeControlMethod())
              .addMethod(getReleaseControlMethod())
              .addMethod(getSubscribeControlMethod())
              .addMethod(getSubscribeAttitudeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
