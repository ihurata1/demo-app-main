package io.mavsdk.camera_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides handling of camera interface
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/camera_server/camera_server.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CameraServerServiceGrpc {

  private CameraServerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.camera_server.CameraServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetInformationRequest,
      io.mavsdk.camera_server.CameraServerProto.SetInformationResponse> getSetInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInformation",
      requestType = io.mavsdk.camera_server.CameraServerProto.SetInformationRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.SetInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetInformationRequest,
      io.mavsdk.camera_server.CameraServerProto.SetInformationResponse> getSetInformationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetInformationRequest, io.mavsdk.camera_server.CameraServerProto.SetInformationResponse> getSetInformationMethod;
    if ((getSetInformationMethod = CameraServerServiceGrpc.getSetInformationMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSetInformationMethod = CameraServerServiceGrpc.getSetInformationMethod) == null) {
          CameraServerServiceGrpc.getSetInformationMethod = getSetInformationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SetInformationRequest, io.mavsdk.camera_server.CameraServerProto.SetInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetInformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse> getSetVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetVideoStreaming",
      requestType = io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse> getSetVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse> getSetVideoStreamingMethod;
    if ((getSetVideoStreamingMethod = CameraServerServiceGrpc.getSetVideoStreamingMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSetVideoStreamingMethod = CameraServerServiceGrpc.getSetVideoStreamingMethod) == null) {
          CameraServerServiceGrpc.getSetVideoStreamingMethod = getSetVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest,
      io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse> getSetInProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetInProgress",
      requestType = io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest,
      io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse> getSetInProgressMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest, io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse> getSetInProgressMethod;
    if ((getSetInProgressMethod = CameraServerServiceGrpc.getSetInProgressMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSetInProgressMethod = CameraServerServiceGrpc.getSetInProgressMethod) == null) {
          CameraServerServiceGrpc.getSetInProgressMethod = getSetInProgressMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest, io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetInProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetInProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest,
      io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse> getSubscribeTakePhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTakePhoto",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest,
      io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse> getSubscribeTakePhotoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest, io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse> getSubscribeTakePhotoMethod;
    if ((getSubscribeTakePhotoMethod = CameraServerServiceGrpc.getSubscribeTakePhotoMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeTakePhotoMethod = CameraServerServiceGrpc.getSubscribeTakePhotoMethod) == null) {
          CameraServerServiceGrpc.getSubscribeTakePhotoMethod = getSubscribeTakePhotoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest, io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTakePhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTakePhotoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse> getRespondTakePhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondTakePhoto",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse> getRespondTakePhotoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest, io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse> getRespondTakePhotoMethod;
    if ((getRespondTakePhotoMethod = CameraServerServiceGrpc.getRespondTakePhotoMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondTakePhotoMethod = CameraServerServiceGrpc.getRespondTakePhotoMethod) == null) {
          CameraServerServiceGrpc.getRespondTakePhotoMethod = getRespondTakePhotoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest, io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondTakePhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondTakePhotoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.StartVideoResponse> getSubscribeStartVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStartVideo",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.StartVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.StartVideoResponse> getSubscribeStartVideoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest, io.mavsdk.camera_server.CameraServerProto.StartVideoResponse> getSubscribeStartVideoMethod;
    if ((getSubscribeStartVideoMethod = CameraServerServiceGrpc.getSubscribeStartVideoMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeStartVideoMethod = CameraServerServiceGrpc.getSubscribeStartVideoMethod) == null) {
          CameraServerServiceGrpc.getSubscribeStartVideoMethod = getSubscribeStartVideoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest, io.mavsdk.camera_server.CameraServerProto.StartVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStartVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.StartVideoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStartVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse> getRespondStartVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondStartVideo",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse> getRespondStartVideoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest, io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse> getRespondStartVideoMethod;
    if ((getRespondStartVideoMethod = CameraServerServiceGrpc.getRespondStartVideoMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondStartVideoMethod = CameraServerServiceGrpc.getRespondStartVideoMethod) == null) {
          CameraServerServiceGrpc.getRespondStartVideoMethod = getRespondStartVideoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest, io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondStartVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondStartVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.StopVideoResponse> getSubscribeStopVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStopVideo",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.StopVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.StopVideoResponse> getSubscribeStopVideoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest, io.mavsdk.camera_server.CameraServerProto.StopVideoResponse> getSubscribeStopVideoMethod;
    if ((getSubscribeStopVideoMethod = CameraServerServiceGrpc.getSubscribeStopVideoMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeStopVideoMethod = CameraServerServiceGrpc.getSubscribeStopVideoMethod) == null) {
          CameraServerServiceGrpc.getSubscribeStopVideoMethod = getSubscribeStopVideoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest, io.mavsdk.camera_server.CameraServerProto.StopVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStopVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.StopVideoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStopVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse> getRespondStopVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondStopVideo",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse> getRespondStopVideoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest, io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse> getRespondStopVideoMethod;
    if ((getRespondStopVideoMethod = CameraServerServiceGrpc.getRespondStopVideoMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondStopVideoMethod = CameraServerServiceGrpc.getRespondStopVideoMethod) == null) {
          CameraServerServiceGrpc.getRespondStopVideoMethod = getRespondStopVideoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest, io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondStopVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondStopVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse> getSubscribeStartVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStartVideoStreaming",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse> getSubscribeStartVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse> getSubscribeStartVideoStreamingMethod;
    if ((getSubscribeStartVideoStreamingMethod = CameraServerServiceGrpc.getSubscribeStartVideoStreamingMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeStartVideoStreamingMethod = CameraServerServiceGrpc.getSubscribeStartVideoStreamingMethod) == null) {
          CameraServerServiceGrpc.getSubscribeStartVideoStreamingMethod = getSubscribeStartVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStartVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStartVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse> getRespondStartVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondStartVideoStreaming",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse> getRespondStartVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse> getRespondStartVideoStreamingMethod;
    if ((getRespondStartVideoStreamingMethod = CameraServerServiceGrpc.getRespondStartVideoStreamingMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondStartVideoStreamingMethod = CameraServerServiceGrpc.getRespondStartVideoStreamingMethod) == null) {
          CameraServerServiceGrpc.getRespondStartVideoStreamingMethod = getRespondStartVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondStartVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondStartVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse> getSubscribeStopVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStopVideoStreaming",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse> getSubscribeStopVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse> getSubscribeStopVideoStreamingMethod;
    if ((getSubscribeStopVideoStreamingMethod = CameraServerServiceGrpc.getSubscribeStopVideoStreamingMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeStopVideoStreamingMethod = CameraServerServiceGrpc.getSubscribeStopVideoStreamingMethod) == null) {
          CameraServerServiceGrpc.getSubscribeStopVideoStreamingMethod = getSubscribeStopVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStopVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStopVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse> getRespondStopVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondStopVideoStreaming",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse> getRespondStopVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse> getRespondStopVideoStreamingMethod;
    if ((getRespondStopVideoStreamingMethod = CameraServerServiceGrpc.getRespondStopVideoStreamingMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondStopVideoStreamingMethod = CameraServerServiceGrpc.getRespondStopVideoStreamingMethod) == null) {
          CameraServerServiceGrpc.getRespondStopVideoStreamingMethod = getRespondStopVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest, io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondStopVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondStopVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest,
      io.mavsdk.camera_server.CameraServerProto.SetModeResponse> getSubscribeSetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeSetMode",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.SetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest,
      io.mavsdk.camera_server.CameraServerProto.SetModeResponse> getSubscribeSetModeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest, io.mavsdk.camera_server.CameraServerProto.SetModeResponse> getSubscribeSetModeMethod;
    if ((getSubscribeSetModeMethod = CameraServerServiceGrpc.getSubscribeSetModeMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeSetModeMethod = CameraServerServiceGrpc.getSubscribeSetModeMethod) == null) {
          CameraServerServiceGrpc.getSubscribeSetModeMethod = getSubscribeSetModeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest, io.mavsdk.camera_server.CameraServerProto.SetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeSetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeSetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse> getRespondSetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondSetMode",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse> getRespondSetModeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest, io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse> getRespondSetModeMethod;
    if ((getRespondSetModeMethod = CameraServerServiceGrpc.getRespondSetModeMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondSetModeMethod = CameraServerServiceGrpc.getRespondSetModeMethod) == null) {
          CameraServerServiceGrpc.getRespondSetModeMethod = getRespondSetModeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest, io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondSetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondSetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest,
      io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse> getSubscribeStorageInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStorageInformation",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest,
      io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse> getSubscribeStorageInformationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest, io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse> getSubscribeStorageInformationMethod;
    if ((getSubscribeStorageInformationMethod = CameraServerServiceGrpc.getSubscribeStorageInformationMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeStorageInformationMethod = CameraServerServiceGrpc.getSubscribeStorageInformationMethod) == null) {
          CameraServerServiceGrpc.getSubscribeStorageInformationMethod = getSubscribeStorageInformationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest, io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStorageInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStorageInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse> getRespondStorageInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondStorageInformation",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse> getRespondStorageInformationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest, io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse> getRespondStorageInformationMethod;
    if ((getRespondStorageInformationMethod = CameraServerServiceGrpc.getRespondStorageInformationMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondStorageInformationMethod = CameraServerServiceGrpc.getRespondStorageInformationMethod) == null) {
          CameraServerServiceGrpc.getRespondStorageInformationMethod = getRespondStorageInformationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest, io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondStorageInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondStorageInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse> getSubscribeCaptureStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCaptureStatus",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse> getSubscribeCaptureStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest, io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse> getSubscribeCaptureStatusMethod;
    if ((getSubscribeCaptureStatusMethod = CameraServerServiceGrpc.getSubscribeCaptureStatusMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeCaptureStatusMethod = CameraServerServiceGrpc.getSubscribeCaptureStatusMethod) == null) {
          CameraServerServiceGrpc.getSubscribeCaptureStatusMethod = getSubscribeCaptureStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest, io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCaptureStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCaptureStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse> getRespondCaptureStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondCaptureStatus",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse> getRespondCaptureStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest, io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse> getRespondCaptureStatusMethod;
    if ((getRespondCaptureStatusMethod = CameraServerServiceGrpc.getRespondCaptureStatusMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondCaptureStatusMethod = CameraServerServiceGrpc.getRespondCaptureStatusMethod) == null) {
          CameraServerServiceGrpc.getRespondCaptureStatusMethod = getRespondCaptureStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest, io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondCaptureStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondCaptureStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest,
      io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse> getSubscribeFormatStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeFormatStorage",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest,
      io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse> getSubscribeFormatStorageMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest, io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse> getSubscribeFormatStorageMethod;
    if ((getSubscribeFormatStorageMethod = CameraServerServiceGrpc.getSubscribeFormatStorageMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeFormatStorageMethod = CameraServerServiceGrpc.getSubscribeFormatStorageMethod) == null) {
          CameraServerServiceGrpc.getSubscribeFormatStorageMethod = getSubscribeFormatStorageMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest, io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeFormatStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeFormatStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse> getRespondFormatStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondFormatStorage",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse> getRespondFormatStorageMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest, io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse> getRespondFormatStorageMethod;
    if ((getRespondFormatStorageMethod = CameraServerServiceGrpc.getRespondFormatStorageMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondFormatStorageMethod = CameraServerServiceGrpc.getRespondFormatStorageMethod) == null) {
          CameraServerServiceGrpc.getRespondFormatStorageMethod = getRespondFormatStorageMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest, io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondFormatStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondFormatStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest,
      io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse> getSubscribeResetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeResetSettings",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest,
      io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse> getSubscribeResetSettingsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest, io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse> getSubscribeResetSettingsMethod;
    if ((getSubscribeResetSettingsMethod = CameraServerServiceGrpc.getSubscribeResetSettingsMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeResetSettingsMethod = CameraServerServiceGrpc.getSubscribeResetSettingsMethod) == null) {
          CameraServerServiceGrpc.getSubscribeResetSettingsMethod = getSubscribeResetSettingsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest, io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeResetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeResetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse> getRespondResetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondResetSettings",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse> getRespondResetSettingsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest, io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse> getRespondResetSettingsMethod;
    if ((getRespondResetSettingsMethod = CameraServerServiceGrpc.getRespondResetSettingsMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondResetSettingsMethod = CameraServerServiceGrpc.getRespondResetSettingsMethod) == null) {
          CameraServerServiceGrpc.getRespondResetSettingsMethod = getRespondResetSettingsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest, io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondResetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondResetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse> getSubscribeZoomInStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeZoomInStart",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse> getSubscribeZoomInStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest, io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse> getSubscribeZoomInStartMethod;
    if ((getSubscribeZoomInStartMethod = CameraServerServiceGrpc.getSubscribeZoomInStartMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeZoomInStartMethod = CameraServerServiceGrpc.getSubscribeZoomInStartMethod) == null) {
          CameraServerServiceGrpc.getSubscribeZoomInStartMethod = getSubscribeZoomInStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest, io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeZoomInStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeZoomInStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse> getRespondZoomInStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondZoomInStart",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse> getRespondZoomInStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse> getRespondZoomInStartMethod;
    if ((getRespondZoomInStartMethod = CameraServerServiceGrpc.getRespondZoomInStartMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondZoomInStartMethod = CameraServerServiceGrpc.getRespondZoomInStartMethod) == null) {
          CameraServerServiceGrpc.getRespondZoomInStartMethod = getRespondZoomInStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondZoomInStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondZoomInStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse> getSubscribeZoomOutStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeZoomOutStart",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse> getSubscribeZoomOutStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest, io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse> getSubscribeZoomOutStartMethod;
    if ((getSubscribeZoomOutStartMethod = CameraServerServiceGrpc.getSubscribeZoomOutStartMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeZoomOutStartMethod = CameraServerServiceGrpc.getSubscribeZoomOutStartMethod) == null) {
          CameraServerServiceGrpc.getSubscribeZoomOutStartMethod = getSubscribeZoomOutStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest, io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeZoomOutStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeZoomOutStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse> getRespondZoomOutStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondZoomOutStart",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse> getRespondZoomOutStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse> getRespondZoomOutStartMethod;
    if ((getRespondZoomOutStartMethod = CameraServerServiceGrpc.getRespondZoomOutStartMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondZoomOutStartMethod = CameraServerServiceGrpc.getRespondZoomOutStartMethod) == null) {
          CameraServerServiceGrpc.getRespondZoomOutStartMethod = getRespondZoomOutStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondZoomOutStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondZoomOutStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse> getSubscribeZoomStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeZoomStop",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse> getSubscribeZoomStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest, io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse> getSubscribeZoomStopMethod;
    if ((getSubscribeZoomStopMethod = CameraServerServiceGrpc.getSubscribeZoomStopMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeZoomStopMethod = CameraServerServiceGrpc.getSubscribeZoomStopMethod) == null) {
          CameraServerServiceGrpc.getSubscribeZoomStopMethod = getSubscribeZoomStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest, io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeZoomStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeZoomStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse> getRespondZoomStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondZoomStop",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse> getRespondZoomStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse> getRespondZoomStopMethod;
    if ((getRespondZoomStopMethod = CameraServerServiceGrpc.getRespondZoomStopMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondZoomStopMethod = CameraServerServiceGrpc.getRespondZoomStopMethod) == null) {
          CameraServerServiceGrpc.getRespondZoomStopMethod = getRespondZoomStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondZoomStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondZoomStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse> getSubscribeZoomRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeZoomRange",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest,
      io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse> getSubscribeZoomRangeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest, io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse> getSubscribeZoomRangeMethod;
    if ((getSubscribeZoomRangeMethod = CameraServerServiceGrpc.getSubscribeZoomRangeMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeZoomRangeMethod = CameraServerServiceGrpc.getSubscribeZoomRangeMethod) == null) {
          CameraServerServiceGrpc.getSubscribeZoomRangeMethod = getSubscribeZoomRangeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest, io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeZoomRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeZoomRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse> getRespondZoomRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondZoomRange",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse> getRespondZoomRangeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse> getRespondZoomRangeMethod;
    if ((getRespondZoomRangeMethod = CameraServerServiceGrpc.getRespondZoomRangeMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondZoomRangeMethod = CameraServerServiceGrpc.getRespondZoomRangeMethod) == null) {
          CameraServerServiceGrpc.getRespondZoomRangeMethod = getRespondZoomRangeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest, io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondZoomRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondZoomRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse> getSetTrackingRectangleStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTrackingRectangleStatus",
      requestType = io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse> getSetTrackingRectangleStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest, io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse> getSetTrackingRectangleStatusMethod;
    if ((getSetTrackingRectangleStatusMethod = CameraServerServiceGrpc.getSetTrackingRectangleStatusMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSetTrackingRectangleStatusMethod = CameraServerServiceGrpc.getSetTrackingRectangleStatusMethod) == null) {
          CameraServerServiceGrpc.getSetTrackingRectangleStatusMethod = getSetTrackingRectangleStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest, io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTrackingRectangleStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTrackingRectangleStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse> getSetTrackingOffStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetTrackingOffStatus",
      requestType = io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest,
      io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse> getSetTrackingOffStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest, io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse> getSetTrackingOffStatusMethod;
    if ((getSetTrackingOffStatusMethod = CameraServerServiceGrpc.getSetTrackingOffStatusMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSetTrackingOffStatusMethod = CameraServerServiceGrpc.getSetTrackingOffStatusMethod) == null) {
          CameraServerServiceGrpc.getSetTrackingOffStatusMethod = getSetTrackingOffStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest, io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetTrackingOffStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetTrackingOffStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse> getSubscribeTrackingPointCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTrackingPointCommand",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse> getSubscribeTrackingPointCommandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest, io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse> getSubscribeTrackingPointCommandMethod;
    if ((getSubscribeTrackingPointCommandMethod = CameraServerServiceGrpc.getSubscribeTrackingPointCommandMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeTrackingPointCommandMethod = CameraServerServiceGrpc.getSubscribeTrackingPointCommandMethod) == null) {
          CameraServerServiceGrpc.getSubscribeTrackingPointCommandMethod = getSubscribeTrackingPointCommandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest, io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTrackingPointCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTrackingPointCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse> getSubscribeTrackingRectangleCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTrackingRectangleCommand",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse> getSubscribeTrackingRectangleCommandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest, io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse> getSubscribeTrackingRectangleCommandMethod;
    if ((getSubscribeTrackingRectangleCommandMethod = CameraServerServiceGrpc.getSubscribeTrackingRectangleCommandMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeTrackingRectangleCommandMethod = CameraServerServiceGrpc.getSubscribeTrackingRectangleCommandMethod) == null) {
          CameraServerServiceGrpc.getSubscribeTrackingRectangleCommandMethod = getSubscribeTrackingRectangleCommandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest, io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTrackingRectangleCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTrackingRectangleCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse> getSubscribeTrackingOffCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeTrackingOffCommand",
      requestType = io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse> getSubscribeTrackingOffCommandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest, io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse> getSubscribeTrackingOffCommandMethod;
    if ((getSubscribeTrackingOffCommandMethod = CameraServerServiceGrpc.getSubscribeTrackingOffCommandMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getSubscribeTrackingOffCommandMethod = CameraServerServiceGrpc.getSubscribeTrackingOffCommandMethod) == null) {
          CameraServerServiceGrpc.getSubscribeTrackingOffCommandMethod = getSubscribeTrackingOffCommandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest, io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeTrackingOffCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeTrackingOffCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse> getRespondTrackingPointCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondTrackingPointCommand",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse> getRespondTrackingPointCommandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest, io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse> getRespondTrackingPointCommandMethod;
    if ((getRespondTrackingPointCommandMethod = CameraServerServiceGrpc.getRespondTrackingPointCommandMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondTrackingPointCommandMethod = CameraServerServiceGrpc.getRespondTrackingPointCommandMethod) == null) {
          CameraServerServiceGrpc.getRespondTrackingPointCommandMethod = getRespondTrackingPointCommandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest, io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondTrackingPointCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondTrackingPointCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse> getRespondTrackingRectangleCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondTrackingRectangleCommand",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse> getRespondTrackingRectangleCommandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest, io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse> getRespondTrackingRectangleCommandMethod;
    if ((getRespondTrackingRectangleCommandMethod = CameraServerServiceGrpc.getRespondTrackingRectangleCommandMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondTrackingRectangleCommandMethod = CameraServerServiceGrpc.getRespondTrackingRectangleCommandMethod) == null) {
          CameraServerServiceGrpc.getRespondTrackingRectangleCommandMethod = getRespondTrackingRectangleCommandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest, io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondTrackingRectangleCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondTrackingRectangleCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse> getRespondTrackingOffCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RespondTrackingOffCommand",
      requestType = io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest.class,
      responseType = io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest,
      io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse> getRespondTrackingOffCommandMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest, io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse> getRespondTrackingOffCommandMethod;
    if ((getRespondTrackingOffCommandMethod = CameraServerServiceGrpc.getRespondTrackingOffCommandMethod) == null) {
      synchronized (CameraServerServiceGrpc.class) {
        if ((getRespondTrackingOffCommandMethod = CameraServerServiceGrpc.getRespondTrackingOffCommandMethod) == null) {
          CameraServerServiceGrpc.getRespondTrackingOffCommandMethod = getRespondTrackingOffCommandMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest, io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RespondTrackingOffCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getRespondTrackingOffCommandMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServerServiceStub>() {
        @java.lang.Override
        public CameraServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServerServiceStub(channel, callOptions);
        }
      };
    return CameraServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServerServiceBlockingStub>() {
        @java.lang.Override
        public CameraServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServerServiceBlockingStub(channel, callOptions);
        }
      };
    return CameraServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServerServiceFutureStub>() {
        @java.lang.Override
        public CameraServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServerServiceFutureStub(channel, callOptions);
        }
      };
    return CameraServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides handling of camera interface
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sets the camera information. This must be called as soon as the camera server is created.
     * </pre>
     */
    default void setInformation(io.mavsdk.camera_server.CameraServerProto.SetInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets video streaming settings.
     * </pre>
     */
    default void setVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets image capture in progress status flags. This should be set to true when the camera is busy taking a photo and false when it is done.
     * </pre>
     */
    default void setInProgress(io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetInProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to image capture requests. Each request received should respond to using RespondTakePhoto.
     * </pre>
     */
    default void subscribeTakePhoto(io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTakePhotoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to an image capture request from SubscribeTakePhoto.
     * </pre>
     */
    default void respondTakePhoto(io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondTakePhotoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to start video requests. Each request received should respond to using RespondStartVideo
     * </pre>
     */
    default void subscribeStartVideo(io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StartVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStartVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should respond using StopVideoResponse
     * </pre>
     */
    default void respondStartVideo(io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondStartVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should response to using RespondStopVideo
     * </pre>
     */
    default void subscribeStopVideo(io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StopVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStopVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to stop video request from SubscribeStopVideo.
     * </pre>
     */
    default void respondStopVideo(io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondStopVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to start video streaming requests. Each request received should response to using RespondStartVideoStreaming
     * </pre>
     */
    default void subscribeStartVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStartVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to start video streaming from SubscribeStartVideoStreaming.
     * </pre>
     */
    default void respondStartVideoStreaming(io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondStartVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to stop video streaming requests. Each request received should response to using RespondStopVideoStreaming
     * </pre>
     */
    default void subscribeStopVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStopVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to stop video streaming from SubscribeStopVideoStreaming.
     * </pre>
     */
    default void respondStopVideoStreaming(io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondStopVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to set camera mode requests. Each request received should response to using RespondSetMode
     * </pre>
     */
    default void subscribeSetMode(io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeSetModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to set camera mode from SubscribeSetMode.
     * </pre>
     */
    default void respondSetMode(io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondSetModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera storage information requests. Each request received should response to using RespondStorageInformation
     * </pre>
     */
    default void subscribeStorageInformation(io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStorageInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to camera storage information from SubscribeStorageInformation.
     * </pre>
     */
    default void respondStorageInformation(io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondStorageInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera capture status requests. Each request received should response to using RespondCaptureStatus
     * </pre>
     */
    default void subscribeCaptureStatus(io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCaptureStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to camera capture status from SubscribeCaptureStatus.
     * </pre>
     */
    default void respondCaptureStatus(io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondCaptureStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to format storage requests. Each request received should response to using RespondFormatStorage
     * </pre>
     */
    default void subscribeFormatStorage(io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeFormatStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to format storage from SubscribeFormatStorage.
     * </pre>
     */
    default void respondFormatStorage(io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondFormatStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to reset settings requests. Each request received should response to using RespondResetSettings
     * </pre>
     */
    default void subscribeResetSettings(io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeResetSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to reset settings from SubscribeResetSettings.
     * </pre>
     */
    default void respondResetSettings(io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondResetSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom in start command
     * </pre>
     */
    default void subscribeZoomInStart(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeZoomInStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom in start.
     * </pre>
     */
    default void respondZoomInStart(io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondZoomInStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom out start command
     * </pre>
     */
    default void subscribeZoomOutStart(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeZoomOutStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom out start.
     * </pre>
     */
    default void respondZoomOutStart(io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondZoomOutStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom stop command
     * </pre>
     */
    default void subscribeZoomStop(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeZoomStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom stop.
     * </pre>
     */
    default void respondZoomStop(io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondZoomStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom range command
     * </pre>
     */
    default void subscribeZoomRange(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeZoomRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom range.
     * </pre>
     */
    default void respondZoomRange(io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondZoomRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set/update the current rectangle tracking status.
     * </pre>
     */
    default void setTrackingRectangleStatus(io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTrackingRectangleStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the current tracking status to off.
     * </pre>
     */
    default void setTrackingOffStatus(io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetTrackingOffStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking point command.
     * </pre>
     */
    default void subscribeTrackingPointCommand(io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTrackingPointCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking rectangle command.
     * </pre>
     */
    default void subscribeTrackingRectangleCommand(io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTrackingRectangleCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking off command.
     * </pre>
     */
    default void subscribeTrackingOffCommand(io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeTrackingOffCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to an incoming tracking point command.
     * </pre>
     */
    default void respondTrackingPointCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondTrackingPointCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to an incoming tracking rectangle command.
     * </pre>
     */
    default void respondTrackingRectangleCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondTrackingRectangleCommandMethod(), responseObserver);
    }

    /**
     * <pre>
     * Respond to an incoming tracking off command.
     * </pre>
     */
    default void respondTrackingOffCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRespondTrackingOffCommandMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CameraServerService.
   * <pre>
   * Provides handling of camera interface
   * </pre>
   */
  public static abstract class CameraServerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CameraServerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CameraServerService.
   * <pre>
   * Provides handling of camera interface
   * </pre>
   */
  public static final class CameraServerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CameraServerServiceStub> {
    private CameraServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the camera information. This must be called as soon as the camera server is created.
     * </pre>
     */
    public void setInformation(io.mavsdk.camera_server.CameraServerProto.SetInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets video streaming settings.
     * </pre>
     */
    public void setVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets image capture in progress status flags. This should be set to true when the camera is busy taking a photo and false when it is done.
     * </pre>
     */
    public void setInProgress(io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetInProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to image capture requests. Each request received should respond to using RespondTakePhoto.
     * </pre>
     */
    public void subscribeTakePhoto(io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTakePhotoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to an image capture request from SubscribeTakePhoto.
     * </pre>
     */
    public void respondTakePhoto(io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondTakePhotoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to start video requests. Each request received should respond to using RespondStartVideo
     * </pre>
     */
    public void subscribeStartVideo(io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StartVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStartVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should respond using StopVideoResponse
     * </pre>
     */
    public void respondStartVideo(io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondStartVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should response to using RespondStopVideo
     * </pre>
     */
    public void subscribeStopVideo(io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StopVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStopVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to stop video request from SubscribeStopVideo.
     * </pre>
     */
    public void respondStopVideo(io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondStopVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to start video streaming requests. Each request received should response to using RespondStartVideoStreaming
     * </pre>
     */
    public void subscribeStartVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStartVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to start video streaming from SubscribeStartVideoStreaming.
     * </pre>
     */
    public void respondStartVideoStreaming(io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondStartVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to stop video streaming requests. Each request received should response to using RespondStopVideoStreaming
     * </pre>
     */
    public void subscribeStopVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStopVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to stop video streaming from SubscribeStopVideoStreaming.
     * </pre>
     */
    public void respondStopVideoStreaming(io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondStopVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to set camera mode requests. Each request received should response to using RespondSetMode
     * </pre>
     */
    public void subscribeSetMode(io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeSetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to set camera mode from SubscribeSetMode.
     * </pre>
     */
    public void respondSetMode(io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondSetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera storage information requests. Each request received should response to using RespondStorageInformation
     * </pre>
     */
    public void subscribeStorageInformation(io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStorageInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to camera storage information from SubscribeStorageInformation.
     * </pre>
     */
    public void respondStorageInformation(io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondStorageInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera capture status requests. Each request received should response to using RespondCaptureStatus
     * </pre>
     */
    public void subscribeCaptureStatus(io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCaptureStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to camera capture status from SubscribeCaptureStatus.
     * </pre>
     */
    public void respondCaptureStatus(io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondCaptureStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to format storage requests. Each request received should response to using RespondFormatStorage
     * </pre>
     */
    public void subscribeFormatStorage(io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeFormatStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to format storage from SubscribeFormatStorage.
     * </pre>
     */
    public void respondFormatStorage(io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondFormatStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to reset settings requests. Each request received should response to using RespondResetSettings
     * </pre>
     */
    public void subscribeResetSettings(io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeResetSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to reset settings from SubscribeResetSettings.
     * </pre>
     */
    public void respondResetSettings(io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondResetSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom in start command
     * </pre>
     */
    public void subscribeZoomInStart(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeZoomInStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom in start.
     * </pre>
     */
    public void respondZoomInStart(io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondZoomInStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom out start command
     * </pre>
     */
    public void subscribeZoomOutStart(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeZoomOutStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom out start.
     * </pre>
     */
    public void respondZoomOutStart(io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondZoomOutStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom stop command
     * </pre>
     */
    public void subscribeZoomStop(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeZoomStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom stop.
     * </pre>
     */
    public void respondZoomStop(io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondZoomStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to zoom range command
     * </pre>
     */
    public void subscribeZoomRange(io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeZoomRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to zoom range.
     * </pre>
     */
    public void respondZoomRange(io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondZoomRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set/update the current rectangle tracking status.
     * </pre>
     */
    public void setTrackingRectangleStatus(io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTrackingRectangleStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the current tracking status to off.
     * </pre>
     */
    public void setTrackingOffStatus(io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetTrackingOffStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking point command.
     * </pre>
     */
    public void subscribeTrackingPointCommand(io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTrackingPointCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking rectangle command.
     * </pre>
     */
    public void subscribeTrackingRectangleCommand(io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTrackingRectangleCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking off command.
     * </pre>
     */
    public void subscribeTrackingOffCommand(io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeTrackingOffCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to an incoming tracking point command.
     * </pre>
     */
    public void respondTrackingPointCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondTrackingPointCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to an incoming tracking rectangle command.
     * </pre>
     */
    public void respondTrackingRectangleCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondTrackingRectangleCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Respond to an incoming tracking off command.
     * </pre>
     */
    public void respondTrackingOffCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRespondTrackingOffCommandMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CameraServerService.
   * <pre>
   * Provides handling of camera interface
   * </pre>
   */
  public static final class CameraServerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CameraServerServiceBlockingStub> {
    private CameraServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the camera information. This must be called as soon as the camera server is created.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.SetInformationResponse setInformation(io.mavsdk.camera_server.CameraServerProto.SetInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets video streaming settings.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse setVideoStreaming(io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets image capture in progress status flags. This should be set to true when the camera is busy taking a photo and false when it is done.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse setInProgress(io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetInProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to image capture requests. Each request received should respond to using RespondTakePhoto.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse> subscribeTakePhoto(
        io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTakePhotoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to an image capture request from SubscribeTakePhoto.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse respondTakePhoto(io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondTakePhotoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to start video requests. Each request received should respond to using RespondStartVideo
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.StartVideoResponse> subscribeStartVideo(
        io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStartVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should respond using StopVideoResponse
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse respondStartVideo(io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondStartVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should response to using RespondStopVideo
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.StopVideoResponse> subscribeStopVideo(
        io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStopVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to stop video request from SubscribeStopVideo.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse respondStopVideo(io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondStopVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to start video streaming requests. Each request received should response to using RespondStartVideoStreaming
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse> subscribeStartVideoStreaming(
        io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStartVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to start video streaming from SubscribeStartVideoStreaming.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse respondStartVideoStreaming(io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondStartVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to stop video streaming requests. Each request received should response to using RespondStopVideoStreaming
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse> subscribeStopVideoStreaming(
        io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStopVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to stop video streaming from SubscribeStopVideoStreaming.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse respondStopVideoStreaming(io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondStopVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to set camera mode requests. Each request received should response to using RespondSetMode
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.SetModeResponse> subscribeSetMode(
        io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeSetModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to set camera mode from SubscribeSetMode.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse respondSetMode(io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondSetModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to camera storage information requests. Each request received should response to using RespondStorageInformation
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse> subscribeStorageInformation(
        io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStorageInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to camera storage information from SubscribeStorageInformation.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse respondStorageInformation(io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondStorageInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to camera capture status requests. Each request received should response to using RespondCaptureStatus
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse> subscribeCaptureStatus(
        io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCaptureStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to camera capture status from SubscribeCaptureStatus.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse respondCaptureStatus(io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondCaptureStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to format storage requests. Each request received should response to using RespondFormatStorage
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse> subscribeFormatStorage(
        io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeFormatStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to format storage from SubscribeFormatStorage.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse respondFormatStorage(io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondFormatStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to reset settings requests. Each request received should response to using RespondResetSettings
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse> subscribeResetSettings(
        io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeResetSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to reset settings from SubscribeResetSettings.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse respondResetSettings(io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondResetSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to zoom in start command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse> subscribeZoomInStart(
        io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeZoomInStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to zoom in start.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse respondZoomInStart(io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondZoomInStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to zoom out start command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse> subscribeZoomOutStart(
        io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeZoomOutStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to zoom out start.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse respondZoomOutStart(io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondZoomOutStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to zoom stop command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse> subscribeZoomStop(
        io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeZoomStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to zoom stop.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse respondZoomStop(io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondZoomStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to zoom range command
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse> subscribeZoomRange(
        io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeZoomRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to zoom range.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse respondZoomRange(io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondZoomRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set/update the current rectangle tracking status.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse setTrackingRectangleStatus(io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTrackingRectangleStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the current tracking status to off.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse setTrackingOffStatus(io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetTrackingOffStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking point command.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse> subscribeTrackingPointCommand(
        io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTrackingPointCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking rectangle command.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse> subscribeTrackingRectangleCommand(
        io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTrackingRectangleCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to incoming tracking off command.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse> subscribeTrackingOffCommand(
        io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeTrackingOffCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to an incoming tracking point command.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse respondTrackingPointCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondTrackingPointCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to an incoming tracking rectangle command.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse respondTrackingRectangleCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondTrackingRectangleCommandMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Respond to an incoming tracking off command.
     * </pre>
     */
    public io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse respondTrackingOffCommand(io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRespondTrackingOffCommandMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CameraServerService.
   * <pre>
   * Provides handling of camera interface
   * </pre>
   */
  public static final class CameraServerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CameraServerServiceFutureStub> {
    private CameraServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sets the camera information. This must be called as soon as the camera server is created.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.SetInformationResponse> setInformation(
        io.mavsdk.camera_server.CameraServerProto.SetInformationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets video streaming settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse> setVideoStreaming(
        io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetVideoStreamingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets image capture in progress status flags. This should be set to true when the camera is busy taking a photo and false when it is done.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse> setInProgress(
        io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetInProgressMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to an image capture request from SubscribeTakePhoto.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse> respondTakePhoto(
        io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondTakePhotoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Subscribe to stop video requests. Each request received should respond using StopVideoResponse
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse> respondStartVideo(
        io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondStartVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to stop video request from SubscribeStopVideo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse> respondStopVideo(
        io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondStopVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to start video streaming from SubscribeStartVideoStreaming.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse> respondStartVideoStreaming(
        io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondStartVideoStreamingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to stop video streaming from SubscribeStopVideoStreaming.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse> respondStopVideoStreaming(
        io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondStopVideoStreamingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to set camera mode from SubscribeSetMode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse> respondSetMode(
        io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondSetModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to camera storage information from SubscribeStorageInformation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse> respondStorageInformation(
        io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondStorageInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to camera capture status from SubscribeCaptureStatus.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse> respondCaptureStatus(
        io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondCaptureStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to format storage from SubscribeFormatStorage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse> respondFormatStorage(
        io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondFormatStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to reset settings from SubscribeResetSettings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse> respondResetSettings(
        io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondResetSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to zoom in start.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse> respondZoomInStart(
        io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondZoomInStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to zoom out start.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse> respondZoomOutStart(
        io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondZoomOutStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to zoom stop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse> respondZoomStop(
        io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondZoomStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to zoom range.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse> respondZoomRange(
        io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondZoomRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set/update the current rectangle tracking status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse> setTrackingRectangleStatus(
        io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTrackingRectangleStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the current tracking status to off.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse> setTrackingOffStatus(
        io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetTrackingOffStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to an incoming tracking point command.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse> respondTrackingPointCommand(
        io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondTrackingPointCommandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to an incoming tracking rectangle command.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse> respondTrackingRectangleCommand(
        io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondTrackingRectangleCommandMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Respond to an incoming tracking off command.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse> respondTrackingOffCommand(
        io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRespondTrackingOffCommandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_INFORMATION = 0;
  private static final int METHODID_SET_VIDEO_STREAMING = 1;
  private static final int METHODID_SET_IN_PROGRESS = 2;
  private static final int METHODID_SUBSCRIBE_TAKE_PHOTO = 3;
  private static final int METHODID_RESPOND_TAKE_PHOTO = 4;
  private static final int METHODID_SUBSCRIBE_START_VIDEO = 5;
  private static final int METHODID_RESPOND_START_VIDEO = 6;
  private static final int METHODID_SUBSCRIBE_STOP_VIDEO = 7;
  private static final int METHODID_RESPOND_STOP_VIDEO = 8;
  private static final int METHODID_SUBSCRIBE_START_VIDEO_STREAMING = 9;
  private static final int METHODID_RESPOND_START_VIDEO_STREAMING = 10;
  private static final int METHODID_SUBSCRIBE_STOP_VIDEO_STREAMING = 11;
  private static final int METHODID_RESPOND_STOP_VIDEO_STREAMING = 12;
  private static final int METHODID_SUBSCRIBE_SET_MODE = 13;
  private static final int METHODID_RESPOND_SET_MODE = 14;
  private static final int METHODID_SUBSCRIBE_STORAGE_INFORMATION = 15;
  private static final int METHODID_RESPOND_STORAGE_INFORMATION = 16;
  private static final int METHODID_SUBSCRIBE_CAPTURE_STATUS = 17;
  private static final int METHODID_RESPOND_CAPTURE_STATUS = 18;
  private static final int METHODID_SUBSCRIBE_FORMAT_STORAGE = 19;
  private static final int METHODID_RESPOND_FORMAT_STORAGE = 20;
  private static final int METHODID_SUBSCRIBE_RESET_SETTINGS = 21;
  private static final int METHODID_RESPOND_RESET_SETTINGS = 22;
  private static final int METHODID_SUBSCRIBE_ZOOM_IN_START = 23;
  private static final int METHODID_RESPOND_ZOOM_IN_START = 24;
  private static final int METHODID_SUBSCRIBE_ZOOM_OUT_START = 25;
  private static final int METHODID_RESPOND_ZOOM_OUT_START = 26;
  private static final int METHODID_SUBSCRIBE_ZOOM_STOP = 27;
  private static final int METHODID_RESPOND_ZOOM_STOP = 28;
  private static final int METHODID_SUBSCRIBE_ZOOM_RANGE = 29;
  private static final int METHODID_RESPOND_ZOOM_RANGE = 30;
  private static final int METHODID_SET_TRACKING_RECTANGLE_STATUS = 31;
  private static final int METHODID_SET_TRACKING_OFF_STATUS = 32;
  private static final int METHODID_SUBSCRIBE_TRACKING_POINT_COMMAND = 33;
  private static final int METHODID_SUBSCRIBE_TRACKING_RECTANGLE_COMMAND = 34;
  private static final int METHODID_SUBSCRIBE_TRACKING_OFF_COMMAND = 35;
  private static final int METHODID_RESPOND_TRACKING_POINT_COMMAND = 36;
  private static final int METHODID_RESPOND_TRACKING_RECTANGLE_COMMAND = 37;
  private static final int METHODID_RESPOND_TRACKING_OFF_COMMAND = 38;

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
        case METHODID_SET_INFORMATION:
          serviceImpl.setInformation((io.mavsdk.camera_server.CameraServerProto.SetInformationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetInformationResponse>) responseObserver);
          break;
        case METHODID_SET_VIDEO_STREAMING:
          serviceImpl.setVideoStreaming((io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_SET_IN_PROGRESS:
          serviceImpl.setInProgress((io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TAKE_PHOTO:
          serviceImpl.subscribeTakePhoto((io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse>) responseObserver);
          break;
        case METHODID_RESPOND_TAKE_PHOTO:
          serviceImpl.respondTakePhoto((io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_START_VIDEO:
          serviceImpl.subscribeStartVideo((io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StartVideoResponse>) responseObserver);
          break;
        case METHODID_RESPOND_START_VIDEO:
          serviceImpl.respondStartVideo((io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_STOP_VIDEO:
          serviceImpl.subscribeStopVideo((io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StopVideoResponse>) responseObserver);
          break;
        case METHODID_RESPOND_STOP_VIDEO:
          serviceImpl.respondStopVideo((io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_START_VIDEO_STREAMING:
          serviceImpl.subscribeStartVideoStreaming((io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_RESPOND_START_VIDEO_STREAMING:
          serviceImpl.respondStartVideoStreaming((io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_STOP_VIDEO_STREAMING:
          serviceImpl.subscribeStopVideoStreaming((io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_RESPOND_STOP_VIDEO_STREAMING:
          serviceImpl.respondStopVideoStreaming((io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_SET_MODE:
          serviceImpl.subscribeSetMode((io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetModeResponse>) responseObserver);
          break;
        case METHODID_RESPOND_SET_MODE:
          serviceImpl.respondSetMode((io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_STORAGE_INFORMATION:
          serviceImpl.subscribeStorageInformation((io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse>) responseObserver);
          break;
        case METHODID_RESPOND_STORAGE_INFORMATION:
          serviceImpl.respondStorageInformation((io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CAPTURE_STATUS:
          serviceImpl.subscribeCaptureStatus((io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse>) responseObserver);
          break;
        case METHODID_RESPOND_CAPTURE_STATUS:
          serviceImpl.respondCaptureStatus((io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FORMAT_STORAGE:
          serviceImpl.subscribeFormatStorage((io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse>) responseObserver);
          break;
        case METHODID_RESPOND_FORMAT_STORAGE:
          serviceImpl.respondFormatStorage((io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_RESET_SETTINGS:
          serviceImpl.subscribeResetSettings((io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse>) responseObserver);
          break;
        case METHODID_RESPOND_RESET_SETTINGS:
          serviceImpl.respondResetSettings((io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ZOOM_IN_START:
          serviceImpl.subscribeZoomInStart((io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse>) responseObserver);
          break;
        case METHODID_RESPOND_ZOOM_IN_START:
          serviceImpl.respondZoomInStart((io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ZOOM_OUT_START:
          serviceImpl.subscribeZoomOutStart((io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse>) responseObserver);
          break;
        case METHODID_RESPOND_ZOOM_OUT_START:
          serviceImpl.respondZoomOutStart((io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ZOOM_STOP:
          serviceImpl.subscribeZoomStop((io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse>) responseObserver);
          break;
        case METHODID_RESPOND_ZOOM_STOP:
          serviceImpl.respondZoomStop((io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_ZOOM_RANGE:
          serviceImpl.subscribeZoomRange((io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse>) responseObserver);
          break;
        case METHODID_RESPOND_ZOOM_RANGE:
          serviceImpl.respondZoomRange((io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse>) responseObserver);
          break;
        case METHODID_SET_TRACKING_RECTANGLE_STATUS:
          serviceImpl.setTrackingRectangleStatus((io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse>) responseObserver);
          break;
        case METHODID_SET_TRACKING_OFF_STATUS:
          serviceImpl.setTrackingOffStatus((io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TRACKING_POINT_COMMAND:
          serviceImpl.subscribeTrackingPointCommand((io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TRACKING_RECTANGLE_COMMAND:
          serviceImpl.subscribeTrackingRectangleCommand((io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TRACKING_OFF_COMMAND:
          serviceImpl.subscribeTrackingOffCommand((io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse>) responseObserver);
          break;
        case METHODID_RESPOND_TRACKING_POINT_COMMAND:
          serviceImpl.respondTrackingPointCommand((io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse>) responseObserver);
          break;
        case METHODID_RESPOND_TRACKING_RECTANGLE_COMMAND:
          serviceImpl.respondTrackingRectangleCommand((io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse>) responseObserver);
          break;
        case METHODID_RESPOND_TRACKING_OFF_COMMAND:
          serviceImpl.respondTrackingOffCommand((io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse>) responseObserver);
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
          getSetInformationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SetInformationRequest,
              io.mavsdk.camera_server.CameraServerProto.SetInformationResponse>(
                service, METHODID_SET_INFORMATION)))
        .addMethod(
          getSetVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingRequest,
              io.mavsdk.camera_server.CameraServerProto.SetVideoStreamingResponse>(
                service, METHODID_SET_VIDEO_STREAMING)))
        .addMethod(
          getSetInProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SetInProgressRequest,
              io.mavsdk.camera_server.CameraServerProto.SetInProgressResponse>(
                service, METHODID_SET_IN_PROGRESS)))
        .addMethod(
          getSubscribeTakePhotoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeTakePhotoRequest,
              io.mavsdk.camera_server.CameraServerProto.TakePhotoResponse>(
                service, METHODID_SUBSCRIBE_TAKE_PHOTO)))
        .addMethod(
          getRespondTakePhotoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondTakePhotoResponse>(
                service, METHODID_RESPOND_TAKE_PHOTO)))
        .addMethod(
          getSubscribeStartVideoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoRequest,
              io.mavsdk.camera_server.CameraServerProto.StartVideoResponse>(
                service, METHODID_SUBSCRIBE_START_VIDEO)))
        .addMethod(
          getRespondStartVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondStartVideoRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondStartVideoResponse>(
                service, METHODID_RESPOND_START_VIDEO)))
        .addMethod(
          getSubscribeStopVideoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoRequest,
              io.mavsdk.camera_server.CameraServerProto.StopVideoResponse>(
                service, METHODID_SUBSCRIBE_STOP_VIDEO)))
        .addMethod(
          getRespondStopVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondStopVideoRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondStopVideoResponse>(
                service, METHODID_RESPOND_STOP_VIDEO)))
        .addMethod(
          getSubscribeStartVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeStartVideoStreamingRequest,
              io.mavsdk.camera_server.CameraServerProto.StartVideoStreamingResponse>(
                service, METHODID_SUBSCRIBE_START_VIDEO_STREAMING)))
        .addMethod(
          getRespondStartVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondStartVideoStreamingResponse>(
                service, METHODID_RESPOND_START_VIDEO_STREAMING)))
        .addMethod(
          getSubscribeStopVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeStopVideoStreamingRequest,
              io.mavsdk.camera_server.CameraServerProto.StopVideoStreamingResponse>(
                service, METHODID_SUBSCRIBE_STOP_VIDEO_STREAMING)))
        .addMethod(
          getRespondStopVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondStopVideoStreamingResponse>(
                service, METHODID_RESPOND_STOP_VIDEO_STREAMING)))
        .addMethod(
          getSubscribeSetModeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeSetModeRequest,
              io.mavsdk.camera_server.CameraServerProto.SetModeResponse>(
                service, METHODID_SUBSCRIBE_SET_MODE)))
        .addMethod(
          getRespondSetModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondSetModeRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondSetModeResponse>(
                service, METHODID_RESPOND_SET_MODE)))
        .addMethod(
          getSubscribeStorageInformationMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeStorageInformationRequest,
              io.mavsdk.camera_server.CameraServerProto.StorageInformationResponse>(
                service, METHODID_SUBSCRIBE_STORAGE_INFORMATION)))
        .addMethod(
          getRespondStorageInformationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondStorageInformationResponse>(
                service, METHODID_RESPOND_STORAGE_INFORMATION)))
        .addMethod(
          getSubscribeCaptureStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeCaptureStatusRequest,
              io.mavsdk.camera_server.CameraServerProto.CaptureStatusResponse>(
                service, METHODID_SUBSCRIBE_CAPTURE_STATUS)))
        .addMethod(
          getRespondCaptureStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondCaptureStatusResponse>(
                service, METHODID_RESPOND_CAPTURE_STATUS)))
        .addMethod(
          getSubscribeFormatStorageMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeFormatStorageRequest,
              io.mavsdk.camera_server.CameraServerProto.FormatStorageResponse>(
                service, METHODID_SUBSCRIBE_FORMAT_STORAGE)))
        .addMethod(
          getRespondFormatStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondFormatStorageResponse>(
                service, METHODID_RESPOND_FORMAT_STORAGE)))
        .addMethod(
          getSubscribeResetSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeResetSettingsRequest,
              io.mavsdk.camera_server.CameraServerProto.ResetSettingsResponse>(
                service, METHODID_SUBSCRIBE_RESET_SETTINGS)))
        .addMethod(
          getRespondResetSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondResetSettingsResponse>(
                service, METHODID_RESPOND_RESET_SETTINGS)))
        .addMethod(
          getSubscribeZoomInStartMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeZoomInStartRequest,
              io.mavsdk.camera_server.CameraServerProto.ZoomInStartResponse>(
                service, METHODID_SUBSCRIBE_ZOOM_IN_START)))
        .addMethod(
          getRespondZoomInStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondZoomInStartResponse>(
                service, METHODID_RESPOND_ZOOM_IN_START)))
        .addMethod(
          getSubscribeZoomOutStartMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeZoomOutStartRequest,
              io.mavsdk.camera_server.CameraServerProto.ZoomOutStartResponse>(
                service, METHODID_SUBSCRIBE_ZOOM_OUT_START)))
        .addMethod(
          getRespondZoomOutStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondZoomOutStartResponse>(
                service, METHODID_RESPOND_ZOOM_OUT_START)))
        .addMethod(
          getSubscribeZoomStopMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeZoomStopRequest,
              io.mavsdk.camera_server.CameraServerProto.ZoomStopResponse>(
                service, METHODID_SUBSCRIBE_ZOOM_STOP)))
        .addMethod(
          getRespondZoomStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondZoomStopRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondZoomStopResponse>(
                service, METHODID_RESPOND_ZOOM_STOP)))
        .addMethod(
          getSubscribeZoomRangeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeZoomRangeRequest,
              io.mavsdk.camera_server.CameraServerProto.ZoomRangeResponse>(
                service, METHODID_SUBSCRIBE_ZOOM_RANGE)))
        .addMethod(
          getRespondZoomRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondZoomRangeResponse>(
                service, METHODID_RESPOND_ZOOM_RANGE)))
        .addMethod(
          getSetTrackingRectangleStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusRequest,
              io.mavsdk.camera_server.CameraServerProto.SetTrackingRectangleStatusResponse>(
                service, METHODID_SET_TRACKING_RECTANGLE_STATUS)))
        .addMethod(
          getSetTrackingOffStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusRequest,
              io.mavsdk.camera_server.CameraServerProto.SetTrackingOffStatusResponse>(
                service, METHODID_SET_TRACKING_OFF_STATUS)))
        .addMethod(
          getSubscribeTrackingPointCommandMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingPointCommandRequest,
              io.mavsdk.camera_server.CameraServerProto.TrackingPointCommandResponse>(
                service, METHODID_SUBSCRIBE_TRACKING_POINT_COMMAND)))
        .addMethod(
          getSubscribeTrackingRectangleCommandMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingRectangleCommandRequest,
              io.mavsdk.camera_server.CameraServerProto.TrackingRectangleCommandResponse>(
                service, METHODID_SUBSCRIBE_TRACKING_RECTANGLE_COMMAND)))
        .addMethod(
          getSubscribeTrackingOffCommandMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.SubscribeTrackingOffCommandRequest,
              io.mavsdk.camera_server.CameraServerProto.TrackingOffCommandResponse>(
                service, METHODID_SUBSCRIBE_TRACKING_OFF_COMMAND)))
        .addMethod(
          getRespondTrackingPointCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondTrackingPointCommandResponse>(
                service, METHODID_RESPOND_TRACKING_POINT_COMMAND)))
        .addMethod(
          getRespondTrackingRectangleCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondTrackingRectangleCommandResponse>(
                service, METHODID_RESPOND_TRACKING_RECTANGLE_COMMAND)))
        .addMethod(
          getRespondTrackingOffCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandRequest,
              io.mavsdk.camera_server.CameraServerProto.RespondTrackingOffCommandResponse>(
                service, METHODID_RESPOND_TRACKING_OFF_COMMAND)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CameraServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getSetInformationMethod())
              .addMethod(getSetVideoStreamingMethod())
              .addMethod(getSetInProgressMethod())
              .addMethod(getSubscribeTakePhotoMethod())
              .addMethod(getRespondTakePhotoMethod())
              .addMethod(getSubscribeStartVideoMethod())
              .addMethod(getRespondStartVideoMethod())
              .addMethod(getSubscribeStopVideoMethod())
              .addMethod(getRespondStopVideoMethod())
              .addMethod(getSubscribeStartVideoStreamingMethod())
              .addMethod(getRespondStartVideoStreamingMethod())
              .addMethod(getSubscribeStopVideoStreamingMethod())
              .addMethod(getRespondStopVideoStreamingMethod())
              .addMethod(getSubscribeSetModeMethod())
              .addMethod(getRespondSetModeMethod())
              .addMethod(getSubscribeStorageInformationMethod())
              .addMethod(getRespondStorageInformationMethod())
              .addMethod(getSubscribeCaptureStatusMethod())
              .addMethod(getRespondCaptureStatusMethod())
              .addMethod(getSubscribeFormatStorageMethod())
              .addMethod(getRespondFormatStorageMethod())
              .addMethod(getSubscribeResetSettingsMethod())
              .addMethod(getRespondResetSettingsMethod())
              .addMethod(getSubscribeZoomInStartMethod())
              .addMethod(getRespondZoomInStartMethod())
              .addMethod(getSubscribeZoomOutStartMethod())
              .addMethod(getRespondZoomOutStartMethod())
              .addMethod(getSubscribeZoomStopMethod())
              .addMethod(getRespondZoomStopMethod())
              .addMethod(getSubscribeZoomRangeMethod())
              .addMethod(getRespondZoomRangeMethod())
              .addMethod(getSetTrackingRectangleStatusMethod())
              .addMethod(getSetTrackingOffStatusMethod())
              .addMethod(getSubscribeTrackingPointCommandMethod())
              .addMethod(getSubscribeTrackingRectangleCommandMethod())
              .addMethod(getSubscribeTrackingOffCommandMethod())
              .addMethod(getRespondTrackingPointCommandMethod())
              .addMethod(getRespondTrackingRectangleCommandMethod())
              .addMethod(getRespondTrackingOffCommandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
