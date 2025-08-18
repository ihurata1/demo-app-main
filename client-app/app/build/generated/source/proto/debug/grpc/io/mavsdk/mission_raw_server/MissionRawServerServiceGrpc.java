package io.mavsdk.mission_raw_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Acts as a vehicle and receives incoming missions from GCS (in raw MAVLINK format). 
 * Provides current mission item state, so the server can progress through missions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/mission_raw_server/mission_raw_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MissionRawServerServiceGrpc {

  private MissionRawServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.mission_raw_server.MissionRawServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse> getSubscribeIncomingMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeIncomingMission",
      requestType = io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest.class,
      responseType = io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse> getSubscribeIncomingMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse> getSubscribeIncomingMissionMethod;
    if ((getSubscribeIncomingMissionMethod = MissionRawServerServiceGrpc.getSubscribeIncomingMissionMethod) == null) {
      synchronized (MissionRawServerServiceGrpc.class) {
        if ((getSubscribeIncomingMissionMethod = MissionRawServerServiceGrpc.getSubscribeIncomingMissionMethod) == null) {
          MissionRawServerServiceGrpc.getSubscribeIncomingMissionMethod = getSubscribeIncomingMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeIncomingMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeIncomingMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse> getSubscribeCurrentItemChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCurrentItemChanged",
      requestType = io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest.class,
      responseType = io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse> getSubscribeCurrentItemChangedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse> getSubscribeCurrentItemChangedMethod;
    if ((getSubscribeCurrentItemChangedMethod = MissionRawServerServiceGrpc.getSubscribeCurrentItemChangedMethod) == null) {
      synchronized (MissionRawServerServiceGrpc.class) {
        if ((getSubscribeCurrentItemChangedMethod = MissionRawServerServiceGrpc.getSubscribeCurrentItemChangedMethod) == null) {
          MissionRawServerServiceGrpc.getSubscribeCurrentItemChangedMethod = getSubscribeCurrentItemChangedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCurrentItemChanged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCurrentItemChangedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse> getSetCurrentItemCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCurrentItemComplete",
      requestType = io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest.class,
      responseType = io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse> getSetCurrentItemCompleteMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse> getSetCurrentItemCompleteMethod;
    if ((getSetCurrentItemCompleteMethod = MissionRawServerServiceGrpc.getSetCurrentItemCompleteMethod) == null) {
      synchronized (MissionRawServerServiceGrpc.class) {
        if ((getSetCurrentItemCompleteMethod = MissionRawServerServiceGrpc.getSetCurrentItemCompleteMethod) == null) {
          MissionRawServerServiceGrpc.getSetCurrentItemCompleteMethod = getSetCurrentItemCompleteMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCurrentItemComplete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetCurrentItemCompleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse> getSubscribeClearAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeClearAll",
      requestType = io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest.class,
      responseType = io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest,
      io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse> getSubscribeClearAllMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse> getSubscribeClearAllMethod;
    if ((getSubscribeClearAllMethod = MissionRawServerServiceGrpc.getSubscribeClearAllMethod) == null) {
      synchronized (MissionRawServerServiceGrpc.class) {
        if ((getSubscribeClearAllMethod = MissionRawServerServiceGrpc.getSubscribeClearAllMethod) == null) {
          MissionRawServerServiceGrpc.getSubscribeClearAllMethod = getSubscribeClearAllMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest, io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeClearAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeClearAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MissionRawServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionRawServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionRawServerServiceStub>() {
        @java.lang.Override
        public MissionRawServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionRawServerServiceStub(channel, callOptions);
        }
      };
    return MissionRawServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MissionRawServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionRawServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionRawServerServiceBlockingStub>() {
        @java.lang.Override
        public MissionRawServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionRawServerServiceBlockingStub(channel, callOptions);
        }
      };
    return MissionRawServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MissionRawServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionRawServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionRawServerServiceFutureStub>() {
        @java.lang.Override
        public MissionRawServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionRawServerServiceFutureStub(channel, callOptions);
        }
      };
    return MissionRawServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Acts as a vehicle and receives incoming missions from GCS (in raw MAVLINK format). 
   * Provides current mission item state, so the server can progress through missions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to when a new mission is uploaded (asynchronous).
     * </pre>
     */
    default void subscribeIncomingMission(io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeIncomingMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to when a new current item is set
     * </pre>
     */
    default void subscribeCurrentItemChanged(io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCurrentItemChangedMethod(), responseObserver);
    }

    /**
     * <pre>
     *  Set Current item as completed
     * </pre>
     */
    default void setCurrentItemComplete(io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCurrentItemCompleteMethod(), responseObserver);
    }

    /**
     * <pre>
     *  Subscribe when a MISSION_CLEAR_ALL is received
     * </pre>
     */
    default void subscribeClearAll(io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeClearAllMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MissionRawServerService.
   * <pre>
   * Acts as a vehicle and receives incoming missions from GCS (in raw MAVLINK format). 
   * Provides current mission item state, so the server can progress through missions.
   * </pre>
   */
  public static abstract class MissionRawServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MissionRawServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MissionRawServerService.
   * <pre>
   * Acts as a vehicle and receives incoming missions from GCS (in raw MAVLINK format). 
   * Provides current mission item state, so the server can progress through missions.
   * </pre>
   */
  public static final class MissionRawServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MissionRawServerServiceStub> {
    private MissionRawServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionRawServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionRawServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to when a new mission is uploaded (asynchronous).
     * </pre>
     */
    public void subscribeIncomingMission(io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeIncomingMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to when a new current item is set
     * </pre>
     */
    public void subscribeCurrentItemChanged(io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCurrentItemChangedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  Set Current item as completed
     * </pre>
     */
    public void setCurrentItemComplete(io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCurrentItemCompleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  Subscribe when a MISSION_CLEAR_ALL is received
     * </pre>
     */
    public void subscribeClearAll(io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeClearAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MissionRawServerService.
   * <pre>
   * Acts as a vehicle and receives incoming missions from GCS (in raw MAVLINK format). 
   * Provides current mission item state, so the server can progress through missions.
   * </pre>
   */
  public static final class MissionRawServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MissionRawServerServiceBlockingStub> {
    private MissionRawServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionRawServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionRawServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to when a new mission is uploaded (asynchronous).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse> subscribeIncomingMission(
        io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeIncomingMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to when a new current item is set
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse> subscribeCurrentItemChanged(
        io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCurrentItemChangedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  Set Current item as completed
     * </pre>
     */
    public io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse setCurrentItemComplete(io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCurrentItemCompleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  Subscribe when a MISSION_CLEAR_ALL is received
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse> subscribeClearAll(
        io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeClearAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MissionRawServerService.
   * <pre>
   * Acts as a vehicle and receives incoming missions from GCS (in raw MAVLINK format). 
   * Provides current mission item state, so the server can progress through missions.
   * </pre>
   */
  public static final class MissionRawServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MissionRawServerServiceFutureStub> {
    private MissionRawServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionRawServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionRawServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Set Current item as completed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse> setCurrentItemComplete(
        io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCurrentItemCompleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_INCOMING_MISSION = 0;
  private static final int METHODID_SUBSCRIBE_CURRENT_ITEM_CHANGED = 1;
  private static final int METHODID_SET_CURRENT_ITEM_COMPLETE = 2;
  private static final int METHODID_SUBSCRIBE_CLEAR_ALL = 3;

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
        case METHODID_SUBSCRIBE_INCOMING_MISSION:
          serviceImpl.subscribeIncomingMission((io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CURRENT_ITEM_CHANGED:
          serviceImpl.subscribeCurrentItemChanged((io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse>) responseObserver);
          break;
        case METHODID_SET_CURRENT_ITEM_COMPLETE:
          serviceImpl.setCurrentItemComplete((io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CLEAR_ALL:
          serviceImpl.subscribeClearAll((io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse>) responseObserver);
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
          getSubscribeIncomingMissionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeIncomingMissionRequest,
              io.mavsdk.mission_raw_server.MissionRawServerProto.IncomingMissionResponse>(
                service, METHODID_SUBSCRIBE_INCOMING_MISSION)))
        .addMethod(
          getSubscribeCurrentItemChangedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeCurrentItemChangedRequest,
              io.mavsdk.mission_raw_server.MissionRawServerProto.CurrentItemChangedResponse>(
                service, METHODID_SUBSCRIBE_CURRENT_ITEM_CHANGED)))
        .addMethod(
          getSetCurrentItemCompleteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteRequest,
              io.mavsdk.mission_raw_server.MissionRawServerProto.SetCurrentItemCompleteResponse>(
                service, METHODID_SET_CURRENT_ITEM_COMPLETE)))
        .addMethod(
          getSubscribeClearAllMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission_raw_server.MissionRawServerProto.SubscribeClearAllRequest,
              io.mavsdk.mission_raw_server.MissionRawServerProto.ClearAllResponse>(
                service, METHODID_SUBSCRIBE_CLEAR_ALL)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MissionRawServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeIncomingMissionMethod())
              .addMethod(getSubscribeCurrentItemChangedMethod())
              .addMethod(getSetCurrentItemCompleteMethod())
              .addMethod(getSubscribeClearAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
