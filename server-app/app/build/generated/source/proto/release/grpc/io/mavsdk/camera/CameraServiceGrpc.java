package io.mavsdk.camera;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Can be used to manage cameras that implement the MAVLink
 * Camera Protocol: https://mavlink.io/en/protocol/camera.html.
 * Currently only a single camera is supported.
 * When multiple cameras are supported the plugin will need to be
 * instantiated separately for every camera and the camera selected using
 * `select_camera`.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/camera/camera.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CameraServiceGrpc {

  private CameraServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.camera.CameraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.PrepareRequest,
      io.mavsdk.camera.CameraProto.PrepareResponse> getPrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Prepare",
      requestType = io.mavsdk.camera.CameraProto.PrepareRequest.class,
      responseType = io.mavsdk.camera.CameraProto.PrepareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.PrepareRequest,
      io.mavsdk.camera.CameraProto.PrepareResponse> getPrepareMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.PrepareRequest, io.mavsdk.camera.CameraProto.PrepareResponse> getPrepareMethod;
    if ((getPrepareMethod = CameraServiceGrpc.getPrepareMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getPrepareMethod = CameraServiceGrpc.getPrepareMethod) == null) {
          CameraServiceGrpc.getPrepareMethod = getPrepareMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.PrepareRequest, io.mavsdk.camera.CameraProto.PrepareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Prepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.PrepareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.PrepareResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TakePhotoRequest,
      io.mavsdk.camera.CameraProto.TakePhotoResponse> getTakePhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TakePhoto",
      requestType = io.mavsdk.camera.CameraProto.TakePhotoRequest.class,
      responseType = io.mavsdk.camera.CameraProto.TakePhotoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TakePhotoRequest,
      io.mavsdk.camera.CameraProto.TakePhotoResponse> getTakePhotoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TakePhotoRequest, io.mavsdk.camera.CameraProto.TakePhotoResponse> getTakePhotoMethod;
    if ((getTakePhotoMethod = CameraServiceGrpc.getTakePhotoMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getTakePhotoMethod = CameraServiceGrpc.getTakePhotoMethod) == null) {
          CameraServiceGrpc.getTakePhotoMethod = getTakePhotoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.TakePhotoRequest, io.mavsdk.camera.CameraProto.TakePhotoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TakePhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TakePhotoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TakePhotoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTakePhotoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest,
      io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse> getStartPhotoIntervalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartPhotoInterval",
      requestType = io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest,
      io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse> getStartPhotoIntervalMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest, io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse> getStartPhotoIntervalMethod;
    if ((getStartPhotoIntervalMethod = CameraServiceGrpc.getStartPhotoIntervalMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStartPhotoIntervalMethod = CameraServiceGrpc.getStartPhotoIntervalMethod) == null) {
          CameraServiceGrpc.getStartPhotoIntervalMethod = getStartPhotoIntervalMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest, io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartPhotoInterval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartPhotoIntervalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest,
      io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse> getStopPhotoIntervalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopPhotoInterval",
      requestType = io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest,
      io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse> getStopPhotoIntervalMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest, io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse> getStopPhotoIntervalMethod;
    if ((getStopPhotoIntervalMethod = CameraServiceGrpc.getStopPhotoIntervalMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStopPhotoIntervalMethod = CameraServiceGrpc.getStopPhotoIntervalMethod) == null) {
          CameraServiceGrpc.getStopPhotoIntervalMethod = getStopPhotoIntervalMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest, io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopPhotoInterval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopPhotoIntervalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartVideoRequest,
      io.mavsdk.camera.CameraProto.StartVideoResponse> getStartVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartVideo",
      requestType = io.mavsdk.camera.CameraProto.StartVideoRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StartVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartVideoRequest,
      io.mavsdk.camera.CameraProto.StartVideoResponse> getStartVideoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartVideoRequest, io.mavsdk.camera.CameraProto.StartVideoResponse> getStartVideoMethod;
    if ((getStartVideoMethod = CameraServiceGrpc.getStartVideoMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStartVideoMethod = CameraServiceGrpc.getStartVideoMethod) == null) {
          CameraServiceGrpc.getStartVideoMethod = getStartVideoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.StartVideoRequest, io.mavsdk.camera.CameraProto.StartVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StartVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StartVideoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopVideoRequest,
      io.mavsdk.camera.CameraProto.StopVideoResponse> getStopVideoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopVideo",
      requestType = io.mavsdk.camera.CameraProto.StopVideoRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StopVideoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopVideoRequest,
      io.mavsdk.camera.CameraProto.StopVideoResponse> getStopVideoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopVideoRequest, io.mavsdk.camera.CameraProto.StopVideoResponse> getStopVideoMethod;
    if ((getStopVideoMethod = CameraServiceGrpc.getStopVideoMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStopVideoMethod = CameraServiceGrpc.getStopVideoMethod) == null) {
          CameraServiceGrpc.getStopVideoMethod = getStopVideoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.StopVideoRequest, io.mavsdk.camera.CameraProto.StopVideoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopVideo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StopVideoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StopVideoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopVideoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartVideoStreamingRequest,
      io.mavsdk.camera.CameraProto.StartVideoStreamingResponse> getStartVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartVideoStreaming",
      requestType = io.mavsdk.camera.CameraProto.StartVideoStreamingRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StartVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartVideoStreamingRequest,
      io.mavsdk.camera.CameraProto.StartVideoStreamingResponse> getStartVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StartVideoStreamingRequest, io.mavsdk.camera.CameraProto.StartVideoStreamingResponse> getStartVideoStreamingMethod;
    if ((getStartVideoStreamingMethod = CameraServiceGrpc.getStartVideoStreamingMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStartVideoStreamingMethod = CameraServiceGrpc.getStartVideoStreamingMethod) == null) {
          CameraServiceGrpc.getStartVideoStreamingMethod = getStartVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.StartVideoStreamingRequest, io.mavsdk.camera.CameraProto.StartVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StartVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StartVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopVideoStreamingRequest,
      io.mavsdk.camera.CameraProto.StopVideoStreamingResponse> getStopVideoStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopVideoStreaming",
      requestType = io.mavsdk.camera.CameraProto.StopVideoStreamingRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StopVideoStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopVideoStreamingRequest,
      io.mavsdk.camera.CameraProto.StopVideoStreamingResponse> getStopVideoStreamingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.StopVideoStreamingRequest, io.mavsdk.camera.CameraProto.StopVideoStreamingResponse> getStopVideoStreamingMethod;
    if ((getStopVideoStreamingMethod = CameraServiceGrpc.getStopVideoStreamingMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getStopVideoStreamingMethod = CameraServiceGrpc.getStopVideoStreamingMethod) == null) {
          CameraServiceGrpc.getStopVideoStreamingMethod = getStopVideoStreamingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.StopVideoStreamingRequest, io.mavsdk.camera.CameraProto.StopVideoStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopVideoStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StopVideoStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StopVideoStreamingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStopVideoStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SetModeRequest,
      io.mavsdk.camera.CameraProto.SetModeResponse> getSetModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetMode",
      requestType = io.mavsdk.camera.CameraProto.SetModeRequest.class,
      responseType = io.mavsdk.camera.CameraProto.SetModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SetModeRequest,
      io.mavsdk.camera.CameraProto.SetModeResponse> getSetModeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SetModeRequest, io.mavsdk.camera.CameraProto.SetModeResponse> getSetModeMethod;
    if ((getSetModeMethod = CameraServiceGrpc.getSetModeMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSetModeMethod = CameraServiceGrpc.getSetModeMethod) == null) {
          CameraServiceGrpc.getSetModeMethod = getSetModeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SetModeRequest, io.mavsdk.camera.CameraProto.SetModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SetModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SetModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ListPhotosRequest,
      io.mavsdk.camera.CameraProto.ListPhotosResponse> getListPhotosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPhotos",
      requestType = io.mavsdk.camera.CameraProto.ListPhotosRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ListPhotosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ListPhotosRequest,
      io.mavsdk.camera.CameraProto.ListPhotosResponse> getListPhotosMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ListPhotosRequest, io.mavsdk.camera.CameraProto.ListPhotosResponse> getListPhotosMethod;
    if ((getListPhotosMethod = CameraServiceGrpc.getListPhotosMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getListPhotosMethod = CameraServiceGrpc.getListPhotosMethod) == null) {
          CameraServiceGrpc.getListPhotosMethod = getListPhotosMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.ListPhotosRequest, io.mavsdk.camera.CameraProto.ListPhotosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPhotos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ListPhotosRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ListPhotosResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getListPhotosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeModeRequest,
      io.mavsdk.camera.CameraProto.ModeResponse> getSubscribeModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeMode",
      requestType = io.mavsdk.camera.CameraProto.SubscribeModeRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ModeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeModeRequest,
      io.mavsdk.camera.CameraProto.ModeResponse> getSubscribeModeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeModeRequest, io.mavsdk.camera.CameraProto.ModeResponse> getSubscribeModeMethod;
    if ((getSubscribeModeMethod = CameraServiceGrpc.getSubscribeModeMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribeModeMethod = CameraServiceGrpc.getSubscribeModeMethod) == null) {
          CameraServiceGrpc.getSubscribeModeMethod = getSubscribeModeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribeModeRequest, io.mavsdk.camera.CameraProto.ModeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribeModeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ModeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeInformationRequest,
      io.mavsdk.camera.CameraProto.InformationResponse> getSubscribeInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeInformation",
      requestType = io.mavsdk.camera.CameraProto.SubscribeInformationRequest.class,
      responseType = io.mavsdk.camera.CameraProto.InformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeInformationRequest,
      io.mavsdk.camera.CameraProto.InformationResponse> getSubscribeInformationMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeInformationRequest, io.mavsdk.camera.CameraProto.InformationResponse> getSubscribeInformationMethod;
    if ((getSubscribeInformationMethod = CameraServiceGrpc.getSubscribeInformationMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribeInformationMethod = CameraServiceGrpc.getSubscribeInformationMethod) == null) {
          CameraServiceGrpc.getSubscribeInformationMethod = getSubscribeInformationMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribeInformationRequest, io.mavsdk.camera.CameraProto.InformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribeInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.InformationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest,
      io.mavsdk.camera.CameraProto.VideoStreamInfoResponse> getSubscribeVideoStreamInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeVideoStreamInfo",
      requestType = io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest.class,
      responseType = io.mavsdk.camera.CameraProto.VideoStreamInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest,
      io.mavsdk.camera.CameraProto.VideoStreamInfoResponse> getSubscribeVideoStreamInfoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest, io.mavsdk.camera.CameraProto.VideoStreamInfoResponse> getSubscribeVideoStreamInfoMethod;
    if ((getSubscribeVideoStreamInfoMethod = CameraServiceGrpc.getSubscribeVideoStreamInfoMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribeVideoStreamInfoMethod = CameraServiceGrpc.getSubscribeVideoStreamInfoMethod) == null) {
          CameraServiceGrpc.getSubscribeVideoStreamInfoMethod = getSubscribeVideoStreamInfoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest, io.mavsdk.camera.CameraProto.VideoStreamInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeVideoStreamInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.VideoStreamInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeVideoStreamInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest,
      io.mavsdk.camera.CameraProto.CaptureInfoResponse> getSubscribeCaptureInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCaptureInfo",
      requestType = io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest.class,
      responseType = io.mavsdk.camera.CameraProto.CaptureInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest,
      io.mavsdk.camera.CameraProto.CaptureInfoResponse> getSubscribeCaptureInfoMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest, io.mavsdk.camera.CameraProto.CaptureInfoResponse> getSubscribeCaptureInfoMethod;
    if ((getSubscribeCaptureInfoMethod = CameraServiceGrpc.getSubscribeCaptureInfoMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribeCaptureInfoMethod = CameraServiceGrpc.getSubscribeCaptureInfoMethod) == null) {
          CameraServiceGrpc.getSubscribeCaptureInfoMethod = getSubscribeCaptureInfoMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest, io.mavsdk.camera.CameraProto.CaptureInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCaptureInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.CaptureInfoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCaptureInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeStatusRequest,
      io.mavsdk.camera.CameraProto.StatusResponse> getSubscribeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeStatus",
      requestType = io.mavsdk.camera.CameraProto.SubscribeStatusRequest.class,
      responseType = io.mavsdk.camera.CameraProto.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeStatusRequest,
      io.mavsdk.camera.CameraProto.StatusResponse> getSubscribeStatusMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeStatusRequest, io.mavsdk.camera.CameraProto.StatusResponse> getSubscribeStatusMethod;
    if ((getSubscribeStatusMethod = CameraServiceGrpc.getSubscribeStatusMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribeStatusMethod = CameraServiceGrpc.getSubscribeStatusMethod) == null) {
          CameraServiceGrpc.getSubscribeStatusMethod = getSubscribeStatusMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribeStatusRequest, io.mavsdk.camera.CameraProto.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribeStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.StatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest,
      io.mavsdk.camera.CameraProto.CurrentSettingsResponse> getSubscribeCurrentSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeCurrentSettings",
      requestType = io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest.class,
      responseType = io.mavsdk.camera.CameraProto.CurrentSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest,
      io.mavsdk.camera.CameraProto.CurrentSettingsResponse> getSubscribeCurrentSettingsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest, io.mavsdk.camera.CameraProto.CurrentSettingsResponse> getSubscribeCurrentSettingsMethod;
    if ((getSubscribeCurrentSettingsMethod = CameraServiceGrpc.getSubscribeCurrentSettingsMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribeCurrentSettingsMethod = CameraServiceGrpc.getSubscribeCurrentSettingsMethod) == null) {
          CameraServiceGrpc.getSubscribeCurrentSettingsMethod = getSubscribeCurrentSettingsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest, io.mavsdk.camera.CameraProto.CurrentSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeCurrentSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.CurrentSettingsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeCurrentSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest,
      io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse> getSubscribePossibleSettingOptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribePossibleSettingOptions",
      requestType = io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest.class,
      responseType = io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest,
      io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse> getSubscribePossibleSettingOptionsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest, io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse> getSubscribePossibleSettingOptionsMethod;
    if ((getSubscribePossibleSettingOptionsMethod = CameraServiceGrpc.getSubscribePossibleSettingOptionsMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSubscribePossibleSettingOptionsMethod = CameraServiceGrpc.getSubscribePossibleSettingOptionsMethod) == null) {
          CameraServiceGrpc.getSubscribePossibleSettingOptionsMethod = getSubscribePossibleSettingOptionsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest, io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribePossibleSettingOptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribePossibleSettingOptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SetSettingRequest,
      io.mavsdk.camera.CameraProto.SetSettingResponse> getSetSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSetting",
      requestType = io.mavsdk.camera.CameraProto.SetSettingRequest.class,
      responseType = io.mavsdk.camera.CameraProto.SetSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SetSettingRequest,
      io.mavsdk.camera.CameraProto.SetSettingResponse> getSetSettingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SetSettingRequest, io.mavsdk.camera.CameraProto.SetSettingResponse> getSetSettingMethod;
    if ((getSetSettingMethod = CameraServiceGrpc.getSetSettingMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSetSettingMethod = CameraServiceGrpc.getSetSettingMethod) == null) {
          CameraServiceGrpc.getSetSettingMethod = getSetSettingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SetSettingRequest, io.mavsdk.camera.CameraProto.SetSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SetSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SetSettingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.GetSettingRequest,
      io.mavsdk.camera.CameraProto.GetSettingResponse> getGetSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSetting",
      requestType = io.mavsdk.camera.CameraProto.GetSettingRequest.class,
      responseType = io.mavsdk.camera.CameraProto.GetSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.GetSettingRequest,
      io.mavsdk.camera.CameraProto.GetSettingResponse> getGetSettingMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.GetSettingRequest, io.mavsdk.camera.CameraProto.GetSettingResponse> getGetSettingMethod;
    if ((getGetSettingMethod = CameraServiceGrpc.getGetSettingMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getGetSettingMethod = CameraServiceGrpc.getGetSettingMethod) == null) {
          CameraServiceGrpc.getGetSettingMethod = getGetSettingMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.GetSettingRequest, io.mavsdk.camera.CameraProto.GetSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.GetSettingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.GetSettingResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FormatStorageRequest,
      io.mavsdk.camera.CameraProto.FormatStorageResponse> getFormatStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FormatStorage",
      requestType = io.mavsdk.camera.CameraProto.FormatStorageRequest.class,
      responseType = io.mavsdk.camera.CameraProto.FormatStorageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FormatStorageRequest,
      io.mavsdk.camera.CameraProto.FormatStorageResponse> getFormatStorageMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FormatStorageRequest, io.mavsdk.camera.CameraProto.FormatStorageResponse> getFormatStorageMethod;
    if ((getFormatStorageMethod = CameraServiceGrpc.getFormatStorageMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getFormatStorageMethod = CameraServiceGrpc.getFormatStorageMethod) == null) {
          CameraServiceGrpc.getFormatStorageMethod = getFormatStorageMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.FormatStorageRequest, io.mavsdk.camera.CameraProto.FormatStorageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FormatStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FormatStorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FormatStorageResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFormatStorageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SelectCameraRequest,
      io.mavsdk.camera.CameraProto.SelectCameraResponse> getSelectCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelectCamera",
      requestType = io.mavsdk.camera.CameraProto.SelectCameraRequest.class,
      responseType = io.mavsdk.camera.CameraProto.SelectCameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SelectCameraRequest,
      io.mavsdk.camera.CameraProto.SelectCameraResponse> getSelectCameraMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.SelectCameraRequest, io.mavsdk.camera.CameraProto.SelectCameraResponse> getSelectCameraMethod;
    if ((getSelectCameraMethod = CameraServiceGrpc.getSelectCameraMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getSelectCameraMethod = CameraServiceGrpc.getSelectCameraMethod) == null) {
          CameraServiceGrpc.getSelectCameraMethod = getSelectCameraMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.SelectCameraRequest, io.mavsdk.camera.CameraProto.SelectCameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SelectCameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.SelectCameraResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSelectCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ResetSettingsRequest,
      io.mavsdk.camera.CameraProto.ResetSettingsResponse> getResetSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetSettings",
      requestType = io.mavsdk.camera.CameraProto.ResetSettingsRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ResetSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ResetSettingsRequest,
      io.mavsdk.camera.CameraProto.ResetSettingsResponse> getResetSettingsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ResetSettingsRequest, io.mavsdk.camera.CameraProto.ResetSettingsResponse> getResetSettingsMethod;
    if ((getResetSettingsMethod = CameraServiceGrpc.getResetSettingsMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getResetSettingsMethod = CameraServiceGrpc.getResetSettingsMethod) == null) {
          CameraServiceGrpc.getResetSettingsMethod = getResetSettingsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.ResetSettingsRequest, io.mavsdk.camera.CameraProto.ResetSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ResetSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ResetSettingsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getResetSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomInStartRequest,
      io.mavsdk.camera.CameraProto.ZoomInStartResponse> getZoomInStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoomInStart",
      requestType = io.mavsdk.camera.CameraProto.ZoomInStartRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ZoomInStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomInStartRequest,
      io.mavsdk.camera.CameraProto.ZoomInStartResponse> getZoomInStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomInStartRequest, io.mavsdk.camera.CameraProto.ZoomInStartResponse> getZoomInStartMethod;
    if ((getZoomInStartMethod = CameraServiceGrpc.getZoomInStartMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getZoomInStartMethod = CameraServiceGrpc.getZoomInStartMethod) == null) {
          CameraServiceGrpc.getZoomInStartMethod = getZoomInStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.ZoomInStartRequest, io.mavsdk.camera.CameraProto.ZoomInStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoomInStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomInStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomInStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getZoomInStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomOutStartRequest,
      io.mavsdk.camera.CameraProto.ZoomOutStartResponse> getZoomOutStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoomOutStart",
      requestType = io.mavsdk.camera.CameraProto.ZoomOutStartRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ZoomOutStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomOutStartRequest,
      io.mavsdk.camera.CameraProto.ZoomOutStartResponse> getZoomOutStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomOutStartRequest, io.mavsdk.camera.CameraProto.ZoomOutStartResponse> getZoomOutStartMethod;
    if ((getZoomOutStartMethod = CameraServiceGrpc.getZoomOutStartMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getZoomOutStartMethod = CameraServiceGrpc.getZoomOutStartMethod) == null) {
          CameraServiceGrpc.getZoomOutStartMethod = getZoomOutStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.ZoomOutStartRequest, io.mavsdk.camera.CameraProto.ZoomOutStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoomOutStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomOutStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomOutStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getZoomOutStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomStopRequest,
      io.mavsdk.camera.CameraProto.ZoomStopResponse> getZoomStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoomStop",
      requestType = io.mavsdk.camera.CameraProto.ZoomStopRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ZoomStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomStopRequest,
      io.mavsdk.camera.CameraProto.ZoomStopResponse> getZoomStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomStopRequest, io.mavsdk.camera.CameraProto.ZoomStopResponse> getZoomStopMethod;
    if ((getZoomStopMethod = CameraServiceGrpc.getZoomStopMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getZoomStopMethod = CameraServiceGrpc.getZoomStopMethod) == null) {
          CameraServiceGrpc.getZoomStopMethod = getZoomStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.ZoomStopRequest, io.mavsdk.camera.CameraProto.ZoomStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoomStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomStopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getZoomStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomRangeRequest,
      io.mavsdk.camera.CameraProto.ZoomRangeResponse> getZoomRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ZoomRange",
      requestType = io.mavsdk.camera.CameraProto.ZoomRangeRequest.class,
      responseType = io.mavsdk.camera.CameraProto.ZoomRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomRangeRequest,
      io.mavsdk.camera.CameraProto.ZoomRangeResponse> getZoomRangeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.ZoomRangeRequest, io.mavsdk.camera.CameraProto.ZoomRangeResponse> getZoomRangeMethod;
    if ((getZoomRangeMethod = CameraServiceGrpc.getZoomRangeMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getZoomRangeMethod = CameraServiceGrpc.getZoomRangeMethod) == null) {
          CameraServiceGrpc.getZoomRangeMethod = getZoomRangeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.ZoomRangeRequest, io.mavsdk.camera.CameraProto.ZoomRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ZoomRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.ZoomRangeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getZoomRangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackPointRequest,
      io.mavsdk.camera.CameraProto.TrackPointResponse> getTrackPointMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackPoint",
      requestType = io.mavsdk.camera.CameraProto.TrackPointRequest.class,
      responseType = io.mavsdk.camera.CameraProto.TrackPointResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackPointRequest,
      io.mavsdk.camera.CameraProto.TrackPointResponse> getTrackPointMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackPointRequest, io.mavsdk.camera.CameraProto.TrackPointResponse> getTrackPointMethod;
    if ((getTrackPointMethod = CameraServiceGrpc.getTrackPointMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getTrackPointMethod = CameraServiceGrpc.getTrackPointMethod) == null) {
          CameraServiceGrpc.getTrackPointMethod = getTrackPointMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.TrackPointRequest, io.mavsdk.camera.CameraProto.TrackPointResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackPoint"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TrackPointRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TrackPointResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTrackPointMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackRectangleRequest,
      io.mavsdk.camera.CameraProto.TrackRectangleResponse> getTrackRectangleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackRectangle",
      requestType = io.mavsdk.camera.CameraProto.TrackRectangleRequest.class,
      responseType = io.mavsdk.camera.CameraProto.TrackRectangleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackRectangleRequest,
      io.mavsdk.camera.CameraProto.TrackRectangleResponse> getTrackRectangleMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackRectangleRequest, io.mavsdk.camera.CameraProto.TrackRectangleResponse> getTrackRectangleMethod;
    if ((getTrackRectangleMethod = CameraServiceGrpc.getTrackRectangleMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getTrackRectangleMethod = CameraServiceGrpc.getTrackRectangleMethod) == null) {
          CameraServiceGrpc.getTrackRectangleMethod = getTrackRectangleMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.TrackRectangleRequest, io.mavsdk.camera.CameraProto.TrackRectangleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackRectangle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TrackRectangleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TrackRectangleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTrackRectangleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackStopRequest,
      io.mavsdk.camera.CameraProto.TrackStopResponse> getTrackStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackStop",
      requestType = io.mavsdk.camera.CameraProto.TrackStopRequest.class,
      responseType = io.mavsdk.camera.CameraProto.TrackStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackStopRequest,
      io.mavsdk.camera.CameraProto.TrackStopResponse> getTrackStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.TrackStopRequest, io.mavsdk.camera.CameraProto.TrackStopResponse> getTrackStopMethod;
    if ((getTrackStopMethod = CameraServiceGrpc.getTrackStopMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getTrackStopMethod = CameraServiceGrpc.getTrackStopMethod) == null) {
          CameraServiceGrpc.getTrackStopMethod = getTrackStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.TrackStopRequest, io.mavsdk.camera.CameraProto.TrackStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TrackStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.TrackStopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getTrackStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusInStartRequest,
      io.mavsdk.camera.CameraProto.FocusInStartResponse> getFocusInStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FocusInStart",
      requestType = io.mavsdk.camera.CameraProto.FocusInStartRequest.class,
      responseType = io.mavsdk.camera.CameraProto.FocusInStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusInStartRequest,
      io.mavsdk.camera.CameraProto.FocusInStartResponse> getFocusInStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusInStartRequest, io.mavsdk.camera.CameraProto.FocusInStartResponse> getFocusInStartMethod;
    if ((getFocusInStartMethod = CameraServiceGrpc.getFocusInStartMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getFocusInStartMethod = CameraServiceGrpc.getFocusInStartMethod) == null) {
          CameraServiceGrpc.getFocusInStartMethod = getFocusInStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.FocusInStartRequest, io.mavsdk.camera.CameraProto.FocusInStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FocusInStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusInStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusInStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFocusInStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusOutStartRequest,
      io.mavsdk.camera.CameraProto.FocusOutStartResponse> getFocusOutStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FocusOutStart",
      requestType = io.mavsdk.camera.CameraProto.FocusOutStartRequest.class,
      responseType = io.mavsdk.camera.CameraProto.FocusOutStartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusOutStartRequest,
      io.mavsdk.camera.CameraProto.FocusOutStartResponse> getFocusOutStartMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusOutStartRequest, io.mavsdk.camera.CameraProto.FocusOutStartResponse> getFocusOutStartMethod;
    if ((getFocusOutStartMethod = CameraServiceGrpc.getFocusOutStartMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getFocusOutStartMethod = CameraServiceGrpc.getFocusOutStartMethod) == null) {
          CameraServiceGrpc.getFocusOutStartMethod = getFocusOutStartMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.FocusOutStartRequest, io.mavsdk.camera.CameraProto.FocusOutStartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FocusOutStart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusOutStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusOutStartResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFocusOutStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusStopRequest,
      io.mavsdk.camera.CameraProto.FocusStopResponse> getFocusStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FocusStop",
      requestType = io.mavsdk.camera.CameraProto.FocusStopRequest.class,
      responseType = io.mavsdk.camera.CameraProto.FocusStopResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusStopRequest,
      io.mavsdk.camera.CameraProto.FocusStopResponse> getFocusStopMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusStopRequest, io.mavsdk.camera.CameraProto.FocusStopResponse> getFocusStopMethod;
    if ((getFocusStopMethod = CameraServiceGrpc.getFocusStopMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getFocusStopMethod = CameraServiceGrpc.getFocusStopMethod) == null) {
          CameraServiceGrpc.getFocusStopMethod = getFocusStopMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.FocusStopRequest, io.mavsdk.camera.CameraProto.FocusStopResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FocusStop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusStopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusStopResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFocusStopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusRangeRequest,
      io.mavsdk.camera.CameraProto.FocusRangeResponse> getFocusRangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FocusRange",
      requestType = io.mavsdk.camera.CameraProto.FocusRangeRequest.class,
      responseType = io.mavsdk.camera.CameraProto.FocusRangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusRangeRequest,
      io.mavsdk.camera.CameraProto.FocusRangeResponse> getFocusRangeMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.camera.CameraProto.FocusRangeRequest, io.mavsdk.camera.CameraProto.FocusRangeResponse> getFocusRangeMethod;
    if ((getFocusRangeMethod = CameraServiceGrpc.getFocusRangeMethod) == null) {
      synchronized (CameraServiceGrpc.class) {
        if ((getFocusRangeMethod = CameraServiceGrpc.getFocusRangeMethod) == null) {
          CameraServiceGrpc.getFocusRangeMethod = getFocusRangeMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.camera.CameraProto.FocusRangeRequest, io.mavsdk.camera.CameraProto.FocusRangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FocusRange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusRangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.camera.CameraProto.FocusRangeResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getFocusRangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceStub>() {
        @java.lang.Override
        public CameraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceStub(channel, callOptions);
        }
      };
    return CameraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceBlockingStub>() {
        @java.lang.Override
        public CameraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceBlockingStub(channel, callOptions);
        }
      };
    return CameraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraServiceFutureStub>() {
        @java.lang.Override
        public CameraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraServiceFutureStub(channel, callOptions);
        }
      };
    return CameraServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Can be used to manage cameras that implement the MAVLink
   * Camera Protocol: https://mavlink.io/en/protocol/camera.html.
   * Currently only a single camera is supported.
   * When multiple cameras are supported the plugin will need to be
   * instantiated separately for every camera and the camera selected using
   * `select_camera`.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Prepare the camera plugin (e.g. download the camera definition, etc).
     * </pre>
     */
    default void prepare(io.mavsdk.camera.CameraProto.PrepareRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.PrepareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrepareMethod(), responseObserver);
    }

    /**
     * <pre>
     * Take one photo.
     * </pre>
     */
    default void takePhoto(io.mavsdk.camera.CameraProto.TakePhotoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TakePhotoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTakePhotoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start photo timelapse with a given interval.
     * </pre>
     */
    default void startPhotoInterval(io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartPhotoIntervalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop a running photo timelapse.
     * </pre>
     */
    default void stopPhotoInterval(io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopPhotoIntervalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start a video recording.
     * </pre>
     */
    default void startVideo(io.mavsdk.camera.CameraProto.StartVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop a running video recording.
     * </pre>
     */
    default void stopVideo(io.mavsdk.camera.CameraProto.StopVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopVideoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopVideoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start video streaming.
     * </pre>
     */
    default void startVideoStreaming(io.mavsdk.camera.CameraProto.StartVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop current video streaming.
     * </pre>
     */
    default void stopVideoStreaming(io.mavsdk.camera.CameraProto.StopVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopVideoStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set camera mode.
     * </pre>
     */
    default void setMode(io.mavsdk.camera.CameraProto.SetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SetModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List photos available on the camera.
     * </pre>
     */
    default void listPhotos(io.mavsdk.camera.CameraProto.ListPhotosRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ListPhotosResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPhotosMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera mode updates.
     * </pre>
     */
    default void subscribeMode(io.mavsdk.camera.CameraProto.SubscribeModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ModeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera information updates.
     * </pre>
     */
    default void subscribeInformation(io.mavsdk.camera.CameraProto.SubscribeInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.InformationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to video stream info updates.
     * </pre>
     */
    default void subscribeVideoStreamInfo(io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.VideoStreamInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeVideoStreamInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to capture info updates.
     * </pre>
     */
    default void subscribeCaptureInfo(io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.CaptureInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCaptureInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera status updates.
     * </pre>
     */
    default void subscribeStatus(io.mavsdk.camera.CameraProto.SubscribeStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the list of current camera settings.
     * </pre>
     */
    default void subscribeCurrentSettings(io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.CurrentSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeCurrentSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the list of settings that can be changed.
     * </pre>
     */
    default void subscribePossibleSettingOptions(io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribePossibleSettingOptionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set a setting to some value.
     * Only setting_id of setting and option_id of option needs to be set.
     * </pre>
     */
    default void setSetting(io.mavsdk.camera.CameraProto.SetSettingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SetSettingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a setting.
     * Only setting_id of setting needs to be set.
     * </pre>
     */
    default void getSetting(io.mavsdk.camera.CameraProto.GetSettingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.GetSettingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSettingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Format storage (e.g. SD card) in camera.
     * This will delete all content of the camera storage!
     * </pre>
     */
    default void formatStorage(io.mavsdk.camera.CameraProto.FormatStorageRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FormatStorageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFormatStorageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Select current camera .
     * Bind the plugin instance to a specific camera_id
     * </pre>
     */
    default void selectCamera(io.mavsdk.camera.CameraProto.SelectCameraRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SelectCameraResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reset all settings in camera.
     * This will reset all camera settings to default value
     * </pre>
     */
    default void resetSettings(io.mavsdk.camera.CameraProto.ResetSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ResetSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start zooming in.
     * </pre>
     */
    default void zoomInStart(io.mavsdk.camera.CameraProto.ZoomInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomInStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoomInStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start zooming out.
     * </pre>
     */
    default void zoomOutStart(io.mavsdk.camera.CameraProto.ZoomOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomOutStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoomOutStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop zooming.
     * </pre>
     */
    default void zoomStop(io.mavsdk.camera.CameraProto.ZoomStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomStopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoomStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Zoom to value as proportion of full camera range (percentage between 0.0 and 100.0).
     * </pre>
     */
    default void zoomRange(io.mavsdk.camera.CameraProto.ZoomRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getZoomRangeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Track point.
     * </pre>
     */
    default void trackPoint(io.mavsdk.camera.CameraProto.TrackPointRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackPointResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackPointMethod(), responseObserver);
    }

    /**
     * <pre>
     * Track rectangle.
     * </pre>
     */
    default void trackRectangle(io.mavsdk.camera.CameraProto.TrackRectangleRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackRectangleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackRectangleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop tracking.
     * </pre>
     */
    default void trackStop(io.mavsdk.camera.CameraProto.TrackStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackStopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start focusing in.
     * </pre>
     */
    default void focusInStart(io.mavsdk.camera.CameraProto.FocusInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusInStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFocusInStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start focusing out.
     * </pre>
     */
    default void focusOutStart(io.mavsdk.camera.CameraProto.FocusOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusOutStartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFocusOutStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop focus.
     * </pre>
     */
    default void focusStop(io.mavsdk.camera.CameraProto.FocusStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusStopResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFocusStopMethod(), responseObserver);
    }

    /**
     * <pre>
     * Focus with range value of full range (value between 0.0 and 100.0).
     * </pre>
     */
    default void focusRange(io.mavsdk.camera.CameraProto.FocusRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusRangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFocusRangeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CameraService.
   * <pre>
   * Can be used to manage cameras that implement the MAVLink
   * Camera Protocol: https://mavlink.io/en/protocol/camera.html.
   * Currently only a single camera is supported.
   * When multiple cameras are supported the plugin will need to be
   * instantiated separately for every camera and the camera selected using
   * `select_camera`.
   * </pre>
   */
  public static abstract class CameraServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CameraServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CameraService.
   * <pre>
   * Can be used to manage cameras that implement the MAVLink
   * Camera Protocol: https://mavlink.io/en/protocol/camera.html.
   * Currently only a single camera is supported.
   * When multiple cameras are supported the plugin will need to be
   * instantiated separately for every camera and the camera selected using
   * `select_camera`.
   * </pre>
   */
  public static final class CameraServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CameraServiceStub> {
    private CameraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Prepare the camera plugin (e.g. download the camera definition, etc).
     * </pre>
     */
    public void prepare(io.mavsdk.camera.CameraProto.PrepareRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.PrepareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Take one photo.
     * </pre>
     */
    public void takePhoto(io.mavsdk.camera.CameraProto.TakePhotoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TakePhotoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTakePhotoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start photo timelapse with a given interval.
     * </pre>
     */
    public void startPhotoInterval(io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartPhotoIntervalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop a running photo timelapse.
     * </pre>
     */
    public void stopPhotoInterval(io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopPhotoIntervalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start a video recording.
     * </pre>
     */
    public void startVideo(io.mavsdk.camera.CameraProto.StartVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop a running video recording.
     * </pre>
     */
    public void stopVideo(io.mavsdk.camera.CameraProto.StopVideoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopVideoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopVideoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start video streaming.
     * </pre>
     */
    public void startVideoStreaming(io.mavsdk.camera.CameraProto.StartVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop current video streaming.
     * </pre>
     */
    public void stopVideoStreaming(io.mavsdk.camera.CameraProto.StopVideoStreamingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopVideoStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopVideoStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set camera mode.
     * </pre>
     */
    public void setMode(io.mavsdk.camera.CameraProto.SetModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SetModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List photos available on the camera.
     * </pre>
     */
    public void listPhotos(io.mavsdk.camera.CameraProto.ListPhotosRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ListPhotosResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPhotosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera mode updates.
     * </pre>
     */
    public void subscribeMode(io.mavsdk.camera.CameraProto.SubscribeModeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ModeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera information updates.
     * </pre>
     */
    public void subscribeInformation(io.mavsdk.camera.CameraProto.SubscribeInformationRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.InformationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to video stream info updates.
     * </pre>
     */
    public void subscribeVideoStreamInfo(io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.VideoStreamInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeVideoStreamInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to capture info updates.
     * </pre>
     */
    public void subscribeCaptureInfo(io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.CaptureInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCaptureInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to camera status updates.
     * </pre>
     */
    public void subscribeStatus(io.mavsdk.camera.CameraProto.SubscribeStatusRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the list of current camera settings.
     * </pre>
     */
    public void subscribeCurrentSettings(io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.CurrentSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeCurrentSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the list of settings that can be changed.
     * </pre>
     */
    public void subscribePossibleSettingOptions(io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribePossibleSettingOptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set a setting to some value.
     * Only setting_id of setting and option_id of option needs to be set.
     * </pre>
     */
    public void setSetting(io.mavsdk.camera.CameraProto.SetSettingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SetSettingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a setting.
     * Only setting_id of setting needs to be set.
     * </pre>
     */
    public void getSetting(io.mavsdk.camera.CameraProto.GetSettingRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.GetSettingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Format storage (e.g. SD card) in camera.
     * This will delete all content of the camera storage!
     * </pre>
     */
    public void formatStorage(io.mavsdk.camera.CameraProto.FormatStorageRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FormatStorageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFormatStorageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Select current camera .
     * Bind the plugin instance to a specific camera_id
     * </pre>
     */
    public void selectCamera(io.mavsdk.camera.CameraProto.SelectCameraRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SelectCameraResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSelectCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reset all settings in camera.
     * This will reset all camera settings to default value
     * </pre>
     */
    public void resetSettings(io.mavsdk.camera.CameraProto.ResetSettingsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ResetSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start zooming in.
     * </pre>
     */
    public void zoomInStart(io.mavsdk.camera.CameraProto.ZoomInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomInStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoomInStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start zooming out.
     * </pre>
     */
    public void zoomOutStart(io.mavsdk.camera.CameraProto.ZoomOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomOutStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoomOutStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop zooming.
     * </pre>
     */
    public void zoomStop(io.mavsdk.camera.CameraProto.ZoomStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomStopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoomStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Zoom to value as proportion of full camera range (percentage between 0.0 and 100.0).
     * </pre>
     */
    public void zoomRange(io.mavsdk.camera.CameraProto.ZoomRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getZoomRangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Track point.
     * </pre>
     */
    public void trackPoint(io.mavsdk.camera.CameraProto.TrackPointRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackPointResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackPointMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Track rectangle.
     * </pre>
     */
    public void trackRectangle(io.mavsdk.camera.CameraProto.TrackRectangleRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackRectangleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackRectangleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop tracking.
     * </pre>
     */
    public void trackStop(io.mavsdk.camera.CameraProto.TrackStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackStopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start focusing in.
     * </pre>
     */
    public void focusInStart(io.mavsdk.camera.CameraProto.FocusInStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusInStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFocusInStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start focusing out.
     * </pre>
     */
    public void focusOutStart(io.mavsdk.camera.CameraProto.FocusOutStartRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusOutStartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFocusOutStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop focus.
     * </pre>
     */
    public void focusStop(io.mavsdk.camera.CameraProto.FocusStopRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusStopResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFocusStopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Focus with range value of full range (value between 0.0 and 100.0).
     * </pre>
     */
    public void focusRange(io.mavsdk.camera.CameraProto.FocusRangeRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusRangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFocusRangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CameraService.
   * <pre>
   * Can be used to manage cameras that implement the MAVLink
   * Camera Protocol: https://mavlink.io/en/protocol/camera.html.
   * Currently only a single camera is supported.
   * When multiple cameras are supported the plugin will need to be
   * instantiated separately for every camera and the camera selected using
   * `select_camera`.
   * </pre>
   */
  public static final class CameraServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CameraServiceBlockingStub> {
    private CameraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Prepare the camera plugin (e.g. download the camera definition, etc).
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.PrepareResponse prepare(io.mavsdk.camera.CameraProto.PrepareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPrepareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Take one photo.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.TakePhotoResponse takePhoto(io.mavsdk.camera.CameraProto.TakePhotoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTakePhotoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start photo timelapse with a given interval.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse startPhotoInterval(io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartPhotoIntervalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a running photo timelapse.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse stopPhotoInterval(io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopPhotoIntervalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start a video recording.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.StartVideoResponse startVideo(io.mavsdk.camera.CameraProto.StartVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a running video recording.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.StopVideoResponse stopVideo(io.mavsdk.camera.CameraProto.StopVideoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopVideoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start video streaming.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.StartVideoStreamingResponse startVideoStreaming(io.mavsdk.camera.CameraProto.StartVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop current video streaming.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.StopVideoStreamingResponse stopVideoStreaming(io.mavsdk.camera.CameraProto.StopVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopVideoStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set camera mode.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.SetModeResponse setMode(io.mavsdk.camera.CameraProto.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List photos available on the camera.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.ListPhotosResponse listPhotos(io.mavsdk.camera.CameraProto.ListPhotosRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPhotosMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to camera mode updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.ModeResponse> subscribeMode(
        io.mavsdk.camera.CameraProto.SubscribeModeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to camera information updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.InformationResponse> subscribeInformation(
        io.mavsdk.camera.CameraProto.SubscribeInformationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to video stream info updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.VideoStreamInfoResponse> subscribeVideoStreamInfo(
        io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeVideoStreamInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to capture info updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.CaptureInfoResponse> subscribeCaptureInfo(
        io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCaptureInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to camera status updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.StatusResponse> subscribeStatus(
        io.mavsdk.camera.CameraProto.SubscribeStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the list of current camera settings.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.CurrentSettingsResponse> subscribeCurrentSettings(
        io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeCurrentSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the list of settings that can be changed.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse> subscribePossibleSettingOptions(
        io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribePossibleSettingOptionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set a setting to some value.
     * Only setting_id of setting and option_id of option needs to be set.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.SetSettingResponse setSetting(io.mavsdk.camera.CameraProto.SetSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a setting.
     * Only setting_id of setting needs to be set.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.GetSettingResponse getSetting(io.mavsdk.camera.CameraProto.GetSettingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSettingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Format storage (e.g. SD card) in camera.
     * This will delete all content of the camera storage!
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.FormatStorageResponse formatStorage(io.mavsdk.camera.CameraProto.FormatStorageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFormatStorageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Select current camera .
     * Bind the plugin instance to a specific camera_id
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.SelectCameraResponse selectCamera(io.mavsdk.camera.CameraProto.SelectCameraRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSelectCameraMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reset all settings in camera.
     * This will reset all camera settings to default value
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.ResetSettingsResponse resetSettings(io.mavsdk.camera.CameraProto.ResetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start zooming in.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.ZoomInStartResponse zoomInStart(io.mavsdk.camera.CameraProto.ZoomInStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoomInStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start zooming out.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.ZoomOutStartResponse zoomOutStart(io.mavsdk.camera.CameraProto.ZoomOutStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoomOutStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop zooming.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.ZoomStopResponse zoomStop(io.mavsdk.camera.CameraProto.ZoomStopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoomStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Zoom to value as proportion of full camera range (percentage between 0.0 and 100.0).
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.ZoomRangeResponse zoomRange(io.mavsdk.camera.CameraProto.ZoomRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getZoomRangeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Track point.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.TrackPointResponse trackPoint(io.mavsdk.camera.CameraProto.TrackPointRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackPointMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Track rectangle.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.TrackRectangleResponse trackRectangle(io.mavsdk.camera.CameraProto.TrackRectangleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackRectangleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop tracking.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.TrackStopResponse trackStop(io.mavsdk.camera.CameraProto.TrackStopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start focusing in.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.FocusInStartResponse focusInStart(io.mavsdk.camera.CameraProto.FocusInStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFocusInStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start focusing out.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.FocusOutStartResponse focusOutStart(io.mavsdk.camera.CameraProto.FocusOutStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFocusOutStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop focus.
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.FocusStopResponse focusStop(io.mavsdk.camera.CameraProto.FocusStopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFocusStopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Focus with range value of full range (value between 0.0 and 100.0).
     * </pre>
     */
    public io.mavsdk.camera.CameraProto.FocusRangeResponse focusRange(io.mavsdk.camera.CameraProto.FocusRangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFocusRangeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CameraService.
   * <pre>
   * Can be used to manage cameras that implement the MAVLink
   * Camera Protocol: https://mavlink.io/en/protocol/camera.html.
   * Currently only a single camera is supported.
   * When multiple cameras are supported the plugin will need to be
   * instantiated separately for every camera and the camera selected using
   * `select_camera`.
   * </pre>
   */
  public static final class CameraServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CameraServiceFutureStub> {
    private CameraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Prepare the camera plugin (e.g. download the camera definition, etc).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.PrepareResponse> prepare(
        io.mavsdk.camera.CameraProto.PrepareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPrepareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Take one photo.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.TakePhotoResponse> takePhoto(
        io.mavsdk.camera.CameraProto.TakePhotoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTakePhotoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start photo timelapse with a given interval.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse> startPhotoInterval(
        io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartPhotoIntervalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop a running photo timelapse.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse> stopPhotoInterval(
        io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopPhotoIntervalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start a video recording.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.StartVideoResponse> startVideo(
        io.mavsdk.camera.CameraProto.StartVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop a running video recording.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.StopVideoResponse> stopVideo(
        io.mavsdk.camera.CameraProto.StopVideoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopVideoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start video streaming.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.StartVideoStreamingResponse> startVideoStreaming(
        io.mavsdk.camera.CameraProto.StartVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartVideoStreamingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop current video streaming.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.StopVideoStreamingResponse> stopVideoStreaming(
        io.mavsdk.camera.CameraProto.StopVideoStreamingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopVideoStreamingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set camera mode.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.SetModeResponse> setMode(
        io.mavsdk.camera.CameraProto.SetModeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List photos available on the camera.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.ListPhotosResponse> listPhotos(
        io.mavsdk.camera.CameraProto.ListPhotosRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPhotosMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set a setting to some value.
     * Only setting_id of setting and option_id of option needs to be set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.SetSettingResponse> setSetting(
        io.mavsdk.camera.CameraProto.SetSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a setting.
     * Only setting_id of setting needs to be set.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.GetSettingResponse> getSetting(
        io.mavsdk.camera.CameraProto.GetSettingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSettingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Format storage (e.g. SD card) in camera.
     * This will delete all content of the camera storage!
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.FormatStorageResponse> formatStorage(
        io.mavsdk.camera.CameraProto.FormatStorageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFormatStorageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Select current camera .
     * Bind the plugin instance to a specific camera_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.SelectCameraResponse> selectCamera(
        io.mavsdk.camera.CameraProto.SelectCameraRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSelectCameraMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reset all settings in camera.
     * This will reset all camera settings to default value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.ResetSettingsResponse> resetSettings(
        io.mavsdk.camera.CameraProto.ResetSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start zooming in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.ZoomInStartResponse> zoomInStart(
        io.mavsdk.camera.CameraProto.ZoomInStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoomInStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start zooming out.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.ZoomOutStartResponse> zoomOutStart(
        io.mavsdk.camera.CameraProto.ZoomOutStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoomOutStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop zooming.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.ZoomStopResponse> zoomStop(
        io.mavsdk.camera.CameraProto.ZoomStopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoomStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Zoom to value as proportion of full camera range (percentage between 0.0 and 100.0).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.ZoomRangeResponse> zoomRange(
        io.mavsdk.camera.CameraProto.ZoomRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getZoomRangeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Track point.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.TrackPointResponse> trackPoint(
        io.mavsdk.camera.CameraProto.TrackPointRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackPointMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Track rectangle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.TrackRectangleResponse> trackRectangle(
        io.mavsdk.camera.CameraProto.TrackRectangleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackRectangleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop tracking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.TrackStopResponse> trackStop(
        io.mavsdk.camera.CameraProto.TrackStopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start focusing in.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.FocusInStartResponse> focusInStart(
        io.mavsdk.camera.CameraProto.FocusInStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFocusInStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start focusing out.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.FocusOutStartResponse> focusOutStart(
        io.mavsdk.camera.CameraProto.FocusOutStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFocusOutStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop focus.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.FocusStopResponse> focusStop(
        io.mavsdk.camera.CameraProto.FocusStopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFocusStopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Focus with range value of full range (value between 0.0 and 100.0).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.camera.CameraProto.FocusRangeResponse> focusRange(
        io.mavsdk.camera.CameraProto.FocusRangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFocusRangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PREPARE = 0;
  private static final int METHODID_TAKE_PHOTO = 1;
  private static final int METHODID_START_PHOTO_INTERVAL = 2;
  private static final int METHODID_STOP_PHOTO_INTERVAL = 3;
  private static final int METHODID_START_VIDEO = 4;
  private static final int METHODID_STOP_VIDEO = 5;
  private static final int METHODID_START_VIDEO_STREAMING = 6;
  private static final int METHODID_STOP_VIDEO_STREAMING = 7;
  private static final int METHODID_SET_MODE = 8;
  private static final int METHODID_LIST_PHOTOS = 9;
  private static final int METHODID_SUBSCRIBE_MODE = 10;
  private static final int METHODID_SUBSCRIBE_INFORMATION = 11;
  private static final int METHODID_SUBSCRIBE_VIDEO_STREAM_INFO = 12;
  private static final int METHODID_SUBSCRIBE_CAPTURE_INFO = 13;
  private static final int METHODID_SUBSCRIBE_STATUS = 14;
  private static final int METHODID_SUBSCRIBE_CURRENT_SETTINGS = 15;
  private static final int METHODID_SUBSCRIBE_POSSIBLE_SETTING_OPTIONS = 16;
  private static final int METHODID_SET_SETTING = 17;
  private static final int METHODID_GET_SETTING = 18;
  private static final int METHODID_FORMAT_STORAGE = 19;
  private static final int METHODID_SELECT_CAMERA = 20;
  private static final int METHODID_RESET_SETTINGS = 21;
  private static final int METHODID_ZOOM_IN_START = 22;
  private static final int METHODID_ZOOM_OUT_START = 23;
  private static final int METHODID_ZOOM_STOP = 24;
  private static final int METHODID_ZOOM_RANGE = 25;
  private static final int METHODID_TRACK_POINT = 26;
  private static final int METHODID_TRACK_RECTANGLE = 27;
  private static final int METHODID_TRACK_STOP = 28;
  private static final int METHODID_FOCUS_IN_START = 29;
  private static final int METHODID_FOCUS_OUT_START = 30;
  private static final int METHODID_FOCUS_STOP = 31;
  private static final int METHODID_FOCUS_RANGE = 32;

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
        case METHODID_PREPARE:
          serviceImpl.prepare((io.mavsdk.camera.CameraProto.PrepareRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.PrepareResponse>) responseObserver);
          break;
        case METHODID_TAKE_PHOTO:
          serviceImpl.takePhoto((io.mavsdk.camera.CameraProto.TakePhotoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TakePhotoResponse>) responseObserver);
          break;
        case METHODID_START_PHOTO_INTERVAL:
          serviceImpl.startPhotoInterval((io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse>) responseObserver);
          break;
        case METHODID_STOP_PHOTO_INTERVAL:
          serviceImpl.stopPhotoInterval((io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse>) responseObserver);
          break;
        case METHODID_START_VIDEO:
          serviceImpl.startVideo((io.mavsdk.camera.CameraProto.StartVideoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartVideoResponse>) responseObserver);
          break;
        case METHODID_STOP_VIDEO:
          serviceImpl.stopVideo((io.mavsdk.camera.CameraProto.StopVideoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopVideoResponse>) responseObserver);
          break;
        case METHODID_START_VIDEO_STREAMING:
          serviceImpl.startVideoStreaming((io.mavsdk.camera.CameraProto.StartVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StartVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_STOP_VIDEO_STREAMING:
          serviceImpl.stopVideoStreaming((io.mavsdk.camera.CameraProto.StopVideoStreamingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StopVideoStreamingResponse>) responseObserver);
          break;
        case METHODID_SET_MODE:
          serviceImpl.setMode((io.mavsdk.camera.CameraProto.SetModeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SetModeResponse>) responseObserver);
          break;
        case METHODID_LIST_PHOTOS:
          serviceImpl.listPhotos((io.mavsdk.camera.CameraProto.ListPhotosRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ListPhotosResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_MODE:
          serviceImpl.subscribeMode((io.mavsdk.camera.CameraProto.SubscribeModeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ModeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_INFORMATION:
          serviceImpl.subscribeInformation((io.mavsdk.camera.CameraProto.SubscribeInformationRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.InformationResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_VIDEO_STREAM_INFO:
          serviceImpl.subscribeVideoStreamInfo((io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.VideoStreamInfoResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CAPTURE_INFO:
          serviceImpl.subscribeCaptureInfo((io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.CaptureInfoResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_STATUS:
          serviceImpl.subscribeStatus((io.mavsdk.camera.CameraProto.SubscribeStatusRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.StatusResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_CURRENT_SETTINGS:
          serviceImpl.subscribeCurrentSettings((io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.CurrentSettingsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_POSSIBLE_SETTING_OPTIONS:
          serviceImpl.subscribePossibleSettingOptions((io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse>) responseObserver);
          break;
        case METHODID_SET_SETTING:
          serviceImpl.setSetting((io.mavsdk.camera.CameraProto.SetSettingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SetSettingResponse>) responseObserver);
          break;
        case METHODID_GET_SETTING:
          serviceImpl.getSetting((io.mavsdk.camera.CameraProto.GetSettingRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.GetSettingResponse>) responseObserver);
          break;
        case METHODID_FORMAT_STORAGE:
          serviceImpl.formatStorage((io.mavsdk.camera.CameraProto.FormatStorageRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FormatStorageResponse>) responseObserver);
          break;
        case METHODID_SELECT_CAMERA:
          serviceImpl.selectCamera((io.mavsdk.camera.CameraProto.SelectCameraRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.SelectCameraResponse>) responseObserver);
          break;
        case METHODID_RESET_SETTINGS:
          serviceImpl.resetSettings((io.mavsdk.camera.CameraProto.ResetSettingsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ResetSettingsResponse>) responseObserver);
          break;
        case METHODID_ZOOM_IN_START:
          serviceImpl.zoomInStart((io.mavsdk.camera.CameraProto.ZoomInStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomInStartResponse>) responseObserver);
          break;
        case METHODID_ZOOM_OUT_START:
          serviceImpl.zoomOutStart((io.mavsdk.camera.CameraProto.ZoomOutStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomOutStartResponse>) responseObserver);
          break;
        case METHODID_ZOOM_STOP:
          serviceImpl.zoomStop((io.mavsdk.camera.CameraProto.ZoomStopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomStopResponse>) responseObserver);
          break;
        case METHODID_ZOOM_RANGE:
          serviceImpl.zoomRange((io.mavsdk.camera.CameraProto.ZoomRangeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.ZoomRangeResponse>) responseObserver);
          break;
        case METHODID_TRACK_POINT:
          serviceImpl.trackPoint((io.mavsdk.camera.CameraProto.TrackPointRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackPointResponse>) responseObserver);
          break;
        case METHODID_TRACK_RECTANGLE:
          serviceImpl.trackRectangle((io.mavsdk.camera.CameraProto.TrackRectangleRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackRectangleResponse>) responseObserver);
          break;
        case METHODID_TRACK_STOP:
          serviceImpl.trackStop((io.mavsdk.camera.CameraProto.TrackStopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.TrackStopResponse>) responseObserver);
          break;
        case METHODID_FOCUS_IN_START:
          serviceImpl.focusInStart((io.mavsdk.camera.CameraProto.FocusInStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusInStartResponse>) responseObserver);
          break;
        case METHODID_FOCUS_OUT_START:
          serviceImpl.focusOutStart((io.mavsdk.camera.CameraProto.FocusOutStartRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusOutStartResponse>) responseObserver);
          break;
        case METHODID_FOCUS_STOP:
          serviceImpl.focusStop((io.mavsdk.camera.CameraProto.FocusStopRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusStopResponse>) responseObserver);
          break;
        case METHODID_FOCUS_RANGE:
          serviceImpl.focusRange((io.mavsdk.camera.CameraProto.FocusRangeRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.camera.CameraProto.FocusRangeResponse>) responseObserver);
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
          getPrepareMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.PrepareRequest,
              io.mavsdk.camera.CameraProto.PrepareResponse>(
                service, METHODID_PREPARE)))
        .addMethod(
          getTakePhotoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.TakePhotoRequest,
              io.mavsdk.camera.CameraProto.TakePhotoResponse>(
                service, METHODID_TAKE_PHOTO)))
        .addMethod(
          getStartPhotoIntervalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.StartPhotoIntervalRequest,
              io.mavsdk.camera.CameraProto.StartPhotoIntervalResponse>(
                service, METHODID_START_PHOTO_INTERVAL)))
        .addMethod(
          getStopPhotoIntervalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.StopPhotoIntervalRequest,
              io.mavsdk.camera.CameraProto.StopPhotoIntervalResponse>(
                service, METHODID_STOP_PHOTO_INTERVAL)))
        .addMethod(
          getStartVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.StartVideoRequest,
              io.mavsdk.camera.CameraProto.StartVideoResponse>(
                service, METHODID_START_VIDEO)))
        .addMethod(
          getStopVideoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.StopVideoRequest,
              io.mavsdk.camera.CameraProto.StopVideoResponse>(
                service, METHODID_STOP_VIDEO)))
        .addMethod(
          getStartVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.StartVideoStreamingRequest,
              io.mavsdk.camera.CameraProto.StartVideoStreamingResponse>(
                service, METHODID_START_VIDEO_STREAMING)))
        .addMethod(
          getStopVideoStreamingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.StopVideoStreamingRequest,
              io.mavsdk.camera.CameraProto.StopVideoStreamingResponse>(
                service, METHODID_STOP_VIDEO_STREAMING)))
        .addMethod(
          getSetModeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SetModeRequest,
              io.mavsdk.camera.CameraProto.SetModeResponse>(
                service, METHODID_SET_MODE)))
        .addMethod(
          getListPhotosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.ListPhotosRequest,
              io.mavsdk.camera.CameraProto.ListPhotosResponse>(
                service, METHODID_LIST_PHOTOS)))
        .addMethod(
          getSubscribeModeMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribeModeRequest,
              io.mavsdk.camera.CameraProto.ModeResponse>(
                service, METHODID_SUBSCRIBE_MODE)))
        .addMethod(
          getSubscribeInformationMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribeInformationRequest,
              io.mavsdk.camera.CameraProto.InformationResponse>(
                service, METHODID_SUBSCRIBE_INFORMATION)))
        .addMethod(
          getSubscribeVideoStreamInfoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribeVideoStreamInfoRequest,
              io.mavsdk.camera.CameraProto.VideoStreamInfoResponse>(
                service, METHODID_SUBSCRIBE_VIDEO_STREAM_INFO)))
        .addMethod(
          getSubscribeCaptureInfoMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribeCaptureInfoRequest,
              io.mavsdk.camera.CameraProto.CaptureInfoResponse>(
                service, METHODID_SUBSCRIBE_CAPTURE_INFO)))
        .addMethod(
          getSubscribeStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribeStatusRequest,
              io.mavsdk.camera.CameraProto.StatusResponse>(
                service, METHODID_SUBSCRIBE_STATUS)))
        .addMethod(
          getSubscribeCurrentSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribeCurrentSettingsRequest,
              io.mavsdk.camera.CameraProto.CurrentSettingsResponse>(
                service, METHODID_SUBSCRIBE_CURRENT_SETTINGS)))
        .addMethod(
          getSubscribePossibleSettingOptionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SubscribePossibleSettingOptionsRequest,
              io.mavsdk.camera.CameraProto.PossibleSettingOptionsResponse>(
                service, METHODID_SUBSCRIBE_POSSIBLE_SETTING_OPTIONS)))
        .addMethod(
          getSetSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SetSettingRequest,
              io.mavsdk.camera.CameraProto.SetSettingResponse>(
                service, METHODID_SET_SETTING)))
        .addMethod(
          getGetSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.GetSettingRequest,
              io.mavsdk.camera.CameraProto.GetSettingResponse>(
                service, METHODID_GET_SETTING)))
        .addMethod(
          getFormatStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.FormatStorageRequest,
              io.mavsdk.camera.CameraProto.FormatStorageResponse>(
                service, METHODID_FORMAT_STORAGE)))
        .addMethod(
          getSelectCameraMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.SelectCameraRequest,
              io.mavsdk.camera.CameraProto.SelectCameraResponse>(
                service, METHODID_SELECT_CAMERA)))
        .addMethod(
          getResetSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.ResetSettingsRequest,
              io.mavsdk.camera.CameraProto.ResetSettingsResponse>(
                service, METHODID_RESET_SETTINGS)))
        .addMethod(
          getZoomInStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.ZoomInStartRequest,
              io.mavsdk.camera.CameraProto.ZoomInStartResponse>(
                service, METHODID_ZOOM_IN_START)))
        .addMethod(
          getZoomOutStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.ZoomOutStartRequest,
              io.mavsdk.camera.CameraProto.ZoomOutStartResponse>(
                service, METHODID_ZOOM_OUT_START)))
        .addMethod(
          getZoomStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.ZoomStopRequest,
              io.mavsdk.camera.CameraProto.ZoomStopResponse>(
                service, METHODID_ZOOM_STOP)))
        .addMethod(
          getZoomRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.ZoomRangeRequest,
              io.mavsdk.camera.CameraProto.ZoomRangeResponse>(
                service, METHODID_ZOOM_RANGE)))
        .addMethod(
          getTrackPointMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.TrackPointRequest,
              io.mavsdk.camera.CameraProto.TrackPointResponse>(
                service, METHODID_TRACK_POINT)))
        .addMethod(
          getTrackRectangleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.TrackRectangleRequest,
              io.mavsdk.camera.CameraProto.TrackRectangleResponse>(
                service, METHODID_TRACK_RECTANGLE)))
        .addMethod(
          getTrackStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.TrackStopRequest,
              io.mavsdk.camera.CameraProto.TrackStopResponse>(
                service, METHODID_TRACK_STOP)))
        .addMethod(
          getFocusInStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.FocusInStartRequest,
              io.mavsdk.camera.CameraProto.FocusInStartResponse>(
                service, METHODID_FOCUS_IN_START)))
        .addMethod(
          getFocusOutStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.FocusOutStartRequest,
              io.mavsdk.camera.CameraProto.FocusOutStartResponse>(
                service, METHODID_FOCUS_OUT_START)))
        .addMethod(
          getFocusStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.FocusStopRequest,
              io.mavsdk.camera.CameraProto.FocusStopResponse>(
                service, METHODID_FOCUS_STOP)))
        .addMethod(
          getFocusRangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.camera.CameraProto.FocusRangeRequest,
              io.mavsdk.camera.CameraProto.FocusRangeResponse>(
                service, METHODID_FOCUS_RANGE)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CameraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getPrepareMethod())
              .addMethod(getTakePhotoMethod())
              .addMethod(getStartPhotoIntervalMethod())
              .addMethod(getStopPhotoIntervalMethod())
              .addMethod(getStartVideoMethod())
              .addMethod(getStopVideoMethod())
              .addMethod(getStartVideoStreamingMethod())
              .addMethod(getStopVideoStreamingMethod())
              .addMethod(getSetModeMethod())
              .addMethod(getListPhotosMethod())
              .addMethod(getSubscribeModeMethod())
              .addMethod(getSubscribeInformationMethod())
              .addMethod(getSubscribeVideoStreamInfoMethod())
              .addMethod(getSubscribeCaptureInfoMethod())
              .addMethod(getSubscribeStatusMethod())
              .addMethod(getSubscribeCurrentSettingsMethod())
              .addMethod(getSubscribePossibleSettingOptionsMethod())
              .addMethod(getSetSettingMethod())
              .addMethod(getGetSettingMethod())
              .addMethod(getFormatStorageMethod())
              .addMethod(getSelectCameraMethod())
              .addMethod(getResetSettingsMethod())
              .addMethod(getZoomInStartMethod())
              .addMethod(getZoomOutStartMethod())
              .addMethod(getZoomStopMethod())
              .addMethod(getZoomRangeMethod())
              .addMethod(getTrackPointMethod())
              .addMethod(getTrackRectangleMethod())
              .addMethod(getTrackStopMethod())
              .addMethod(getFocusInStartMethod())
              .addMethod(getFocusOutStartMethod())
              .addMethod(getFocusStopMethod())
              .addMethod(getFocusRangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
