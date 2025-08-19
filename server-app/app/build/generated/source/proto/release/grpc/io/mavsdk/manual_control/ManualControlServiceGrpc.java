package io.mavsdk.manual_control;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable manual control using e.g. a joystick or gamepad.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/manual_control/manual_control.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ManualControlServiceGrpc {

  private ManualControlServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.manual_control.ManualControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest,
      io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse> getStartPositionControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartPositionControl",
      requestType = io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest.class,
      responseType = io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest,
      io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse> getStartPositionControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest, io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse> getStartPositionControlMethod;
    if ((getStartPositionControlMethod = ManualControlServiceGrpc.getStartPositionControlMethod) == null) {
      synchronized (ManualControlServiceGrpc.class) {
        if ((getStartPositionControlMethod = ManualControlServiceGrpc.getStartPositionControlMethod) == null) {
          ManualControlServiceGrpc.getStartPositionControlMethod = getStartPositionControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest, io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartPositionControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartPositionControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest,
      io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse> getStartAltitudeControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartAltitudeControl",
      requestType = io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest.class,
      responseType = io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest,
      io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse> getStartAltitudeControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest, io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse> getStartAltitudeControlMethod;
    if ((getStartAltitudeControlMethod = ManualControlServiceGrpc.getStartAltitudeControlMethod) == null) {
      synchronized (ManualControlServiceGrpc.class) {
        if ((getStartAltitudeControlMethod = ManualControlServiceGrpc.getStartAltitudeControlMethod) == null) {
          ManualControlServiceGrpc.getStartAltitudeControlMethod = getStartAltitudeControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest, io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartAltitudeControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartAltitudeControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest,
      io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse> getSetManualControlInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetManualControlInput",
      requestType = io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest.class,
      responseType = io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest,
      io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse> getSetManualControlInputMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest, io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse> getSetManualControlInputMethod;
    if ((getSetManualControlInputMethod = ManualControlServiceGrpc.getSetManualControlInputMethod) == null) {
      synchronized (ManualControlServiceGrpc.class) {
        if ((getSetManualControlInputMethod = ManualControlServiceGrpc.getSetManualControlInputMethod) == null) {
          ManualControlServiceGrpc.getSetManualControlInputMethod = getSetManualControlInputMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest, io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetManualControlInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetManualControlInputMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ManualControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManualControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManualControlServiceStub>() {
        @java.lang.Override
        public ManualControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManualControlServiceStub(channel, callOptions);
        }
      };
    return ManualControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ManualControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManualControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManualControlServiceBlockingStub>() {
        @java.lang.Override
        public ManualControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManualControlServiceBlockingStub(channel, callOptions);
        }
      };
    return ManualControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ManualControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ManualControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ManualControlServiceFutureStub>() {
        @java.lang.Override
        public ManualControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ManualControlServiceFutureStub(channel, callOptions);
        }
      };
    return ManualControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable manual control using e.g. a joystick or gamepad.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Start position control using e.g. joystick input.
     * Requires manual control input to be sent regularly already.
     * Requires a valid position using e.g. GPS, external vision, or optical flow.
     * </pre>
     */
    default void startPositionControl(io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartPositionControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start altitude control
     * Requires manual control input to be sent regularly already.
     * Does not require a  valid position e.g. GPS.
     * </pre>
     */
    default void startAltitudeControl(io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartAltitudeControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set manual control input
     * The manual control input needs to be sent at a rate high enough to prevent
     * triggering of RC loss, a good minimum rate is 10 Hz.
     * </pre>
     */
    default void setManualControlInput(io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetManualControlInputMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ManualControlService.
   * <pre>
   * Enable manual control using e.g. a joystick or gamepad.
   * </pre>
   */
  public static abstract class ManualControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ManualControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ManualControlService.
   * <pre>
   * Enable manual control using e.g. a joystick or gamepad.
   * </pre>
   */
  public static final class ManualControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ManualControlServiceStub> {
    private ManualControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManualControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManualControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start position control using e.g. joystick input.
     * Requires manual control input to be sent regularly already.
     * Requires a valid position using e.g. GPS, external vision, or optical flow.
     * </pre>
     */
    public void startPositionControl(io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartPositionControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start altitude control
     * Requires manual control input to be sent regularly already.
     * Does not require a  valid position e.g. GPS.
     * </pre>
     */
    public void startAltitudeControl(io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartAltitudeControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set manual control input
     * The manual control input needs to be sent at a rate high enough to prevent
     * triggering of RC loss, a good minimum rate is 10 Hz.
     * </pre>
     */
    public void setManualControlInput(io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetManualControlInputMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ManualControlService.
   * <pre>
   * Enable manual control using e.g. a joystick or gamepad.
   * </pre>
   */
  public static final class ManualControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ManualControlServiceBlockingStub> {
    private ManualControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManualControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManualControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start position control using e.g. joystick input.
     * Requires manual control input to be sent regularly already.
     * Requires a valid position using e.g. GPS, external vision, or optical flow.
     * </pre>
     */
    public io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse startPositionControl(io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartPositionControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start altitude control
     * Requires manual control input to be sent regularly already.
     * Does not require a  valid position e.g. GPS.
     * </pre>
     */
    public io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse startAltitudeControl(io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartAltitudeControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set manual control input
     * The manual control input needs to be sent at a rate high enough to prevent
     * triggering of RC loss, a good minimum rate is 10 Hz.
     * </pre>
     */
    public io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse setManualControlInput(io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetManualControlInputMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ManualControlService.
   * <pre>
   * Enable manual control using e.g. a joystick or gamepad.
   * </pre>
   */
  public static final class ManualControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ManualControlServiceFutureStub> {
    private ManualControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ManualControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ManualControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start position control using e.g. joystick input.
     * Requires manual control input to be sent regularly already.
     * Requires a valid position using e.g. GPS, external vision, or optical flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse> startPositionControl(
        io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartPositionControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start altitude control
     * Requires manual control input to be sent regularly already.
     * Does not require a  valid position e.g. GPS.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse> startAltitudeControl(
        io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartAltitudeControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set manual control input
     * The manual control input needs to be sent at a rate high enough to prevent
     * triggering of RC loss, a good minimum rate is 10 Hz.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse> setManualControlInput(
        io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetManualControlInputMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_POSITION_CONTROL = 0;
  private static final int METHODID_START_ALTITUDE_CONTROL = 1;
  private static final int METHODID_SET_MANUAL_CONTROL_INPUT = 2;

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
        case METHODID_START_POSITION_CONTROL:
          serviceImpl.startPositionControl((io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse>) responseObserver);
          break;
        case METHODID_START_ALTITUDE_CONTROL:
          serviceImpl.startAltitudeControl((io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse>) responseObserver);
          break;
        case METHODID_SET_MANUAL_CONTROL_INPUT:
          serviceImpl.setManualControlInput((io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse>) responseObserver);
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
          getStartPositionControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.manual_control.ManualControlProto.StartPositionControlRequest,
              io.mavsdk.manual_control.ManualControlProto.StartPositionControlResponse>(
                service, METHODID_START_POSITION_CONTROL)))
        .addMethod(
          getStartAltitudeControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlRequest,
              io.mavsdk.manual_control.ManualControlProto.StartAltitudeControlResponse>(
                service, METHODID_START_ALTITUDE_CONTROL)))
        .addMethod(
          getSetManualControlInputMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.manual_control.ManualControlProto.SetManualControlInputRequest,
              io.mavsdk.manual_control.ManualControlProto.SetManualControlInputResponse>(
                service, METHODID_SET_MANUAL_CONTROL_INPUT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ManualControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getStartPositionControlMethod())
              .addMethod(getStartAltitudeControlMethod())
              .addMethod(getSetManualControlInputMethod())
              .build();
        }
      }
    }
    return result;
  }
}
