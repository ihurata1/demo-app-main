package io.mavsdk.transponder;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allow users to get ADS-B information
 * and set ADS-B update rates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/transponder/transponder.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TransponderServiceGrpc {

  private TransponderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.transponder.TransponderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest,
      io.mavsdk.transponder.TransponderProto.TransponderResponse> getSubscribeTransponderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTransponder",
      requestType = io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest.class,
      responseType = io.mavsdk.transponder.TransponderProto.TransponderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest,
      io.mavsdk.transponder.TransponderProto.TransponderResponse> getSubscribeTransponderMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest, io.mavsdk.transponder.TransponderProto.TransponderResponse> getSubscribeTransponderMethod;
    if ((getSubscribeTransponderMethod = TransponderServiceGrpc.getSubscribeTransponderMethod) == null) {
      synchronized (TransponderServiceGrpc.class) {
        if ((getSubscribeTransponderMethod = TransponderServiceGrpc.getSubscribeTransponderMethod) == null) {
          TransponderServiceGrpc.getSubscribeTransponderMethod = getSubscribeTransponderMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest, io.mavsdk.transponder.TransponderProto.TransponderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTransponder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.transponder.TransponderProto.TransponderResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTransponderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest,
      io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse> getSetRateTransponderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateTransponder",
      requestType = io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest.class,
      responseType = io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest,
      io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse> getSetRateTransponderMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest, io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse> getSetRateTransponderMethod;
    if ((getSetRateTransponderMethod = TransponderServiceGrpc.getSetRateTransponderMethod) == null) {
      synchronized (TransponderServiceGrpc.class) {
        if ((getSetRateTransponderMethod = TransponderServiceGrpc.getSetRateTransponderMethod) == null) {
          TransponderServiceGrpc.getSetRateTransponderMethod = getSetRateTransponderMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest, io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateTransponder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateTransponderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransponderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransponderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransponderServiceStub>() {
        @java.lang.Override
        public TransponderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransponderServiceStub(channel, callOptions);
        }
      };
    return TransponderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransponderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransponderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransponderServiceBlockingStub>() {
        @java.lang.Override
        public TransponderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransponderServiceBlockingStub(channel, callOptions);
        }
      };
    return TransponderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransponderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TransponderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TransponderServiceFutureStub>() {
        @java.lang.Override
        public TransponderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TransponderServiceFutureStub(channel, callOptions);
        }
      };
    return TransponderServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allow users to get ADS-B information
   * and set ADS-B update rates.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to 'transponder' updates.
     * </pre>
     */
    default void subscribeTransponder(io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.transponder.TransponderProto.TransponderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTransponderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'transponder' updates.
     * </pre>
     */
    default void setRateTransponder(io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateTransponderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TransponderService.
   * <pre>
   * Allow users to get ADS-B information
   * and set ADS-B update rates.
   * </pre>
   */
  public static abstract class TransponderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TransponderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TransponderService.
   * <pre>
   * Allow users to get ADS-B information
   * and set ADS-B update rates.
   * </pre>
   */
  public static final class TransponderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TransponderServiceStub> {
    private TransponderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransponderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransponderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'transponder' updates.
     * </pre>
     */
    public void subscribeTransponder(io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.transponder.TransponderProto.TransponderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTransponderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'transponder' updates.
     * </pre>
     */
    public void setRateTransponder(io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateTransponderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TransponderService.
   * <pre>
   * Allow users to get ADS-B information
   * and set ADS-B update rates.
   * </pre>
   */
  public static final class TransponderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TransponderServiceBlockingStub> {
    private TransponderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransponderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransponderServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'transponder' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.transponder.TransponderProto.TransponderResponse> subscribeTransponder(
        io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTransponderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'transponder' updates.
     * </pre>
     */
    public io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse setRateTransponder(io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateTransponderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TransponderService.
   * <pre>
   * Allow users to get ADS-B information
   * and set ADS-B update rates.
   * </pre>
   */
  public static final class TransponderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TransponderServiceFutureStub> {
    private TransponderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransponderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TransponderServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set rate to 'transponder' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse> setRateTransponder(
        io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateTransponderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_TRANSPONDER = 0;
  private static final int METHODID_SET_RATE_TRANSPONDER = 1;

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
        case METHODID_SUBSCRIBE_TRANSPONDER:
          serviceImpl.subscribeTransponder((io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.transponder.TransponderProto.TransponderResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_TRANSPONDER:
          serviceImpl.setRateTransponder((io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse>) responseObserver);
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
          getSubscribeTransponderMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.transponder.TransponderProto.SubscribeTransponderRequest,
              io.mavsdk.transponder.TransponderProto.TransponderResponse>(
                service, METHODID_SUBSCRIBE_TRANSPONDER)))
        .addMethod(
          getSetRateTransponderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.transponder.TransponderProto.SetRateTransponderRequest,
              io.mavsdk.transponder.TransponderProto.SetRateTransponderResponse>(
                service, METHODID_SET_RATE_TRANSPONDER)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TransponderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeTransponderMethod())
              .addMethod(getSetRateTransponderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
