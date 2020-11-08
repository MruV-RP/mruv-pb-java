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
 * Service to manage texture studio server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: texturestudio/texturestudio_server.proto")
public final class TextureStudioServerServiceGrpc {

  private TextureStudioServerServiceGrpc() {}

  public static final String SERVICE_NAME = "texture_studio.TextureStudioServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.StartServerRequest,
      texture_studio.TexturestudioServer.StartServerResponse> getStartServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartServer",
      requestType = texture_studio.TexturestudioServer.StartServerRequest.class,
      responseType = texture_studio.TexturestudioServer.StartServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.StartServerRequest,
      texture_studio.TexturestudioServer.StartServerResponse> getStartServerMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.StartServerRequest, texture_studio.TexturestudioServer.StartServerResponse> getStartServerMethod;
    if ((getStartServerMethod = TextureStudioServerServiceGrpc.getStartServerMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getStartServerMethod = TextureStudioServerServiceGrpc.getStartServerMethod) == null) {
          TextureStudioServerServiceGrpc.getStartServerMethod = getStartServerMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.StartServerRequest, texture_studio.TexturestudioServer.StartServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.StartServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.StartServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("StartServer"))
              .build();
        }
      }
    }
    return getStartServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.StopServerRequest,
      texture_studio.TexturestudioServer.StopServerResponse> getStopServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopServer",
      requestType = texture_studio.TexturestudioServer.StopServerRequest.class,
      responseType = texture_studio.TexturestudioServer.StopServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.StopServerRequest,
      texture_studio.TexturestudioServer.StopServerResponse> getStopServerMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.StopServerRequest, texture_studio.TexturestudioServer.StopServerResponse> getStopServerMethod;
    if ((getStopServerMethod = TextureStudioServerServiceGrpc.getStopServerMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getStopServerMethod = TextureStudioServerServiceGrpc.getStopServerMethod) == null) {
          TextureStudioServerServiceGrpc.getStopServerMethod = getStopServerMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.StopServerRequest, texture_studio.TexturestudioServer.StopServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.StopServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.StopServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("StopServer"))
              .build();
        }
      }
    }
    return getStopServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.RestartServerRequest,
      texture_studio.TexturestudioServer.RestartServerResponse> getRestartServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestartServer",
      requestType = texture_studio.TexturestudioServer.RestartServerRequest.class,
      responseType = texture_studio.TexturestudioServer.RestartServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.RestartServerRequest,
      texture_studio.TexturestudioServer.RestartServerResponse> getRestartServerMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.RestartServerRequest, texture_studio.TexturestudioServer.RestartServerResponse> getRestartServerMethod;
    if ((getRestartServerMethod = TextureStudioServerServiceGrpc.getRestartServerMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getRestartServerMethod = TextureStudioServerServiceGrpc.getRestartServerMethod) == null) {
          TextureStudioServerServiceGrpc.getRestartServerMethod = getRestartServerMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.RestartServerRequest, texture_studio.TexturestudioServer.RestartServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestartServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.RestartServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.RestartServerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("RestartServer"))
              .build();
        }
      }
    }
    return getRestartServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.ServerStatusRequest,
      texture_studio.TexturestudioServer.ServerStatusResponse> getServerStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStatus",
      requestType = texture_studio.TexturestudioServer.ServerStatusRequest.class,
      responseType = texture_studio.TexturestudioServer.ServerStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.ServerStatusRequest,
      texture_studio.TexturestudioServer.ServerStatusResponse> getServerStatusMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.ServerStatusRequest, texture_studio.TexturestudioServer.ServerStatusResponse> getServerStatusMethod;
    if ((getServerStatusMethod = TextureStudioServerServiceGrpc.getServerStatusMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getServerStatusMethod = TextureStudioServerServiceGrpc.getServerStatusMethod) == null) {
          TextureStudioServerServiceGrpc.getServerStatusMethod = getServerStatusMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.ServerStatusRequest, texture_studio.TexturestudioServer.ServerStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.ServerStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.ServerStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("ServerStatus"))
              .build();
        }
      }
    }
    return getServerStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.UploadProjectRequest,
      texture_studio.TexturestudioServer.UploadProjectResponse> getUploadProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadProject",
      requestType = texture_studio.TexturestudioServer.UploadProjectRequest.class,
      responseType = texture_studio.TexturestudioServer.UploadProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.UploadProjectRequest,
      texture_studio.TexturestudioServer.UploadProjectResponse> getUploadProjectMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.UploadProjectRequest, texture_studio.TexturestudioServer.UploadProjectResponse> getUploadProjectMethod;
    if ((getUploadProjectMethod = TextureStudioServerServiceGrpc.getUploadProjectMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getUploadProjectMethod = TextureStudioServerServiceGrpc.getUploadProjectMethod) == null) {
          TextureStudioServerServiceGrpc.getUploadProjectMethod = getUploadProjectMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.UploadProjectRequest, texture_studio.TexturestudioServer.UploadProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.UploadProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.UploadProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("UploadProject"))
              .build();
        }
      }
    }
    return getUploadProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.GetProjectRequest,
      texture_studio.TexturestudioServer.GetProjectResponse> getGetProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProject",
      requestType = texture_studio.TexturestudioServer.GetProjectRequest.class,
      responseType = texture_studio.TexturestudioServer.GetProjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.GetProjectRequest,
      texture_studio.TexturestudioServer.GetProjectResponse> getGetProjectMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.GetProjectRequest, texture_studio.TexturestudioServer.GetProjectResponse> getGetProjectMethod;
    if ((getGetProjectMethod = TextureStudioServerServiceGrpc.getGetProjectMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getGetProjectMethod = TextureStudioServerServiceGrpc.getGetProjectMethod) == null) {
          TextureStudioServerServiceGrpc.getGetProjectMethod = getGetProjectMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.GetProjectRequest, texture_studio.TexturestudioServer.GetProjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.GetProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.GetProjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("GetProject"))
              .build();
        }
      }
    }
    return getGetProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.GetProjectsRequest,
      texture_studio.TexturestudioServer.GetProjectsResponse> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProjects",
      requestType = texture_studio.TexturestudioServer.GetProjectsRequest.class,
      responseType = texture_studio.TexturestudioServer.GetProjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.GetProjectsRequest,
      texture_studio.TexturestudioServer.GetProjectsResponse> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.GetProjectsRequest, texture_studio.TexturestudioServer.GetProjectsResponse> getGetProjectsMethod;
    if ((getGetProjectsMethod = TextureStudioServerServiceGrpc.getGetProjectsMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getGetProjectsMethod = TextureStudioServerServiceGrpc.getGetProjectsMethod) == null) {
          TextureStudioServerServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.GetProjectsRequest, texture_studio.TexturestudioServer.GetProjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.GetProjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.GetProjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("GetProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest,
      texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse> getSubscribeToProjectsChangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToProjectsChanges",
      requestType = texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest.class,
      responseType = texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest,
      texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse> getSubscribeToProjectsChangesMethod() {
    io.grpc.MethodDescriptor<texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest, texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse> getSubscribeToProjectsChangesMethod;
    if ((getSubscribeToProjectsChangesMethod = TextureStudioServerServiceGrpc.getSubscribeToProjectsChangesMethod) == null) {
      synchronized (TextureStudioServerServiceGrpc.class) {
        if ((getSubscribeToProjectsChangesMethod = TextureStudioServerServiceGrpc.getSubscribeToProjectsChangesMethod) == null) {
          TextureStudioServerServiceGrpc.getSubscribeToProjectsChangesMethod = getSubscribeToProjectsChangesMethod =
              io.grpc.MethodDescriptor.<texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest, texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToProjectsChanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TextureStudioServerServiceMethodDescriptorSupplier("SubscribeToProjectsChanges"))
              .build();
        }
      }
    }
    return getSubscribeToProjectsChangesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextureStudioServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextureStudioServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextureStudioServerServiceStub>() {
        @java.lang.Override
        public TextureStudioServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextureStudioServerServiceStub(channel, callOptions);
        }
      };
    return TextureStudioServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextureStudioServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextureStudioServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextureStudioServerServiceBlockingStub>() {
        @java.lang.Override
        public TextureStudioServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextureStudioServerServiceBlockingStub(channel, callOptions);
        }
      };
    return TextureStudioServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextureStudioServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TextureStudioServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TextureStudioServerServiceFutureStub>() {
        @java.lang.Override
        public TextureStudioServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TextureStudioServerServiceFutureStub(channel, callOptions);
        }
      };
    return TextureStudioServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage texture studio server.
   * </pre>
   */
  public static abstract class TextureStudioServerServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Start a texture studio server.
     * </pre>
     */
    public void startServer(texture_studio.TexturestudioServer.StartServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.StartServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stop a texture studio server.
     * </pre>
     */
    public void stopServer(texture_studio.TexturestudioServer.StopServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.StopServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStopServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Restart a texture studio server.
     * </pre>
     */
    public void restartServer(texture_studio.TexturestudioServer.RestartServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.RestartServerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRestartServerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get texture studio server status.
     * </pre>
     */
    public void serverStatus(texture_studio.TexturestudioServer.ServerStatusRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.ServerStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Upload project to texture studio.
     * </pre>
     */
    public void uploadProject(texture_studio.TexturestudioServer.UploadProjectRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.UploadProjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get texture-studio objects project.
     * </pre>
     */
    public void getProject(texture_studio.TexturestudioServer.GetProjectRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.GetProjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all projects.
     * </pre>
     */
    public void getProjects(texture_studio.TexturestudioServer.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.GetProjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Listen for project changes - if texture studio project has been created or modified, this will trigger an event.
     * </pre>
     */
    public void subscribeToProjectsChanges(texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeToProjectsChangesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.StartServerRequest,
                texture_studio.TexturestudioServer.StartServerResponse>(
                  this, METHODID_START_SERVER)))
          .addMethod(
            getStopServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.StopServerRequest,
                texture_studio.TexturestudioServer.StopServerResponse>(
                  this, METHODID_STOP_SERVER)))
          .addMethod(
            getRestartServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.RestartServerRequest,
                texture_studio.TexturestudioServer.RestartServerResponse>(
                  this, METHODID_RESTART_SERVER)))
          .addMethod(
            getServerStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.ServerStatusRequest,
                texture_studio.TexturestudioServer.ServerStatusResponse>(
                  this, METHODID_SERVER_STATUS)))
          .addMethod(
            getUploadProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.UploadProjectRequest,
                texture_studio.TexturestudioServer.UploadProjectResponse>(
                  this, METHODID_UPLOAD_PROJECT)))
          .addMethod(
            getGetProjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.GetProjectRequest,
                texture_studio.TexturestudioServer.GetProjectResponse>(
                  this, METHODID_GET_PROJECT)))
          .addMethod(
            getGetProjectsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.GetProjectsRequest,
                texture_studio.TexturestudioServer.GetProjectsResponse>(
                  this, METHODID_GET_PROJECTS)))
          .addMethod(
            getSubscribeToProjectsChangesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest,
                texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse>(
                  this, METHODID_SUBSCRIBE_TO_PROJECTS_CHANGES)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage texture studio server.
   * </pre>
   */
  public static final class TextureStudioServerServiceStub extends io.grpc.stub.AbstractAsyncStub<TextureStudioServerServiceStub> {
    private TextureStudioServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextureStudioServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextureStudioServerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a texture studio server.
     * </pre>
     */
    public void startServer(texture_studio.TexturestudioServer.StartServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.StartServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stop a texture studio server.
     * </pre>
     */
    public void stopServer(texture_studio.TexturestudioServer.StopServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.StopServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Restart a texture studio server.
     * </pre>
     */
    public void restartServer(texture_studio.TexturestudioServer.RestartServerRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.RestartServerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestartServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get texture studio server status.
     * </pre>
     */
    public void serverStatus(texture_studio.TexturestudioServer.ServerStatusRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.ServerStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getServerStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Upload project to texture studio.
     * </pre>
     */
    public void uploadProject(texture_studio.TexturestudioServer.UploadProjectRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.UploadProjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUploadProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get texture-studio objects project.
     * </pre>
     */
    public void getProject(texture_studio.TexturestudioServer.GetProjectRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.GetProjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all projects.
     * </pre>
     */
    public void getProjects(texture_studio.TexturestudioServer.GetProjectsRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.GetProjectsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Listen for project changes - if texture studio project has been created or modified, this will trigger an event.
     * </pre>
     */
    public void subscribeToProjectsChanges(texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest request,
        io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeToProjectsChangesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage texture studio server.
   * </pre>
   */
  public static final class TextureStudioServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TextureStudioServerServiceBlockingStub> {
    private TextureStudioServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextureStudioServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextureStudioServerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a texture studio server.
     * </pre>
     */
    public texture_studio.TexturestudioServer.StartServerResponse startServer(texture_studio.TexturestudioServer.StartServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stop a texture studio server.
     * </pre>
     */
    public texture_studio.TexturestudioServer.StopServerResponse stopServer(texture_studio.TexturestudioServer.StopServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getStopServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Restart a texture studio server.
     * </pre>
     */
    public texture_studio.TexturestudioServer.RestartServerResponse restartServer(texture_studio.TexturestudioServer.RestartServerRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestartServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get texture studio server status.
     * </pre>
     */
    public texture_studio.TexturestudioServer.ServerStatusResponse serverStatus(texture_studio.TexturestudioServer.ServerStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getServerStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Upload project to texture studio.
     * </pre>
     */
    public texture_studio.TexturestudioServer.UploadProjectResponse uploadProject(texture_studio.TexturestudioServer.UploadProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getUploadProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get texture-studio objects project.
     * </pre>
     */
    public texture_studio.TexturestudioServer.GetProjectResponse getProject(texture_studio.TexturestudioServer.GetProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all projects.
     * </pre>
     */
    public texture_studio.TexturestudioServer.GetProjectsResponse getProjects(texture_studio.TexturestudioServer.GetProjectsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Listen for project changes - if texture studio project has been created or modified, this will trigger an event.
     * </pre>
     */
    public java.util.Iterator<texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse> subscribeToProjectsChanges(
        texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeToProjectsChangesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage texture studio server.
   * </pre>
   */
  public static final class TextureStudioServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TextureStudioServerServiceFutureStub> {
    private TextureStudioServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextureStudioServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TextureStudioServerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Start a texture studio server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.StartServerResponse> startServer(
        texture_studio.TexturestudioServer.StartServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Stop a texture studio server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.StopServerResponse> stopServer(
        texture_studio.TexturestudioServer.StopServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStopServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Restart a texture studio server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.RestartServerResponse> restartServer(
        texture_studio.TexturestudioServer.RestartServerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestartServerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get texture studio server status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.ServerStatusResponse> serverStatus(
        texture_studio.TexturestudioServer.ServerStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getServerStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Upload project to texture studio.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.UploadProjectResponse> uploadProject(
        texture_studio.TexturestudioServer.UploadProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUploadProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get texture-studio objects project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.GetProjectResponse> getProject(
        texture_studio.TexturestudioServer.GetProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all projects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<texture_studio.TexturestudioServer.GetProjectsResponse> getProjects(
        texture_studio.TexturestudioServer.GetProjectsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_SERVER = 0;
  private static final int METHODID_STOP_SERVER = 1;
  private static final int METHODID_RESTART_SERVER = 2;
  private static final int METHODID_SERVER_STATUS = 3;
  private static final int METHODID_UPLOAD_PROJECT = 4;
  private static final int METHODID_GET_PROJECT = 5;
  private static final int METHODID_GET_PROJECTS = 6;
  private static final int METHODID_SUBSCRIBE_TO_PROJECTS_CHANGES = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextureStudioServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextureStudioServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_SERVER:
          serviceImpl.startServer((texture_studio.TexturestudioServer.StartServerRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.StartServerResponse>) responseObserver);
          break;
        case METHODID_STOP_SERVER:
          serviceImpl.stopServer((texture_studio.TexturestudioServer.StopServerRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.StopServerResponse>) responseObserver);
          break;
        case METHODID_RESTART_SERVER:
          serviceImpl.restartServer((texture_studio.TexturestudioServer.RestartServerRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.RestartServerResponse>) responseObserver);
          break;
        case METHODID_SERVER_STATUS:
          serviceImpl.serverStatus((texture_studio.TexturestudioServer.ServerStatusRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.ServerStatusResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_PROJECT:
          serviceImpl.uploadProject((texture_studio.TexturestudioServer.UploadProjectRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.UploadProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECT:
          serviceImpl.getProject((texture_studio.TexturestudioServer.GetProjectRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.GetProjectResponse>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((texture_studio.TexturestudioServer.GetProjectsRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.GetProjectsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_PROJECTS_CHANGES:
          serviceImpl.subscribeToProjectsChanges((texture_studio.TexturestudioServer.SubscribeToProjectsChangesRequest) request,
              (io.grpc.stub.StreamObserver<texture_studio.TexturestudioServer.SubscribeToProjectsChangesResponse>) responseObserver);
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

  private static abstract class TextureStudioServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextureStudioServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return texture_studio.TexturestudioServer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextureStudioServerService");
    }
  }

  private static final class TextureStudioServerServiceFileDescriptorSupplier
      extends TextureStudioServerServiceBaseDescriptorSupplier {
    TextureStudioServerServiceFileDescriptorSupplier() {}
  }

  private static final class TextureStudioServerServiceMethodDescriptorSupplier
      extends TextureStudioServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextureStudioServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TextureStudioServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextureStudioServerServiceFileDescriptorSupplier())
              .addMethod(getStartServerMethod())
              .addMethod(getStopServerMethod())
              .addMethod(getRestartServerMethod())
              .addMethod(getServerStatusMethod())
              .addMethod(getUploadProjectMethod())
              .addMethod(getGetProjectMethod())
              .addMethod(getGetProjectsMethod())
              .addMethod(getSubscribeToProjectsChangesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
