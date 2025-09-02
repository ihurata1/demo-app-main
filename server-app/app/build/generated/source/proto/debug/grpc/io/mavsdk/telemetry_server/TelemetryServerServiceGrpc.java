package io.mavsdk.telemetry_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allow users to provide vehicle telemetry and state information
 * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/telemetry_server/telemetry_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TelemetryServerServiceGrpc {

  private TelemetryServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.telemetry_server.TelemetryServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse> getPublishPositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishPosition",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse> getPublishPositionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse> getPublishPositionMethod;
    if ((getPublishPositionMethod = TelemetryServerServiceGrpc.getPublishPositionMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishPositionMethod = TelemetryServerServiceGrpc.getPublishPositionMethod) == null) {
          TelemetryServerServiceGrpc.getPublishPositionMethod = getPublishPositionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishPosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishPositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse> getPublishHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishHome",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse> getPublishHomeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse> getPublishHomeMethod;
    if ((getPublishHomeMethod = TelemetryServerServiceGrpc.getPublishHomeMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishHomeMethod = TelemetryServerServiceGrpc.getPublishHomeMethod) == null) {
          TelemetryServerServiceGrpc.getPublishHomeMethod = getPublishHomeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishHomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse> getPublishSysStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishSysStatus",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse> getPublishSysStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse> getPublishSysStatusMethod;
    if ((getPublishSysStatusMethod = TelemetryServerServiceGrpc.getPublishSysStatusMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishSysStatusMethod = TelemetryServerServiceGrpc.getPublishSysStatusMethod) == null) {
          TelemetryServerServiceGrpc.getPublishSysStatusMethod = getPublishSysStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishSysStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishSysStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse> getPublishExtendedSysStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishExtendedSysState",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse> getPublishExtendedSysStateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse> getPublishExtendedSysStateMethod;
    if ((getPublishExtendedSysStateMethod = TelemetryServerServiceGrpc.getPublishExtendedSysStateMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishExtendedSysStateMethod = TelemetryServerServiceGrpc.getPublishExtendedSysStateMethod) == null) {
          TelemetryServerServiceGrpc.getPublishExtendedSysStateMethod = getPublishExtendedSysStateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishExtendedSysState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishExtendedSysStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse> getPublishRawGpsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishRawGps",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse> getPublishRawGpsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse> getPublishRawGpsMethod;
    if ((getPublishRawGpsMethod = TelemetryServerServiceGrpc.getPublishRawGpsMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishRawGpsMethod = TelemetryServerServiceGrpc.getPublishRawGpsMethod) == null) {
          TelemetryServerServiceGrpc.getPublishRawGpsMethod = getPublishRawGpsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishRawGps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishRawGpsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse> getPublishBatteryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishBattery",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse> getPublishBatteryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse> getPublishBatteryMethod;
    if ((getPublishBatteryMethod = TelemetryServerServiceGrpc.getPublishBatteryMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishBatteryMethod = TelemetryServerServiceGrpc.getPublishBatteryMethod) == null) {
          TelemetryServerServiceGrpc.getPublishBatteryMethod = getPublishBatteryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishBattery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishBatteryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse> getPublishStatusTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishStatusText",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse> getPublishStatusTextMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse> getPublishStatusTextMethod;
    if ((getPublishStatusTextMethod = TelemetryServerServiceGrpc.getPublishStatusTextMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishStatusTextMethod = TelemetryServerServiceGrpc.getPublishStatusTextMethod) == null) {
          TelemetryServerServiceGrpc.getPublishStatusTextMethod = getPublishStatusTextMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishStatusText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishStatusTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse> getPublishOdometryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishOdometry",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse> getPublishOdometryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse> getPublishOdometryMethod;
    if ((getPublishOdometryMethod = TelemetryServerServiceGrpc.getPublishOdometryMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishOdometryMethod = TelemetryServerServiceGrpc.getPublishOdometryMethod) == null) {
          TelemetryServerServiceGrpc.getPublishOdometryMethod = getPublishOdometryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishOdometry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishOdometryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse> getPublishPositionVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishPositionVelocityNed",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse> getPublishPositionVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse> getPublishPositionVelocityNedMethod;
    if ((getPublishPositionVelocityNedMethod = TelemetryServerServiceGrpc.getPublishPositionVelocityNedMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishPositionVelocityNedMethod = TelemetryServerServiceGrpc.getPublishPositionVelocityNedMethod) == null) {
          TelemetryServerServiceGrpc.getPublishPositionVelocityNedMethod = getPublishPositionVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishPositionVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishPositionVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse> getPublishGroundTruthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishGroundTruth",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse> getPublishGroundTruthMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse> getPublishGroundTruthMethod;
    if ((getPublishGroundTruthMethod = TelemetryServerServiceGrpc.getPublishGroundTruthMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishGroundTruthMethod = TelemetryServerServiceGrpc.getPublishGroundTruthMethod) == null) {
          TelemetryServerServiceGrpc.getPublishGroundTruthMethod = getPublishGroundTruthMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishGroundTruth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishGroundTruthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse> getPublishImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishImu",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse> getPublishImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse> getPublishImuMethod;
    if ((getPublishImuMethod = TelemetryServerServiceGrpc.getPublishImuMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishImuMethod = TelemetryServerServiceGrpc.getPublishImuMethod) == null) {
          TelemetryServerServiceGrpc.getPublishImuMethod = getPublishImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse> getPublishScaledImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishScaledImu",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse> getPublishScaledImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse> getPublishScaledImuMethod;
    if ((getPublishScaledImuMethod = TelemetryServerServiceGrpc.getPublishScaledImuMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishScaledImuMethod = TelemetryServerServiceGrpc.getPublishScaledImuMethod) == null) {
          TelemetryServerServiceGrpc.getPublishScaledImuMethod = getPublishScaledImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishScaledImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishScaledImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse> getPublishRawImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishRawImu",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse> getPublishRawImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse> getPublishRawImuMethod;
    if ((getPublishRawImuMethod = TelemetryServerServiceGrpc.getPublishRawImuMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishRawImuMethod = TelemetryServerServiceGrpc.getPublishRawImuMethod) == null) {
          TelemetryServerServiceGrpc.getPublishRawImuMethod = getPublishRawImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishRawImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishRawImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse> getPublishUnixEpochTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishUnixEpochTime",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse> getPublishUnixEpochTimeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse> getPublishUnixEpochTimeMethod;
    if ((getPublishUnixEpochTimeMethod = TelemetryServerServiceGrpc.getPublishUnixEpochTimeMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishUnixEpochTimeMethod = TelemetryServerServiceGrpc.getPublishUnixEpochTimeMethod) == null) {
          TelemetryServerServiceGrpc.getPublishUnixEpochTimeMethod = getPublishUnixEpochTimeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishUnixEpochTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishUnixEpochTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse> getPublishDistanceSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishDistanceSensor",
      requestType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest.class,
      responseType = io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest,
      io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse> getPublishDistanceSensorMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse> getPublishDistanceSensorMethod;
    if ((getPublishDistanceSensorMethod = TelemetryServerServiceGrpc.getPublishDistanceSensorMethod) == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        if ((getPublishDistanceSensorMethod = TelemetryServerServiceGrpc.getPublishDistanceSensorMethod) == null) {
          TelemetryServerServiceGrpc.getPublishDistanceSensorMethod = getPublishDistanceSensorMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest, io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishDistanceSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPublishDistanceSensorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TelemetryServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TelemetryServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TelemetryServerServiceStub>() {
        @java.lang.Override
        public TelemetryServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TelemetryServerServiceStub(channel, callOptions);
        }
      };
    return TelemetryServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TelemetryServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TelemetryServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TelemetryServerServiceBlockingStub>() {
        @java.lang.Override
        public TelemetryServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TelemetryServerServiceBlockingStub(channel, callOptions);
        }
      };
    return TelemetryServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TelemetryServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TelemetryServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TelemetryServerServiceFutureStub>() {
        @java.lang.Override
        public TelemetryServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TelemetryServerServiceFutureStub(channel, callOptions);
        }
      };
    return TelemetryServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allow users to provide vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Publish to 'position' updates.
     * </pre>
     */
    default void publishPosition(io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishPositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'home position' updates.
     * </pre>
     */
    default void publishHome(io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishHomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish 'sys status' updates.
     * </pre>
     */
    default void publishSysStatus(io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishSysStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish 'extended sys state' updates.
     * </pre>
     */
    default void publishExtendedSysState(io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishExtendedSysStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'Raw GPS' updates.
     * </pre>
     */
    default void publishRawGps(io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishRawGpsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'battery' updates.
     * </pre>
     */
    default void publishBattery(io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishBatteryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'status text' updates.
     * </pre>
     */
    default void publishStatusText(io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishStatusTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'odometry' updates.
     * </pre>
     */
    default void publishOdometry(io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishOdometryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'position velocity' updates.
     * </pre>
     */
    default void publishPositionVelocityNed(io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishPositionVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'ground truth' updates.
     * </pre>
     */
    default void publishGroundTruth(io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishGroundTruthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    default void publishImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'Scaled IMU' updates.
     * </pre>
     */
    default void publishScaledImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishScaledImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'Raw IMU' updates.
     * </pre>
     */
    default void publishRawImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishRawImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to 'unix epoch time' updates.
     * </pre>
     */
    default void publishUnixEpochTime(io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishUnixEpochTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Publish to "distance sensor" updates.
     * </pre>
     */
    default void publishDistanceSensor(io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishDistanceSensorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TelemetryServerService.
   * <pre>
   * Allow users to provide vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static abstract class TelemetryServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TelemetryServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TelemetryServerService.
   * <pre>
   * Allow users to provide vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static final class TelemetryServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TelemetryServerServiceStub> {
    private TelemetryServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TelemetryServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TelemetryServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publish to 'position' updates.
     * </pre>
     */
    public void publishPosition(io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishPositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'home position' updates.
     * </pre>
     */
    public void publishHome(io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishHomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish 'sys status' updates.
     * </pre>
     */
    public void publishSysStatus(io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishSysStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish 'extended sys state' updates.
     * </pre>
     */
    public void publishExtendedSysState(io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishExtendedSysStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'Raw GPS' updates.
     * </pre>
     */
    public void publishRawGps(io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishRawGpsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'battery' updates.
     * </pre>
     */
    public void publishBattery(io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishBatteryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'status text' updates.
     * </pre>
     */
    public void publishStatusText(io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishStatusTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'odometry' updates.
     * </pre>
     */
    public void publishOdometry(io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishOdometryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'position velocity' updates.
     * </pre>
     */
    public void publishPositionVelocityNed(io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishPositionVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'ground truth' updates.
     * </pre>
     */
    public void publishGroundTruth(io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishGroundTruthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    public void publishImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'Scaled IMU' updates.
     * </pre>
     */
    public void publishScaledImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishScaledImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'Raw IMU' updates.
     * </pre>
     */
    public void publishRawImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishRawImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to 'unix epoch time' updates.
     * </pre>
     */
    public void publishUnixEpochTime(io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishUnixEpochTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Publish to "distance sensor" updates.
     * </pre>
     */
    public void publishDistanceSensor(io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishDistanceSensorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TelemetryServerService.
   * <pre>
   * Allow users to provide vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static final class TelemetryServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TelemetryServerServiceBlockingStub> {
    private TelemetryServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TelemetryServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TelemetryServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publish to 'position' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse publishPosition(io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishPositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'home position' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse publishHome(io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishHomeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish 'sys status' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse publishSysStatus(io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishSysStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish 'extended sys state' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse publishExtendedSysState(io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishExtendedSysStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'Raw GPS' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse publishRawGps(io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishRawGpsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'battery' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse publishBattery(io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishBatteryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'status text' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse publishStatusText(io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishStatusTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'odometry' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse publishOdometry(io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishOdometryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'position velocity' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse publishPositionVelocityNed(io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishPositionVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'ground truth' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse publishGroundTruth(io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishGroundTruthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse publishImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'Scaled IMU' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse publishScaledImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishScaledImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'Raw IMU' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse publishRawImu(io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishRawImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to 'unix epoch time' updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse publishUnixEpochTime(io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishUnixEpochTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Publish to "distance sensor" updates.
     * </pre>
     */
    public io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse publishDistanceSensor(io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishDistanceSensorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TelemetryServerService.
   * <pre>
   * Allow users to provide vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static final class TelemetryServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TelemetryServerServiceFutureStub> {
    private TelemetryServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TelemetryServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TelemetryServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Publish to 'position' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse> publishPosition(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishPositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'home position' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse> publishHome(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishHomeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish 'sys status' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse> publishSysStatus(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishSysStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish 'extended sys state' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse> publishExtendedSysState(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishExtendedSysStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'Raw GPS' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse> publishRawGps(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishRawGpsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'battery' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse> publishBattery(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishBatteryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'status text' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse> publishStatusText(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishStatusTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'odometry' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse> publishOdometry(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishOdometryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'position velocity' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse> publishPositionVelocityNed(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishPositionVelocityNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'ground truth' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse> publishGroundTruth(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishGroundTruthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse> publishImu(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishImuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'Scaled IMU' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse> publishScaledImu(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishScaledImuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'Raw IMU' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse> publishRawImu(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishRawImuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to 'unix epoch time' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse> publishUnixEpochTime(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishUnixEpochTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Publish to "distance sensor" updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse> publishDistanceSensor(
        io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishDistanceSensorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH_POSITION = 0;
  private static final int METHODID_PUBLISH_HOME = 1;
  private static final int METHODID_PUBLISH_SYS_STATUS = 2;
  private static final int METHODID_PUBLISH_EXTENDED_SYS_STATE = 3;
  private static final int METHODID_PUBLISH_RAW_GPS = 4;
  private static final int METHODID_PUBLISH_BATTERY = 5;
  private static final int METHODID_PUBLISH_STATUS_TEXT = 6;
  private static final int METHODID_PUBLISH_ODOMETRY = 7;
  private static final int METHODID_PUBLISH_POSITION_VELOCITY_NED = 8;
  private static final int METHODID_PUBLISH_GROUND_TRUTH = 9;
  private static final int METHODID_PUBLISH_IMU = 10;
  private static final int METHODID_PUBLISH_SCALED_IMU = 11;
  private static final int METHODID_PUBLISH_RAW_IMU = 12;
  private static final int METHODID_PUBLISH_UNIX_EPOCH_TIME = 13;
  private static final int METHODID_PUBLISH_DISTANCE_SENSOR = 14;

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
        case METHODID_PUBLISH_POSITION:
          serviceImpl.publishPosition((io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_HOME:
          serviceImpl.publishHome((io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_SYS_STATUS:
          serviceImpl.publishSysStatus((io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_EXTENDED_SYS_STATE:
          serviceImpl.publishExtendedSysState((io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_RAW_GPS:
          serviceImpl.publishRawGps((io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_BATTERY:
          serviceImpl.publishBattery((io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_STATUS_TEXT:
          serviceImpl.publishStatusText((io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_ODOMETRY:
          serviceImpl.publishOdometry((io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_POSITION_VELOCITY_NED:
          serviceImpl.publishPositionVelocityNed((io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_GROUND_TRUTH:
          serviceImpl.publishGroundTruth((io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_IMU:
          serviceImpl.publishImu((io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_SCALED_IMU:
          serviceImpl.publishScaledImu((io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_RAW_IMU:
          serviceImpl.publishRawImu((io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_UNIX_EPOCH_TIME:
          serviceImpl.publishUnixEpochTime((io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_DISTANCE_SENSOR:
          serviceImpl.publishDistanceSensor((io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse>) responseObserver);
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
          getPublishPositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionResponse>(
                service, METHODID_PUBLISH_POSITION)))
        .addMethod(
          getPublishHomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishHomeResponse>(
                service, METHODID_PUBLISH_HOME)))
        .addMethod(
          getPublishSysStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishSysStatusResponse>(
                service, METHODID_PUBLISH_SYS_STATUS)))
        .addMethod(
          getPublishExtendedSysStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishExtendedSysStateResponse>(
                service, METHODID_PUBLISH_EXTENDED_SYS_STATE)))
        .addMethod(
          getPublishRawGpsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawGpsResponse>(
                service, METHODID_PUBLISH_RAW_GPS)))
        .addMethod(
          getPublishBatteryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishBatteryResponse>(
                service, METHODID_PUBLISH_BATTERY)))
        .addMethod(
          getPublishStatusTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishStatusTextResponse>(
                service, METHODID_PUBLISH_STATUS_TEXT)))
        .addMethod(
          getPublishOdometryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishOdometryResponse>(
                service, METHODID_PUBLISH_ODOMETRY)))
        .addMethod(
          getPublishPositionVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishPositionVelocityNedResponse>(
                service, METHODID_PUBLISH_POSITION_VELOCITY_NED)))
        .addMethod(
          getPublishGroundTruthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishGroundTruthResponse>(
                service, METHODID_PUBLISH_GROUND_TRUTH)))
        .addMethod(
          getPublishImuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishImuResponse>(
                service, METHODID_PUBLISH_IMU)))
        .addMethod(
          getPublishScaledImuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishScaledImuResponse>(
                service, METHODID_PUBLISH_SCALED_IMU)))
        .addMethod(
          getPublishRawImuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishRawImuResponse>(
                service, METHODID_PUBLISH_RAW_IMU)))
        .addMethod(
          getPublishUnixEpochTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishUnixEpochTimeResponse>(
                service, METHODID_PUBLISH_UNIX_EPOCH_TIME)))
        .addMethod(
          getPublishDistanceSensorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorRequest,
              io.mavsdk.telemetry_server.TelemetryServerProto.PublishDistanceSensorResponse>(
                service, METHODID_PUBLISH_DISTANCE_SENSOR)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TelemetryServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getPublishPositionMethod())
              .addMethod(getPublishHomeMethod())
              .addMethod(getPublishSysStatusMethod())
              .addMethod(getPublishExtendedSysStateMethod())
              .addMethod(getPublishRawGpsMethod())
              .addMethod(getPublishBatteryMethod())
              .addMethod(getPublishStatusTextMethod())
              .addMethod(getPublishOdometryMethod())
              .addMethod(getPublishPositionVelocityNedMethod())
              .addMethod(getPublishGroundTruthMethod())
              .addMethod(getPublishImuMethod())
              .addMethod(getPublishScaledImuMethod())
              .addMethod(getPublishRawImuMethod())
              .addMethod(getPublishUnixEpochTimeMethod())
              .addMethod(getPublishDistanceSensorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
