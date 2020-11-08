package mruv.economy;

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

  public static final String SERVICE_NAME = "mruv.economy.MruVPunishmentsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.BanRequest,
      mruv.economy.Punishments.BanResponse> getBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ban",
      requestType = mruv.economy.Punishments.BanRequest.class,
      responseType = mruv.economy.Punishments.BanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.BanRequest,
      mruv.economy.Punishments.BanResponse> getBanMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.BanRequest, mruv.economy.Punishments.BanResponse> getBanMethod;
    if ((getBanMethod = MruVPunishmentsServiceGrpc.getBanMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getBanMethod = MruVPunishmentsServiceGrpc.getBanMethod) == null) {
          MruVPunishmentsServiceGrpc.getBanMethod = getBanMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.BanRequest, mruv.economy.Punishments.BanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ban"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("Ban"))
              .build();
        }
      }
    }
    return getBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.BlockRequest,
      mruv.economy.Punishments.BlockResponse> getBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Block",
      requestType = mruv.economy.Punishments.BlockRequest.class,
      responseType = mruv.economy.Punishments.BlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.BlockRequest,
      mruv.economy.Punishments.BlockResponse> getBlockMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.BlockRequest, mruv.economy.Punishments.BlockResponse> getBlockMethod;
    if ((getBlockMethod = MruVPunishmentsServiceGrpc.getBlockMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getBlockMethod = MruVPunishmentsServiceGrpc.getBlockMethod) == null) {
          MruVPunishmentsServiceGrpc.getBlockMethod = getBlockMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.BlockRequest, mruv.economy.Punishments.BlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Block"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("Block"))
              .build();
        }
      }
    }
    return getBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WarnRequest,
      mruv.economy.Punishments.WarnResponse> getWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Warn",
      requestType = mruv.economy.Punishments.WarnRequest.class,
      responseType = mruv.economy.Punishments.WarnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WarnRequest,
      mruv.economy.Punishments.WarnResponse> getWarnMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WarnRequest, mruv.economy.Punishments.WarnResponse> getWarnMethod;
    if ((getWarnMethod = MruVPunishmentsServiceGrpc.getWarnMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWarnMethod = MruVPunishmentsServiceGrpc.getWarnMethod) == null) {
          MruVPunishmentsServiceGrpc.getWarnMethod = getWarnMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WarnRequest, mruv.economy.Punishments.WarnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Warn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WarnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("Warn"))
              .build();
        }
      }
    }
    return getWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.AdminJailRequest,
      mruv.economy.Punishments.AdminJailResponse> getAdminJailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdminJail",
      requestType = mruv.economy.Punishments.AdminJailRequest.class,
      responseType = mruv.economy.Punishments.AdminJailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.AdminJailRequest,
      mruv.economy.Punishments.AdminJailResponse> getAdminJailMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.AdminJailRequest, mruv.economy.Punishments.AdminJailResponse> getAdminJailMethod;
    if ((getAdminJailMethod = MruVPunishmentsServiceGrpc.getAdminJailMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getAdminJailMethod = MruVPunishmentsServiceGrpc.getAdminJailMethod) == null) {
          MruVPunishmentsServiceGrpc.getAdminJailMethod = getAdminJailMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.AdminJailRequest, mruv.economy.Punishments.AdminJailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AdminJail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.AdminJailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.AdminJailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("AdminJail"))
              .build();
        }
      }
    }
    return getAdminJailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.MuteGlobalChatsRequest,
      mruv.economy.Punishments.MuteGlobalChatsResponse> getMuteGlobalChatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MuteGlobalChats",
      requestType = mruv.economy.Punishments.MuteGlobalChatsRequest.class,
      responseType = mruv.economy.Punishments.MuteGlobalChatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.MuteGlobalChatsRequest,
      mruv.economy.Punishments.MuteGlobalChatsResponse> getMuteGlobalChatsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.MuteGlobalChatsRequest, mruv.economy.Punishments.MuteGlobalChatsResponse> getMuteGlobalChatsMethod;
    if ((getMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getMuteGlobalChatsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getMuteGlobalChatsMethod) == null) {
          MruVPunishmentsServiceGrpc.getMuteGlobalChatsMethod = getMuteGlobalChatsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.MuteGlobalChatsRequest, mruv.economy.Punishments.MuteGlobalChatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MuteGlobalChats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.MuteGlobalChatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.MuteGlobalChatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("MuteGlobalChats"))
              .build();
        }
      }
    }
    return getMuteGlobalChatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.UnBanRequest,
      mruv.economy.Punishments.UnBanResponse> getUnBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnBan",
      requestType = mruv.economy.Punishments.UnBanRequest.class,
      responseType = mruv.economy.Punishments.UnBanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.UnBanRequest,
      mruv.economy.Punishments.UnBanResponse> getUnBanMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.UnBanRequest, mruv.economy.Punishments.UnBanResponse> getUnBanMethod;
    if ((getUnBanMethod = MruVPunishmentsServiceGrpc.getUnBanMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnBanMethod = MruVPunishmentsServiceGrpc.getUnBanMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnBanMethod = getUnBanMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.UnBanRequest, mruv.economy.Punishments.UnBanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnBan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnBanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnBanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnBan"))
              .build();
        }
      }
    }
    return getUnBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.UnBlockRequest,
      mruv.economy.Punishments.UnBlockResponse> getUnBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnBlock",
      requestType = mruv.economy.Punishments.UnBlockRequest.class,
      responseType = mruv.economy.Punishments.UnBlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.UnBlockRequest,
      mruv.economy.Punishments.UnBlockResponse> getUnBlockMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.UnBlockRequest, mruv.economy.Punishments.UnBlockResponse> getUnBlockMethod;
    if ((getUnBlockMethod = MruVPunishmentsServiceGrpc.getUnBlockMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnBlockMethod = MruVPunishmentsServiceGrpc.getUnBlockMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnBlockMethod = getUnBlockMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.UnBlockRequest, mruv.economy.Punishments.UnBlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnBlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnBlock"))
              .build();
        }
      }
    }
    return getUnBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.UnWarnRequest,
      mruv.economy.Punishments.UnWarnResponse> getUnWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnWarn",
      requestType = mruv.economy.Punishments.UnWarnRequest.class,
      responseType = mruv.economy.Punishments.UnWarnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.UnWarnRequest,
      mruv.economy.Punishments.UnWarnResponse> getUnWarnMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.UnWarnRequest, mruv.economy.Punishments.UnWarnResponse> getUnWarnMethod;
    if ((getUnWarnMethod = MruVPunishmentsServiceGrpc.getUnWarnMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnWarnMethod = MruVPunishmentsServiceGrpc.getUnWarnMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnWarnMethod = getUnWarnMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.UnWarnRequest, mruv.economy.Punishments.UnWarnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnWarn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnWarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnWarnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnWarn"))
              .build();
        }
      }
    }
    return getUnWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.UnAdminJailRequest,
      mruv.economy.Punishments.UnAdminJailResponse> getUnAdminJailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnAdminJail",
      requestType = mruv.economy.Punishments.UnAdminJailRequest.class,
      responseType = mruv.economy.Punishments.UnAdminJailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.UnAdminJailRequest,
      mruv.economy.Punishments.UnAdminJailResponse> getUnAdminJailMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.UnAdminJailRequest, mruv.economy.Punishments.UnAdminJailResponse> getUnAdminJailMethod;
    if ((getUnAdminJailMethod = MruVPunishmentsServiceGrpc.getUnAdminJailMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnAdminJailMethod = MruVPunishmentsServiceGrpc.getUnAdminJailMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnAdminJailMethod = getUnAdminJailMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.UnAdminJailRequest, mruv.economy.Punishments.UnAdminJailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnAdminJail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnAdminJailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnAdminJailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnAdminJail"))
              .build();
        }
      }
    }
    return getUnAdminJailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.UnMuteGlobalChatsRequest,
      mruv.economy.Punishments.UnMuteGlobalChatsResponse> getUnMuteGlobalChatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnMuteGlobalChats",
      requestType = mruv.economy.Punishments.UnMuteGlobalChatsRequest.class,
      responseType = mruv.economy.Punishments.UnMuteGlobalChatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.UnMuteGlobalChatsRequest,
      mruv.economy.Punishments.UnMuteGlobalChatsResponse> getUnMuteGlobalChatsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.UnMuteGlobalChatsRequest, mruv.economy.Punishments.UnMuteGlobalChatsResponse> getUnMuteGlobalChatsMethod;
    if ((getUnMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getUnMuteGlobalChatsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getUnMuteGlobalChatsMethod = MruVPunishmentsServiceGrpc.getUnMuteGlobalChatsMethod) == null) {
          MruVPunishmentsServiceGrpc.getUnMuteGlobalChatsMethod = getUnMuteGlobalChatsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.UnMuteGlobalChatsRequest, mruv.economy.Punishments.UnMuteGlobalChatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnMuteGlobalChats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnMuteGlobalChatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnMuteGlobalChatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("UnMuteGlobalChats"))
              .build();
        }
      }
    }
    return getUnMuteGlobalChatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerBansRequest,
      mruv.economy.Punishments.GetPlayerBansResponse> getGetPlayerBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerBans",
      requestType = mruv.economy.Punishments.GetPlayerBansRequest.class,
      responseType = mruv.economy.Punishments.GetPlayerBansResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerBansRequest,
      mruv.economy.Punishments.GetPlayerBansResponse> getGetPlayerBansMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerBansRequest, mruv.economy.Punishments.GetPlayerBansResponse> getGetPlayerBansMethod;
    if ((getGetPlayerBansMethod = MruVPunishmentsServiceGrpc.getGetPlayerBansMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetPlayerBansMethod = MruVPunishmentsServiceGrpc.getGetPlayerBansMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetPlayerBansMethod = getGetPlayerBansMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.GetPlayerBansRequest, mruv.economy.Punishments.GetPlayerBansResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetPlayerBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetPlayerBansResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetPlayerBans"))
              .build();
        }
      }
    }
    return getGetPlayerBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerWarnsRequest,
      mruv.economy.Punishments.GetPlayerWarnsResponse> getGetPlayerWarnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerWarns",
      requestType = mruv.economy.Punishments.GetPlayerWarnsRequest.class,
      responseType = mruv.economy.Punishments.GetPlayerWarnsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerWarnsRequest,
      mruv.economy.Punishments.GetPlayerWarnsResponse> getGetPlayerWarnsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerWarnsRequest, mruv.economy.Punishments.GetPlayerWarnsResponse> getGetPlayerWarnsMethod;
    if ((getGetPlayerWarnsMethod = MruVPunishmentsServiceGrpc.getGetPlayerWarnsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetPlayerWarnsMethod = MruVPunishmentsServiceGrpc.getGetPlayerWarnsMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetPlayerWarnsMethod = getGetPlayerWarnsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.GetPlayerWarnsRequest, mruv.economy.Punishments.GetPlayerWarnsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerWarns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetPlayerWarnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetPlayerWarnsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetPlayerWarns"))
              .build();
        }
      }
    }
    return getGetPlayerWarnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerAdminJailRequest,
      mruv.economy.Punishments.GetPlayerAdminJailResponse> getGetPlayerAdminJailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayerAdminJail",
      requestType = mruv.economy.Punishments.GetPlayerAdminJailRequest.class,
      responseType = mruv.economy.Punishments.GetPlayerAdminJailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerAdminJailRequest,
      mruv.economy.Punishments.GetPlayerAdminJailResponse> getGetPlayerAdminJailMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.GetPlayerAdminJailRequest, mruv.economy.Punishments.GetPlayerAdminJailResponse> getGetPlayerAdminJailMethod;
    if ((getGetPlayerAdminJailMethod = MruVPunishmentsServiceGrpc.getGetPlayerAdminJailMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetPlayerAdminJailMethod = MruVPunishmentsServiceGrpc.getGetPlayerAdminJailMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetPlayerAdminJailMethod = getGetPlayerAdminJailMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.GetPlayerAdminJailRequest, mruv.economy.Punishments.GetPlayerAdminJailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayerAdminJail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetPlayerAdminJailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetPlayerAdminJailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetPlayerAdminJail"))
              .build();
        }
      }
    }
    return getGetPlayerAdminJailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.GetBanRequest,
      mruv.economy.Punishments.BanMessage> getGetBanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBan",
      requestType = mruv.economy.Punishments.GetBanRequest.class,
      responseType = mruv.economy.Punishments.BanMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.GetBanRequest,
      mruv.economy.Punishments.BanMessage> getGetBanMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.GetBanRequest, mruv.economy.Punishments.BanMessage> getGetBanMethod;
    if ((getGetBanMethod = MruVPunishmentsServiceGrpc.getGetBanMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetBanMethod = MruVPunishmentsServiceGrpc.getGetBanMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetBanMethod = getGetBanMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.GetBanRequest, mruv.economy.Punishments.BanMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetBanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BanMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetBan"))
              .build();
        }
      }
    }
    return getGetBanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.GetWarnRequest,
      mruv.economy.Punishments.WarnMessage> getGetWarnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWarn",
      requestType = mruv.economy.Punishments.GetWarnRequest.class,
      responseType = mruv.economy.Punishments.WarnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.GetWarnRequest,
      mruv.economy.Punishments.WarnMessage> getGetWarnMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.GetWarnRequest, mruv.economy.Punishments.WarnMessage> getGetWarnMethod;
    if ((getGetWarnMethod = MruVPunishmentsServiceGrpc.getGetWarnMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetWarnMethod = MruVPunishmentsServiceGrpc.getGetWarnMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetWarnMethod = getGetWarnMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.GetWarnRequest, mruv.economy.Punishments.WarnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWarn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetWarnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WarnMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetWarn"))
              .build();
        }
      }
    }
    return getGetWarnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.GetBlockRequest,
      mruv.economy.Punishments.BlockMessage> getGetBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBlock",
      requestType = mruv.economy.Punishments.GetBlockRequest.class,
      responseType = mruv.economy.Punishments.BlockMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.GetBlockRequest,
      mruv.economy.Punishments.BlockMessage> getGetBlockMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.GetBlockRequest, mruv.economy.Punishments.BlockMessage> getGetBlockMethod;
    if ((getGetBlockMethod = MruVPunishmentsServiceGrpc.getGetBlockMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getGetBlockMethod = MruVPunishmentsServiceGrpc.getGetBlockMethod) == null) {
          MruVPunishmentsServiceGrpc.getGetBlockMethod = getGetBlockMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.GetBlockRequest, mruv.economy.Punishments.BlockMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.GetBlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BlockMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("GetBlock"))
              .build();
        }
      }
    }
    return getGetBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.IsPlayerBannedRequest,
      mruv.economy.Punishments.IsPlayerBannedResponse> getIsPlayerBannedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsPlayerBanned",
      requestType = mruv.economy.Punishments.IsPlayerBannedRequest.class,
      responseType = mruv.economy.Punishments.IsPlayerBannedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.IsPlayerBannedRequest,
      mruv.economy.Punishments.IsPlayerBannedResponse> getIsPlayerBannedMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.IsPlayerBannedRequest, mruv.economy.Punishments.IsPlayerBannedResponse> getIsPlayerBannedMethod;
    if ((getIsPlayerBannedMethod = MruVPunishmentsServiceGrpc.getIsPlayerBannedMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getIsPlayerBannedMethod = MruVPunishmentsServiceGrpc.getIsPlayerBannedMethod) == null) {
          MruVPunishmentsServiceGrpc.getIsPlayerBannedMethod = getIsPlayerBannedMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.IsPlayerBannedRequest, mruv.economy.Punishments.IsPlayerBannedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsPlayerBanned"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.IsPlayerBannedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.IsPlayerBannedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("IsPlayerBanned"))
              .build();
        }
      }
    }
    return getIsPlayerBannedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.IsCharacterBlockedRequest,
      mruv.economy.Punishments.IsCharacterBlockedResponse> getIsCharacterBlockedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsCharacterBlocked",
      requestType = mruv.economy.Punishments.IsCharacterBlockedRequest.class,
      responseType = mruv.economy.Punishments.IsCharacterBlockedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.IsCharacterBlockedRequest,
      mruv.economy.Punishments.IsCharacterBlockedResponse> getIsCharacterBlockedMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.IsCharacterBlockedRequest, mruv.economy.Punishments.IsCharacterBlockedResponse> getIsCharacterBlockedMethod;
    if ((getIsCharacterBlockedMethod = MruVPunishmentsServiceGrpc.getIsCharacterBlockedMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getIsCharacterBlockedMethod = MruVPunishmentsServiceGrpc.getIsCharacterBlockedMethod) == null) {
          MruVPunishmentsServiceGrpc.getIsCharacterBlockedMethod = getIsCharacterBlockedMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.IsCharacterBlockedRequest, mruv.economy.Punishments.IsCharacterBlockedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCharacterBlocked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.IsCharacterBlockedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.IsCharacterBlockedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("IsCharacterBlocked"))
              .build();
        }
      }
    }
    return getIsCharacterBlockedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.IsCharacterJailedRequest,
      mruv.economy.Punishments.IsCharacterJailedResponse> getIsCharacterJailedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsCharacterJailed",
      requestType = mruv.economy.Punishments.IsCharacterJailedRequest.class,
      responseType = mruv.economy.Punishments.IsCharacterJailedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.IsCharacterJailedRequest,
      mruv.economy.Punishments.IsCharacterJailedResponse> getIsCharacterJailedMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.IsCharacterJailedRequest, mruv.economy.Punishments.IsCharacterJailedResponse> getIsCharacterJailedMethod;
    if ((getIsCharacterJailedMethod = MruVPunishmentsServiceGrpc.getIsCharacterJailedMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getIsCharacterJailedMethod = MruVPunishmentsServiceGrpc.getIsCharacterJailedMethod) == null) {
          MruVPunishmentsServiceGrpc.getIsCharacterJailedMethod = getIsCharacterJailedMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.IsCharacterJailedRequest, mruv.economy.Punishments.IsCharacterJailedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsCharacterJailed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.IsCharacterJailedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.IsCharacterJailedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("IsCharacterJailed"))
              .build();
        }
      }
    }
    return getIsCharacterJailedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchBansRequest,
      mruv.economy.Punishments.BanMessage> getWatchBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchBans",
      requestType = mruv.economy.Punishments.WatchBansRequest.class,
      responseType = mruv.economy.Punishments.BanMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchBansRequest,
      mruv.economy.Punishments.BanMessage> getWatchBansMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchBansRequest, mruv.economy.Punishments.BanMessage> getWatchBansMethod;
    if ((getWatchBansMethod = MruVPunishmentsServiceGrpc.getWatchBansMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchBansMethod = MruVPunishmentsServiceGrpc.getWatchBansMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchBansMethod = getWatchBansMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchBansRequest, mruv.economy.Punishments.BanMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BanMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchBans"))
              .build();
        }
      }
    }
    return getWatchBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchBlocksRequest,
      mruv.economy.Punishments.BlockMessage> getWatchBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchBlocks",
      requestType = mruv.economy.Punishments.WatchBlocksRequest.class,
      responseType = mruv.economy.Punishments.BlockMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchBlocksRequest,
      mruv.economy.Punishments.BlockMessage> getWatchBlocksMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchBlocksRequest, mruv.economy.Punishments.BlockMessage> getWatchBlocksMethod;
    if ((getWatchBlocksMethod = MruVPunishmentsServiceGrpc.getWatchBlocksMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchBlocksMethod = MruVPunishmentsServiceGrpc.getWatchBlocksMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchBlocksMethod = getWatchBlocksMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchBlocksRequest, mruv.economy.Punishments.BlockMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.BlockMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchBlocks"))
              .build();
        }
      }
    }
    return getWatchBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchWarnsRequest,
      mruv.economy.Punishments.WarnMessage> getWatchWarnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchWarns",
      requestType = mruv.economy.Punishments.WatchWarnsRequest.class,
      responseType = mruv.economy.Punishments.WarnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchWarnsRequest,
      mruv.economy.Punishments.WarnMessage> getWatchWarnsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchWarnsRequest, mruv.economy.Punishments.WarnMessage> getWatchWarnsMethod;
    if ((getWatchWarnsMethod = MruVPunishmentsServiceGrpc.getWatchWarnsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchWarnsMethod = MruVPunishmentsServiceGrpc.getWatchWarnsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchWarnsMethod = getWatchWarnsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchWarnsRequest, mruv.economy.Punishments.WarnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchWarns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchWarnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WarnMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchWarns"))
              .build();
        }
      }
    }
    return getWatchWarnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchAdminJailsRequest,
      mruv.economy.Punishments.AdminJailMessage> getWatchAdminJailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchAdminJails",
      requestType = mruv.economy.Punishments.WatchAdminJailsRequest.class,
      responseType = mruv.economy.Punishments.AdminJailMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchAdminJailsRequest,
      mruv.economy.Punishments.AdminJailMessage> getWatchAdminJailsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchAdminJailsRequest, mruv.economy.Punishments.AdminJailMessage> getWatchAdminJailsMethod;
    if ((getWatchAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchAdminJailsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchAdminJailsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchAdminJailsMethod = getWatchAdminJailsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchAdminJailsRequest, mruv.economy.Punishments.AdminJailMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchAdminJails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchAdminJailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.AdminJailMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchAdminJails"))
              .build();
        }
      }
    }
    return getWatchAdminJailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnBansRequest,
      mruv.economy.Punishments.UnBanMessage> getWatchUnBansMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnBans",
      requestType = mruv.economy.Punishments.WatchUnBansRequest.class,
      responseType = mruv.economy.Punishments.UnBanMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnBansRequest,
      mruv.economy.Punishments.UnBanMessage> getWatchUnBansMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnBansRequest, mruv.economy.Punishments.UnBanMessage> getWatchUnBansMethod;
    if ((getWatchUnBansMethod = MruVPunishmentsServiceGrpc.getWatchUnBansMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnBansMethod = MruVPunishmentsServiceGrpc.getWatchUnBansMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnBansMethod = getWatchUnBansMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchUnBansRequest, mruv.economy.Punishments.UnBanMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnBans"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchUnBansRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnBanMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnBans"))
              .build();
        }
      }
    }
    return getWatchUnBansMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnBlocksRequest,
      mruv.economy.Punishments.UnBlockMessage> getWatchUnBlocksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnBlocks",
      requestType = mruv.economy.Punishments.WatchUnBlocksRequest.class,
      responseType = mruv.economy.Punishments.UnBlockMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnBlocksRequest,
      mruv.economy.Punishments.UnBlockMessage> getWatchUnBlocksMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnBlocksRequest, mruv.economy.Punishments.UnBlockMessage> getWatchUnBlocksMethod;
    if ((getWatchUnBlocksMethod = MruVPunishmentsServiceGrpc.getWatchUnBlocksMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnBlocksMethod = MruVPunishmentsServiceGrpc.getWatchUnBlocksMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnBlocksMethod = getWatchUnBlocksMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchUnBlocksRequest, mruv.economy.Punishments.UnBlockMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnBlocks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchUnBlocksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnBlockMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnBlocks"))
              .build();
        }
      }
    }
    return getWatchUnBlocksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnWarnsRequest,
      mruv.economy.Punishments.UnWarnMessage> getWatchUnWarnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnWarns",
      requestType = mruv.economy.Punishments.WatchUnWarnsRequest.class,
      responseType = mruv.economy.Punishments.UnWarnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnWarnsRequest,
      mruv.economy.Punishments.UnWarnMessage> getWatchUnWarnsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnWarnsRequest, mruv.economy.Punishments.UnWarnMessage> getWatchUnWarnsMethod;
    if ((getWatchUnWarnsMethod = MruVPunishmentsServiceGrpc.getWatchUnWarnsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnWarnsMethod = MruVPunishmentsServiceGrpc.getWatchUnWarnsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnWarnsMethod = getWatchUnWarnsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchUnWarnsRequest, mruv.economy.Punishments.UnWarnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnWarns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchUnWarnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnWarnMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnWarns"))
              .build();
        }
      }
    }
    return getWatchUnWarnsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnAdminJailsRequest,
      mruv.economy.Punishments.UnAdminJailMessage> getWatchUnAdminJailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchUnAdminJails",
      requestType = mruv.economy.Punishments.WatchUnAdminJailsRequest.class,
      responseType = mruv.economy.Punishments.UnAdminJailMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnAdminJailsRequest,
      mruv.economy.Punishments.UnAdminJailMessage> getWatchUnAdminJailsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchUnAdminJailsRequest, mruv.economy.Punishments.UnAdminJailMessage> getWatchUnAdminJailsMethod;
    if ((getWatchUnAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchUnAdminJailsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchUnAdminJailsMethod = MruVPunishmentsServiceGrpc.getWatchUnAdminJailsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchUnAdminJailsMethod = getWatchUnAdminJailsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchUnAdminJailsRequest, mruv.economy.Punishments.UnAdminJailMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchUnAdminJails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchUnAdminJailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.UnAdminJailMessage.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchUnAdminJails"))
              .build();
        }
      }
    }
    return getWatchUnAdminJailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPlayerPunishmentsRequest,
      mruv.economy.Punishments.WatchPlayerPunishmentsResponse> getWatchPlayerPunishmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPlayerPunishments",
      requestType = mruv.economy.Punishments.WatchPlayerPunishmentsRequest.class,
      responseType = mruv.economy.Punishments.WatchPlayerPunishmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPlayerPunishmentsRequest,
      mruv.economy.Punishments.WatchPlayerPunishmentsResponse> getWatchPlayerPunishmentsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPlayerPunishmentsRequest, mruv.economy.Punishments.WatchPlayerPunishmentsResponse> getWatchPlayerPunishmentsMethod;
    if ((getWatchPlayerPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerPunishmentsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchPlayerPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerPunishmentsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchPlayerPunishmentsMethod = getWatchPlayerPunishmentsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchPlayerPunishmentsRequest, mruv.economy.Punishments.WatchPlayerPunishmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPlayerPunishments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchPlayerPunishmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchPlayerPunishmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchPlayerPunishments"))
              .build();
        }
      }
    }
    return getWatchPlayerPunishmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPlayerAcquittalsRequest,
      mruv.economy.Punishments.WatchPlayerAcquittalsResponse> getWatchPlayerAcquittalsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPlayerAcquittals",
      requestType = mruv.economy.Punishments.WatchPlayerAcquittalsRequest.class,
      responseType = mruv.economy.Punishments.WatchPlayerAcquittalsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPlayerAcquittalsRequest,
      mruv.economy.Punishments.WatchPlayerAcquittalsResponse> getWatchPlayerAcquittalsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPlayerAcquittalsRequest, mruv.economy.Punishments.WatchPlayerAcquittalsResponse> getWatchPlayerAcquittalsMethod;
    if ((getWatchPlayerAcquittalsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerAcquittalsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchPlayerAcquittalsMethod = MruVPunishmentsServiceGrpc.getWatchPlayerAcquittalsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchPlayerAcquittalsMethod = getWatchPlayerAcquittalsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchPlayerAcquittalsRequest, mruv.economy.Punishments.WatchPlayerAcquittalsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPlayerAcquittals"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchPlayerAcquittalsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchPlayerAcquittalsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPunishmentsServiceMethodDescriptorSupplier("WatchPlayerAcquittals"))
              .build();
        }
      }
    }
    return getWatchPlayerAcquittalsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPunishmentsRequest,
      mruv.economy.Punishments.WatchPunishmentsResponse> getWatchPunishmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPunishments",
      requestType = mruv.economy.Punishments.WatchPunishmentsRequest.class,
      responseType = mruv.economy.Punishments.WatchPunishmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPunishmentsRequest,
      mruv.economy.Punishments.WatchPunishmentsResponse> getWatchPunishmentsMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Punishments.WatchPunishmentsRequest, mruv.economy.Punishments.WatchPunishmentsResponse> getWatchPunishmentsMethod;
    if ((getWatchPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPunishmentsMethod) == null) {
      synchronized (MruVPunishmentsServiceGrpc.class) {
        if ((getWatchPunishmentsMethod = MruVPunishmentsServiceGrpc.getWatchPunishmentsMethod) == null) {
          MruVPunishmentsServiceGrpc.getWatchPunishmentsMethod = getWatchPunishmentsMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Punishments.WatchPunishmentsRequest, mruv.economy.Punishments.WatchPunishmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPunishments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchPunishmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Punishments.WatchPunishmentsResponse.getDefaultInstance()))
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
    public void ban(mruv.economy.Punishments.BanRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public void block(mruv.economy.Punishments.BlockRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public void warn(mruv.economy.Punishments.WarnRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWarnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public void adminJail(mruv.economy.Punishments.AdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.AdminJailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdminJailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public void muteGlobalChats(mruv.economy.Punishments.MuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.MuteGlobalChatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMuteGlobalChatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public void unBan(mruv.economy.Punishments.UnBanRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public void unBlock(mruv.economy.Punishments.UnBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public void unWarn(mruv.economy.Punishments.UnWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnWarnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnWarnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public void unAdminJail(mruv.economy.Punishments.UnAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnAdminJailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnAdminJailMethod(), responseObserver);
    }

    /**
     */
    public void unMuteGlobalChats(mruv.economy.Punishments.UnMuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnMuteGlobalChatsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnMuteGlobalChatsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public void getPlayerBans(mruv.economy.Punishments.GetPlayerBansRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerBansResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public void getPlayerWarns(mruv.economy.Punishments.GetPlayerWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerWarnsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerWarnsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public void getPlayerAdminJail(mruv.economy.Punishments.GetPlayerAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerAdminJailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlayerAdminJailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public void getBan(mruv.economy.Punishments.GetBanRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBanMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public void getWarn(mruv.economy.Punishments.GetWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWarnMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public void getBlock(mruv.economy.Punishments.GetBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public void isPlayerBanned(mruv.economy.Punishments.IsPlayerBannedRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsPlayerBannedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsPlayerBannedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public void isCharacterBlocked(mruv.economy.Punishments.IsCharacterBlockedRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsCharacterBlockedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsCharacterBlockedMethod(), responseObserver);
    }

    /**
     */
    public void isCharacterJailed(mruv.economy.Punishments.IsCharacterJailedRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsCharacterJailedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsCharacterJailedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to ban events.
     * </pre>
     */
    public void watchBans(mruv.economy.Punishments.WatchBansRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to block events.
     * </pre>
     */
    public void watchBlocks(mruv.economy.Punishments.WatchBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to warn events.
     * </pre>
     */
    public void watchWarns(mruv.economy.Punishments.WatchWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchWarnsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail events.
     * </pre>
     */
    public void watchAdminJails(mruv.economy.Punishments.WatchAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.AdminJailMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchAdminJailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unban events.
     * </pre>
     */
    public void watchUnBans(mruv.economy.Punishments.WatchUnBansRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBanMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnBansMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unblock events.
     * </pre>
     */
    public void watchUnBlocks(mruv.economy.Punishments.WatchUnBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBlockMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnBlocksMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unwarn events.
     * </pre>
     */
    public void watchUnWarns(mruv.economy.Punishments.WatchUnWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnWarnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnWarnsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail release events.
     * </pre>
     */
    public void watchUnAdminJails(mruv.economy.Punishments.WatchUnAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnAdminJailMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchUnAdminJailsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player punishments.
     * </pre>
     */
    public void watchPlayerPunishments(mruv.economy.Punishments.WatchPlayerPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPlayerPunishmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPlayerPunishmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player acquittals.
     * </pre>
     */
    public void watchPlayerAcquittals(mruv.economy.Punishments.WatchPlayerAcquittalsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPlayerAcquittalsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPlayerAcquittalsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to all punishments and acquittals events.
     * </pre>
     */
    public void watchPunishments(mruv.economy.Punishments.WatchPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPunishmentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPunishmentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.BanRequest,
                mruv.economy.Punishments.BanResponse>(
                  this, METHODID_BAN)))
          .addMethod(
            getBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.BlockRequest,
                mruv.economy.Punishments.BlockResponse>(
                  this, METHODID_BLOCK)))
          .addMethod(
            getWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.WarnRequest,
                mruv.economy.Punishments.WarnResponse>(
                  this, METHODID_WARN)))
          .addMethod(
            getAdminJailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.AdminJailRequest,
                mruv.economy.Punishments.AdminJailResponse>(
                  this, METHODID_ADMIN_JAIL)))
          .addMethod(
            getMuteGlobalChatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.MuteGlobalChatsRequest,
                mruv.economy.Punishments.MuteGlobalChatsResponse>(
                  this, METHODID_MUTE_GLOBAL_CHATS)))
          .addMethod(
            getUnBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.UnBanRequest,
                mruv.economy.Punishments.UnBanResponse>(
                  this, METHODID_UN_BAN)))
          .addMethod(
            getUnBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.UnBlockRequest,
                mruv.economy.Punishments.UnBlockResponse>(
                  this, METHODID_UN_BLOCK)))
          .addMethod(
            getUnWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.UnWarnRequest,
                mruv.economy.Punishments.UnWarnResponse>(
                  this, METHODID_UN_WARN)))
          .addMethod(
            getUnAdminJailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.UnAdminJailRequest,
                mruv.economy.Punishments.UnAdminJailResponse>(
                  this, METHODID_UN_ADMIN_JAIL)))
          .addMethod(
            getUnMuteGlobalChatsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.UnMuteGlobalChatsRequest,
                mruv.economy.Punishments.UnMuteGlobalChatsResponse>(
                  this, METHODID_UN_MUTE_GLOBAL_CHATS)))
          .addMethod(
            getGetPlayerBansMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.GetPlayerBansRequest,
                mruv.economy.Punishments.GetPlayerBansResponse>(
                  this, METHODID_GET_PLAYER_BANS)))
          .addMethod(
            getGetPlayerWarnsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.GetPlayerWarnsRequest,
                mruv.economy.Punishments.GetPlayerWarnsResponse>(
                  this, METHODID_GET_PLAYER_WARNS)))
          .addMethod(
            getGetPlayerAdminJailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.GetPlayerAdminJailRequest,
                mruv.economy.Punishments.GetPlayerAdminJailResponse>(
                  this, METHODID_GET_PLAYER_ADMIN_JAIL)))
          .addMethod(
            getGetBanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.GetBanRequest,
                mruv.economy.Punishments.BanMessage>(
                  this, METHODID_GET_BAN)))
          .addMethod(
            getGetWarnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.GetWarnRequest,
                mruv.economy.Punishments.WarnMessage>(
                  this, METHODID_GET_WARN)))
          .addMethod(
            getGetBlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.GetBlockRequest,
                mruv.economy.Punishments.BlockMessage>(
                  this, METHODID_GET_BLOCK)))
          .addMethod(
            getIsPlayerBannedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.IsPlayerBannedRequest,
                mruv.economy.Punishments.IsPlayerBannedResponse>(
                  this, METHODID_IS_PLAYER_BANNED)))
          .addMethod(
            getIsCharacterBlockedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.IsCharacterBlockedRequest,
                mruv.economy.Punishments.IsCharacterBlockedResponse>(
                  this, METHODID_IS_CHARACTER_BLOCKED)))
          .addMethod(
            getIsCharacterJailedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Punishments.IsCharacterJailedRequest,
                mruv.economy.Punishments.IsCharacterJailedResponse>(
                  this, METHODID_IS_CHARACTER_JAILED)))
          .addMethod(
            getWatchBansMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchBansRequest,
                mruv.economy.Punishments.BanMessage>(
                  this, METHODID_WATCH_BANS)))
          .addMethod(
            getWatchBlocksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchBlocksRequest,
                mruv.economy.Punishments.BlockMessage>(
                  this, METHODID_WATCH_BLOCKS)))
          .addMethod(
            getWatchWarnsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchWarnsRequest,
                mruv.economy.Punishments.WarnMessage>(
                  this, METHODID_WATCH_WARNS)))
          .addMethod(
            getWatchAdminJailsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchAdminJailsRequest,
                mruv.economy.Punishments.AdminJailMessage>(
                  this, METHODID_WATCH_ADMIN_JAILS)))
          .addMethod(
            getWatchUnBansMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchUnBansRequest,
                mruv.economy.Punishments.UnBanMessage>(
                  this, METHODID_WATCH_UN_BANS)))
          .addMethod(
            getWatchUnBlocksMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchUnBlocksRequest,
                mruv.economy.Punishments.UnBlockMessage>(
                  this, METHODID_WATCH_UN_BLOCKS)))
          .addMethod(
            getWatchUnWarnsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchUnWarnsRequest,
                mruv.economy.Punishments.UnWarnMessage>(
                  this, METHODID_WATCH_UN_WARNS)))
          .addMethod(
            getWatchUnAdminJailsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchUnAdminJailsRequest,
                mruv.economy.Punishments.UnAdminJailMessage>(
                  this, METHODID_WATCH_UN_ADMIN_JAILS)))
          .addMethod(
            getWatchPlayerPunishmentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchPlayerPunishmentsRequest,
                mruv.economy.Punishments.WatchPlayerPunishmentsResponse>(
                  this, METHODID_WATCH_PLAYER_PUNISHMENTS)))
          .addMethod(
            getWatchPlayerAcquittalsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchPlayerAcquittalsRequest,
                mruv.economy.Punishments.WatchPlayerAcquittalsResponse>(
                  this, METHODID_WATCH_PLAYER_ACQUITTALS)))
          .addMethod(
            getWatchPunishmentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Punishments.WatchPunishmentsRequest,
                mruv.economy.Punishments.WatchPunishmentsResponse>(
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
    public void ban(mruv.economy.Punishments.BanRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public void block(mruv.economy.Punishments.BlockRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public void warn(mruv.economy.Punishments.WarnRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public void adminJail(mruv.economy.Punishments.AdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.AdminJailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdminJailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public void muteGlobalChats(mruv.economy.Punishments.MuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.MuteGlobalChatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMuteGlobalChatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public void unBan(mruv.economy.Punishments.UnBanRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public void unBlock(mruv.economy.Punishments.UnBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public void unWarn(mruv.economy.Punishments.UnWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnWarnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public void unAdminJail(mruv.economy.Punishments.UnAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnAdminJailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnAdminJailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unMuteGlobalChats(mruv.economy.Punishments.UnMuteGlobalChatsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnMuteGlobalChatsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnMuteGlobalChatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public void getPlayerBans(mruv.economy.Punishments.GetPlayerBansRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerBansResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public void getPlayerWarns(mruv.economy.Punishments.GetPlayerWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerWarnsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerWarnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public void getPlayerAdminJail(mruv.economy.Punishments.GetPlayerAdminJailRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerAdminJailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlayerAdminJailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public void getBan(mruv.economy.Punishments.GetBanRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public void getWarn(mruv.economy.Punishments.GetWarnRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWarnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public void getBlock(mruv.economy.Punishments.GetBlockRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public void isPlayerBanned(mruv.economy.Punishments.IsPlayerBannedRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsPlayerBannedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsPlayerBannedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public void isCharacterBlocked(mruv.economy.Punishments.IsCharacterBlockedRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsCharacterBlockedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsCharacterBlockedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isCharacterJailed(mruv.economy.Punishments.IsCharacterJailedRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsCharacterJailedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsCharacterJailedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to ban events.
     * </pre>
     */
    public void watchBans(mruv.economy.Punishments.WatchBansRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to block events.
     * </pre>
     */
    public void watchBlocks(mruv.economy.Punishments.WatchBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to warn events.
     * </pre>
     */
    public void watchWarns(mruv.economy.Punishments.WatchWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchWarnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail events.
     * </pre>
     */
    public void watchAdminJails(mruv.economy.Punishments.WatchAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.AdminJailMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchAdminJailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unban events.
     * </pre>
     */
    public void watchUnBans(mruv.economy.Punishments.WatchUnBansRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBanMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnBansMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unblock events.
     * </pre>
     */
    public void watchUnBlocks(mruv.economy.Punishments.WatchUnBlocksRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBlockMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnBlocksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to unwarn events.
     * </pre>
     */
    public void watchUnWarns(mruv.economy.Punishments.WatchUnWarnsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnWarnMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnWarnsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to admin jail release events.
     * </pre>
     */
    public void watchUnAdminJails(mruv.economy.Punishments.WatchUnAdminJailsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnAdminJailMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchUnAdminJailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player punishments.
     * </pre>
     */
    public void watchPlayerPunishments(mruv.economy.Punishments.WatchPlayerPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPlayerPunishmentsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchPlayerPunishmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to player acquittals.
     * </pre>
     */
    public void watchPlayerAcquittals(mruv.economy.Punishments.WatchPlayerAcquittalsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPlayerAcquittalsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchPlayerAcquittalsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to all punishments and acquittals events.
     * </pre>
     */
    public void watchPunishments(mruv.economy.Punishments.WatchPunishmentsRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPunishmentsResponse> responseObserver) {
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
    public mruv.economy.Punishments.BanResponse ban(mruv.economy.Punishments.BanRequest request) {
      return blockingUnaryCall(
          getChannel(), getBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public mruv.economy.Punishments.BlockResponse block(mruv.economy.Punishments.BlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public mruv.economy.Punishments.WarnResponse warn(mruv.economy.Punishments.WarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getWarnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public mruv.economy.Punishments.AdminJailResponse adminJail(mruv.economy.Punishments.AdminJailRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdminJailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public mruv.economy.Punishments.MuteGlobalChatsResponse muteGlobalChats(mruv.economy.Punishments.MuteGlobalChatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getMuteGlobalChatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public mruv.economy.Punishments.UnBanResponse unBan(mruv.economy.Punishments.UnBanRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public mruv.economy.Punishments.UnBlockResponse unBlock(mruv.economy.Punishments.UnBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public mruv.economy.Punishments.UnWarnResponse unWarn(mruv.economy.Punishments.UnWarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnWarnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public mruv.economy.Punishments.UnAdminJailResponse unAdminJail(mruv.economy.Punishments.UnAdminJailRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnAdminJailMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.economy.Punishments.UnMuteGlobalChatsResponse unMuteGlobalChats(mruv.economy.Punishments.UnMuteGlobalChatsRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnMuteGlobalChatsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public mruv.economy.Punishments.GetPlayerBansResponse getPlayerBans(mruv.economy.Punishments.GetPlayerBansRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public mruv.economy.Punishments.GetPlayerWarnsResponse getPlayerWarns(mruv.economy.Punishments.GetPlayerWarnsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerWarnsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public mruv.economy.Punishments.GetPlayerAdminJailResponse getPlayerAdminJail(mruv.economy.Punishments.GetPlayerAdminJailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlayerAdminJailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public mruv.economy.Punishments.BanMessage getBan(mruv.economy.Punishments.GetBanRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public mruv.economy.Punishments.WarnMessage getWarn(mruv.economy.Punishments.GetWarnRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWarnMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public mruv.economy.Punishments.BlockMessage getBlock(mruv.economy.Punishments.GetBlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public mruv.economy.Punishments.IsPlayerBannedResponse isPlayerBanned(mruv.economy.Punishments.IsPlayerBannedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsPlayerBannedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public mruv.economy.Punishments.IsCharacterBlockedResponse isCharacterBlocked(mruv.economy.Punishments.IsCharacterBlockedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsCharacterBlockedMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.economy.Punishments.IsCharacterJailedResponse isCharacterJailed(mruv.economy.Punishments.IsCharacterJailedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsCharacterJailedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to ban events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.BanMessage> watchBans(
        mruv.economy.Punishments.WatchBansRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to block events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.BlockMessage> watchBlocks(
        mruv.economy.Punishments.WatchBlocksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to warn events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.WarnMessage> watchWarns(
        mruv.economy.Punishments.WatchWarnsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchWarnsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to admin jail events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.AdminJailMessage> watchAdminJails(
        mruv.economy.Punishments.WatchAdminJailsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchAdminJailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to unban events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.UnBanMessage> watchUnBans(
        mruv.economy.Punishments.WatchUnBansRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnBansMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to unblock events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.UnBlockMessage> watchUnBlocks(
        mruv.economy.Punishments.WatchUnBlocksRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnBlocksMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to unwarn events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.UnWarnMessage> watchUnWarns(
        mruv.economy.Punishments.WatchUnWarnsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnWarnsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to admin jail release events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.UnAdminJailMessage> watchUnAdminJails(
        mruv.economy.Punishments.WatchUnAdminJailsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchUnAdminJailsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to player punishments.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.WatchPlayerPunishmentsResponse> watchPlayerPunishments(
        mruv.economy.Punishments.WatchPlayerPunishmentsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchPlayerPunishmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to player acquittals.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.WatchPlayerAcquittalsResponse> watchPlayerAcquittals(
        mruv.economy.Punishments.WatchPlayerAcquittalsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchPlayerAcquittalsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to all punishments and acquittals events.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Punishments.WatchPunishmentsResponse> watchPunishments(
        mruv.economy.Punishments.WatchPunishmentsRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.BanResponse> ban(
        mruv.economy.Punishments.BanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Block player character.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.BlockResponse> block(
        mruv.economy.Punishments.BlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Warn player.
     * If warn_time is 0, warn will never expire.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.WarnResponse> warn(
        mruv.economy.Punishments.WarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWarnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put player in an admin jail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.AdminJailResponse> adminJail(
        mruv.economy.Punishments.AdminJailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdminJailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Mute player global chats.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.MuteGlobalChatsResponse> muteGlobalChats(
        mruv.economy.Punishments.MuteGlobalChatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMuteGlobalChatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a specific player ban.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.UnBanResponse> unBan(
        mruv.economy.Punishments.UnBanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a character block.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.UnBlockResponse> unBlock(
        mruv.economy.Punishments.UnBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deactivate a specific player warning. If a player was banned by reaching the warning limit, a player will be unbanned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.UnWarnResponse> unWarn(
        mruv.economy.Punishments.UnWarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnWarnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove player from admin jail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.UnAdminJailResponse> unAdminJail(
        mruv.economy.Punishments.UnAdminJailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnAdminJailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.UnMuteGlobalChatsResponse> unMuteGlobalChats(
        mruv.economy.Punishments.UnMuteGlobalChatsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnMuteGlobalChatsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all player bans.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.GetPlayerBansResponse> getPlayerBans(
        mruv.economy.Punishments.GetPlayerBansRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerBansMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all player warns.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.GetPlayerWarnsResponse> getPlayerWarns(
        mruv.economy.Punishments.GetPlayerWarnsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerWarnsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get player admin jail time.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.GetPlayerAdminJailResponse> getPlayerAdminJail(
        mruv.economy.Punishments.GetPlayerAdminJailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlayerAdminJailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get ban info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.BanMessage> getBan(
        mruv.economy.Punishments.GetBanRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get warn info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.WarnMessage> getWarn(
        mruv.economy.Punishments.GetWarnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWarnMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get block info.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.BlockMessage> getBlock(
        mruv.economy.Punishments.GetBlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check is player or ip banned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.IsPlayerBannedResponse> isPlayerBanned(
        mruv.economy.Punishments.IsPlayerBannedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsPlayerBannedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check is character is blocked.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.IsCharacterBlockedResponse> isCharacterBlocked(
        mruv.economy.Punishments.IsCharacterBlockedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsCharacterBlockedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Punishments.IsCharacterJailedResponse> isCharacterJailed(
        mruv.economy.Punishments.IsCharacterJailedRequest request) {
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
          serviceImpl.ban((mruv.economy.Punishments.BanRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanResponse>) responseObserver);
          break;
        case METHODID_BLOCK:
          serviceImpl.block((mruv.economy.Punishments.BlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockResponse>) responseObserver);
          break;
        case METHODID_WARN:
          serviceImpl.warn((mruv.economy.Punishments.WarnRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnResponse>) responseObserver);
          break;
        case METHODID_ADMIN_JAIL:
          serviceImpl.adminJail((mruv.economy.Punishments.AdminJailRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.AdminJailResponse>) responseObserver);
          break;
        case METHODID_MUTE_GLOBAL_CHATS:
          serviceImpl.muteGlobalChats((mruv.economy.Punishments.MuteGlobalChatsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.MuteGlobalChatsResponse>) responseObserver);
          break;
        case METHODID_UN_BAN:
          serviceImpl.unBan((mruv.economy.Punishments.UnBanRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBanResponse>) responseObserver);
          break;
        case METHODID_UN_BLOCK:
          serviceImpl.unBlock((mruv.economy.Punishments.UnBlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBlockResponse>) responseObserver);
          break;
        case METHODID_UN_WARN:
          serviceImpl.unWarn((mruv.economy.Punishments.UnWarnRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnWarnResponse>) responseObserver);
          break;
        case METHODID_UN_ADMIN_JAIL:
          serviceImpl.unAdminJail((mruv.economy.Punishments.UnAdminJailRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnAdminJailResponse>) responseObserver);
          break;
        case METHODID_UN_MUTE_GLOBAL_CHATS:
          serviceImpl.unMuteGlobalChats((mruv.economy.Punishments.UnMuteGlobalChatsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnMuteGlobalChatsResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_BANS:
          serviceImpl.getPlayerBans((mruv.economy.Punishments.GetPlayerBansRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerBansResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_WARNS:
          serviceImpl.getPlayerWarns((mruv.economy.Punishments.GetPlayerWarnsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerWarnsResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER_ADMIN_JAIL:
          serviceImpl.getPlayerAdminJail((mruv.economy.Punishments.GetPlayerAdminJailRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.GetPlayerAdminJailResponse>) responseObserver);
          break;
        case METHODID_GET_BAN:
          serviceImpl.getBan((mruv.economy.Punishments.GetBanRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanMessage>) responseObserver);
          break;
        case METHODID_GET_WARN:
          serviceImpl.getWarn((mruv.economy.Punishments.GetWarnRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnMessage>) responseObserver);
          break;
        case METHODID_GET_BLOCK:
          serviceImpl.getBlock((mruv.economy.Punishments.GetBlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockMessage>) responseObserver);
          break;
        case METHODID_IS_PLAYER_BANNED:
          serviceImpl.isPlayerBanned((mruv.economy.Punishments.IsPlayerBannedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsPlayerBannedResponse>) responseObserver);
          break;
        case METHODID_IS_CHARACTER_BLOCKED:
          serviceImpl.isCharacterBlocked((mruv.economy.Punishments.IsCharacterBlockedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsCharacterBlockedResponse>) responseObserver);
          break;
        case METHODID_IS_CHARACTER_JAILED:
          serviceImpl.isCharacterJailed((mruv.economy.Punishments.IsCharacterJailedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.IsCharacterJailedResponse>) responseObserver);
          break;
        case METHODID_WATCH_BANS:
          serviceImpl.watchBans((mruv.economy.Punishments.WatchBansRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.BanMessage>) responseObserver);
          break;
        case METHODID_WATCH_BLOCKS:
          serviceImpl.watchBlocks((mruv.economy.Punishments.WatchBlocksRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.BlockMessage>) responseObserver);
          break;
        case METHODID_WATCH_WARNS:
          serviceImpl.watchWarns((mruv.economy.Punishments.WatchWarnsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.WarnMessage>) responseObserver);
          break;
        case METHODID_WATCH_ADMIN_JAILS:
          serviceImpl.watchAdminJails((mruv.economy.Punishments.WatchAdminJailsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.AdminJailMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_BANS:
          serviceImpl.watchUnBans((mruv.economy.Punishments.WatchUnBansRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBanMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_BLOCKS:
          serviceImpl.watchUnBlocks((mruv.economy.Punishments.WatchUnBlocksRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnBlockMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_WARNS:
          serviceImpl.watchUnWarns((mruv.economy.Punishments.WatchUnWarnsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnWarnMessage>) responseObserver);
          break;
        case METHODID_WATCH_UN_ADMIN_JAILS:
          serviceImpl.watchUnAdminJails((mruv.economy.Punishments.WatchUnAdminJailsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.UnAdminJailMessage>) responseObserver);
          break;
        case METHODID_WATCH_PLAYER_PUNISHMENTS:
          serviceImpl.watchPlayerPunishments((mruv.economy.Punishments.WatchPlayerPunishmentsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPlayerPunishmentsResponse>) responseObserver);
          break;
        case METHODID_WATCH_PLAYER_ACQUITTALS:
          serviceImpl.watchPlayerAcquittals((mruv.economy.Punishments.WatchPlayerAcquittalsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPlayerAcquittalsResponse>) responseObserver);
          break;
        case METHODID_WATCH_PUNISHMENTS:
          serviceImpl.watchPunishments((mruv.economy.Punishments.WatchPunishmentsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Punishments.WatchPunishmentsResponse>) responseObserver);
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
      return mruv.economy.Punishments.getDescriptor();
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
