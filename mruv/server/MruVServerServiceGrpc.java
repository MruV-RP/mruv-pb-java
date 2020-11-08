package mruv.server;

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
 * The MruV server service provides procedures for managing game platform server actions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: server/server.proto")
public final class MruVServerServiceGrpc {

  private MruVServerServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.server.MruVServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.server.ServerModel.ServerInfo,
      mruv.server.ServerModel.ServerID> getRegisterServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterServer",
      requestType = mruv.server.ServerModel.ServerInfo.class,
      responseType = mruv.server.ServerModel.ServerID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.server.ServerModel.ServerInfo,
      mruv.server.ServerModel.ServerID> getRegisterServerMethod() {
    io.grpc.MethodDescriptor<mruv.server.ServerModel.ServerInfo, mruv.server.ServerModel.ServerID> getRegisterServerMethod;
    if ((getRegisterServerMethod = MruVServerServiceGrpc.getRegisterServerMethod) == null) {
      synchronized (MruVServerServiceGrpc.class) {
        if ((getRegisterServerMethod = MruVServerServiceGrpc.getRegisterServerMethod) == null) {
          MruVServerServiceGrpc.getRegisterServerMethod = getRegisterServerMethod =
              io.grpc.MethodDescriptor.<mruv.server.ServerModel.ServerInfo, mruv.server.ServerModel.ServerID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.ServerModel.ServerInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.ServerModel.ServerID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVServerServiceMethodDescriptorSupplier("RegisterServer"))
              .build();
        }
      }
    }
    return getRegisterServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.server.Server.GetRegisteredServersRequest,
      mruv.server.Server.GetRegisteredServersResponse> getGetRegisteredServersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegisteredServers",
      requestType = mruv.server.Server.GetRegisteredServersRequest.class,
      responseType = mruv.server.Server.GetRegisteredServersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.server.Server.GetRegisteredServersRequest,
      mruv.server.Server.GetRegisteredServersResponse> getGetRegisteredServersMethod() {
    io.grpc.MethodDescriptor<mruv.server.Server.GetRegisteredServersRequest, mruv.server.Server.GetRegisteredServersResponse> getGetRegisteredServersMethod;
    if ((getGetRegisteredServersMethod = MruVServerServiceGrpc.getGetRegisteredServersMethod) == null) {
      synchronized (MruVServerServiceGrpc.class) {
        if ((getGetRegisteredServersMethod = MruVServerServiceGrpc.getGetRegisteredServersMethod) == null) {
          MruVServerServiceGrpc.getGetRegisteredServersMethod = getGetRegisteredServersMethod =
              io.grpc.MethodDescriptor.<mruv.server.Server.GetRegisteredServersRequest, mruv.server.Server.GetRegisteredServersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegisteredServers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.Server.GetRegisteredServersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.Server.GetRegisteredServersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVServerServiceMethodDescriptorSupplier("GetRegisteredServers"))
              .build();
        }
      }
    }
    return getGetRegisteredServersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.server.ServerModel.ServerID,
      mruv.server.ServerModel.ServerInfo> getGetServerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServerInfo",
      requestType = mruv.server.ServerModel.ServerID.class,
      responseType = mruv.server.ServerModel.ServerInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.server.ServerModel.ServerID,
      mruv.server.ServerModel.ServerInfo> getGetServerInfoMethod() {
    io.grpc.MethodDescriptor<mruv.server.ServerModel.ServerID, mruv.server.ServerModel.ServerInfo> getGetServerInfoMethod;
    if ((getGetServerInfoMethod = MruVServerServiceGrpc.getGetServerInfoMethod) == null) {
      synchronized (MruVServerServiceGrpc.class) {
        if ((getGetServerInfoMethod = MruVServerServiceGrpc.getGetServerInfoMethod) == null) {
          MruVServerServiceGrpc.getGetServerInfoMethod = getGetServerInfoMethod =
              io.grpc.MethodDescriptor.<mruv.server.ServerModel.ServerID, mruv.server.ServerModel.ServerInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServerInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.ServerModel.ServerID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.ServerModel.ServerInfo.getDefaultInstance()))
              .setSchemaDescriptor(new MruVServerServiceMethodDescriptorSupplier("GetServerInfo"))
              .build();
        }
      }
    }
    return getGetServerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.server.Server.UpdateServerStatusRequest,
      mruv.server.Server.UpdateServerStatusResponse> getUpdateServerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServerStatus",
      requestType = mruv.server.Server.UpdateServerStatusRequest.class,
      responseType = mruv.server.Server.UpdateServerStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.server.Server.UpdateServerStatusRequest,
      mruv.server.Server.UpdateServerStatusResponse> getUpdateServerStatusMethod() {
    io.grpc.MethodDescriptor<mruv.server.Server.UpdateServerStatusRequest, mruv.server.Server.UpdateServerStatusResponse> getUpdateServerStatusMethod;
    if ((getUpdateServerStatusMethod = MruVServerServiceGrpc.getUpdateServerStatusMethod) == null) {
      synchronized (MruVServerServiceGrpc.class) {
        if ((getUpdateServerStatusMethod = MruVServerServiceGrpc.getUpdateServerStatusMethod) == null) {
          MruVServerServiceGrpc.getUpdateServerStatusMethod = getUpdateServerStatusMethod =
              io.grpc.MethodDescriptor.<mruv.server.Server.UpdateServerStatusRequest, mruv.server.Server.UpdateServerStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.Server.UpdateServerStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.Server.UpdateServerStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVServerServiceMethodDescriptorSupplier("UpdateServerStatus"))
              .build();
        }
      }
    }
    return getUpdateServerStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.server.Server.ServerEventsStreamRequest,
      mruv.server.Server.ServerEvent> getServerEventsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerEventsStream",
      requestType = mruv.server.Server.ServerEventsStreamRequest.class,
      responseType = mruv.server.Server.ServerEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.server.Server.ServerEventsStreamRequest,
      mruv.server.Server.ServerEvent> getServerEventsStreamMethod() {
    io.grpc.MethodDescriptor<mruv.server.Server.ServerEventsStreamRequest, mruv.server.Server.ServerEvent> getServerEventsStreamMethod;
    if ((getServerEventsStreamMethod = MruVServerServiceGrpc.getServerEventsStreamMethod) == null) {
      synchronized (MruVServerServiceGrpc.class) {
        if ((getServerEventsStreamMethod = MruVServerServiceGrpc.getServerEventsStreamMethod) == null) {
          MruVServerServiceGrpc.getServerEventsStreamMethod = getServerEventsStreamMethod =
              io.grpc.MethodDescriptor.<mruv.server.Server.ServerEventsStreamRequest, mruv.server.Server.ServerEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerEventsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.Server.ServerEventsStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.server.Server.ServerEvent.getDefaultInstance()))
              .setSchemaDescriptor(new MruVServerServiceMethodDescriptorSupplier("ServerEventsStream"))
              .build();
        }
      }
    }
    return getServerEventsStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVServerServiceStub>() {
        @java.lang.Override
        public MruVServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVServerServiceStub(channel, callOptions);
        }
      };
    return MruVServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVServerServiceBlockingStub>() {
        @java.lang.Override
        public MruVServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVServerServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVServerServiceFutureStub>() {
        @java.lang.Override
        public MruVServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVServerServiceFutureStub(channel, callOptions);
        }
      };
    return MruVServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV server service provides procedures for managing game platform server actions.
   * </pre>
   */
  public static abstract class MruVServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register instance of server for further managing.
     * </pre>
     */
    public void registerServer(mruv.server.ServerModel.ServerInfo request,
        io.grpc.stub.StreamObserver<mruv.server.ServerModel.ServerID> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all registered servers.
     * </pre>
     */
    public void getRegisteredServers(mruv.server.Server.GetRegisteredServersRequest request,
        io.grpc.stub.StreamObserver<mruv.server.Server.GetRegisteredServersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRegisteredServersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get game server status.
     * </pre>
     */
    public void getServerInfo(mruv.server.ServerModel.ServerID request,
        io.grpc.stub.StreamObserver<mruv.server.ServerModel.ServerInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServerInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update game server status.
     * </pre>
     */
    public void updateServerStatus(mruv.server.Server.UpdateServerStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.server.Server.UpdateServerStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateServerStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream of server events. Events are streamed back in real-time for chosen server.
     *TODO: Change name to: SubscribeServerEvents
     * </pre>
     */
    public void serverEventsStream(mruv.server.Server.ServerEventsStreamRequest request,
        io.grpc.stub.StreamObserver<mruv.server.Server.ServerEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getServerEventsStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.server.ServerModel.ServerInfo,
                mruv.server.ServerModel.ServerID>(
                  this, METHODID_REGISTER_SERVER)))
          .addMethod(
            getGetRegisteredServersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.server.Server.GetRegisteredServersRequest,
                mruv.server.Server.GetRegisteredServersResponse>(
                  this, METHODID_GET_REGISTERED_SERVERS)))
          .addMethod(
            getGetServerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.server.ServerModel.ServerID,
                mruv.server.ServerModel.ServerInfo>(
                  this, METHODID_GET_SERVER_INFO)))
          .addMethod(
            getUpdateServerStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.server.Server.UpdateServerStatusRequest,
                mruv.server.Server.UpdateServerStatusResponse>(
                  this, METHODID_UPDATE_SERVER_STATUS)))
          .addMethod(
            getServerEventsStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.server.Server.ServerEventsStreamRequest,
                mruv.server.Server.ServerEvent>(
                  this, METHODID_SERVER_EVENTS_STREAM)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV server service provides procedures for managing game platform server actions.
   * </pre>
   */
  public static final class MruVServerServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVServerServiceStub> {
    private MruVServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register instance of server for further managing.
     * </pre>
     */
    public void registerServer(mruv.server.ServerModel.ServerInfo request,
        io.grpc.stub.StreamObserver<mruv.server.ServerModel.ServerID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all registered servers.
     * </pre>
     */
    public void getRegisteredServers(mruv.server.Server.GetRegisteredServersRequest request,
        io.grpc.stub.StreamObserver<mruv.server.Server.GetRegisteredServersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRegisteredServersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get game server status.
     * </pre>
     */
    public void getServerInfo(mruv.server.ServerModel.ServerID request,
        io.grpc.stub.StreamObserver<mruv.server.ServerModel.ServerInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update game server status.
     * </pre>
     */
    public void updateServerStatus(mruv.server.Server.UpdateServerStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.server.Server.UpdateServerStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateServerStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream of server events. Events are streamed back in real-time for chosen server.
     *TODO: Change name to: SubscribeServerEvents
     * </pre>
     */
    public void serverEventsStream(mruv.server.Server.ServerEventsStreamRequest request,
        io.grpc.stub.StreamObserver<mruv.server.Server.ServerEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerEventsStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV server service provides procedures for managing game platform server actions.
   * </pre>
   */
  public static final class MruVServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVServerServiceBlockingStub> {
    private MruVServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register instance of server for further managing.
     * </pre>
     */
    public mruv.server.ServerModel.ServerID registerServer(mruv.server.ServerModel.ServerInfo request) {
      return blockingUnaryCall(
          getChannel(), getRegisterServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all registered servers.
     * </pre>
     */
    public mruv.server.Server.GetRegisteredServersResponse getRegisteredServers(mruv.server.Server.GetRegisteredServersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRegisteredServersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get game server status.
     * </pre>
     */
    public mruv.server.ServerModel.ServerInfo getServerInfo(mruv.server.ServerModel.ServerID request) {
      return blockingUnaryCall(
          getChannel(), getGetServerInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update game server status.
     * </pre>
     */
    public mruv.server.Server.UpdateServerStatusResponse updateServerStatus(mruv.server.Server.UpdateServerStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateServerStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream of server events. Events are streamed back in real-time for chosen server.
     *TODO: Change name to: SubscribeServerEvents
     * </pre>
     */
    public java.util.Iterator<mruv.server.Server.ServerEvent> serverEventsStream(
        mruv.server.Server.ServerEventsStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getServerEventsStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV server service provides procedures for managing game platform server actions.
   * </pre>
   */
  public static final class MruVServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVServerServiceFutureStub> {
    private MruVServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register instance of server for further managing.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.server.ServerModel.ServerID> registerServer(
        mruv.server.ServerModel.ServerInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all registered servers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.server.Server.GetRegisteredServersResponse> getRegisteredServers(
        mruv.server.Server.GetRegisteredServersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRegisteredServersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get game server status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.server.ServerModel.ServerInfo> getServerInfo(
        mruv.server.ServerModel.ServerID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServerInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update game server status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.server.Server.UpdateServerStatusResponse> updateServerStatus(
        mruv.server.Server.UpdateServerStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateServerStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SERVER = 0;
  private static final int METHODID_GET_REGISTERED_SERVERS = 1;
  private static final int METHODID_GET_SERVER_INFO = 2;
  private static final int METHODID_UPDATE_SERVER_STATUS = 3;
  private static final int METHODID_SERVER_EVENTS_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_SERVER:
          serviceImpl.registerServer((mruv.server.ServerModel.ServerInfo) request,
              (io.grpc.stub.StreamObserver<mruv.server.ServerModel.ServerID>) responseObserver);
          break;
        case METHODID_GET_REGISTERED_SERVERS:
          serviceImpl.getRegisteredServers((mruv.server.Server.GetRegisteredServersRequest) request,
              (io.grpc.stub.StreamObserver<mruv.server.Server.GetRegisteredServersResponse>) responseObserver);
          break;
        case METHODID_GET_SERVER_INFO:
          serviceImpl.getServerInfo((mruv.server.ServerModel.ServerID) request,
              (io.grpc.stub.StreamObserver<mruv.server.ServerModel.ServerInfo>) responseObserver);
          break;
        case METHODID_UPDATE_SERVER_STATUS:
          serviceImpl.updateServerStatus((mruv.server.Server.UpdateServerStatusRequest) request,
              (io.grpc.stub.StreamObserver<mruv.server.Server.UpdateServerStatusResponse>) responseObserver);
          break;
        case METHODID_SERVER_EVENTS_STREAM:
          serviceImpl.serverEventsStream((mruv.server.Server.ServerEventsStreamRequest) request,
              (io.grpc.stub.StreamObserver<mruv.server.Server.ServerEvent>) responseObserver);
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

  private static abstract class MruVServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.server.Server.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVServerService");
    }
  }

  private static final class MruVServerServiceFileDescriptorSupplier
      extends MruVServerServiceBaseDescriptorSupplier {
    MruVServerServiceFileDescriptorSupplier() {}
  }

  private static final class MruVServerServiceMethodDescriptorSupplier
      extends MruVServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVServerServiceFileDescriptorSupplier())
              .addMethod(getRegisterServerMethod())
              .addMethod(getGetRegisteredServersMethod())
              .addMethod(getGetServerInfoMethod())
              .addMethod(getUpdateServerStatusMethod())
              .addMethod(getServerEventsStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
