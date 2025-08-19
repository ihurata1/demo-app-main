package io.mavsdk.component_metadata;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Access component metadata json definitions, such as parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/component_metadata/component_metadata.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ComponentMetadataServiceGrpc {

  private ComponentMetadataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.component_metadata.ComponentMetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse> getRequestComponentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestComponent",
      requestType = io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest.class,
      responseType = io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse> getRequestComponentMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest, io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse> getRequestComponentMethod;
    if ((getRequestComponentMethod = ComponentMetadataServiceGrpc.getRequestComponentMethod) == null) {
      synchronized (ComponentMetadataServiceGrpc.class) {
        if ((getRequestComponentMethod = ComponentMetadataServiceGrpc.getRequestComponentMethod) == null) {
          ComponentMetadataServiceGrpc.getRequestComponentMethod = getRequestComponentMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest, io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestComponent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRequestComponentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse> getRequestAutopilotComponentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestAutopilotComponent",
      requestType = io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest.class,
      responseType = io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse> getRequestAutopilotComponentMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest, io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse> getRequestAutopilotComponentMethod;
    if ((getRequestAutopilotComponentMethod = ComponentMetadataServiceGrpc.getRequestAutopilotComponentMethod) == null) {
      synchronized (ComponentMetadataServiceGrpc.class) {
        if ((getRequestAutopilotComponentMethod = ComponentMetadataServiceGrpc.getRequestAutopilotComponentMethod) == null) {
          ComponentMetadataServiceGrpc.getRequestAutopilotComponentMethod = getRequestAutopilotComponentMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest, io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestAutopilotComponent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRequestAutopilotComponentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse> getSubscribeMetadataAvailableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeMetadataAvailable",
      requestType = io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest.class,
      responseType = io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse> getSubscribeMetadataAvailableMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest, io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse> getSubscribeMetadataAvailableMethod;
    if ((getSubscribeMetadataAvailableMethod = ComponentMetadataServiceGrpc.getSubscribeMetadataAvailableMethod) == null) {
      synchronized (ComponentMetadataServiceGrpc.class) {
        if ((getSubscribeMetadataAvailableMethod = ComponentMetadataServiceGrpc.getSubscribeMetadataAvailableMethod) == null) {
          ComponentMetadataServiceGrpc.getSubscribeMetadataAvailableMethod = getSubscribeMetadataAvailableMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest, io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeMetadataAvailable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeMetadataAvailableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse> getGetMetadataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetadata",
      requestType = io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest.class,
      responseType = io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest,
      io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse> getGetMetadataMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest, io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse> getGetMetadataMethod;
    if ((getGetMetadataMethod = ComponentMetadataServiceGrpc.getGetMetadataMethod) == null) {
      synchronized (ComponentMetadataServiceGrpc.class) {
        if ((getGetMetadataMethod = ComponentMetadataServiceGrpc.getGetMetadataMethod) == null) {
          ComponentMetadataServiceGrpc.getGetMetadataMethod = getGetMetadataMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest, io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetadata"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMetadataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ComponentMetadataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServiceStub>() {
        @java.lang.Override
        public ComponentMetadataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentMetadataServiceStub(channel, callOptions);
        }
      };
    return ComponentMetadataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ComponentMetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServiceBlockingStub>() {
        @java.lang.Override
        public ComponentMetadataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentMetadataServiceBlockingStub(channel, callOptions);
        }
      };
    return ComponentMetadataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ComponentMetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ComponentMetadataServiceFutureStub>() {
        @java.lang.Override
        public ComponentMetadataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ComponentMetadataServiceFutureStub(channel, callOptions);
        }
      };
    return ComponentMetadataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Access component metadata json definitions, such as parameters.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Request metadata from a specific component. This is used to start requesting metadata from a component.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    default void requestComponent(io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestComponentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request metadata from the autopilot component. This is used to start requesting metadata from the autopilot.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    default void requestAutopilotComponent(io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestAutopilotComponentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register a callback that gets called when metadata is available
     * </pre>
     */
    default void subscribeMetadataAvailable(io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMetadataAvailableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Access metadata. This can be used if you know the metadata is available already, otherwise use
     * the subscription to get notified when it becomes available.
     * </pre>
     */
    default void getMetadata(io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetadataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ComponentMetadataService.
   * <pre>
   * Access component metadata json definitions, such as parameters.
   * </pre>
   */
  public static abstract class ComponentMetadataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ComponentMetadataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ComponentMetadataService.
   * <pre>
   * Access component metadata json definitions, such as parameters.
   * </pre>
   */
  public static final class ComponentMetadataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ComponentMetadataServiceStub> {
    private ComponentMetadataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentMetadataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentMetadataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request metadata from a specific component. This is used to start requesting metadata from a component.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    public void requestComponent(io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestComponentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request metadata from the autopilot component. This is used to start requesting metadata from the autopilot.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    public void requestAutopilotComponent(io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestAutopilotComponentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register a callback that gets called when metadata is available
     * </pre>
     */
    public void subscribeMetadataAvailable(io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMetadataAvailableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Access metadata. This can be used if you know the metadata is available already, otherwise use
     * the subscription to get notified when it becomes available.
     * </pre>
     */
    public void getMetadata(io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ComponentMetadataService.
   * <pre>
   * Access component metadata json definitions, such as parameters.
   * </pre>
   */
  public static final class ComponentMetadataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ComponentMetadataServiceBlockingStub> {
    private ComponentMetadataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentMetadataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentMetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request metadata from a specific component. This is used to start requesting metadata from a component.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    public io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse requestComponent(io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestComponentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request metadata from the autopilot component. This is used to start requesting metadata from the autopilot.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    public io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse requestAutopilotComponent(io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestAutopilotComponentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register a callback that gets called when metadata is available
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse> subscribeMetadataAvailable(
        io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMetadataAvailableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Access metadata. This can be used if you know the metadata is available already, otherwise use
     * the subscription to get notified when it becomes available.
     * </pre>
     */
    public io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse getMetadata(io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetadataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ComponentMetadataService.
   * <pre>
   * Access component metadata json definitions, such as parameters.
   * </pre>
   */
  public static final class ComponentMetadataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ComponentMetadataServiceFutureStub> {
    private ComponentMetadataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ComponentMetadataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ComponentMetadataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Request metadata from a specific component. This is used to start requesting metadata from a component.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse> requestComponent(
        io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestComponentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request metadata from the autopilot component. This is used to start requesting metadata from the autopilot.
     * The metadata can later be accessed via subscription (see below) or GetMetadata.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse> requestAutopilotComponent(
        io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestAutopilotComponentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Access metadata. This can be used if you know the metadata is available already, otherwise use
     * the subscription to get notified when it becomes available.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse> getMetadata(
        io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetadataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_COMPONENT = 0;
  private static final int METHODID_REQUEST_AUTOPILOT_COMPONENT = 1;
  private static final int METHODID_SUBSCRIBE_METADATA_AVAILABLE = 2;
  private static final int METHODID_GET_METADATA = 3;

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
        case METHODID_REQUEST_COMPONENT:
          serviceImpl.requestComponent((io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse>) responseObserver);
          break;
        case METHODID_REQUEST_AUTOPILOT_COMPONENT:
          serviceImpl.requestAutopilotComponent((io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_METADATA_AVAILABLE:
          serviceImpl.subscribeMetadataAvailable((io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse>) responseObserver);
          break;
        case METHODID_GET_METADATA:
          serviceImpl.getMetadata((io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse>) responseObserver);
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
          getRequestComponentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentRequest,
              io.mavsdk.component_metadata.ComponentMetadataProto.RequestComponentResponse>(
                service, METHODID_REQUEST_COMPONENT)))
        .addMethod(
          getRequestAutopilotComponentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentRequest,
              io.mavsdk.component_metadata.ComponentMetadataProto.RequestAutopilotComponentResponse>(
                service, METHODID_REQUEST_AUTOPILOT_COMPONENT)))
        .addMethod(
          getSubscribeMetadataAvailableMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.component_metadata.ComponentMetadataProto.SubscribeMetadataAvailableRequest,
              io.mavsdk.component_metadata.ComponentMetadataProto.MetadataAvailableResponse>(
                service, METHODID_SUBSCRIBE_METADATA_AVAILABLE)))
        .addMethod(
          getGetMetadataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataRequest,
              io.mavsdk.component_metadata.ComponentMetadataProto.GetMetadataResponse>(
                service, METHODID_GET_METADATA)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ComponentMetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getRequestComponentMethod())
              .addMethod(getRequestAutopilotComponentMethod())
              .addMethod(getSubscribeMetadataAvailableMethod())
              .addMethod(getGetMetadataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
