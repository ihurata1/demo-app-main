package io.mavsdk.mission;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable waypoint missions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/mission/mission.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MissionServiceGrpc {

  private MissionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.mission.MissionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.UploadMissionRequest,
      io.mavsdk.mission.MissionProto.UploadMissionResponse> getUploadMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadMission",
      requestType = io.mavsdk.mission.MissionProto.UploadMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.UploadMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.UploadMissionRequest,
      io.mavsdk.mission.MissionProto.UploadMissionResponse> getUploadMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.UploadMissionRequest, io.mavsdk.mission.MissionProto.UploadMissionResponse> getUploadMissionMethod;
    if ((getUploadMissionMethod = MissionServiceGrpc.getUploadMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getUploadMissionMethod = MissionServiceGrpc.getUploadMissionMethod) == null) {
          MissionServiceGrpc.getUploadMissionMethod = getUploadMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.UploadMissionRequest, io.mavsdk.mission.MissionProto.UploadMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.UploadMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.UploadMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest,
      io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse> getSubscribeUploadMissionWithProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeUploadMissionWithProgress",
      requestType = io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest.class,
      responseType = io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest,
      io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse> getSubscribeUploadMissionWithProgressMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest, io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse> getSubscribeUploadMissionWithProgressMethod;
    if ((getSubscribeUploadMissionWithProgressMethod = MissionServiceGrpc.getSubscribeUploadMissionWithProgressMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getSubscribeUploadMissionWithProgressMethod = MissionServiceGrpc.getSubscribeUploadMissionWithProgressMethod) == null) {
          MissionServiceGrpc.getSubscribeUploadMissionWithProgressMethod = getSubscribeUploadMissionWithProgressMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest, io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeUploadMissionWithProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeUploadMissionWithProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.CancelMissionUploadRequest,
      io.mavsdk.mission.MissionProto.CancelMissionUploadResponse> getCancelMissionUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMissionUpload",
      requestType = io.mavsdk.mission.MissionProto.CancelMissionUploadRequest.class,
      responseType = io.mavsdk.mission.MissionProto.CancelMissionUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.CancelMissionUploadRequest,
      io.mavsdk.mission.MissionProto.CancelMissionUploadResponse> getCancelMissionUploadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.CancelMissionUploadRequest, io.mavsdk.mission.MissionProto.CancelMissionUploadResponse> getCancelMissionUploadMethod;
    if ((getCancelMissionUploadMethod = MissionServiceGrpc.getCancelMissionUploadMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getCancelMissionUploadMethod = MissionServiceGrpc.getCancelMissionUploadMethod) == null) {
          MissionServiceGrpc.getCancelMissionUploadMethod = getCancelMissionUploadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.CancelMissionUploadRequest, io.mavsdk.mission.MissionProto.CancelMissionUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelMissionUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.CancelMissionUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.CancelMissionUploadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelMissionUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.DownloadMissionRequest,
      io.mavsdk.mission.MissionProto.DownloadMissionResponse> getDownloadMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadMission",
      requestType = io.mavsdk.mission.MissionProto.DownloadMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.DownloadMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.DownloadMissionRequest,
      io.mavsdk.mission.MissionProto.DownloadMissionResponse> getDownloadMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.DownloadMissionRequest, io.mavsdk.mission.MissionProto.DownloadMissionResponse> getDownloadMissionMethod;
    if ((getDownloadMissionMethod = MissionServiceGrpc.getDownloadMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getDownloadMissionMethod = MissionServiceGrpc.getDownloadMissionMethod) == null) {
          MissionServiceGrpc.getDownloadMissionMethod = getDownloadMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.DownloadMissionRequest, io.mavsdk.mission.MissionProto.DownloadMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.DownloadMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.DownloadMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDownloadMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest,
      io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse> getSubscribeDownloadMissionWithProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeDownloadMissionWithProgress",
      requestType = io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest.class,
      responseType = io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest,
      io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse> getSubscribeDownloadMissionWithProgressMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest, io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse> getSubscribeDownloadMissionWithProgressMethod;
    if ((getSubscribeDownloadMissionWithProgressMethod = MissionServiceGrpc.getSubscribeDownloadMissionWithProgressMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getSubscribeDownloadMissionWithProgressMethod = MissionServiceGrpc.getSubscribeDownloadMissionWithProgressMethod) == null) {
          MissionServiceGrpc.getSubscribeDownloadMissionWithProgressMethod = getSubscribeDownloadMissionWithProgressMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest, io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeDownloadMissionWithProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeDownloadMissionWithProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest,
      io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse> getCancelMissionDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMissionDownload",
      requestType = io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest.class,
      responseType = io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest,
      io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse> getCancelMissionDownloadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest, io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse> getCancelMissionDownloadMethod;
    if ((getCancelMissionDownloadMethod = MissionServiceGrpc.getCancelMissionDownloadMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getCancelMissionDownloadMethod = MissionServiceGrpc.getCancelMissionDownloadMethod) == null) {
          MissionServiceGrpc.getCancelMissionDownloadMethod = getCancelMissionDownloadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest, io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelMissionDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelMissionDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.StartMissionRequest,
      io.mavsdk.mission.MissionProto.StartMissionResponse> getStartMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartMission",
      requestType = io.mavsdk.mission.MissionProto.StartMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.StartMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.StartMissionRequest,
      io.mavsdk.mission.MissionProto.StartMissionResponse> getStartMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.StartMissionRequest, io.mavsdk.mission.MissionProto.StartMissionResponse> getStartMissionMethod;
    if ((getStartMissionMethod = MissionServiceGrpc.getStartMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getStartMissionMethod = MissionServiceGrpc.getStartMissionMethod) == null) {
          MissionServiceGrpc.getStartMissionMethod = getStartMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.StartMissionRequest, io.mavsdk.mission.MissionProto.StartMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.StartMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.StartMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.PauseMissionRequest,
      io.mavsdk.mission.MissionProto.PauseMissionResponse> getPauseMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseMission",
      requestType = io.mavsdk.mission.MissionProto.PauseMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.PauseMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.PauseMissionRequest,
      io.mavsdk.mission.MissionProto.PauseMissionResponse> getPauseMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.PauseMissionRequest, io.mavsdk.mission.MissionProto.PauseMissionResponse> getPauseMissionMethod;
    if ((getPauseMissionMethod = MissionServiceGrpc.getPauseMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getPauseMissionMethod = MissionServiceGrpc.getPauseMissionMethod) == null) {
          MissionServiceGrpc.getPauseMissionMethod = getPauseMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.PauseMissionRequest, io.mavsdk.mission.MissionProto.PauseMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.PauseMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.PauseMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPauseMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.ClearMissionRequest,
      io.mavsdk.mission.MissionProto.ClearMissionResponse> getClearMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearMission",
      requestType = io.mavsdk.mission.MissionProto.ClearMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.ClearMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.ClearMissionRequest,
      io.mavsdk.mission.MissionProto.ClearMissionResponse> getClearMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.ClearMissionRequest, io.mavsdk.mission.MissionProto.ClearMissionResponse> getClearMissionMethod;
    if ((getClearMissionMethod = MissionServiceGrpc.getClearMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getClearMissionMethod = MissionServiceGrpc.getClearMissionMethod) == null) {
          MissionServiceGrpc.getClearMissionMethod = getClearMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.ClearMissionRequest, io.mavsdk.mission.MissionProto.ClearMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.ClearMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.ClearMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getClearMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest,
      io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse> getSetCurrentMissionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCurrentMissionItem",
      requestType = io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest.class,
      responseType = io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest,
      io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse> getSetCurrentMissionItemMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest, io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse> getSetCurrentMissionItemMethod;
    if ((getSetCurrentMissionItemMethod = MissionServiceGrpc.getSetCurrentMissionItemMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getSetCurrentMissionItemMethod = MissionServiceGrpc.getSetCurrentMissionItemMethod) == null) {
          MissionServiceGrpc.getSetCurrentMissionItemMethod = getSetCurrentMissionItemMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest, io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCurrentMissionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetCurrentMissionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.IsMissionFinishedRequest,
      io.mavsdk.mission.MissionProto.IsMissionFinishedResponse> getIsMissionFinishedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsMissionFinished",
      requestType = io.mavsdk.mission.MissionProto.IsMissionFinishedRequest.class,
      responseType = io.mavsdk.mission.MissionProto.IsMissionFinishedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.IsMissionFinishedRequest,
      io.mavsdk.mission.MissionProto.IsMissionFinishedResponse> getIsMissionFinishedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.IsMissionFinishedRequest, io.mavsdk.mission.MissionProto.IsMissionFinishedResponse> getIsMissionFinishedMethod;
    if ((getIsMissionFinishedMethod = MissionServiceGrpc.getIsMissionFinishedMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getIsMissionFinishedMethod = MissionServiceGrpc.getIsMissionFinishedMethod) == null) {
          MissionServiceGrpc.getIsMissionFinishedMethod = getIsMissionFinishedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.IsMissionFinishedRequest, io.mavsdk.mission.MissionProto.IsMissionFinishedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsMissionFinished"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.IsMissionFinishedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.IsMissionFinishedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getIsMissionFinishedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest,
      io.mavsdk.mission.MissionProto.MissionProgressResponse> getSubscribeMissionProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeMissionProgress",
      requestType = io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest.class,
      responseType = io.mavsdk.mission.MissionProto.MissionProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest,
      io.mavsdk.mission.MissionProto.MissionProgressResponse> getSubscribeMissionProgressMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest, io.mavsdk.mission.MissionProto.MissionProgressResponse> getSubscribeMissionProgressMethod;
    if ((getSubscribeMissionProgressMethod = MissionServiceGrpc.getSubscribeMissionProgressMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getSubscribeMissionProgressMethod = MissionServiceGrpc.getSubscribeMissionProgressMethod) == null) {
          MissionServiceGrpc.getSubscribeMissionProgressMethod = getSubscribeMissionProgressMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest, io.mavsdk.mission.MissionProto.MissionProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeMissionProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.MissionProgressResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeMissionProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest,
      io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse> getGetReturnToLaunchAfterMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReturnToLaunchAfterMission",
      requestType = io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest,
      io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse> getGetReturnToLaunchAfterMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest, io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse> getGetReturnToLaunchAfterMissionMethod;
    if ((getGetReturnToLaunchAfterMissionMethod = MissionServiceGrpc.getGetReturnToLaunchAfterMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getGetReturnToLaunchAfterMissionMethod = MissionServiceGrpc.getGetReturnToLaunchAfterMissionMethod) == null) {
          MissionServiceGrpc.getGetReturnToLaunchAfterMissionMethod = getGetReturnToLaunchAfterMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest, io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReturnToLaunchAfterMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetReturnToLaunchAfterMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest,
      io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse> getSetReturnToLaunchAfterMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetReturnToLaunchAfterMission",
      requestType = io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest.class,
      responseType = io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest,
      io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse> getSetReturnToLaunchAfterMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest, io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse> getSetReturnToLaunchAfterMissionMethod;
    if ((getSetReturnToLaunchAfterMissionMethod = MissionServiceGrpc.getSetReturnToLaunchAfterMissionMethod) == null) {
      synchronized (MissionServiceGrpc.class) {
        if ((getSetReturnToLaunchAfterMissionMethod = MissionServiceGrpc.getSetReturnToLaunchAfterMissionMethod) == null) {
          MissionServiceGrpc.getSetReturnToLaunchAfterMissionMethod = getSetReturnToLaunchAfterMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest, io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetReturnToLaunchAfterMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetReturnToLaunchAfterMissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MissionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionServiceStub>() {
        @java.lang.Override
        public MissionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionServiceStub(channel, callOptions);
        }
      };
    return MissionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MissionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionServiceBlockingStub>() {
        @java.lang.Override
        public MissionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionServiceBlockingStub(channel, callOptions);
        }
      };
    return MissionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MissionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionServiceFutureStub>() {
        @java.lang.Override
        public MissionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionServiceFutureStub(channel, callOptions);
        }
      };
    return MissionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable waypoint missions.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Upload a list of mission items to the system.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    default void uploadMission(io.mavsdk.mission.MissionProto.UploadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.UploadMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload a list of mission items to the system and report upload progress.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    default void subscribeUploadMissionWithProgress(io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeUploadMissionWithProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    default void cancelMissionUpload(io.mavsdk.mission.MissionProto.CancelMissionUploadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.CancelMissionUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMissionUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous).
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    default void downloadMission(io.mavsdk.mission.MissionProto.DownloadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.DownloadMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous) and report progress.
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    default void subscribeDownloadMissionWithProgress(io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeDownloadMissionWithProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    default void cancelMissionDownload(io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMissionDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    default void startMission(io.mavsdk.mission.MissionProto.StartMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.StartMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pause the mission.
     * Pausing the mission puts the vehicle into
     * [HOLD mode](https://docs.px4.io/en/flight_modes/hold.html).
     * A multicopter should just hover at the spot while a fixedwing vehicle should loiter
     * around the location where it paused.
     * </pre>
     */
    default void pauseMission(io.mavsdk.mission.MissionProto.PauseMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.PauseMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    default void clearMission(io.mavsdk.mission.MissionProto.ClearMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.ClearMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a mission item, the mission will be set to this item.
     * Note that this is not necessarily true for general missions using MAVLink if loop counters
     * are used.
     * </pre>
     */
    default void setCurrentMissionItem(io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCurrentMissionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if the mission has been finished.
     * </pre>
     */
    default void isMissionFinished(io.mavsdk.mission.MissionProto.IsMissionFinishedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.IsMissionFinishedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsMissionFinishedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to mission progress updates.
     * </pre>
     */
    default void subscribeMissionProgress(io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.MissionProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMissionProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get whether to trigger Return-to-Launch (RTL) after mission is complete.
     * Before getting this option, it needs to be set, or a mission
     * needs to be downloaded.
     * </pre>
     */
    default void getReturnToLaunchAfterMission(io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReturnToLaunchAfterMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set whether to trigger Return-to-Launch (RTL) after the mission is complete.
     * This will only take effect for the next mission upload, meaning that
     * the mission may have to be uploaded again.
     * </pre>
     */
    default void setReturnToLaunchAfterMission(io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetReturnToLaunchAfterMissionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MissionService.
   * <pre>
   * Enable waypoint missions.
   * </pre>
   */
  public static abstract class MissionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MissionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MissionService.
   * <pre>
   * Enable waypoint missions.
   * </pre>
   */
  public static final class MissionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MissionServiceStub> {
    private MissionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload a list of mission items to the system.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    public void uploadMission(io.mavsdk.mission.MissionProto.UploadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.UploadMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload a list of mission items to the system and report upload progress.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    public void subscribeUploadMissionWithProgress(io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeUploadMissionWithProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    public void cancelMissionUpload(io.mavsdk.mission.MissionProto.CancelMissionUploadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.CancelMissionUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMissionUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous).
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    public void downloadMission(io.mavsdk.mission.MissionProto.DownloadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.DownloadMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous) and report progress.
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    public void subscribeDownloadMissionWithProgress(io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeDownloadMissionWithProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    public void cancelMissionDownload(io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMissionDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    public void startMission(io.mavsdk.mission.MissionProto.StartMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.StartMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pause the mission.
     * Pausing the mission puts the vehicle into
     * [HOLD mode](https://docs.px4.io/en/flight_modes/hold.html).
     * A multicopter should just hover at the spot while a fixedwing vehicle should loiter
     * around the location where it paused.
     * </pre>
     */
    public void pauseMission(io.mavsdk.mission.MissionProto.PauseMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.PauseMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    public void clearMission(io.mavsdk.mission.MissionProto.ClearMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.ClearMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a mission item, the mission will be set to this item.
     * Note that this is not necessarily true for general missions using MAVLink if loop counters
     * are used.
     * </pre>
     */
    public void setCurrentMissionItem(io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCurrentMissionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if the mission has been finished.
     * </pre>
     */
    public void isMissionFinished(io.mavsdk.mission.MissionProto.IsMissionFinishedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.IsMissionFinishedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsMissionFinishedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to mission progress updates.
     * </pre>
     */
    public void subscribeMissionProgress(io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.MissionProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMissionProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get whether to trigger Return-to-Launch (RTL) after mission is complete.
     * Before getting this option, it needs to be set, or a mission
     * needs to be downloaded.
     * </pre>
     */
    public void getReturnToLaunchAfterMission(io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReturnToLaunchAfterMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set whether to trigger Return-to-Launch (RTL) after the mission is complete.
     * This will only take effect for the next mission upload, meaning that
     * the mission may have to be uploaded again.
     * </pre>
     */
    public void setReturnToLaunchAfterMission(io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetReturnToLaunchAfterMissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MissionService.
   * <pre>
   * Enable waypoint missions.
   * </pre>
   */
  public static final class MissionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MissionServiceBlockingStub> {
    private MissionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload a list of mission items to the system.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.UploadMissionResponse uploadMission(io.mavsdk.mission.MissionProto.UploadMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload a list of mission items to the system and report upload progress.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse> subscribeUploadMissionWithProgress(
        io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeUploadMissionWithProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.CancelMissionUploadResponse cancelMissionUpload(io.mavsdk.mission.MissionProto.CancelMissionUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMissionUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous).
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.DownloadMissionResponse downloadMission(io.mavsdk.mission.MissionProto.DownloadMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous) and report progress.
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse> subscribeDownloadMissionWithProgress(
        io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeDownloadMissionWithProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse cancelMissionDownload(io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMissionDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.StartMissionResponse startMission(io.mavsdk.mission.MissionProto.StartMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pause the mission.
     * Pausing the mission puts the vehicle into
     * [HOLD mode](https://docs.px4.io/en/flight_modes/hold.html).
     * A multicopter should just hover at the spot while a fixedwing vehicle should loiter
     * around the location where it paused.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.PauseMissionResponse pauseMission(io.mavsdk.mission.MissionProto.PauseMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.ClearMissionResponse clearMission(io.mavsdk.mission.MissionProto.ClearMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a mission item, the mission will be set to this item.
     * Note that this is not necessarily true for general missions using MAVLink if loop counters
     * are used.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse setCurrentMissionItem(io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCurrentMissionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if the mission has been finished.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.IsMissionFinishedResponse isMissionFinished(io.mavsdk.mission.MissionProto.IsMissionFinishedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsMissionFinishedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to mission progress updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission.MissionProto.MissionProgressResponse> subscribeMissionProgress(
        io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMissionProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get whether to trigger Return-to-Launch (RTL) after mission is complete.
     * Before getting this option, it needs to be set, or a mission
     * needs to be downloaded.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse getReturnToLaunchAfterMission(io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReturnToLaunchAfterMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set whether to trigger Return-to-Launch (RTL) after the mission is complete.
     * This will only take effect for the next mission upload, meaning that
     * the mission may have to be uploaded again.
     * </pre>
     */
    public io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse setReturnToLaunchAfterMission(io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetReturnToLaunchAfterMissionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MissionService.
   * <pre>
   * Enable waypoint missions.
   * </pre>
   */
  public static final class MissionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MissionServiceFutureStub> {
    private MissionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload a list of mission items to the system.
     * The mission items are uploaded to a drone. Once uploaded the mission can be started and
     * executed even if the connection is lost.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.UploadMissionResponse> uploadMission(
        io.mavsdk.mission.MissionProto.UploadMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.CancelMissionUploadResponse> cancelMissionUpload(
        io.mavsdk.mission.MissionProto.CancelMissionUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMissionUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download a list of mission items from the system (asynchronous).
     * Will fail if any of the downloaded mission items are not supported
     * by the MAVSDK API.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.DownloadMissionResponse> downloadMission(
        io.mavsdk.mission.MissionProto.DownloadMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse> cancelMissionDownload(
        io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMissionDownloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.StartMissionResponse> startMission(
        io.mavsdk.mission.MissionProto.StartMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pause the mission.
     * Pausing the mission puts the vehicle into
     * [HOLD mode](https://docs.px4.io/en/flight_modes/hold.html).
     * A multicopter should just hover at the spot while a fixedwing vehicle should loiter
     * around the location where it paused.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.PauseMissionResponse> pauseMission(
        io.mavsdk.mission.MissionProto.PauseMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.ClearMissionResponse> clearMission(
        io.mavsdk.mission.MissionProto.ClearMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a mission item, the mission will be set to this item.
     * Note that this is not necessarily true for general missions using MAVLink if loop counters
     * are used.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse> setCurrentMissionItem(
        io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCurrentMissionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if the mission has been finished.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.IsMissionFinishedResponse> isMissionFinished(
        io.mavsdk.mission.MissionProto.IsMissionFinishedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsMissionFinishedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get whether to trigger Return-to-Launch (RTL) after mission is complete.
     * Before getting this option, it needs to be set, or a mission
     * needs to be downloaded.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse> getReturnToLaunchAfterMission(
        io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReturnToLaunchAfterMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set whether to trigger Return-to-Launch (RTL) after the mission is complete.
     * This will only take effect for the next mission upload, meaning that
     * the mission may have to be uploaded again.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse> setReturnToLaunchAfterMission(
        io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetReturnToLaunchAfterMissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_MISSION = 0;
  private static final int METHODID_SUBSCRIBE_UPLOAD_MISSION_WITH_PROGRESS = 1;
  private static final int METHODID_CANCEL_MISSION_UPLOAD = 2;
  private static final int METHODID_DOWNLOAD_MISSION = 3;
  private static final int METHODID_SUBSCRIBE_DOWNLOAD_MISSION_WITH_PROGRESS = 4;
  private static final int METHODID_CANCEL_MISSION_DOWNLOAD = 5;
  private static final int METHODID_START_MISSION = 6;
  private static final int METHODID_PAUSE_MISSION = 7;
  private static final int METHODID_CLEAR_MISSION = 8;
  private static final int METHODID_SET_CURRENT_MISSION_ITEM = 9;
  private static final int METHODID_IS_MISSION_FINISHED = 10;
  private static final int METHODID_SUBSCRIBE_MISSION_PROGRESS = 11;
  private static final int METHODID_GET_RETURN_TO_LAUNCH_AFTER_MISSION = 12;
  private static final int METHODID_SET_RETURN_TO_LAUNCH_AFTER_MISSION = 13;

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
        case METHODID_UPLOAD_MISSION:
          serviceImpl.uploadMission((io.mavsdk.mission.MissionProto.UploadMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.UploadMissionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_UPLOAD_MISSION_WITH_PROGRESS:
          serviceImpl.subscribeUploadMissionWithProgress((io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse>) responseObserver);
          break;
        case METHODID_CANCEL_MISSION_UPLOAD:
          serviceImpl.cancelMissionUpload((io.mavsdk.mission.MissionProto.CancelMissionUploadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.CancelMissionUploadResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_MISSION:
          serviceImpl.downloadMission((io.mavsdk.mission.MissionProto.DownloadMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.DownloadMissionResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_DOWNLOAD_MISSION_WITH_PROGRESS:
          serviceImpl.subscribeDownloadMissionWithProgress((io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse>) responseObserver);
          break;
        case METHODID_CANCEL_MISSION_DOWNLOAD:
          serviceImpl.cancelMissionDownload((io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse>) responseObserver);
          break;
        case METHODID_START_MISSION:
          serviceImpl.startMission((io.mavsdk.mission.MissionProto.StartMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.StartMissionResponse>) responseObserver);
          break;
        case METHODID_PAUSE_MISSION:
          serviceImpl.pauseMission((io.mavsdk.mission.MissionProto.PauseMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.PauseMissionResponse>) responseObserver);
          break;
        case METHODID_CLEAR_MISSION:
          serviceImpl.clearMission((io.mavsdk.mission.MissionProto.ClearMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.ClearMissionResponse>) responseObserver);
          break;
        case METHODID_SET_CURRENT_MISSION_ITEM:
          serviceImpl.setCurrentMissionItem((io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse>) responseObserver);
          break;
        case METHODID_IS_MISSION_FINISHED:
          serviceImpl.isMissionFinished((io.mavsdk.mission.MissionProto.IsMissionFinishedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.IsMissionFinishedResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_MISSION_PROGRESS:
          serviceImpl.subscribeMissionProgress((io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.MissionProgressResponse>) responseObserver);
          break;
        case METHODID_GET_RETURN_TO_LAUNCH_AFTER_MISSION:
          serviceImpl.getReturnToLaunchAfterMission((io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse>) responseObserver);
          break;
        case METHODID_SET_RETURN_TO_LAUNCH_AFTER_MISSION:
          serviceImpl.setReturnToLaunchAfterMission((io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse>) responseObserver);
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
          getUploadMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.UploadMissionRequest,
              io.mavsdk.mission.MissionProto.UploadMissionResponse>(
                service, METHODID_UPLOAD_MISSION)))
        .addMethod(
          getSubscribeUploadMissionWithProgressMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.SubscribeUploadMissionWithProgressRequest,
              io.mavsdk.mission.MissionProto.UploadMissionWithProgressResponse>(
                service, METHODID_SUBSCRIBE_UPLOAD_MISSION_WITH_PROGRESS)))
        .addMethod(
          getCancelMissionUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.CancelMissionUploadRequest,
              io.mavsdk.mission.MissionProto.CancelMissionUploadResponse>(
                service, METHODID_CANCEL_MISSION_UPLOAD)))
        .addMethod(
          getDownloadMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.DownloadMissionRequest,
              io.mavsdk.mission.MissionProto.DownloadMissionResponse>(
                service, METHODID_DOWNLOAD_MISSION)))
        .addMethod(
          getSubscribeDownloadMissionWithProgressMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.SubscribeDownloadMissionWithProgressRequest,
              io.mavsdk.mission.MissionProto.DownloadMissionWithProgressResponse>(
                service, METHODID_SUBSCRIBE_DOWNLOAD_MISSION_WITH_PROGRESS)))
        .addMethod(
          getCancelMissionDownloadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.CancelMissionDownloadRequest,
              io.mavsdk.mission.MissionProto.CancelMissionDownloadResponse>(
                service, METHODID_CANCEL_MISSION_DOWNLOAD)))
        .addMethod(
          getStartMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.StartMissionRequest,
              io.mavsdk.mission.MissionProto.StartMissionResponse>(
                service, METHODID_START_MISSION)))
        .addMethod(
          getPauseMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.PauseMissionRequest,
              io.mavsdk.mission.MissionProto.PauseMissionResponse>(
                service, METHODID_PAUSE_MISSION)))
        .addMethod(
          getClearMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.ClearMissionRequest,
              io.mavsdk.mission.MissionProto.ClearMissionResponse>(
                service, METHODID_CLEAR_MISSION)))
        .addMethod(
          getSetCurrentMissionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.SetCurrentMissionItemRequest,
              io.mavsdk.mission.MissionProto.SetCurrentMissionItemResponse>(
                service, METHODID_SET_CURRENT_MISSION_ITEM)))
        .addMethod(
          getIsMissionFinishedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.IsMissionFinishedRequest,
              io.mavsdk.mission.MissionProto.IsMissionFinishedResponse>(
                service, METHODID_IS_MISSION_FINISHED)))
        .addMethod(
          getSubscribeMissionProgressMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.SubscribeMissionProgressRequest,
              io.mavsdk.mission.MissionProto.MissionProgressResponse>(
                service, METHODID_SUBSCRIBE_MISSION_PROGRESS)))
        .addMethod(
          getGetReturnToLaunchAfterMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionRequest,
              io.mavsdk.mission.MissionProto.GetReturnToLaunchAfterMissionResponse>(
                service, METHODID_GET_RETURN_TO_LAUNCH_AFTER_MISSION)))
        .addMethod(
          getSetReturnToLaunchAfterMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionRequest,
              io.mavsdk.mission.MissionProto.SetReturnToLaunchAfterMissionResponse>(
                service, METHODID_SET_RETURN_TO_LAUNCH_AFTER_MISSION)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MissionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getUploadMissionMethod())
              .addMethod(getSubscribeUploadMissionWithProgressMethod())
              .addMethod(getCancelMissionUploadMethod())
              .addMethod(getDownloadMissionMethod())
              .addMethod(getSubscribeDownloadMissionWithProgressMethod())
              .addMethod(getCancelMissionDownloadMethod())
              .addMethod(getStartMissionMethod())
              .addMethod(getPauseMissionMethod())
              .addMethod(getClearMissionMethod())
              .addMethod(getSetCurrentMissionItemMethod())
              .addMethod(getIsMissionFinishedMethod())
              .addMethod(getSubscribeMissionProgressMethod())
              .addMethod(getGetReturnToLaunchAfterMissionMethod())
              .addMethod(getSetReturnToLaunchAfterMissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
