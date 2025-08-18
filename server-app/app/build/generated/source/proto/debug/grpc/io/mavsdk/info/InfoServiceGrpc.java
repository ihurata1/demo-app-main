package io.mavsdk.info;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide information about the hardware and/or software of a system.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/info/info.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InfoServiceGrpc {

  private InfoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.info.InfoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetFlightInformationRequest,
      io.mavsdk.info.InfoProto.GetFlightInformationResponse> getGetFlightInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlightInformation",
      requestType = io.mavsdk.info.InfoProto.GetFlightInformationRequest.class,
      responseType = io.mavsdk.info.InfoProto.GetFlightInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetFlightInformationRequest,
      io.mavsdk.info.InfoProto.GetFlightInformationResponse> getGetFlightInformationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetFlightInformationRequest, io.mavsdk.info.InfoProto.GetFlightInformationResponse> getGetFlightInformationMethod;
    if ((getGetFlightInformationMethod = InfoServiceGrpc.getGetFlightInformationMethod) == null) {
      synchronized (InfoServiceGrpc.class) {
        if ((getGetFlightInformationMethod = InfoServiceGrpc.getGetFlightInformationMethod) == null) {
          InfoServiceGrpc.getGetFlightInformationMethod = getGetFlightInformationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.info.InfoProto.GetFlightInformationRequest, io.mavsdk.info.InfoProto.GetFlightInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlightInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetFlightInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetFlightInformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFlightInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetIdentificationRequest,
      io.mavsdk.info.InfoProto.GetIdentificationResponse> getGetIdentificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdentification",
      requestType = io.mavsdk.info.InfoProto.GetIdentificationRequest.class,
      responseType = io.mavsdk.info.InfoProto.GetIdentificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetIdentificationRequest,
      io.mavsdk.info.InfoProto.GetIdentificationResponse> getGetIdentificationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetIdentificationRequest, io.mavsdk.info.InfoProto.GetIdentificationResponse> getGetIdentificationMethod;
    if ((getGetIdentificationMethod = InfoServiceGrpc.getGetIdentificationMethod) == null) {
      synchronized (InfoServiceGrpc.class) {
        if ((getGetIdentificationMethod = InfoServiceGrpc.getGetIdentificationMethod) == null) {
          InfoServiceGrpc.getGetIdentificationMethod = getGetIdentificationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.info.InfoProto.GetIdentificationRequest, io.mavsdk.info.InfoProto.GetIdentificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdentification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetIdentificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetIdentificationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetIdentificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetProductRequest,
      io.mavsdk.info.InfoProto.GetProductResponse> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = io.mavsdk.info.InfoProto.GetProductRequest.class,
      responseType = io.mavsdk.info.InfoProto.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetProductRequest,
      io.mavsdk.info.InfoProto.GetProductResponse> getGetProductMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetProductRequest, io.mavsdk.info.InfoProto.GetProductResponse> getGetProductMethod;
    if ((getGetProductMethod = InfoServiceGrpc.getGetProductMethod) == null) {
      synchronized (InfoServiceGrpc.class) {
        if ((getGetProductMethod = InfoServiceGrpc.getGetProductMethod) == null) {
          InfoServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.info.InfoProto.GetProductRequest, io.mavsdk.info.InfoProto.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetProductResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetVersionRequest,
      io.mavsdk.info.InfoProto.GetVersionResponse> getGetVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVersion",
      requestType = io.mavsdk.info.InfoProto.GetVersionRequest.class,
      responseType = io.mavsdk.info.InfoProto.GetVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetVersionRequest,
      io.mavsdk.info.InfoProto.GetVersionResponse> getGetVersionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetVersionRequest, io.mavsdk.info.InfoProto.GetVersionResponse> getGetVersionMethod;
    if ((getGetVersionMethod = InfoServiceGrpc.getGetVersionMethod) == null) {
      synchronized (InfoServiceGrpc.class) {
        if ((getGetVersionMethod = InfoServiceGrpc.getGetVersionMethod) == null) {
          InfoServiceGrpc.getGetVersionMethod = getGetVersionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.info.InfoProto.GetVersionRequest, io.mavsdk.info.InfoProto.GetVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetVersionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetSpeedFactorRequest,
      io.mavsdk.info.InfoProto.GetSpeedFactorResponse> getGetSpeedFactorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpeedFactor",
      requestType = io.mavsdk.info.InfoProto.GetSpeedFactorRequest.class,
      responseType = io.mavsdk.info.InfoProto.GetSpeedFactorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetSpeedFactorRequest,
      io.mavsdk.info.InfoProto.GetSpeedFactorResponse> getGetSpeedFactorMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.GetSpeedFactorRequest, io.mavsdk.info.InfoProto.GetSpeedFactorResponse> getGetSpeedFactorMethod;
    if ((getGetSpeedFactorMethod = InfoServiceGrpc.getGetSpeedFactorMethod) == null) {
      synchronized (InfoServiceGrpc.class) {
        if ((getGetSpeedFactorMethod = InfoServiceGrpc.getGetSpeedFactorMethod) == null) {
          InfoServiceGrpc.getGetSpeedFactorMethod = getGetSpeedFactorMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.info.InfoProto.GetSpeedFactorRequest, io.mavsdk.info.InfoProto.GetSpeedFactorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpeedFactor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetSpeedFactorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.GetSpeedFactorResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSpeedFactorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest,
      io.mavsdk.info.InfoProto.FlightInformationResponse> getSubscribeFlightInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeFlightInformation",
      requestType = io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest.class,
      responseType = io.mavsdk.info.InfoProto.FlightInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest,
      io.mavsdk.info.InfoProto.FlightInformationResponse> getSubscribeFlightInformationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest, io.mavsdk.info.InfoProto.FlightInformationResponse> getSubscribeFlightInformationMethod;
    if ((getSubscribeFlightInformationMethod = InfoServiceGrpc.getSubscribeFlightInformationMethod) == null) {
      synchronized (InfoServiceGrpc.class) {
        if ((getSubscribeFlightInformationMethod = InfoServiceGrpc.getSubscribeFlightInformationMethod) == null) {
          InfoServiceGrpc.getSubscribeFlightInformationMethod = getSubscribeFlightInformationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest, io.mavsdk.info.InfoProto.FlightInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeFlightInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.info.InfoProto.FlightInformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeFlightInformationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InfoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InfoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InfoServiceStub>() {
        @java.lang.Override
        public InfoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InfoServiceStub(channel, callOptions);
        }
      };
    return InfoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InfoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InfoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InfoServiceBlockingStub>() {
        @java.lang.Override
        public InfoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InfoServiceBlockingStub(channel, callOptions);
        }
      };
    return InfoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InfoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InfoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InfoServiceFutureStub>() {
        @java.lang.Override
        public InfoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InfoServiceFutureStub(channel, callOptions);
        }
      };
    return InfoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide information about the hardware and/or software of a system.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get flight information of the system.
     * </pre>
     */
    default void getFlightInformation(io.mavsdk.info.InfoProto.GetFlightInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetFlightInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlightInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the identification of the system.
     * </pre>
     */
    default void getIdentification(io.mavsdk.info.InfoProto.GetIdentificationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetIdentificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdentificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get product information of the system.
     * </pre>
     */
    default void getProduct(io.mavsdk.info.InfoProto.GetProductRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the version information of the system.
     * </pre>
     */
    default void getVersion(io.mavsdk.info.InfoProto.GetVersionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the speed factor of a simulation (with lockstep a simulation can run faster or slower than realtime).
     * </pre>
     */
    default void getSpeedFactor(io.mavsdk.info.InfoProto.GetSpeedFactorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetSpeedFactorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSpeedFactorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'flight information' updates.
     * </pre>
     */
    default void subscribeFlightInformation(io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.FlightInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeFlightInformationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InfoService.
   * <pre>
   * Provide information about the hardware and/or software of a system.
   * </pre>
   */
  public static abstract class InfoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InfoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InfoService.
   * <pre>
   * Provide information about the hardware and/or software of a system.
   * </pre>
   */
  public static final class InfoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InfoServiceStub> {
    private InfoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InfoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get flight information of the system.
     * </pre>
     */
    public void getFlightInformation(io.mavsdk.info.InfoProto.GetFlightInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetFlightInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlightInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the identification of the system.
     * </pre>
     */
    public void getIdentification(io.mavsdk.info.InfoProto.GetIdentificationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetIdentificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdentificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get product information of the system.
     * </pre>
     */
    public void getProduct(io.mavsdk.info.InfoProto.GetProductRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the version information of the system.
     * </pre>
     */
    public void getVersion(io.mavsdk.info.InfoProto.GetVersionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the speed factor of a simulation (with lockstep a simulation can run faster or slower than realtime).
     * </pre>
     */
    public void getSpeedFactor(io.mavsdk.info.InfoProto.GetSpeedFactorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetSpeedFactorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSpeedFactorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'flight information' updates.
     * </pre>
     */
    public void subscribeFlightInformation(io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.FlightInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeFlightInformationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InfoService.
   * <pre>
   * Provide information about the hardware and/or software of a system.
   * </pre>
   */
  public static final class InfoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InfoServiceBlockingStub> {
    private InfoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InfoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get flight information of the system.
     * </pre>
     */
    public io.mavsdk.info.InfoProto.GetFlightInformationResponse getFlightInformation(io.mavsdk.info.InfoProto.GetFlightInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlightInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the identification of the system.
     * </pre>
     */
    public io.mavsdk.info.InfoProto.GetIdentificationResponse getIdentification(io.mavsdk.info.InfoProto.GetIdentificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdentificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get product information of the system.
     * </pre>
     */
    public io.mavsdk.info.InfoProto.GetProductResponse getProduct(io.mavsdk.info.InfoProto.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the version information of the system.
     * </pre>
     */
    public io.mavsdk.info.InfoProto.GetVersionResponse getVersion(io.mavsdk.info.InfoProto.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the speed factor of a simulation (with lockstep a simulation can run faster or slower than realtime).
     * </pre>
     */
    public io.mavsdk.info.InfoProto.GetSpeedFactorResponse getSpeedFactor(io.mavsdk.info.InfoProto.GetSpeedFactorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSpeedFactorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'flight information' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.info.InfoProto.FlightInformationResponse> subscribeFlightInformation(
        io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeFlightInformationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InfoService.
   * <pre>
   * Provide information about the hardware and/or software of a system.
   * </pre>
   */
  public static final class InfoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InfoServiceFutureStub> {
    private InfoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InfoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InfoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get flight information of the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.info.InfoProto.GetFlightInformationResponse> getFlightInformation(
        io.mavsdk.info.InfoProto.GetFlightInformationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlightInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the identification of the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.info.InfoProto.GetIdentificationResponse> getIdentification(
        io.mavsdk.info.InfoProto.GetIdentificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdentificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get product information of the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.info.InfoProto.GetProductResponse> getProduct(
        io.mavsdk.info.InfoProto.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the version information of the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.info.InfoProto.GetVersionResponse> getVersion(
        io.mavsdk.info.InfoProto.GetVersionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the speed factor of a simulation (with lockstep a simulation can run faster or slower than realtime).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.info.InfoProto.GetSpeedFactorResponse> getSpeedFactor(
        io.mavsdk.info.InfoProto.GetSpeedFactorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSpeedFactorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FLIGHT_INFORMATION = 0;
  private static final int METHODID_GET_IDENTIFICATION = 1;
  private static final int METHODID_GET_PRODUCT = 2;
  private static final int METHODID_GET_VERSION = 3;
  private static final int METHODID_GET_SPEED_FACTOR = 4;
  private static final int METHODID_SUBSCRIBE_FLIGHT_INFORMATION = 5;

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
        case METHODID_GET_FLIGHT_INFORMATION:
          serviceImpl.getFlightInformation((io.mavsdk.info.InfoProto.GetFlightInformationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetFlightInformationResponse>) responseObserver);
          break;
        case METHODID_GET_IDENTIFICATION:
          serviceImpl.getIdentification((io.mavsdk.info.InfoProto.GetIdentificationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetIdentificationResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((io.mavsdk.info.InfoProto.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetProductResponse>) responseObserver);
          break;
        case METHODID_GET_VERSION:
          serviceImpl.getVersion((io.mavsdk.info.InfoProto.GetVersionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetVersionResponse>) responseObserver);
          break;
        case METHODID_GET_SPEED_FACTOR:
          serviceImpl.getSpeedFactor((io.mavsdk.info.InfoProto.GetSpeedFactorRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.GetSpeedFactorResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FLIGHT_INFORMATION:
          serviceImpl.subscribeFlightInformation((io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.info.InfoProto.FlightInformationResponse>) responseObserver);
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
          getGetFlightInformationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.info.InfoProto.GetFlightInformationRequest,
              io.mavsdk.info.InfoProto.GetFlightInformationResponse>(
                service, METHODID_GET_FLIGHT_INFORMATION)))
        .addMethod(
          getGetIdentificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.info.InfoProto.GetIdentificationRequest,
              io.mavsdk.info.InfoProto.GetIdentificationResponse>(
                service, METHODID_GET_IDENTIFICATION)))
        .addMethod(
          getGetProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.info.InfoProto.GetProductRequest,
              io.mavsdk.info.InfoProto.GetProductResponse>(
                service, METHODID_GET_PRODUCT)))
        .addMethod(
          getGetVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.info.InfoProto.GetVersionRequest,
              io.mavsdk.info.InfoProto.GetVersionResponse>(
                service, METHODID_GET_VERSION)))
        .addMethod(
          getGetSpeedFactorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.info.InfoProto.GetSpeedFactorRequest,
              io.mavsdk.info.InfoProto.GetSpeedFactorResponse>(
                service, METHODID_GET_SPEED_FACTOR)))
        .addMethod(
          getSubscribeFlightInformationMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.info.InfoProto.SubscribeFlightInformationRequest,
              io.mavsdk.info.InfoProto.FlightInformationResponse>(
                service, METHODID_SUBSCRIBE_FLIGHT_INFORMATION)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InfoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetFlightInformationMethod())
              .addMethod(getGetIdentificationMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getGetVersionMethod())
              .addMethod(getGetSpeedFactorMethod())
              .addMethod(getSubscribeFlightInformationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
