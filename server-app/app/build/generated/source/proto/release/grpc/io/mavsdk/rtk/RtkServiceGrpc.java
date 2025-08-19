package io.mavsdk.rtk;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to send RTK corrections to the vehicle.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/rtk/rtk.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RtkServiceGrpc {

  private RtkServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.rtk.RtkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.rtk.RtkProto.SendRtcmDataRequest,
      io.mavsdk.rtk.RtkProto.SendRtcmDataResponse> getSendRtcmDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendRtcmData",
      requestType = io.mavsdk.rtk.RtkProto.SendRtcmDataRequest.class,
      responseType = io.mavsdk.rtk.RtkProto.SendRtcmDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.rtk.RtkProto.SendRtcmDataRequest,
      io.mavsdk.rtk.RtkProto.SendRtcmDataResponse> getSendRtcmDataMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.rtk.RtkProto.SendRtcmDataRequest, io.mavsdk.rtk.RtkProto.SendRtcmDataResponse> getSendRtcmDataMethod;
    if ((getSendRtcmDataMethod = RtkServiceGrpc.getSendRtcmDataMethod) == null) {
      synchronized (RtkServiceGrpc.class) {
        if ((getSendRtcmDataMethod = RtkServiceGrpc.getSendRtcmDataMethod) == null) {
          RtkServiceGrpc.getSendRtcmDataMethod = getSendRtcmDataMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.rtk.RtkProto.SendRtcmDataRequest, io.mavsdk.rtk.RtkProto.SendRtcmDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendRtcmData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.rtk.RtkProto.SendRtcmDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.rtk.RtkProto.SendRtcmDataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSendRtcmDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RtkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RtkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RtkServiceStub>() {
        @java.lang.Override
        public RtkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RtkServiceStub(channel, callOptions);
        }
      };
    return RtkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RtkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RtkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RtkServiceBlockingStub>() {
        @java.lang.Override
        public RtkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RtkServiceBlockingStub(channel, callOptions);
        }
      };
    return RtkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RtkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RtkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RtkServiceFutureStub>() {
        @java.lang.Override
        public RtkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RtkServiceFutureStub(channel, callOptions);
        }
      };
    return RtkServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to send RTK corrections to the vehicle.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send RTCM data.
     * </pre>
     */
    default void sendRtcmData(io.mavsdk.rtk.RtkProto.SendRtcmDataRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.rtk.RtkProto.SendRtcmDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendRtcmDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RtkService.
   * <pre>
   * Service to send RTK corrections to the vehicle.
   * </pre>
   */
  public static abstract class RtkServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RtkServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RtkService.
   * <pre>
   * Service to send RTK corrections to the vehicle.
   * </pre>
   */
  public static final class RtkServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RtkServiceStub> {
    private RtkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RtkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RtkServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send RTCM data.
     * </pre>
     */
    public void sendRtcmData(io.mavsdk.rtk.RtkProto.SendRtcmDataRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.rtk.RtkProto.SendRtcmDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendRtcmDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RtkService.
   * <pre>
   * Service to send RTK corrections to the vehicle.
   * </pre>
   */
  public static final class RtkServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RtkServiceBlockingStub> {
    private RtkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RtkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RtkServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send RTCM data.
     * </pre>
     */
    public io.mavsdk.rtk.RtkProto.SendRtcmDataResponse sendRtcmData(io.mavsdk.rtk.RtkProto.SendRtcmDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendRtcmDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RtkService.
   * <pre>
   * Service to send RTK corrections to the vehicle.
   * </pre>
   */
  public static final class RtkServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RtkServiceFutureStub> {
    private RtkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RtkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RtkServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send RTCM data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.rtk.RtkProto.SendRtcmDataResponse> sendRtcmData(
        io.mavsdk.rtk.RtkProto.SendRtcmDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendRtcmDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_RTCM_DATA = 0;

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
        case METHODID_SEND_RTCM_DATA:
          serviceImpl.sendRtcmData((io.mavsdk.rtk.RtkProto.SendRtcmDataRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.rtk.RtkProto.SendRtcmDataResponse>) responseObserver);
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
          getSendRtcmDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.rtk.RtkProto.SendRtcmDataRequest,
              io.mavsdk.rtk.RtkProto.SendRtcmDataResponse>(
                service, METHODID_SEND_RTCM_DATA)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RtkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSendRtcmDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
