package io.mavsdk.follow_me;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allow users to command the vehicle to follow a specific target.
 * The target is provided as a GPS coordinate and altitude.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/follow_me/follow_me.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FollowMeServiceGrpc {

  private FollowMeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.follow_me.FollowMeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.GetConfigRequest,
      io.mavsdk.follow_me.FollowMeProto.GetConfigResponse> getGetConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConfig",
      requestType = io.mavsdk.follow_me.FollowMeProto.GetConfigRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.GetConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.GetConfigRequest,
      io.mavsdk.follow_me.FollowMeProto.GetConfigResponse> getGetConfigMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.GetConfigRequest, io.mavsdk.follow_me.FollowMeProto.GetConfigResponse> getGetConfigMethod;
    if ((getGetConfigMethod = FollowMeServiceGrpc.getGetConfigMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getGetConfigMethod = FollowMeServiceGrpc.getGetConfigMethod) == null) {
          FollowMeServiceGrpc.getGetConfigMethod = getGetConfigMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.GetConfigRequest, io.mavsdk.follow_me.FollowMeProto.GetConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.GetConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.GetConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.SetConfigRequest,
      io.mavsdk.follow_me.FollowMeProto.SetConfigResponse> getSetConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetConfig",
      requestType = io.mavsdk.follow_me.FollowMeProto.SetConfigRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.SetConfigResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.SetConfigRequest,
      io.mavsdk.follow_me.FollowMeProto.SetConfigResponse> getSetConfigMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.SetConfigRequest, io.mavsdk.follow_me.FollowMeProto.SetConfigResponse> getSetConfigMethod;
    if ((getSetConfigMethod = FollowMeServiceGrpc.getSetConfigMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getSetConfigMethod = FollowMeServiceGrpc.getSetConfigMethod) == null) {
          FollowMeServiceGrpc.getSetConfigMethod = getSetConfigMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.SetConfigRequest, io.mavsdk.follow_me.FollowMeProto.SetConfigResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.SetConfigRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.SetConfigResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.IsActiveRequest,
      io.mavsdk.follow_me.FollowMeProto.IsActiveResponse> getIsActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsActive",
      requestType = io.mavsdk.follow_me.FollowMeProto.IsActiveRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.IsActiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.IsActiveRequest,
      io.mavsdk.follow_me.FollowMeProto.IsActiveResponse> getIsActiveMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.IsActiveRequest, io.mavsdk.follow_me.FollowMeProto.IsActiveResponse> getIsActiveMethod;
    if ((getIsActiveMethod = FollowMeServiceGrpc.getIsActiveMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getIsActiveMethod = FollowMeServiceGrpc.getIsActiveMethod) == null) {
          FollowMeServiceGrpc.getIsActiveMethod = getIsActiveMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.IsActiveRequest, io.mavsdk.follow_me.FollowMeProto.IsActiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.IsActiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.IsActiveResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest,
      io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse> getSetTargetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTargetLocation",
      requestType = io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest,
      io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse> getSetTargetLocationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest, io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse> getSetTargetLocationMethod;
    if ((getSetTargetLocationMethod = FollowMeServiceGrpc.getSetTargetLocationMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getSetTargetLocationMethod = FollowMeServiceGrpc.getSetTargetLocationMethod) == null) {
          FollowMeServiceGrpc.getSetTargetLocationMethod = getSetTargetLocationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest, io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTargetLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTargetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest,
      io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse> getGetLastLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLastLocation",
      requestType = io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest,
      io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse> getGetLastLocationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest, io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse> getGetLastLocationMethod;
    if ((getGetLastLocationMethod = FollowMeServiceGrpc.getGetLastLocationMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getGetLastLocationMethod = FollowMeServiceGrpc.getGetLastLocationMethod) == null) {
          FollowMeServiceGrpc.getGetLastLocationMethod = getGetLastLocationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest, io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLastLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetLastLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.StartRequest,
      io.mavsdk.follow_me.FollowMeProto.StartResponse> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = io.mavsdk.follow_me.FollowMeProto.StartRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.StartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.StartRequest,
      io.mavsdk.follow_me.FollowMeProto.StartResponse> getStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.StartRequest, io.mavsdk.follow_me.FollowMeProto.StartResponse> getStartMethod;
    if ((getStartMethod = FollowMeServiceGrpc.getStartMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getStartMethod = FollowMeServiceGrpc.getStartMethod) == null) {
          FollowMeServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.StartRequest, io.mavsdk.follow_me.FollowMeProto.StartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.StartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.StopRequest,
      io.mavsdk.follow_me.FollowMeProto.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = io.mavsdk.follow_me.FollowMeProto.StopRequest.class,
      responseType = io.mavsdk.follow_me.FollowMeProto.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.StopRequest,
      io.mavsdk.follow_me.FollowMeProto.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.follow_me.FollowMeProto.StopRequest, io.mavsdk.follow_me.FollowMeProto.StopResponse> getStopMethod;
    if ((getStopMethod = FollowMeServiceGrpc.getStopMethod) == null) {
      synchronized (FollowMeServiceGrpc.class) {
        if ((getStopMethod = FollowMeServiceGrpc.getStopMethod) == null) {
          FollowMeServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.follow_me.FollowMeProto.StopRequest, io.mavsdk.follow_me.FollowMeProto.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.follow_me.FollowMeProto.StopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FollowMeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FollowMeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FollowMeServiceStub>() {
        @java.lang.Override
        public FollowMeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FollowMeServiceStub(channel, callOptions);
        }
      };
    return FollowMeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FollowMeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FollowMeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FollowMeServiceBlockingStub>() {
        @java.lang.Override
        public FollowMeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FollowMeServiceBlockingStub(channel, callOptions);
        }
      };
    return FollowMeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FollowMeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FollowMeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FollowMeServiceFutureStub>() {
        @java.lang.Override
        public FollowMeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FollowMeServiceFutureStub(channel, callOptions);
        }
      };
    return FollowMeServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allow users to command the vehicle to follow a specific target.
   * The target is provided as a GPS coordinate and altitude.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get current configuration.
     * </pre>
     */
    default void getConfig(io.mavsdk.follow_me.FollowMeProto.GetConfigRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.GetConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Apply configuration by sending it to the system.
     * </pre>
     */
    default void setConfig(io.mavsdk.follow_me.FollowMeProto.SetConfigRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.SetConfigResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if FollowMe is active.
     * </pre>
     */
    default void isActive(io.mavsdk.follow_me.FollowMeProto.IsActiveRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.IsActiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsActiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set location of the moving target.
     * </pre>
     */
    default void setTargetLocation(io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTargetLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the last location of the target.
     * </pre>
     */
    default void getLastLocation(io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLastLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start FollowMe mode.
     * </pre>
     */
    default void start(io.mavsdk.follow_me.FollowMeProto.StartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.StartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop FollowMe mode.
     * </pre>
     */
    default void stop(io.mavsdk.follow_me.FollowMeProto.StopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FollowMeService.
   * <pre>
   * Allow users to command the vehicle to follow a specific target.
   * The target is provided as a GPS coordinate and altitude.
   * </pre>
   */
  public static abstract class FollowMeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FollowMeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FollowMeService.
   * <pre>
   * Allow users to command the vehicle to follow a specific target.
   * The target is provided as a GPS coordinate and altitude.
   * </pre>
   */
  public static final class FollowMeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FollowMeServiceStub> {
    private FollowMeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FollowMeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FollowMeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get current configuration.
     * </pre>
     */
    public void getConfig(io.mavsdk.follow_me.FollowMeProto.GetConfigRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.GetConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Apply configuration by sending it to the system.
     * </pre>
     */
    public void setConfig(io.mavsdk.follow_me.FollowMeProto.SetConfigRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.SetConfigResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if FollowMe is active.
     * </pre>
     */
    public void isActive(io.mavsdk.follow_me.FollowMeProto.IsActiveRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.IsActiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set location of the moving target.
     * </pre>
     */
    public void setTargetLocation(io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTargetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the last location of the target.
     * </pre>
     */
    public void getLastLocation(io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLastLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start FollowMe mode.
     * </pre>
     */
    public void start(io.mavsdk.follow_me.FollowMeProto.StartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.StartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop FollowMe mode.
     * </pre>
     */
    public void stop(io.mavsdk.follow_me.FollowMeProto.StopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FollowMeService.
   * <pre>
   * Allow users to command the vehicle to follow a specific target.
   * The target is provided as a GPS coordinate and altitude.
   * </pre>
   */
  public static final class FollowMeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FollowMeServiceBlockingStub> {
    private FollowMeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FollowMeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FollowMeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get current configuration.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.GetConfigResponse getConfig(io.mavsdk.follow_me.FollowMeProto.GetConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Apply configuration by sending it to the system.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.SetConfigResponse setConfig(io.mavsdk.follow_me.FollowMeProto.SetConfigRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if FollowMe is active.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.IsActiveResponse isActive(io.mavsdk.follow_me.FollowMeProto.IsActiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsActiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set location of the moving target.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse setTargetLocation(io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTargetLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the last location of the target.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse getLastLocation(io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLastLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start FollowMe mode.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.StartResponse start(io.mavsdk.follow_me.FollowMeProto.StartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop FollowMe mode.
     * </pre>
     */
    public io.mavsdk.follow_me.FollowMeProto.StopResponse stop(io.mavsdk.follow_me.FollowMeProto.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FollowMeService.
   * <pre>
   * Allow users to command the vehicle to follow a specific target.
   * The target is provided as a GPS coordinate and altitude.
   * </pre>
   */
  public static final class FollowMeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FollowMeServiceFutureStub> {
    private FollowMeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FollowMeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FollowMeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get current configuration.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.GetConfigResponse> getConfig(
        io.mavsdk.follow_me.FollowMeProto.GetConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Apply configuration by sending it to the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.SetConfigResponse> setConfig(
        io.mavsdk.follow_me.FollowMeProto.SetConfigRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if FollowMe is active.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.IsActiveResponse> isActive(
        io.mavsdk.follow_me.FollowMeProto.IsActiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set location of the moving target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse> setTargetLocation(
        io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTargetLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the last location of the target.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse> getLastLocation(
        io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLastLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start FollowMe mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.StartResponse> start(
        io.mavsdk.follow_me.FollowMeProto.StartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop FollowMe mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.follow_me.FollowMeProto.StopResponse> stop(
        io.mavsdk.follow_me.FollowMeProto.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONFIG = 0;
  private static final int METHODID_SET_CONFIG = 1;
  private static final int METHODID_IS_ACTIVE = 2;
  private static final int METHODID_SET_TARGET_LOCATION = 3;
  private static final int METHODID_GET_LAST_LOCATION = 4;
  private static final int METHODID_START = 5;
  private static final int METHODID_STOP = 6;

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
        case METHODID_GET_CONFIG:
          serviceImpl.getConfig((io.mavsdk.follow_me.FollowMeProto.GetConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.GetConfigResponse>) responseObserver);
          break;
        case METHODID_SET_CONFIG:
          serviceImpl.setConfig((io.mavsdk.follow_me.FollowMeProto.SetConfigRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.SetConfigResponse>) responseObserver);
          break;
        case METHODID_IS_ACTIVE:
          serviceImpl.isActive((io.mavsdk.follow_me.FollowMeProto.IsActiveRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.IsActiveResponse>) responseObserver);
          break;
        case METHODID_SET_TARGET_LOCATION:
          serviceImpl.setTargetLocation((io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse>) responseObserver);
          break;
        case METHODID_GET_LAST_LOCATION:
          serviceImpl.getLastLocation((io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((io.mavsdk.follow_me.FollowMeProto.StartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.StartResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((io.mavsdk.follow_me.FollowMeProto.StopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.follow_me.FollowMeProto.StopResponse>) responseObserver);
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
          getGetConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.GetConfigRequest,
              io.mavsdk.follow_me.FollowMeProto.GetConfigResponse>(
                service, METHODID_GET_CONFIG)))
        .addMethod(
          getSetConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.SetConfigRequest,
              io.mavsdk.follow_me.FollowMeProto.SetConfigResponse>(
                service, METHODID_SET_CONFIG)))
        .addMethod(
          getIsActiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.IsActiveRequest,
              io.mavsdk.follow_me.FollowMeProto.IsActiveResponse>(
                service, METHODID_IS_ACTIVE)))
        .addMethod(
          getSetTargetLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.SetTargetLocationRequest,
              io.mavsdk.follow_me.FollowMeProto.SetTargetLocationResponse>(
                service, METHODID_SET_TARGET_LOCATION)))
        .addMethod(
          getGetLastLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.GetLastLocationRequest,
              io.mavsdk.follow_me.FollowMeProto.GetLastLocationResponse>(
                service, METHODID_GET_LAST_LOCATION)))
        .addMethod(
          getStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.StartRequest,
              io.mavsdk.follow_me.FollowMeProto.StartResponse>(
                service, METHODID_START)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.follow_me.FollowMeProto.StopRequest,
              io.mavsdk.follow_me.FollowMeProto.StopResponse>(
                service, METHODID_STOP)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FollowMeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetConfigMethod())
              .addMethod(getSetConfigMethod())
              .addMethod(getIsActiveMethod())
              .addMethod(getSetTargetLocationMethod())
              .addMethod(getGetLastLocationMethod())
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
