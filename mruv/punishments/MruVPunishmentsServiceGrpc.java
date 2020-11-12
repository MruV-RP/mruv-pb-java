package mruv.punishments;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * This service provides interface for managing punishments for players.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: punishments/punishments.proto")
public final class MruVPunishmentsServiceGrpc {

  private MruVPunishmentsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.punishments.MruVPunishmentsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.BanRequest,
      mruv.punishments.Punishments.BanResponse> getBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ban",
      requestType = mruv.punishments.Punishments.BanRequest.class,
      responseType = mruv.punishments.Punishments.BanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.BanRequest,
      mruv.punishments.Punishments.BanResponse> getBanMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.BanRequest, mruv.punishments.Punishments.BanResponse> getBanMethod;
    if ((getBanMethod = MruVPunishmentsServiceGrpc.getBanMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getBanMethod = MruVPunishmentsServiceGrpc.getBanMethod) == null) {
          MruVPunishmentsServiceGrpc.getBanMethod = getBanMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.BanRequest, mruv.punishments.Punishments.BanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ban"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("Ban"))
              .build();
        }
      }
    }
    return getBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.BlockRequest,
      mruv.punishments.Punishments.BlockResponse> getBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Block",
      requestType = mruv.punishments.Punishments.BlockRequest.class,
      responseType = mruv.punishments.Punishments.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.BlockRequest,
      mruv.punishments.Punishments.BlockResponse> getBlockMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.BlockRequest, mruv.punishments.Punishments.BlockResponse> getBlockMethod;
    if ((getBlockMethod = MruVPunishmentsServiceGrpc.getBlockMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getBlockMethod = MruVPunishmentsServiceGrpc.getBlockMethod) == null) {
          MruVPunishmentsServiceGrpc.getBlockMethod = getBlockMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.BlockRequest, mruv.punishments.Punishments.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("Block"))
              .build();
        }
      }
    }
    return getBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WarnRequest,
      mruv.punishments.Punishments.WarnResponse> getWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Warn",
      requestType = mruv.punishments.Punishments.WarnRequest.class,
      responseType = mruv.punishments.Punishments.WarnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WarnRequest,
      mruv.punishments.Punishments.WarnResponse> getWarnMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WarnRequest, mruv.punishments.Punishments.WarnResponse> getWarnMethod;
    if ((getWarnMethod = MruVPunishmentsServiceGrpc.getWarnMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWarnMethod = MruVPunishmentsServiceGrpc.getWarnMethod) == null) {
          MruVPunishmentsServiceGrpc.getWarnMethod = getWarnMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WarnRequest, mruv.punishments.Punishments.WarnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Warn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WarnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("Warn"))
              .build();
        }
      }
    }
    return getWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.AdminJailRequest,
      mruv.punishments.Punishments.AdminJailResponse> getAdminJailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminJail",
      requestType = mruv.punishments.Punishments.AdminJailRequest.class,
      responseType = mruv.punishments.Punishments.AdminJailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.AdminJailRequest,
      mruv.punishments.Punishments.AdminJailResponse> getAdminJailMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.AdminJailRequest, mruv.punishments.Punishments.AdminJailResponse> getAdminJailMethod;
    if ((getAdminJailMethod = MruVPunishmentsServiceGrpc.getAdminJailMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getAdminJailMethod = MruVPunishmentsServiceGrpc.getAdminJailMethod) == null) {
          MruVPunishmentsServiceGrpc.getAdminJailMethod = getAdminJailMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.AdminJailRequest, mruv.punishments.Punishments.AdminJailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminJail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.AdminJailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.AdminJailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("AdminJail"))
              .build();
        }
      }
    }
    return getAdminJailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.MuteGlobalChatsRequest,
      mruv.punishments.Punishments.MuteGlobalChatsResponse> getMuteGlobalChatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MuteGlobalChats",
      requestType = mruv.punishments.Punishments.MuteGlobalChatsRequest.class,
      responseType = mruv.punishments.Punishments.MuteGlobalChatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.MuteGlobalChatsRequest,
      mruv.punishments.Punishments.MuteGlobalChatsResponse> getMuteGlobalChatsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.MuteGlobalChatsRequest, mruv.punishments.Punishments.MuteGlobalChatsResponse> getMuteGlobalChatsMethod;
    if ((getMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getMuteGlobalChatsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getMuteGlobalChatsMethod) == null) {
          MruVPunishmentsServiceGrpc.getMuteGlobalChatsMethod = getMuteGlobalChatsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.MuteGlobalChatsRequest, mruv.punishments.Punishments.MuteGlobalChatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MuteGlobalChats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.MuteGlobalChatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.MuteGlobalChatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("MuteGlobalChats"))
              .build();
        }
      }
    }
    return getMuteGlobalChatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnBanRequest,
      mruv.punishments.Punishments.UnBanResponse> getUnBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnBan",
      requestType = mruv.punishments.Punishments.UnBanRequest.class,
      responseType = mruv.punishments.Punishments.UnBanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnBanRequest,
      mruv.punishments.Punishments.UnBanResponse> getUnBanMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnBanRequest, mruv.punishments.Punishments.UnBanResponse> getUnBanMethod;
    if ((getUnBanMethod = MruVPunishmentsServiceGrpc.getUnBanMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnBanMethod = MruVPunishmentsServiceGrpc.getUnBanMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnBanMethod = getUnBanMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.UnBanRequest, mruv.punishments.Punishments.UnBanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnBan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnBanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnBanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnBan"))
              .build();
        }
      }
    }
    return getUnBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnBlockRequest,
      mruv.punishments.Punishments.UnBlockResponse> getUnBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnBlock",
      requestType = mruv.punishments.Punishments.UnBlockRequest.class,
      responseType = mruv.punishments.Punishments.UnBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnBlockRequest,
      mruv.punishments.Punishments.UnBlockResponse> getUnBlockMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnBlockRequest, mruv.punishments.Punishments.UnBlockResponse> getUnBlockMethod;
    if ((getUnBlockMethod = MruVPunishmentsServiceGrpc.getUnBlockMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnBlockMethod = MruVPunishmentsServiceGrpc.getUnBlockMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnBlockMethod = getUnBlockMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.UnBlockRequest, mruv.punishments.Punishments.UnBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnBlock"))
              .build();
        }
      }
    }
    return getUnBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnWarnRequest,
      mruv.punishments.Punishments.UnWarnResponse> getUnWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnWarn",
      requestType = mruv.punishments.Punishments.UnWarnRequest.class,
      responseType = mruv.punishments.Punishments.UnWarnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnWarnRequest,
      mruv.punishments.Punishments.UnWarnResponse> getUnWarnMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnWarnRequest, mruv.punishments.Punishments.UnWarnResponse> getUnWarnMethod;
    if ((getUnWarnMethod = MruVPunishmentsServiceGrpc.getUnWarnMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnWarnMethod = MruVPunishmentsServiceGrpc.getUnWarnMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnWarnMethod = getUnWarnMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.UnWarnRequest, mruv.punishments.Punishments.UnWarnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnWarn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnWarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnWarnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnWarn"))
              .build();
        }
      }
    }
    return getUnWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnAdminJailRequest,
      mruv.punishments.Punishments.UnAdminJailResponse> getUnAdminJailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnAdminJail",
      requestType = mruv.punishments.Punishments.UnAdminJailRequest.class,
      responseType = mruv.punishments.Punishments.UnAdminJailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnAdminJailRequest,
      mruv.punishments.Punishments.UnAdminJailResponse> getUnAdminJailMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnAdminJailRequest, mruv.punishments.Punishments.UnAdminJailResponse> getUnAdminJailMethod;
    if ((getUnAdminJailMethod = MruVPunishmentsServiceGrpc.getUnAdminJailMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnAdminJailMethod = MruVPunishmentsServiceGrpc.getUnAdminJailMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnAdminJailMethod = getUnAdminJailMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.UnAdminJailRequest, mruv.punishments.Punishments.UnAdminJailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnAdminJail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnAdminJailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnAdminJailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnAdminJail"))
              .build();
        }
      }
    }
    return getUnAdminJailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnMuteGlobalChatsRequest,
      mruv.punishments.Punishments.UnMuteGlobalChatsResponse> getUnMuteGlobalChatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnMuteGlobalChats",
      requestType = mruv.punishments.Punishments.UnMuteGlobalChatsRequest.class,
      responseType = mruv.punishments.Punishments.UnMuteGlobalChatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnMuteGlobalChatsRequest,
      mruv.punishments.Punishments.UnMuteGlobalChatsResponse> getUnMuteGlobalChatsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.UnMuteGlobalChatsRequest, mruv.punishments.Punishments.UnMuteGlobalChatsResponse> getUnMuteGlobalChatsMethod;
    if ((getUnMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getUnMuteGlobalChatsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getUnMuteGlobalChatsMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnMuteGlobalChatsMethod = getUnMuteGlobalChatsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.UnMuteGlobalChatsRequest, mruv.punishments.Punishments.UnMuteGlobalChatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnMuteGlobalChats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnMuteGlobalChatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnMuteGlobalChatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnMuteGlobalChats"))
              .build();
        }
      }
    }
    return getUnMuteGlobalChatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerBansRequest,
      mruv.punishments.Punishments.GetPlayerBansResponse> getGetPlayerBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerBans",
      requestType = mruv.punishments.Punishments.GetPlayerBansRequest.class,
      responseType = mruv.punishments.Punishments.GetPlayerBansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerBansRequest,
      mruv.punishments.Punishments.GetPlayerBansResponse> getGetPlayerBansMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerBansRequest, mruv.punishments.Punishments.GetPlayerBansResponse> getGetPlayerBansMethod;
    if ((getGetPlayerBansMethod = MruVPunishmentsServiceGrpc.getGetPlayerBansMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetPlayerBansMethod = MruVPunishmentsServiceGrpc.getGetPlayerBansMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetPlayerBansMethod = getGetPlayerBansMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.GetPlayerBansRequest, mruv.punishments.Punishments.GetPlayerBansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetPlayerBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetPlayerBansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetPlayerBans"))
              .build();
        }
      }
    }
    return getGetPlayerBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerWarnsRequest,
      mruv.punishments.Punishments.GetPlayerWarnsResponse> getGetPlayerWarnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerWarns",
      requestType = mruv.punishments.Punishments.GetPlayerWarnsRequest.class,
      responseType = mruv.punishments.Punishments.GetPlayerWarnsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerWarnsRequest,
      mruv.punishments.Punishments.GetPlayerWarnsResponse> getGetPlayerWarnsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerWarnsRequest, mruv.punishments.Punishments.GetPlayerWarnsResponse> getGetPlayerWarnsMethod;
    if ((getGetPlayerWarnsMethod = MruVPunishmentsServiceGrpc.getGetPlayerWarnsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetPlayerWarnsMethod = MruVPunishmentsServiceGrpc.getGetPlayerWarnsMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetPlayerWarnsMethod = getGetPlayerWarnsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.GetPlayerWarnsRequest, mruv.punishments.Punishments.GetPlayerWarnsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerWarns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetPlayerWarnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetPlayerWarnsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetPlayerWarns"))
              .build();
        }
      }
    }
    return getGetPlayerWarnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerAdminJailRequest,
      mruv.punishments.Punishments.GetPlayerAdminJailResponse> getGetPlayerAdminJailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerAdminJail",
      requestType = mruv.punishments.Punishments.GetPlayerAdminJailRequest.class,
      responseType = mruv.punishments.Punishments.GetPlayerAdminJailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerAdminJailRequest,
      mruv.punishments.Punishments.GetPlayerAdminJailResponse> getGetPlayerAdminJailMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetPlayerAdminJailRequest, mruv.punishments.Punishments.GetPlayerAdminJailResponse> getGetPlayerAdminJailMethod;
    if ((getGetPlayerAdminJailMethod = MruVPunishmentsServiceGrpc.getGetPlayerAdminJailMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetPlayerAdminJailMethod = MruVPunishmentsServiceGrpc.getGetPlayerAdminJailMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetPlayerAdminJailMethod = getGetPlayerAdminJailMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.GetPlayerAdminJailRequest, mruv.punishments.Punishments.GetPlayerAdminJailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerAdminJail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetPlayerAdminJailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetPlayerAdminJailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetPlayerAdminJail"))
              .build();
        }
      }
    }
    return getGetPlayerAdminJailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetBanRequest,
      mruv.punishments.Punishments.BanMessage> getGetBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBan",
      requestType = mruv.punishments.Punishments.GetBanRequest.class,
      responseType = mruv.punishments.Punishments.BanMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetBanRequest,
      mruv.punishments.Punishments.BanMessage> getGetBanMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetBanRequest, mruv.punishments.Punishments.BanMessage> getGetBanMethod;
    if ((getGetBanMethod = MruVPunishmentsServiceGrpc.getGetBanMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetBanMethod = MruVPunishmentsServiceGrpc.getGetBanMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetBanMethod = getGetBanMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.GetBanRequest, mruv.punishments.Punishments.BanMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetBanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BanMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetBan"))
              .build();
        }
      }
    }
    return getGetBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetWarnRequest,
      mruv.punishments.Punishments.WarnMessage> getGetWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWarn",
      requestType = mruv.punishments.Punishments.GetWarnRequest.class,
      responseType = mruv.punishments.Punishments.WarnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetWarnRequest,
      mruv.punishments.Punishments.WarnMessage> getGetWarnMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetWarnRequest, mruv.punishments.Punishments.WarnMessage> getGetWarnMethod;
    if ((getGetWarnMethod = MruVPunishmentsServiceGrpc.getGetWarnMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetWarnMethod = MruVPunishmentsServiceGrpc.getGetWarnMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetWarnMethod = getGetWarnMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.GetWarnRequest, mruv.punishments.Punishments.WarnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWarn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetWarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WarnMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetWarn"))
              .build();
        }
      }
    }
    return getGetWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetBlockRequest,
      mruv.punishments.Punishments.BlockMessage> getGetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlock",
      requestType = mruv.punishments.Punishments.GetBlockRequest.class,
      responseType = mruv.punishments.Punishments.BlockMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetBlockRequest,
      mruv.punishments.Punishments.BlockMessage> getGetBlockMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.GetBlockRequest, mruv.punishments.Punishments.BlockMessage> getGetBlockMethod;
    if ((getGetBlockMethod = MruVPunishmentsServiceGrpc.getGetBlockMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetBlockMethod = MruVPunishmentsServiceGrpc.getGetBlockMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetBlockMethod = getGetBlockMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.GetBlockRequest, mruv.punishments.Punishments.BlockMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.GetBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BlockMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetBlock"))
              .build();
        }
      }
    }
    return getGetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsPlayerBannedRequest,
      mruv.punishments.Punishments.IsPlayerBannedResponse> getIsPlayerBannedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsPlayerBanned",
      requestType = mruv.punishments.Punishments.IsPlayerBannedRequest.class,
      responseType = mruv.punishments.Punishments.IsPlayerBannedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsPlayerBannedRequest,
      mruv.punishments.Punishments.IsPlayerBannedResponse> getIsPlayerBannedMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsPlayerBannedRequest, mruv.punishments.Punishments.IsPlayerBannedResponse> getIsPlayerBannedMethod;
    if ((getIsPlayerBannedMethod = MruVPunishmentsServiceGrpc.getIsPlayerBannedMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getIsPlayerBannedMethod = MruVPunishmentsServiceGrpc.getIsPlayerBannedMethod) == null) {
          MruVPunishmentsServiceGrpc.getIsPlayerBannedMethod = getIsPlayerBannedMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.IsPlayerBannedRequest, mruv.punishments.Punishments.IsPlayerBannedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsPlayerBanned"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.IsPlayerBannedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.IsPlayerBannedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("IsPlayerBanned"))
              .build();
        }
      }
    }
    return getIsPlayerBannedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsCharacterBlockedRequest,
      mruv.punishments.Punishments.IsCharacterBlockedResponse> getIsCharacterBlockedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsCharacterBlocked",
      requestType = mruv.punishments.Punishments.IsCharacterBlockedRequest.class,
      responseType = mruv.punishments.Punishments.IsCharacterBlockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsCharacterBlockedRequest,
      mruv.punishments.Punishments.IsCharacterBlockedResponse> getIsCharacterBlockedMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsCharacterBlockedRequest, mruv.punishments.Punishments.IsCharacterBlockedResponse> getIsCharacterBlockedMethod;
    if ((getIsCharacterBlockedMethod = MruVPunishmentsServiceGrpc.getIsCharacterBlockedMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getIsCharacterBlockedMethod = MruVPunishmentsServiceGrpc.getIsCharacterBlockedMethod) == null) {
          MruVPunishmentsServiceGrpc.getIsCharacterBlockedMethod = getIsCharacterBlockedMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.IsCharacterBlockedRequest, mruv.punishments.Punishments.IsCharacterBlockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCharacterBlocked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.IsCharacterBlockedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.IsCharacterBlockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("IsCharacterBlocked"))
              .build();
        }
      }
    }
    return getIsCharacterBlockedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsCharacterJailedRequest,
      mruv.punishments.Punishments.IsCharacterJailedResponse> getIsCharacterJailedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsCharacterJailed",
      requestType = mruv.punishments.Punishments.IsCharacterJailedRequest.class,
      responseType = mruv.punishments.Punishments.IsCharacterJailedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsCharacterJailedRequest,
      mruv.punishments.Punishments.IsCharacterJailedResponse> getIsCharacterJailedMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.IsCharacterJailedRequest, mruv.punishments.Punishments.IsCharacterJailedResponse> getIsCharacterJailedMethod;
    if ((getIsCharacterJailedMethod = MruVPunishmentsServiceGrpc.getIsCharacterJailedMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getIsCharacterJailedMethod = MruVPunishmentsServiceGrpc.getIsCharacterJailedMethod) == null) {
          MruVPunishmentsServiceGrpc.getIsCharacterJailedMethod = getIsCharacterJailedMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.IsCharacterJailedRequest, mruv.punishments.Punishments.IsCharacterJailedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCharacterJailed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.IsCharacterJailedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.IsCharacterJailedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("IsCharacterJailed"))
              .build();
        }
      }
    }
    return getIsCharacterJailedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchBansRequest,
      mruv.punishments.Punishments.BanMessage> getWatchBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchBans",
      requestType = mruv.punishments.Punishments.WatchBansRequest.class,
      responseType = mruv.punishments.Punishments.BanMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchBansRequest,
      mruv.punishments.Punishments.BanMessage> getWatchBansMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchBansRequest, mruv.punishments.Punishments.BanMessage> getWatchBansMethod;
    if ((getWatchBansMethod = MruVPunishmentsServiceGrpc.getWatchBansMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchBansMethod = MruVPunishmentsServiceGrpc.getWatchBansMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchBansMethod = getWatchBansMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchBansRequest, mruv.punishments.Punishments.BanMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BanMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchBans"))
              .build();
        }
      }
    }
    return getWatchBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchBlocksRequest,
      mruv.punishments.Punishments.BlockMessage> getWatchBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchBlocks",
      requestType = mruv.punishments.Punishments.WatchBlocksRequest.class,
      responseType = mruv.punishments.Punishments.BlockMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchBlocksRequest,
      mruv.punishments.Punishments.BlockMessage> getWatchBlocksMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchBlocksRequest, mruv.punishments.Punishments.BlockMessage> getWatchBlocksMethod;
    if ((getWatchBlocksMethod = MruVPunishmentsServiceGrpc.getWatchBlocksMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchBlocksMethod = MruVPunishmentsServiceGrpc.getWatchBlocksMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchBlocksMethod = getWatchBlocksMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchBlocksRequest, mruv.punishments.Punishments.BlockMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.BlockMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchBlocks"))
              .build();
        }
      }
    }
    return getWatchBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchWarnsRequest,
      mruv.punishments.Punishments.WarnMessage> getWatchWarnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchWarns",
      requestType = mruv.punishments.Punishments.WatchWarnsRequest.class,
      responseType = mruv.punishments.Punishments.WarnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchWarnsRequest,
      mruv.punishments.Punishments.WarnMessage> getWatchWarnsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchWarnsRequest, mruv.punishments.Punishments.WarnMessage> getWatchWarnsMethod;
    if ((getWatchWarnsMethod = MruVPunishmentsServiceGrpc.getWatchWarnsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchWarnsMethod = MruVPunishmentsServiceGrpc.getWatchWarnsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchWarnsMethod = getWatchWarnsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchWarnsRequest, mruv.punishments.Punishments.WarnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchWarns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchWarnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WarnMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchWarns"))
              .build();
        }
      }
    }
    return getWatchWarnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchAdminJailsRequest,
      mruv.punishments.Punishments.AdminJailMessage> getWatchAdminJailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchAdminJails",
      requestType = mruv.punishments.Punishments.WatchAdminJailsRequest.class,
      responseType = mruv.punishments.Punishments.AdminJailMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchAdminJailsRequest,
      mruv.punishments.Punishments.AdminJailMessage> getWatchAdminJailsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchAdminJailsRequest, mruv.punishments.Punishments.AdminJailMessage> getWatchAdminJailsMethod;
    if ((getWatchAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchAdminJailsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchAdminJailsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchAdminJailsMethod = getWatchAdminJailsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchAdminJailsRequest, mruv.punishments.Punishments.AdminJailMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchAdminJails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchAdminJailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.AdminJailMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchAdminJails"))
              .build();
        }
      }
    }
    return getWatchAdminJailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnBansRequest,
      mruv.punishments.Punishments.UnBanMessage> getWatchUnBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnBans",
      requestType = mruv.punishments.Punishments.WatchUnBansRequest.class,
      responseType = mruv.punishments.Punishments.UnBanMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnBansRequest,
      mruv.punishments.Punishments.UnBanMessage> getWatchUnBansMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnBansRequest, mruv.punishments.Punishments.UnBanMessage> getWatchUnBansMethod;
    if ((getWatchUnBansMethod = MruVPunishmentsServiceGrpc.getWatchUnBansMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnBansMethod = MruVPunishmentsServiceGrpc.getWatchUnBansMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnBansMethod = getWatchUnBansMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchUnBansRequest, mruv.punishments.Punishments.UnBanMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchUnBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnBanMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnBans"))
              .build();
        }
      }
    }
    return getWatchUnBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnBlocksRequest,
      mruv.punishments.Punishments.UnBlockMessage> getWatchUnBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnBlocks",
      requestType = mruv.punishments.Punishments.WatchUnBlocksRequest.class,
      responseType = mruv.punishments.Punishments.UnBlockMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnBlocksRequest,
      mruv.punishments.Punishments.UnBlockMessage> getWatchUnBlocksMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnBlocksRequest, mruv.punishments.Punishments.UnBlockMessage> getWatchUnBlocksMethod;
    if ((getWatchUnBlocksMethod = MruVPunishmentsServiceGrpc.getWatchUnBlocksMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnBlocksMethod = MruVPunishmentsServiceGrpc.getWatchUnBlocksMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnBlocksMethod = getWatchUnBlocksMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchUnBlocksRequest, mruv.punishments.Punishments.UnBlockMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchUnBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnBlockMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnBlocks"))
              .build();
        }
      }
    }
    return getWatchUnBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnWarnsRequest,
      mruv.punishments.Punishments.UnWarnMessage> getWatchUnWarnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnWarns",
      requestType = mruv.punishments.Punishments.WatchUnWarnsRequest.class,
      responseType = mruv.punishments.Punishments.UnWarnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnWarnsRequest,
      mruv.punishments.Punishments.UnWarnMessage> getWatchUnWarnsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnWarnsRequest, mruv.punishments.Punishments.UnWarnMessage> getWatchUnWarnsMethod;
    if ((getWatchUnWarnsMethod = MruVPunishmentsServiceGrpc.getWatchUnWarnsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnWarnsMethod = MruVPunishmentsServiceGrpc.getWatchUnWarnsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnWarnsMethod = getWatchUnWarnsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchUnWarnsRequest, mruv.punishments.Punishments.UnWarnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnWarns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchUnWarnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnWarnMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnWarns"))
              .build();
        }
      }
    }
    return getWatchUnWarnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnAdminJailsRequest,
      mruv.punishments.Punishments.UnAdminJailMessage> getWatchUnAdminJailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnAdminJails",
      requestType = mruv.punishments.Punishments.WatchUnAdminJailsRequest.class,
      responseType = mruv.punishments.Punishments.UnAdminJailMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnAdminJailsRequest,
      mruv.punishments.Punishments.UnAdminJailMessage> getWatchUnAdminJailsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchUnAdminJailsRequest, mruv.punishments.Punishments.UnAdminJailMessage> getWatchUnAdminJailsMethod;
    if ((getWatchUnAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchUnAdminJailsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchUnAdminJailsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnAdminJailsMethod = getWatchUnAdminJailsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchUnAdminJailsRequest, mruv.punishments.Punishments.UnAdminJailMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnAdminJails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchUnAdminJailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.UnAdminJailMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnAdminJails"))
              .build();
        }
      }
    }
    return getWatchUnAdminJailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPlayerPunishmentsRequest,
      mruv.punishments.Punishments.WatchPlayerPunishmentsResponse> getWatchPlayerPunishmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPlayerPunishments",
      requestType = mruv.punishments.Punishments.WatchPlayerPunishmentsRequest.class,
      responseType = mruv.punishments.Punishments.WatchPlayerPunishmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPlayerPunishmentsRequest,
      mruv.punishments.Punishments.WatchPlayerPunishmentsResponse> getWatchPlayerPunishmentsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPlayerPunishmentsRequest, mruv.punishments.Punishments.WatchPlayerPunishmentsResponse> getWatchPlayerPunishmentsMethod;
    if ((getWatchPlayerPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerPunishmentsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchPlayerPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerPunishmentsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchPlayerPunishmentsMethod = getWatchPlayerPunishmentsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchPlayerPunishmentsRequest, mruv.punishments.Punishments.WatchPlayerPunishmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPlayerPunishments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchPlayerPunishmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchPlayerPunishmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchPlayerPunishments"))
              .build();
        }
      }
    }
    return getWatchPlayerPunishmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPlayerAcquittalsRequest,
      mruv.punishments.Punishments.WatchPlayerAcquittalsResponse> getWatchPlayerAcquittalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPlayerAcquittals",
      requestType = mruv.punishments.Punishments.WatchPlayerAcquittalsRequest.class,
      responseType = mruv.punishments.Punishments.WatchPlayerAcquittalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPlayerAcquittalsRequest,
      mruv.punishments.Punishments.WatchPlayerAcquittalsResponse> getWatchPlayerAcquittalsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPlayerAcquittalsRequest, mruv.punishments.Punishments.WatchPlayerAcquittalsResponse> getWatchPlayerAcquittalsMethod;
    if ((getWatchPlayerAcquittalsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerAcquittalsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchPlayerAcquittalsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerAcquittalsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchPlayerAcquittalsMethod = getWatchPlayerAcquittalsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchPlayerAcquittalsRequest, mruv.punishments.Punishments.WatchPlayerAcquittalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPlayerAcquittals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchPlayerAcquittalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchPlayerAcquittalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchPlayerAcquittals"))
              .build();
        }
      }
    }
    return getWatchPlayerAcquittalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPunishmentsRequest,
      mruv.punishments.Punishments.WatchPunishmentsResponse> getWatchPunishmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPunishments",
      requestType = mruv.punishments.Punishments.WatchPunishmentsRequest.class,
      responseType = mruv.punishments.Punishments.WatchPunishmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPunishmentsRequest,
      mruv.punishments.Punishments.WatchPunishmentsResponse> getWatchPunishmentsMethod() {
    io.grpc.MethodDescriptor<mruv.punishments.Punishments.WatchPunishmentsRequest, mruv.punishments.Punishments.WatchPunishmentsResponse> getWatchPunishmentsMethod;
    if ((getWatchPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPunishmentsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPunishmentsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchPunishmentsMethod = getWatchPunishmentsMethod =
              io.grpc.MethodDescriptor.<mruv.punishments.Punishments.WatchPunishmentsRequest, mruv.punishments.Punishments.WatchPunishmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPunishments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchPunishmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.punishments.Punishments.WatchPunishmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchPunishments"))
              .build();
        }
      }
    }
    return getWatchPunishmentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVPunishmentsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVPunishmentsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVPunishmentsServiceStub>() {
        @java.lang.Override
        public MruVPunishmentsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVPunishmentsServiceStub(channel, callOptions);
        }
      };
    return MruVPunishmentsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVPunishmentsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVPunishmentsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVPunishmentsServiceBlockingStub>() {
        @java.lang.Override
        public MruVPunishmentsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVPunishmentsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVPunishmentsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVPunishmentsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVPunishmentsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVPunishmentsServiceFutureStub>() {
        @java.lang.Override
        public MruVPunishmentsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVPunishmentsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVPunishmentsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * This service provides interface for managing punishments for players.
   * </pre>
   */
  public static abstract class MruVPunishmentsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ban player on account and/or ip.
     * If ban_time is 0, ban will never expire.
     * </pre>
     */
    public void ban(mruv.punishments.Punishments.BanRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public void block(mruv.punishments.Punishments.BlockRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public void warn(mruv.punishments.Punishments.WarnRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWarnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public void adminJail(mruv.punishments.Punishments.AdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.AdminJailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminJailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public void muteGlobalChats(mruv.punishments.Punishments.MuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.MuteGlobalChatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMuteGlobalChatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public void unBan(mruv.punishments.Punishments.UnBanRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public void unBlock(mruv.punishments.Punishments.UnBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public void unWarn(mruv.punishments.Punishments.UnWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnWarnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnWarnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public void unAdminJail(mruv.punishments.Punishments.UnAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnAdminJailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnAdminJailMethod(), responseObserver);
    }

    /**
     */
    public void unMuteGlobalChats(mruv.punishments.Punishments.UnMuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnMuteGlobalChatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnMuteGlobalChatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public void getPlayerBans(mruv.punishments.Punishments.GetPlayerBansRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerBansResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public void getPlayerWarns(mruv.punishments.Punishments.GetPlayerWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerWarnsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerWarnsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public void getPlayerAdminJail(mruv.punishments.Punishments.GetPlayerAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerAdminJailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerAdminJailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public void getBan(mruv.punishments.Punishments.GetBanRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public void getWarn(mruv.punishments.Punishments.GetWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWarnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public void getBlock(mruv.punishments.Punishments.GetBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public void isPlayerBanned(mruv.punishments.Punishments.IsPlayerBannedRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsPlayerBannedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsPlayerBannedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public void isCharacterBlocked(mruv.punishments.Punishments.IsCharacterBlockedRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsCharacterBlockedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsCharacterBlockedMethod(), responseObserver);
    }

    /**
     */
    public void isCharacterJailed(mruv.punishments.Punishments.IsCharacterJailedRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsCharacterJailedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsCharacterJailedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to ban events.
     * </pre>
     */
    public void watchBans(mruv.punishments.Punishments.WatchBansRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to block events.
     * </pre>
     */
    public void watchBlocks(mruv.punishments.Punishments.WatchBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to warn events.
     * </pre>
     */
    public void watchWarns(mruv.punishments.Punishments.WatchWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchWarnsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail events.
     * </pre>
     */
    public void watchAdminJails(mruv.punishments.Punishments.WatchAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.AdminJailMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchAdminJailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unban events.
     * </pre>
     */
    public void watchUnBans(mruv.punishments.Punishments.WatchUnBansRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBanMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unblock events.
     * </pre>
     */
    public void watchUnBlocks(mruv.punishments.Punishments.WatchUnBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBlockMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unwarn events.
     * </pre>
     */
    public void watchUnWarns(mruv.punishments.Punishments.WatchUnWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnWarnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnWarnsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail release events.
     * </pre>
     */
    public void watchUnAdminJails(mruv.punishments.Punishments.WatchUnAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnAdminJailMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnAdminJailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player punishments.
     * </pre>
     */
    public void watchPlayerPunishments(mruv.punishments.Punishments.WatchPlayerPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPlayerPunishmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPlayerPunishmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player acquittals.
     * </pre>
     */
    public void watchPlayerAcquittals(mruv.punishments.Punishments.WatchPlayerAcquittalsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPlayerAcquittalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPlayerAcquittalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to all punishments and acquittals events.
     * </pre>
     */
    public void watchPunishments(mruv.punishments.Punishments.WatchPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPunishmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPunishmentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.BanRequest,
                mruv.punishments.Punishments.BanResponse>(
                  this, METHODID_BAN)))
          .addMethod(
            getBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.BlockRequest,
                mruv.punishments.Punishments.BlockResponse>(
                  this, METHODID_BLOCK)))
          .addMethod(
            getWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WarnRequest,
                mruv.punishments.Punishments.WarnResponse>(
                  this, METHODID_WARN)))
          .addMethod(
            getAdminJailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.AdminJailRequest,
                mruv.punishments.Punishments.AdminJailResponse>(
                  this, METHODID_ADMIN_JAIL)))
          .addMethod(
            getMuteGlobalChatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.MuteGlobalChatsRequest,
                mruv.punishments.Punishments.MuteGlobalChatsResponse>(
                  this, METHODID_MUTE_GLOBAL_CHATS)))
          .addMethod(
            getUnBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.UnBanRequest,
                mruv.punishments.Punishments.UnBanResponse>(
                  this, METHODID_UN_BAN)))
          .addMethod(
            getUnBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.UnBlockRequest,
                mruv.punishments.Punishments.UnBlockResponse>(
                  this, METHODID_UN_BLOCK)))
          .addMethod(
            getUnWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.UnWarnRequest,
                mruv.punishments.Punishments.UnWarnResponse>(
                  this, METHODID_UN_WARN)))
          .addMethod(
            getUnAdminJailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.UnAdminJailRequest,
                mruv.punishments.Punishments.UnAdminJailResponse>(
                  this, METHODID_UN_ADMIN_JAIL)))
          .addMethod(
            getUnMuteGlobalChatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.UnMuteGlobalChatsRequest,
                mruv.punishments.Punishments.UnMuteGlobalChatsResponse>(
                  this, METHODID_UN_MUTE_GLOBAL_CHATS)))
          .addMethod(
            getGetPlayerBansMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.GetPlayerBansRequest,
                mruv.punishments.Punishments.GetPlayerBansResponse>(
                  this, METHODID_GET_PLAYER_BANS)))
          .addMethod(
            getGetPlayerWarnsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.GetPlayerWarnsRequest,
                mruv.punishments.Punishments.GetPlayerWarnsResponse>(
                  this, METHODID_GET_PLAYER_WARNS)))
          .addMethod(
            getGetPlayerAdminJailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.GetPlayerAdminJailRequest,
                mruv.punishments.Punishments.GetPlayerAdminJailResponse>(
                  this, METHODID_GET_PLAYER_ADMIN_JAIL)))
          .addMethod(
            getGetBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.GetBanRequest,
                mruv.punishments.Punishments.BanMessage>(
                  this, METHODID_GET_BAN)))
          .addMethod(
            getGetWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.GetWarnRequest,
                mruv.punishments.Punishments.WarnMessage>(
                  this, METHODID_GET_WARN)))
          .addMethod(
            getGetBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.GetBlockRequest,
                mruv.punishments.Punishments.BlockMessage>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            getIsPlayerBannedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.IsPlayerBannedRequest,
                mruv.punishments.Punishments.IsPlayerBannedResponse>(
                  this, METHODID_IS_PLAYER_BANNED)))
          .addMethod(
            getIsCharacterBlockedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.IsCharacterBlockedRequest,
                mruv.punishments.Punishments.IsCharacterBlockedResponse>(
                  this, METHODID_IS_CHARACTER_BLOCKED)))
          .addMethod(
            getIsCharacterJailedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.punishments.Punishments.IsCharacterJailedRequest,
                mruv.punishments.Punishments.IsCharacterJailedResponse>(
                  this, METHODID_IS_CHARACTER_JAILED)))
          .addMethod(
            getWatchBansMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchBansRequest,
                mruv.punishments.Punishments.BanMessage>(
                  this, METHODID_WATCH_BANS)))
          .addMethod(
            getWatchBlocksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchBlocksRequest,
                mruv.punishments.Punishments.BlockMessage>(
                  this, METHODID_WATCH_BLOCKS)))
          .addMethod(
            getWatchWarnsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchWarnsRequest,
                mruv.punishments.Punishments.WarnMessage>(
                  this, METHODID_WATCH_WARNS)))
          .addMethod(
            getWatchAdminJailsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchAdminJailsRequest,
                mruv.punishments.Punishments.AdminJailMessage>(
                  this, METHODID_WATCH_ADMIN_JAILS)))
          .addMethod(
            getWatchUnBansMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchUnBansRequest,
                mruv.punishments.Punishments.UnBanMessage>(
                  this, METHODID_WATCH_UN_BANS)))
          .addMethod(
            getWatchUnBlocksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchUnBlocksRequest,
                mruv.punishments.Punishments.UnBlockMessage>(
                  this, METHODID_WATCH_UN_BLOCKS)))
          .addMethod(
            getWatchUnWarnsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchUnWarnsRequest,
                mruv.punishments.Punishments.UnWarnMessage>(
                  this, METHODID_WATCH_UN_WARNS)))
          .addMethod(
            getWatchUnAdminJailsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchUnAdminJailsRequest,
                mruv.punishments.Punishments.UnAdminJailMessage>(
                  this, METHODID_WATCH_UN_ADMIN_JAILS)))
          .addMethod(
            getWatchPlayerPunishmentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchPlayerPunishmentsRequest,
                mruv.punishments.Punishments.WatchPlayerPunishmentsResponse>(
                  this, METHODID_WATCH_PLAYER_PUNISHMENTS)))
          .addMethod(
            getWatchPlayerAcquittalsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchPlayerAcquittalsRequest,
                mruv.punishments.Punishments.WatchPlayerAcquittalsResponse>(
                  this, METHODID_WATCH_PLAYER_ACQUITTALS)))
          .addMethod(
            getWatchPunishmentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.punishments.Punishments.WatchPunishmentsRequest,
                mruv.punishments.Punishments.WatchPunishmentsResponse>(
                  this, METHODID_WATCH_PUNISHMENTS)))
          .build();
    }
  }

  /**
   * <pre>
   * This service provides interface for managing punishments for players.
   * </pre>
   */
  public static final class MruVPunishmentsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVPunishmentsServiceStub> {
    private MruVPunishmentsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVPunishmentsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVPunishmentsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ban player on account and/or ip.
     * If ban_time is 0, ban will never expire.
     * </pre>
     */
    public void ban(mruv.punishments.Punishments.BanRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public void block(mruv.punishments.Punishments.BlockRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public void warn(mruv.punishments.Punishments.WarnRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public void adminJail(mruv.punishments.Punishments.AdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.AdminJailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminJailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public void muteGlobalChats(mruv.punishments.Punishments.MuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.MuteGlobalChatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMuteGlobalChatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public void unBan(mruv.punishments.Punishments.UnBanRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public void unBlock(mruv.punishments.Punishments.UnBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public void unWarn(mruv.punishments.Punishments.UnWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnWarnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public void unAdminJail(mruv.punishments.Punishments.UnAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnAdminJailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnAdminJailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unMuteGlobalChats(mruv.punishments.Punishments.UnMuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnMuteGlobalChatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnMuteGlobalChatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public void getPlayerBans(mruv.punishments.Punishments.GetPlayerBansRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerBansResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public void getPlayerWarns(mruv.punishments.Punishments.GetPlayerWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerWarnsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerWarnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public void getPlayerAdminJail(mruv.punishments.Punishments.GetPlayerAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerAdminJailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerAdminJailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public void getBan(mruv.punishments.Punishments.GetBanRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public void getWarn(mruv.punishments.Punishments.GetWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public void getBlock(mruv.punishments.Punishments.GetBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public void isPlayerBanned(mruv.punishments.Punishments.IsPlayerBannedRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsPlayerBannedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsPlayerBannedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public void isCharacterBlocked(mruv.punishments.Punishments.IsCharacterBlockedRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsCharacterBlockedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsCharacterBlockedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isCharacterJailed(mruv.punishments.Punishments.IsCharacterJailedRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsCharacterJailedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsCharacterJailedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to ban events.
     * </pre>
     */
    public void watchBans(mruv.punishments.Punishments.WatchBansRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to block events.
     * </pre>
     */
    public void watchBlocks(mruv.punishments.Punishments.WatchBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to warn events.
     * </pre>
     */
    public void watchWarns(mruv.punishments.Punishments.WatchWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchWarnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail events.
     * </pre>
     */
    public void watchAdminJails(mruv.punishments.Punishments.WatchAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.AdminJailMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchAdminJailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unban events.
     * </pre>
     */
    public void watchUnBans(mruv.punishments.Punishments.WatchUnBansRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBanMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unblock events.
     * </pre>
     */
    public void watchUnBlocks(mruv.punishments.Punishments.WatchUnBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBlockMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unwarn events.
     * </pre>
     */
    public void watchUnWarns(mruv.punishments.Punishments.WatchUnWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnWarnMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnWarnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail release events.
     * </pre>
     */
    public void watchUnAdminJails(mruv.punishments.Punishments.WatchUnAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnAdminJailMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnAdminJailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player punishments.
     * </pre>
     */
    public void watchPlayerPunishments(mruv.punishments.Punishments.WatchPlayerPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPlayerPunishmentsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchPlayerPunishmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player acquittals.
     * </pre>
     */
    public void watchPlayerAcquittals(mruv.punishments.Punishments.WatchPlayerAcquittalsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPlayerAcquittalsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchPlayerAcquittalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to all punishments and acquittals events.
     * </pre>
     */
    public void watchPunishments(mruv.punishments.Punishments.WatchPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPunishmentsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchPunishmentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * This service provides interface for managing punishments for players.
   * </pre>
   */
  public static final class MruVPunishmentsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVPunishmentsServiceBlockingStub> {
    private MruVPunishmentsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVPunishmentsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVPunishmentsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ban player on account and/or ip.
     * If ban_time is 0, ban will never expire.
     * </pre>
     */
    public mruv.punishments.Punishments.BanResponse ban(mruv.punishments.Punishments.BanRequest request) {
      return blockingUnaryCall(
          getChannel(), getBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public mruv.punishments.Punishments.BlockResponse block(mruv.punishments.Punishments.BlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public mruv.punishments.Punishments.WarnResponse warn(mruv.punishments.Punishments.WarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getWarnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public mruv.punishments.Punishments.AdminJailResponse adminJail(mruv.punishments.Punishments.AdminJailRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminJailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public mruv.punishments.Punishments.MuteGlobalChatsResponse muteGlobalChats(mruv.punishments.Punishments.MuteGlobalChatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMuteGlobalChatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public mruv.punishments.Punishments.UnBanResponse unBan(mruv.punishments.Punishments.UnBanRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public mruv.punishments.Punishments.UnBlockResponse unBlock(mruv.punishments.Punishments.UnBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public mruv.punishments.Punishments.UnWarnResponse unWarn(mruv.punishments.Punishments.UnWarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnWarnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public mruv.punishments.Punishments.UnAdminJailResponse unAdminJail(mruv.punishments.Punishments.UnAdminJailRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnAdminJailMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.punishments.Punishments.UnMuteGlobalChatsResponse unMuteGlobalChats(mruv.punishments.Punishments.UnMuteGlobalChatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnMuteGlobalChatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public mruv.punishments.Punishments.GetPlayerBansResponse getPlayerBans(mruv.punishments.Punishments.GetPlayerBansRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public mruv.punishments.Punishments.GetPlayerWarnsResponse getPlayerWarns(mruv.punishments.Punishments.GetPlayerWarnsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerWarnsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public mruv.punishments.Punishments.GetPlayerAdminJailResponse getPlayerAdminJail(mruv.punishments.Punishments.GetPlayerAdminJailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerAdminJailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public mruv.punishments.Punishments.BanMessage getBan(mruv.punishments.Punishments.GetBanRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public mruv.punishments.Punishments.WarnMessage getWarn(mruv.punishments.Punishments.GetWarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWarnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public mruv.punishments.Punishments.BlockMessage getBlock(mruv.punishments.Punishments.GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public mruv.punishments.Punishments.IsPlayerBannedResponse isPlayerBanned(mruv.punishments.Punishments.IsPlayerBannedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsPlayerBannedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public mruv.punishments.Punishments.IsCharacterBlockedResponse isCharacterBlocked(mruv.punishments.Punishments.IsCharacterBlockedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsCharacterBlockedMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.punishments.Punishments.IsCharacterJailedResponse isCharacterJailed(mruv.punishments.Punishments.IsCharacterJailedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsCharacterJailedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to ban events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.BanMessage> watchBans(
        mruv.punishments.Punishments.WatchBansRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to block events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.BlockMessage> watchBlocks(
        mruv.punishments.Punishments.WatchBlocksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to warn events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.WarnMessage> watchWarns(
        mruv.punishments.Punishments.WatchWarnsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchWarnsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to admin jail events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.AdminJailMessage> watchAdminJails(
        mruv.punishments.Punishments.WatchAdminJailsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchAdminJailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to unban events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.UnBanMessage> watchUnBans(
        mruv.punishments.Punishments.WatchUnBansRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to unblock events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.UnBlockMessage> watchUnBlocks(
        mruv.punishments.Punishments.WatchUnBlocksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to unwarn events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.UnWarnMessage> watchUnWarns(
        mruv.punishments.Punishments.WatchUnWarnsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnWarnsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to admin jail release events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.UnAdminJailMessage> watchUnAdminJails(
        mruv.punishments.Punishments.WatchUnAdminJailsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnAdminJailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to player punishments.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.WatchPlayerPunishmentsResponse> watchPlayerPunishments(
        mruv.punishments.Punishments.WatchPlayerPunishmentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchPlayerPunishmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to player acquittals.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.WatchPlayerAcquittalsResponse> watchPlayerAcquittals(
        mruv.punishments.Punishments.WatchPlayerAcquittalsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchPlayerAcquittalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to all punishments and acquittals events.
     * </pre>
     */
    public java.util.Iterator<mruv.punishments.Punishments.WatchPunishmentsResponse> watchPunishments(
        mruv.punishments.Punishments.WatchPunishmentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchPunishmentsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * This service provides interface for managing punishments for players.
   * </pre>
   */
  public static final class MruVPunishmentsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVPunishmentsServiceFutureStub> {
    private MruVPunishmentsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVPunishmentsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVPunishmentsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ban player on account and/or ip.
     * If ban_time is 0, ban will never expire.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.BanResponse> ban(
        mruv.punishments.Punishments.BanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.BlockResponse> block(
        mruv.punishments.Punishments.BlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.WarnResponse> warn(
        mruv.punishments.Punishments.WarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWarnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.AdminJailResponse> adminJail(
        mruv.punishments.Punishments.AdminJailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminJailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.MuteGlobalChatsResponse> muteGlobalChats(
        mruv.punishments.Punishments.MuteGlobalChatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMuteGlobalChatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.UnBanResponse> unBan(
        mruv.punishments.Punishments.UnBanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.UnBlockResponse> unBlock(
        mruv.punishments.Punishments.UnBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.UnWarnResponse> unWarn(
        mruv.punishments.Punishments.UnWarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnWarnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.UnAdminJailResponse> unAdminJail(
        mruv.punishments.Punishments.UnAdminJailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnAdminJailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.UnMuteGlobalChatsResponse> unMuteGlobalChats(
        mruv.punishments.Punishments.UnMuteGlobalChatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnMuteGlobalChatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.GetPlayerBansResponse> getPlayerBans(
        mruv.punishments.Punishments.GetPlayerBansRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerBansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.GetPlayerWarnsResponse> getPlayerWarns(
        mruv.punishments.Punishments.GetPlayerWarnsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerWarnsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.GetPlayerAdminJailResponse> getPlayerAdminJail(
        mruv.punishments.Punishments.GetPlayerAdminJailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerAdminJailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.BanMessage> getBan(
        mruv.punishments.Punishments.GetBanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.WarnMessage> getWarn(
        mruv.punishments.Punishments.GetWarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWarnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.BlockMessage> getBlock(
        mruv.punishments.Punishments.GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.IsPlayerBannedResponse> isPlayerBanned(
        mruv.punishments.Punishments.IsPlayerBannedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsPlayerBannedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.IsCharacterBlockedResponse> isCharacterBlocked(
        mruv.punishments.Punishments.IsCharacterBlockedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsCharacterBlockedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.punishments.Punishments.IsCharacterJailedResponse> isCharacterJailed(
        mruv.punishments.Punishments.IsCharacterJailedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsCharacterJailedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BAN = 0;
  private static final int METHODID_BLOCK = 1;
  private static final int METHODID_WARN = 2;
  private static final int METHODID_ADMIN_JAIL = 3;
  private static final int METHODID_MUTE_GLOBAL_CHATS = 4;
  private static final int METHODID_UN_BAN = 5;
  private static final int METHODID_UN_BLOCK = 6;
  private static final int METHODID_UN_WARN = 7;
  private static final int METHODID_UN_ADMIN_JAIL = 8;
  private static final int METHODID_UN_MUTE_GLOBAL_CHATS = 9;
  private static final int METHODID_GET_PLAYER_BANS = 10;
  private static final int METHODID_GET_PLAYER_WARNS = 11;
  private static final int METHODID_GET_PLAYER_ADMIN_JAIL = 12;
  private static final int METHODID_GET_BAN = 13;
  private static final int METHODID_GET_WARN = 14;
  private static final int METHODID_GET_BLOCK = 15;
  private static final int METHODID_IS_PLAYER_BANNED = 16;
  private static final int METHODID_IS_CHARACTER_BLOCKED = 17;
  private static final int METHODID_IS_CHARACTER_JAILED = 18;
  private static final int METHODID_WATCH_BANS = 19;
  private static final int METHODID_WATCH_BLOCKS = 20;
  private static final int METHODID_WATCH_WARNS = 21;
  private static final int METHODID_WATCH_ADMIN_JAILS = 22;
  private static final int METHODID_WATCH_UN_BANS = 23;
  private static final int METHODID_WATCH_UN_BLOCKS = 24;
  private static final int METHODID_WATCH_UN_WARNS = 25;
  private static final int METHODID_WATCH_UN_ADMIN_JAILS = 26;
  private static final int METHODID_WATCH_PLAYER_PUNISHMENTS = 27;
  private static final int METHODID_WATCH_PLAYER_ACQUITTALS = 28;
  private static final int METHODID_WATCH_PUNISHMENTS = 29;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVPunishmentsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVPunishmentsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BAN:
          serviceImpl.ban((mruv.punishments.Punishments.BanRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanResponse>) responseObserver);
          break;
        case METHODID_BLOCK:
          serviceImpl.block((mruv.punishments.Punishments.BlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockResponse>) responseObserver);
          break;
        case METHODID_WARN:
          serviceImpl.warn((mruv.punishments.Punishments.WarnRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnResponse>) responseObserver);
          break;
        case METHODID_ADMIN_JAIL:
          serviceImpl.adminJail((mruv.punishments.Punishments.AdminJailRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.AdminJailResponse>) responseObserver);
          break;
        case METHODID_MUTE_GLOBAL_CHATS:
          serviceImpl.muteGlobalChats((mruv.punishments.Punishments.MuteGlobalChatsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.MuteGlobalChatsResponse>) responseObserver);
          break;
        case METHODID_UN_BAN:
          serviceImpl.unBan((mruv.punishments.Punishments.UnBanRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBanResponse>) responseObserver);
          break;
        case METHODID_UN_BLOCK:
          serviceImpl.unBlock((mruv.punishments.Punishments.UnBlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBlockResponse>) responseObserver);
          break;
        case METHODID_UN_WARN:
          serviceImpl.unWarn((mruv.punishments.Punishments.UnWarnRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnWarnResponse>) responseObserver);
          break;
        case METHODID_UN_ADMIN_JAIL:
          serviceImpl.unAdminJail((mruv.punishments.Punishments.UnAdminJailRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnAdminJailResponse>) responseObserver);
          break;
        case METHODID_UN_MUTE_GLOBAL_CHATS:
          serviceImpl.unMuteGlobalChats((mruv.punishments.Punishments.UnMuteGlobalChatsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnMuteGlobalChatsResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_BANS:
          serviceImpl.getPlayerBans((mruv.punishments.Punishments.GetPlayerBansRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerBansResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_WARNS:
          serviceImpl.getPlayerWarns((mruv.punishments.Punishments.GetPlayerWarnsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerWarnsResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_ADMIN_JAIL:
          serviceImpl.getPlayerAdminJail((mruv.punishments.Punishments.GetPlayerAdminJailRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.GetPlayerAdminJailResponse>) responseObserver);
          break;
        case METHODID_GET_BAN:
          serviceImpl.getBan((mruv.punishments.Punishments.GetBanRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanMessage>) responseObserver);
          break;
        case METHODID_GET_WARN:
          serviceImpl.getWarn((mruv.punishments.Punishments.GetWarnRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnMessage>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((mruv.punishments.Punishments.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockMessage>) responseObserver);
          break;
        case METHODID_IS_PLAYER_BANNED:
          serviceImpl.isPlayerBanned((mruv.punishments.Punishments.IsPlayerBannedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsPlayerBannedResponse>) responseObserver);
          break;
        case METHODID_IS_CHARACTER_BLOCKED:
          serviceImpl.isCharacterBlocked((mruv.punishments.Punishments.IsCharacterBlockedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsCharacterBlockedResponse>) responseObserver);
          break;
        case METHODID_IS_CHARACTER_JAILED:
          serviceImpl.isCharacterJailed((mruv.punishments.Punishments.IsCharacterJailedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.IsCharacterJailedResponse>) responseObserver);
          break;
        case METHODID_WATCH_BANS:
          serviceImpl.watchBans((mruv.punishments.Punishments.WatchBansRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BanMessage>) responseObserver);
          break;
        case METHODID_WATCH_BLOCKS:
          serviceImpl.watchBlocks((mruv.punishments.Punishments.WatchBlocksRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.BlockMessage>) responseObserver);
          break;
        case METHODID_WATCH_WARNS:
          serviceImpl.watchWarns((mruv.punishments.Punishments.WatchWarnsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WarnMessage>) responseObserver);
          break;
        case METHODID_WATCH_ADMIN_JAILS:
          serviceImpl.watchAdminJails((mruv.punishments.Punishments.WatchAdminJailsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.AdminJailMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_BANS:
          serviceImpl.watchUnBans((mruv.punishments.Punishments.WatchUnBansRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBanMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_BLOCKS:
          serviceImpl.watchUnBlocks((mruv.punishments.Punishments.WatchUnBlocksRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnBlockMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_WARNS:
          serviceImpl.watchUnWarns((mruv.punishments.Punishments.WatchUnWarnsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnWarnMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_ADMIN_JAILS:
          serviceImpl.watchUnAdminJails((mruv.punishments.Punishments.WatchUnAdminJailsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.UnAdminJailMessage>) responseObserver);
          break;
        case METHODID_WATCH_PLAYER_PUNISHMENTS:
          serviceImpl.watchPlayerPunishments((mruv.punishments.Punishments.WatchPlayerPunishmentsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPlayerPunishmentsResponse>) responseObserver);
          break;
        case METHODID_WATCH_PLAYER_ACQUITTALS:
          serviceImpl.watchPlayerAcquittals((mruv.punishments.Punishments.WatchPlayerAcquittalsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPlayerAcquittalsResponse>) responseObserver);
          break;
        case METHODID_WATCH_PUNISHMENTS:
          serviceImpl.watchPunishments((mruv.punishments.Punishments.WatchPunishmentsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.punishments.Punishments.WatchPunishmentsResponse>) responseObserver);
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

  private static abstract class MruVPunishmentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVPunishmentsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.punishments.Punishments.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVPunishmentsService");
    }
  }

  private static final class MruVPunishmentsServiceFileDescriptorSupplier
      extends MruVPunishmentsServiceBaseDescriptorSupplier {
    MruVPunishmentsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVPunishmentsServiceMethodDescriptorSupplier
      extends MruVPunishmentsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVPunishmentsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVPunishmentsServiceFileDescriptorSupplier())
              .addMethod(getBanMethod())
              .addMethod(getBlockMethod())
              .addMethod(getWarnMethod())
              .addMethod(getAdminJailMethod())
              .addMethod(getMuteGlobalChatsMethod())
              .addMethod(getUnBanMethod())
              .addMethod(getUnBlockMethod())
              .addMethod(getUnWarnMethod())
              .addMethod(getUnAdminJailMethod())
              .addMethod(getUnMuteGlobalChatsMethod())
              .addMethod(getGetPlayerBansMethod())
              .addMethod(getGetPlayerWarnsMethod())
              .addMethod(getGetPlayerAdminJailMethod())
              .addMethod(getGetBanMethod())
              .addMethod(getGetWarnMethod())
              .addMethod(getGetBlockMethod())
              .addMethod(getIsPlayerBannedMethod())
              .addMethod(getIsCharacterBlockedMethod())
              .addMethod(getIsCharacterJailedMethod())
              .addMethod(getWatchBansMethod())
              .addMethod(getWatchBlocksMethod())
              .addMethod(getWatchWarnsMethod())
              .addMethod(getWatchAdminJailsMethod())
              .addMethod(getWatchUnBansMethod())
              .addMethod(getWatchUnBlocksMethod())
              .addMethod(getWatchUnWarnsMethod())
              .addMethod(getWatchUnAdminJailsMethod())
              .addMethod(getWatchPlayerPunishmentsMethod())
              .addMethod(getWatchPlayerAcquittalsMethod())
              .addMethod(getWatchPunishmentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
