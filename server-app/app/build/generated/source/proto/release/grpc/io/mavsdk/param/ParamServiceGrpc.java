package io.mavsdk.param;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide raw access to get and set parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/param/param.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ParamServiceGrpc {

  private ParamServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.param.ParamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamIntRequest,
      io.mavsdk.param.ParamProto.GetParamIntResponse> getGetParamIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParamInt",
      requestType = io.mavsdk.param.ParamProto.GetParamIntRequest.class,
      responseType = io.mavsdk.param.ParamProto.GetParamIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamIntRequest,
      io.mavsdk.param.ParamProto.GetParamIntResponse> getGetParamIntMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamIntRequest, io.mavsdk.param.ParamProto.GetParamIntResponse> getGetParamIntMethod;
    if ((getGetParamIntMethod = ParamServiceGrpc.getGetParamIntMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getGetParamIntMethod = ParamServiceGrpc.getGetParamIntMethod) == null) {
          ParamServiceGrpc.getGetParamIntMethod = getGetParamIntMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.GetParamIntRequest, io.mavsdk.param.ParamProto.GetParamIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParamInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetParamIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetParamIntResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetParamIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamIntRequest,
      io.mavsdk.param.ParamProto.SetParamIntResponse> getSetParamIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetParamInt",
      requestType = io.mavsdk.param.ParamProto.SetParamIntRequest.class,
      responseType = io.mavsdk.param.ParamProto.SetParamIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamIntRequest,
      io.mavsdk.param.ParamProto.SetParamIntResponse> getSetParamIntMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamIntRequest, io.mavsdk.param.ParamProto.SetParamIntResponse> getSetParamIntMethod;
    if ((getSetParamIntMethod = ParamServiceGrpc.getSetParamIntMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getSetParamIntMethod = ParamServiceGrpc.getSetParamIntMethod) == null) {
          ParamServiceGrpc.getSetParamIntMethod = getSetParamIntMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.SetParamIntRequest, io.mavsdk.param.ParamProto.SetParamIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetParamInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SetParamIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SetParamIntResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetParamIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamFloatRequest,
      io.mavsdk.param.ParamProto.GetParamFloatResponse> getGetParamFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParamFloat",
      requestType = io.mavsdk.param.ParamProto.GetParamFloatRequest.class,
      responseType = io.mavsdk.param.ParamProto.GetParamFloatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamFloatRequest,
      io.mavsdk.param.ParamProto.GetParamFloatResponse> getGetParamFloatMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamFloatRequest, io.mavsdk.param.ParamProto.GetParamFloatResponse> getGetParamFloatMethod;
    if ((getGetParamFloatMethod = ParamServiceGrpc.getGetParamFloatMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getGetParamFloatMethod = ParamServiceGrpc.getGetParamFloatMethod) == null) {
          ParamServiceGrpc.getGetParamFloatMethod = getGetParamFloatMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.GetParamFloatRequest, io.mavsdk.param.ParamProto.GetParamFloatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParamFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetParamFloatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetParamFloatResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetParamFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamFloatRequest,
      io.mavsdk.param.ParamProto.SetParamFloatResponse> getSetParamFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetParamFloat",
      requestType = io.mavsdk.param.ParamProto.SetParamFloatRequest.class,
      responseType = io.mavsdk.param.ParamProto.SetParamFloatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamFloatRequest,
      io.mavsdk.param.ParamProto.SetParamFloatResponse> getSetParamFloatMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamFloatRequest, io.mavsdk.param.ParamProto.SetParamFloatResponse> getSetParamFloatMethod;
    if ((getSetParamFloatMethod = ParamServiceGrpc.getSetParamFloatMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getSetParamFloatMethod = ParamServiceGrpc.getSetParamFloatMethod) == null) {
          ParamServiceGrpc.getSetParamFloatMethod = getSetParamFloatMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.SetParamFloatRequest, io.mavsdk.param.ParamProto.SetParamFloatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetParamFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SetParamFloatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SetParamFloatResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetParamFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamCustomRequest,
      io.mavsdk.param.ParamProto.GetParamCustomResponse> getGetParamCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetParamCustom",
      requestType = io.mavsdk.param.ParamProto.GetParamCustomRequest.class,
      responseType = io.mavsdk.param.ParamProto.GetParamCustomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamCustomRequest,
      io.mavsdk.param.ParamProto.GetParamCustomResponse> getGetParamCustomMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetParamCustomRequest, io.mavsdk.param.ParamProto.GetParamCustomResponse> getGetParamCustomMethod;
    if ((getGetParamCustomMethod = ParamServiceGrpc.getGetParamCustomMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getGetParamCustomMethod = ParamServiceGrpc.getGetParamCustomMethod) == null) {
          ParamServiceGrpc.getGetParamCustomMethod = getGetParamCustomMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.GetParamCustomRequest, io.mavsdk.param.ParamProto.GetParamCustomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetParamCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetParamCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetParamCustomResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetParamCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamCustomRequest,
      io.mavsdk.param.ParamProto.SetParamCustomResponse> getSetParamCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetParamCustom",
      requestType = io.mavsdk.param.ParamProto.SetParamCustomRequest.class,
      responseType = io.mavsdk.param.ParamProto.SetParamCustomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamCustomRequest,
      io.mavsdk.param.ParamProto.SetParamCustomResponse> getSetParamCustomMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SetParamCustomRequest, io.mavsdk.param.ParamProto.SetParamCustomResponse> getSetParamCustomMethod;
    if ((getSetParamCustomMethod = ParamServiceGrpc.getSetParamCustomMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getSetParamCustomMethod = ParamServiceGrpc.getSetParamCustomMethod) == null) {
          ParamServiceGrpc.getSetParamCustomMethod = getSetParamCustomMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.SetParamCustomRequest, io.mavsdk.param.ParamProto.SetParamCustomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetParamCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SetParamCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SetParamCustomResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetParamCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetAllParamsRequest,
      io.mavsdk.param.ParamProto.GetAllParamsResponse> getGetAllParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllParams",
      requestType = io.mavsdk.param.ParamProto.GetAllParamsRequest.class,
      responseType = io.mavsdk.param.ParamProto.GetAllParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetAllParamsRequest,
      io.mavsdk.param.ParamProto.GetAllParamsResponse> getGetAllParamsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.GetAllParamsRequest, io.mavsdk.param.ParamProto.GetAllParamsResponse> getGetAllParamsMethod;
    if ((getGetAllParamsMethod = ParamServiceGrpc.getGetAllParamsMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getGetAllParamsMethod = ParamServiceGrpc.getGetAllParamsMethod) == null) {
          ParamServiceGrpc.getGetAllParamsMethod = getGetAllParamsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.GetAllParamsRequest, io.mavsdk.param.ParamProto.GetAllParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetAllParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.GetAllParamsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAllParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SelectComponentRequest,
      io.mavsdk.param.ParamProto.SelectComponentResponse> getSelectComponentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectComponent",
      requestType = io.mavsdk.param.ParamProto.SelectComponentRequest.class,
      responseType = io.mavsdk.param.ParamProto.SelectComponentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SelectComponentRequest,
      io.mavsdk.param.ParamProto.SelectComponentResponse> getSelectComponentMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param.ParamProto.SelectComponentRequest, io.mavsdk.param.ParamProto.SelectComponentResponse> getSelectComponentMethod;
    if ((getSelectComponentMethod = ParamServiceGrpc.getSelectComponentMethod) == null) {
      synchronized (ParamServiceGrpc.class) {
        if ((getSelectComponentMethod = ParamServiceGrpc.getSelectComponentMethod) == null) {
          ParamServiceGrpc.getSelectComponentMethod = getSelectComponentMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param.ParamProto.SelectComponentRequest, io.mavsdk.param.ParamProto.SelectComponentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectComponent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SelectComponentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param.ParamProto.SelectComponentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSelectComponentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParamServiceStub>() {
        @java.lang.Override
        public ParamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParamServiceStub(channel, callOptions);
        }
      };
    return ParamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParamServiceBlockingStub>() {
        @java.lang.Override
        public ParamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParamServiceBlockingStub(channel, callOptions);
        }
      };
    return ParamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParamServiceFutureStub>() {
        @java.lang.Override
        public ParamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParamServiceFutureStub(channel, callOptions);
        }
      };
    return ParamServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide raw access to get and set parameters.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void getParamInt(io.mavsdk.param.ParamProto.GetParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamIntResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParamIntMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void setParamInt(io.mavsdk.param.ParamProto.SetParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamIntResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetParamIntMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void getParamFloat(io.mavsdk.param.ParamProto.GetParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamFloatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParamFloatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void setParamFloat(io.mavsdk.param.ParamProto.SetParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamFloatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetParamFloatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void getParamCustom(io.mavsdk.param.ParamProto.GetParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamCustomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetParamCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void setParamCustom(io.mavsdk.param.ParamProto.SetParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamCustomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetParamCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all parameters.
     * </pre>
     */
    default void getAllParams(io.mavsdk.param.ParamProto.GetAllParamsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetAllParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Select component ID of parameter component to talk to and param protocol version.
     * Default is the autopilot component (1), and Version (0).
     * </pre>
     */
    default void selectComponent(io.mavsdk.param.ParamProto.SelectComponentRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SelectComponentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectComponentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ParamService.
   * <pre>
   * Provide raw access to get and set parameters.
   * </pre>
   */
  public static abstract class ParamServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ParamServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ParamService.
   * <pre>
   * Provide raw access to get and set parameters.
   * </pre>
   */
  public static final class ParamServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ParamServiceStub> {
    private ParamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void getParamInt(io.mavsdk.param.ParamProto.GetParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamIntResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParamIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void setParamInt(io.mavsdk.param.ParamProto.SetParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamIntResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetParamIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void getParamFloat(io.mavsdk.param.ParamProto.GetParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamFloatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParamFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void setParamFloat(io.mavsdk.param.ParamProto.SetParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamFloatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetParamFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void getParamCustom(io.mavsdk.param.ParamProto.GetParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamCustomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetParamCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void setParamCustom(io.mavsdk.param.ParamProto.SetParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamCustomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetParamCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all parameters.
     * </pre>
     */
    public void getAllParams(io.mavsdk.param.ParamProto.GetAllParamsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetAllParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Select component ID of parameter component to talk to and param protocol version.
     * Default is the autopilot component (1), and Version (0).
     * </pre>
     */
    public void selectComponent(io.mavsdk.param.ParamProto.SelectComponentRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SelectComponentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectComponentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ParamService.
   * <pre>
   * Provide raw access to get and set parameters.
   * </pre>
   */
  public static final class ParamServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ParamServiceBlockingStub> {
    private ParamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.GetParamIntResponse getParamInt(io.mavsdk.param.ParamProto.GetParamIntRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParamIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.SetParamIntResponse setParamInt(io.mavsdk.param.ParamProto.SetParamIntRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetParamIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.GetParamFloatResponse getParamFloat(io.mavsdk.param.ParamProto.GetParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParamFloatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.SetParamFloatResponse setParamFloat(io.mavsdk.param.ParamProto.SetParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetParamFloatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.GetParamCustomResponse getParamCustom(io.mavsdk.param.ParamProto.GetParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetParamCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.SetParamCustomResponse setParamCustom(io.mavsdk.param.ParamProto.SetParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetParamCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all parameters.
     * </pre>
     */
    public io.mavsdk.param.ParamProto.GetAllParamsResponse getAllParams(io.mavsdk.param.ParamProto.GetAllParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select component ID of parameter component to talk to and param protocol version.
     * Default is the autopilot component (1), and Version (0).
     * </pre>
     */
    public io.mavsdk.param.ParamProto.SelectComponentResponse selectComponent(io.mavsdk.param.ParamProto.SelectComponentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectComponentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ParamService.
   * <pre>
   * Provide raw access to get and set parameters.
   * </pre>
   */
  public static final class ParamServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ParamServiceFutureStub> {
    private ParamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.GetParamIntResponse> getParamInt(
        io.mavsdk.param.ParamProto.GetParamIntRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParamIntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.SetParamIntResponse> setParamInt(
        io.mavsdk.param.ParamProto.SetParamIntRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetParamIntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.GetParamFloatResponse> getParamFloat(
        io.mavsdk.param.ParamProto.GetParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParamFloatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.SetParamFloatResponse> setParamFloat(
        io.mavsdk.param.ParamProto.SetParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetParamFloatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.GetParamCustomResponse> getParamCustom(
        io.mavsdk.param.ParamProto.GetParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetParamCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.SetParamCustomResponse> setParamCustom(
        io.mavsdk.param.ParamProto.SetParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetParamCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.GetAllParamsResponse> getAllParams(
        io.mavsdk.param.ParamProto.GetAllParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Select component ID of parameter component to talk to and param protocol version.
     * Default is the autopilot component (1), and Version (0).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param.ParamProto.SelectComponentResponse> selectComponent(
        io.mavsdk.param.ParamProto.SelectComponentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectComponentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PARAM_INT = 0;
  private static final int METHODID_SET_PARAM_INT = 1;
  private static final int METHODID_GET_PARAM_FLOAT = 2;
  private static final int METHODID_SET_PARAM_FLOAT = 3;
  private static final int METHODID_GET_PARAM_CUSTOM = 4;
  private static final int METHODID_SET_PARAM_CUSTOM = 5;
  private static final int METHODID_GET_ALL_PARAMS = 6;
  private static final int METHODID_SELECT_COMPONENT = 7;

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
        case METHODID_GET_PARAM_INT:
          serviceImpl.getParamInt((io.mavsdk.param.ParamProto.GetParamIntRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamIntResponse>) responseObserver);
          break;
        case METHODID_SET_PARAM_INT:
          serviceImpl.setParamInt((io.mavsdk.param.ParamProto.SetParamIntRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamIntResponse>) responseObserver);
          break;
        case METHODID_GET_PARAM_FLOAT:
          serviceImpl.getParamFloat((io.mavsdk.param.ParamProto.GetParamFloatRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamFloatResponse>) responseObserver);
          break;
        case METHODID_SET_PARAM_FLOAT:
          serviceImpl.setParamFloat((io.mavsdk.param.ParamProto.SetParamFloatRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamFloatResponse>) responseObserver);
          break;
        case METHODID_GET_PARAM_CUSTOM:
          serviceImpl.getParamCustom((io.mavsdk.param.ParamProto.GetParamCustomRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetParamCustomResponse>) responseObserver);
          break;
        case METHODID_SET_PARAM_CUSTOM:
          serviceImpl.setParamCustom((io.mavsdk.param.ParamProto.SetParamCustomRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SetParamCustomResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_PARAMS:
          serviceImpl.getAllParams((io.mavsdk.param.ParamProto.GetAllParamsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.GetAllParamsResponse>) responseObserver);
          break;
        case METHODID_SELECT_COMPONENT:
          serviceImpl.selectComponent((io.mavsdk.param.ParamProto.SelectComponentRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param.ParamProto.SelectComponentResponse>) responseObserver);
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
          getGetParamIntMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.GetParamIntRequest,
              io.mavsdk.param.ParamProto.GetParamIntResponse>(
                service, METHODID_GET_PARAM_INT)))
        .addMethod(
          getSetParamIntMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.SetParamIntRequest,
              io.mavsdk.param.ParamProto.SetParamIntResponse>(
                service, METHODID_SET_PARAM_INT)))
        .addMethod(
          getGetParamFloatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.GetParamFloatRequest,
              io.mavsdk.param.ParamProto.GetParamFloatResponse>(
                service, METHODID_GET_PARAM_FLOAT)))
        .addMethod(
          getSetParamFloatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.SetParamFloatRequest,
              io.mavsdk.param.ParamProto.SetParamFloatResponse>(
                service, METHODID_SET_PARAM_FLOAT)))
        .addMethod(
          getGetParamCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.GetParamCustomRequest,
              io.mavsdk.param.ParamProto.GetParamCustomResponse>(
                service, METHODID_GET_PARAM_CUSTOM)))
        .addMethod(
          getSetParamCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.SetParamCustomRequest,
              io.mavsdk.param.ParamProto.SetParamCustomResponse>(
                service, METHODID_SET_PARAM_CUSTOM)))
        .addMethod(
          getGetAllParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.GetAllParamsRequest,
              io.mavsdk.param.ParamProto.GetAllParamsResponse>(
                service, METHODID_GET_ALL_PARAMS)))
        .addMethod(
          getSelectComponentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param.ParamProto.SelectComponentRequest,
              io.mavsdk.param.ParamProto.SelectComponentResponse>(
                service, METHODID_SELECT_COMPONENT)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ParamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetParamIntMethod())
              .addMethod(getSetParamIntMethod())
              .addMethod(getGetParamFloatMethod())
              .addMethod(getSetParamFloatMethod())
              .addMethod(getGetParamCustomMethod())
              .addMethod(getSetParamCustomMethod())
              .addMethod(getGetAllParamsMethod())
              .addMethod(getSelectComponentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
