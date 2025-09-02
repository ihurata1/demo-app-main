package io.mavsdk.param_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide raw access to retrieve and provide server parameters.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/param_server/param_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ParamServerServiceGrpc {

  private ParamServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.param_server.ParamServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse> getRetrieveParamIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveParamInt",
      requestType = io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse> getRetrieveParamIntMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest, io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse> getRetrieveParamIntMethod;
    if ((getRetrieveParamIntMethod = ParamServerServiceGrpc.getRetrieveParamIntMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getRetrieveParamIntMethod = ParamServerServiceGrpc.getRetrieveParamIntMethod) == null) {
          ParamServerServiceGrpc.getRetrieveParamIntMethod = getRetrieveParamIntMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest, io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveParamInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRetrieveParamIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest,
      io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse> getProvideParamIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideParamInt",
      requestType = io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest,
      io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse> getProvideParamIntMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest, io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse> getProvideParamIntMethod;
    if ((getProvideParamIntMethod = ParamServerServiceGrpc.getProvideParamIntMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getProvideParamIntMethod = ParamServerServiceGrpc.getProvideParamIntMethod) == null) {
          ParamServerServiceGrpc.getProvideParamIntMethod = getProvideParamIntMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest, io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideParamInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getProvideParamIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse> getRetrieveParamFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveParamFloat",
      requestType = io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse> getRetrieveParamFloatMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest, io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse> getRetrieveParamFloatMethod;
    if ((getRetrieveParamFloatMethod = ParamServerServiceGrpc.getRetrieveParamFloatMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getRetrieveParamFloatMethod = ParamServerServiceGrpc.getRetrieveParamFloatMethod) == null) {
          ParamServerServiceGrpc.getRetrieveParamFloatMethod = getRetrieveParamFloatMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest, io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveParamFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRetrieveParamFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest,
      io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse> getProvideParamFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideParamFloat",
      requestType = io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest,
      io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse> getProvideParamFloatMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest, io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse> getProvideParamFloatMethod;
    if ((getProvideParamFloatMethod = ParamServerServiceGrpc.getProvideParamFloatMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getProvideParamFloatMethod = ParamServerServiceGrpc.getProvideParamFloatMethod) == null) {
          ParamServerServiceGrpc.getProvideParamFloatMethod = getProvideParamFloatMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest, io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideParamFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getProvideParamFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse> getRetrieveParamCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveParamCustom",
      requestType = io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse> getRetrieveParamCustomMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest, io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse> getRetrieveParamCustomMethod;
    if ((getRetrieveParamCustomMethod = ParamServerServiceGrpc.getRetrieveParamCustomMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getRetrieveParamCustomMethod = ParamServerServiceGrpc.getRetrieveParamCustomMethod) == null) {
          ParamServerServiceGrpc.getRetrieveParamCustomMethod = getRetrieveParamCustomMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest, io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveParamCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRetrieveParamCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest,
      io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse> getProvideParamCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvideParamCustom",
      requestType = io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest,
      io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse> getProvideParamCustomMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest, io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse> getProvideParamCustomMethod;
    if ((getProvideParamCustomMethod = ParamServerServiceGrpc.getProvideParamCustomMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getProvideParamCustomMethod = ParamServerServiceGrpc.getProvideParamCustomMethod) == null) {
          ParamServerServiceGrpc.getProvideParamCustomMethod = getProvideParamCustomMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest, io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProvideParamCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getProvideParamCustomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse> getRetrieveAllParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveAllParams",
      requestType = io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest,
      io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse> getRetrieveAllParamsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest, io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse> getRetrieveAllParamsMethod;
    if ((getRetrieveAllParamsMethod = ParamServerServiceGrpc.getRetrieveAllParamsMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getRetrieveAllParamsMethod = ParamServerServiceGrpc.getRetrieveAllParamsMethod) == null) {
          ParamServerServiceGrpc.getRetrieveAllParamsMethod = getRetrieveAllParamsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest, io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveAllParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRetrieveAllParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest,
      io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse> getSubscribeChangedParamIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeChangedParamInt",
      requestType = io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest,
      io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse> getSubscribeChangedParamIntMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest, io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse> getSubscribeChangedParamIntMethod;
    if ((getSubscribeChangedParamIntMethod = ParamServerServiceGrpc.getSubscribeChangedParamIntMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getSubscribeChangedParamIntMethod = ParamServerServiceGrpc.getSubscribeChangedParamIntMethod) == null) {
          ParamServerServiceGrpc.getSubscribeChangedParamIntMethod = getSubscribeChangedParamIntMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest, io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeChangedParamInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeChangedParamIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest,
      io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse> getSubscribeChangedParamFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeChangedParamFloat",
      requestType = io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest,
      io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse> getSubscribeChangedParamFloatMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest, io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse> getSubscribeChangedParamFloatMethod;
    if ((getSubscribeChangedParamFloatMethod = ParamServerServiceGrpc.getSubscribeChangedParamFloatMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getSubscribeChangedParamFloatMethod = ParamServerServiceGrpc.getSubscribeChangedParamFloatMethod) == null) {
          ParamServerServiceGrpc.getSubscribeChangedParamFloatMethod = getSubscribeChangedParamFloatMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest, io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeChangedParamFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeChangedParamFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest,
      io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse> getSubscribeChangedParamCustomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeChangedParamCustom",
      requestType = io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest.class,
      responseType = io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest,
      io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse> getSubscribeChangedParamCustomMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest, io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse> getSubscribeChangedParamCustomMethod;
    if ((getSubscribeChangedParamCustomMethod = ParamServerServiceGrpc.getSubscribeChangedParamCustomMethod) == null) {
      synchronized (ParamServerServiceGrpc.class) {
        if ((getSubscribeChangedParamCustomMethod = ParamServerServiceGrpc.getSubscribeChangedParamCustomMethod) == null) {
          ParamServerServiceGrpc.getSubscribeChangedParamCustomMethod = getSubscribeChangedParamCustomMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest, io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeChangedParamCustom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeChangedParamCustomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ParamServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParamServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParamServerServiceStub>() {
        @java.lang.Override
        public ParamServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParamServerServiceStub(channel, callOptions);
        }
      };
    return ParamServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ParamServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParamServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParamServerServiceBlockingStub>() {
        @java.lang.Override
        public ParamServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParamServerServiceBlockingStub(channel, callOptions);
        }
      };
    return ParamServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ParamServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ParamServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ParamServerServiceFutureStub>() {
        @java.lang.Override
        public ParamServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ParamServerServiceFutureStub(channel, callOptions);
        }
      };
    return ParamServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide raw access to retrieve and provide server parameters.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Retrieve an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void retrieveParamInt(io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveParamIntMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provide an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void provideParamInt(io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideParamIntMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void retrieveParamFloat(io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveParamFloatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provide a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void provideParamFloat(io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideParamFloatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void retrieveParamCustom(io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveParamCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provide a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    default void provideParamCustom(io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProvideParamCustomMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve all parameters.
     * </pre>
     */
    default void retrieveAllParams(io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetrieveAllParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to changed int param.
     * </pre>
     */
    default void subscribeChangedParamInt(io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeChangedParamIntMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to changed float param.
     * </pre>
     */
    default void subscribeChangedParamFloat(io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeChangedParamFloatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to changed custom param.
     * </pre>
     */
    default void subscribeChangedParamCustom(io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeChangedParamCustomMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ParamServerService.
   * <pre>
   * Provide raw access to retrieve and provide server parameters.
   * </pre>
   */
  public static abstract class ParamServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ParamServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ParamServerService.
   * <pre>
   * Provide raw access to retrieve and provide server parameters.
   * </pre>
   */
  public static final class ParamServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ParamServerServiceStub> {
    private ParamServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParamServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParamServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void retrieveParamInt(io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveParamIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provide an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void provideParamInt(io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideParamIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void retrieveParamFloat(io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveParamFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provide a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void provideParamFloat(io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideParamFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void retrieveParamCustom(io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveParamCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provide a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public void provideParamCustom(io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProvideParamCustomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve all parameters.
     * </pre>
     */
    public void retrieveAllParams(io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetrieveAllParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to changed int param.
     * </pre>
     */
    public void subscribeChangedParamInt(io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeChangedParamIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to changed float param.
     * </pre>
     */
    public void subscribeChangedParamFloat(io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeChangedParamFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to changed custom param.
     * </pre>
     */
    public void subscribeChangedParamCustom(io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeChangedParamCustomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ParamServerService.
   * <pre>
   * Provide raw access to retrieve and provide server parameters.
   * </pre>
   */
  public static final class ParamServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ParamServerServiceBlockingStub> {
    private ParamServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParamServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParamServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse retrieveParamInt(io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveParamIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provide an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse provideParamInt(io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideParamIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse retrieveParamFloat(io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveParamFloatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provide a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse provideParamFloat(io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideParamFloatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse retrieveParamCustom(io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveParamCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provide a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse provideParamCustom(io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProvideParamCustomMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve all parameters.
     * </pre>
     */
    public io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse retrieveAllParams(io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetrieveAllParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to changed int param.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse> subscribeChangedParamInt(
        io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeChangedParamIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to changed float param.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse> subscribeChangedParamFloat(
        io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeChangedParamFloatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to changed custom param.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse> subscribeChangedParamCustom(
        io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeChangedParamCustomMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ParamServerService.
   * <pre>
   * Provide raw access to retrieve and provide server parameters.
   * </pre>
   */
  public static final class ParamServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ParamServerServiceFutureStub> {
    private ParamServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ParamServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ParamServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse> retrieveParamInt(
        io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveParamIntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Provide an int parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse> provideParamInt(
        io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideParamIntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse> retrieveParamFloat(
        io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveParamFloatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Provide a float parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse> provideParamFloat(
        io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideParamFloatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse> retrieveParamCustom(
        io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveParamCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Provide a custom parameter.
     * If the type is wrong, the result will be `WRONG_TYPE`.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse> provideParamCustom(
        io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProvideParamCustomMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve all parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse> retrieveAllParams(
        io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetrieveAllParamsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETRIEVE_PARAM_INT = 0;
  private static final int METHODID_PROVIDE_PARAM_INT = 1;
  private static final int METHODID_RETRIEVE_PARAM_FLOAT = 2;
  private static final int METHODID_PROVIDE_PARAM_FLOAT = 3;
  private static final int METHODID_RETRIEVE_PARAM_CUSTOM = 4;
  private static final int METHODID_PROVIDE_PARAM_CUSTOM = 5;
  private static final int METHODID_RETRIEVE_ALL_PARAMS = 6;
  private static final int METHODID_SUBSCRIBE_CHANGED_PARAM_INT = 7;
  private static final int METHODID_SUBSCRIBE_CHANGED_PARAM_FLOAT = 8;
  private static final int METHODID_SUBSCRIBE_CHANGED_PARAM_CUSTOM = 9;

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
        case METHODID_RETRIEVE_PARAM_INT:
          serviceImpl.retrieveParamInt((io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_PARAM_INT:
          serviceImpl.provideParamInt((io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_PARAM_FLOAT:
          serviceImpl.retrieveParamFloat((io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_PARAM_FLOAT:
          serviceImpl.provideParamFloat((io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_PARAM_CUSTOM:
          serviceImpl.retrieveParamCustom((io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse>) responseObserver);
          break;
        case METHODID_PROVIDE_PARAM_CUSTOM:
          serviceImpl.provideParamCustom((io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse>) responseObserver);
          break;
        case METHODID_RETRIEVE_ALL_PARAMS:
          serviceImpl.retrieveAllParams((io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CHANGED_PARAM_INT:
          serviceImpl.subscribeChangedParamInt((io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CHANGED_PARAM_FLOAT:
          serviceImpl.subscribeChangedParamFloat((io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CHANGED_PARAM_CUSTOM:
          serviceImpl.subscribeChangedParamCustom((io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse>) responseObserver);
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
          getRetrieveParamIntMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.RetrieveParamIntRequest,
              io.mavsdk.param_server.ParamServerProto.RetrieveParamIntResponse>(
                service, METHODID_RETRIEVE_PARAM_INT)))
        .addMethod(
          getProvideParamIntMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.ProvideParamIntRequest,
              io.mavsdk.param_server.ParamServerProto.ProvideParamIntResponse>(
                service, METHODID_PROVIDE_PARAM_INT)))
        .addMethod(
          getRetrieveParamFloatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatRequest,
              io.mavsdk.param_server.ParamServerProto.RetrieveParamFloatResponse>(
                service, METHODID_RETRIEVE_PARAM_FLOAT)))
        .addMethod(
          getProvideParamFloatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.ProvideParamFloatRequest,
              io.mavsdk.param_server.ParamServerProto.ProvideParamFloatResponse>(
                service, METHODID_PROVIDE_PARAM_FLOAT)))
        .addMethod(
          getRetrieveParamCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomRequest,
              io.mavsdk.param_server.ParamServerProto.RetrieveParamCustomResponse>(
                service, METHODID_RETRIEVE_PARAM_CUSTOM)))
        .addMethod(
          getProvideParamCustomMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.ProvideParamCustomRequest,
              io.mavsdk.param_server.ParamServerProto.ProvideParamCustomResponse>(
                service, METHODID_PROVIDE_PARAM_CUSTOM)))
        .addMethod(
          getRetrieveAllParamsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsRequest,
              io.mavsdk.param_server.ParamServerProto.RetrieveAllParamsResponse>(
                service, METHODID_RETRIEVE_ALL_PARAMS)))
        .addMethod(
          getSubscribeChangedParamIntMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamIntRequest,
              io.mavsdk.param_server.ParamServerProto.ChangedParamIntResponse>(
                service, METHODID_SUBSCRIBE_CHANGED_PARAM_INT)))
        .addMethod(
          getSubscribeChangedParamFloatMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamFloatRequest,
              io.mavsdk.param_server.ParamServerProto.ChangedParamFloatResponse>(
                service, METHODID_SUBSCRIBE_CHANGED_PARAM_FLOAT)))
        .addMethod(
          getSubscribeChangedParamCustomMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.param_server.ParamServerProto.SubscribeChangedParamCustomRequest,
              io.mavsdk.param_server.ParamServerProto.ChangedParamCustomResponse>(
                service, METHODID_SUBSCRIBE_CHANGED_PARAM_CUSTOM)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ParamServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getRetrieveParamIntMethod())
              .addMethod(getProvideParamIntMethod())
              .addMethod(getRetrieveParamFloatMethod())
              .addMethod(getProvideParamFloatMethod())
              .addMethod(getRetrieveParamCustomMethod())
              .addMethod(getProvideParamCustomMethod())
              .addMethod(getRetrieveAllParamsMethod())
              .addMethod(getSubscribeChangedParamIntMethod())
              .addMethod(getSubscribeChangedParamFloatMethod())
              .addMethod(getSubscribeChangedParamCustomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
