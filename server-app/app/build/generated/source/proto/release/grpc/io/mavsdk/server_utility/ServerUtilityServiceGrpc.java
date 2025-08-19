package io.mavsdk.server_utility;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Utility for onboard MAVSDK instances for common "server" tasks.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/server_utility/server_utility.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServerUtilityServiceGrpc {

  private ServerUtilityServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.server_utility.ServerUtilityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest,
      io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse> getSendStatusTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendStatusText",
      requestType = io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest.class,
      responseType = io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest,
      io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse> getSendStatusTextMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest, io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse> getSendStatusTextMethod;
    if ((getSendStatusTextMethod = ServerUtilityServiceGrpc.getSendStatusTextMethod) == null) {
      synchronized (ServerUtilityServiceGrpc.class) {
        if ((getSendStatusTextMethod = ServerUtilityServiceGrpc.getSendStatusTextMethod) == null) {
          ServerUtilityServiceGrpc.getSendStatusTextMethod = getSendStatusTextMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest, io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendStatusText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSendStatusTextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerUtilityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerUtilityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerUtilityServiceStub>() {
        @java.lang.Override
        public ServerUtilityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerUtilityServiceStub(channel, callOptions);
        }
      };
    return ServerUtilityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerUtilityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerUtilityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerUtilityServiceBlockingStub>() {
        @java.lang.Override
        public ServerUtilityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerUtilityServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerUtilityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerUtilityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerUtilityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerUtilityServiceFutureStub>() {
        @java.lang.Override
        public ServerUtilityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerUtilityServiceFutureStub(channel, callOptions);
        }
      };
    return ServerUtilityServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Utility for onboard MAVSDK instances for common "server" tasks.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a statustext.
     * </pre>
     */
    default void sendStatusText(io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendStatusTextMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServerUtilityService.
   * <pre>
   * Utility for onboard MAVSDK instances for common "server" tasks.
   * </pre>
   */
  public static abstract class ServerUtilityServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServerUtilityServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServerUtilityService.
   * <pre>
   * Utility for onboard MAVSDK instances for common "server" tasks.
   * </pre>
   */
  public static final class ServerUtilityServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServerUtilityServiceStub> {
    private ServerUtilityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerUtilityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerUtilityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a statustext.
     * </pre>
     */
    public void sendStatusText(io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendStatusTextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServerUtilityService.
   * <pre>
   * Utility for onboard MAVSDK instances for common "server" tasks.
   * </pre>
   */
  public static final class ServerUtilityServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServerUtilityServiceBlockingStub> {
    private ServerUtilityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerUtilityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerUtilityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a statustext.
     * </pre>
     */
    public io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse sendStatusText(io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendStatusTextMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServerUtilityService.
   * <pre>
   * Utility for onboard MAVSDK instances for common "server" tasks.
   * </pre>
   */
  public static final class ServerUtilityServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServerUtilityServiceFutureStub> {
    private ServerUtilityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerUtilityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerUtilityServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a statustext.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse> sendStatusText(
        io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendStatusTextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_STATUS_TEXT = 0;

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
        case METHODID_SEND_STATUS_TEXT:
          serviceImpl.sendStatusText((io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse>) responseObserver);
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
          getSendStatusTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextRequest,
              io.mavsdk.server_utility.ServerUtilityProto.SendStatusTextResponse>(
                service, METHODID_SEND_STATUS_TEXT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerUtilityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSendStatusTextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
