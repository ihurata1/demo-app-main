package com.serverapp.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommunicationServiceGrpc {

  private CommunicationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "service.CommunicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.serverapp.proto.MessageRequest,
      com.serverapp.proto.MessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMessage",
      requestType = com.serverapp.proto.MessageRequest.class,
      responseType = com.serverapp.proto.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.serverapp.proto.MessageRequest,
      com.serverapp.proto.MessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.serverapp.proto.MessageRequest, com.serverapp.proto.MessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = CommunicationServiceGrpc.getSendMessageMethod) == null) {
      synchronized (CommunicationServiceGrpc.class) {
        if ((getSendMessageMethod = CommunicationServiceGrpc.getSendMessageMethod) == null) {
          CommunicationServiceGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.serverapp.proto.MessageRequest, com.serverapp.proto.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.serverapp.proto.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.serverapp.proto.MessageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.serverapp.proto.MessageRequest,
      com.serverapp.proto.MessageResponse> getStreamMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamMessages",
      requestType = com.serverapp.proto.MessageRequest.class,
      responseType = com.serverapp.proto.MessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.serverapp.proto.MessageRequest,
      com.serverapp.proto.MessageResponse> getStreamMessagesMethod() {
    io.grpc.MethodDescriptor<com.serverapp.proto.MessageRequest, com.serverapp.proto.MessageResponse> getStreamMessagesMethod;
    if ((getStreamMessagesMethod = CommunicationServiceGrpc.getStreamMessagesMethod) == null) {
      synchronized (CommunicationServiceGrpc.class) {
        if ((getStreamMessagesMethod = CommunicationServiceGrpc.getStreamMessagesMethod) == null) {
          CommunicationServiceGrpc.getStreamMessagesMethod = getStreamMessagesMethod =
              io.grpc.MethodDescriptor.<com.serverapp.proto.MessageRequest, com.serverapp.proto.MessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.serverapp.proto.MessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.serverapp.proto.MessageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStreamMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommunicationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationServiceStub>() {
        @java.lang.Override
        public CommunicationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationServiceStub(channel, callOptions);
        }
      };
    return CommunicationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommunicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationServiceBlockingStub>() {
        @java.lang.Override
        public CommunicationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationServiceBlockingStub(channel, callOptions);
        }
      };
    return CommunicationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommunicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommunicationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommunicationServiceFutureStub>() {
        @java.lang.Override
        public CommunicationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommunicationServiceFutureStub(channel, callOptions);
        }
      };
    return CommunicationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    default void sendMessage(com.serverapp.proto.MessageRequest request,
        io.grpc.stub.StreamObserver<com.serverapp.proto.MessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream messages
     * </pre>
     */
    default void streamMessages(com.serverapp.proto.MessageRequest request,
        io.grpc.stub.StreamObserver<com.serverapp.proto.MessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamMessagesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommunicationService.
   * <pre>
   * The service definition
   * </pre>
   */
  public static abstract class CommunicationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommunicationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommunicationService.
   * <pre>
   * The service definition
   * </pre>
   */
  public static final class CommunicationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommunicationServiceStub> {
    private CommunicationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public void sendMessage(com.serverapp.proto.MessageRequest request,
        io.grpc.stub.StreamObserver<com.serverapp.proto.MessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream messages
     * </pre>
     */
    public void streamMessages(com.serverapp.proto.MessageRequest request,
        io.grpc.stub.StreamObserver<com.serverapp.proto.MessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommunicationService.
   * <pre>
   * The service definition
   * </pre>
   */
  public static final class CommunicationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommunicationServiceBlockingStub> {
    private CommunicationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public com.serverapp.proto.MessageResponse sendMessage(com.serverapp.proto.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream messages
     * </pre>
     */
    public java.util.Iterator<com.serverapp.proto.MessageResponse> streamMessages(
        com.serverapp.proto.MessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommunicationService.
   * <pre>
   * The service definition
   * </pre>
   */
  public static final class CommunicationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommunicationServiceFutureStub> {
    private CommunicationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommunicationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommunicationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send a message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.serverapp.proto.MessageResponse> sendMessage(
        com.serverapp.proto.MessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;
  private static final int METHODID_STREAM_MESSAGES = 1;

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
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.serverapp.proto.MessageRequest) request,
              (io.grpc.stub.StreamObserver<com.serverapp.proto.MessageResponse>) responseObserver);
          break;
        case METHODID_STREAM_MESSAGES:
          serviceImpl.streamMessages((com.serverapp.proto.MessageRequest) request,
              (io.grpc.stub.StreamObserver<com.serverapp.proto.MessageResponse>) responseObserver);
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
          getSendMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.serverapp.proto.MessageRequest,
              com.serverapp.proto.MessageResponse>(
                service, METHODID_SEND_MESSAGE)))
        .addMethod(
          getStreamMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.serverapp.proto.MessageRequest,
              com.serverapp.proto.MessageResponse>(
                service, METHODID_STREAM_MESSAGES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CommunicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSendMessageMethod())
              .addMethod(getStreamMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
