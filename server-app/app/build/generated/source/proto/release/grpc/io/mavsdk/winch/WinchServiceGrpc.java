package io.mavsdk.winch;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allows users to send winch actions, as well as receive status information from winch systems.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/winch/winch.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WinchServiceGrpc {

  private WinchServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.winch.WinchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.SubscribeStatusRequest,
      io.mavsdk.winch.WinchProto.StatusResponse> getSubscribeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStatus",
      requestType = io.mavsdk.winch.WinchProto.SubscribeStatusRequest.class,
      responseType = io.mavsdk.winch.WinchProto.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.SubscribeStatusRequest,
      io.mavsdk.winch.WinchProto.StatusResponse> getSubscribeStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.SubscribeStatusRequest, io.mavsdk.winch.WinchProto.StatusResponse> getSubscribeStatusMethod;
    if ((getSubscribeStatusMethod = WinchServiceGrpc.getSubscribeStatusMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getSubscribeStatusMethod = WinchServiceGrpc.getSubscribeStatusMethod) == null) {
          WinchServiceGrpc.getSubscribeStatusMethod = getSubscribeStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.SubscribeStatusRequest, io.mavsdk.winch.WinchProto.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.SubscribeStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.StatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RelaxRequest,
      io.mavsdk.winch.WinchProto.RelaxResponse> getRelaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Relax",
      requestType = io.mavsdk.winch.WinchProto.RelaxRequest.class,
      responseType = io.mavsdk.winch.WinchProto.RelaxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RelaxRequest,
      io.mavsdk.winch.WinchProto.RelaxResponse> getRelaxMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RelaxRequest, io.mavsdk.winch.WinchProto.RelaxResponse> getRelaxMethod;
    if ((getRelaxMethod = WinchServiceGrpc.getRelaxMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getRelaxMethod = WinchServiceGrpc.getRelaxMethod) == null) {
          WinchServiceGrpc.getRelaxMethod = getRelaxMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.RelaxRequest, io.mavsdk.winch.WinchProto.RelaxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Relax"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RelaxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RelaxResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRelaxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RelativeLengthControlRequest,
      io.mavsdk.winch.WinchProto.RelativeLengthControlResponse> getRelativeLengthControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RelativeLengthControl",
      requestType = io.mavsdk.winch.WinchProto.RelativeLengthControlRequest.class,
      responseType = io.mavsdk.winch.WinchProto.RelativeLengthControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RelativeLengthControlRequest,
      io.mavsdk.winch.WinchProto.RelativeLengthControlResponse> getRelativeLengthControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RelativeLengthControlRequest, io.mavsdk.winch.WinchProto.RelativeLengthControlResponse> getRelativeLengthControlMethod;
    if ((getRelativeLengthControlMethod = WinchServiceGrpc.getRelativeLengthControlMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getRelativeLengthControlMethod = WinchServiceGrpc.getRelativeLengthControlMethod) == null) {
          WinchServiceGrpc.getRelativeLengthControlMethod = getRelativeLengthControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.RelativeLengthControlRequest, io.mavsdk.winch.WinchProto.RelativeLengthControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RelativeLengthControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RelativeLengthControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RelativeLengthControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRelativeLengthControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RateControlRequest,
      io.mavsdk.winch.WinchProto.RateControlResponse> getRateControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RateControl",
      requestType = io.mavsdk.winch.WinchProto.RateControlRequest.class,
      responseType = io.mavsdk.winch.WinchProto.RateControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RateControlRequest,
      io.mavsdk.winch.WinchProto.RateControlResponse> getRateControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RateControlRequest, io.mavsdk.winch.WinchProto.RateControlResponse> getRateControlMethod;
    if ((getRateControlMethod = WinchServiceGrpc.getRateControlMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getRateControlMethod = WinchServiceGrpc.getRateControlMethod) == null) {
          WinchServiceGrpc.getRateControlMethod = getRateControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.RateControlRequest, io.mavsdk.winch.WinchProto.RateControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RateControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RateControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RateControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRateControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LockRequest,
      io.mavsdk.winch.WinchProto.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = io.mavsdk.winch.WinchProto.LockRequest.class,
      responseType = io.mavsdk.winch.WinchProto.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LockRequest,
      io.mavsdk.winch.WinchProto.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LockRequest, io.mavsdk.winch.WinchProto.LockResponse> getLockMethod;
    if ((getLockMethod = WinchServiceGrpc.getLockMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getLockMethod = WinchServiceGrpc.getLockMethod) == null) {
          WinchServiceGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.LockRequest, io.mavsdk.winch.WinchProto.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.LockResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.DeliverRequest,
      io.mavsdk.winch.WinchProto.DeliverResponse> getDeliverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deliver",
      requestType = io.mavsdk.winch.WinchProto.DeliverRequest.class,
      responseType = io.mavsdk.winch.WinchProto.DeliverResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.DeliverRequest,
      io.mavsdk.winch.WinchProto.DeliverResponse> getDeliverMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.DeliverRequest, io.mavsdk.winch.WinchProto.DeliverResponse> getDeliverMethod;
    if ((getDeliverMethod = WinchServiceGrpc.getDeliverMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getDeliverMethod = WinchServiceGrpc.getDeliverMethod) == null) {
          WinchServiceGrpc.getDeliverMethod = getDeliverMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.DeliverRequest, io.mavsdk.winch.WinchProto.DeliverResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Deliver"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.DeliverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.DeliverResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeliverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.HoldRequest,
      io.mavsdk.winch.WinchProto.HoldResponse> getHoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hold",
      requestType = io.mavsdk.winch.WinchProto.HoldRequest.class,
      responseType = io.mavsdk.winch.WinchProto.HoldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.HoldRequest,
      io.mavsdk.winch.WinchProto.HoldResponse> getHoldMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.HoldRequest, io.mavsdk.winch.WinchProto.HoldResponse> getHoldMethod;
    if ((getHoldMethod = WinchServiceGrpc.getHoldMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getHoldMethod = WinchServiceGrpc.getHoldMethod) == null) {
          WinchServiceGrpc.getHoldMethod = getHoldMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.HoldRequest, io.mavsdk.winch.WinchProto.HoldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.HoldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.HoldResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getHoldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RetractRequest,
      io.mavsdk.winch.WinchProto.RetractResponse> getRetractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retract",
      requestType = io.mavsdk.winch.WinchProto.RetractRequest.class,
      responseType = io.mavsdk.winch.WinchProto.RetractResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RetractRequest,
      io.mavsdk.winch.WinchProto.RetractResponse> getRetractMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.RetractRequest, io.mavsdk.winch.WinchProto.RetractResponse> getRetractMethod;
    if ((getRetractMethod = WinchServiceGrpc.getRetractMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getRetractMethod = WinchServiceGrpc.getRetractMethod) == null) {
          WinchServiceGrpc.getRetractMethod = getRetractMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.RetractRequest, io.mavsdk.winch.WinchProto.RetractResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Retract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RetractRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.RetractResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRetractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LoadLineRequest,
      io.mavsdk.winch.WinchProto.LoadLineResponse> getLoadLineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadLine",
      requestType = io.mavsdk.winch.WinchProto.LoadLineRequest.class,
      responseType = io.mavsdk.winch.WinchProto.LoadLineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LoadLineRequest,
      io.mavsdk.winch.WinchProto.LoadLineResponse> getLoadLineMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LoadLineRequest, io.mavsdk.winch.WinchProto.LoadLineResponse> getLoadLineMethod;
    if ((getLoadLineMethod = WinchServiceGrpc.getLoadLineMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getLoadLineMethod = WinchServiceGrpc.getLoadLineMethod) == null) {
          WinchServiceGrpc.getLoadLineMethod = getLoadLineMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.LoadLineRequest, io.mavsdk.winch.WinchProto.LoadLineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadLine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.LoadLineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.LoadLineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLoadLineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.AbandonLineRequest,
      io.mavsdk.winch.WinchProto.AbandonLineResponse> getAbandonLineMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbandonLine",
      requestType = io.mavsdk.winch.WinchProto.AbandonLineRequest.class,
      responseType = io.mavsdk.winch.WinchProto.AbandonLineResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.AbandonLineRequest,
      io.mavsdk.winch.WinchProto.AbandonLineResponse> getAbandonLineMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.AbandonLineRequest, io.mavsdk.winch.WinchProto.AbandonLineResponse> getAbandonLineMethod;
    if ((getAbandonLineMethod = WinchServiceGrpc.getAbandonLineMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getAbandonLineMethod = WinchServiceGrpc.getAbandonLineMethod) == null) {
          WinchServiceGrpc.getAbandonLineMethod = getAbandonLineMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.AbandonLineRequest, io.mavsdk.winch.WinchProto.AbandonLineResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AbandonLine"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.AbandonLineRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.AbandonLineResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAbandonLineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LoadPayloadRequest,
      io.mavsdk.winch.WinchProto.LoadPayloadResponse> getLoadPayloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadPayload",
      requestType = io.mavsdk.winch.WinchProto.LoadPayloadRequest.class,
      responseType = io.mavsdk.winch.WinchProto.LoadPayloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LoadPayloadRequest,
      io.mavsdk.winch.WinchProto.LoadPayloadResponse> getLoadPayloadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.winch.WinchProto.LoadPayloadRequest, io.mavsdk.winch.WinchProto.LoadPayloadResponse> getLoadPayloadMethod;
    if ((getLoadPayloadMethod = WinchServiceGrpc.getLoadPayloadMethod) == null) {
      synchronized (WinchServiceGrpc.class) {
        if ((getLoadPayloadMethod = WinchServiceGrpc.getLoadPayloadMethod) == null) {
          WinchServiceGrpc.getLoadPayloadMethod = getLoadPayloadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.winch.WinchProto.LoadPayloadRequest, io.mavsdk.winch.WinchProto.LoadPayloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadPayload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.LoadPayloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.winch.WinchProto.LoadPayloadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLoadPayloadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WinchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WinchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WinchServiceStub>() {
        @java.lang.Override
        public WinchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WinchServiceStub(channel, callOptions);
        }
      };
    return WinchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WinchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WinchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WinchServiceBlockingStub>() {
        @java.lang.Override
        public WinchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WinchServiceBlockingStub(channel, callOptions);
        }
      };
    return WinchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WinchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WinchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WinchServiceFutureStub>() {
        @java.lang.Override
        public WinchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WinchServiceFutureStub(channel, callOptions);
        }
      };
    return WinchServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allows users to send winch actions, as well as receive status information from winch systems.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to 'winch status' updates.
     * </pre>
     */
    default void subscribeStatus(io.mavsdk.winch.WinchProto.SubscribeStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Allow motor to freewheel.
     * </pre>
     */
    default void relax(io.mavsdk.winch.WinchProto.RelaxRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RelaxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelaxMethod(), responseObserver);
    }

    /**
     * <pre>
     * Wind or unwind specified length of line, optionally using specified rate.
     * </pre>
     */
    default void relativeLengthControl(io.mavsdk.winch.WinchProto.RelativeLengthControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RelativeLengthControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRelativeLengthControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Wind or unwind line at specified rate.
     * </pre>
     */
    default void rateControl(io.mavsdk.winch.WinchProto.RateControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RateControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRateControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Perform the locking sequence to relieve motor while in the fully retracted position.
     * </pre>
     */
    default void lock(io.mavsdk.winch.WinchProto.LockRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sequence of drop, slow down, touch down, reel up, lock.
     * </pre>
     */
    default void deliver(io.mavsdk.winch.WinchProto.DeliverRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.DeliverResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeliverMethod(), responseObserver);
    }

    /**
     * <pre>
     * Engage motor and hold current position.
     * </pre>
     */
    default void hold(io.mavsdk.winch.WinchProto.HoldRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.HoldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHoldMethod(), responseObserver);
    }

    /**
     * <pre>
     * Return the reel to the fully retracted position.
     * </pre>
     */
    default void retract(io.mavsdk.winch.WinchProto.RetractRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RetractResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRetractMethod(), responseObserver);
    }

    /**
     * <pre>
     * Load the reel with line.
     * The winch will calculate the total loaded length and stop when the tension exceeds a threshold.
     * </pre>
     */
    default void loadLine(io.mavsdk.winch.WinchProto.LoadLineRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LoadLineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadLineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Spool out the entire length of the line.
     * </pre>
     */
    default void abandonLine(io.mavsdk.winch.WinchProto.AbandonLineRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.AbandonLineResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAbandonLineMethod(), responseObserver);
    }

    /**
     * <pre>
     * Spools out just enough to present the hook to the user to load the payload.
     * </pre>
     */
    default void loadPayload(io.mavsdk.winch.WinchProto.LoadPayloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LoadPayloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadPayloadMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WinchService.
   * <pre>
   * Allows users to send winch actions, as well as receive status information from winch systems.
   * </pre>
   */
  public static abstract class WinchServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WinchServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WinchService.
   * <pre>
   * Allows users to send winch actions, as well as receive status information from winch systems.
   * </pre>
   */
  public static final class WinchServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WinchServiceStub> {
    private WinchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WinchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'winch status' updates.
     * </pre>
     */
    public void subscribeStatus(io.mavsdk.winch.WinchProto.SubscribeStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Allow motor to freewheel.
     * </pre>
     */
    public void relax(io.mavsdk.winch.WinchProto.RelaxRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RelaxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelaxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Wind or unwind specified length of line, optionally using specified rate.
     * </pre>
     */
    public void relativeLengthControl(io.mavsdk.winch.WinchProto.RelativeLengthControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RelativeLengthControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRelativeLengthControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Wind or unwind line at specified rate.
     * </pre>
     */
    public void rateControl(io.mavsdk.winch.WinchProto.RateControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RateControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRateControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform the locking sequence to relieve motor while in the fully retracted position.
     * </pre>
     */
    public void lock(io.mavsdk.winch.WinchProto.LockRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sequence of drop, slow down, touch down, reel up, lock.
     * </pre>
     */
    public void deliver(io.mavsdk.winch.WinchProto.DeliverRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.DeliverResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeliverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Engage motor and hold current position.
     * </pre>
     */
    public void hold(io.mavsdk.winch.WinchProto.HoldRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.HoldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHoldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Return the reel to the fully retracted position.
     * </pre>
     */
    public void retract(io.mavsdk.winch.WinchProto.RetractRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RetractResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRetractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Load the reel with line.
     * The winch will calculate the total loaded length and stop when the tension exceeds a threshold.
     * </pre>
     */
    public void loadLine(io.mavsdk.winch.WinchProto.LoadLineRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LoadLineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadLineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Spool out the entire length of the line.
     * </pre>
     */
    public void abandonLine(io.mavsdk.winch.WinchProto.AbandonLineRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.AbandonLineResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAbandonLineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Spools out just enough to present the hook to the user to load the payload.
     * </pre>
     */
    public void loadPayload(io.mavsdk.winch.WinchProto.LoadPayloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LoadPayloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadPayloadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WinchService.
   * <pre>
   * Allows users to send winch actions, as well as receive status information from winch systems.
   * </pre>
   */
  public static final class WinchServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WinchServiceBlockingStub> {
    private WinchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WinchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'winch status' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.winch.WinchProto.StatusResponse> subscribeStatus(
        io.mavsdk.winch.WinchProto.SubscribeStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Allow motor to freewheel.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.RelaxResponse relax(io.mavsdk.winch.WinchProto.RelaxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelaxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Wind or unwind specified length of line, optionally using specified rate.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.RelativeLengthControlResponse relativeLengthControl(io.mavsdk.winch.WinchProto.RelativeLengthControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRelativeLengthControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Wind or unwind line at specified rate.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.RateControlResponse rateControl(io.mavsdk.winch.WinchProto.RateControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRateControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform the locking sequence to relieve motor while in the fully retracted position.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.LockResponse lock(io.mavsdk.winch.WinchProto.LockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sequence of drop, slow down, touch down, reel up, lock.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.DeliverResponse deliver(io.mavsdk.winch.WinchProto.DeliverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeliverMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Engage motor and hold current position.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.HoldResponse hold(io.mavsdk.winch.WinchProto.HoldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHoldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Return the reel to the fully retracted position.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.RetractResponse retract(io.mavsdk.winch.WinchProto.RetractRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRetractMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Load the reel with line.
     * The winch will calculate the total loaded length and stop when the tension exceeds a threshold.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.LoadLineResponse loadLine(io.mavsdk.winch.WinchProto.LoadLineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadLineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Spool out the entire length of the line.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.AbandonLineResponse abandonLine(io.mavsdk.winch.WinchProto.AbandonLineRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAbandonLineMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Spools out just enough to present the hook to the user to load the payload.
     * </pre>
     */
    public io.mavsdk.winch.WinchProto.LoadPayloadResponse loadPayload(io.mavsdk.winch.WinchProto.LoadPayloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadPayloadMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WinchService.
   * <pre>
   * Allows users to send winch actions, as well as receive status information from winch systems.
   * </pre>
   */
  public static final class WinchServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WinchServiceFutureStub> {
    private WinchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WinchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WinchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Allow motor to freewheel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.RelaxResponse> relax(
        io.mavsdk.winch.WinchProto.RelaxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelaxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Wind or unwind specified length of line, optionally using specified rate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.RelativeLengthControlResponse> relativeLengthControl(
        io.mavsdk.winch.WinchProto.RelativeLengthControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRelativeLengthControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Wind or unwind line at specified rate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.RateControlResponse> rateControl(
        io.mavsdk.winch.WinchProto.RateControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRateControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform the locking sequence to relieve motor while in the fully retracted position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.LockResponse> lock(
        io.mavsdk.winch.WinchProto.LockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sequence of drop, slow down, touch down, reel up, lock.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.DeliverResponse> deliver(
        io.mavsdk.winch.WinchProto.DeliverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeliverMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Engage motor and hold current position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.HoldResponse> hold(
        io.mavsdk.winch.WinchProto.HoldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHoldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Return the reel to the fully retracted position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.RetractResponse> retract(
        io.mavsdk.winch.WinchProto.RetractRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRetractMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Load the reel with line.
     * The winch will calculate the total loaded length and stop when the tension exceeds a threshold.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.LoadLineResponse> loadLine(
        io.mavsdk.winch.WinchProto.LoadLineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadLineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Spool out the entire length of the line.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.AbandonLineResponse> abandonLine(
        io.mavsdk.winch.WinchProto.AbandonLineRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAbandonLineMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Spools out just enough to present the hook to the user to load the payload.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.winch.WinchProto.LoadPayloadResponse> loadPayload(
        io.mavsdk.winch.WinchProto.LoadPayloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadPayloadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_STATUS = 0;
  private static final int METHODID_RELAX = 1;
  private static final int METHODID_RELATIVE_LENGTH_CONTROL = 2;
  private static final int METHODID_RATE_CONTROL = 3;
  private static final int METHODID_LOCK = 4;
  private static final int METHODID_DELIVER = 5;
  private static final int METHODID_HOLD = 6;
  private static final int METHODID_RETRACT = 7;
  private static final int METHODID_LOAD_LINE = 8;
  private static final int METHODID_ABANDON_LINE = 9;
  private static final int METHODID_LOAD_PAYLOAD = 10;

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
        case METHODID_SUBSCRIBE_STATUS:
          serviceImpl.subscribeStatus((io.mavsdk.winch.WinchProto.SubscribeStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.StatusResponse>) responseObserver);
          break;
        case METHODID_RELAX:
          serviceImpl.relax((io.mavsdk.winch.WinchProto.RelaxRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RelaxResponse>) responseObserver);
          break;
        case METHODID_RELATIVE_LENGTH_CONTROL:
          serviceImpl.relativeLengthControl((io.mavsdk.winch.WinchProto.RelativeLengthControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RelativeLengthControlResponse>) responseObserver);
          break;
        case METHODID_RATE_CONTROL:
          serviceImpl.rateControl((io.mavsdk.winch.WinchProto.RateControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RateControlResponse>) responseObserver);
          break;
        case METHODID_LOCK:
          serviceImpl.lock((io.mavsdk.winch.WinchProto.LockRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LockResponse>) responseObserver);
          break;
        case METHODID_DELIVER:
          serviceImpl.deliver((io.mavsdk.winch.WinchProto.DeliverRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.DeliverResponse>) responseObserver);
          break;
        case METHODID_HOLD:
          serviceImpl.hold((io.mavsdk.winch.WinchProto.HoldRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.HoldResponse>) responseObserver);
          break;
        case METHODID_RETRACT:
          serviceImpl.retract((io.mavsdk.winch.WinchProto.RetractRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.RetractResponse>) responseObserver);
          break;
        case METHODID_LOAD_LINE:
          serviceImpl.loadLine((io.mavsdk.winch.WinchProto.LoadLineRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LoadLineResponse>) responseObserver);
          break;
        case METHODID_ABANDON_LINE:
          serviceImpl.abandonLine((io.mavsdk.winch.WinchProto.AbandonLineRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.AbandonLineResponse>) responseObserver);
          break;
        case METHODID_LOAD_PAYLOAD:
          serviceImpl.loadPayload((io.mavsdk.winch.WinchProto.LoadPayloadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.winch.WinchProto.LoadPayloadResponse>) responseObserver);
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
          getSubscribeStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.SubscribeStatusRequest,
              io.mavsdk.winch.WinchProto.StatusResponse>(
                service, METHODID_SUBSCRIBE_STATUS)))
        .addMethod(
          getRelaxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.RelaxRequest,
              io.mavsdk.winch.WinchProto.RelaxResponse>(
                service, METHODID_RELAX)))
        .addMethod(
          getRelativeLengthControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.RelativeLengthControlRequest,
              io.mavsdk.winch.WinchProto.RelativeLengthControlResponse>(
                service, METHODID_RELATIVE_LENGTH_CONTROL)))
        .addMethod(
          getRateControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.RateControlRequest,
              io.mavsdk.winch.WinchProto.RateControlResponse>(
                service, METHODID_RATE_CONTROL)))
        .addMethod(
          getLockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.LockRequest,
              io.mavsdk.winch.WinchProto.LockResponse>(
                service, METHODID_LOCK)))
        .addMethod(
          getDeliverMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.DeliverRequest,
              io.mavsdk.winch.WinchProto.DeliverResponse>(
                service, METHODID_DELIVER)))
        .addMethod(
          getHoldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.HoldRequest,
              io.mavsdk.winch.WinchProto.HoldResponse>(
                service, METHODID_HOLD)))
        .addMethod(
          getRetractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.RetractRequest,
              io.mavsdk.winch.WinchProto.RetractResponse>(
                service, METHODID_RETRACT)))
        .addMethod(
          getLoadLineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.LoadLineRequest,
              io.mavsdk.winch.WinchProto.LoadLineResponse>(
                service, METHODID_LOAD_LINE)))
        .addMethod(
          getAbandonLineMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.AbandonLineRequest,
              io.mavsdk.winch.WinchProto.AbandonLineResponse>(
                service, METHODID_ABANDON_LINE)))
        .addMethod(
          getLoadPayloadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.winch.WinchProto.LoadPayloadRequest,
              io.mavsdk.winch.WinchProto.LoadPayloadResponse>(
                service, METHODID_LOAD_PAYLOAD)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WinchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeStatusMethod())
              .addMethod(getRelaxMethod())
              .addMethod(getRelativeLengthControlMethod())
              .addMethod(getRateControlMethod())
              .addMethod(getLockMethod())
              .addMethod(getDeliverMethod())
              .addMethod(getHoldMethod())
              .addMethod(getRetractMethod())
              .addMethod(getLoadLineMethod())
              .addMethod(getAbandonLineMethod())
              .addMethod(getLoadPayloadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
