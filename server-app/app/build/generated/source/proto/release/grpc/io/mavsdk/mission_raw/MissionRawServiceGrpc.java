package io.mavsdk.mission_raw;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Enable raw missions as exposed by MAVLink.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: mavsdk/mission_raw/mission_raw.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MissionRawServiceGrpc {

  private MissionRawServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "mavsdk.rpc.mission_raw.MissionRawService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse> getUploadMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadMission",
      requestType = io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse> getUploadMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest, io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse> getUploadMissionMethod;
    if ((getUploadMissionMethod = MissionRawServiceGrpc.getUploadMissionMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getUploadMissionMethod = MissionRawServiceGrpc.getUploadMissionMethod) == null) {
          MissionRawServiceGrpc.getUploadMissionMethod = getUploadMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest, io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest,
      io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse> getUploadGeofenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadGeofence",
      requestType = io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest,
      io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse> getUploadGeofenceMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest, io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse> getUploadGeofenceMethod;
    if ((getUploadGeofenceMethod = MissionRawServiceGrpc.getUploadGeofenceMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getUploadGeofenceMethod = MissionRawServiceGrpc.getUploadGeofenceMethod) == null) {
          MissionRawServiceGrpc.getUploadGeofenceMethod = getUploadGeofenceMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest, io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadGeofence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadGeofenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest,
      io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse> getUploadRallyPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadRallyPoints",
      requestType = io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest,
      io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse> getUploadRallyPointsMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest, io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse> getUploadRallyPointsMethod;
    if ((getUploadRallyPointsMethod = MissionRawServiceGrpc.getUploadRallyPointsMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getUploadRallyPointsMethod = MissionRawServiceGrpc.getUploadRallyPointsMethod) == null) {
          MissionRawServiceGrpc.getUploadRallyPointsMethod = getUploadRallyPointsMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest, io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadRallyPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUploadRallyPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest,
      io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse> getCancelMissionUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMissionUpload",
      requestType = io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest,
      io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse> getCancelMissionUploadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest, io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse> getCancelMissionUploadMethod;
    if ((getCancelMissionUploadMethod = MissionRawServiceGrpc.getCancelMissionUploadMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getCancelMissionUploadMethod = MissionRawServiceGrpc.getCancelMissionUploadMethod) == null) {
          MissionRawServiceGrpc.getCancelMissionUploadMethod = getCancelMissionUploadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest, io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelMissionUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelMissionUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse> getDownloadMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadMission",
      requestType = io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse> getDownloadMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest, io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse> getDownloadMissionMethod;
    if ((getDownloadMissionMethod = MissionRawServiceGrpc.getDownloadMissionMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getDownloadMissionMethod = MissionRawServiceGrpc.getDownloadMissionMethod) == null) {
          MissionRawServiceGrpc.getDownloadMissionMethod = getDownloadMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest, io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDownloadMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest,
      io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse> getCancelMissionDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMissionDownload",
      requestType = io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest,
      io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse> getCancelMissionDownloadMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest, io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse> getCancelMissionDownloadMethod;
    if ((getCancelMissionDownloadMethod = MissionRawServiceGrpc.getCancelMissionDownloadMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getCancelMissionDownloadMethod = MissionRawServiceGrpc.getCancelMissionDownloadMethod) == null) {
          MissionRawServiceGrpc.getCancelMissionDownloadMethod = getCancelMissionDownloadMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest, io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelMissionDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCancelMissionDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse> getStartMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartMission",
      requestType = io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse> getStartMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest, io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse> getStartMissionMethod;
    if ((getStartMissionMethod = MissionRawServiceGrpc.getStartMissionMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getStartMissionMethod = MissionRawServiceGrpc.getStartMissionMethod) == null) {
          MissionRawServiceGrpc.getStartMissionMethod = getStartMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest, io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getStartMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse> getPauseMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PauseMission",
      requestType = io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse> getPauseMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest, io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse> getPauseMissionMethod;
    if ((getPauseMissionMethod = MissionRawServiceGrpc.getPauseMissionMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getPauseMissionMethod = MissionRawServiceGrpc.getPauseMissionMethod) == null) {
          MissionRawServiceGrpc.getPauseMissionMethod = getPauseMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest, io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PauseMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getPauseMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse> getClearMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClearMission",
      requestType = io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse> getClearMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest, io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse> getClearMissionMethod;
    if ((getClearMissionMethod = MissionRawServiceGrpc.getClearMissionMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getClearMissionMethod = MissionRawServiceGrpc.getClearMissionMethod) == null) {
          MissionRawServiceGrpc.getClearMissionMethod = getClearMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest, io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClearMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getClearMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest,
      io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse> getSetCurrentMissionItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetCurrentMissionItem",
      requestType = io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest,
      io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse> getSetCurrentMissionItemMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest, io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse> getSetCurrentMissionItemMethod;
    if ((getSetCurrentMissionItemMethod = MissionRawServiceGrpc.getSetCurrentMissionItemMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getSetCurrentMissionItemMethod = MissionRawServiceGrpc.getSetCurrentMissionItemMethod) == null) {
          MissionRawServiceGrpc.getSetCurrentMissionItemMethod = getSetCurrentMissionItemMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest, io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetCurrentMissionItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSetCurrentMissionItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest,
      io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse> getSubscribeMissionProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeMissionProgress",
      requestType = io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest,
      io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse> getSubscribeMissionProgressMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest, io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse> getSubscribeMissionProgressMethod;
    if ((getSubscribeMissionProgressMethod = MissionRawServiceGrpc.getSubscribeMissionProgressMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getSubscribeMissionProgressMethod = MissionRawServiceGrpc.getSubscribeMissionProgressMethod) == null) {
          MissionRawServiceGrpc.getSubscribeMissionProgressMethod = getSubscribeMissionProgressMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest, io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeMissionProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeMissionProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest,
      io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse> getSubscribeMissionChangedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeMissionChanged",
      requestType = io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest,
      io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse> getSubscribeMissionChangedMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest, io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse> getSubscribeMissionChangedMethod;
    if ((getSubscribeMissionChangedMethod = MissionRawServiceGrpc.getSubscribeMissionChangedMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getSubscribeMissionChangedMethod = MissionRawServiceGrpc.getSubscribeMissionChangedMethod) == null) {
          MissionRawServiceGrpc.getSubscribeMissionChangedMethod = getSubscribeMissionChangedMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest, io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeMissionChanged"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getSubscribeMissionChangedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse> getImportQgroundcontrolMissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportQgroundcontrolMission",
      requestType = io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest,
      io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse> getImportQgroundcontrolMissionMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest, io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse> getImportQgroundcontrolMissionMethod;
    if ((getImportQgroundcontrolMissionMethod = MissionRawServiceGrpc.getImportQgroundcontrolMissionMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getImportQgroundcontrolMissionMethod = MissionRawServiceGrpc.getImportQgroundcontrolMissionMethod) == null) {
          MissionRawServiceGrpc.getImportQgroundcontrolMissionMethod = getImportQgroundcontrolMissionMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest, io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportQgroundcontrolMission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getImportQgroundcontrolMissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest,
      io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse> getImportQgroundcontrolMissionFromStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ImportQgroundcontrolMissionFromString",
      requestType = io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest.class,
      responseType = io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest,
      io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse> getImportQgroundcontrolMissionFromStringMethod() {
    io.grpc.MethodDescriptor<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest, io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse> getImportQgroundcontrolMissionFromStringMethod;
    if ((getImportQgroundcontrolMissionFromStringMethod = MissionRawServiceGrpc.getImportQgroundcontrolMissionFromStringMethod) == null) {
      synchronized (MissionRawServiceGrpc.class) {
        if ((getImportQgroundcontrolMissionFromStringMethod = MissionRawServiceGrpc.getImportQgroundcontrolMissionFromStringMethod) == null) {
          MissionRawServiceGrpc.getImportQgroundcontrolMissionFromStringMethod = getImportQgroundcontrolMissionFromStringMethod =
              io.grpc.MethodDescriptor.<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest, io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ImportQgroundcontrolMissionFromString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getImportQgroundcontrolMissionFromStringMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MissionRawServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionRawServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionRawServiceStub>() {
        @java.lang.Override
        public MissionRawServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionRawServiceStub(channel, callOptions);
        }
      };
    return MissionRawServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MissionRawServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionRawServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionRawServiceBlockingStub>() {
        @java.lang.Override
        public MissionRawServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionRawServiceBlockingStub(channel, callOptions);
        }
      };
    return MissionRawServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MissionRawServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MissionRawServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MissionRawServiceFutureStub>() {
        @java.lang.Override
        public MissionRawServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MissionRawServiceFutureStub(channel, callOptions);
        }
      };
    return MissionRawServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Enable raw missions as exposed by MAVLink.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Upload a list of raw mission items to the system.
     * The raw mission items are uploaded to a drone. Once uploaded the mission
     * can be started and executed even if the connection is lost.
     * </pre>
     */
    default void uploadMission(io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload a list of geofence items to the system.
     * </pre>
     */
    default void uploadGeofence(io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadGeofenceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload a list of rally point items to the system.
     * </pre>
     */
    default void uploadRallyPoints(io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadRallyPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    default void cancelMissionUpload(io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMissionUploadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Download a list of raw mission items from the system (asynchronous).
     * </pre>
     */
    default void downloadMission(io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    default void cancelMissionDownload(io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMissionDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    default void startMission(io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse> responseObserver) {
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
    default void pauseMission(io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPauseMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    default void clearMission(io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets the raw mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a raw mission item, the mission will be set to this item.
     * </pre>
     */
    default void setCurrentMissionItem(io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetCurrentMissionItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to mission progress updates.
     * </pre>
     */
    default void subscribeMissionProgress(io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMissionProgressMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Subscribes to mission changed.
     * This notification can be used to be informed if a ground station has
     * been uploaded or changed by a ground station or companion computer.
     * &#64;param callback Callback to notify about change.
     * </pre>
     */
    default void subscribeMissionChanged(io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeMissionChangedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a file.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    default void importQgroundcontrolMission(io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportQgroundcontrolMissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a string.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    default void importQgroundcontrolMissionFromString(io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportQgroundcontrolMissionFromStringMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MissionRawService.
   * <pre>
   * Enable raw missions as exposed by MAVLink.
   * </pre>
   */
  public static abstract class MissionRawServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MissionRawServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MissionRawService.
   * <pre>
   * Enable raw missions as exposed by MAVLink.
   * </pre>
   */
  public static final class MissionRawServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MissionRawServiceStub> {
    private MissionRawServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionRawServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionRawServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload a list of raw mission items to the system.
     * The raw mission items are uploaded to a drone. Once uploaded the mission
     * can be started and executed even if the connection is lost.
     * </pre>
     */
    public void uploadMission(io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload a list of geofence items to the system.
     * </pre>
     */
    public void uploadGeofence(io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadGeofenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload a list of rally point items to the system.
     * </pre>
     */
    public void uploadRallyPoints(io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadRallyPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    public void cancelMissionUpload(io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMissionUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Download a list of raw mission items from the system (asynchronous).
     * </pre>
     */
    public void downloadMission(io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDownloadMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    public void cancelMissionDownload(io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMissionDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    public void startMission(io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse> responseObserver) {
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
    public void pauseMission(io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPauseMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    public void clearMission(io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets the raw mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a raw mission item, the mission will be set to this item.
     * </pre>
     */
    public void setCurrentMissionItem(io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetCurrentMissionItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to mission progress updates.
     * </pre>
     */
    public void subscribeMissionProgress(io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMissionProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Subscribes to mission changed.
     * This notification can be used to be informed if a ground station has
     * been uploaded or changed by a ground station or companion computer.
     * &#64;param callback Callback to notify about change.
     * </pre>
     */
    public void subscribeMissionChanged(io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMissionChangedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a file.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    public void importQgroundcontrolMission(io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportQgroundcontrolMissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a string.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    public void importQgroundcontrolMissionFromString(io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest request,
        io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportQgroundcontrolMissionFromStringMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MissionRawService.
   * <pre>
   * Enable raw missions as exposed by MAVLink.
   * </pre>
   */
  public static final class MissionRawServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MissionRawServiceBlockingStub> {
    private MissionRawServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionRawServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionRawServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload a list of raw mission items to the system.
     * The raw mission items are uploaded to a drone. Once uploaded the mission
     * can be started and executed even if the connection is lost.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse uploadMission(io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload a list of geofence items to the system.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse uploadGeofence(io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadGeofenceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload a list of rally point items to the system.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse uploadRallyPoints(io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadRallyPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse cancelMissionUpload(io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMissionUploadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Download a list of raw mission items from the system (asynchronous).
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse downloadMission(io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDownloadMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse cancelMissionDownload(io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMissionDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse startMission(io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest request) {
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
    public io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse pauseMission(io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPauseMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse clearMission(io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets the raw mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a raw mission item, the mission will be set to this item.
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse setCurrentMissionItem(io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetCurrentMissionItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to mission progress updates.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse> subscribeMissionProgress(
        io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMissionProgressMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Subscribes to mission changed.
     * This notification can be used to be informed if a ground station has
     * been uploaded or changed by a ground station or companion computer.
     * &#64;param callback Callback to notify about change.
     * </pre>
     */
    public java.util.Iterator<io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse> subscribeMissionChanged(
        io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeMissionChangedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a file.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse importQgroundcontrolMission(io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportQgroundcontrolMissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a string.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    public io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse importQgroundcontrolMissionFromString(io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportQgroundcontrolMissionFromStringMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MissionRawService.
   * <pre>
   * Enable raw missions as exposed by MAVLink.
   * </pre>
   */
  public static final class MissionRawServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MissionRawServiceFutureStub> {
    private MissionRawServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MissionRawServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MissionRawServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Upload a list of raw mission items to the system.
     * The raw mission items are uploaded to a drone. Once uploaded the mission
     * can be started and executed even if the connection is lost.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse> uploadMission(
        io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload a list of geofence items to the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse> uploadGeofence(
        io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadGeofenceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload a list of rally point items to the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse> uploadRallyPoints(
        io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadRallyPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission upload.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse> cancelMissionUpload(
        io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMissionUploadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Download a list of raw mission items from the system (asynchronous).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse> downloadMission(
        io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDownloadMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an ongoing mission download.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse> cancelMissionDownload(
        io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMissionDownloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Start the mission.
     * A mission must be uploaded to the vehicle before this can be called.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse> startMission(
        io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse> pauseMission(
        io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPauseMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Clear the mission saved on the vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse> clearMission(
        io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets the raw mission item index to go to.
     * By setting the current index to 0, the mission is restarted from the beginning. If it is set
     * to a specific index of a raw mission item, the mission will be set to this item.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse> setCurrentMissionItem(
        io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetCurrentMissionItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a file.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse> importQgroundcontrolMission(
        io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportQgroundcontrolMissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Import a QGroundControl missions in JSON .plan format, from a string.
     * Supported:
     * - Waypoints
     * - Survey
     * Not supported:
     * - Structure Scan
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse> importQgroundcontrolMissionFromString(
        io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportQgroundcontrolMissionFromStringMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPLOAD_MISSION = 0;
  private static final int METHODID_UPLOAD_GEOFENCE = 1;
  private static final int METHODID_UPLOAD_RALLY_POINTS = 2;
  private static final int METHODID_CANCEL_MISSION_UPLOAD = 3;
  private static final int METHODID_DOWNLOAD_MISSION = 4;
  private static final int METHODID_CANCEL_MISSION_DOWNLOAD = 5;
  private static final int METHODID_START_MISSION = 6;
  private static final int METHODID_PAUSE_MISSION = 7;
  private static final int METHODID_CLEAR_MISSION = 8;
  private static final int METHODID_SET_CURRENT_MISSION_ITEM = 9;
  private static final int METHODID_SUBSCRIBE_MISSION_PROGRESS = 10;
  private static final int METHODID_SUBSCRIBE_MISSION_CHANGED = 11;
  private static final int METHODID_IMPORT_QGROUNDCONTROL_MISSION = 12;
  private static final int METHODID_IMPORT_QGROUNDCONTROL_MISSION_FROM_STRING = 13;

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
          serviceImpl.uploadMission((io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_GEOFENCE:
          serviceImpl.uploadGeofence((io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_RALLY_POINTS:
          serviceImpl.uploadRallyPoints((io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse>) responseObserver);
          break;
        case METHODID_CANCEL_MISSION_UPLOAD:
          serviceImpl.cancelMissionUpload((io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse>) responseObserver);
          break;
        case METHODID_DOWNLOAD_MISSION:
          serviceImpl.downloadMission((io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse>) responseObserver);
          break;
        case METHODID_CANCEL_MISSION_DOWNLOAD:
          serviceImpl.cancelMissionDownload((io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse>) responseObserver);
          break;
        case METHODID_START_MISSION:
          serviceImpl.startMission((io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse>) responseObserver);
          break;
        case METHODID_PAUSE_MISSION:
          serviceImpl.pauseMission((io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse>) responseObserver);
          break;
        case METHODID_CLEAR_MISSION:
          serviceImpl.clearMission((io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse>) responseObserver);
          break;
        case METHODID_SET_CURRENT_MISSION_ITEM:
          serviceImpl.setCurrentMissionItem((io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_MISSION_PROGRESS:
          serviceImpl.subscribeMissionProgress((io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_MISSION_CHANGED:
          serviceImpl.subscribeMissionChanged((io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse>) responseObserver);
          break;
        case METHODID_IMPORT_QGROUNDCONTROL_MISSION:
          serviceImpl.importQgroundcontrolMission((io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse>) responseObserver);
          break;
        case METHODID_IMPORT_QGROUNDCONTROL_MISSION_FROM_STRING:
          serviceImpl.importQgroundcontrolMissionFromString((io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest) request,
              (io.grpc.stub.StreamObserver<io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse>) responseObserver);
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
              io.mavsdk.mission_raw.MissionRawProto.UploadMissionRequest,
              io.mavsdk.mission_raw.MissionRawProto.UploadMissionResponse>(
                service, METHODID_UPLOAD_MISSION)))
        .addMethod(
          getUploadGeofenceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceRequest,
              io.mavsdk.mission_raw.MissionRawProto.UploadGeofenceResponse>(
                service, METHODID_UPLOAD_GEOFENCE)))
        .addMethod(
          getUploadRallyPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsRequest,
              io.mavsdk.mission_raw.MissionRawProto.UploadRallyPointsResponse>(
                service, METHODID_UPLOAD_RALLY_POINTS)))
        .addMethod(
          getCancelMissionUploadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadRequest,
              io.mavsdk.mission_raw.MissionRawProto.CancelMissionUploadResponse>(
                service, METHODID_CANCEL_MISSION_UPLOAD)))
        .addMethod(
          getDownloadMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.DownloadMissionRequest,
              io.mavsdk.mission_raw.MissionRawProto.DownloadMissionResponse>(
                service, METHODID_DOWNLOAD_MISSION)))
        .addMethod(
          getCancelMissionDownloadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadRequest,
              io.mavsdk.mission_raw.MissionRawProto.CancelMissionDownloadResponse>(
                service, METHODID_CANCEL_MISSION_DOWNLOAD)))
        .addMethod(
          getStartMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.StartMissionRequest,
              io.mavsdk.mission_raw.MissionRawProto.StartMissionResponse>(
                service, METHODID_START_MISSION)))
        .addMethod(
          getPauseMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.PauseMissionRequest,
              io.mavsdk.mission_raw.MissionRawProto.PauseMissionResponse>(
                service, METHODID_PAUSE_MISSION)))
        .addMethod(
          getClearMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.ClearMissionRequest,
              io.mavsdk.mission_raw.MissionRawProto.ClearMissionResponse>(
                service, METHODID_CLEAR_MISSION)))
        .addMethod(
          getSetCurrentMissionItemMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemRequest,
              io.mavsdk.mission_raw.MissionRawProto.SetCurrentMissionItemResponse>(
                service, METHODID_SET_CURRENT_MISSION_ITEM)))
        .addMethod(
          getSubscribeMissionProgressMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionProgressRequest,
              io.mavsdk.mission_raw.MissionRawProto.MissionProgressResponse>(
                service, METHODID_SUBSCRIBE_MISSION_PROGRESS)))
        .addMethod(
          getSubscribeMissionChangedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.SubscribeMissionChangedRequest,
              io.mavsdk.mission_raw.MissionRawProto.MissionChangedResponse>(
                service, METHODID_SUBSCRIBE_MISSION_CHANGED)))
        .addMethod(
          getImportQgroundcontrolMissionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionRequest,
              io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionResponse>(
                service, METHODID_IMPORT_QGROUNDCONTROL_MISSION)))
        .addMethod(
          getImportQgroundcontrolMissionFromStringMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringRequest,
              io.mavsdk.mission_raw.MissionRawProto.ImportQgroundcontrolMissionFromStringResponse>(
                service, METHODID_IMPORT_QGROUNDCONTROL_MISSION_FROM_STRING)))
        .build();
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MissionRawServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getUploadMissionMethod())
              .addMethod(getUploadGeofenceMethod())
              .addMethod(getUploadRallyPointsMethod())
              .addMethod(getCancelMissionUploadMethod())
              .addMethod(getDownloadMissionMethod())
              .addMethod(getCancelMissionDownloadMethod())
              .addMethod(getStartMissionMethod())
              .addMethod(getPauseMissionMethod())
              .addMethod(getClearMissionMethod())
              .addMethod(getSetCurrentMissionItemMethod())
              .addMethod(getSubscribeMissionProgressMethod())
              .addMethod(getSubscribeMissionChangedMethod())
              .addMethod(getImportQgroundcontrolMissionMethod())
              .addMethod(getImportQgroundcontrolMissionFromStringMethod())
              .build();
        }
      }
    }
    return result;
  }
}
