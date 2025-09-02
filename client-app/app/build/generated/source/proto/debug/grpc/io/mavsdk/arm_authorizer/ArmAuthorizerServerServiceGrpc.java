package io.mavsdk.arm_authorizer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/arm_authorizer_server/arm_authorizer_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ArmAuthorizerServerServiceGrpc {

  private ArmAuthorizerServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.arm_authorizer_server.ArmAuthorizerServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest,
      io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse> getSubscribeArmAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeArmAuthorization",
      requestType = io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest.class,
      responseType = io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest,
      io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse> getSubscribeArmAuthorizationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest, io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse> getSubscribeArmAuthorizationMethod;
    if ((getSubscribeArmAuthorizationMethod = ArmAuthorizerServerServiceGrpc.getSubscribeArmAuthorizationMethod) == null) {
      synchronized (ArmAuthorizerServerServiceGrpc.class) {
        if ((getSubscribeArmAuthorizationMethod = ArmAuthorizerServerServiceGrpc.getSubscribeArmAuthorizationMethod) == null) {
          ArmAuthorizerServerServiceGrpc.getSubscribeArmAuthorizationMethod = getSubscribeArmAuthorizationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest, io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeArmAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeArmAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest,
      io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse> getAcceptArmAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptArmAuthorization",
      requestType = io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest.class,
      responseType = io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest,
      io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse> getAcceptArmAuthorizationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest, io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse> getAcceptArmAuthorizationMethod;
    if ((getAcceptArmAuthorizationMethod = ArmAuthorizerServerServiceGrpc.getAcceptArmAuthorizationMethod) == null) {
      synchronized (ArmAuthorizerServerServiceGrpc.class) {
        if ((getAcceptArmAuthorizationMethod = ArmAuthorizerServerServiceGrpc.getAcceptArmAuthorizationMethod) == null) {
          ArmAuthorizerServerServiceGrpc.getAcceptArmAuthorizationMethod = getAcceptArmAuthorizationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest, io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptArmAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAcceptArmAuthorizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest,
      io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse> getRejectArmAuthorizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RejectArmAuthorization",
      requestType = io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest.class,
      responseType = io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest,
      io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse> getRejectArmAuthorizationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest, io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse> getRejectArmAuthorizationMethod;
    if ((getRejectArmAuthorizationMethod = ArmAuthorizerServerServiceGrpc.getRejectArmAuthorizationMethod) == null) {
      synchronized (ArmAuthorizerServerServiceGrpc.class) {
        if ((getRejectArmAuthorizationMethod = ArmAuthorizerServerServiceGrpc.getRejectArmAuthorizationMethod) == null) {
          ArmAuthorizerServerServiceGrpc.getRejectArmAuthorizationMethod = getRejectArmAuthorizationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest, io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RejectArmAuthorization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRejectArmAuthorizationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArmAuthorizerServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArmAuthorizerServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArmAuthorizerServerServiceStub>() {
        @java.lang.Override
        public ArmAuthorizerServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArmAuthorizerServerServiceStub(channel, callOptions);
        }
      };
    return ArmAuthorizerServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArmAuthorizerServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArmAuthorizerServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArmAuthorizerServerServiceBlockingStub>() {
        @java.lang.Override
        public ArmAuthorizerServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArmAuthorizerServerServiceBlockingStub(channel, callOptions);
        }
      };
    return ArmAuthorizerServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArmAuthorizerServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ArmAuthorizerServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ArmAuthorizerServerServiceFutureStub>() {
        @java.lang.Override
        public ArmAuthorizerServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ArmAuthorizerServerServiceFutureStub(channel, callOptions);
        }
      };
    return ArmAuthorizerServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to arm authorization request messages. Each request received should respond to using RespondArmAuthorization
     * </pre>
     */
    default void subscribeArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeArmAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authorize arm for the specific time
     * </pre>
     */
    default void acceptArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAcceptArmAuthorizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reject arm authorization request
     * </pre>
     */
    default void rejectArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRejectArmAuthorizationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ArmAuthorizerServerService.
   */
  public static abstract class ArmAuthorizerServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ArmAuthorizerServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ArmAuthorizerServerService.
   */
  public static final class ArmAuthorizerServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ArmAuthorizerServerServiceStub> {
    private ArmAuthorizerServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArmAuthorizerServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArmAuthorizerServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to arm authorization request messages. Each request received should respond to using RespondArmAuthorization
     * </pre>
     */
    public void subscribeArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeArmAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authorize arm for the specific time
     * </pre>
     */
    public void acceptArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAcceptArmAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reject arm authorization request
     * </pre>
     */
    public void rejectArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRejectArmAuthorizationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ArmAuthorizerServerService.
   */
  public static final class ArmAuthorizerServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ArmAuthorizerServerServiceBlockingStub> {
    private ArmAuthorizerServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArmAuthorizerServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArmAuthorizerServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to arm authorization request messages. Each request received should respond to using RespondArmAuthorization
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse> subscribeArmAuthorization(
        io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeArmAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authorize arm for the specific time
     * </pre>
     */
    public io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse acceptArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAcceptArmAuthorizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reject arm authorization request
     * </pre>
     */
    public io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse rejectArmAuthorization(io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRejectArmAuthorizationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ArmAuthorizerServerService.
   */
  public static final class ArmAuthorizerServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ArmAuthorizerServerServiceFutureStub> {
    private ArmAuthorizerServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArmAuthorizerServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ArmAuthorizerServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Authorize arm for the specific time
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse> acceptArmAuthorization(
        io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAcceptArmAuthorizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reject arm authorization request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse> rejectArmAuthorization(
        io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRejectArmAuthorizationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_ARM_AUTHORIZATION = 0;
  private static final int METHODID_ACCEPT_ARM_AUTHORIZATION = 1;
  private static final int METHODID_REJECT_ARM_AUTHORIZATION = 2;

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
        case METHODID_SUBSCRIBE_ARM_AUTHORIZATION:
          serviceImpl.subscribeArmAuthorization((io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_ARM_AUTHORIZATION:
          serviceImpl.acceptArmAuthorization((io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse>) responseObserver);
          break;
        case METHODID_REJECT_ARM_AUTHORIZATION:
          serviceImpl.rejectArmAuthorization((io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse>) responseObserver);
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
          getSubscribeArmAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.SubscribeArmAuthorizationRequest,
              io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.ArmAuthorizationResponse>(
                service, METHODID_SUBSCRIBE_ARM_AUTHORIZATION)))
        .addMethod(
          getAcceptArmAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationRequest,
              io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.AcceptArmAuthorizationResponse>(
                service, METHODID_ACCEPT_ARM_AUTHORIZATION)))
        .addMethod(
          getRejectArmAuthorizationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationRequest,
              io.mavsdk.arm_authorizer.ArmAuthorizerServerProto.RejectArmAuthorizationResponse>(
                service, METHODID_REJECT_ARM_AUTHORIZATION)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArmAuthorizerServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeArmAuthorizationMethod())
              .addMethod(getAcceptArmAuthorizationMethod())
              .addMethod(getRejectArmAuthorizationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
