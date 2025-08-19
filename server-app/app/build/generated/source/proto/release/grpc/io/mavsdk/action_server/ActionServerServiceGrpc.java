package io.mavsdk.action_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provide vehicle actions (as a server) such as arming, taking off, and landing.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/action_server/action_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ActionServerServiceGrpc {

  private ActionServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.action_server.ActionServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest,
      io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse> getSubscribeArmDisarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeArmDisarm",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest,
      io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse> getSubscribeArmDisarmMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest, io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse> getSubscribeArmDisarmMethod;
    if ((getSubscribeArmDisarmMethod = ActionServerServiceGrpc.getSubscribeArmDisarmMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeArmDisarmMethod = ActionServerServiceGrpc.getSubscribeArmDisarmMethod) == null) {
          ActionServerServiceGrpc.getSubscribeArmDisarmMethod = getSubscribeArmDisarmMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest, io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeArmDisarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeArmDisarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest,
      io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse> getSubscribeFlightModeChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeFlightModeChange",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest,
      io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse> getSubscribeFlightModeChangeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest, io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse> getSubscribeFlightModeChangeMethod;
    if ((getSubscribeFlightModeChangeMethod = ActionServerServiceGrpc.getSubscribeFlightModeChangeMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeFlightModeChangeMethod = ActionServerServiceGrpc.getSubscribeFlightModeChangeMethod) == null) {
          ActionServerServiceGrpc.getSubscribeFlightModeChangeMethod = getSubscribeFlightModeChangeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest, io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeFlightModeChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeFlightModeChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest,
      io.mavsdk.action_server.ActionServerProto.TakeoffResponse> getSubscribeTakeoffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTakeoff",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.TakeoffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest,
      io.mavsdk.action_server.ActionServerProto.TakeoffResponse> getSubscribeTakeoffMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest, io.mavsdk.action_server.ActionServerProto.TakeoffResponse> getSubscribeTakeoffMethod;
    if ((getSubscribeTakeoffMethod = ActionServerServiceGrpc.getSubscribeTakeoffMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeTakeoffMethod = ActionServerServiceGrpc.getSubscribeTakeoffMethod) == null) {
          ActionServerServiceGrpc.getSubscribeTakeoffMethod = getSubscribeTakeoffMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest, io.mavsdk.action_server.ActionServerProto.TakeoffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTakeoff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.TakeoffResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTakeoffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest,
      io.mavsdk.action_server.ActionServerProto.LandResponse> getSubscribeLandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLand",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.LandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest,
      io.mavsdk.action_server.ActionServerProto.LandResponse> getSubscribeLandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest, io.mavsdk.action_server.ActionServerProto.LandResponse> getSubscribeLandMethod;
    if ((getSubscribeLandMethod = ActionServerServiceGrpc.getSubscribeLandMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeLandMethod = ActionServerServiceGrpc.getSubscribeLandMethod) == null) {
          ActionServerServiceGrpc.getSubscribeLandMethod = getSubscribeLandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest, io.mavsdk.action_server.ActionServerProto.LandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeLand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.LandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeLandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest,
      io.mavsdk.action_server.ActionServerProto.RebootResponse> getSubscribeRebootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeReboot",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.RebootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest,
      io.mavsdk.action_server.ActionServerProto.RebootResponse> getSubscribeRebootMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest, io.mavsdk.action_server.ActionServerProto.RebootResponse> getSubscribeRebootMethod;
    if ((getSubscribeRebootMethod = ActionServerServiceGrpc.getSubscribeRebootMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeRebootMethod = ActionServerServiceGrpc.getSubscribeRebootMethod) == null) {
          ActionServerServiceGrpc.getSubscribeRebootMethod = getSubscribeRebootMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest, io.mavsdk.action_server.ActionServerProto.RebootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeReboot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.RebootResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeRebootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest,
      io.mavsdk.action_server.ActionServerProto.ShutdownResponse> getSubscribeShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeShutdown",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.ShutdownResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest,
      io.mavsdk.action_server.ActionServerProto.ShutdownResponse> getSubscribeShutdownMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest, io.mavsdk.action_server.ActionServerProto.ShutdownResponse> getSubscribeShutdownMethod;
    if ((getSubscribeShutdownMethod = ActionServerServiceGrpc.getSubscribeShutdownMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeShutdownMethod = ActionServerServiceGrpc.getSubscribeShutdownMethod) == null) {
          ActionServerServiceGrpc.getSubscribeShutdownMethod = getSubscribeShutdownMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest, io.mavsdk.action_server.ActionServerProto.ShutdownResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeShutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.ShutdownResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeShutdownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest,
      io.mavsdk.action_server.ActionServerProto.TerminateResponse> getSubscribeTerminateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTerminate",
      requestType = io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.TerminateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest,
      io.mavsdk.action_server.ActionServerProto.TerminateResponse> getSubscribeTerminateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest, io.mavsdk.action_server.ActionServerProto.TerminateResponse> getSubscribeTerminateMethod;
    if ((getSubscribeTerminateMethod = ActionServerServiceGrpc.getSubscribeTerminateMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSubscribeTerminateMethod = ActionServerServiceGrpc.getSubscribeTerminateMethod) == null) {
          ActionServerServiceGrpc.getSubscribeTerminateMethod = getSubscribeTerminateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest, io.mavsdk.action_server.ActionServerProto.TerminateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTerminate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.TerminateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTerminateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest,
      io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse> getSetAllowTakeoffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAllowTakeoff",
      requestType = io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest,
      io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse> getSetAllowTakeoffMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest, io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse> getSetAllowTakeoffMethod;
    if ((getSetAllowTakeoffMethod = ActionServerServiceGrpc.getSetAllowTakeoffMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSetAllowTakeoffMethod = ActionServerServiceGrpc.getSetAllowTakeoffMethod) == null) {
          ActionServerServiceGrpc.getSetAllowTakeoffMethod = getSetAllowTakeoffMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest, io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAllowTakeoff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAllowTakeoffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetArmableRequest,
      io.mavsdk.action_server.ActionServerProto.SetArmableResponse> getSetArmableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetArmable",
      requestType = io.mavsdk.action_server.ActionServerProto.SetArmableRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.SetArmableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetArmableRequest,
      io.mavsdk.action_server.ActionServerProto.SetArmableResponse> getSetArmableMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetArmableRequest, io.mavsdk.action_server.ActionServerProto.SetArmableResponse> getSetArmableMethod;
    if ((getSetArmableMethod = ActionServerServiceGrpc.getSetArmableMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSetArmableMethod = ActionServerServiceGrpc.getSetArmableMethod) == null) {
          ActionServerServiceGrpc.getSetArmableMethod = getSetArmableMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SetArmableRequest, io.mavsdk.action_server.ActionServerProto.SetArmableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetArmable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetArmableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetArmableResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetArmableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest,
      io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse> getSetDisarmableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDisarmable",
      requestType = io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest,
      io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse> getSetDisarmableMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest, io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse> getSetDisarmableMethod;
    if ((getSetDisarmableMethod = ActionServerServiceGrpc.getSetDisarmableMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSetDisarmableMethod = ActionServerServiceGrpc.getSetDisarmableMethod) == null) {
          ActionServerServiceGrpc.getSetDisarmableMethod = getSetDisarmableMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest, io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetDisarmable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetDisarmableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest,
      io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse> getSetAllowableFlightModesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAllowableFlightModes",
      requestType = io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest,
      io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse> getSetAllowableFlightModesMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest, io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse> getSetAllowableFlightModesMethod;
    if ((getSetAllowableFlightModesMethod = ActionServerServiceGrpc.getSetAllowableFlightModesMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getSetAllowableFlightModesMethod = ActionServerServiceGrpc.getSetAllowableFlightModesMethod) == null) {
          ActionServerServiceGrpc.getSetAllowableFlightModesMethod = getSetAllowableFlightModesMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest, io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAllowableFlightModes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAllowableFlightModesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest,
      io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse> getGetAllowableFlightModesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllowableFlightModes",
      requestType = io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest.class,
      responseType = io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest,
      io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse> getGetAllowableFlightModesMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest, io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse> getGetAllowableFlightModesMethod;
    if ((getGetAllowableFlightModesMethod = ActionServerServiceGrpc.getGetAllowableFlightModesMethod) == null) {
      synchronized (ActionServerServiceGrpc.class) {
        if ((getGetAllowableFlightModesMethod = ActionServerServiceGrpc.getGetAllowableFlightModesMethod) == null) {
          ActionServerServiceGrpc.getGetAllowableFlightModesMethod = getGetAllowableFlightModesMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest, io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllowableFlightModes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAllowableFlightModesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActionServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActionServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActionServerServiceStub>() {
        @java.lang.Override
        public ActionServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActionServerServiceStub(channel, callOptions);
        }
      };
    return ActionServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActionServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActionServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActionServerServiceBlockingStub>() {
        @java.lang.Override
        public ActionServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActionServerServiceBlockingStub(channel, callOptions);
        }
      };
    return ActionServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActionServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActionServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActionServerServiceFutureStub>() {
        @java.lang.Override
        public ActionServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActionServerServiceFutureStub(channel, callOptions);
        }
      };
    return ActionServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provide vehicle actions (as a server) such as arming, taking off, and landing.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to ARM/DISARM commands
     * </pre>
     */
    default void subscribeArmDisarm(io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeArmDisarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to DO_SET_MODE
     * </pre>
     */
    default void subscribeFlightModeChange(io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeFlightModeChangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to takeoff command
     * </pre>
     */
    default void subscribeTakeoff(io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.TakeoffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTakeoffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to land command
     * </pre>
     */
    default void subscribeLand(io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.LandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeLandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to reboot command
     * </pre>
     */
    default void subscribeReboot(io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.RebootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeRebootMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to shutdown command
     * </pre>
     */
    default void subscribeShutdown(io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.ShutdownResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeShutdownMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to terminate command
     * </pre>
     */
    default void subscribeTerminate(io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.TerminateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTerminateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Can the vehicle takeoff
     * </pre>
     */
    default void setAllowTakeoff(io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAllowTakeoffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Can the vehicle arm when requested
     * </pre>
     */
    default void setArmable(io.mavsdk.action_server.ActionServerProto.SetArmableRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetArmableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetArmableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Can the vehicle disarm when requested
     * </pre>
     */
    default void setDisarmable(io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetDisarmableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    default void setAllowableFlightModes(io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAllowableFlightModesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    default void getAllowableFlightModes(io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllowableFlightModesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ActionServerService.
   * <pre>
   * Provide vehicle actions (as a server) such as arming, taking off, and landing.
   * </pre>
   */
  public static abstract class ActionServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ActionServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ActionServerService.
   * <pre>
   * Provide vehicle actions (as a server) such as arming, taking off, and landing.
   * </pre>
   */
  public static final class ActionServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ActionServerServiceStub> {
    private ActionServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActionServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to ARM/DISARM commands
     * </pre>
     */
    public void subscribeArmDisarm(io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeArmDisarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to DO_SET_MODE
     * </pre>
     */
    public void subscribeFlightModeChange(io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeFlightModeChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to takeoff command
     * </pre>
     */
    public void subscribeTakeoff(io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.TakeoffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTakeoffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to land command
     * </pre>
     */
    public void subscribeLand(io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.LandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeLandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to reboot command
     * </pre>
     */
    public void subscribeReboot(io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.RebootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeRebootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to shutdown command
     * </pre>
     */
    public void subscribeShutdown(io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.ShutdownResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeShutdownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to terminate command
     * </pre>
     */
    public void subscribeTerminate(io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.TerminateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTerminateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Can the vehicle takeoff
     * </pre>
     */
    public void setAllowTakeoff(io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAllowTakeoffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Can the vehicle arm when requested
     * </pre>
     */
    public void setArmable(io.mavsdk.action_server.ActionServerProto.SetArmableRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetArmableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetArmableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Can the vehicle disarm when requested
     * </pre>
     */
    public void setDisarmable(io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetDisarmableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    public void setAllowableFlightModes(io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAllowableFlightModesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    public void getAllowableFlightModes(io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllowableFlightModesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ActionServerService.
   * <pre>
   * Provide vehicle actions (as a server) such as arming, taking off, and landing.
   * </pre>
   */
  public static final class ActionServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ActionServerServiceBlockingStub> {
    private ActionServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActionServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to ARM/DISARM commands
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse> subscribeArmDisarm(
        io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeArmDisarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to DO_SET_MODE
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse> subscribeFlightModeChange(
        io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeFlightModeChangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to takeoff command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.TakeoffResponse> subscribeTakeoff(
        io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTakeoffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to land command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.LandResponse> subscribeLand(
        io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeLandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to reboot command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.RebootResponse> subscribeReboot(
        io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeRebootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to shutdown command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.ShutdownResponse> subscribeShutdown(
        io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeShutdownMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to terminate command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.action_server.ActionServerProto.TerminateResponse> subscribeTerminate(
        io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTerminateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Can the vehicle takeoff
     * </pre>
     */
    public io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse setAllowTakeoff(io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAllowTakeoffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Can the vehicle arm when requested
     * </pre>
     */
    public io.mavsdk.action_server.ActionServerProto.SetArmableResponse setArmable(io.mavsdk.action_server.ActionServerProto.SetArmableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetArmableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Can the vehicle disarm when requested
     * </pre>
     */
    public io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse setDisarmable(io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetDisarmableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    public io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse setAllowableFlightModes(io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAllowableFlightModesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    public io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse getAllowableFlightModes(io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllowableFlightModesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ActionServerService.
   * <pre>
   * Provide vehicle actions (as a server) such as arming, taking off, and landing.
   * </pre>
   */
  public static final class ActionServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ActionServerServiceFutureStub> {
    private ActionServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActionServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Can the vehicle takeoff
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse> setAllowTakeoff(
        io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAllowTakeoffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Can the vehicle arm when requested
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action_server.ActionServerProto.SetArmableResponse> setArmable(
        io.mavsdk.action_server.ActionServerProto.SetArmableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetArmableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Can the vehicle disarm when requested
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse> setDisarmable(
        io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetDisarmableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse> setAllowableFlightModes(
        io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAllowableFlightModesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get which modes the vehicle can transition to (Manual always allowed)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse> getAllowableFlightModes(
        io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllowableFlightModesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_ARM_DISARM = 0;
  private static final int METHODID_SUBSCRIBE_FLIGHT_MODE_CHANGE = 1;
  private static final int METHODID_SUBSCRIBE_TAKEOFF = 2;
  private static final int METHODID_SUBSCRIBE_LAND = 3;
  private static final int METHODID_SUBSCRIBE_REBOOT = 4;
  private static final int METHODID_SUBSCRIBE_SHUTDOWN = 5;
  private static final int METHODID_SUBSCRIBE_TERMINATE = 6;
  private static final int METHODID_SET_ALLOW_TAKEOFF = 7;
  private static final int METHODID_SET_ARMABLE = 8;
  private static final int METHODID_SET_DISARMABLE = 9;
  private static final int METHODID_SET_ALLOWABLE_FLIGHT_MODES = 10;
  private static final int METHODID_GET_ALLOWABLE_FLIGHT_MODES = 11;

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
        case METHODID_SUBSCRIBE_ARM_DISARM:
          serviceImpl.subscribeArmDisarm((io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FLIGHT_MODE_CHANGE:
          serviceImpl.subscribeFlightModeChange((io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TAKEOFF:
          serviceImpl.subscribeTakeoff((io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.TakeoffResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_LAND:
          serviceImpl.subscribeLand((io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.LandResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_REBOOT:
          serviceImpl.subscribeReboot((io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.RebootResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SHUTDOWN:
          serviceImpl.subscribeShutdown((io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.ShutdownResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TERMINATE:
          serviceImpl.subscribeTerminate((io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.TerminateResponse>) responseObserver);
          break;
        case METHODID_SET_ALLOW_TAKEOFF:
          serviceImpl.setAllowTakeoff((io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse>) responseObserver);
          break;
        case METHODID_SET_ARMABLE:
          serviceImpl.setArmable((io.mavsdk.action_server.ActionServerProto.SetArmableRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetArmableResponse>) responseObserver);
          break;
        case METHODID_SET_DISARMABLE:
          serviceImpl.setDisarmable((io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse>) responseObserver);
          break;
        case METHODID_SET_ALLOWABLE_FLIGHT_MODES:
          serviceImpl.setAllowableFlightModes((io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse>) responseObserver);
          break;
        case METHODID_GET_ALLOWABLE_FLIGHT_MODES:
          serviceImpl.getAllowableFlightModes((io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse>) responseObserver);
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
          getSubscribeArmDisarmMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeArmDisarmRequest,
              io.mavsdk.action_server.ActionServerProto.ArmDisarmResponse>(
                service, METHODID_SUBSCRIBE_ARM_DISARM)))
        .addMethod(
          getSubscribeFlightModeChangeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeFlightModeChangeRequest,
              io.mavsdk.action_server.ActionServerProto.FlightModeChangeResponse>(
                service, METHODID_SUBSCRIBE_FLIGHT_MODE_CHANGE)))
        .addMethod(
          getSubscribeTakeoffMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeTakeoffRequest,
              io.mavsdk.action_server.ActionServerProto.TakeoffResponse>(
                service, METHODID_SUBSCRIBE_TAKEOFF)))
        .addMethod(
          getSubscribeLandMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeLandRequest,
              io.mavsdk.action_server.ActionServerProto.LandResponse>(
                service, METHODID_SUBSCRIBE_LAND)))
        .addMethod(
          getSubscribeRebootMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeRebootRequest,
              io.mavsdk.action_server.ActionServerProto.RebootResponse>(
                service, METHODID_SUBSCRIBE_REBOOT)))
        .addMethod(
          getSubscribeShutdownMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeShutdownRequest,
              io.mavsdk.action_server.ActionServerProto.ShutdownResponse>(
                service, METHODID_SUBSCRIBE_SHUTDOWN)))
        .addMethod(
          getSubscribeTerminateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SubscribeTerminateRequest,
              io.mavsdk.action_server.ActionServerProto.TerminateResponse>(
                service, METHODID_SUBSCRIBE_TERMINATE)))
        .addMethod(
          getSetAllowTakeoffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffRequest,
              io.mavsdk.action_server.ActionServerProto.SetAllowTakeoffResponse>(
                service, METHODID_SET_ALLOW_TAKEOFF)))
        .addMethod(
          getSetArmableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SetArmableRequest,
              io.mavsdk.action_server.ActionServerProto.SetArmableResponse>(
                service, METHODID_SET_ARMABLE)))
        .addMethod(
          getSetDisarmableMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SetDisarmableRequest,
              io.mavsdk.action_server.ActionServerProto.SetDisarmableResponse>(
                service, METHODID_SET_DISARMABLE)))
        .addMethod(
          getSetAllowableFlightModesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesRequest,
              io.mavsdk.action_server.ActionServerProto.SetAllowableFlightModesResponse>(
                service, METHODID_SET_ALLOWABLE_FLIGHT_MODES)))
        .addMethod(
          getGetAllowableFlightModesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesRequest,
              io.mavsdk.action_server.ActionServerProto.GetAllowableFlightModesResponse>(
                service, METHODID_GET_ALLOWABLE_FLIGHT_MODES)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ActionServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribeArmDisarmMethod())
              .addMethod(getSubscribeFlightModeChangeMethod())
              .addMethod(getSubscribeTakeoffMethod())
              .addMethod(getSubscribeLandMethod())
              .addMethod(getSubscribeRebootMethod())
              .addMethod(getSubscribeShutdownMethod())
              .addMethod(getSubscribeTerminateMethod())
              .addMethod(getSetAllowTakeoffMethod())
              .addMethod(getSetArmableMethod())
              .addMethod(getSetDisarmableMethod())
              .addMethod(getSetAllowableFlightModesMethod())
              .addMethod(getGetAllowableFlightModesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
