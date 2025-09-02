package io.mavsdk.shell;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * Allow to communicate with the vehicle's system shell.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/shell/shell.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShellServiceGrpc {

  private ShellServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.shell.ShellService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.shell.ShellProto.SendRequest,
      io.mavsdk.shell.ShellProto.SendResponse> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = io.mavsdk.shell.ShellProto.SendRequest.class,
      responseType = io.mavsdk.shell.ShellProto.SendResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.shell.ShellProto.SendRequest,
      io.mavsdk.shell.ShellProto.SendResponse> getSendMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.shell.ShellProto.SendRequest, io.mavsdk.shell.ShellProto.SendResponse> getSendMethod;
    if ((getSendMethod = ShellServiceGrpc.getSendMethod) == null) {
      synchronized (ShellServiceGrpc.class) {
        if ((getSendMethod = ShellServiceGrpc.getSendMethod) == null) {
          ShellServiceGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.shell.ShellProto.SendRequest, io.mavsdk.shell.ShellProto.SendResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.shell.ShellProto.SendRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.shell.ShellProto.SendResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.shell.ShellProto.SubscribeReceiveRequest,
      io.mavsdk.shell.ShellProto.ReceiveResponse> getSubscribeReceiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeReceive",
      requestType = io.mavsdk.shell.ShellProto.SubscribeReceiveRequest.class,
      responseType = io.mavsdk.shell.ShellProto.ReceiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.shell.ShellProto.SubscribeReceiveRequest,
      io.mavsdk.shell.ShellProto.ReceiveResponse> getSubscribeReceiveMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.shell.ShellProto.SubscribeReceiveRequest, io.mavsdk.shell.ShellProto.ReceiveResponse> getSubscribeReceiveMethod;
    if ((getSubscribeReceiveMethod = ShellServiceGrpc.getSubscribeReceiveMethod) == null) {
      synchronized (ShellServiceGrpc.class) {
        if ((getSubscribeReceiveMethod = ShellServiceGrpc.getSubscribeReceiveMethod) == null) {
          ShellServiceGrpc.getSubscribeReceiveMethod = getSubscribeReceiveMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.shell.ShellProto.SubscribeReceiveRequest, io.mavsdk.shell.ShellProto.ReceiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeReceive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.shell.ShellProto.SubscribeReceiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.shell.ShellProto.ReceiveResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeReceiveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShellServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShellServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShellServiceStub>() {
        @java.lang.Override
        public ShellServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShellServiceStub(channel, callOptions);
        }
      };
    return ShellServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShellServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShellServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShellServiceBlockingStub>() {
        @java.lang.Override
        public ShellServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShellServiceBlockingStub(channel, callOptions);
        }
      };
    return ShellServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShellServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShellServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShellServiceFutureStub>() {
        @java.lang.Override
        public ShellServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShellServiceFutureStub(channel, callOptions);
        }
      };
    return ShellServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * Allow to communicate with the vehicle's system shell.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send a command line.
     * </pre>
     */
    default void send(io.mavsdk.shell.ShellProto.SendRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.shell.ShellProto.SendResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    /**
     * <pre>
     * Receive feedback from a sent command line.
     * This subscription needs to be made before a command line is sent, otherwise, no response will be sent.
     * </pre>
     */
    default void subscribeReceive(io.mavsdk.shell.ShellProto.SubscribeReceiveRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.shell.ShellProto.ReceiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeReceiveMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ShellService.
   * <pre>
   **
   * Allow to communicate with the vehicle's system shell.
   * </pre>
   */
  public static abstract class ShellServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShellServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ShellService.
   * <pre>
   **
   * Allow to communicate with the vehicle's system shell.
   * </pre>
   */
  public static final class ShellServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ShellServiceStub> {
    private ShellServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShellServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShellServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a command line.
     * </pre>
     */
    public void send(io.mavsdk.shell.ShellProto.SendRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.shell.ShellProto.SendResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Receive feedback from a sent command line.
     * This subscription needs to be made before a command line is sent, otherwise, no response will be sent.
     * </pre>
     */
    public void subscribeReceive(io.mavsdk.shell.ShellProto.SubscribeReceiveRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.shell.ShellProto.ReceiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeReceiveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ShellService.
   * <pre>
   **
   * Allow to communicate with the vehicle's system shell.
   * </pre>
   */
  public static final class ShellServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShellServiceBlockingStub> {
    private ShellServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShellServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShellServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a command line.
     * </pre>
     */
    public io.mavsdk.shell.ShellProto.SendResponse send(io.mavsdk.shell.ShellProto.SendRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Receive feedback from a sent command line.
     * This subscription needs to be made before a command line is sent, otherwise, no response will be sent.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.shell.ShellProto.ReceiveResponse> subscribeReceive(
        io.mavsdk.shell.ShellProto.SubscribeReceiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeReceiveMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ShellService.
   * <pre>
   **
   * Allow to communicate with the vehicle's system shell.
   * </pre>
   */
  public static final class ShellServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShellServiceFutureStub> {
    private ShellServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShellServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShellServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a command line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.shell.ShellProto.SendResponse> send(
        io.mavsdk.shell.ShellProto.SendRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;
  private static final int METHODID_SUBSCRIBE_RECEIVE = 1;

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
        case METHODID_SEND:
          serviceImpl.send((io.mavsdk.shell.ShellProto.SendRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.shell.ShellProto.SendResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_RECEIVE:
          serviceImpl.subscribeReceive((io.mavsdk.shell.ShellProto.SubscribeReceiveRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.shell.ShellProto.ReceiveResponse>) responseObserver);
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
          getSendMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.shell.ShellProto.SendRequest,
              io.mavsdk.shell.ShellProto.SendResponse>(
                service, METHODID_SEND)))
        .addMethod(
          getSubscribeReceiveMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.shell.ShellProto.SubscribeReceiveRequest,
              io.mavsdk.shell.ShellProto.ReceiveResponse>(
                service, METHODID_SUBSCRIBE_RECEIVE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShellServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSendMethod())
              .addMethod(getSubscribeReceiveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
