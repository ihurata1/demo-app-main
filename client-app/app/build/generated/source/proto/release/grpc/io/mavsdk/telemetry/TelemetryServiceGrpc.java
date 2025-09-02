package io.mavsdk.telemetry;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Allow users to get vehicle telemetry and state information
 * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/telemetry/telemetry.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TelemetryServiceGrpc {

  private TelemetryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.telemetry.TelemetryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest,
      io.mavsdk.telemetry.TelemetryProto.PositionResponse> getSubscribePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribePosition",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.PositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest,
      io.mavsdk.telemetry.TelemetryProto.PositionResponse> getSubscribePositionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest, io.mavsdk.telemetry.TelemetryProto.PositionResponse> getSubscribePositionMethod;
    if ((getSubscribePositionMethod = TelemetryServiceGrpc.getSubscribePositionMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribePositionMethod = TelemetryServiceGrpc.getSubscribePositionMethod) == null) {
          TelemetryServiceGrpc.getSubscribePositionMethod = getSubscribePositionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest, io.mavsdk.telemetry.TelemetryProto.PositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.PositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest,
      io.mavsdk.telemetry.TelemetryProto.HomeResponse> getSubscribeHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeHome",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.HomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest,
      io.mavsdk.telemetry.TelemetryProto.HomeResponse> getSubscribeHomeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest, io.mavsdk.telemetry.TelemetryProto.HomeResponse> getSubscribeHomeMethod;
    if ((getSubscribeHomeMethod = TelemetryServiceGrpc.getSubscribeHomeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeHomeMethod = TelemetryServiceGrpc.getSubscribeHomeMethod) == null) {
          TelemetryServiceGrpc.getSubscribeHomeMethod = getSubscribeHomeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest, io.mavsdk.telemetry.TelemetryProto.HomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.HomeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeHomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest,
      io.mavsdk.telemetry.TelemetryProto.InAirResponse> getSubscribeInAirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeInAir",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.InAirResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest,
      io.mavsdk.telemetry.TelemetryProto.InAirResponse> getSubscribeInAirMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest, io.mavsdk.telemetry.TelemetryProto.InAirResponse> getSubscribeInAirMethod;
    if ((getSubscribeInAirMethod = TelemetryServiceGrpc.getSubscribeInAirMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeInAirMethod = TelemetryServiceGrpc.getSubscribeInAirMethod) == null) {
          TelemetryServiceGrpc.getSubscribeInAirMethod = getSubscribeInAirMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest, io.mavsdk.telemetry.TelemetryProto.InAirResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeInAir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.InAirResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeInAirMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest,
      io.mavsdk.telemetry.TelemetryProto.LandedStateResponse> getSubscribeLandedStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeLandedState",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.LandedStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest,
      io.mavsdk.telemetry.TelemetryProto.LandedStateResponse> getSubscribeLandedStateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest, io.mavsdk.telemetry.TelemetryProto.LandedStateResponse> getSubscribeLandedStateMethod;
    if ((getSubscribeLandedStateMethod = TelemetryServiceGrpc.getSubscribeLandedStateMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeLandedStateMethod = TelemetryServiceGrpc.getSubscribeLandedStateMethod) == null) {
          TelemetryServiceGrpc.getSubscribeLandedStateMethod = getSubscribeLandedStateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest, io.mavsdk.telemetry.TelemetryProto.LandedStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeLandedState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.LandedStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeLandedStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest,
      io.mavsdk.telemetry.TelemetryProto.ArmedResponse> getSubscribeArmedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeArmed",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.ArmedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest,
      io.mavsdk.telemetry.TelemetryProto.ArmedResponse> getSubscribeArmedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest, io.mavsdk.telemetry.TelemetryProto.ArmedResponse> getSubscribeArmedMethod;
    if ((getSubscribeArmedMethod = TelemetryServiceGrpc.getSubscribeArmedMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeArmedMethod = TelemetryServiceGrpc.getSubscribeArmedMethod) == null) {
          TelemetryServiceGrpc.getSubscribeArmedMethod = getSubscribeArmedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest, io.mavsdk.telemetry.TelemetryProto.ArmedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeArmed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.ArmedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeArmedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest,
      io.mavsdk.telemetry.TelemetryProto.VtolStateResponse> getSubscribeVtolStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeVtolState",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.VtolStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest,
      io.mavsdk.telemetry.TelemetryProto.VtolStateResponse> getSubscribeVtolStateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest, io.mavsdk.telemetry.TelemetryProto.VtolStateResponse> getSubscribeVtolStateMethod;
    if ((getSubscribeVtolStateMethod = TelemetryServiceGrpc.getSubscribeVtolStateMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeVtolStateMethod = TelemetryServiceGrpc.getSubscribeVtolStateMethod) == null) {
          TelemetryServiceGrpc.getSubscribeVtolStateMethod = getSubscribeVtolStateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest, io.mavsdk.telemetry.TelemetryProto.VtolStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeVtolState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.VtolStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeVtolStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest,
      io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse> getSubscribeAttitudeQuaternionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeAttitudeQuaternion",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest,
      io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse> getSubscribeAttitudeQuaternionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest, io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse> getSubscribeAttitudeQuaternionMethod;
    if ((getSubscribeAttitudeQuaternionMethod = TelemetryServiceGrpc.getSubscribeAttitudeQuaternionMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeAttitudeQuaternionMethod = TelemetryServiceGrpc.getSubscribeAttitudeQuaternionMethod) == null) {
          TelemetryServiceGrpc.getSubscribeAttitudeQuaternionMethod = getSubscribeAttitudeQuaternionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest, io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeAttitudeQuaternion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeAttitudeQuaternionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest,
      io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse> getSubscribeAttitudeEulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeAttitudeEuler",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest,
      io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse> getSubscribeAttitudeEulerMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest, io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse> getSubscribeAttitudeEulerMethod;
    if ((getSubscribeAttitudeEulerMethod = TelemetryServiceGrpc.getSubscribeAttitudeEulerMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeAttitudeEulerMethod = TelemetryServiceGrpc.getSubscribeAttitudeEulerMethod) == null) {
          TelemetryServiceGrpc.getSubscribeAttitudeEulerMethod = getSubscribeAttitudeEulerMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest, io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeAttitudeEuler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeAttitudeEulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest,
      io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse> getSubscribeAttitudeAngularVelocityBodyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeAttitudeAngularVelocityBody",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest,
      io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse> getSubscribeAttitudeAngularVelocityBodyMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest, io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse> getSubscribeAttitudeAngularVelocityBodyMethod;
    if ((getSubscribeAttitudeAngularVelocityBodyMethod = TelemetryServiceGrpc.getSubscribeAttitudeAngularVelocityBodyMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeAttitudeAngularVelocityBodyMethod = TelemetryServiceGrpc.getSubscribeAttitudeAngularVelocityBodyMethod) == null) {
          TelemetryServiceGrpc.getSubscribeAttitudeAngularVelocityBodyMethod = getSubscribeAttitudeAngularVelocityBodyMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest, io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeAttitudeAngularVelocityBody"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeAttitudeAngularVelocityBodyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest,
      io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse> getSubscribeCameraAttitudeQuaternionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCameraAttitudeQuaternion",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest,
      io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse> getSubscribeCameraAttitudeQuaternionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest, io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse> getSubscribeCameraAttitudeQuaternionMethod;
    if ((getSubscribeCameraAttitudeQuaternionMethod = TelemetryServiceGrpc.getSubscribeCameraAttitudeQuaternionMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeCameraAttitudeQuaternionMethod = TelemetryServiceGrpc.getSubscribeCameraAttitudeQuaternionMethod) == null) {
          TelemetryServiceGrpc.getSubscribeCameraAttitudeQuaternionMethod = getSubscribeCameraAttitudeQuaternionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest, io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCameraAttitudeQuaternion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCameraAttitudeQuaternionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest,
      io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse> getSubscribeCameraAttitudeEulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCameraAttitudeEuler",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest,
      io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse> getSubscribeCameraAttitudeEulerMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest, io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse> getSubscribeCameraAttitudeEulerMethod;
    if ((getSubscribeCameraAttitudeEulerMethod = TelemetryServiceGrpc.getSubscribeCameraAttitudeEulerMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeCameraAttitudeEulerMethod = TelemetryServiceGrpc.getSubscribeCameraAttitudeEulerMethod) == null) {
          TelemetryServiceGrpc.getSubscribeCameraAttitudeEulerMethod = getSubscribeCameraAttitudeEulerMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest, io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCameraAttitudeEuler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCameraAttitudeEulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse> getSubscribeVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeVelocityNed",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse> getSubscribeVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse> getSubscribeVelocityNedMethod;
    if ((getSubscribeVelocityNedMethod = TelemetryServiceGrpc.getSubscribeVelocityNedMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeVelocityNedMethod = TelemetryServiceGrpc.getSubscribeVelocityNedMethod) == null) {
          TelemetryServiceGrpc.getSubscribeVelocityNedMethod = getSubscribeVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest,
      io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse> getSubscribeGpsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeGpsInfo",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest,
      io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse> getSubscribeGpsInfoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest, io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse> getSubscribeGpsInfoMethod;
    if ((getSubscribeGpsInfoMethod = TelemetryServiceGrpc.getSubscribeGpsInfoMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeGpsInfoMethod = TelemetryServiceGrpc.getSubscribeGpsInfoMethod) == null) {
          TelemetryServiceGrpc.getSubscribeGpsInfoMethod = getSubscribeGpsInfoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest, io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeGpsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeGpsInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest,
      io.mavsdk.telemetry.TelemetryProto.RawGpsResponse> getSubscribeRawGpsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeRawGps",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.RawGpsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest,
      io.mavsdk.telemetry.TelemetryProto.RawGpsResponse> getSubscribeRawGpsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest, io.mavsdk.telemetry.TelemetryProto.RawGpsResponse> getSubscribeRawGpsMethod;
    if ((getSubscribeRawGpsMethod = TelemetryServiceGrpc.getSubscribeRawGpsMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeRawGpsMethod = TelemetryServiceGrpc.getSubscribeRawGpsMethod) == null) {
          TelemetryServiceGrpc.getSubscribeRawGpsMethod = getSubscribeRawGpsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest, io.mavsdk.telemetry.TelemetryProto.RawGpsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeRawGps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.RawGpsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeRawGpsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest,
      io.mavsdk.telemetry.TelemetryProto.BatteryResponse> getSubscribeBatteryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeBattery",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.BatteryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest,
      io.mavsdk.telemetry.TelemetryProto.BatteryResponse> getSubscribeBatteryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest, io.mavsdk.telemetry.TelemetryProto.BatteryResponse> getSubscribeBatteryMethod;
    if ((getSubscribeBatteryMethod = TelemetryServiceGrpc.getSubscribeBatteryMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeBatteryMethod = TelemetryServiceGrpc.getSubscribeBatteryMethod) == null) {
          TelemetryServiceGrpc.getSubscribeBatteryMethod = getSubscribeBatteryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest, io.mavsdk.telemetry.TelemetryProto.BatteryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeBattery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.BatteryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeBatteryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest,
      io.mavsdk.telemetry.TelemetryProto.FlightModeResponse> getSubscribeFlightModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeFlightMode",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.FlightModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest,
      io.mavsdk.telemetry.TelemetryProto.FlightModeResponse> getSubscribeFlightModeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest, io.mavsdk.telemetry.TelemetryProto.FlightModeResponse> getSubscribeFlightModeMethod;
    if ((getSubscribeFlightModeMethod = TelemetryServiceGrpc.getSubscribeFlightModeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeFlightModeMethod = TelemetryServiceGrpc.getSubscribeFlightModeMethod) == null) {
          TelemetryServiceGrpc.getSubscribeFlightModeMethod = getSubscribeFlightModeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest, io.mavsdk.telemetry.TelemetryProto.FlightModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeFlightMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.FlightModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeFlightModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest,
      io.mavsdk.telemetry.TelemetryProto.HealthResponse> getSubscribeHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeHealth",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.HealthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest,
      io.mavsdk.telemetry.TelemetryProto.HealthResponse> getSubscribeHealthMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest, io.mavsdk.telemetry.TelemetryProto.HealthResponse> getSubscribeHealthMethod;
    if ((getSubscribeHealthMethod = TelemetryServiceGrpc.getSubscribeHealthMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeHealthMethod = TelemetryServiceGrpc.getSubscribeHealthMethod) == null) {
          TelemetryServiceGrpc.getSubscribeHealthMethod = getSubscribeHealthMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest, io.mavsdk.telemetry.TelemetryProto.HealthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeHealth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.HealthResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.RcStatusResponse> getSubscribeRcStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeRcStatus",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.RcStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.RcStatusResponse> getSubscribeRcStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest, io.mavsdk.telemetry.TelemetryProto.RcStatusResponse> getSubscribeRcStatusMethod;
    if ((getSubscribeRcStatusMethod = TelemetryServiceGrpc.getSubscribeRcStatusMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeRcStatusMethod = TelemetryServiceGrpc.getSubscribeRcStatusMethod) == null) {
          TelemetryServiceGrpc.getSubscribeRcStatusMethod = getSubscribeRcStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest, io.mavsdk.telemetry.TelemetryProto.RcStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeRcStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.RcStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeRcStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest,
      io.mavsdk.telemetry.TelemetryProto.StatusTextResponse> getSubscribeStatusTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStatusText",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.StatusTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest,
      io.mavsdk.telemetry.TelemetryProto.StatusTextResponse> getSubscribeStatusTextMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest, io.mavsdk.telemetry.TelemetryProto.StatusTextResponse> getSubscribeStatusTextMethod;
    if ((getSubscribeStatusTextMethod = TelemetryServiceGrpc.getSubscribeStatusTextMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeStatusTextMethod = TelemetryServiceGrpc.getSubscribeStatusTextMethod) == null) {
          TelemetryServiceGrpc.getSubscribeStatusTextMethod = getSubscribeStatusTextMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest, io.mavsdk.telemetry.TelemetryProto.StatusTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStatusText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.StatusTextResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStatusTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest,
      io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse> getSubscribeActuatorControlTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeActuatorControlTarget",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest,
      io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse> getSubscribeActuatorControlTargetMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest, io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse> getSubscribeActuatorControlTargetMethod;
    if ((getSubscribeActuatorControlTargetMethod = TelemetryServiceGrpc.getSubscribeActuatorControlTargetMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeActuatorControlTargetMethod = TelemetryServiceGrpc.getSubscribeActuatorControlTargetMethod) == null) {
          TelemetryServiceGrpc.getSubscribeActuatorControlTargetMethod = getSubscribeActuatorControlTargetMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest, io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeActuatorControlTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeActuatorControlTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse> getSubscribeActuatorOutputStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeActuatorOutputStatus",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse> getSubscribeActuatorOutputStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest, io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse> getSubscribeActuatorOutputStatusMethod;
    if ((getSubscribeActuatorOutputStatusMethod = TelemetryServiceGrpc.getSubscribeActuatorOutputStatusMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeActuatorOutputStatusMethod = TelemetryServiceGrpc.getSubscribeActuatorOutputStatusMethod) == null) {
          TelemetryServiceGrpc.getSubscribeActuatorOutputStatusMethod = getSubscribeActuatorOutputStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest, io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeActuatorOutputStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeActuatorOutputStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest,
      io.mavsdk.telemetry.TelemetryProto.OdometryResponse> getSubscribeOdometryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeOdometry",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.OdometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest,
      io.mavsdk.telemetry.TelemetryProto.OdometryResponse> getSubscribeOdometryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest, io.mavsdk.telemetry.TelemetryProto.OdometryResponse> getSubscribeOdometryMethod;
    if ((getSubscribeOdometryMethod = TelemetryServiceGrpc.getSubscribeOdometryMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeOdometryMethod = TelemetryServiceGrpc.getSubscribeOdometryMethod) == null) {
          TelemetryServiceGrpc.getSubscribeOdometryMethod = getSubscribeOdometryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest, io.mavsdk.telemetry.TelemetryProto.OdometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeOdometry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.OdometryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeOdometryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse> getSubscribePositionVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribePositionVelocityNed",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse> getSubscribePositionVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse> getSubscribePositionVelocityNedMethod;
    if ((getSubscribePositionVelocityNedMethod = TelemetryServiceGrpc.getSubscribePositionVelocityNedMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribePositionVelocityNedMethod = TelemetryServiceGrpc.getSubscribePositionVelocityNedMethod) == null) {
          TelemetryServiceGrpc.getSubscribePositionVelocityNedMethod = getSubscribePositionVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribePositionVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribePositionVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest,
      io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse> getSubscribeGroundTruthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeGroundTruth",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest,
      io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse> getSubscribeGroundTruthMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest, io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse> getSubscribeGroundTruthMethod;
    if ((getSubscribeGroundTruthMethod = TelemetryServiceGrpc.getSubscribeGroundTruthMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeGroundTruthMethod = TelemetryServiceGrpc.getSubscribeGroundTruthMethod) == null) {
          TelemetryServiceGrpc.getSubscribeGroundTruthMethod = getSubscribeGroundTruthMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest, io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeGroundTruth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeGroundTruthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest,
      io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse> getSubscribeFixedwingMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeFixedwingMetrics",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest,
      io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse> getSubscribeFixedwingMetricsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest, io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse> getSubscribeFixedwingMetricsMethod;
    if ((getSubscribeFixedwingMetricsMethod = TelemetryServiceGrpc.getSubscribeFixedwingMetricsMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeFixedwingMetricsMethod = TelemetryServiceGrpc.getSubscribeFixedwingMetricsMethod) == null) {
          TelemetryServiceGrpc.getSubscribeFixedwingMetricsMethod = getSubscribeFixedwingMetricsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest, io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeFixedwingMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeFixedwingMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest,
      io.mavsdk.telemetry.TelemetryProto.ImuResponse> getSubscribeImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeImu",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.ImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest,
      io.mavsdk.telemetry.TelemetryProto.ImuResponse> getSubscribeImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest, io.mavsdk.telemetry.TelemetryProto.ImuResponse> getSubscribeImuMethod;
    if ((getSubscribeImuMethod = TelemetryServiceGrpc.getSubscribeImuMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeImuMethod = TelemetryServiceGrpc.getSubscribeImuMethod) == null) {
          TelemetryServiceGrpc.getSubscribeImuMethod = getSubscribeImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest, io.mavsdk.telemetry.TelemetryProto.ImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.ImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest,
      io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse> getSubscribeScaledImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeScaledImu",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest,
      io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse> getSubscribeScaledImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest, io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse> getSubscribeScaledImuMethod;
    if ((getSubscribeScaledImuMethod = TelemetryServiceGrpc.getSubscribeScaledImuMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeScaledImuMethod = TelemetryServiceGrpc.getSubscribeScaledImuMethod) == null) {
          TelemetryServiceGrpc.getSubscribeScaledImuMethod = getSubscribeScaledImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest, io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeScaledImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeScaledImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest,
      io.mavsdk.telemetry.TelemetryProto.RawImuResponse> getSubscribeRawImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeRawImu",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.RawImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest,
      io.mavsdk.telemetry.TelemetryProto.RawImuResponse> getSubscribeRawImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest, io.mavsdk.telemetry.TelemetryProto.RawImuResponse> getSubscribeRawImuMethod;
    if ((getSubscribeRawImuMethod = TelemetryServiceGrpc.getSubscribeRawImuMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeRawImuMethod = TelemetryServiceGrpc.getSubscribeRawImuMethod) == null) {
          TelemetryServiceGrpc.getSubscribeRawImuMethod = getSubscribeRawImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest, io.mavsdk.telemetry.TelemetryProto.RawImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeRawImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.RawImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeRawImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest,
      io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse> getSubscribeHealthAllOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeHealthAllOk",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest,
      io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse> getSubscribeHealthAllOkMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest, io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse> getSubscribeHealthAllOkMethod;
    if ((getSubscribeHealthAllOkMethod = TelemetryServiceGrpc.getSubscribeHealthAllOkMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeHealthAllOkMethod = TelemetryServiceGrpc.getSubscribeHealthAllOkMethod) == null) {
          TelemetryServiceGrpc.getSubscribeHealthAllOkMethod = getSubscribeHealthAllOkMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest, io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeHealthAllOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeHealthAllOkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest,
      io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse> getSubscribeUnixEpochTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeUnixEpochTime",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest,
      io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse> getSubscribeUnixEpochTimeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest, io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse> getSubscribeUnixEpochTimeMethod;
    if ((getSubscribeUnixEpochTimeMethod = TelemetryServiceGrpc.getSubscribeUnixEpochTimeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeUnixEpochTimeMethod = TelemetryServiceGrpc.getSubscribeUnixEpochTimeMethod) == null) {
          TelemetryServiceGrpc.getSubscribeUnixEpochTimeMethod = getSubscribeUnixEpochTimeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest, io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeUnixEpochTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeUnixEpochTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest,
      io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse> getSubscribeDistanceSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeDistanceSensor",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest,
      io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse> getSubscribeDistanceSensorMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest, io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse> getSubscribeDistanceSensorMethod;
    if ((getSubscribeDistanceSensorMethod = TelemetryServiceGrpc.getSubscribeDistanceSensorMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeDistanceSensorMethod = TelemetryServiceGrpc.getSubscribeDistanceSensorMethod) == null) {
          TelemetryServiceGrpc.getSubscribeDistanceSensorMethod = getSubscribeDistanceSensorMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest, io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeDistanceSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeDistanceSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest,
      io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse> getSubscribeScaledPressureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeScaledPressure",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest,
      io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse> getSubscribeScaledPressureMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest, io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse> getSubscribeScaledPressureMethod;
    if ((getSubscribeScaledPressureMethod = TelemetryServiceGrpc.getSubscribeScaledPressureMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeScaledPressureMethod = TelemetryServiceGrpc.getSubscribeScaledPressureMethod) == null) {
          TelemetryServiceGrpc.getSubscribeScaledPressureMethod = getSubscribeScaledPressureMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest, io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeScaledPressure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeScaledPressureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest,
      io.mavsdk.telemetry.TelemetryProto.HeadingResponse> getSubscribeHeadingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeHeading",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.HeadingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest,
      io.mavsdk.telemetry.TelemetryProto.HeadingResponse> getSubscribeHeadingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest, io.mavsdk.telemetry.TelemetryProto.HeadingResponse> getSubscribeHeadingMethod;
    if ((getSubscribeHeadingMethod = TelemetryServiceGrpc.getSubscribeHeadingMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeHeadingMethod = TelemetryServiceGrpc.getSubscribeHeadingMethod) == null) {
          TelemetryServiceGrpc.getSubscribeHeadingMethod = getSubscribeHeadingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest, io.mavsdk.telemetry.TelemetryProto.HeadingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeHeading"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.HeadingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeHeadingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest,
      io.mavsdk.telemetry.TelemetryProto.AltitudeResponse> getSubscribeAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeAltitude",
      requestType = io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.AltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest,
      io.mavsdk.telemetry.TelemetryProto.AltitudeResponse> getSubscribeAltitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest, io.mavsdk.telemetry.TelemetryProto.AltitudeResponse> getSubscribeAltitudeMethod;
    if ((getSubscribeAltitudeMethod = TelemetryServiceGrpc.getSubscribeAltitudeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSubscribeAltitudeMethod = TelemetryServiceGrpc.getSubscribeAltitudeMethod) == null) {
          TelemetryServiceGrpc.getSubscribeAltitudeMethod = getSubscribeAltitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest, io.mavsdk.telemetry.TelemetryProto.AltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.AltitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse> getSetRatePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRatePosition",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse> getSetRatePositionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest, io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse> getSetRatePositionMethod;
    if ((getSetRatePositionMethod = TelemetryServiceGrpc.getSetRatePositionMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRatePositionMethod = TelemetryServiceGrpc.getSetRatePositionMethod) == null) {
          TelemetryServiceGrpc.getSetRatePositionMethod = getSetRatePositionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest, io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRatePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRatePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse> getSetRateHomeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateHome",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse> getSetRateHomeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse> getSetRateHomeMethod;
    if ((getSetRateHomeMethod = TelemetryServiceGrpc.getSetRateHomeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateHomeMethod = TelemetryServiceGrpc.getSetRateHomeMethod) == null) {
          TelemetryServiceGrpc.getSetRateHomeMethod = getSetRateHomeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateHome"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateHomeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse> getSetRateInAirMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateInAir",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse> getSetRateInAirMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest, io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse> getSetRateInAirMethod;
    if ((getSetRateInAirMethod = TelemetryServiceGrpc.getSetRateInAirMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateInAirMethod = TelemetryServiceGrpc.getSetRateInAirMethod) == null) {
          TelemetryServiceGrpc.getSetRateInAirMethod = getSetRateInAirMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest, io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateInAir"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateInAirMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse> getSetRateLandedStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateLandedState",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse> getSetRateLandedStateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest, io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse> getSetRateLandedStateMethod;
    if ((getSetRateLandedStateMethod = TelemetryServiceGrpc.getSetRateLandedStateMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateLandedStateMethod = TelemetryServiceGrpc.getSetRateLandedStateMethod) == null) {
          TelemetryServiceGrpc.getSetRateLandedStateMethod = getSetRateLandedStateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest, io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateLandedState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateLandedStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse> getSetRateVtolStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateVtolState",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse> getSetRateVtolStateMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest, io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse> getSetRateVtolStateMethod;
    if ((getSetRateVtolStateMethod = TelemetryServiceGrpc.getSetRateVtolStateMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateVtolStateMethod = TelemetryServiceGrpc.getSetRateVtolStateMethod) == null) {
          TelemetryServiceGrpc.getSetRateVtolStateMethod = getSetRateVtolStateMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest, io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateVtolState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateVtolStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse> getSetRateAttitudeQuaternionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateAttitudeQuaternion",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse> getSetRateAttitudeQuaternionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest, io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse> getSetRateAttitudeQuaternionMethod;
    if ((getSetRateAttitudeQuaternionMethod = TelemetryServiceGrpc.getSetRateAttitudeQuaternionMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateAttitudeQuaternionMethod = TelemetryServiceGrpc.getSetRateAttitudeQuaternionMethod) == null) {
          TelemetryServiceGrpc.getSetRateAttitudeQuaternionMethod = getSetRateAttitudeQuaternionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest, io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateAttitudeQuaternion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateAttitudeQuaternionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse> getSetRateAttitudeEulerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateAttitudeEuler",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse> getSetRateAttitudeEulerMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest, io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse> getSetRateAttitudeEulerMethod;
    if ((getSetRateAttitudeEulerMethod = TelemetryServiceGrpc.getSetRateAttitudeEulerMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateAttitudeEulerMethod = TelemetryServiceGrpc.getSetRateAttitudeEulerMethod) == null) {
          TelemetryServiceGrpc.getSetRateAttitudeEulerMethod = getSetRateAttitudeEulerMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest, io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateAttitudeEuler"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateAttitudeEulerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse> getSetRateCameraAttitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateCameraAttitude",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse> getSetRateCameraAttitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse> getSetRateCameraAttitudeMethod;
    if ((getSetRateCameraAttitudeMethod = TelemetryServiceGrpc.getSetRateCameraAttitudeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateCameraAttitudeMethod = TelemetryServiceGrpc.getSetRateCameraAttitudeMethod) == null) {
          TelemetryServiceGrpc.getSetRateCameraAttitudeMethod = getSetRateCameraAttitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateCameraAttitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateCameraAttitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse> getSetRateVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateVelocityNed",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse> getSetRateVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse> getSetRateVelocityNedMethod;
    if ((getSetRateVelocityNedMethod = TelemetryServiceGrpc.getSetRateVelocityNedMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateVelocityNedMethod = TelemetryServiceGrpc.getSetRateVelocityNedMethod) == null) {
          TelemetryServiceGrpc.getSetRateVelocityNedMethod = getSetRateVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse> getSetRateGpsInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateGpsInfo",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse> getSetRateGpsInfoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest, io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse> getSetRateGpsInfoMethod;
    if ((getSetRateGpsInfoMethod = TelemetryServiceGrpc.getSetRateGpsInfoMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateGpsInfoMethod = TelemetryServiceGrpc.getSetRateGpsInfoMethod) == null) {
          TelemetryServiceGrpc.getSetRateGpsInfoMethod = getSetRateGpsInfoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest, io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateGpsInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateGpsInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse> getSetRateBatteryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateBattery",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse> getSetRateBatteryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest, io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse> getSetRateBatteryMethod;
    if ((getSetRateBatteryMethod = TelemetryServiceGrpc.getSetRateBatteryMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateBatteryMethod = TelemetryServiceGrpc.getSetRateBatteryMethod) == null) {
          TelemetryServiceGrpc.getSetRateBatteryMethod = getSetRateBatteryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest, io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateBattery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateBatteryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse> getSetRateRcStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateRcStatus",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse> getSetRateRcStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest, io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse> getSetRateRcStatusMethod;
    if ((getSetRateRcStatusMethod = TelemetryServiceGrpc.getSetRateRcStatusMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateRcStatusMethod = TelemetryServiceGrpc.getSetRateRcStatusMethod) == null) {
          TelemetryServiceGrpc.getSetRateRcStatusMethod = getSetRateRcStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest, io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateRcStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateRcStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse> getSetRateActuatorControlTargetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateActuatorControlTarget",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse> getSetRateActuatorControlTargetMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest, io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse> getSetRateActuatorControlTargetMethod;
    if ((getSetRateActuatorControlTargetMethod = TelemetryServiceGrpc.getSetRateActuatorControlTargetMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateActuatorControlTargetMethod = TelemetryServiceGrpc.getSetRateActuatorControlTargetMethod) == null) {
          TelemetryServiceGrpc.getSetRateActuatorControlTargetMethod = getSetRateActuatorControlTargetMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest, io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateActuatorControlTarget"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateActuatorControlTargetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse> getSetRateActuatorOutputStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateActuatorOutputStatus",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse> getSetRateActuatorOutputStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest, io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse> getSetRateActuatorOutputStatusMethod;
    if ((getSetRateActuatorOutputStatusMethod = TelemetryServiceGrpc.getSetRateActuatorOutputStatusMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateActuatorOutputStatusMethod = TelemetryServiceGrpc.getSetRateActuatorOutputStatusMethod) == null) {
          TelemetryServiceGrpc.getSetRateActuatorOutputStatusMethod = getSetRateActuatorOutputStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest, io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateActuatorOutputStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateActuatorOutputStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse> getSetRateOdometryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateOdometry",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse> getSetRateOdometryMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest, io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse> getSetRateOdometryMethod;
    if ((getSetRateOdometryMethod = TelemetryServiceGrpc.getSetRateOdometryMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateOdometryMethod = TelemetryServiceGrpc.getSetRateOdometryMethod) == null) {
          TelemetryServiceGrpc.getSetRateOdometryMethod = getSetRateOdometryMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest, io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateOdometry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateOdometryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse> getSetRatePositionVelocityNedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRatePositionVelocityNed",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse> getSetRatePositionVelocityNedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse> getSetRatePositionVelocityNedMethod;
    if ((getSetRatePositionVelocityNedMethod = TelemetryServiceGrpc.getSetRatePositionVelocityNedMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRatePositionVelocityNedMethod = TelemetryServiceGrpc.getSetRatePositionVelocityNedMethod) == null) {
          TelemetryServiceGrpc.getSetRatePositionVelocityNedMethod = getSetRatePositionVelocityNedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest, io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRatePositionVelocityNed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRatePositionVelocityNedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse> getSetRateGroundTruthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateGroundTruth",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse> getSetRateGroundTruthMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest, io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse> getSetRateGroundTruthMethod;
    if ((getSetRateGroundTruthMethod = TelemetryServiceGrpc.getSetRateGroundTruthMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateGroundTruthMethod = TelemetryServiceGrpc.getSetRateGroundTruthMethod) == null) {
          TelemetryServiceGrpc.getSetRateGroundTruthMethod = getSetRateGroundTruthMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest, io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateGroundTruth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateGroundTruthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse> getSetRateFixedwingMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateFixedwingMetrics",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse> getSetRateFixedwingMetricsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest, io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse> getSetRateFixedwingMetricsMethod;
    if ((getSetRateFixedwingMetricsMethod = TelemetryServiceGrpc.getSetRateFixedwingMetricsMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateFixedwingMetricsMethod = TelemetryServiceGrpc.getSetRateFixedwingMetricsMethod) == null) {
          TelemetryServiceGrpc.getSetRateFixedwingMetricsMethod = getSetRateFixedwingMetricsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest, io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateFixedwingMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateFixedwingMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse> getSetRateImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateImu",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse> getSetRateImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest, io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse> getSetRateImuMethod;
    if ((getSetRateImuMethod = TelemetryServiceGrpc.getSetRateImuMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateImuMethod = TelemetryServiceGrpc.getSetRateImuMethod) == null) {
          TelemetryServiceGrpc.getSetRateImuMethod = getSetRateImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest, io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse> getSetRateScaledImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateScaledImu",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse> getSetRateScaledImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest, io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse> getSetRateScaledImuMethod;
    if ((getSetRateScaledImuMethod = TelemetryServiceGrpc.getSetRateScaledImuMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateScaledImuMethod = TelemetryServiceGrpc.getSetRateScaledImuMethod) == null) {
          TelemetryServiceGrpc.getSetRateScaledImuMethod = getSetRateScaledImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest, io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateScaledImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateScaledImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse> getSetRateRawImuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateRawImu",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse> getSetRateRawImuMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest, io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse> getSetRateRawImuMethod;
    if ((getSetRateRawImuMethod = TelemetryServiceGrpc.getSetRateRawImuMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateRawImuMethod = TelemetryServiceGrpc.getSetRateRawImuMethod) == null) {
          TelemetryServiceGrpc.getSetRateRawImuMethod = getSetRateRawImuMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest, io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateRawImu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateRawImuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse> getSetRateUnixEpochTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateUnixEpochTime",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse> getSetRateUnixEpochTimeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse> getSetRateUnixEpochTimeMethod;
    if ((getSetRateUnixEpochTimeMethod = TelemetryServiceGrpc.getSetRateUnixEpochTimeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateUnixEpochTimeMethod = TelemetryServiceGrpc.getSetRateUnixEpochTimeMethod) == null) {
          TelemetryServiceGrpc.getSetRateUnixEpochTimeMethod = getSetRateUnixEpochTimeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateUnixEpochTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateUnixEpochTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse> getSetRateDistanceSensorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateDistanceSensor",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse> getSetRateDistanceSensorMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest, io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse> getSetRateDistanceSensorMethod;
    if ((getSetRateDistanceSensorMethod = TelemetryServiceGrpc.getSetRateDistanceSensorMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateDistanceSensorMethod = TelemetryServiceGrpc.getSetRateDistanceSensorMethod) == null) {
          TelemetryServiceGrpc.getSetRateDistanceSensorMethod = getSetRateDistanceSensorMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest, io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateDistanceSensor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateDistanceSensorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse> getSetRateAltitudeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRateAltitude",
      requestType = io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest,
      io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse> getSetRateAltitudeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse> getSetRateAltitudeMethod;
    if ((getSetRateAltitudeMethod = TelemetryServiceGrpc.getSetRateAltitudeMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getSetRateAltitudeMethod = TelemetryServiceGrpc.getSetRateAltitudeMethod) == null) {
          TelemetryServiceGrpc.getSetRateAltitudeMethod = getSetRateAltitudeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest, io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetRateAltitude"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetRateAltitudeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest,
      io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse> getGetGpsGlobalOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGpsGlobalOrigin",
      requestType = io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest.class,
      responseType = io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest,
      io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse> getGetGpsGlobalOriginMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest, io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse> getGetGpsGlobalOriginMethod;
    if ((getGetGpsGlobalOriginMethod = TelemetryServiceGrpc.getGetGpsGlobalOriginMethod) == null) {
      synchronized (TelemetryServiceGrpc.class) {
        if ((getGetGpsGlobalOriginMethod = TelemetryServiceGrpc.getGetGpsGlobalOriginMethod) == null) {
          TelemetryServiceGrpc.getGetGpsGlobalOriginMethod = getGetGpsGlobalOriginMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest, io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGpsGlobalOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetGpsGlobalOriginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TelemetryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TelemetryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TelemetryServiceStub>() {
        @java.lang.Override
        public TelemetryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TelemetryServiceStub(channel, callOptions);
        }
      };
    return TelemetryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TelemetryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TelemetryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TelemetryServiceBlockingStub>() {
        @java.lang.Override
        public TelemetryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TelemetryServiceBlockingStub(channel, callOptions);
        }
      };
    return TelemetryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TelemetryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TelemetryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TelemetryServiceFutureStub>() {
        @java.lang.Override
        public TelemetryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TelemetryServiceFutureStub(channel, callOptions);
        }
      };
    return TelemetryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Allow users to get vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Subscribe to 'position' updates.
     * </pre>
     */
    default void subscribePosition(io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.PositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'home position' updates.
     * </pre>
     */
    default void subscribeHome(io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HomeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeHomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to in-air updates.
     * </pre>
     */
    default void subscribeInAir(io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.InAirResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeInAirMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to landed state updates
     * </pre>
     */
    default void subscribeLandedState(io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.LandedStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeLandedStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to armed updates.
     * </pre>
     */
    default void subscribeArmed(io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ArmedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeArmedMethod(), responseObserver);
    }

    /**
     * <pre>
     * subscribe to vtol state Updates
     * </pre>
     */
    default void subscribeVtolState(io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.VtolStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeVtolStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (quaternion).
     * </pre>
     */
    default void subscribeAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeAttitudeQuaternionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (Euler).
     * </pre>
     */
    default void subscribeAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeAttitudeEulerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (angular velocity)
     * </pre>
     */
    default void subscribeAttitudeAngularVelocityBody(io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeAttitudeAngularVelocityBodyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'camera attitude' updates (quaternion).
     * </pre>
     */
    default void subscribeCameraAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCameraAttitudeQuaternionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'camera attitude' updates (Euler).
     * </pre>
     */
    default void subscribeCameraAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCameraAttitudeEulerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'ground speed' updates (NED).
     * </pre>
     */
    default void subscribeVelocityNed(io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'GPS info' updates.
     * </pre>
     */
    default void subscribeGpsInfo(io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeGpsInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Raw GPS' updates.
     * </pre>
     */
    default void subscribeRawGps(io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RawGpsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeRawGpsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'battery' updates.
     * </pre>
     */
    default void subscribeBattery(io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.BatteryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeBatteryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'flight mode' updates.
     * </pre>
     */
    default void subscribeFlightMode(io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.FlightModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeFlightModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'health' updates.
     * </pre>
     */
    default void subscribeHealth(io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HealthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeHealthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'RC status' updates.
     * </pre>
     */
    default void subscribeRcStatus(io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RcStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeRcStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'status text' updates.
     * </pre>
     */
    default void subscribeStatusText(io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.StatusTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStatusTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'actuator control target' updates.
     * </pre>
     */
    default void subscribeActuatorControlTarget(io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeActuatorControlTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'actuator output status' updates.
     * </pre>
     */
    default void subscribeActuatorOutputStatus(io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeActuatorOutputStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'odometry' updates.
     * </pre>
     */
    default void subscribeOdometry(io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.OdometryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeOdometryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'position velocity' updates.
     * </pre>
     */
    default void subscribePositionVelocityNed(io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribePositionVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'ground truth' updates.
     * </pre>
     */
    default void subscribeGroundTruth(io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeGroundTruthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'fixedwing metrics' updates.
     * </pre>
     */
    default void subscribeFixedwingMetrics(io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeFixedwingMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    default void subscribeImu(io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Scaled IMU' updates.
     * </pre>
     */
    default void subscribeScaledImu(io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeScaledImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Raw IMU' updates.
     * </pre>
     */
    default void subscribeRawImu(io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RawImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeRawImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'HealthAllOk' updates.
     * </pre>
     */
    default void subscribeHealthAllOk(io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeHealthAllOkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'unix epoch time' updates.
     * </pre>
     */
    default void subscribeUnixEpochTime(io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeUnixEpochTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Distance Sensor' updates.
     * </pre>
     */
    default void subscribeDistanceSensor(io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeDistanceSensorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Scaled Pressure' updates.
     * </pre>
     */
    default void subscribeScaledPressure(io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeScaledPressureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Heading' updates.
     * </pre>
     */
    default void subscribeHeading(io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HeadingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeHeadingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Altitude' updates.
     * </pre>
     */
    default void subscribeAltitude(io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'position' updates.
     * </pre>
     */
    default void setRatePosition(io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRatePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'home position' updates.
     * </pre>
     */
    default void setRateHome(io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateHomeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to in-air updates.
     * </pre>
     */
    default void setRateInAir(io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateInAirMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to landed state updates
     * </pre>
     */
    default void setRateLandedState(io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateLandedStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to VTOL state updates
     * </pre>
     */
    default void setRateVtolState(io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateVtolStateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'attitude euler angle' updates.
     * </pre>
     */
    default void setRateAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateAttitudeQuaternionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'attitude quaternion' updates.
     * </pre>
     */
    default void setRateAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateAttitudeEulerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate of camera attitude updates.
     * </pre>
     */
    default void setRateCameraAttitude(io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateCameraAttitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'ground speed' updates (NED).
     * </pre>
     */
    default void setRateVelocityNed(io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'GPS info' updates.
     * </pre>
     */
    default void setRateGpsInfo(io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateGpsInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'battery' updates.
     * </pre>
     */
    default void setRateBattery(io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateBatteryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'RC status' updates.
     * </pre>
     */
    default void setRateRcStatus(io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateRcStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'actuator control target' updates.
     * </pre>
     */
    default void setRateActuatorControlTarget(io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateActuatorControlTargetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'actuator output status' updates.
     * </pre>
     */
    default void setRateActuatorOutputStatus(io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateActuatorOutputStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'odometry' updates.
     * </pre>
     */
    default void setRateOdometry(io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateOdometryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'position velocity' updates.
     * </pre>
     */
    default void setRatePositionVelocityNed(io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRatePositionVelocityNedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'ground truth' updates.
     * </pre>
     */
    default void setRateGroundTruth(io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateGroundTruthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'fixedwing metrics' updates.
     * </pre>
     */
    default void setRateFixedwingMetrics(io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateFixedwingMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'IMU' updates.
     * </pre>
     */
    default void setRateImu(io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Scaled IMU' updates.
     * </pre>
     */
    default void setRateScaledImu(io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateScaledImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Raw IMU' updates.
     * </pre>
     */
    default void setRateRawImu(io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateRawImuMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'unix epoch time' updates.
     * </pre>
     */
    default void setRateUnixEpochTime(io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateUnixEpochTimeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Distance Sensor' updates.
     * </pre>
     */
    default void setRateDistanceSensor(io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateDistanceSensorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Altitude' updates.
     * </pre>
     */
    default void setRateAltitude(io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetRateAltitudeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the GPS location of where the estimator has been initialized.
     * </pre>
     */
    default void getGpsGlobalOrigin(io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGpsGlobalOriginMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TelemetryService.
   * <pre>
   * Allow users to get vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static abstract class TelemetryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TelemetryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TelemetryService.
   * <pre>
   * Allow users to get vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static final class TelemetryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TelemetryServiceStub> {
    private TelemetryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TelemetryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TelemetryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'position' updates.
     * </pre>
     */
    public void subscribePosition(io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.PositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'home position' updates.
     * </pre>
     */
    public void subscribeHome(io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HomeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeHomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to in-air updates.
     * </pre>
     */
    public void subscribeInAir(io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.InAirResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeInAirMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to landed state updates
     * </pre>
     */
    public void subscribeLandedState(io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.LandedStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeLandedStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to armed updates.
     * </pre>
     */
    public void subscribeArmed(io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ArmedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeArmedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * subscribe to vtol state Updates
     * </pre>
     */
    public void subscribeVtolState(io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.VtolStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeVtolStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (quaternion).
     * </pre>
     */
    public void subscribeAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeAttitudeQuaternionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (Euler).
     * </pre>
     */
    public void subscribeAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeAttitudeEulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (angular velocity)
     * </pre>
     */
    public void subscribeAttitudeAngularVelocityBody(io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeAttitudeAngularVelocityBodyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'camera attitude' updates (quaternion).
     * </pre>
     */
    public void subscribeCameraAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCameraAttitudeQuaternionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'camera attitude' updates (Euler).
     * </pre>
     */
    public void subscribeCameraAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCameraAttitudeEulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'ground speed' updates (NED).
     * </pre>
     */
    public void subscribeVelocityNed(io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'GPS info' updates.
     * </pre>
     */
    public void subscribeGpsInfo(io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeGpsInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Raw GPS' updates.
     * </pre>
     */
    public void subscribeRawGps(io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RawGpsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeRawGpsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'battery' updates.
     * </pre>
     */
    public void subscribeBattery(io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.BatteryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeBatteryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'flight mode' updates.
     * </pre>
     */
    public void subscribeFlightMode(io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.FlightModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeFlightModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'health' updates.
     * </pre>
     */
    public void subscribeHealth(io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HealthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'RC status' updates.
     * </pre>
     */
    public void subscribeRcStatus(io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RcStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeRcStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'status text' updates.
     * </pre>
     */
    public void subscribeStatusText(io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.StatusTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStatusTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'actuator control target' updates.
     * </pre>
     */
    public void subscribeActuatorControlTarget(io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeActuatorControlTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'actuator output status' updates.
     * </pre>
     */
    public void subscribeActuatorOutputStatus(io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeActuatorOutputStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'odometry' updates.
     * </pre>
     */
    public void subscribeOdometry(io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.OdometryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeOdometryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'position velocity' updates.
     * </pre>
     */
    public void subscribePositionVelocityNed(io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribePositionVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'ground truth' updates.
     * </pre>
     */
    public void subscribeGroundTruth(io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeGroundTruthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'fixedwing metrics' updates.
     * </pre>
     */
    public void subscribeFixedwingMetrics(io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeFixedwingMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    public void subscribeImu(io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Scaled IMU' updates.
     * </pre>
     */
    public void subscribeScaledImu(io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeScaledImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Raw IMU' updates.
     * </pre>
     */
    public void subscribeRawImu(io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RawImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeRawImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'HealthAllOk' updates.
     * </pre>
     */
    public void subscribeHealthAllOk(io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeHealthAllOkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'unix epoch time' updates.
     * </pre>
     */
    public void subscribeUnixEpochTime(io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeUnixEpochTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Distance Sensor' updates.
     * </pre>
     */
    public void subscribeDistanceSensor(io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeDistanceSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Scaled Pressure' updates.
     * </pre>
     */
    public void subscribeScaledPressure(io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeScaledPressureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Heading' updates.
     * </pre>
     */
    public void subscribeHeading(io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HeadingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeHeadingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to 'Altitude' updates.
     * </pre>
     */
    public void subscribeAltitude(io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'position' updates.
     * </pre>
     */
    public void setRatePosition(io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRatePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'home position' updates.
     * </pre>
     */
    public void setRateHome(io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateHomeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to in-air updates.
     * </pre>
     */
    public void setRateInAir(io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateInAirMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to landed state updates
     * </pre>
     */
    public void setRateLandedState(io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateLandedStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to VTOL state updates
     * </pre>
     */
    public void setRateVtolState(io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateVtolStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'attitude euler angle' updates.
     * </pre>
     */
    public void setRateAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateAttitudeQuaternionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'attitude quaternion' updates.
     * </pre>
     */
    public void setRateAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateAttitudeEulerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate of camera attitude updates.
     * </pre>
     */
    public void setRateCameraAttitude(io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateCameraAttitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'ground speed' updates (NED).
     * </pre>
     */
    public void setRateVelocityNed(io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'GPS info' updates.
     * </pre>
     */
    public void setRateGpsInfo(io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateGpsInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'battery' updates.
     * </pre>
     */
    public void setRateBattery(io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateBatteryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'RC status' updates.
     * </pre>
     */
    public void setRateRcStatus(io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateRcStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'actuator control target' updates.
     * </pre>
     */
    public void setRateActuatorControlTarget(io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateActuatorControlTargetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'actuator output status' updates.
     * </pre>
     */
    public void setRateActuatorOutputStatus(io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateActuatorOutputStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'odometry' updates.
     * </pre>
     */
    public void setRateOdometry(io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateOdometryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'position velocity' updates.
     * </pre>
     */
    public void setRatePositionVelocityNed(io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRatePositionVelocityNedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'ground truth' updates.
     * </pre>
     */
    public void setRateGroundTruth(io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateGroundTruthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'fixedwing metrics' updates.
     * </pre>
     */
    public void setRateFixedwingMetrics(io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateFixedwingMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'IMU' updates.
     * </pre>
     */
    public void setRateImu(io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Scaled IMU' updates.
     * </pre>
     */
    public void setRateScaledImu(io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateScaledImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Raw IMU' updates.
     * </pre>
     */
    public void setRateRawImu(io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateRawImuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'unix epoch time' updates.
     * </pre>
     */
    public void setRateUnixEpochTime(io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateUnixEpochTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Distance Sensor' updates.
     * </pre>
     */
    public void setRateDistanceSensor(io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateDistanceSensorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set rate to 'Altitude' updates.
     * </pre>
     */
    public void setRateAltitude(io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetRateAltitudeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the GPS location of where the estimator has been initialized.
     * </pre>
     */
    public void getGpsGlobalOrigin(io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGpsGlobalOriginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TelemetryService.
   * <pre>
   * Allow users to get vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static final class TelemetryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TelemetryServiceBlockingStub> {
    private TelemetryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TelemetryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TelemetryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Subscribe to 'position' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.PositionResponse> subscribePosition(
        io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'home position' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.HomeResponse> subscribeHome(
        io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeHomeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to in-air updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.InAirResponse> subscribeInAir(
        io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeInAirMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to landed state updates
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.LandedStateResponse> subscribeLandedState(
        io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeLandedStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to armed updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.ArmedResponse> subscribeArmed(
        io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeArmedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * subscribe to vtol state Updates
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.VtolStateResponse> subscribeVtolState(
        io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeVtolStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (quaternion).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse> subscribeAttitudeQuaternion(
        io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeAttitudeQuaternionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (Euler).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse> subscribeAttitudeEuler(
        io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeAttitudeEulerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'attitude' updates (angular velocity)
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse> subscribeAttitudeAngularVelocityBody(
        io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeAttitudeAngularVelocityBodyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'camera attitude' updates (quaternion).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse> subscribeCameraAttitudeQuaternion(
        io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCameraAttitudeQuaternionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'camera attitude' updates (Euler).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse> subscribeCameraAttitudeEuler(
        io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCameraAttitudeEulerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'ground speed' updates (NED).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse> subscribeVelocityNed(
        io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'GPS info' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse> subscribeGpsInfo(
        io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeGpsInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Raw GPS' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.RawGpsResponse> subscribeRawGps(
        io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeRawGpsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'battery' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.BatteryResponse> subscribeBattery(
        io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeBatteryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'flight mode' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.FlightModeResponse> subscribeFlightMode(
        io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeFlightModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'health' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.HealthResponse> subscribeHealth(
        io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeHealthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'RC status' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.RcStatusResponse> subscribeRcStatus(
        io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeRcStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'status text' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.StatusTextResponse> subscribeStatusText(
        io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStatusTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'actuator control target' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse> subscribeActuatorControlTarget(
        io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeActuatorControlTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'actuator output status' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse> subscribeActuatorOutputStatus(
        io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeActuatorOutputStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'odometry' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.OdometryResponse> subscribeOdometry(
        io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeOdometryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'position velocity' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse> subscribePositionVelocityNed(
        io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribePositionVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'ground truth' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse> subscribeGroundTruth(
        io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeGroundTruthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'fixedwing metrics' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse> subscribeFixedwingMetrics(
        io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeFixedwingMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'IMU' updates (in SI units in NED body frame).
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.ImuResponse> subscribeImu(
        io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Scaled IMU' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse> subscribeScaledImu(
        io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeScaledImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Raw IMU' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.RawImuResponse> subscribeRawImu(
        io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeRawImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'HealthAllOk' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse> subscribeHealthAllOk(
        io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeHealthAllOkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'unix epoch time' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse> subscribeUnixEpochTime(
        io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeUnixEpochTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Distance Sensor' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse> subscribeDistanceSensor(
        io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeDistanceSensorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Scaled Pressure' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse> subscribeScaledPressure(
        io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeScaledPressureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Heading' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.HeadingResponse> subscribeHeading(
        io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeHeadingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to 'Altitude' updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.telemetry.TelemetryProto.AltitudeResponse> subscribeAltitude(
        io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'position' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse setRatePosition(io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRatePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'home position' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse setRateHome(io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateHomeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to in-air updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse setRateInAir(io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateInAirMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to landed state updates
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse setRateLandedState(io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateLandedStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to VTOL state updates
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse setRateVtolState(io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateVtolStateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'attitude euler angle' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse setRateAttitudeQuaternion(io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateAttitudeQuaternionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'attitude quaternion' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse setRateAttitudeEuler(io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateAttitudeEulerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate of camera attitude updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse setRateCameraAttitude(io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateCameraAttitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'ground speed' updates (NED).
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse setRateVelocityNed(io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'GPS info' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse setRateGpsInfo(io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateGpsInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'battery' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse setRateBattery(io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateBatteryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'RC status' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse setRateRcStatus(io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateRcStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'actuator control target' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse setRateActuatorControlTarget(io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateActuatorControlTargetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'actuator output status' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse setRateActuatorOutputStatus(io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateActuatorOutputStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'odometry' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse setRateOdometry(io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateOdometryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'position velocity' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse setRatePositionVelocityNed(io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRatePositionVelocityNedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'ground truth' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse setRateGroundTruth(io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateGroundTruthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'fixedwing metrics' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse setRateFixedwingMetrics(io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateFixedwingMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'IMU' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse setRateImu(io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'Scaled IMU' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse setRateScaledImu(io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateScaledImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'Raw IMU' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse setRateRawImu(io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateRawImuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'unix epoch time' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse setRateUnixEpochTime(io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateUnixEpochTimeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'Distance Sensor' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse setRateDistanceSensor(io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateDistanceSensorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set rate to 'Altitude' updates.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse setRateAltitude(io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetRateAltitudeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the GPS location of where the estimator has been initialized.
     * </pre>
     */
    public io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse getGpsGlobalOrigin(io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGpsGlobalOriginMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TelemetryService.
   * <pre>
   * Allow users to get vehicle telemetry and state information
   * (e.g. battery, GPS, RC connection, flight mode etc.) and set telemetry update rates.
   * </pre>
   */
  public static final class TelemetryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TelemetryServiceFutureStub> {
    private TelemetryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TelemetryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TelemetryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Set rate to 'position' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse> setRatePosition(
        io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRatePositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'home position' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse> setRateHome(
        io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateHomeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to in-air updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse> setRateInAir(
        io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateInAirMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to landed state updates
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse> setRateLandedState(
        io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateLandedStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to VTOL state updates
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse> setRateVtolState(
        io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateVtolStateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'attitude euler angle' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse> setRateAttitudeQuaternion(
        io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateAttitudeQuaternionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'attitude quaternion' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse> setRateAttitudeEuler(
        io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateAttitudeEulerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate of camera attitude updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse> setRateCameraAttitude(
        io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateCameraAttitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'ground speed' updates (NED).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse> setRateVelocityNed(
        io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateVelocityNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'GPS info' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse> setRateGpsInfo(
        io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateGpsInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'battery' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse> setRateBattery(
        io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateBatteryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'RC status' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse> setRateRcStatus(
        io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateRcStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'actuator control target' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse> setRateActuatorControlTarget(
        io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateActuatorControlTargetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'actuator output status' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse> setRateActuatorOutputStatus(
        io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateActuatorOutputStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'odometry' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse> setRateOdometry(
        io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateOdometryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'position velocity' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse> setRatePositionVelocityNed(
        io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRatePositionVelocityNedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'ground truth' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse> setRateGroundTruth(
        io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateGroundTruthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'fixedwing metrics' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse> setRateFixedwingMetrics(
        io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateFixedwingMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'IMU' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse> setRateImu(
        io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateImuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'Scaled IMU' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse> setRateScaledImu(
        io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateScaledImuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'Raw IMU' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse> setRateRawImu(
        io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateRawImuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'unix epoch time' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse> setRateUnixEpochTime(
        io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateUnixEpochTimeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'Distance Sensor' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse> setRateDistanceSensor(
        io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateDistanceSensorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set rate to 'Altitude' updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse> setRateAltitude(
        io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetRateAltitudeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the GPS location of where the estimator has been initialized.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse> getGpsGlobalOrigin(
        io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGpsGlobalOriginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIBE_POSITION = 0;
  private static final int METHODID_SUBSCRIBE_HOME = 1;
  private static final int METHODID_SUBSCRIBE_IN_AIR = 2;
  private static final int METHODID_SUBSCRIBE_LANDED_STATE = 3;
  private static final int METHODID_SUBSCRIBE_ARMED = 4;
  private static final int METHODID_SUBSCRIBE_VTOL_STATE = 5;
  private static final int METHODID_SUBSCRIBE_ATTITUDE_QUATERNION = 6;
  private static final int METHODID_SUBSCRIBE_ATTITUDE_EULER = 7;
  private static final int METHODID_SUBSCRIBE_ATTITUDE_ANGULAR_VELOCITY_BODY = 8;
  private static final int METHODID_SUBSCRIBE_CAMERA_ATTITUDE_QUATERNION = 9;
  private static final int METHODID_SUBSCRIBE_CAMERA_ATTITUDE_EULER = 10;
  private static final int METHODID_SUBSCRIBE_VELOCITY_NED = 11;
  private static final int METHODID_SUBSCRIBE_GPS_INFO = 12;
  private static final int METHODID_SUBSCRIBE_RAW_GPS = 13;
  private static final int METHODID_SUBSCRIBE_BATTERY = 14;
  private static final int METHODID_SUBSCRIBE_FLIGHT_MODE = 15;
  private static final int METHODID_SUBSCRIBE_HEALTH = 16;
  private static final int METHODID_SUBSCRIBE_RC_STATUS = 17;
  private static final int METHODID_SUBSCRIBE_STATUS_TEXT = 18;
  private static final int METHODID_SUBSCRIBE_ACTUATOR_CONTROL_TARGET = 19;
  private static final int METHODID_SUBSCRIBE_ACTUATOR_OUTPUT_STATUS = 20;
  private static final int METHODID_SUBSCRIBE_ODOMETRY = 21;
  private static final int METHODID_SUBSCRIBE_POSITION_VELOCITY_NED = 22;
  private static final int METHODID_SUBSCRIBE_GROUND_TRUTH = 23;
  private static final int METHODID_SUBSCRIBE_FIXEDWING_METRICS = 24;
  private static final int METHODID_SUBSCRIBE_IMU = 25;
  private static final int METHODID_SUBSCRIBE_SCALED_IMU = 26;
  private static final int METHODID_SUBSCRIBE_RAW_IMU = 27;
  private static final int METHODID_SUBSCRIBE_HEALTH_ALL_OK = 28;
  private static final int METHODID_SUBSCRIBE_UNIX_EPOCH_TIME = 29;
  private static final int METHODID_SUBSCRIBE_DISTANCE_SENSOR = 30;
  private static final int METHODID_SUBSCRIBE_SCALED_PRESSURE = 31;
  private static final int METHODID_SUBSCRIBE_HEADING = 32;
  private static final int METHODID_SUBSCRIBE_ALTITUDE = 33;
  private static final int METHODID_SET_RATE_POSITION = 34;
  private static final int METHODID_SET_RATE_HOME = 35;
  private static final int METHODID_SET_RATE_IN_AIR = 36;
  private static final int METHODID_SET_RATE_LANDED_STATE = 37;
  private static final int METHODID_SET_RATE_VTOL_STATE = 38;
  private static final int METHODID_SET_RATE_ATTITUDE_QUATERNION = 39;
  private static final int METHODID_SET_RATE_ATTITUDE_EULER = 40;
  private static final int METHODID_SET_RATE_CAMERA_ATTITUDE = 41;
  private static final int METHODID_SET_RATE_VELOCITY_NED = 42;
  private static final int METHODID_SET_RATE_GPS_INFO = 43;
  private static final int METHODID_SET_RATE_BATTERY = 44;
  private static final int METHODID_SET_RATE_RC_STATUS = 45;
  private static final int METHODID_SET_RATE_ACTUATOR_CONTROL_TARGET = 46;
  private static final int METHODID_SET_RATE_ACTUATOR_OUTPUT_STATUS = 47;
  private static final int METHODID_SET_RATE_ODOMETRY = 48;
  private static final int METHODID_SET_RATE_POSITION_VELOCITY_NED = 49;
  private static final int METHODID_SET_RATE_GROUND_TRUTH = 50;
  private static final int METHODID_SET_RATE_FIXEDWING_METRICS = 51;
  private static final int METHODID_SET_RATE_IMU = 52;
  private static final int METHODID_SET_RATE_SCALED_IMU = 53;
  private static final int METHODID_SET_RATE_RAW_IMU = 54;
  private static final int METHODID_SET_RATE_UNIX_EPOCH_TIME = 55;
  private static final int METHODID_SET_RATE_DISTANCE_SENSOR = 56;
  private static final int METHODID_SET_RATE_ALTITUDE = 57;
  private static final int METHODID_GET_GPS_GLOBAL_ORIGIN = 58;

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
        case METHODID_SUBSCRIBE_POSITION:
          serviceImpl.subscribePosition((io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.PositionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_HOME:
          serviceImpl.subscribeHome((io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HomeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_IN_AIR:
          serviceImpl.subscribeInAir((io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.InAirResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_LANDED_STATE:
          serviceImpl.subscribeLandedState((io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.LandedStateResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ARMED:
          serviceImpl.subscribeArmed((io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ArmedResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_VTOL_STATE:
          serviceImpl.subscribeVtolState((io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.VtolStateResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ATTITUDE_QUATERNION:
          serviceImpl.subscribeAttitudeQuaternion((io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ATTITUDE_EULER:
          serviceImpl.subscribeAttitudeEuler((io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ATTITUDE_ANGULAR_VELOCITY_BODY:
          serviceImpl.subscribeAttitudeAngularVelocityBody((io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CAMERA_ATTITUDE_QUATERNION:
          serviceImpl.subscribeCameraAttitudeQuaternion((io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CAMERA_ATTITUDE_EULER:
          serviceImpl.subscribeCameraAttitudeEuler((io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_VELOCITY_NED:
          serviceImpl.subscribeVelocityNed((io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_GPS_INFO:
          serviceImpl.subscribeGpsInfo((io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_RAW_GPS:
          serviceImpl.subscribeRawGps((io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RawGpsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_BATTERY:
          serviceImpl.subscribeBattery((io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.BatteryResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FLIGHT_MODE:
          serviceImpl.subscribeFlightMode((io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.FlightModeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_HEALTH:
          serviceImpl.subscribeHealth((io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HealthResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_RC_STATUS:
          serviceImpl.subscribeRcStatus((io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RcStatusResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_STATUS_TEXT:
          serviceImpl.subscribeStatusText((io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.StatusTextResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ACTUATOR_CONTROL_TARGET:
          serviceImpl.subscribeActuatorControlTarget((io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ACTUATOR_OUTPUT_STATUS:
          serviceImpl.subscribeActuatorOutputStatus((io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ODOMETRY:
          serviceImpl.subscribeOdometry((io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.OdometryResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_POSITION_VELOCITY_NED:
          serviceImpl.subscribePositionVelocityNed((io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_GROUND_TRUTH:
          serviceImpl.subscribeGroundTruth((io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FIXEDWING_METRICS:
          serviceImpl.subscribeFixedwingMetrics((io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_IMU:
          serviceImpl.subscribeImu((io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ImuResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SCALED_IMU:
          serviceImpl.subscribeScaledImu((io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_RAW_IMU:
          serviceImpl.subscribeRawImu((io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.RawImuResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_HEALTH_ALL_OK:
          serviceImpl.subscribeHealthAllOk((io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_UNIX_EPOCH_TIME:
          serviceImpl.subscribeUnixEpochTime((io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_DISTANCE_SENSOR:
          serviceImpl.subscribeDistanceSensor((io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SCALED_PRESSURE:
          serviceImpl.subscribeScaledPressure((io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_HEADING:
          serviceImpl.subscribeHeading((io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.HeadingResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ALTITUDE:
          serviceImpl.subscribeAltitude((io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.AltitudeResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_POSITION:
          serviceImpl.setRatePosition((io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_HOME:
          serviceImpl.setRateHome((io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_IN_AIR:
          serviceImpl.setRateInAir((io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_LANDED_STATE:
          serviceImpl.setRateLandedState((io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_VTOL_STATE:
          serviceImpl.setRateVtolState((io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_ATTITUDE_QUATERNION:
          serviceImpl.setRateAttitudeQuaternion((io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_ATTITUDE_EULER:
          serviceImpl.setRateAttitudeEuler((io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_CAMERA_ATTITUDE:
          serviceImpl.setRateCameraAttitude((io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_VELOCITY_NED:
          serviceImpl.setRateVelocityNed((io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_GPS_INFO:
          serviceImpl.setRateGpsInfo((io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_BATTERY:
          serviceImpl.setRateBattery((io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_RC_STATUS:
          serviceImpl.setRateRcStatus((io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_ACTUATOR_CONTROL_TARGET:
          serviceImpl.setRateActuatorControlTarget((io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_ACTUATOR_OUTPUT_STATUS:
          serviceImpl.setRateActuatorOutputStatus((io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_ODOMETRY:
          serviceImpl.setRateOdometry((io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_POSITION_VELOCITY_NED:
          serviceImpl.setRatePositionVelocityNed((io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_GROUND_TRUTH:
          serviceImpl.setRateGroundTruth((io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_FIXEDWING_METRICS:
          serviceImpl.setRateFixedwingMetrics((io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_IMU:
          serviceImpl.setRateImu((io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_SCALED_IMU:
          serviceImpl.setRateScaledImu((io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_RAW_IMU:
          serviceImpl.setRateRawImu((io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_UNIX_EPOCH_TIME:
          serviceImpl.setRateUnixEpochTime((io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_DISTANCE_SENSOR:
          serviceImpl.setRateDistanceSensor((io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse>) responseObserver);
          break;
        case METHODID_SET_RATE_ALTITUDE:
          serviceImpl.setRateAltitude((io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse>) responseObserver);
          break;
        case METHODID_GET_GPS_GLOBAL_ORIGIN:
          serviceImpl.getGpsGlobalOrigin((io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse>) responseObserver);
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
          getSubscribePositionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribePositionRequest,
              io.mavsdk.telemetry.TelemetryProto.PositionResponse>(
                service, METHODID_SUBSCRIBE_POSITION)))
        .addMethod(
          getSubscribeHomeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeHomeRequest,
              io.mavsdk.telemetry.TelemetryProto.HomeResponse>(
                service, METHODID_SUBSCRIBE_HOME)))
        .addMethod(
          getSubscribeInAirMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeInAirRequest,
              io.mavsdk.telemetry.TelemetryProto.InAirResponse>(
                service, METHODID_SUBSCRIBE_IN_AIR)))
        .addMethod(
          getSubscribeLandedStateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeLandedStateRequest,
              io.mavsdk.telemetry.TelemetryProto.LandedStateResponse>(
                service, METHODID_SUBSCRIBE_LANDED_STATE)))
        .addMethod(
          getSubscribeArmedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeArmedRequest,
              io.mavsdk.telemetry.TelemetryProto.ArmedResponse>(
                service, METHODID_SUBSCRIBE_ARMED)))
        .addMethod(
          getSubscribeVtolStateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeVtolStateRequest,
              io.mavsdk.telemetry.TelemetryProto.VtolStateResponse>(
                service, METHODID_SUBSCRIBE_VTOL_STATE)))
        .addMethod(
          getSubscribeAttitudeQuaternionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeQuaternionRequest,
              io.mavsdk.telemetry.TelemetryProto.AttitudeQuaternionResponse>(
                service, METHODID_SUBSCRIBE_ATTITUDE_QUATERNION)))
        .addMethod(
          getSubscribeAttitudeEulerMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeEulerRequest,
              io.mavsdk.telemetry.TelemetryProto.AttitudeEulerResponse>(
                service, METHODID_SUBSCRIBE_ATTITUDE_EULER)))
        .addMethod(
          getSubscribeAttitudeAngularVelocityBodyMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeAttitudeAngularVelocityBodyRequest,
              io.mavsdk.telemetry.TelemetryProto.AttitudeAngularVelocityBodyResponse>(
                service, METHODID_SUBSCRIBE_ATTITUDE_ANGULAR_VELOCITY_BODY)))
        .addMethod(
          getSubscribeCameraAttitudeQuaternionMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeQuaternionRequest,
              io.mavsdk.telemetry.TelemetryProto.CameraAttitudeQuaternionResponse>(
                service, METHODID_SUBSCRIBE_CAMERA_ATTITUDE_QUATERNION)))
        .addMethod(
          getSubscribeCameraAttitudeEulerMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeCameraAttitudeEulerRequest,
              io.mavsdk.telemetry.TelemetryProto.CameraAttitudeEulerResponse>(
                service, METHODID_SUBSCRIBE_CAMERA_ATTITUDE_EULER)))
        .addMethod(
          getSubscribeVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeVelocityNedRequest,
              io.mavsdk.telemetry.TelemetryProto.VelocityNedResponse>(
                service, METHODID_SUBSCRIBE_VELOCITY_NED)))
        .addMethod(
          getSubscribeGpsInfoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeGpsInfoRequest,
              io.mavsdk.telemetry.TelemetryProto.GpsInfoResponse>(
                service, METHODID_SUBSCRIBE_GPS_INFO)))
        .addMethod(
          getSubscribeRawGpsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeRawGpsRequest,
              io.mavsdk.telemetry.TelemetryProto.RawGpsResponse>(
                service, METHODID_SUBSCRIBE_RAW_GPS)))
        .addMethod(
          getSubscribeBatteryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeBatteryRequest,
              io.mavsdk.telemetry.TelemetryProto.BatteryResponse>(
                service, METHODID_SUBSCRIBE_BATTERY)))
        .addMethod(
          getSubscribeFlightModeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeFlightModeRequest,
              io.mavsdk.telemetry.TelemetryProto.FlightModeResponse>(
                service, METHODID_SUBSCRIBE_FLIGHT_MODE)))
        .addMethod(
          getSubscribeHealthMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeHealthRequest,
              io.mavsdk.telemetry.TelemetryProto.HealthResponse>(
                service, METHODID_SUBSCRIBE_HEALTH)))
        .addMethod(
          getSubscribeRcStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeRcStatusRequest,
              io.mavsdk.telemetry.TelemetryProto.RcStatusResponse>(
                service, METHODID_SUBSCRIBE_RC_STATUS)))
        .addMethod(
          getSubscribeStatusTextMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeStatusTextRequest,
              io.mavsdk.telemetry.TelemetryProto.StatusTextResponse>(
                service, METHODID_SUBSCRIBE_STATUS_TEXT)))
        .addMethod(
          getSubscribeActuatorControlTargetMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorControlTargetRequest,
              io.mavsdk.telemetry.TelemetryProto.ActuatorControlTargetResponse>(
                service, METHODID_SUBSCRIBE_ACTUATOR_CONTROL_TARGET)))
        .addMethod(
          getSubscribeActuatorOutputStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeActuatorOutputStatusRequest,
              io.mavsdk.telemetry.TelemetryProto.ActuatorOutputStatusResponse>(
                service, METHODID_SUBSCRIBE_ACTUATOR_OUTPUT_STATUS)))
        .addMethod(
          getSubscribeOdometryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeOdometryRequest,
              io.mavsdk.telemetry.TelemetryProto.OdometryResponse>(
                service, METHODID_SUBSCRIBE_ODOMETRY)))
        .addMethod(
          getSubscribePositionVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribePositionVelocityNedRequest,
              io.mavsdk.telemetry.TelemetryProto.PositionVelocityNedResponse>(
                service, METHODID_SUBSCRIBE_POSITION_VELOCITY_NED)))
        .addMethod(
          getSubscribeGroundTruthMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeGroundTruthRequest,
              io.mavsdk.telemetry.TelemetryProto.GroundTruthResponse>(
                service, METHODID_SUBSCRIBE_GROUND_TRUTH)))
        .addMethod(
          getSubscribeFixedwingMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeFixedwingMetricsRequest,
              io.mavsdk.telemetry.TelemetryProto.FixedwingMetricsResponse>(
                service, METHODID_SUBSCRIBE_FIXEDWING_METRICS)))
        .addMethod(
          getSubscribeImuMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeImuRequest,
              io.mavsdk.telemetry.TelemetryProto.ImuResponse>(
                service, METHODID_SUBSCRIBE_IMU)))
        .addMethod(
          getSubscribeScaledImuMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeScaledImuRequest,
              io.mavsdk.telemetry.TelemetryProto.ScaledImuResponse>(
                service, METHODID_SUBSCRIBE_SCALED_IMU)))
        .addMethod(
          getSubscribeRawImuMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeRawImuRequest,
              io.mavsdk.telemetry.TelemetryProto.RawImuResponse>(
                service, METHODID_SUBSCRIBE_RAW_IMU)))
        .addMethod(
          getSubscribeHealthAllOkMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeHealthAllOkRequest,
              io.mavsdk.telemetry.TelemetryProto.HealthAllOkResponse>(
                service, METHODID_SUBSCRIBE_HEALTH_ALL_OK)))
        .addMethod(
          getSubscribeUnixEpochTimeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeUnixEpochTimeRequest,
              io.mavsdk.telemetry.TelemetryProto.UnixEpochTimeResponse>(
                service, METHODID_SUBSCRIBE_UNIX_EPOCH_TIME)))
        .addMethod(
          getSubscribeDistanceSensorMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeDistanceSensorRequest,
              io.mavsdk.telemetry.TelemetryProto.DistanceSensorResponse>(
                service, METHODID_SUBSCRIBE_DISTANCE_SENSOR)))
        .addMethod(
          getSubscribeScaledPressureMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeScaledPressureRequest,
              io.mavsdk.telemetry.TelemetryProto.ScaledPressureResponse>(
                service, METHODID_SUBSCRIBE_SCALED_PRESSURE)))
        .addMethod(
          getSubscribeHeadingMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeHeadingRequest,
              io.mavsdk.telemetry.TelemetryProto.HeadingResponse>(
                service, METHODID_SUBSCRIBE_HEADING)))
        .addMethod(
          getSubscribeAltitudeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SubscribeAltitudeRequest,
              io.mavsdk.telemetry.TelemetryProto.AltitudeResponse>(
                service, METHODID_SUBSCRIBE_ALTITUDE)))
        .addMethod(
          getSetRatePositionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRatePositionRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRatePositionResponse>(
                service, METHODID_SET_RATE_POSITION)))
        .addMethod(
          getSetRateHomeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateHomeRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateHomeResponse>(
                service, METHODID_SET_RATE_HOME)))
        .addMethod(
          getSetRateInAirMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateInAirRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateInAirResponse>(
                service, METHODID_SET_RATE_IN_AIR)))
        .addMethod(
          getSetRateLandedStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateLandedStateResponse>(
                service, METHODID_SET_RATE_LANDED_STATE)))
        .addMethod(
          getSetRateVtolStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateVtolStateResponse>(
                service, METHODID_SET_RATE_VTOL_STATE)))
        .addMethod(
          getSetRateAttitudeQuaternionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeQuaternionResponse>(
                service, METHODID_SET_RATE_ATTITUDE_QUATERNION)))
        .addMethod(
          getSetRateAttitudeEulerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateAttitudeEulerResponse>(
                service, METHODID_SET_RATE_ATTITUDE_EULER)))
        .addMethod(
          getSetRateCameraAttitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateCameraAttitudeResponse>(
                service, METHODID_SET_RATE_CAMERA_ATTITUDE)))
        .addMethod(
          getSetRateVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateVelocityNedResponse>(
                service, METHODID_SET_RATE_VELOCITY_NED)))
        .addMethod(
          getSetRateGpsInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateGpsInfoResponse>(
                service, METHODID_SET_RATE_GPS_INFO)))
        .addMethod(
          getSetRateBatteryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateBatteryRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateBatteryResponse>(
                service, METHODID_SET_RATE_BATTERY)))
        .addMethod(
          getSetRateRcStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateRcStatusResponse>(
                service, METHODID_SET_RATE_RC_STATUS)))
        .addMethod(
          getSetRateActuatorControlTargetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateActuatorControlTargetResponse>(
                service, METHODID_SET_RATE_ACTUATOR_CONTROL_TARGET)))
        .addMethod(
          getSetRateActuatorOutputStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateActuatorOutputStatusResponse>(
                service, METHODID_SET_RATE_ACTUATOR_OUTPUT_STATUS)))
        .addMethod(
          getSetRateOdometryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateOdometryRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateOdometryResponse>(
                service, METHODID_SET_RATE_ODOMETRY)))
        .addMethod(
          getSetRatePositionVelocityNedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRatePositionVelocityNedResponse>(
                service, METHODID_SET_RATE_POSITION_VELOCITY_NED)))
        .addMethod(
          getSetRateGroundTruthMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateGroundTruthResponse>(
                service, METHODID_SET_RATE_GROUND_TRUTH)))
        .addMethod(
          getSetRateFixedwingMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateFixedwingMetricsResponse>(
                service, METHODID_SET_RATE_FIXEDWING_METRICS)))
        .addMethod(
          getSetRateImuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateImuRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateImuResponse>(
                service, METHODID_SET_RATE_IMU)))
        .addMethod(
          getSetRateScaledImuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateScaledImuResponse>(
                service, METHODID_SET_RATE_SCALED_IMU)))
        .addMethod(
          getSetRateRawImuMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateRawImuRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateRawImuResponse>(
                service, METHODID_SET_RATE_RAW_IMU)))
        .addMethod(
          getSetRateUnixEpochTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateUnixEpochTimeResponse>(
                service, METHODID_SET_RATE_UNIX_EPOCH_TIME)))
        .addMethod(
          getSetRateDistanceSensorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateDistanceSensorResponse>(
                service, METHODID_SET_RATE_DISTANCE_SENSOR)))
        .addMethod(
          getSetRateAltitudeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeRequest,
              io.mavsdk.telemetry.TelemetryProto.SetRateAltitudeResponse>(
                service, METHODID_SET_RATE_ALTITUDE)))
        .addMethod(
          getGetGpsGlobalOriginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginRequest,
              io.mavsdk.telemetry.TelemetryProto.GetGpsGlobalOriginResponse>(
                service, METHODID_GET_GPS_GLOBAL_ORIGIN)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TelemetryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSubscribePositionMethod())
              .addMethod(getSubscribeHomeMethod())
              .addMethod(getSubscribeInAirMethod())
              .addMethod(getSubscribeLandedStateMethod())
              .addMethod(getSubscribeArmedMethod())
              .addMethod(getSubscribeVtolStateMethod())
              .addMethod(getSubscribeAttitudeQuaternionMethod())
              .addMethod(getSubscribeAttitudeEulerMethod())
              .addMethod(getSubscribeAttitudeAngularVelocityBodyMethod())
              .addMethod(getSubscribeCameraAttitudeQuaternionMethod())
              .addMethod(getSubscribeCameraAttitudeEulerMethod())
              .addMethod(getSubscribeVelocityNedMethod())
              .addMethod(getSubscribeGpsInfoMethod())
              .addMethod(getSubscribeRawGpsMethod())
              .addMethod(getSubscribeBatteryMethod())
              .addMethod(getSubscribeFlightModeMethod())
              .addMethod(getSubscribeHealthMethod())
              .addMethod(getSubscribeRcStatusMethod())
              .addMethod(getSubscribeStatusTextMethod())
              .addMethod(getSubscribeActuatorControlTargetMethod())
              .addMethod(getSubscribeActuatorOutputStatusMethod())
              .addMethod(getSubscribeOdometryMethod())
              .addMethod(getSubscribePositionVelocityNedMethod())
              .addMethod(getSubscribeGroundTruthMethod())
              .addMethod(getSubscribeFixedwingMetricsMethod())
              .addMethod(getSubscribeImuMethod())
              .addMethod(getSubscribeScaledImuMethod())
              .addMethod(getSubscribeRawImuMethod())
              .addMethod(getSubscribeHealthAllOkMethod())
              .addMethod(getSubscribeUnixEpochTimeMethod())
              .addMethod(getSubscribeDistanceSensorMethod())
              .addMethod(getSubscribeScaledPressureMethod())
              .addMethod(getSubscribeHeadingMethod())
              .addMethod(getSubscribeAltitudeMethod())
              .addMethod(getSetRatePositionMethod())
              .addMethod(getSetRateHomeMethod())
              .addMethod(getSetRateInAirMethod())
              .addMethod(getSetRateLandedStateMethod())
              .addMethod(getSetRateVtolStateMethod())
              .addMethod(getSetRateAttitudeQuaternionMethod())
              .addMethod(getSetRateAttitudeEulerMethod())
              .addMethod(getSetRateCameraAttitudeMethod())
              .addMethod(getSetRateVelocityNedMethod())
              .addMethod(getSetRateGpsInfoMethod())
              .addMethod(getSetRateBatteryMethod())
              .addMethod(getSetRateRcStatusMethod())
              .addMethod(getSetRateActuatorControlTargetMethod())
              .addMethod(getSetRateActuatorOutputStatusMethod())
              .addMethod(getSetRateOdometryMethod())
              .addMethod(getSetRatePositionVelocityNedMethod())
              .addMethod(getSetRateGroundTruthMethod())
              .addMethod(getSetRateFixedwingMetricsMethod())
              .addMethod(getSetRateImuMethod())
              .addMethod(getSetRateScaledImuMethod())
              .addMethod(getSetRateRawImuMethod())
              .addMethod(getSetRateUnixEpochTimeMethod())
              .addMethod(getSetRateDistanceSensorMethod())
              .addMethod(getSetRateAltitudeMethod())
              .addMethod(getGetGpsGlobalOriginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
