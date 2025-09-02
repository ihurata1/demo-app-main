package io.mavsdk.core;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Access to the connection state and core configurations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/core/core.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CoreServiceGrpc {

  private CoreServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.core.CoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest,
      io.mavsdk.core.CoreProto.ConnectionStateResponse> getSubscribeConnectionStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeConnectionState",
      requestType = io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest.class,
      responseType = io.mavsdk.core.CoreProto.ConnectionStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest,
      io.mavsdk.core.CoreProto.ConnectionStateResponse> getSubscribeConnectionStateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest, io.mavsdk.core.CoreProto.ConnectionStateResponse> getSubscribeConnectionStateMethod;
    if ((getSubscribeConnectionStateMethod = CoreServiceGrpc.getSubscribeConnectionStateMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSubscribeConnectionStateMethod = CoreServiceGrpc.getSubscribeConnectionStateMethod) == null) {
          CoreServiceGrpc.getSubscribeConnectionStateMethod = getSubscribeConnectionStateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest, io.mavsdk.core.CoreProto.ConnectionStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeConnectionState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.core.CoreProto.ConnectionStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeConnectionStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest,
      io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse> getSetMavlinkTimeoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMavlinkTimeout",
      requestType = io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest.class,
      responseType = io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest,
      io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse> getSetMavlinkTimeoutMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest, io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse> getSetMavlinkTimeoutMethod;
    if ((getSetMavlinkTimeoutMethod = CoreServiceGrpc.getSetMavlinkTimeoutMethod) == null) {
      synchronized (CoreServiceGrpc.class) {
        if ((getSetMavlinkTimeoutMethod = CoreServiceGrpc.getSetMavlinkTimeoutMethod) == null) {
          CoreServiceGrpc.getSetMavlinkTimeoutMethod = getSetMavlinkTimeoutMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest, io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMavlinkTimeout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetMavlinkTimeoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceStub>() {
        @java.lang.Override
        public CoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceStub(channel, callOptions);
        }
      };
    return CoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceBlockingStub>() {
        @java.lang.Override
        public CoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceBlockingStub(channel, callOptions);
        }
      };
    return CoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CoreServiceFutureStub>() {
        @java.lang.Override
        public CoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CoreServiceFutureStub(channel, callOptions);
        }
      };
    return CoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Access to the connection state and core configurations
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to 'connection state' updates.
     * </pre>
     */
    default void subscribeConnectionState(io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.core.CoreProto.ConnectionStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeConnectionStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set timeout of MAVLink transfers.
     * The default timeout used is generally (0.5 seconds) seconds.
     * If MAVSDK is used on the same host this timeout can be reduced, while
     * if MAVSDK has to communicate over links with high latency it might
     * need to be increased to prevent timeouts.
     * </pre>
     */
    default void setMavlinkTimeout(io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMavlinkTimeoutMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CoreService.
   * <pre>
   * Access to the connection state and core configurations
   * </pre>
   */
  public static abstract class CoreServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CoreServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CoreService.
   * <pre>
   * Access to the connection state and core configurations
   * </pre>
   */
  public static final class CoreServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CoreServiceStub> {
    private CoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'connection state' updates.
     * </pre>
     */
    public void subscribeConnectionState(io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.core.CoreProto.ConnectionStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeConnectionStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set timeout of MAVLink transfers.
     * The default timeout used is generally (0.5 seconds) seconds.
     * If MAVSDK is used on the same host this timeout can be reduced, while
     * if MAVSDK has to communicate over links with high latency it might
     * need to be increased to prevent timeouts.
     * </pre>
     */
    public void setMavlinkTimeout(io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMavlinkTimeoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CoreService.
   * <pre>
   * Access to the connection state and core configurations
   * </pre>
   */
  public static final class CoreServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CoreServiceBlockingStub> {
    private CoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'connection state' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.core.CoreProto.ConnectionStateResponse> subscribeConnectionState(
        io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeConnectionStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set timeout of MAVLink transfers.
     * The default timeout used is generally (0.5 seconds) seconds.
     * If MAVSDK is used on the same host this timeout can be reduced, while
     * if MAVSDK has to communicate over links with high latency it might
     * need to be increased to prevent timeouts.
     * </pre>
     */
    public io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse setMavlinkTimeout(io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMavlinkTimeoutMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CoreService.
   * <pre>
   * Access to the connection state and core configurations
   * </pre>
   */
  public static final class CoreServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CoreServiceFutureStub> {
    private CoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CoreServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set timeout of MAVLink transfers.
     * The default timeout used is generally (0.5 seconds) seconds.
     * If MAVSDK is used on the same host this timeout can be reduced, while
     * if MAVSDK has to communicate over links with high latency it might
     * need to be increased to prevent timeouts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse> setMavlinkTimeout(
        io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMavlinkTimeoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_CONNECTION_STATE = 0;
  private static final int METHODID_SET_MAVLINK_TIMEOUT = 1;

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
        case METHODID_SUBSCRIBE_CONNECTION_STATE:
          serviceImpl.subscribeConnectionState((io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.core.CoreProto.ConnectionStateResponse>) responseObserver);
          break;
        case METHODID_SET_MAVLINK_TIMEOUT:
          serviceImpl.setMavlinkTimeout((io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse>) responseObserver);
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
          getSubscribeConnectionStateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.core.CoreProto.SubscribeConnectionStateRequest,
              io.mavsdk.core.CoreProto.ConnectionStateResponse>(
                service, METHODID_SUBSCRIBE_CONNECTION_STATE)))
        .addMethod(
          getSetMavlinkTimeoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.core.CoreProto.SetMavlinkTimeoutRequest,
              io.mavsdk.core.CoreProto.SetMavlinkTimeoutResponse>(
                service, METHODID_SET_MAVLINK_TIMEOUT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeConnectionStateMethod())
              .addMethod(getSetMavlinkTimeoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
