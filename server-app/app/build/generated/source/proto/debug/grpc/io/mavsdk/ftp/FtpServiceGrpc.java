package io.mavsdk.ftp;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Implements file transfer functionality using MAVLink FTP.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/ftp/ftp.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FtpServiceGrpc {

  private FtpServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.ftp.FtpService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest,
      io.mavsdk.ftp.FtpProto.DownloadResponse> getSubscribeDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeDownload",
      requestType = io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.DownloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest,
      io.mavsdk.ftp.FtpProto.DownloadResponse> getSubscribeDownloadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest, io.mavsdk.ftp.FtpProto.DownloadResponse> getSubscribeDownloadMethod;
    if ((getSubscribeDownloadMethod = FtpServiceGrpc.getSubscribeDownloadMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getSubscribeDownloadMethod = FtpServiceGrpc.getSubscribeDownloadMethod) == null) {
          FtpServiceGrpc.getSubscribeDownloadMethod = getSubscribeDownloadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest, io.mavsdk.ftp.FtpProto.DownloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.DownloadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SubscribeUploadRequest,
      io.mavsdk.ftp.FtpProto.UploadResponse> getSubscribeUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeUpload",
      requestType = io.mavsdk.ftp.FtpProto.SubscribeUploadRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SubscribeUploadRequest,
      io.mavsdk.ftp.FtpProto.UploadResponse> getSubscribeUploadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SubscribeUploadRequest, io.mavsdk.ftp.FtpProto.UploadResponse> getSubscribeUploadMethod;
    if ((getSubscribeUploadMethod = FtpServiceGrpc.getSubscribeUploadMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getSubscribeUploadMethod = FtpServiceGrpc.getSubscribeUploadMethod) == null) {
          FtpServiceGrpc.getSubscribeUploadMethod = getSubscribeUploadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.SubscribeUploadRequest, io.mavsdk.ftp.FtpProto.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.SubscribeUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.UploadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.ListDirectoryRequest,
      io.mavsdk.ftp.FtpProto.ListDirectoryResponse> getListDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDirectory",
      requestType = io.mavsdk.ftp.FtpProto.ListDirectoryRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.ListDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.ListDirectoryRequest,
      io.mavsdk.ftp.FtpProto.ListDirectoryResponse> getListDirectoryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.ListDirectoryRequest, io.mavsdk.ftp.FtpProto.ListDirectoryResponse> getListDirectoryMethod;
    if ((getListDirectoryMethod = FtpServiceGrpc.getListDirectoryMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getListDirectoryMethod = FtpServiceGrpc.getListDirectoryMethod) == null) {
          FtpServiceGrpc.getListDirectoryMethod = getListDirectoryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.ListDirectoryRequest, io.mavsdk.ftp.FtpProto.ListDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.ListDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.ListDirectoryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.CreateDirectoryRequest,
      io.mavsdk.ftp.FtpProto.CreateDirectoryResponse> getCreateDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDirectory",
      requestType = io.mavsdk.ftp.FtpProto.CreateDirectoryRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.CreateDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.CreateDirectoryRequest,
      io.mavsdk.ftp.FtpProto.CreateDirectoryResponse> getCreateDirectoryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.CreateDirectoryRequest, io.mavsdk.ftp.FtpProto.CreateDirectoryResponse> getCreateDirectoryMethod;
    if ((getCreateDirectoryMethod = FtpServiceGrpc.getCreateDirectoryMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getCreateDirectoryMethod = FtpServiceGrpc.getCreateDirectoryMethod) == null) {
          FtpServiceGrpc.getCreateDirectoryMethod = getCreateDirectoryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.CreateDirectoryRequest, io.mavsdk.ftp.FtpProto.CreateDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.CreateDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.CreateDirectoryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest,
      io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse> getRemoveDirectoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveDirectory",
      requestType = io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest,
      io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse> getRemoveDirectoryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest, io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse> getRemoveDirectoryMethod;
    if ((getRemoveDirectoryMethod = FtpServiceGrpc.getRemoveDirectoryMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getRemoveDirectoryMethod = FtpServiceGrpc.getRemoveDirectoryMethod) == null) {
          FtpServiceGrpc.getRemoveDirectoryMethod = getRemoveDirectoryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest, io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveDirectory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveDirectoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RemoveFileRequest,
      io.mavsdk.ftp.FtpProto.RemoveFileResponse> getRemoveFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFile",
      requestType = io.mavsdk.ftp.FtpProto.RemoveFileRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.RemoveFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RemoveFileRequest,
      io.mavsdk.ftp.FtpProto.RemoveFileResponse> getRemoveFileMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RemoveFileRequest, io.mavsdk.ftp.FtpProto.RemoveFileResponse> getRemoveFileMethod;
    if ((getRemoveFileMethod = FtpServiceGrpc.getRemoveFileMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getRemoveFileMethod = FtpServiceGrpc.getRemoveFileMethod) == null) {
          FtpServiceGrpc.getRemoveFileMethod = getRemoveFileMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.RemoveFileRequest, io.mavsdk.ftp.FtpProto.RemoveFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.RemoveFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.RemoveFileResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRemoveFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RenameRequest,
      io.mavsdk.ftp.FtpProto.RenameResponse> getRenameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Rename",
      requestType = io.mavsdk.ftp.FtpProto.RenameRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.RenameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RenameRequest,
      io.mavsdk.ftp.FtpProto.RenameResponse> getRenameMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.RenameRequest, io.mavsdk.ftp.FtpProto.RenameResponse> getRenameMethod;
    if ((getRenameMethod = FtpServiceGrpc.getRenameMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getRenameMethod = FtpServiceGrpc.getRenameMethod) == null) {
          FtpServiceGrpc.getRenameMethod = getRenameMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.RenameRequest, io.mavsdk.ftp.FtpProto.RenameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Rename"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.RenameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.RenameResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRenameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest,
      io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse> getAreFilesIdenticalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AreFilesIdentical",
      requestType = io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest,
      io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse> getAreFilesIdenticalMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest, io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse> getAreFilesIdenticalMethod;
    if ((getAreFilesIdenticalMethod = FtpServiceGrpc.getAreFilesIdenticalMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getAreFilesIdenticalMethod = FtpServiceGrpc.getAreFilesIdenticalMethod) == null) {
          FtpServiceGrpc.getAreFilesIdenticalMethod = getAreFilesIdenticalMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest, io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AreFilesIdentical"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAreFilesIdenticalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SetTargetCompidRequest,
      io.mavsdk.ftp.FtpProto.SetTargetCompidResponse> getSetTargetCompidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTargetCompid",
      requestType = io.mavsdk.ftp.FtpProto.SetTargetCompidRequest.class,
      responseType = io.mavsdk.ftp.FtpProto.SetTargetCompidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SetTargetCompidRequest,
      io.mavsdk.ftp.FtpProto.SetTargetCompidResponse> getSetTargetCompidMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.ftp.FtpProto.SetTargetCompidRequest, io.mavsdk.ftp.FtpProto.SetTargetCompidResponse> getSetTargetCompidMethod;
    if ((getSetTargetCompidMethod = FtpServiceGrpc.getSetTargetCompidMethod) == null) {
      synchronized (FtpServiceGrpc.class) {
        if ((getSetTargetCompidMethod = FtpServiceGrpc.getSetTargetCompidMethod) == null) {
          FtpServiceGrpc.getSetTargetCompidMethod = getSetTargetCompidMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.ftp.FtpProto.SetTargetCompidRequest, io.mavsdk.ftp.FtpProto.SetTargetCompidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTargetCompid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.SetTargetCompidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.ftp.FtpProto.SetTargetCompidResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTargetCompidMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FtpServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtpServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtpServiceStub>() {
        @java.lang.Override
        public FtpServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtpServiceStub(channel, callOptions);
        }
      };
    return FtpServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FtpServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtpServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtpServiceBlockingStub>() {
        @java.lang.Override
        public FtpServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtpServiceBlockingStub(channel, callOptions);
        }
      };
    return FtpServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FtpServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FtpServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FtpServiceFutureStub>() {
        @java.lang.Override
        public FtpServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FtpServiceFutureStub(channel, callOptions);
        }
      };
    return FtpServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Implements file transfer functionality using MAVLink FTP.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Downloads a file to local directory.
     * </pre>
     */
    default void subscribeDownload(io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.DownloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Uploads local file to remote directory.
     * </pre>
     */
    default void subscribeUpload(io.mavsdk.ftp.FtpProto.SubscribeUploadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.UploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists items from a remote directory.
     * </pre>
     */
    default void listDirectory(io.mavsdk.ftp.FtpProto.ListDirectoryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.ListDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDirectoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a remote directory.
     * </pre>
     */
    default void createDirectory(io.mavsdk.ftp.FtpProto.CreateDirectoryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.CreateDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDirectoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a remote directory.
     * </pre>
     */
    default void removeDirectory(io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveDirectoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a remote file.
     * </pre>
     */
    default void removeFile(io.mavsdk.ftp.FtpProto.RemoveFileRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RemoveFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Renames a remote file or remote directory.
     * </pre>
     */
    default void rename(io.mavsdk.ftp.FtpProto.RenameRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RenameResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameMethod(), responseObserver);
    }

    /**
     * <pre>
     * Compares a local file to a remote file using a CRC32 checksum.
     * </pre>
     */
    default void areFilesIdentical(io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAreFilesIdenticalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set target component ID. By default it is the autopilot.
     * </pre>
     */
    default void setTargetCompid(io.mavsdk.ftp.FtpProto.SetTargetCompidRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.SetTargetCompidResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTargetCompidMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FtpService.
   * <pre>
   * Implements file transfer functionality using MAVLink FTP.
   * </pre>
   */
  public static abstract class FtpServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FtpServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FtpService.
   * <pre>
   * Implements file transfer functionality using MAVLink FTP.
   * </pre>
   */
  public static final class FtpServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FtpServiceStub> {
    private FtpServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtpServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtpServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Downloads a file to local directory.
     * </pre>
     */
    public void subscribeDownload(io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.DownloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Uploads local file to remote directory.
     * </pre>
     */
    public void subscribeUpload(io.mavsdk.ftp.FtpProto.SubscribeUploadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.UploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists items from a remote directory.
     * </pre>
     */
    public void listDirectory(io.mavsdk.ftp.FtpProto.ListDirectoryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.ListDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a remote directory.
     * </pre>
     */
    public void createDirectory(io.mavsdk.ftp.FtpProto.CreateDirectoryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.CreateDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a remote directory.
     * </pre>
     */
    public void removeDirectory(io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveDirectoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a remote file.
     * </pre>
     */
    public void removeFile(io.mavsdk.ftp.FtpProto.RemoveFileRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RemoveFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Renames a remote file or remote directory.
     * </pre>
     */
    public void rename(io.mavsdk.ftp.FtpProto.RenameRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RenameResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Compares a local file to a remote file using a CRC32 checksum.
     * </pre>
     */
    public void areFilesIdentical(io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAreFilesIdenticalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set target component ID. By default it is the autopilot.
     * </pre>
     */
    public void setTargetCompid(io.mavsdk.ftp.FtpProto.SetTargetCompidRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.SetTargetCompidResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTargetCompidMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FtpService.
   * <pre>
   * Implements file transfer functionality using MAVLink FTP.
   * </pre>
   */
  public static final class FtpServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FtpServiceBlockingStub> {
    private FtpServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtpServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtpServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Downloads a file to local directory.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.ftp.FtpProto.DownloadResponse> subscribeDownload(
        io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Uploads local file to remote directory.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.ftp.FtpProto.UploadResponse> subscribeUpload(
        io.mavsdk.ftp.FtpProto.SubscribeUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists items from a remote directory.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.ListDirectoryResponse listDirectory(io.mavsdk.ftp.FtpProto.ListDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDirectoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a remote directory.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.CreateDirectoryResponse createDirectory(io.mavsdk.ftp.FtpProto.CreateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDirectoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a remote directory.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse removeDirectory(io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveDirectoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a remote file.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.RemoveFileResponse removeFile(io.mavsdk.ftp.FtpProto.RemoveFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Renames a remote file or remote directory.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.RenameResponse rename(io.mavsdk.ftp.FtpProto.RenameRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Compares a local file to a remote file using a CRC32 checksum.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse areFilesIdentical(io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAreFilesIdenticalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set target component ID. By default it is the autopilot.
     * </pre>
     */
    public io.mavsdk.ftp.FtpProto.SetTargetCompidResponse setTargetCompid(io.mavsdk.ftp.FtpProto.SetTargetCompidRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTargetCompidMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FtpService.
   * <pre>
   * Implements file transfer functionality using MAVLink FTP.
   * </pre>
   */
  public static final class FtpServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FtpServiceFutureStub> {
    private FtpServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FtpServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FtpServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists items from a remote directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.ListDirectoryResponse> listDirectory(
        io.mavsdk.ftp.FtpProto.ListDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDirectoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a remote directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.CreateDirectoryResponse> createDirectory(
        io.mavsdk.ftp.FtpProto.CreateDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDirectoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a remote directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse> removeDirectory(
        io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveDirectoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a remote file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.RemoveFileResponse> removeFile(
        io.mavsdk.ftp.FtpProto.RemoveFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Renames a remote file or remote directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.RenameResponse> rename(
        io.mavsdk.ftp.FtpProto.RenameRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Compares a local file to a remote file using a CRC32 checksum.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse> areFilesIdentical(
        io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAreFilesIdenticalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set target component ID. By default it is the autopilot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.ftp.FtpProto.SetTargetCompidResponse> setTargetCompid(
        io.mavsdk.ftp.FtpProto.SetTargetCompidRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTargetCompidMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_DOWNLOAD = 0;
  private static final int METHODID_SUBSCRIBE_UPLOAD = 1;
  private static final int METHODID_LIST_DIRECTORY = 2;
  private static final int METHODID_CREATE_DIRECTORY = 3;
  private static final int METHODID_REMOVE_DIRECTORY = 4;
  private static final int METHODID_REMOVE_FILE = 5;
  private static final int METHODID_RENAME = 6;
  private static final int METHODID_ARE_FILES_IDENTICAL = 7;
  private static final int METHODID_SET_TARGET_COMPID = 8;

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
        case METHODID_SUBSCRIBE_DOWNLOAD:
          serviceImpl.subscribeDownload((io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.DownloadResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_UPLOAD:
          serviceImpl.subscribeUpload((io.mavsdk.ftp.FtpProto.SubscribeUploadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.UploadResponse>) responseObserver);
          break;
        case METHODID_LIST_DIRECTORY:
          serviceImpl.listDirectory((io.mavsdk.ftp.FtpProto.ListDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.ListDirectoryResponse>) responseObserver);
          break;
        case METHODID_CREATE_DIRECTORY:
          serviceImpl.createDirectory((io.mavsdk.ftp.FtpProto.CreateDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.CreateDirectoryResponse>) responseObserver);
          break;
        case METHODID_REMOVE_DIRECTORY:
          serviceImpl.removeDirectory((io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse>) responseObserver);
          break;
        case METHODID_REMOVE_FILE:
          serviceImpl.removeFile((io.mavsdk.ftp.FtpProto.RemoveFileRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RemoveFileResponse>) responseObserver);
          break;
        case METHODID_RENAME:
          serviceImpl.rename((io.mavsdk.ftp.FtpProto.RenameRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.RenameResponse>) responseObserver);
          break;
        case METHODID_ARE_FILES_IDENTICAL:
          serviceImpl.areFilesIdentical((io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse>) responseObserver);
          break;
        case METHODID_SET_TARGET_COMPID:
          serviceImpl.setTargetCompid((io.mavsdk.ftp.FtpProto.SetTargetCompidRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.ftp.FtpProto.SetTargetCompidResponse>) responseObserver);
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
          getSubscribeDownloadMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.SubscribeDownloadRequest,
              io.mavsdk.ftp.FtpProto.DownloadResponse>(
                service, METHODID_SUBSCRIBE_DOWNLOAD)))
        .addMethod(
          getSubscribeUploadMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.SubscribeUploadRequest,
              io.mavsdk.ftp.FtpProto.UploadResponse>(
                service, METHODID_SUBSCRIBE_UPLOAD)))
        .addMethod(
          getListDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.ListDirectoryRequest,
              io.mavsdk.ftp.FtpProto.ListDirectoryResponse>(
                service, METHODID_LIST_DIRECTORY)))
        .addMethod(
          getCreateDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.CreateDirectoryRequest,
              io.mavsdk.ftp.FtpProto.CreateDirectoryResponse>(
                service, METHODID_CREATE_DIRECTORY)))
        .addMethod(
          getRemoveDirectoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.RemoveDirectoryRequest,
              io.mavsdk.ftp.FtpProto.RemoveDirectoryResponse>(
                service, METHODID_REMOVE_DIRECTORY)))
        .addMethod(
          getRemoveFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.RemoveFileRequest,
              io.mavsdk.ftp.FtpProto.RemoveFileResponse>(
                service, METHODID_REMOVE_FILE)))
        .addMethod(
          getRenameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.RenameRequest,
              io.mavsdk.ftp.FtpProto.RenameResponse>(
                service, METHODID_RENAME)))
        .addMethod(
          getAreFilesIdenticalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.AreFilesIdenticalRequest,
              io.mavsdk.ftp.FtpProto.AreFilesIdenticalResponse>(
                service, METHODID_ARE_FILES_IDENTICAL)))
        .addMethod(
          getSetTargetCompidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.ftp.FtpProto.SetTargetCompidRequest,
              io.mavsdk.ftp.FtpProto.SetTargetCompidResponse>(
                service, METHODID_SET_TARGET_COMPID)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FtpServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeDownloadMethod())
              .addMethod(getSubscribeUploadMethod())
              .addMethod(getListDirectoryMethod())
              .addMethod(getCreateDirectoryMethod())
              .addMethod(getRemoveDirectoryMethod())
              .addMethod(getRemoveFileMethod())
              .addMethod(getRenameMethod())
              .addMethod(getAreFilesIdenticalMethod())
              .addMethod(getSetTargetCompidMethod())
              .build();
        }
      }
    }
    return result;
  }
}
