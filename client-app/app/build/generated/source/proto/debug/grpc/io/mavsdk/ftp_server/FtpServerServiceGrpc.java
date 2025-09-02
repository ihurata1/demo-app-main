package io.mavsdk.ftp_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide files or directories to transfer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/ftp_server/ftp_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FtpServerServiceGrpc {

  private FtpServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.ftp_server.FtpServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest,
      io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse> getSetRootDirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRootDir",
      requestType = io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest.class,
      responseType = io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest,
      io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse> getSetRootDirMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest, io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse> getSetRootDirMethod;
    if ((getSetRootDirMethod = FtpServerServiceGrpc.getSetRootDirMethod) == null) {
      synchronized (FtpServerServiceGrpc.class) {
        if ((getSetRootDirMethod = FtpServerServiceGrpc.getSetRootDirMethod) == null) {
          FtpServerServiceGrpc.getSetRootDirMethod = getSetRootDirMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest, io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRootDir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRootDirMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FtpServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtpServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtpServerServiceStub>() {
        @java.lang.Override
        public FtpServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtpServerServiceStub(channel, callOptions);
        }
      };
    return FtpServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FtpServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtpServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtpServerServiceBlockingStub>() {
        @java.lang.Override
        public FtpServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtpServerServiceBlockingStub(channel, callOptions);
        }
      };
    return FtpServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FtpServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtpServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtpServerServiceFutureStub>() {
        @java.lang.Override
        public FtpServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtpServerServiceFutureStub(channel, callOptions);
        }
      };
    return FtpServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide files or directories to transfer.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Set root directory.
     * This is the directory that can then be accessed by a client.
     * The directory needs to exist when this is called.
     * The permissions are the same as the file permission for the user running the server.
     * The root directory can't be changed while an FTP process is in progress.
     * </pre>
     */
    default void setRootDir(io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRootDirMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FtpServerService.
   * <pre>
   * Provide files or directories to transfer.
   * </pre>
   */
  public static abstract class FtpServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FtpServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FtpServerService.
   * <pre>
   * Provide files or directories to transfer.
   * </pre>
   */
  public static final class FtpServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FtpServerServiceStub> {
    private FtpServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtpServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtpServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set root directory.
     * This is the directory that can then be accessed by a client.
     * The directory needs to exist when this is called.
     * The permissions are the same as the file permission for the user running the server.
     * The root directory can't be changed while an FTP process is in progress.
     * </pre>
     */
    public void setRootDir(io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRootDirMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FtpServerService.
   * <pre>
   * Provide files or directories to transfer.
   * </pre>
   */
  public static final class FtpServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FtpServerServiceBlockingStub> {
    private FtpServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtpServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtpServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set root directory.
     * This is the directory that can then be accessed by a client.
     * The directory needs to exist when this is called.
     * The permissions are the same as the file permission for the user running the server.
     * The root directory can't be changed while an FTP process is in progress.
     * </pre>
     */
    public io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse setRootDir(io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRootDirMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FtpServerService.
   * <pre>
   * Provide files or directories to transfer.
   * </pre>
   */
  public static final class FtpServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FtpServerServiceFutureStub> {
    private FtpServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtpServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtpServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set root directory.
     * This is the directory that can then be accessed by a client.
     * The directory needs to exist when this is called.
     * The permissions are the same as the file permission for the user running the server.
     * The root directory can't be changed while an FTP process is in progress.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse> setRootDir(
        io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRootDirMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_ROOT_DIR = 0;

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
        case METHODID_SET_ROOT_DIR:
          serviceImpl.setRootDir((io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse>) responseObserver);
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
          getSetRootDirMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp_server.FtpServerProto.SetRootDirRequest,
              io.mavsdk.ftp_server.FtpServerProto.SetRootDirResponse>(
                service, METHODID_SET_ROOT_DIR)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FtpServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetRootDirMethod())
              .build();
        }
      }
    }
    return result;
  }
}
