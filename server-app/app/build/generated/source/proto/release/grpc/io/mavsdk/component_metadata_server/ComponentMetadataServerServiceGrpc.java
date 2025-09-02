package io.mavsdk.component_metadata_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide component metadata json definitions, such as parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/component_metadata_server/component_metadata_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ComponentMetadataServerServiceGrpc {

  private ComponentMetadataServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.component_metadata_server.ComponentMetadataServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest,
      io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse> getSetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMetadata",
      requestType = io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest.class,
      responseType = io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest,
      io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse> getSetMetadataMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest, io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse> getSetMetadataMethod;
    if ((getSetMetadataMethod = ComponentMetadataServerServiceGrpc.getSetMetadataMethod) == null) {
      synchronized (ComponentMetadataServerServiceGrpc.class) {
        if ((getSetMetadataMethod = ComponentMetadataServerServiceGrpc.getSetMetadataMethod) == null) {
          ComponentMetadataServerServiceGrpc.getSetMetadataMethod = getSetMetadataMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest, io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComponentMetadataServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServerServiceStub>() {
        @java.lang.Override
        public ComponentMetadataServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentMetadataServerServiceStub(channel, callOptions);
        }
      };
    return ComponentMetadataServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComponentMetadataServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServerServiceBlockingStub>() {
        @java.lang.Override
        public ComponentMetadataServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentMetadataServerServiceBlockingStub(channel, callOptions);
        }
      };
    return ComponentMetadataServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComponentMetadataServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServerServiceFutureStub>() {
        @java.lang.Override
        public ComponentMetadataServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentMetadataServerServiceFutureStub(channel, callOptions);
        }
      };
    return ComponentMetadataServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide component metadata json definitions, such as parameters.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Provide metadata (can only be called once)
     * </pre>
     */
    default void setMetadata(io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMetadataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ComponentMetadataServerService.
   * <pre>
   * Provide component metadata json definitions, such as parameters.
   * </pre>
   */
  public static abstract class ComponentMetadataServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ComponentMetadataServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ComponentMetadataServerService.
   * <pre>
   * Provide component metadata json definitions, such as parameters.
   * </pre>
   */
  public static final class ComponentMetadataServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ComponentMetadataServerServiceStub> {
    private ComponentMetadataServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentMetadataServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentMetadataServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provide metadata (can only be called once)
     * </pre>
     */
    public void setMetadata(io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ComponentMetadataServerService.
   * <pre>
   * Provide component metadata json definitions, such as parameters.
   * </pre>
   */
  public static final class ComponentMetadataServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ComponentMetadataServerServiceBlockingStub> {
    private ComponentMetadataServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentMetadataServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentMetadataServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provide metadata (can only be called once)
     * </pre>
     */
    public io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse setMetadata(io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ComponentMetadataServerService.
   * <pre>
   * Provide component metadata json definitions, such as parameters.
   * </pre>
   */
  public static final class ComponentMetadataServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ComponentMetadataServerServiceFutureStub> {
    private ComponentMetadataServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentMetadataServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentMetadataServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provide metadata (can only be called once)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse> setMetadata(
        io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_METADATA = 0;

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
        case METHODID_SET_METADATA:
          serviceImpl.setMetadata((io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse>) responseObserver);
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
          getSetMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataRequest,
              io.mavsdk.component_metadata_server.ComponentMetadataServerProto.SetMetadataResponse>(
                service, METHODID_SET_METADATA)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ComponentMetadataServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
