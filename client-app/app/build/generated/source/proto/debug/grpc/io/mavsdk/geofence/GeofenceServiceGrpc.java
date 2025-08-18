package io.mavsdk.geofence;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable setting a geofence.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/geofence/geofence.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GeofenceServiceGrpc {

  private GeofenceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.geofence.GeofenceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest,
      io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse> getUploadGeofenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadGeofence",
      requestType = io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest.class,
      responseType = io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest,
      io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse> getUploadGeofenceMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest, io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse> getUploadGeofenceMethod;
    if ((getUploadGeofenceMethod = GeofenceServiceGrpc.getUploadGeofenceMethod) == null) {
      synchronized (GeofenceServiceGrpc.class) {
        if ((getUploadGeofenceMethod = GeofenceServiceGrpc.getUploadGeofenceMethod) == null) {
          GeofenceServiceGrpc.getUploadGeofenceMethod = getUploadGeofenceMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest, io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadGeofence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadGeofenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest,
      io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse> getClearGeofenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearGeofence",
      requestType = io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest.class,
      responseType = io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest,
      io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse> getClearGeofenceMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest, io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse> getClearGeofenceMethod;
    if ((getClearGeofenceMethod = GeofenceServiceGrpc.getClearGeofenceMethod) == null) {
      synchronized (GeofenceServiceGrpc.class) {
        if ((getClearGeofenceMethod = GeofenceServiceGrpc.getClearGeofenceMethod) == null) {
          GeofenceServiceGrpc.getClearGeofenceMethod = getClearGeofenceMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest, io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearGeofence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getClearGeofenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GeofenceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeofenceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeofenceServiceStub>() {
        @java.lang.Override
        public GeofenceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeofenceServiceStub(channel, callOptions);
        }
      };
    return GeofenceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GeofenceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeofenceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeofenceServiceBlockingStub>() {
        @java.lang.Override
        public GeofenceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeofenceServiceBlockingStub(channel, callOptions);
        }
      };
    return GeofenceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GeofenceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GeofenceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GeofenceServiceFutureStub>() {
        @java.lang.Override
        public GeofenceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GeofenceServiceFutureStub(channel, callOptions);
        }
      };
    return GeofenceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable setting a geofence.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Upload geofences.
     * Polygon and Circular geofences are uploaded to a drone. Once uploaded, the geofence will remain
     * on the drone even if a connection is lost.
     * </pre>
     */
    default void uploadGeofence(io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadGeofenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear all geofences saved on the vehicle.
     * </pre>
     */
    default void clearGeofence(io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearGeofenceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GeofenceService.
   * <pre>
   * Enable setting a geofence.
   * </pre>
   */
  public static abstract class GeofenceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GeofenceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GeofenceService.
   * <pre>
   * Enable setting a geofence.
   * </pre>
   */
  public static final class GeofenceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GeofenceServiceStub> {
    private GeofenceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeofenceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeofenceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload geofences.
     * Polygon and Circular geofences are uploaded to a drone. Once uploaded, the geofence will remain
     * on the drone even if a connection is lost.
     * </pre>
     */
    public void uploadGeofence(io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadGeofenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear all geofences saved on the vehicle.
     * </pre>
     */
    public void clearGeofence(io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearGeofenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GeofenceService.
   * <pre>
   * Enable setting a geofence.
   * </pre>
   */
  public static final class GeofenceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GeofenceServiceBlockingStub> {
    private GeofenceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeofenceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeofenceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload geofences.
     * Polygon and Circular geofences are uploaded to a drone. Once uploaded, the geofence will remain
     * on the drone even if a connection is lost.
     * </pre>
     */
    public io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse uploadGeofence(io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadGeofenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear all geofences saved on the vehicle.
     * </pre>
     */
    public io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse clearGeofence(io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearGeofenceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GeofenceService.
   * <pre>
   * Enable setting a geofence.
   * </pre>
   */
  public static final class GeofenceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GeofenceServiceFutureStub> {
    private GeofenceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GeofenceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GeofenceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload geofences.
     * Polygon and Circular geofences are uploaded to a drone. Once uploaded, the geofence will remain
     * on the drone even if a connection is lost.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse> uploadGeofence(
        io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadGeofenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear all geofences saved on the vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse> clearGeofence(
        io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearGeofenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_GEOFENCE = 0;
  private static final int METHODID_CLEAR_GEOFENCE = 1;

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
        case METHODID_UPLOAD_GEOFENCE:
          serviceImpl.uploadGeofence((io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse>) responseObserver);
          break;
        case METHODID_CLEAR_GEOFENCE:
          serviceImpl.clearGeofence((io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse>) responseObserver);
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
          getUploadGeofenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.geofence.GeofenceProto.UploadGeofenceRequest,
              io.mavsdk.geofence.GeofenceProto.UploadGeofenceResponse>(
                service, METHODID_UPLOAD_GEOFENCE)))
        .addMethod(
          getClearGeofenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.geofence.GeofenceProto.ClearGeofenceRequest,
              io.mavsdk.geofence.GeofenceProto.ClearGeofenceResponse>(
                service, METHODID_CLEAR_GEOFENCE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GeofenceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getUploadGeofenceMethod())
              .addMethod(getClearGeofenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
