package io.mavsdk.action;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable simple actions such as arming, taking off, and landing.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/action/action.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ActionServiceGrpc {

  private ActionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.action.ActionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ArmRequest,
      io.mavsdk.action.ActionProto.ArmResponse> getArmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Arm",
      requestType = io.mavsdk.action.ActionProto.ArmRequest.class,
      responseType = io.mavsdk.action.ActionProto.ArmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ArmRequest,
      io.mavsdk.action.ActionProto.ArmResponse> getArmMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ArmRequest, io.mavsdk.action.ActionProto.ArmResponse> getArmMethod;
    if ((getArmMethod = ActionServiceGrpc.getArmMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getArmMethod = ActionServiceGrpc.getArmMethod) == null) {
          ActionServiceGrpc.getArmMethod = getArmMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.ArmRequest, io.mavsdk.action.ActionProto.ArmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Arm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ArmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ArmResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getArmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ArmForceRequest,
      io.mavsdk.action.ActionProto.ArmForceResponse> getArmForceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ArmForce",
      requestType = io.mavsdk.action.ActionProto.ArmForceRequest.class,
      responseType = io.mavsdk.action.ActionProto.ArmForceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ArmForceRequest,
      io.mavsdk.action.ActionProto.ArmForceResponse> getArmForceMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ArmForceRequest, io.mavsdk.action.ActionProto.ArmForceResponse> getArmForceMethod;
    if ((getArmForceMethod = ActionServiceGrpc.getArmForceMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getArmForceMethod = ActionServiceGrpc.getArmForceMethod) == null) {
          ActionServiceGrpc.getArmForceMethod = getArmForceMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.ArmForceRequest, io.mavsdk.action.ActionProto.ArmForceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ArmForce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ArmForceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ArmForceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getArmForceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.DisarmRequest,
      io.mavsdk.action.ActionProto.DisarmResponse> getDisarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disarm",
      requestType = io.mavsdk.action.ActionProto.DisarmRequest.class,
      responseType = io.mavsdk.action.ActionProto.DisarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.DisarmRequest,
      io.mavsdk.action.ActionProto.DisarmResponse> getDisarmMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.DisarmRequest, io.mavsdk.action.ActionProto.DisarmResponse> getDisarmMethod;
    if ((getDisarmMethod = ActionServiceGrpc.getDisarmMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getDisarmMethod = ActionServiceGrpc.getDisarmMethod) == null) {
          ActionServiceGrpc.getDisarmMethod = getDisarmMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.DisarmRequest, io.mavsdk.action.ActionProto.DisarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.DisarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.DisarmResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDisarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TakeoffRequest,
      io.mavsdk.action.ActionProto.TakeoffResponse> getTakeoffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Takeoff",
      requestType = io.mavsdk.action.ActionProto.TakeoffRequest.class,
      responseType = io.mavsdk.action.ActionProto.TakeoffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TakeoffRequest,
      io.mavsdk.action.ActionProto.TakeoffResponse> getTakeoffMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TakeoffRequest, io.mavsdk.action.ActionProto.TakeoffResponse> getTakeoffMethod;
    if ((getTakeoffMethod = ActionServiceGrpc.getTakeoffMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getTakeoffMethod = ActionServiceGrpc.getTakeoffMethod) == null) {
          ActionServiceGrpc.getTakeoffMethod = getTakeoffMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.TakeoffRequest, io.mavsdk.action.ActionProto.TakeoffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Takeoff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TakeoffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TakeoffResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTakeoffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.LandRequest,
      io.mavsdk.action.ActionProto.LandResponse> getLandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Land",
      requestType = io.mavsdk.action.ActionProto.LandRequest.class,
      responseType = io.mavsdk.action.ActionProto.LandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.LandRequest,
      io.mavsdk.action.ActionProto.LandResponse> getLandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.LandRequest, io.mavsdk.action.ActionProto.LandResponse> getLandMethod;
    if ((getLandMethod = ActionServiceGrpc.getLandMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getLandMethod = ActionServiceGrpc.getLandMethod) == null) {
          ActionServiceGrpc.getLandMethod = getLandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.LandRequest, io.mavsdk.action.ActionProto.LandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Land"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.LandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.LandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getLandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.RebootRequest,
      io.mavsdk.action.ActionProto.RebootResponse> getRebootMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reboot",
      requestType = io.mavsdk.action.ActionProto.RebootRequest.class,
      responseType = io.mavsdk.action.ActionProto.RebootResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.RebootRequest,
      io.mavsdk.action.ActionProto.RebootResponse> getRebootMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.RebootRequest, io.mavsdk.action.ActionProto.RebootResponse> getRebootMethod;
    if ((getRebootMethod = ActionServiceGrpc.getRebootMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getRebootMethod = ActionServiceGrpc.getRebootMethod) == null) {
          ActionServiceGrpc.getRebootMethod = getRebootMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.RebootRequest, io.mavsdk.action.ActionProto.RebootResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Reboot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.RebootRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.RebootResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRebootMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ShutdownRequest,
      io.mavsdk.action.ActionProto.ShutdownResponse> getShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Shutdown",
      requestType = io.mavsdk.action.ActionProto.ShutdownRequest.class,
      responseType = io.mavsdk.action.ActionProto.ShutdownResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ShutdownRequest,
      io.mavsdk.action.ActionProto.ShutdownResponse> getShutdownMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ShutdownRequest, io.mavsdk.action.ActionProto.ShutdownResponse> getShutdownMethod;
    if ((getShutdownMethod = ActionServiceGrpc.getShutdownMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getShutdownMethod = ActionServiceGrpc.getShutdownMethod) == null) {
          ActionServiceGrpc.getShutdownMethod = getShutdownMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.ShutdownRequest, io.mavsdk.action.ActionProto.ShutdownResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Shutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ShutdownRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ShutdownResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getShutdownMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TerminateRequest,
      io.mavsdk.action.ActionProto.TerminateResponse> getTerminateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Terminate",
      requestType = io.mavsdk.action.ActionProto.TerminateRequest.class,
      responseType = io.mavsdk.action.ActionProto.TerminateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TerminateRequest,
      io.mavsdk.action.ActionProto.TerminateResponse> getTerminateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TerminateRequest, io.mavsdk.action.ActionProto.TerminateResponse> getTerminateMethod;
    if ((getTerminateMethod = ActionServiceGrpc.getTerminateMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getTerminateMethod = ActionServiceGrpc.getTerminateMethod) == null) {
          ActionServiceGrpc.getTerminateMethod = getTerminateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.TerminateRequest, io.mavsdk.action.ActionProto.TerminateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Terminate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TerminateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TerminateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTerminateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.KillRequest,
      io.mavsdk.action.ActionProto.KillResponse> getKillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Kill",
      requestType = io.mavsdk.action.ActionProto.KillRequest.class,
      responseType = io.mavsdk.action.ActionProto.KillResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.KillRequest,
      io.mavsdk.action.ActionProto.KillResponse> getKillMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.KillRequest, io.mavsdk.action.ActionProto.KillResponse> getKillMethod;
    if ((getKillMethod = ActionServiceGrpc.getKillMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getKillMethod = ActionServiceGrpc.getKillMethod) == null) {
          ActionServiceGrpc.getKillMethod = getKillMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.KillRequest, io.mavsdk.action.ActionProto.KillResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Kill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.KillRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.KillResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getKillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ReturnToLaunchRequest,
      io.mavsdk.action.ActionProto.ReturnToLaunchResponse> getReturnToLaunchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReturnToLaunch",
      requestType = io.mavsdk.action.ActionProto.ReturnToLaunchRequest.class,
      responseType = io.mavsdk.action.ActionProto.ReturnToLaunchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ReturnToLaunchRequest,
      io.mavsdk.action.ActionProto.ReturnToLaunchResponse> getReturnToLaunchMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.ReturnToLaunchRequest, io.mavsdk.action.ActionProto.ReturnToLaunchResponse> getReturnToLaunchMethod;
    if ((getReturnToLaunchMethod = ActionServiceGrpc.getReturnToLaunchMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getReturnToLaunchMethod = ActionServiceGrpc.getReturnToLaunchMethod) == null) {
          ActionServiceGrpc.getReturnToLaunchMethod = getReturnToLaunchMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.ReturnToLaunchRequest, io.mavsdk.action.ActionProto.ReturnToLaunchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReturnToLaunch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ReturnToLaunchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.ReturnToLaunchResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getReturnToLaunchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GotoLocationRequest,
      io.mavsdk.action.ActionProto.GotoLocationResponse> getGotoLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GotoLocation",
      requestType = io.mavsdk.action.ActionProto.GotoLocationRequest.class,
      responseType = io.mavsdk.action.ActionProto.GotoLocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GotoLocationRequest,
      io.mavsdk.action.ActionProto.GotoLocationResponse> getGotoLocationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GotoLocationRequest, io.mavsdk.action.ActionProto.GotoLocationResponse> getGotoLocationMethod;
    if ((getGotoLocationMethod = ActionServiceGrpc.getGotoLocationMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getGotoLocationMethod = ActionServiceGrpc.getGotoLocationMethod) == null) {
          ActionServiceGrpc.getGotoLocationMethod = getGotoLocationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.GotoLocationRequest, io.mavsdk.action.ActionProto.GotoLocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GotoLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GotoLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GotoLocationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGotoLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.DoOrbitRequest,
      io.mavsdk.action.ActionProto.DoOrbitResponse> getDoOrbitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoOrbit",
      requestType = io.mavsdk.action.ActionProto.DoOrbitRequest.class,
      responseType = io.mavsdk.action.ActionProto.DoOrbitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.DoOrbitRequest,
      io.mavsdk.action.ActionProto.DoOrbitResponse> getDoOrbitMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.DoOrbitRequest, io.mavsdk.action.ActionProto.DoOrbitResponse> getDoOrbitMethod;
    if ((getDoOrbitMethod = ActionServiceGrpc.getDoOrbitMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getDoOrbitMethod = ActionServiceGrpc.getDoOrbitMethod) == null) {
          ActionServiceGrpc.getDoOrbitMethod = getDoOrbitMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.DoOrbitRequest, io.mavsdk.action.ActionProto.DoOrbitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoOrbit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.DoOrbitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.DoOrbitResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDoOrbitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.HoldRequest,
      io.mavsdk.action.ActionProto.HoldResponse> getHoldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hold",
      requestType = io.mavsdk.action.ActionProto.HoldRequest.class,
      responseType = io.mavsdk.action.ActionProto.HoldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.HoldRequest,
      io.mavsdk.action.ActionProto.HoldResponse> getHoldMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.HoldRequest, io.mavsdk.action.ActionProto.HoldResponse> getHoldMethod;
    if ((getHoldMethod = ActionServiceGrpc.getHoldMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getHoldMethod = ActionServiceGrpc.getHoldMethod) == null) {
          ActionServiceGrpc.getHoldMethod = getHoldMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.HoldRequest, io.mavsdk.action.ActionProto.HoldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Hold"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.HoldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.HoldResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getHoldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetActuatorRequest,
      io.mavsdk.action.ActionProto.SetActuatorResponse> getSetActuatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetActuator",
      requestType = io.mavsdk.action.ActionProto.SetActuatorRequest.class,
      responseType = io.mavsdk.action.ActionProto.SetActuatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetActuatorRequest,
      io.mavsdk.action.ActionProto.SetActuatorResponse> getSetActuatorMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetActuatorRequest, io.mavsdk.action.ActionProto.SetActuatorResponse> getSetActuatorMethod;
    if ((getSetActuatorMethod = ActionServiceGrpc.getSetActuatorMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getSetActuatorMethod = ActionServiceGrpc.getSetActuatorMethod) == null) {
          ActionServiceGrpc.getSetActuatorMethod = getSetActuatorMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.SetActuatorRequest, io.mavsdk.action.ActionProto.SetActuatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetActuator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetActuatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetActuatorResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetActuatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TransitionToFixedwingRequest,
      io.mavsdk.action.ActionProto.TransitionToFixedwingResponse> getTransitionToFixedwingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransitionToFixedwing",
      requestType = io.mavsdk.action.ActionProto.TransitionToFixedwingRequest.class,
      responseType = io.mavsdk.action.ActionProto.TransitionToFixedwingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TransitionToFixedwingRequest,
      io.mavsdk.action.ActionProto.TransitionToFixedwingResponse> getTransitionToFixedwingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TransitionToFixedwingRequest, io.mavsdk.action.ActionProto.TransitionToFixedwingResponse> getTransitionToFixedwingMethod;
    if ((getTransitionToFixedwingMethod = ActionServiceGrpc.getTransitionToFixedwingMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getTransitionToFixedwingMethod = ActionServiceGrpc.getTransitionToFixedwingMethod) == null) {
          ActionServiceGrpc.getTransitionToFixedwingMethod = getTransitionToFixedwingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.TransitionToFixedwingRequest, io.mavsdk.action.ActionProto.TransitionToFixedwingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransitionToFixedwing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TransitionToFixedwingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TransitionToFixedwingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTransitionToFixedwingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TransitionToMulticopterRequest,
      io.mavsdk.action.ActionProto.TransitionToMulticopterResponse> getTransitionToMulticopterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransitionToMulticopter",
      requestType = io.mavsdk.action.ActionProto.TransitionToMulticopterRequest.class,
      responseType = io.mavsdk.action.ActionProto.TransitionToMulticopterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TransitionToMulticopterRequest,
      io.mavsdk.action.ActionProto.TransitionToMulticopterResponse> getTransitionToMulticopterMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.TransitionToMulticopterRequest, io.mavsdk.action.ActionProto.TransitionToMulticopterResponse> getTransitionToMulticopterMethod;
    if ((getTransitionToMulticopterMethod = ActionServiceGrpc.getTransitionToMulticopterMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getTransitionToMulticopterMethod = ActionServiceGrpc.getTransitionToMulticopterMethod) == null) {
          ActionServiceGrpc.getTransitionToMulticopterMethod = getTransitionToMulticopterMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.TransitionToMulticopterRequest, io.mavsdk.action.ActionProto.TransitionToMulticopterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransitionToMulticopter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TransitionToMulticopterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.TransitionToMulticopterResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTransitionToMulticopterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest,
      io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse> getGetTakeoffAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTakeoffAltitude",
      requestType = io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest.class,
      responseType = io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest,
      io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse> getGetTakeoffAltitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest, io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse> getGetTakeoffAltitudeMethod;
    if ((getGetTakeoffAltitudeMethod = ActionServiceGrpc.getGetTakeoffAltitudeMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getGetTakeoffAltitudeMethod = ActionServiceGrpc.getGetTakeoffAltitudeMethod) == null) {
          ActionServiceGrpc.getGetTakeoffAltitudeMethod = getGetTakeoffAltitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest, io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTakeoffAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTakeoffAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest,
      io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse> getSetTakeoffAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTakeoffAltitude",
      requestType = io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest.class,
      responseType = io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest,
      io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse> getSetTakeoffAltitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest, io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse> getSetTakeoffAltitudeMethod;
    if ((getSetTakeoffAltitudeMethod = ActionServiceGrpc.getSetTakeoffAltitudeMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getSetTakeoffAltitudeMethod = ActionServiceGrpc.getSetTakeoffAltitudeMethod) == null) {
          ActionServiceGrpc.getSetTakeoffAltitudeMethod = getSetTakeoffAltitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest, io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTakeoffAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTakeoffAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetMaximumSpeedRequest,
      io.mavsdk.action.ActionProto.GetMaximumSpeedResponse> getGetMaximumSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMaximumSpeed",
      requestType = io.mavsdk.action.ActionProto.GetMaximumSpeedRequest.class,
      responseType = io.mavsdk.action.ActionProto.GetMaximumSpeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetMaximumSpeedRequest,
      io.mavsdk.action.ActionProto.GetMaximumSpeedResponse> getGetMaximumSpeedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetMaximumSpeedRequest, io.mavsdk.action.ActionProto.GetMaximumSpeedResponse> getGetMaximumSpeedMethod;
    if ((getGetMaximumSpeedMethod = ActionServiceGrpc.getGetMaximumSpeedMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getGetMaximumSpeedMethod = ActionServiceGrpc.getGetMaximumSpeedMethod) == null) {
          ActionServiceGrpc.getGetMaximumSpeedMethod = getGetMaximumSpeedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.GetMaximumSpeedRequest, io.mavsdk.action.ActionProto.GetMaximumSpeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMaximumSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GetMaximumSpeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GetMaximumSpeedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetMaximumSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetMaximumSpeedRequest,
      io.mavsdk.action.ActionProto.SetMaximumSpeedResponse> getSetMaximumSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMaximumSpeed",
      requestType = io.mavsdk.action.ActionProto.SetMaximumSpeedRequest.class,
      responseType = io.mavsdk.action.ActionProto.SetMaximumSpeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetMaximumSpeedRequest,
      io.mavsdk.action.ActionProto.SetMaximumSpeedResponse> getSetMaximumSpeedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetMaximumSpeedRequest, io.mavsdk.action.ActionProto.SetMaximumSpeedResponse> getSetMaximumSpeedMethod;
    if ((getSetMaximumSpeedMethod = ActionServiceGrpc.getSetMaximumSpeedMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getSetMaximumSpeedMethod = ActionServiceGrpc.getSetMaximumSpeedMethod) == null) {
          ActionServiceGrpc.getSetMaximumSpeedMethod = getSetMaximumSpeedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.SetMaximumSpeedRequest, io.mavsdk.action.ActionProto.SetMaximumSpeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMaximumSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetMaximumSpeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetMaximumSpeedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetMaximumSpeedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest,
      io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse> getGetReturnToLaunchAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReturnToLaunchAltitude",
      requestType = io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest.class,
      responseType = io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest,
      io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse> getGetReturnToLaunchAltitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest, io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse> getGetReturnToLaunchAltitudeMethod;
    if ((getGetReturnToLaunchAltitudeMethod = ActionServiceGrpc.getGetReturnToLaunchAltitudeMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getGetReturnToLaunchAltitudeMethod = ActionServiceGrpc.getGetReturnToLaunchAltitudeMethod) == null) {
          ActionServiceGrpc.getGetReturnToLaunchAltitudeMethod = getGetReturnToLaunchAltitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest, io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReturnToLaunchAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetReturnToLaunchAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest,
      io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse> getSetReturnToLaunchAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetReturnToLaunchAltitude",
      requestType = io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest.class,
      responseType = io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest,
      io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse> getSetReturnToLaunchAltitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest, io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse> getSetReturnToLaunchAltitudeMethod;
    if ((getSetReturnToLaunchAltitudeMethod = ActionServiceGrpc.getSetReturnToLaunchAltitudeMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getSetReturnToLaunchAltitudeMethod = ActionServiceGrpc.getSetReturnToLaunchAltitudeMethod) == null) {
          ActionServiceGrpc.getSetReturnToLaunchAltitudeMethod = getSetReturnToLaunchAltitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest, io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetReturnToLaunchAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetReturnToLaunchAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetCurrentSpeedRequest,
      io.mavsdk.action.ActionProto.SetCurrentSpeedResponse> getSetCurrentSpeedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCurrentSpeed",
      requestType = io.mavsdk.action.ActionProto.SetCurrentSpeedRequest.class,
      responseType = io.mavsdk.action.ActionProto.SetCurrentSpeedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetCurrentSpeedRequest,
      io.mavsdk.action.ActionProto.SetCurrentSpeedResponse> getSetCurrentSpeedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.action.ActionProto.SetCurrentSpeedRequest, io.mavsdk.action.ActionProto.SetCurrentSpeedResponse> getSetCurrentSpeedMethod;
    if ((getSetCurrentSpeedMethod = ActionServiceGrpc.getSetCurrentSpeedMethod) == null) {
      synchronized (ActionServiceGrpc.class) {
        if ((getSetCurrentSpeedMethod = ActionServiceGrpc.getSetCurrentSpeedMethod) == null) {
          ActionServiceGrpc.getSetCurrentSpeedMethod = getSetCurrentSpeedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.action.ActionProto.SetCurrentSpeedRequest, io.mavsdk.action.ActionProto.SetCurrentSpeedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCurrentSpeed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetCurrentSpeedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.action.ActionProto.SetCurrentSpeedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetCurrentSpeedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ActionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActionServiceStub>() {
        @java.lang.Override
        public ActionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActionServiceStub(channel, callOptions);
        }
      };
    return ActionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ActionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActionServiceBlockingStub>() {
        @java.lang.Override
        public ActionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActionServiceBlockingStub(channel, callOptions);
        }
      };
    return ActionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ActionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ActionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ActionServiceFutureStub>() {
        @java.lang.Override
        public ActionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ActionServiceFutureStub(channel, callOptions);
        }
      };
    return ActionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable simple actions such as arming, taking off, and landing.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Send command to arm the drone.
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    default void arm(io.mavsdk.action.ActionProto.ArmRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ArmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to force-arm the drone without any checks.
     * Attention: this is not to be used for normal flying but only bench tests!
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    default void armForce(io.mavsdk.action.ActionProto.ArmForceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ArmForceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getArmForceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to disarm the drone.
     * This will disarm a drone that considers itself landed. If flying, the drone should
     * reject the disarm command. Disarming means that all motors will stop.
     * </pre>
     */
    default void disarm(io.mavsdk.action.ActionProto.DisarmRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.DisarmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisarmMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to take off and hover.
     * This switches the drone into position control mode and commands
     * it to take off and hover at the takeoff altitude.
     * Note that the vehicle must be armed before it can take off.
     * </pre>
     */
    default void takeoff(io.mavsdk.action.ActionProto.TakeoffRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TakeoffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakeoffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to land at the current position.
     * This switches the drone to 'Land' flight mode.
     * </pre>
     */
    default void land(io.mavsdk.action.ActionProto.LandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.LandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to reboot the drone components.
     * This will reboot the autopilot, companion computer, camera and gimbal.
     * </pre>
     */
    default void reboot(io.mavsdk.action.ActionProto.RebootRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.RebootResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRebootMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to shut down the drone components.
     * This will shut down the autopilot, onboard computer, camera and gimbal.
     * This command should only be used when the autopilot is disarmed and autopilots commonly
     * reject it if they are not already ready to shut down.
     * </pre>
     */
    default void shutdown(io.mavsdk.action.ActionProto.ShutdownRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ShutdownResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShutdownMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to terminate the drone.
     * This will run the terminate routine as configured on the drone (e.g. disarm and open the parachute).
     * </pre>
     */
    default void terminate(io.mavsdk.action.ActionProto.TerminateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TerminateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to kill the drone.
     * This will disarm a drone irrespective of whether it is landed or flying.
     * Note that the drone will fall out of the sky if this command is used while flying.
     * </pre>
     */
    default void kill(io.mavsdk.action.ActionProto.KillRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.KillResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to return to the launch (takeoff) position and land.
     * This switches the drone into [Return mode](https://docs.px4.io/master/en/flight_modes/return.html) which
     * generally means it will rise up to a certain altitude to clear any obstacles before heading
     * back to the launch (takeoff) position and land there.
     * </pre>
     */
    default void returnToLaunch(io.mavsdk.action.ActionProto.ReturnToLaunchRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ReturnToLaunchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReturnToLaunchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to move the vehicle to a specific global position.
     * The latitude and longitude are given in degrees (WGS84 frame) and the altitude
     * in meters AMSL (above mean sea level).
     * The yaw angle is in degrees (frame is NED, 0 is North, positive is clockwise).
     * </pre>
     */
    default void gotoLocation(io.mavsdk.action.ActionProto.GotoLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GotoLocationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGotoLocationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command do orbit to the drone.
     * This will run the orbit routine with the given parameters.
     * </pre>
     */
    default void doOrbit(io.mavsdk.action.ActionProto.DoOrbitRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.DoOrbitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoOrbitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to hold position (a.k.a. "Loiter").
     * Sends a command to drone to change to Hold flight mode, causing the
     * vehicle to stop and maintain its current GPS position and altitude.
     * Note: this command is specific to the PX4 Autopilot flight stack as
     * it implies a change to a PX4-specific mode.
     * </pre>
     */
    default void hold(io.mavsdk.action.ActionProto.HoldRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.HoldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHoldMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to set the value of an actuator.
     * Note that the index of the actuator starts at 1 and that the value goes from -1 to 1.
     * </pre>
     */
    default void setActuator(io.mavsdk.action.ActionProto.SetActuatorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetActuatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetActuatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to transition the drone to fixedwing.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in fixedwing mode.
     * </pre>
     */
    default void transitionToFixedwing(io.mavsdk.action.ActionProto.TransitionToFixedwingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TransitionToFixedwingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransitionToFixedwingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send command to transition the drone to multicopter.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in multicopter mode.
     * </pre>
     */
    default void transitionToMulticopter(io.mavsdk.action.ActionProto.TransitionToMulticopterRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TransitionToMulticopterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransitionToMulticopterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the takeoff altitude (in meters above ground).
     * </pre>
     */
    default void getTakeoffAltitude(io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTakeoffAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set takeoff altitude (in meters above ground).
     * </pre>
     */
    default void setTakeoffAltitude(io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTakeoffAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the vehicle maximum speed (in metres/second).
     * </pre>
     */
    default void getMaximumSpeed(io.mavsdk.action.ActionProto.GetMaximumSpeedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetMaximumSpeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMaximumSpeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set vehicle maximum speed (in metres/second).
     * </pre>
     */
    default void setMaximumSpeed(io.mavsdk.action.ActionProto.SetMaximumSpeedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetMaximumSpeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetMaximumSpeedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the return to launch minimum return altitude (in meters).
     * </pre>
     */
    default void getReturnToLaunchAltitude(io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReturnToLaunchAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the return to launch minimum return altitude (in meters).
     * </pre>
     */
    default void setReturnToLaunchAltitude(io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetReturnToLaunchAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set current speed.
     * This will set the speed during a mission, reposition, and similar.
     * It is ephemeral, so not stored on the drone and does not survive a reboot.
     * </pre>
     */
    default void setCurrentSpeed(io.mavsdk.action.ActionProto.SetCurrentSpeedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetCurrentSpeedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCurrentSpeedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ActionService.
   * <pre>
   * Enable simple actions such as arming, taking off, and landing.
   * </pre>
   */
  public static abstract class ActionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ActionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ActionService.
   * <pre>
   * Enable simple actions such as arming, taking off, and landing.
   * </pre>
   */
  public static final class ActionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ActionServiceStub> {
    private ActionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send command to arm the drone.
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    public void arm(io.mavsdk.action.ActionProto.ArmRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ArmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to force-arm the drone without any checks.
     * Attention: this is not to be used for normal flying but only bench tests!
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    public void armForce(io.mavsdk.action.ActionProto.ArmForceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ArmForceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getArmForceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to disarm the drone.
     * This will disarm a drone that considers itself landed. If flying, the drone should
     * reject the disarm command. Disarming means that all motors will stop.
     * </pre>
     */
    public void disarm(io.mavsdk.action.ActionProto.DisarmRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.DisarmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to take off and hover.
     * This switches the drone into position control mode and commands
     * it to take off and hover at the takeoff altitude.
     * Note that the vehicle must be armed before it can take off.
     * </pre>
     */
    public void takeoff(io.mavsdk.action.ActionProto.TakeoffRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TakeoffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakeoffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to land at the current position.
     * This switches the drone to 'Land' flight mode.
     * </pre>
     */
    public void land(io.mavsdk.action.ActionProto.LandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.LandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to reboot the drone components.
     * This will reboot the autopilot, companion computer, camera and gimbal.
     * </pre>
     */
    public void reboot(io.mavsdk.action.ActionProto.RebootRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.RebootResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to shut down the drone components.
     * This will shut down the autopilot, onboard computer, camera and gimbal.
     * This command should only be used when the autopilot is disarmed and autopilots commonly
     * reject it if they are not already ready to shut down.
     * </pre>
     */
    public void shutdown(io.mavsdk.action.ActionProto.ShutdownRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ShutdownResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to terminate the drone.
     * This will run the terminate routine as configured on the drone (e.g. disarm and open the parachute).
     * </pre>
     */
    public void terminate(io.mavsdk.action.ActionProto.TerminateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TerminateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to kill the drone.
     * This will disarm a drone irrespective of whether it is landed or flying.
     * Note that the drone will fall out of the sky if this command is used while flying.
     * </pre>
     */
    public void kill(io.mavsdk.action.ActionProto.KillRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.KillResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to return to the launch (takeoff) position and land.
     * This switches the drone into [Return mode](https://docs.px4.io/master/en/flight_modes/return.html) which
     * generally means it will rise up to a certain altitude to clear any obstacles before heading
     * back to the launch (takeoff) position and land there.
     * </pre>
     */
    public void returnToLaunch(io.mavsdk.action.ActionProto.ReturnToLaunchRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ReturnToLaunchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReturnToLaunchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to move the vehicle to a specific global position.
     * The latitude and longitude are given in degrees (WGS84 frame) and the altitude
     * in meters AMSL (above mean sea level).
     * The yaw angle is in degrees (frame is NED, 0 is North, positive is clockwise).
     * </pre>
     */
    public void gotoLocation(io.mavsdk.action.ActionProto.GotoLocationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GotoLocationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGotoLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command do orbit to the drone.
     * This will run the orbit routine with the given parameters.
     * </pre>
     */
    public void doOrbit(io.mavsdk.action.ActionProto.DoOrbitRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.DoOrbitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoOrbitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to hold position (a.k.a. "Loiter").
     * Sends a command to drone to change to Hold flight mode, causing the
     * vehicle to stop and maintain its current GPS position and altitude.
     * Note: this command is specific to the PX4 Autopilot flight stack as
     * it implies a change to a PX4-specific mode.
     * </pre>
     */
    public void hold(io.mavsdk.action.ActionProto.HoldRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.HoldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHoldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to set the value of an actuator.
     * Note that the index of the actuator starts at 1 and that the value goes from -1 to 1.
     * </pre>
     */
    public void setActuator(io.mavsdk.action.ActionProto.SetActuatorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetActuatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetActuatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to transition the drone to fixedwing.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in fixedwing mode.
     * </pre>
     */
    public void transitionToFixedwing(io.mavsdk.action.ActionProto.TransitionToFixedwingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TransitionToFixedwingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransitionToFixedwingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send command to transition the drone to multicopter.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in multicopter mode.
     * </pre>
     */
    public void transitionToMulticopter(io.mavsdk.action.ActionProto.TransitionToMulticopterRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TransitionToMulticopterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransitionToMulticopterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the takeoff altitude (in meters above ground).
     * </pre>
     */
    public void getTakeoffAltitude(io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTakeoffAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set takeoff altitude (in meters above ground).
     * </pre>
     */
    public void setTakeoffAltitude(io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTakeoffAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the vehicle maximum speed (in metres/second).
     * </pre>
     */
    public void getMaximumSpeed(io.mavsdk.action.ActionProto.GetMaximumSpeedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetMaximumSpeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMaximumSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set vehicle maximum speed (in metres/second).
     * </pre>
     */
    public void setMaximumSpeed(io.mavsdk.action.ActionProto.SetMaximumSpeedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetMaximumSpeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetMaximumSpeedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the return to launch minimum return altitude (in meters).
     * </pre>
     */
    public void getReturnToLaunchAltitude(io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReturnToLaunchAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the return to launch minimum return altitude (in meters).
     * </pre>
     */
    public void setReturnToLaunchAltitude(io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetReturnToLaunchAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set current speed.
     * This will set the speed during a mission, reposition, and similar.
     * It is ephemeral, so not stored on the drone and does not survive a reboot.
     * </pre>
     */
    public void setCurrentSpeed(io.mavsdk.action.ActionProto.SetCurrentSpeedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetCurrentSpeedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCurrentSpeedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ActionService.
   * <pre>
   * Enable simple actions such as arming, taking off, and landing.
   * </pre>
   */
  public static final class ActionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ActionServiceBlockingStub> {
    private ActionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send command to arm the drone.
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    public io.mavsdk.action.ActionProto.ArmResponse arm(io.mavsdk.action.ActionProto.ArmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to force-arm the drone without any checks.
     * Attention: this is not to be used for normal flying but only bench tests!
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    public io.mavsdk.action.ActionProto.ArmForceResponse armForce(io.mavsdk.action.ActionProto.ArmForceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getArmForceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to disarm the drone.
     * This will disarm a drone that considers itself landed. If flying, the drone should
     * reject the disarm command. Disarming means that all motors will stop.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.DisarmResponse disarm(io.mavsdk.action.ActionProto.DisarmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisarmMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to take off and hover.
     * This switches the drone into position control mode and commands
     * it to take off and hover at the takeoff altitude.
     * Note that the vehicle must be armed before it can take off.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.TakeoffResponse takeoff(io.mavsdk.action.ActionProto.TakeoffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakeoffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to land at the current position.
     * This switches the drone to 'Land' flight mode.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.LandResponse land(io.mavsdk.action.ActionProto.LandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to reboot the drone components.
     * This will reboot the autopilot, companion computer, camera and gimbal.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.RebootResponse reboot(io.mavsdk.action.ActionProto.RebootRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRebootMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to shut down the drone components.
     * This will shut down the autopilot, onboard computer, camera and gimbal.
     * This command should only be used when the autopilot is disarmed and autopilots commonly
     * reject it if they are not already ready to shut down.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.ShutdownResponse shutdown(io.mavsdk.action.ActionProto.ShutdownRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShutdownMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to terminate the drone.
     * This will run the terminate routine as configured on the drone (e.g. disarm and open the parachute).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.TerminateResponse terminate(io.mavsdk.action.ActionProto.TerminateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to kill the drone.
     * This will disarm a drone irrespective of whether it is landed or flying.
     * Note that the drone will fall out of the sky if this command is used while flying.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.KillResponse kill(io.mavsdk.action.ActionProto.KillRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to return to the launch (takeoff) position and land.
     * This switches the drone into [Return mode](https://docs.px4.io/master/en/flight_modes/return.html) which
     * generally means it will rise up to a certain altitude to clear any obstacles before heading
     * back to the launch (takeoff) position and land there.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.ReturnToLaunchResponse returnToLaunch(io.mavsdk.action.ActionProto.ReturnToLaunchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReturnToLaunchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to move the vehicle to a specific global position.
     * The latitude and longitude are given in degrees (WGS84 frame) and the altitude
     * in meters AMSL (above mean sea level).
     * The yaw angle is in degrees (frame is NED, 0 is North, positive is clockwise).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.GotoLocationResponse gotoLocation(io.mavsdk.action.ActionProto.GotoLocationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGotoLocationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command do orbit to the drone.
     * This will run the orbit routine with the given parameters.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.DoOrbitResponse doOrbit(io.mavsdk.action.ActionProto.DoOrbitRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoOrbitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to hold position (a.k.a. "Loiter").
     * Sends a command to drone to change to Hold flight mode, causing the
     * vehicle to stop and maintain its current GPS position and altitude.
     * Note: this command is specific to the PX4 Autopilot flight stack as
     * it implies a change to a PX4-specific mode.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.HoldResponse hold(io.mavsdk.action.ActionProto.HoldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHoldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to set the value of an actuator.
     * Note that the index of the actuator starts at 1 and that the value goes from -1 to 1.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.SetActuatorResponse setActuator(io.mavsdk.action.ActionProto.SetActuatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetActuatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to transition the drone to fixedwing.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in fixedwing mode.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.TransitionToFixedwingResponse transitionToFixedwing(io.mavsdk.action.ActionProto.TransitionToFixedwingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransitionToFixedwingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send command to transition the drone to multicopter.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in multicopter mode.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.TransitionToMulticopterResponse transitionToMulticopter(io.mavsdk.action.ActionProto.TransitionToMulticopterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransitionToMulticopterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the takeoff altitude (in meters above ground).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse getTakeoffAltitude(io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTakeoffAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set takeoff altitude (in meters above ground).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse setTakeoffAltitude(io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTakeoffAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the vehicle maximum speed (in metres/second).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.GetMaximumSpeedResponse getMaximumSpeed(io.mavsdk.action.ActionProto.GetMaximumSpeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMaximumSpeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set vehicle maximum speed (in metres/second).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.SetMaximumSpeedResponse setMaximumSpeed(io.mavsdk.action.ActionProto.SetMaximumSpeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetMaximumSpeedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the return to launch minimum return altitude (in meters).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse getReturnToLaunchAltitude(io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReturnToLaunchAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the return to launch minimum return altitude (in meters).
     * </pre>
     */
    public io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse setReturnToLaunchAltitude(io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetReturnToLaunchAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set current speed.
     * This will set the speed during a mission, reposition, and similar.
     * It is ephemeral, so not stored on the drone and does not survive a reboot.
     * </pre>
     */
    public io.mavsdk.action.ActionProto.SetCurrentSpeedResponse setCurrentSpeed(io.mavsdk.action.ActionProto.SetCurrentSpeedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCurrentSpeedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ActionService.
   * <pre>
   * Enable simple actions such as arming, taking off, and landing.
   * </pre>
   */
  public static final class ActionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ActionServiceFutureStub> {
    private ActionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ActionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ActionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send command to arm the drone.
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.ArmResponse> arm(
        io.mavsdk.action.ActionProto.ArmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to force-arm the drone without any checks.
     * Attention: this is not to be used for normal flying but only bench tests!
     * Arming a drone normally causes motors to spin at idle.
     * Before arming take all safety precautions and stand clear of the drone!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.ArmForceResponse> armForce(
        io.mavsdk.action.ActionProto.ArmForceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getArmForceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to disarm the drone.
     * This will disarm a drone that considers itself landed. If flying, the drone should
     * reject the disarm command. Disarming means that all motors will stop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.DisarmResponse> disarm(
        io.mavsdk.action.ActionProto.DisarmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisarmMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to take off and hover.
     * This switches the drone into position control mode and commands
     * it to take off and hover at the takeoff altitude.
     * Note that the vehicle must be armed before it can take off.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.TakeoffResponse> takeoff(
        io.mavsdk.action.ActionProto.TakeoffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakeoffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to land at the current position.
     * This switches the drone to 'Land' flight mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.LandResponse> land(
        io.mavsdk.action.ActionProto.LandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to reboot the drone components.
     * This will reboot the autopilot, companion computer, camera and gimbal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.RebootResponse> reboot(
        io.mavsdk.action.ActionProto.RebootRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRebootMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to shut down the drone components.
     * This will shut down the autopilot, onboard computer, camera and gimbal.
     * This command should only be used when the autopilot is disarmed and autopilots commonly
     * reject it if they are not already ready to shut down.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.ShutdownResponse> shutdown(
        io.mavsdk.action.ActionProto.ShutdownRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to terminate the drone.
     * This will run the terminate routine as configured on the drone (e.g. disarm and open the parachute).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.TerminateResponse> terminate(
        io.mavsdk.action.ActionProto.TerminateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to kill the drone.
     * This will disarm a drone irrespective of whether it is landed or flying.
     * Note that the drone will fall out of the sky if this command is used while flying.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.KillResponse> kill(
        io.mavsdk.action.ActionProto.KillRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to return to the launch (takeoff) position and land.
     * This switches the drone into [Return mode](https://docs.px4.io/master/en/flight_modes/return.html) which
     * generally means it will rise up to a certain altitude to clear any obstacles before heading
     * back to the launch (takeoff) position and land there.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.ReturnToLaunchResponse> returnToLaunch(
        io.mavsdk.action.ActionProto.ReturnToLaunchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReturnToLaunchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to move the vehicle to a specific global position.
     * The latitude and longitude are given in degrees (WGS84 frame) and the altitude
     * in meters AMSL (above mean sea level).
     * The yaw angle is in degrees (frame is NED, 0 is North, positive is clockwise).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.GotoLocationResponse> gotoLocation(
        io.mavsdk.action.ActionProto.GotoLocationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGotoLocationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command do orbit to the drone.
     * This will run the orbit routine with the given parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.DoOrbitResponse> doOrbit(
        io.mavsdk.action.ActionProto.DoOrbitRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoOrbitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to hold position (a.k.a. "Loiter").
     * Sends a command to drone to change to Hold flight mode, causing the
     * vehicle to stop and maintain its current GPS position and altitude.
     * Note: this command is specific to the PX4 Autopilot flight stack as
     * it implies a change to a PX4-specific mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.HoldResponse> hold(
        io.mavsdk.action.ActionProto.HoldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHoldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to set the value of an actuator.
     * Note that the index of the actuator starts at 1 and that the value goes from -1 to 1.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.SetActuatorResponse> setActuator(
        io.mavsdk.action.ActionProto.SetActuatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetActuatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to transition the drone to fixedwing.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in fixedwing mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.TransitionToFixedwingResponse> transitionToFixedwing(
        io.mavsdk.action.ActionProto.TransitionToFixedwingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransitionToFixedwingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send command to transition the drone to multicopter.
     * The associated action will only be executed for VTOL vehicles (on other vehicle types the
     * command will fail). The command will succeed if called when the vehicle
     * is already in multicopter mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.TransitionToMulticopterResponse> transitionToMulticopter(
        io.mavsdk.action.ActionProto.TransitionToMulticopterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransitionToMulticopterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the takeoff altitude (in meters above ground).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse> getTakeoffAltitude(
        io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTakeoffAltitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set takeoff altitude (in meters above ground).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse> setTakeoffAltitude(
        io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTakeoffAltitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the vehicle maximum speed (in metres/second).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.GetMaximumSpeedResponse> getMaximumSpeed(
        io.mavsdk.action.ActionProto.GetMaximumSpeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMaximumSpeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set vehicle maximum speed (in metres/second).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.SetMaximumSpeedResponse> setMaximumSpeed(
        io.mavsdk.action.ActionProto.SetMaximumSpeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetMaximumSpeedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the return to launch minimum return altitude (in meters).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse> getReturnToLaunchAltitude(
        io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReturnToLaunchAltitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the return to launch minimum return altitude (in meters).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse> setReturnToLaunchAltitude(
        io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetReturnToLaunchAltitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set current speed.
     * This will set the speed during a mission, reposition, and similar.
     * It is ephemeral, so not stored on the drone and does not survive a reboot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.action.ActionProto.SetCurrentSpeedResponse> setCurrentSpeed(
        io.mavsdk.action.ActionProto.SetCurrentSpeedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCurrentSpeedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ARM = 0;
  private static final int METHODID_ARM_FORCE = 1;
  private static final int METHODID_DISARM = 2;
  private static final int METHODID_TAKEOFF = 3;
  private static final int METHODID_LAND = 4;
  private static final int METHODID_REBOOT = 5;
  private static final int METHODID_SHUTDOWN = 6;
  private static final int METHODID_TERMINATE = 7;
  private static final int METHODID_KILL = 8;
  private static final int METHODID_RETURN_TO_LAUNCH = 9;
  private static final int METHODID_GOTO_LOCATION = 10;
  private static final int METHODID_DO_ORBIT = 11;
  private static final int METHODID_HOLD = 12;
  private static final int METHODID_SET_ACTUATOR = 13;
  private static final int METHODID_TRANSITION_TO_FIXEDWING = 14;
  private static final int METHODID_TRANSITION_TO_MULTICOPTER = 15;
  private static final int METHODID_GET_TAKEOFF_ALTITUDE = 16;
  private static final int METHODID_SET_TAKEOFF_ALTITUDE = 17;
  private static final int METHODID_GET_MAXIMUM_SPEED = 18;
  private static final int METHODID_SET_MAXIMUM_SPEED = 19;
  private static final int METHODID_GET_RETURN_TO_LAUNCH_ALTITUDE = 20;
  private static final int METHODID_SET_RETURN_TO_LAUNCH_ALTITUDE = 21;
  private static final int METHODID_SET_CURRENT_SPEED = 22;

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
        case METHODID_ARM:
          serviceImpl.arm((io.mavsdk.action.ActionProto.ArmRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ArmResponse>) responseObserver);
          break;
        case METHODID_ARM_FORCE:
          serviceImpl.armForce((io.mavsdk.action.ActionProto.ArmForceRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ArmForceResponse>) responseObserver);
          break;
        case METHODID_DISARM:
          serviceImpl.disarm((io.mavsdk.action.ActionProto.DisarmRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.DisarmResponse>) responseObserver);
          break;
        case METHODID_TAKEOFF:
          serviceImpl.takeoff((io.mavsdk.action.ActionProto.TakeoffRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TakeoffResponse>) responseObserver);
          break;
        case METHODID_LAND:
          serviceImpl.land((io.mavsdk.action.ActionProto.LandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.LandResponse>) responseObserver);
          break;
        case METHODID_REBOOT:
          serviceImpl.reboot((io.mavsdk.action.ActionProto.RebootRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.RebootResponse>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((io.mavsdk.action.ActionProto.ShutdownRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ShutdownResponse>) responseObserver);
          break;
        case METHODID_TERMINATE:
          serviceImpl.terminate((io.mavsdk.action.ActionProto.TerminateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TerminateResponse>) responseObserver);
          break;
        case METHODID_KILL:
          serviceImpl.kill((io.mavsdk.action.ActionProto.KillRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.KillResponse>) responseObserver);
          break;
        case METHODID_RETURN_TO_LAUNCH:
          serviceImpl.returnToLaunch((io.mavsdk.action.ActionProto.ReturnToLaunchRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.ReturnToLaunchResponse>) responseObserver);
          break;
        case METHODID_GOTO_LOCATION:
          serviceImpl.gotoLocation((io.mavsdk.action.ActionProto.GotoLocationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GotoLocationResponse>) responseObserver);
          break;
        case METHODID_DO_ORBIT:
          serviceImpl.doOrbit((io.mavsdk.action.ActionProto.DoOrbitRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.DoOrbitResponse>) responseObserver);
          break;
        case METHODID_HOLD:
          serviceImpl.hold((io.mavsdk.action.ActionProto.HoldRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.HoldResponse>) responseObserver);
          break;
        case METHODID_SET_ACTUATOR:
          serviceImpl.setActuator((io.mavsdk.action.ActionProto.SetActuatorRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetActuatorResponse>) responseObserver);
          break;
        case METHODID_TRANSITION_TO_FIXEDWING:
          serviceImpl.transitionToFixedwing((io.mavsdk.action.ActionProto.TransitionToFixedwingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TransitionToFixedwingResponse>) responseObserver);
          break;
        case METHODID_TRANSITION_TO_MULTICOPTER:
          serviceImpl.transitionToMulticopter((io.mavsdk.action.ActionProto.TransitionToMulticopterRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.TransitionToMulticopterResponse>) responseObserver);
          break;
        case METHODID_GET_TAKEOFF_ALTITUDE:
          serviceImpl.getTakeoffAltitude((io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse>) responseObserver);
          break;
        case METHODID_SET_TAKEOFF_ALTITUDE:
          serviceImpl.setTakeoffAltitude((io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse>) responseObserver);
          break;
        case METHODID_GET_MAXIMUM_SPEED:
          serviceImpl.getMaximumSpeed((io.mavsdk.action.ActionProto.GetMaximumSpeedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetMaximumSpeedResponse>) responseObserver);
          break;
        case METHODID_SET_MAXIMUM_SPEED:
          serviceImpl.setMaximumSpeed((io.mavsdk.action.ActionProto.SetMaximumSpeedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetMaximumSpeedResponse>) responseObserver);
          break;
        case METHODID_GET_RETURN_TO_LAUNCH_ALTITUDE:
          serviceImpl.getReturnToLaunchAltitude((io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse>) responseObserver);
          break;
        case METHODID_SET_RETURN_TO_LAUNCH_ALTITUDE:
          serviceImpl.setReturnToLaunchAltitude((io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse>) responseObserver);
          break;
        case METHODID_SET_CURRENT_SPEED:
          serviceImpl.setCurrentSpeed((io.mavsdk.action.ActionProto.SetCurrentSpeedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.action.ActionProto.SetCurrentSpeedResponse>) responseObserver);
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
          getArmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.ArmRequest,
              io.mavsdk.action.ActionProto.ArmResponse>(
                service, METHODID_ARM)))
        .addMethod(
          getArmForceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.ArmForceRequest,
              io.mavsdk.action.ActionProto.ArmForceResponse>(
                service, METHODID_ARM_FORCE)))
        .addMethod(
          getDisarmMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.DisarmRequest,
              io.mavsdk.action.ActionProto.DisarmResponse>(
                service, METHODID_DISARM)))
        .addMethod(
          getTakeoffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.TakeoffRequest,
              io.mavsdk.action.ActionProto.TakeoffResponse>(
                service, METHODID_TAKEOFF)))
        .addMethod(
          getLandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.LandRequest,
              io.mavsdk.action.ActionProto.LandResponse>(
                service, METHODID_LAND)))
        .addMethod(
          getRebootMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.RebootRequest,
              io.mavsdk.action.ActionProto.RebootResponse>(
                service, METHODID_REBOOT)))
        .addMethod(
          getShutdownMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.ShutdownRequest,
              io.mavsdk.action.ActionProto.ShutdownResponse>(
                service, METHODID_SHUTDOWN)))
        .addMethod(
          getTerminateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.TerminateRequest,
              io.mavsdk.action.ActionProto.TerminateResponse>(
                service, METHODID_TERMINATE)))
        .addMethod(
          getKillMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.KillRequest,
              io.mavsdk.action.ActionProto.KillResponse>(
                service, METHODID_KILL)))
        .addMethod(
          getReturnToLaunchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.ReturnToLaunchRequest,
              io.mavsdk.action.ActionProto.ReturnToLaunchResponse>(
                service, METHODID_RETURN_TO_LAUNCH)))
        .addMethod(
          getGotoLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.GotoLocationRequest,
              io.mavsdk.action.ActionProto.GotoLocationResponse>(
                service, METHODID_GOTO_LOCATION)))
        .addMethod(
          getDoOrbitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.DoOrbitRequest,
              io.mavsdk.action.ActionProto.DoOrbitResponse>(
                service, METHODID_DO_ORBIT)))
        .addMethod(
          getHoldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.HoldRequest,
              io.mavsdk.action.ActionProto.HoldResponse>(
                service, METHODID_HOLD)))
        .addMethod(
          getSetActuatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.SetActuatorRequest,
              io.mavsdk.action.ActionProto.SetActuatorResponse>(
                service, METHODID_SET_ACTUATOR)))
        .addMethod(
          getTransitionToFixedwingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.TransitionToFixedwingRequest,
              io.mavsdk.action.ActionProto.TransitionToFixedwingResponse>(
                service, METHODID_TRANSITION_TO_FIXEDWING)))
        .addMethod(
          getTransitionToMulticopterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.TransitionToMulticopterRequest,
              io.mavsdk.action.ActionProto.TransitionToMulticopterResponse>(
                service, METHODID_TRANSITION_TO_MULTICOPTER)))
        .addMethod(
          getGetTakeoffAltitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.GetTakeoffAltitudeRequest,
              io.mavsdk.action.ActionProto.GetTakeoffAltitudeResponse>(
                service, METHODID_GET_TAKEOFF_ALTITUDE)))
        .addMethod(
          getSetTakeoffAltitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.SetTakeoffAltitudeRequest,
              io.mavsdk.action.ActionProto.SetTakeoffAltitudeResponse>(
                service, METHODID_SET_TAKEOFF_ALTITUDE)))
        .addMethod(
          getGetMaximumSpeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.GetMaximumSpeedRequest,
              io.mavsdk.action.ActionProto.GetMaximumSpeedResponse>(
                service, METHODID_GET_MAXIMUM_SPEED)))
        .addMethod(
          getSetMaximumSpeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.SetMaximumSpeedRequest,
              io.mavsdk.action.ActionProto.SetMaximumSpeedResponse>(
                service, METHODID_SET_MAXIMUM_SPEED)))
        .addMethod(
          getGetReturnToLaunchAltitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeRequest,
              io.mavsdk.action.ActionProto.GetReturnToLaunchAltitudeResponse>(
                service, METHODID_GET_RETURN_TO_LAUNCH_ALTITUDE)))
        .addMethod(
          getSetReturnToLaunchAltitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeRequest,
              io.mavsdk.action.ActionProto.SetReturnToLaunchAltitudeResponse>(
                service, METHODID_SET_RETURN_TO_LAUNCH_ALTITUDE)))
        .addMethod(
          getSetCurrentSpeedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.action.ActionProto.SetCurrentSpeedRequest,
              io.mavsdk.action.ActionProto.SetCurrentSpeedResponse>(
                service, METHODID_SET_CURRENT_SPEED)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ActionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getArmMethod())
              .addMethod(getArmForceMethod())
              .addMethod(getDisarmMethod())
              .addMethod(getTakeoffMethod())
              .addMethod(getLandMethod())
              .addMethod(getRebootMethod())
              .addMethod(getShutdownMethod())
              .addMethod(getTerminateMethod())
              .addMethod(getKillMethod())
              .addMethod(getReturnToLaunchMethod())
              .addMethod(getGotoLocationMethod())
              .addMethod(getDoOrbitMethod())
              .addMethod(getHoldMethod())
              .addMethod(getSetActuatorMethod())
              .addMethod(getTransitionToFixedwingMethod())
              .addMethod(getTransitionToMulticopterMethod())
              .addMethod(getGetTakeoffAltitudeMethod())
              .addMethod(getSetTakeoffAltitudeMethod())
              .addMethod(getGetMaximumSpeedMethod())
              .addMethod(getSetMaximumSpeedMethod())
              .addMethod(getGetReturnToLaunchAltitudeMethod())
              .addMethod(getSetReturnToLaunchAltitudeMethod())
              .addMethod(getSetCurrentSpeedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
