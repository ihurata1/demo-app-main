package io.mavsdk.offboard;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 **
 * Control a drone with position, velocity, attitude or motor commands.
 * The module is called offboard because the commands can be sent from external sources
 * as opposed to onboard control right inside the autopilot "board".
 * Client code must specify a setpoint before starting offboard mode.
 * Mavsdk automatically sends setpoints at 20Hz (PX4 Offboard mode requires that setpoints
 * are minimally sent at 2Hz).
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/offboard/offboard.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OffboardServiceGrpc {

  private OffboardServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.offboard.OffboardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.StartRequest,
      io.mavsdk.offboard.OffboardProto.StartResponse> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = io.mavsdk.offboard.OffboardProto.StartRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.StartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.StartRequest,
      io.mavsdk.offboard.OffboardProto.StartResponse> getStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.StartRequest, io.mavsdk.offboard.OffboardProto.StartResponse> getStartMethod;
    if ((getStartMethod = OffboardServiceGrpc.getStartMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getStartMethod = OffboardServiceGrpc.getStartMethod) == null) {
          OffboardServiceGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.StartRequest, io.mavsdk.offboard.OffboardProto.StartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.StartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.StartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.StopRequest,
      io.mavsdk.offboard.OffboardProto.StopResponse> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = io.mavsdk.offboard.OffboardProto.StopRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.StopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.StopRequest,
      io.mavsdk.offboard.OffboardProto.StopResponse> getStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.StopRequest, io.mavsdk.offboard.OffboardProto.StopResponse> getStopMethod;
    if ((getStopMethod = OffboardServiceGrpc.getStopMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getStopMethod = OffboardServiceGrpc.getStopMethod) == null) {
          OffboardServiceGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.StopRequest, io.mavsdk.offboard.OffboardProto.StopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.StopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.StopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.IsActiveRequest,
      io.mavsdk.offboard.OffboardProto.IsActiveResponse> getIsActiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsActive",
      requestType = io.mavsdk.offboard.OffboardProto.IsActiveRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.IsActiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.IsActiveRequest,
      io.mavsdk.offboard.OffboardProto.IsActiveResponse> getIsActiveMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.IsActiveRequest, io.mavsdk.offboard.OffboardProto.IsActiveResponse> getIsActiveMethod;
    if ((getIsActiveMethod = OffboardServiceGrpc.getIsActiveMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getIsActiveMethod = OffboardServiceGrpc.getIsActiveMethod) == null) {
          OffboardServiceGrpc.getIsActiveMethod = getIsActiveMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.IsActiveRequest, io.mavsdk.offboard.OffboardProto.IsActiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsActive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.IsActiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.IsActiveResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsActiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAttitudeRequest,
      io.mavsdk.offboard.OffboardProto.SetAttitudeResponse> getSetAttitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAttitude",
      requestType = io.mavsdk.offboard.OffboardProto.SetAttitudeRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetAttitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAttitudeRequest,
      io.mavsdk.offboard.OffboardProto.SetAttitudeResponse> getSetAttitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAttitudeRequest, io.mavsdk.offboard.OffboardProto.SetAttitudeResponse> getSetAttitudeMethod;
    if ((getSetAttitudeMethod = OffboardServiceGrpc.getSetAttitudeMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetAttitudeMethod = OffboardServiceGrpc.getSetAttitudeMethod) == null) {
          OffboardServiceGrpc.getSetAttitudeMethod = getSetAttitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetAttitudeRequest, io.mavsdk.offboard.OffboardProto.SetAttitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAttitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetAttitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetAttitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAttitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest,
      io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse> getSetActuatorControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetActuatorControl",
      requestType = io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest,
      io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse> getSetActuatorControlMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest, io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse> getSetActuatorControlMethod;
    if ((getSetActuatorControlMethod = OffboardServiceGrpc.getSetActuatorControlMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetActuatorControlMethod = OffboardServiceGrpc.getSetActuatorControlMethod) == null) {
          OffboardServiceGrpc.getSetActuatorControlMethod = getSetActuatorControlMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest, io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetActuatorControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetActuatorControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest,
      io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse> getSetAttitudeRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAttitudeRate",
      requestType = io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest,
      io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse> getSetAttitudeRateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest, io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse> getSetAttitudeRateMethod;
    if ((getSetAttitudeRateMethod = OffboardServiceGrpc.getSetAttitudeRateMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetAttitudeRateMethod = OffboardServiceGrpc.getSetAttitudeRateMethod) == null) {
          OffboardServiceGrpc.getSetAttitudeRateMethod = getSetAttitudeRateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest, io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAttitudeRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAttitudeRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionNedRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionNedResponse> getSetPositionNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPositionNed",
      requestType = io.mavsdk.offboard.OffboardProto.SetPositionNedRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetPositionNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionNedRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionNedResponse> getSetPositionNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionNedRequest, io.mavsdk.offboard.OffboardProto.SetPositionNedResponse> getSetPositionNedMethod;
    if ((getSetPositionNedMethod = OffboardServiceGrpc.getSetPositionNedMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetPositionNedMethod = OffboardServiceGrpc.getSetPositionNedMethod) == null) {
          OffboardServiceGrpc.getSetPositionNedMethod = getSetPositionNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetPositionNedRequest, io.mavsdk.offboard.OffboardProto.SetPositionNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPositionNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPositionNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse> getSetPositionGlobalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPositionGlobal",
      requestType = io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse> getSetPositionGlobalMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest, io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse> getSetPositionGlobalMethod;
    if ((getSetPositionGlobalMethod = OffboardServiceGrpc.getSetPositionGlobalMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetPositionGlobalMethod = OffboardServiceGrpc.getSetPositionGlobalMethod) == null) {
          OffboardServiceGrpc.getSetPositionGlobalMethod = getSetPositionGlobalMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest, io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPositionGlobal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPositionGlobalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest,
      io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse> getSetVelocityBodyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVelocityBody",
      requestType = io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest,
      io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse> getSetVelocityBodyMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest, io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse> getSetVelocityBodyMethod;
    if ((getSetVelocityBodyMethod = OffboardServiceGrpc.getSetVelocityBodyMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetVelocityBodyMethod = OffboardServiceGrpc.getSetVelocityBodyMethod) == null) {
          OffboardServiceGrpc.getSetVelocityBodyMethod = getSetVelocityBodyMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest, io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVelocityBody"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetVelocityBodyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest,
      io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse> getSetVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVelocityNed",
      requestType = io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest,
      io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse> getSetVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest, io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse> getSetVelocityNedMethod;
    if ((getSetVelocityNedMethod = OffboardServiceGrpc.getSetVelocityNedMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetVelocityNedMethod = OffboardServiceGrpc.getSetVelocityNedMethod) == null) {
          OffboardServiceGrpc.getSetVelocityNedMethod = getSetVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest, io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse> getSetPositionVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPositionVelocityNed",
      requestType = io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse> getSetPositionVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest, io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse> getSetPositionVelocityNedMethod;
    if ((getSetPositionVelocityNedMethod = OffboardServiceGrpc.getSetPositionVelocityNedMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetPositionVelocityNedMethod = OffboardServiceGrpc.getSetPositionVelocityNedMethod) == null) {
          OffboardServiceGrpc.getSetPositionVelocityNedMethod = getSetPositionVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest, io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPositionVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPositionVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse> getSetPositionVelocityAccelerationNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetPositionVelocityAccelerationNed",
      requestType = io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest,
      io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse> getSetPositionVelocityAccelerationNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest, io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse> getSetPositionVelocityAccelerationNedMethod;
    if ((getSetPositionVelocityAccelerationNedMethod = OffboardServiceGrpc.getSetPositionVelocityAccelerationNedMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetPositionVelocityAccelerationNedMethod = OffboardServiceGrpc.getSetPositionVelocityAccelerationNedMethod) == null) {
          OffboardServiceGrpc.getSetPositionVelocityAccelerationNedMethod = getSetPositionVelocityAccelerationNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest, io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetPositionVelocityAccelerationNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetPositionVelocityAccelerationNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest,
      io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse> getSetAccelerationNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetAccelerationNed",
      requestType = io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest.class,
      responseType = io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest,
      io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse> getSetAccelerationNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest, io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse> getSetAccelerationNedMethod;
    if ((getSetAccelerationNedMethod = OffboardServiceGrpc.getSetAccelerationNedMethod) == null) {
      synchronized (OffboardServiceGrpc.class) {
        if ((getSetAccelerationNedMethod = OffboardServiceGrpc.getSetAccelerationNedMethod) == null) {
          OffboardServiceGrpc.getSetAccelerationNedMethod = getSetAccelerationNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest, io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetAccelerationNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetAccelerationNedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OffboardServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OffboardServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OffboardServiceStub>() {
        @java.lang.Override
        public OffboardServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OffboardServiceStub(channel, callOptions);
        }
      };
    return OffboardServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OffboardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OffboardServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OffboardServiceBlockingStub>() {
        @java.lang.Override
        public OffboardServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OffboardServiceBlockingStub(channel, callOptions);
        }
      };
    return OffboardServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OffboardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OffboardServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OffboardServiceFutureStub>() {
        @java.lang.Override
        public OffboardServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OffboardServiceFutureStub(channel, callOptions);
        }
      };
    return OffboardServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * Control a drone with position, velocity, attitude or motor commands.
   * The module is called offboard because the commands can be sent from external sources
   * as opposed to onboard control right inside the autopilot "board".
   * Client code must specify a setpoint before starting offboard mode.
   * Mavsdk automatically sends setpoints at 20Hz (PX4 Offboard mode requires that setpoints
   * are minimally sent at 2Hz).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Start offboard control.
     * </pre>
     */
    default void start(io.mavsdk.offboard.OffboardProto.StartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.StartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop offboard control.
     * The vehicle will be put into Hold mode: https://docs.px4.io/en/flight_modes/hold.html
     * </pre>
     */
    default void stop(io.mavsdk.offboard.OffboardProto.StopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.StopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if offboard control is active.
     * True means that the vehicle is in offboard mode and we are actively sending
     * setpoints.
     * </pre>
     */
    default void isActive(io.mavsdk.offboard.OffboardProto.IsActiveRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.IsActiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsActiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the attitude in terms of roll, pitch and yaw in degrees with thrust.
     * </pre>
     */
    default void setAttitude(io.mavsdk.offboard.OffboardProto.SetAttitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAttitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAttitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set direct actuator control values to groups #0 and #1.
     * First 8 controls will go to control group 0, the following 8 controls to control group 1 (if
     * actuator_control.num_controls more than 8).
     * </pre>
     */
    default void setActuatorControl(io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetActuatorControlMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the attitude rate in terms of pitch, roll and yaw angular rate along with thrust.
     * </pre>
     */
    default void setAttitudeRate(io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAttitudeRateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the position in NED coordinates and yaw.
     * </pre>
     */
    default void setPositionNed(io.mavsdk.offboard.OffboardProto.SetPositionNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPositionNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the position in Global coordinates (latitude, longitude, altitude) and yaw
     * </pre>
     */
    default void setPositionGlobal(io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPositionGlobalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the velocity in body coordinates and yaw angular rate. Not available for fixed-wing aircraft.
     * </pre>
     */
    default void setVelocityBody(io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetVelocityBodyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the velocity in NED coordinates and yaw. Not available for fixed-wing aircraft.
     * </pre>
     */
    default void setVelocityNed(io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the position in NED coordinates, with the velocity to be used as feed-forward.
     * </pre>
     */
    default void setPositionVelocityNed(io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPositionVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the position, velocity and acceleration in NED coordinates, with velocity and acceleration used as feed-forward.
     * </pre>
     */
    default void setPositionVelocityAccelerationNed(io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPositionVelocityAccelerationNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the acceleration in NED coordinates.
     * </pre>
     */
    default void setAccelerationNed(io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetAccelerationNedMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OffboardService.
   * <pre>
   **
   * Control a drone with position, velocity, attitude or motor commands.
   * The module is called offboard because the commands can be sent from external sources
   * as opposed to onboard control right inside the autopilot "board".
   * Client code must specify a setpoint before starting offboard mode.
   * Mavsdk automatically sends setpoints at 20Hz (PX4 Offboard mode requires that setpoints
   * are minimally sent at 2Hz).
   * </pre>
   */
  public static abstract class OffboardServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OffboardServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OffboardService.
   * <pre>
   **
   * Control a drone with position, velocity, attitude or motor commands.
   * The module is called offboard because the commands can be sent from external sources
   * as opposed to onboard control right inside the autopilot "board".
   * Client code must specify a setpoint before starting offboard mode.
   * Mavsdk automatically sends setpoints at 20Hz (PX4 Offboard mode requires that setpoints
   * are minimally sent at 2Hz).
   * </pre>
   */
  public static final class OffboardServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OffboardServiceStub> {
    private OffboardServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OffboardServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OffboardServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start offboard control.
     * </pre>
     */
    public void start(io.mavsdk.offboard.OffboardProto.StartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.StartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop offboard control.
     * The vehicle will be put into Hold mode: https://docs.px4.io/en/flight_modes/hold.html
     * </pre>
     */
    public void stop(io.mavsdk.offboard.OffboardProto.StopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.StopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if offboard control is active.
     * True means that the vehicle is in offboard mode and we are actively sending
     * setpoints.
     * </pre>
     */
    public void isActive(io.mavsdk.offboard.OffboardProto.IsActiveRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.IsActiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the attitude in terms of roll, pitch and yaw in degrees with thrust.
     * </pre>
     */
    public void setAttitude(io.mavsdk.offboard.OffboardProto.SetAttitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAttitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAttitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set direct actuator control values to groups #0 and #1.
     * First 8 controls will go to control group 0, the following 8 controls to control group 1 (if
     * actuator_control.num_controls more than 8).
     * </pre>
     */
    public void setActuatorControl(io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetActuatorControlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the attitude rate in terms of pitch, roll and yaw angular rate along with thrust.
     * </pre>
     */
    public void setAttitudeRate(io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAttitudeRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the position in NED coordinates and yaw.
     * </pre>
     */
    public void setPositionNed(io.mavsdk.offboard.OffboardProto.SetPositionNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPositionNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the position in Global coordinates (latitude, longitude, altitude) and yaw
     * </pre>
     */
    public void setPositionGlobal(io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPositionGlobalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the velocity in body coordinates and yaw angular rate. Not available for fixed-wing aircraft.
     * </pre>
     */
    public void setVelocityBody(io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetVelocityBodyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the velocity in NED coordinates and yaw. Not available for fixed-wing aircraft.
     * </pre>
     */
    public void setVelocityNed(io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the position in NED coordinates, with the velocity to be used as feed-forward.
     * </pre>
     */
    public void setPositionVelocityNed(io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPositionVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the position, velocity and acceleration in NED coordinates, with velocity and acceleration used as feed-forward.
     * </pre>
     */
    public void setPositionVelocityAccelerationNed(io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPositionVelocityAccelerationNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the acceleration in NED coordinates.
     * </pre>
     */
    public void setAccelerationNed(io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetAccelerationNedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OffboardService.
   * <pre>
   **
   * Control a drone with position, velocity, attitude or motor commands.
   * The module is called offboard because the commands can be sent from external sources
   * as opposed to onboard control right inside the autopilot "board".
   * Client code must specify a setpoint before starting offboard mode.
   * Mavsdk automatically sends setpoints at 20Hz (PX4 Offboard mode requires that setpoints
   * are minimally sent at 2Hz).
   * </pre>
   */
  public static final class OffboardServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OffboardServiceBlockingStub> {
    private OffboardServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OffboardServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OffboardServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start offboard control.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.StartResponse start(io.mavsdk.offboard.OffboardProto.StartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop offboard control.
     * The vehicle will be put into Hold mode: https://docs.px4.io/en/flight_modes/hold.html
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.StopResponse stop(io.mavsdk.offboard.OffboardProto.StopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if offboard control is active.
     * True means that the vehicle is in offboard mode and we are actively sending
     * setpoints.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.IsActiveResponse isActive(io.mavsdk.offboard.OffboardProto.IsActiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsActiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the attitude in terms of roll, pitch and yaw in degrees with thrust.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetAttitudeResponse setAttitude(io.mavsdk.offboard.OffboardProto.SetAttitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAttitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set direct actuator control values to groups #0 and #1.
     * First 8 controls will go to control group 0, the following 8 controls to control group 1 (if
     * actuator_control.num_controls more than 8).
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse setActuatorControl(io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetActuatorControlMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the attitude rate in terms of pitch, roll and yaw angular rate along with thrust.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse setAttitudeRate(io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAttitudeRateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the position in NED coordinates and yaw.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetPositionNedResponse setPositionNed(io.mavsdk.offboard.OffboardProto.SetPositionNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPositionNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the position in Global coordinates (latitude, longitude, altitude) and yaw
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse setPositionGlobal(io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPositionGlobalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the velocity in body coordinates and yaw angular rate. Not available for fixed-wing aircraft.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse setVelocityBody(io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetVelocityBodyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the velocity in NED coordinates and yaw. Not available for fixed-wing aircraft.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse setVelocityNed(io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the position in NED coordinates, with the velocity to be used as feed-forward.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse setPositionVelocityNed(io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPositionVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the position, velocity and acceleration in NED coordinates, with velocity and acceleration used as feed-forward.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse setPositionVelocityAccelerationNed(io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPositionVelocityAccelerationNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the acceleration in NED coordinates.
     * </pre>
     */
    public io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse setAccelerationNed(io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetAccelerationNedMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OffboardService.
   * <pre>
   **
   * Control a drone with position, velocity, attitude or motor commands.
   * The module is called offboard because the commands can be sent from external sources
   * as opposed to onboard control right inside the autopilot "board".
   * Client code must specify a setpoint before starting offboard mode.
   * Mavsdk automatically sends setpoints at 20Hz (PX4 Offboard mode requires that setpoints
   * are minimally sent at 2Hz).
   * </pre>
   */
  public static final class OffboardServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OffboardServiceFutureStub> {
    private OffboardServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OffboardServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OffboardServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start offboard control.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.StartResponse> start(
        io.mavsdk.offboard.OffboardProto.StartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop offboard control.
     * The vehicle will be put into Hold mode: https://docs.px4.io/en/flight_modes/hold.html
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.StopResponse> stop(
        io.mavsdk.offboard.OffboardProto.StopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if offboard control is active.
     * True means that the vehicle is in offboard mode and we are actively sending
     * setpoints.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.IsActiveResponse> isActive(
        io.mavsdk.offboard.OffboardProto.IsActiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsActiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the attitude in terms of roll, pitch and yaw in degrees with thrust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetAttitudeResponse> setAttitude(
        io.mavsdk.offboard.OffboardProto.SetAttitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAttitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set direct actuator control values to groups #0 and #1.
     * First 8 controls will go to control group 0, the following 8 controls to control group 1 (if
     * actuator_control.num_controls more than 8).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse> setActuatorControl(
        io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetActuatorControlMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the attitude rate in terms of pitch, roll and yaw angular rate along with thrust.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse> setAttitudeRate(
        io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAttitudeRateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the position in NED coordinates and yaw.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetPositionNedResponse> setPositionNed(
        io.mavsdk.offboard.OffboardProto.SetPositionNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPositionNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the position in Global coordinates (latitude, longitude, altitude) and yaw
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse> setPositionGlobal(
        io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPositionGlobalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the velocity in body coordinates and yaw angular rate. Not available for fixed-wing aircraft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse> setVelocityBody(
        io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetVelocityBodyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the velocity in NED coordinates and yaw. Not available for fixed-wing aircraft.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse> setVelocityNed(
        io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetVelocityNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the position in NED coordinates, with the velocity to be used as feed-forward.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse> setPositionVelocityNed(
        io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPositionVelocityNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the position, velocity and acceleration in NED coordinates, with velocity and acceleration used as feed-forward.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse> setPositionVelocityAccelerationNed(
        io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPositionVelocityAccelerationNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the acceleration in NED coordinates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse> setAccelerationNed(
        io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetAccelerationNedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_STOP = 1;
  private static final int METHODID_IS_ACTIVE = 2;
  private static final int METHODID_SET_ATTITUDE = 3;
  private static final int METHODID_SET_ACTUATOR_CONTROL = 4;
  private static final int METHODID_SET_ATTITUDE_RATE = 5;
  private static final int METHODID_SET_POSITION_NED = 6;
  private static final int METHODID_SET_POSITION_GLOBAL = 7;
  private static final int METHODID_SET_VELOCITY_BODY = 8;
  private static final int METHODID_SET_VELOCITY_NED = 9;
  private static final int METHODID_SET_POSITION_VELOCITY_NED = 10;
  private static final int METHODID_SET_POSITION_VELOCITY_ACCELERATION_NED = 11;
  private static final int METHODID_SET_ACCELERATION_NED = 12;

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
        case METHODID_START:
          serviceImpl.start((io.mavsdk.offboard.OffboardProto.StartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.StartResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((io.mavsdk.offboard.OffboardProto.StopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.StopResponse>) responseObserver);
          break;
        case METHODID_IS_ACTIVE:
          serviceImpl.isActive((io.mavsdk.offboard.OffboardProto.IsActiveRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.IsActiveResponse>) responseObserver);
          break;
        case METHODID_SET_ATTITUDE:
          serviceImpl.setAttitude((io.mavsdk.offboard.OffboardProto.SetAttitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAttitudeResponse>) responseObserver);
          break;
        case METHODID_SET_ACTUATOR_CONTROL:
          serviceImpl.setActuatorControl((io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse>) responseObserver);
          break;
        case METHODID_SET_ATTITUDE_RATE:
          serviceImpl.setAttitudeRate((io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse>) responseObserver);
          break;
        case METHODID_SET_POSITION_NED:
          serviceImpl.setPositionNed((io.mavsdk.offboard.OffboardProto.SetPositionNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionNedResponse>) responseObserver);
          break;
        case METHODID_SET_POSITION_GLOBAL:
          serviceImpl.setPositionGlobal((io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse>) responseObserver);
          break;
        case METHODID_SET_VELOCITY_BODY:
          serviceImpl.setVelocityBody((io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse>) responseObserver);
          break;
        case METHODID_SET_VELOCITY_NED:
          serviceImpl.setVelocityNed((io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse>) responseObserver);
          break;
        case METHODID_SET_POSITION_VELOCITY_NED:
          serviceImpl.setPositionVelocityNed((io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse>) responseObserver);
          break;
        case METHODID_SET_POSITION_VELOCITY_ACCELERATION_NED:
          serviceImpl.setPositionVelocityAccelerationNed((io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse>) responseObserver);
          break;
        case METHODID_SET_ACCELERATION_NED:
          serviceImpl.setAccelerationNed((io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse>) responseObserver);
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
          getStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.StartRequest,
              io.mavsdk.offboard.OffboardProto.StartResponse>(
                service, METHODID_START)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.StopRequest,
              io.mavsdk.offboard.OffboardProto.StopResponse>(
                service, METHODID_STOP)))
        .addMethod(
          getIsActiveMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.IsActiveRequest,
              io.mavsdk.offboard.OffboardProto.IsActiveResponse>(
                service, METHODID_IS_ACTIVE)))
        .addMethod(
          getSetAttitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetAttitudeRequest,
              io.mavsdk.offboard.OffboardProto.SetAttitudeResponse>(
                service, METHODID_SET_ATTITUDE)))
        .addMethod(
          getSetActuatorControlMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetActuatorControlRequest,
              io.mavsdk.offboard.OffboardProto.SetActuatorControlResponse>(
                service, METHODID_SET_ACTUATOR_CONTROL)))
        .addMethod(
          getSetAttitudeRateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetAttitudeRateRequest,
              io.mavsdk.offboard.OffboardProto.SetAttitudeRateResponse>(
                service, METHODID_SET_ATTITUDE_RATE)))
        .addMethod(
          getSetPositionNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetPositionNedRequest,
              io.mavsdk.offboard.OffboardProto.SetPositionNedResponse>(
                service, METHODID_SET_POSITION_NED)))
        .addMethod(
          getSetPositionGlobalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetPositionGlobalRequest,
              io.mavsdk.offboard.OffboardProto.SetPositionGlobalResponse>(
                service, METHODID_SET_POSITION_GLOBAL)))
        .addMethod(
          getSetVelocityBodyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetVelocityBodyRequest,
              io.mavsdk.offboard.OffboardProto.SetVelocityBodyResponse>(
                service, METHODID_SET_VELOCITY_BODY)))
        .addMethod(
          getSetVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetVelocityNedRequest,
              io.mavsdk.offboard.OffboardProto.SetVelocityNedResponse>(
                service, METHODID_SET_VELOCITY_NED)))
        .addMethod(
          getSetPositionVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedRequest,
              io.mavsdk.offboard.OffboardProto.SetPositionVelocityNedResponse>(
                service, METHODID_SET_POSITION_VELOCITY_NED)))
        .addMethod(
          getSetPositionVelocityAccelerationNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedRequest,
              io.mavsdk.offboard.OffboardProto.SetPositionVelocityAccelerationNedResponse>(
                service, METHODID_SET_POSITION_VELOCITY_ACCELERATION_NED)))
        .addMethod(
          getSetAccelerationNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.offboard.OffboardProto.SetAccelerationNedRequest,
              io.mavsdk.offboard.OffboardProto.SetAccelerationNedResponse>(
                service, METHODID_SET_ACCELERATION_NED)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (OffboardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getStartMethod())
              .addMethod(getStopMethod())
              .addMethod(getIsActiveMethod())
              .addMethod(getSetAttitudeMethod())
              .addMethod(getSetActuatorControlMethod())
              .addMethod(getSetAttitudeRateMethod())
              .addMethod(getSetPositionNedMethod())
              .addMethod(getSetPositionGlobalMethod())
              .addMethod(getSetVelocityBodyMethod())
              .addMethod(getSetVelocityNedMethod())
              .addMethod(getSetPositionVelocityNedMethod())
              .addMethod(getSetPositionVelocityAccelerationNedMethod())
              .addMethod(getSetAccelerationNedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
