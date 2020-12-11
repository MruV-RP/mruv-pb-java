package texture_studio;

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
 * Service to manage texture studio servers cluster.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: texturestudio/texturestudio_manage.proto")
public final class TextureStudioManagerServiceGrpc {

  private TextureStudioManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "texture_studio.TextureStudioManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.CreateServerRequest,
      texture_studio.TexturestudioManage.CreateServerResponse> getCreateServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServer",
      requestType = texture_studio.TexturestudioManage.CreateServerRequest.class,
      responseType = texture_studio.TexturestudioManage.CreateServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.CreateServerRequest,
      texture_studio.TexturestudioManage.CreateServerResponse> getCreateServerMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.CreateServerRequest, texture_studio.TexturestudioManage.CreateServerResponse> getCreateServerMethod;
    if ((getCreateServerMethod = TextureStudioManagerServiceGrpc.getCreateServerMethod) == null) {
      synchronized (TextureStudioManagerServiceGrpc.class) {
        if ((getCreateServerMethod = TextureStudioManagerServiceGrpc.getCreateServerMethod) == null) {
          TextureStudioManagerServiceGrpc.getCreateServerMethod = getCreateServerMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioManage.CreateServerRequest, texture_studio.TexturestudioManage.CreateServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.CreateServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.CreateServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioManagerServiceMethodDescriptorSupplier("CreateServer"))
              .build();
        }
      }
    }
    return getCreateServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.GetServersRequest,
      texture_studio.TexturestudioManage.GetServersResponse> getGetServersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServers",
      requestType = texture_studio.TexturestudioManage.GetServersRequest.class,
      responseType = texture_studio.TexturestudioManage.GetServersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.GetServersRequest,
      texture_studio.TexturestudioManage.GetServersResponse> getGetServersMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.GetServersRequest, texture_studio.TexturestudioManage.GetServersResponse> getGetServersMethod;
    if ((getGetServersMethod = TextureStudioManagerServiceGrpc.getGetServersMethod) == null) {
      synchronized (TextureStudioManagerServiceGrpc.class) {
        if ((getGetServersMethod = TextureStudioManagerServiceGrpc.getGetServersMethod) == null) {
          TextureStudioManagerServiceGrpc.getGetServersMethod = getGetServersMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioManage.GetServersRequest, texture_studio.TexturestudioManage.GetServersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.GetServersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.GetServersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioManagerServiceMethodDescriptorSupplier("GetServers"))
              .build();
        }
      }
    }
    return getGetServersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.MyServerRequest,
      texture_studio.TexturestudioManage.MyServerResponse> getMyServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MyServer",
      requestType = texture_studio.TexturestudioManage.MyServerRequest.class,
      responseType = texture_studio.TexturestudioManage.MyServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.MyServerRequest,
      texture_studio.TexturestudioManage.MyServerResponse> getMyServerMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.MyServerRequest, texture_studio.TexturestudioManage.MyServerResponse> getMyServerMethod;
    if ((getMyServerMethod = TextureStudioManagerServiceGrpc.getMyServerMethod) == null) {
      synchronized (TextureStudioManagerServiceGrpc.class) {
        if ((getMyServerMethod = TextureStudioManagerServiceGrpc.getMyServerMethod) == null) {
          TextureStudioManagerServiceGrpc.getMyServerMethod = getMyServerMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioManage.MyServerRequest, texture_studio.TexturestudioManage.MyServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MyServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.MyServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.MyServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioManagerServiceMethodDescriptorSupplier("MyServer"))
              .build();
        }
      }
    }
    return getMyServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.TransferOwnershipRequest,
      texture_studio.TexturestudioManage.TransferOwnershipResponse> getTransferOwnershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransferOwnership",
      requestType = texture_studio.TexturestudioManage.TransferOwnershipRequest.class,
      responseType = texture_studio.TexturestudioManage.TransferOwnershipResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.TransferOwnershipRequest,
      texture_studio.TexturestudioManage.TransferOwnershipResponse> getTransferOwnershipMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.TransferOwnershipRequest, texture_studio.TexturestudioManage.TransferOwnershipResponse> getTransferOwnershipMethod;
    if ((getTransferOwnershipMethod = TextureStudioManagerServiceGrpc.getTransferOwnershipMethod) == null) {
      synchronized (TextureStudioManagerServiceGrpc.class) {
        if ((getTransferOwnershipMethod = TextureStudioManagerServiceGrpc.getTransferOwnershipMethod) == null) {
          TextureStudioManagerServiceGrpc.getTransferOwnershipMethod = getTransferOwnershipMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioManage.TransferOwnershipRequest, texture_studio.TexturestudioManage.TransferOwnershipResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferOwnership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.TransferOwnershipRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.TransferOwnershipResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioManagerServiceMethodDescriptorSupplier("TransferOwnership"))
              .build();
        }
      }
    }
    return getTransferOwnershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.DeleteServerRequest,
      texture_studio.TexturestudioManage.DeleteServerResponse> getDeleteServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServer",
      requestType = texture_studio.TexturestudioManage.DeleteServerRequest.class,
      responseType = texture_studio.TexturestudioManage.DeleteServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.DeleteServerRequest,
      texture_studio.TexturestudioManage.DeleteServerResponse> getDeleteServerMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioManage.DeleteServerRequest, texture_studio.TexturestudioManage.DeleteServerResponse> getDeleteServerMethod;
    if ((getDeleteServerMethod = TextureStudioManagerServiceGrpc.getDeleteServerMethod) == null) {
      synchronized (TextureStudioManagerServiceGrpc.class) {
        if ((getDeleteServerMethod = TextureStudioManagerServiceGrpc.getDeleteServerMethod) == null) {
          TextureStudioManagerServiceGrpc.getDeleteServerMethod = getDeleteServerMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioManage.DeleteServerRequest, texture_studio.TexturestudioManage.DeleteServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.DeleteServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioManage.DeleteServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioManagerServiceMethodDescriptorSupplier("DeleteServer"))
              .build();
        }
      }
    }
    return getDeleteServerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextureStudioManagerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextureStudioManagerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextureStudioManagerServiceStub>() {
        @java.lang.Override
        public TextureStudioManagerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextureStudioManagerServiceStub(channel, callOptions);
        }
      };
    return TextureStudioManagerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextureStudioManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextureStudioManagerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextureStudioManagerServiceBlockingStub>() {
        @java.lang.Override
        public TextureStudioManagerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextureStudioManagerServiceBlockingStub(channel, callOptions);
        }
      };
    return TextureStudioManagerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextureStudioManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextureStudioManagerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextureStudioManagerServiceFutureStub>() {
        @java.lang.Override
        public TextureStudioManagerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextureStudioManagerServiceFutureStub(channel, callOptions);
        }
      };
    return TextureStudioManagerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage texture studio servers cluster.
   * </pre>
   */
  public static abstract class TextureStudioManagerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a new texture studio server.
     * </pre>
     */
    public void createServer(texture_studio.TexturestudioManage.CreateServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.CreateServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all existing servers
     * </pre>
     */
    public void getServers(texture_studio.TexturestudioManage.GetServersRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.GetServersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get texture studio server id for current user.
     * </pre>
     */
    public void myServer(texture_studio.TexturestudioManage.MyServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.MyServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMyServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Change owner of texture studio server.
     * </pre>
     */
    public void transferOwnership(texture_studio.TexturestudioManage.TransferOwnershipRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.TransferOwnershipResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferOwnershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a texture studio server.
     * </pre>
     */
    public void deleteServer(texture_studio.TexturestudioManage.DeleteServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.DeleteServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteServerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioManage.CreateServerRequest,
                texture_studio.TexturestudioManage.CreateServerResponse>(
                  this, METHODID_CREATE_SERVER)))
          .addMethod(
            getGetServersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioManage.GetServersRequest,
                texture_studio.TexturestudioManage.GetServersResponse>(
                  this, METHODID_GET_SERVERS)))
          .addMethod(
            getMyServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioManage.MyServerRequest,
                texture_studio.TexturestudioManage.MyServerResponse>(
                  this, METHODID_MY_SERVER)))
          .addMethod(
            getTransferOwnershipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioManage.TransferOwnershipRequest,
                texture_studio.TexturestudioManage.TransferOwnershipResponse>(
                  this, METHODID_TRANSFER_OWNERSHIP)))
          .addMethod(
            getDeleteServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioManage.DeleteServerRequest,
                texture_studio.TexturestudioManage.DeleteServerResponse>(
                  this, METHODID_DELETE_SERVER)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage texture studio servers cluster.
   * </pre>
   */
  public static final class TextureStudioManagerServiceStub extends io.grpc.stub.AbstractAsyncStub<TextureStudioManagerServiceStub> {
    private TextureStudioManagerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextureStudioManagerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextureStudioManagerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new texture studio server.
     * </pre>
     */
    public void createServer(texture_studio.TexturestudioManage.CreateServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.CreateServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all existing servers
     * </pre>
     */
    public void getServers(texture_studio.TexturestudioManage.GetServersRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.GetServersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get texture studio server id for current user.
     * </pre>
     */
    public void myServer(texture_studio.TexturestudioManage.MyServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.MyServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMyServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Change owner of texture studio server.
     * </pre>
     */
    public void transferOwnership(texture_studio.TexturestudioManage.TransferOwnershipRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.TransferOwnershipResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferOwnershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a texture studio server.
     * </pre>
     */
    public void deleteServer(texture_studio.TexturestudioManage.DeleteServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.DeleteServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteServerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage texture studio servers cluster.
   * </pre>
   */
  public static final class TextureStudioManagerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextureStudioManagerServiceBlockingStub> {
    private TextureStudioManagerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextureStudioManagerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextureStudioManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new texture studio server.
     * </pre>
     */
    public texture_studio.TexturestudioManage.CreateServerResponse createServer(texture_studio.TexturestudioManage.CreateServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all existing servers
     * </pre>
     */
    public texture_studio.TexturestudioManage.GetServersResponse getServers(texture_studio.TexturestudioManage.GetServersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get texture studio server id for current user.
     * </pre>
     */
    public texture_studio.TexturestudioManage.MyServerResponse myServer(texture_studio.TexturestudioManage.MyServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getMyServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Change owner of texture studio server.
     * </pre>
     */
    public texture_studio.TexturestudioManage.TransferOwnershipResponse transferOwnership(texture_studio.TexturestudioManage.TransferOwnershipRequest request) {
      return blockingUnaryCall(
          getChannel(), getTransferOwnershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a texture studio server.
     * </pre>
     */
    public texture_studio.TexturestudioManage.DeleteServerResponse deleteServer(texture_studio.TexturestudioManage.DeleteServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteServerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage texture studio servers cluster.
   * </pre>
   */
  public static final class TextureStudioManagerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextureStudioManagerServiceFutureStub> {
    private TextureStudioManagerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextureStudioManagerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextureStudioManagerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a new texture studio server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioManage.CreateServerResponse> createServer(
        texture_studio.TexturestudioManage.CreateServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all existing servers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioManage.GetServersResponse> getServers(
        texture_studio.TexturestudioManage.GetServersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get texture studio server id for current user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioManage.MyServerResponse> myServer(
        texture_studio.TexturestudioManage.MyServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMyServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Change owner of texture studio server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioManage.TransferOwnershipResponse> transferOwnership(
        texture_studio.TexturestudioManage.TransferOwnershipRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferOwnershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a texture studio server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioManage.DeleteServerResponse> deleteServer(
        texture_studio.TexturestudioManage.DeleteServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteServerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SERVER = 0;
  private static final int METHODID_GET_SERVERS = 1;
  private static final int METHODID_MY_SERVER = 2;
  private static final int METHODID_TRANSFER_OWNERSHIP = 3;
  private static final int METHODID_DELETE_SERVER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextureStudioManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextureStudioManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SERVER:
          serviceImpl.createServer((texture_studio.TexturestudioManage.CreateServerRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.CreateServerResponse>) responseObserver);
          break;
        case METHODID_GET_SERVERS:
          serviceImpl.getServers((texture_studio.TexturestudioManage.GetServersRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.GetServersResponse>) responseObserver);
          break;
        case METHODID_MY_SERVER:
          serviceImpl.myServer((texture_studio.TexturestudioManage.MyServerRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.MyServerResponse>) responseObserver);
          break;
        case METHODID_TRANSFER_OWNERSHIP:
          serviceImpl.transferOwnership((texture_studio.TexturestudioManage.TransferOwnershipRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.TransferOwnershipResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVER:
          serviceImpl.deleteServer((texture_studio.TexturestudioManage.DeleteServerRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioManage.DeleteServerResponse>) responseObserver);
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

  private static abstract class TextureStudioManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextureStudioManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return texture_studio.TexturestudioManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextureStudioManagerService");
    }
  }

  private static final class TextureStudioManagerServiceFileDescriptorSupplier
      extends TextureStudioManagerServiceBaseDescriptorSupplier {
    TextureStudioManagerServiceFileDescriptorSupplier() {}
  }

  private static final class TextureStudioManagerServiceMethodDescriptorSupplier
      extends TextureStudioManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextureStudioManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextureStudioManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextureStudioManagerServiceFileDescriptorSupplier())
              .addMethod(getCreateServerMethod())
              .addMethod(getGetServersMethod())
              .addMethod(getMyServerMethod())
              .addMethod(getTransferOwnershipMethod())
              .addMethod(getDeleteServerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
