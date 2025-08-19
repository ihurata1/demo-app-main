package io.mavsdk.log_streaming;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide log streaming data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/log_streaming/log_streaming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogStreamingServiceGrpc {

  private LogStreamingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.log_streaming.LogStreamingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest,
      io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse> getStartLogStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartLogStreaming",
      requestType = io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest.class,
      responseType = io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest,
      io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse> getStartLogStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest, io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse> getStartLogStreamingMethod;
    if ((getStartLogStreamingMethod = LogStreamingServiceGrpc.getStartLogStreamingMethod) == null) {
      synchronized (LogStreamingServiceGrpc.class) {
        if ((getStartLogStreamingMethod = LogStreamingServiceGrpc.getStartLogStreamingMethod) == null) {
          LogStreamingServiceGrpc.getStartLogStreamingMethod = getStartLogStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest, io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartLogStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartLogStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest,
      io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse> getStopLogStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopLogStreaming",
      requestType = io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest.class,
      responseType = io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest,
      io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse> getStopLogStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest, io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse> getStopLogStreamingMethod;
    if ((getStopLogStreamingMethod = LogStreamingServiceGrpc.getStopLogStreamingMethod) == null) {
      synchronized (LogStreamingServiceGrpc.class) {
        if ((getStopLogStreamingMethod = LogStreamingServiceGrpc.getStopLogStreamingMethod) == null) {
          LogStreamingServiceGrpc.getStopLogStreamingMethod = getStopLogStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest, io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopLogStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopLogStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest,
      io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse> getSubscribeLogStreamingRawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLogStreamingRaw",
      requestType = io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest.class,
      responseType = io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest,
      io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse> getSubscribeLogStreamingRawMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest, io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse> getSubscribeLogStreamingRawMethod;
    if ((getSubscribeLogStreamingRawMethod = LogStreamingServiceGrpc.getSubscribeLogStreamingRawMethod) == null) {
      synchronized (LogStreamingServiceGrpc.class) {
        if ((getSubscribeLogStreamingRawMethod = LogStreamingServiceGrpc.getSubscribeLogStreamingRawMethod) == null) {
          LogStreamingServiceGrpc.getSubscribeLogStreamingRawMethod = getSubscribeLogStreamingRawMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest, io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeLogStreamingRaw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeLogStreamingRawMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogStreamingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStreamingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStreamingServiceStub>() {
        @java.lang.Override
        public LogStreamingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStreamingServiceStub(channel, callOptions);
        }
      };
    return LogStreamingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogStreamingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStreamingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStreamingServiceBlockingStub>() {
        @java.lang.Override
        public LogStreamingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStreamingServiceBlockingStub(channel, callOptions);
        }
      };
    return LogStreamingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogStreamingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogStreamingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogStreamingServiceFutureStub>() {
        @java.lang.Override
        public LogStreamingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogStreamingServiceFutureStub(channel, callOptions);
        }
      };
    return LogStreamingServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide log streaming data.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Start streaming logging data.
     * </pre>
     */
    default void startLogStreaming(io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartLogStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop streaming logging data.
     * </pre>
     */
    default void stopLogStreaming(io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopLogStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to logging messages
     * </pre>
     */
    default void subscribeLogStreamingRaw(io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeLogStreamingRawMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LogStreamingService.
   * <pre>
   * Provide log streaming data.
   * </pre>
   */
  public static abstract class LogStreamingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogStreamingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogStreamingService.
   * <pre>
   * Provide log streaming data.
   * </pre>
   */
  public static final class LogStreamingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LogStreamingServiceStub> {
    private LogStreamingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStreamingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStreamingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start streaming logging data.
     * </pre>
     */
    public void startLogStreaming(io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartLogStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop streaming logging data.
     * </pre>
     */
    public void stopLogStreaming(io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopLogStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to logging messages
     * </pre>
     */
    public void subscribeLogStreamingRaw(io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeLogStreamingRawMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogStreamingService.
   * <pre>
   * Provide log streaming data.
   * </pre>
   */
  public static final class LogStreamingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogStreamingServiceBlockingStub> {
    private LogStreamingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStreamingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStreamingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start streaming logging data.
     * </pre>
     */
    public io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse startLogStreaming(io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartLogStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop streaming logging data.
     * </pre>
     */
    public io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse stopLogStreaming(io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopLogStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to logging messages
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse> subscribeLogStreamingRaw(
        io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeLogStreamingRawMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogStreamingService.
   * <pre>
   * Provide log streaming data.
   * </pre>
   */
  public static final class LogStreamingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogStreamingServiceFutureStub> {
    private LogStreamingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogStreamingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogStreamingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start streaming logging data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse> startLogStreaming(
        io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartLogStreamingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop streaming logging data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse> stopLogStreaming(
        io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopLogStreamingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_LOG_STREAMING = 0;
  private static final int METHODID_STOP_LOG_STREAMING = 1;
  private static final int METHODID_SUBSCRIBE_LOG_STREAMING_RAW = 2;

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
        case METHODID_START_LOG_STREAMING:
          serviceImpl.startLogStreaming((io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse>) responseObserver);
          break;
        case METHODID_STOP_LOG_STREAMING:
          serviceImpl.stopLogStreaming((io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_LOG_STREAMING_RAW:
          serviceImpl.subscribeLogStreamingRaw((io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse>) responseObserver);
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
          getStartLogStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingRequest,
              io.mavsdk.log_streaming.LogStreamingProto.StartLogStreamingResponse>(
                service, METHODID_START_LOG_STREAMING)))
        .addMethod(
          getStopLogStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingRequest,
              io.mavsdk.log_streaming.LogStreamingProto.StopLogStreamingResponse>(
                service, METHODID_STOP_LOG_STREAMING)))
        .addMethod(
          getSubscribeLogStreamingRawMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.log_streaming.LogStreamingProto.SubscribeLogStreamingRawRequest,
              io.mavsdk.log_streaming.LogStreamingProto.LogStreamingRawResponse>(
                service, METHODID_SUBSCRIBE_LOG_STREAMING_RAW)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LogStreamingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getStartLogStreamingMethod())
              .addMethod(getStopLogStreamingMethod())
              .addMethod(getSubscribeLogStreamingRawMethod())
              .build();
        }
      }
    }
    return result;
  }
}
