package io.mavsdk.log_files;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allow to download log files from the vehicle after a flight is complete.
 * For log streaming during flight check the logging plugin.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/log_files/log_files.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LogFilesServiceGrpc {

  private LogFilesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.log_files.LogFilesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.GetEntriesRequest,
      io.mavsdk.log_files.LogFilesProto.GetEntriesResponse> getGetEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntries",
      requestType = io.mavsdk.log_files.LogFilesProto.GetEntriesRequest.class,
      responseType = io.mavsdk.log_files.LogFilesProto.GetEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.GetEntriesRequest,
      io.mavsdk.log_files.LogFilesProto.GetEntriesResponse> getGetEntriesMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.GetEntriesRequest, io.mavsdk.log_files.LogFilesProto.GetEntriesResponse> getGetEntriesMethod;
    if ((getGetEntriesMethod = LogFilesServiceGrpc.getGetEntriesMethod) == null) {
      synchronized (LogFilesServiceGrpc.class) {
        if ((getGetEntriesMethod = LogFilesServiceGrpc.getGetEntriesMethod) == null) {
          LogFilesServiceGrpc.getGetEntriesMethod = getGetEntriesMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.log_files.LogFilesProto.GetEntriesRequest, io.mavsdk.log_files.LogFilesProto.GetEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_files.LogFilesProto.GetEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_files.LogFilesProto.GetEntriesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest,
      io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse> getSubscribeDownloadLogFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeDownloadLogFile",
      requestType = io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest.class,
      responseType = io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest,
      io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse> getSubscribeDownloadLogFileMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest, io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse> getSubscribeDownloadLogFileMethod;
    if ((getSubscribeDownloadLogFileMethod = LogFilesServiceGrpc.getSubscribeDownloadLogFileMethod) == null) {
      synchronized (LogFilesServiceGrpc.class) {
        if ((getSubscribeDownloadLogFileMethod = LogFilesServiceGrpc.getSubscribeDownloadLogFileMethod) == null) {
          LogFilesServiceGrpc.getSubscribeDownloadLogFileMethod = getSubscribeDownloadLogFileMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest, io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeDownloadLogFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeDownloadLogFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest,
      io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse> getEraseAllLogFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EraseAllLogFiles",
      requestType = io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest.class,
      responseType = io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest,
      io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse> getEraseAllLogFilesMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest, io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse> getEraseAllLogFilesMethod;
    if ((getEraseAllLogFilesMethod = LogFilesServiceGrpc.getEraseAllLogFilesMethod) == null) {
      synchronized (LogFilesServiceGrpc.class) {
        if ((getEraseAllLogFilesMethod = LogFilesServiceGrpc.getEraseAllLogFilesMethod) == null) {
          LogFilesServiceGrpc.getEraseAllLogFilesMethod = getEraseAllLogFilesMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest, io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EraseAllLogFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getEraseAllLogFilesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogFilesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogFilesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogFilesServiceStub>() {
        @java.lang.Override
        public LogFilesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogFilesServiceStub(channel, callOptions);
        }
      };
    return LogFilesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogFilesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogFilesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogFilesServiceBlockingStub>() {
        @java.lang.Override
        public LogFilesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogFilesServiceBlockingStub(channel, callOptions);
        }
      };
    return LogFilesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogFilesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogFilesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogFilesServiceFutureStub>() {
        @java.lang.Override
        public LogFilesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogFilesServiceFutureStub(channel, callOptions);
        }
      };
    return LogFilesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allow to download log files from the vehicle after a flight is complete.
   * For log streaming during flight check the logging plugin.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get List of log files.
     * </pre>
     */
    default void getEntries(io.mavsdk.log_files.LogFilesProto.GetEntriesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.GetEntriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download log file.
     * </pre>
     */
    default void subscribeDownloadLogFile(io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeDownloadLogFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Erase all log files.
     * </pre>
     */
    default void eraseAllLogFiles(io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEraseAllLogFilesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LogFilesService.
   * <pre>
   * Allow to download log files from the vehicle after a flight is complete.
   * For log streaming during flight check the logging plugin.
   * </pre>
   */
  public static abstract class LogFilesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LogFilesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LogFilesService.
   * <pre>
   * Allow to download log files from the vehicle after a flight is complete.
   * For log streaming during flight check the logging plugin.
   * </pre>
   */
  public static final class LogFilesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LogFilesServiceStub> {
    private LogFilesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogFilesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogFilesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get List of log files.
     * </pre>
     */
    public void getEntries(io.mavsdk.log_files.LogFilesProto.GetEntriesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.GetEntriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download log file.
     * </pre>
     */
    public void subscribeDownloadLogFile(io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeDownloadLogFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Erase all log files.
     * </pre>
     */
    public void eraseAllLogFiles(io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEraseAllLogFilesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LogFilesService.
   * <pre>
   * Allow to download log files from the vehicle after a flight is complete.
   * For log streaming during flight check the logging plugin.
   * </pre>
   */
  public static final class LogFilesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LogFilesServiceBlockingStub> {
    private LogFilesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogFilesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogFilesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get List of log files.
     * </pre>
     */
    public io.mavsdk.log_files.LogFilesProto.GetEntriesResponse getEntries(io.mavsdk.log_files.LogFilesProto.GetEntriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEntriesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download log file.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse> subscribeDownloadLogFile(
        io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeDownloadLogFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Erase all log files.
     * </pre>
     */
    public io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse eraseAllLogFiles(io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEraseAllLogFilesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LogFilesService.
   * <pre>
   * Allow to download log files from the vehicle after a flight is complete.
   * For log streaming during flight check the logging plugin.
   * </pre>
   */
  public static final class LogFilesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LogFilesServiceFutureStub> {
    private LogFilesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogFilesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogFilesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get List of log files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.log_files.LogFilesProto.GetEntriesResponse> getEntries(
        io.mavsdk.log_files.LogFilesProto.GetEntriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEntriesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Erase all log files.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse> eraseAllLogFiles(
        io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEraseAllLogFilesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENTRIES = 0;
  private static final int METHODID_SUBSCRIBE_DOWNLOAD_LOG_FILE = 1;
  private static final int METHODID_ERASE_ALL_LOG_FILES = 2;

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
        case METHODID_GET_ENTRIES:
          serviceImpl.getEntries((io.mavsdk.log_files.LogFilesProto.GetEntriesRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.GetEntriesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_DOWNLOAD_LOG_FILE:
          serviceImpl.subscribeDownloadLogFile((io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse>) responseObserver);
          break;
        case METHODID_ERASE_ALL_LOG_FILES:
          serviceImpl.eraseAllLogFiles((io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse>) responseObserver);
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
          getGetEntriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.log_files.LogFilesProto.GetEntriesRequest,
              io.mavsdk.log_files.LogFilesProto.GetEntriesResponse>(
                service, METHODID_GET_ENTRIES)))
        .addMethod(
          getSubscribeDownloadLogFileMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.log_files.LogFilesProto.SubscribeDownloadLogFileRequest,
              io.mavsdk.log_files.LogFilesProto.DownloadLogFileResponse>(
                service, METHODID_SUBSCRIBE_DOWNLOAD_LOG_FILE)))
        .addMethod(
          getEraseAllLogFilesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesRequest,
              io.mavsdk.log_files.LogFilesProto.EraseAllLogFilesResponse>(
                service, METHODID_ERASE_ALL_LOG_FILES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LogFilesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetEntriesMethod())
              .addMethod(getSubscribeDownloadLogFileMethod())
              .addMethod(getEraseAllLogFilesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
