package mruv.objects;

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
 *The MruV objects service provides procedures for game object models.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: objects/models.proto")
public final class MruVObjectModelsServiceGrpc {

  private MruVObjectModelsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.objects.MruVObjectModelsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.objects.Models.CreateObjectModelRequest,
      mruv.objects.Models.CreateObjectModelResponse> getCreateObjectModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObjectModel",
      requestType = mruv.objects.Models.CreateObjectModelRequest.class,
      responseType = mruv.objects.Models.CreateObjectModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Models.CreateObjectModelRequest,
      mruv.objects.Models.CreateObjectModelResponse> getCreateObjectModelMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Models.CreateObjectModelRequest, mruv.objects.Models.CreateObjectModelResponse> getCreateObjectModelMethod;
    if ((getCreateObjectModelMethod = MruVObjectModelsServiceGrpc.getCreateObjectModelMethod) == null) {
      synchronized (MruVObjectModelsServiceGrpc.class) {
        if ((getCreateObjectModelMethod = MruVObjectModelsServiceGrpc.getCreateObjectModelMethod) == null) {
          MruVObjectModelsServiceGrpc.getCreateObjectModelMethod = getCreateObjectModelMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Models.CreateObjectModelRequest, mruv.objects.Models.CreateObjectModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObjectModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.CreateObjectModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.CreateObjectModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectModelsServiceMethodDescriptorSupplier("CreateObjectModel"))
              .build();
        }
      }
    }
    return getCreateObjectModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Models.GetObjectModelRequest,
      mruv.objects.Models.GetObjectModelResponse> getGetObjectModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectModel",
      requestType = mruv.objects.Models.GetObjectModelRequest.class,
      responseType = mruv.objects.Models.GetObjectModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Models.GetObjectModelRequest,
      mruv.objects.Models.GetObjectModelResponse> getGetObjectModelMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Models.GetObjectModelRequest, mruv.objects.Models.GetObjectModelResponse> getGetObjectModelMethod;
    if ((getGetObjectModelMethod = MruVObjectModelsServiceGrpc.getGetObjectModelMethod) == null) {
      synchronized (MruVObjectModelsServiceGrpc.class) {
        if ((getGetObjectModelMethod = MruVObjectModelsServiceGrpc.getGetObjectModelMethod) == null) {
          MruVObjectModelsServiceGrpc.getGetObjectModelMethod = getGetObjectModelMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Models.GetObjectModelRequest, mruv.objects.Models.GetObjectModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.GetObjectModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.GetObjectModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectModelsServiceMethodDescriptorSupplier("GetObjectModel"))
              .build();
        }
      }
    }
    return getGetObjectModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Models.UpdateObjectModelRequest,
      mruv.objects.Models.UpdateObjectModelResponse> getUpdateObjectModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObjectModel",
      requestType = mruv.objects.Models.UpdateObjectModelRequest.class,
      responseType = mruv.objects.Models.UpdateObjectModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Models.UpdateObjectModelRequest,
      mruv.objects.Models.UpdateObjectModelResponse> getUpdateObjectModelMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Models.UpdateObjectModelRequest, mruv.objects.Models.UpdateObjectModelResponse> getUpdateObjectModelMethod;
    if ((getUpdateObjectModelMethod = MruVObjectModelsServiceGrpc.getUpdateObjectModelMethod) == null) {
      synchronized (MruVObjectModelsServiceGrpc.class) {
        if ((getUpdateObjectModelMethod = MruVObjectModelsServiceGrpc.getUpdateObjectModelMethod) == null) {
          MruVObjectModelsServiceGrpc.getUpdateObjectModelMethod = getUpdateObjectModelMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Models.UpdateObjectModelRequest, mruv.objects.Models.UpdateObjectModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObjectModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.UpdateObjectModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.UpdateObjectModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectModelsServiceMethodDescriptorSupplier("UpdateObjectModel"))
              .build();
        }
      }
    }
    return getUpdateObjectModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Models.DeleteObjectModelRequest,
      mruv.objects.Models.DeleteObjectModelResponse> getDeleteObjectModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectModel",
      requestType = mruv.objects.Models.DeleteObjectModelRequest.class,
      responseType = mruv.objects.Models.DeleteObjectModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Models.DeleteObjectModelRequest,
      mruv.objects.Models.DeleteObjectModelResponse> getDeleteObjectModelMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Models.DeleteObjectModelRequest, mruv.objects.Models.DeleteObjectModelResponse> getDeleteObjectModelMethod;
    if ((getDeleteObjectModelMethod = MruVObjectModelsServiceGrpc.getDeleteObjectModelMethod) == null) {
      synchronized (MruVObjectModelsServiceGrpc.class) {
        if ((getDeleteObjectModelMethod = MruVObjectModelsServiceGrpc.getDeleteObjectModelMethod) == null) {
          MruVObjectModelsServiceGrpc.getDeleteObjectModelMethod = getDeleteObjectModelMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Models.DeleteObjectModelRequest, mruv.objects.Models.DeleteObjectModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.DeleteObjectModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.DeleteObjectModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectModelsServiceMethodDescriptorSupplier("DeleteObjectModel"))
              .build();
        }
      }
    }
    return getDeleteObjectModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Models.FetchAllModelsRequest,
      mruv.objects.Models.FetchAllModelsResponse> getFetchAllModelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAllModels",
      requestType = mruv.objects.Models.FetchAllModelsRequest.class,
      responseType = mruv.objects.Models.FetchAllModelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.objects.Models.FetchAllModelsRequest,
      mruv.objects.Models.FetchAllModelsResponse> getFetchAllModelsMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Models.FetchAllModelsRequest, mruv.objects.Models.FetchAllModelsResponse> getFetchAllModelsMethod;
    if ((getFetchAllModelsMethod = MruVObjectModelsServiceGrpc.getFetchAllModelsMethod) == null) {
      synchronized (MruVObjectModelsServiceGrpc.class) {
        if ((getFetchAllModelsMethod = MruVObjectModelsServiceGrpc.getFetchAllModelsMethod) == null) {
          MruVObjectModelsServiceGrpc.getFetchAllModelsMethod = getFetchAllModelsMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Models.FetchAllModelsRequest, mruv.objects.Models.FetchAllModelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAllModels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.FetchAllModelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Models.FetchAllModelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectModelsServiceMethodDescriptorSupplier("FetchAllModels"))
              .build();
        }
      }
    }
    return getFetchAllModelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVObjectModelsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVObjectModelsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVObjectModelsServiceStub>() {
        @java.lang.Override
        public MruVObjectModelsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVObjectModelsServiceStub(channel, callOptions);
        }
      };
    return MruVObjectModelsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVObjectModelsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVObjectModelsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVObjectModelsServiceBlockingStub>() {
        @java.lang.Override
        public MruVObjectModelsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVObjectModelsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVObjectModelsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVObjectModelsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVObjectModelsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVObjectModelsServiceFutureStub>() {
        @java.lang.Override
        public MruVObjectModelsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVObjectModelsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVObjectModelsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game object models.
   * </pre>
   */
  public static abstract class MruVObjectModelsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an object model.
     * </pre>
     */
    public void createObjectModel(mruv.objects.Models.CreateObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.CreateObjectModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateObjectModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an object model.
     * </pre>
     */
    public void getObjectModel(mruv.objects.Models.GetObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.GetObjectModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an object model.
     * </pre>
     */
    public void updateObjectModel(mruv.objects.Models.UpdateObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.UpdateObjectModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateObjectModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an object model.
     * </pre>
     */
    public void deleteObjectModel(mruv.objects.Models.DeleteObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.DeleteObjectModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all models.
     * </pre>
     */
    public void fetchAllModels(mruv.objects.Models.FetchAllModelsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.FetchAllModelsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllModelsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateObjectModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Models.CreateObjectModelRequest,
                mruv.objects.Models.CreateObjectModelResponse>(
                  this, METHODID_CREATE_OBJECT_MODEL)))
          .addMethod(
            getGetObjectModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Models.GetObjectModelRequest,
                mruv.objects.Models.GetObjectModelResponse>(
                  this, METHODID_GET_OBJECT_MODEL)))
          .addMethod(
            getUpdateObjectModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Models.UpdateObjectModelRequest,
                mruv.objects.Models.UpdateObjectModelResponse>(
                  this, METHODID_UPDATE_OBJECT_MODEL)))
          .addMethod(
            getDeleteObjectModelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Models.DeleteObjectModelRequest,
                mruv.objects.Models.DeleteObjectModelResponse>(
                  this, METHODID_DELETE_OBJECT_MODEL)))
          .addMethod(
            getFetchAllModelsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.objects.Models.FetchAllModelsRequest,
                mruv.objects.Models.FetchAllModelsResponse>(
                  this, METHODID_FETCH_ALL_MODELS)))
          .build();
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game object models.
   * </pre>
   */
  public static final class MruVObjectModelsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVObjectModelsServiceStub> {
    private MruVObjectModelsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVObjectModelsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVObjectModelsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an object model.
     * </pre>
     */
    public void createObjectModel(mruv.objects.Models.CreateObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.CreateObjectModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateObjectModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an object model.
     * </pre>
     */
    public void getObjectModel(mruv.objects.Models.GetObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.GetObjectModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an object model.
     * </pre>
     */
    public void updateObjectModel(mruv.objects.Models.UpdateObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.UpdateObjectModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateObjectModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an object model.
     * </pre>
     */
    public void deleteObjectModel(mruv.objects.Models.DeleteObjectModelRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.DeleteObjectModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all models.
     * </pre>
     */
    public void fetchAllModels(mruv.objects.Models.FetchAllModelsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Models.FetchAllModelsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllModelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game object models.
   * </pre>
   */
  public static final class MruVObjectModelsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVObjectModelsServiceBlockingStub> {
    private MruVObjectModelsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVObjectModelsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVObjectModelsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an object model.
     * </pre>
     */
    public mruv.objects.Models.CreateObjectModelResponse createObjectModel(mruv.objects.Models.CreateObjectModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateObjectModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an object model.
     * </pre>
     */
    public mruv.objects.Models.GetObjectModelResponse getObjectModel(mruv.objects.Models.GetObjectModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an object model.
     * </pre>
     */
    public mruv.objects.Models.UpdateObjectModelResponse updateObjectModel(mruv.objects.Models.UpdateObjectModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateObjectModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an object model.
     * </pre>
     */
    public mruv.objects.Models.DeleteObjectModelResponse deleteObjectModel(mruv.objects.Models.DeleteObjectModelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all models.
     * </pre>
     */
    public java.util.Iterator<mruv.objects.Models.FetchAllModelsResponse> fetchAllModels(
        mruv.objects.Models.FetchAllModelsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllModelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game object models.
   * </pre>
   */
  public static final class MruVObjectModelsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVObjectModelsServiceFutureStub> {
    private MruVObjectModelsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVObjectModelsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVObjectModelsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an object model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Models.CreateObjectModelResponse> createObjectModel(
        mruv.objects.Models.CreateObjectModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateObjectModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an object model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Models.GetObjectModelResponse> getObjectModel(
        mruv.objects.Models.GetObjectModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an object model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Models.UpdateObjectModelResponse> updateObjectModel(
        mruv.objects.Models.UpdateObjectModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateObjectModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an object model.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Models.DeleteObjectModelResponse> deleteObjectModel(
        mruv.objects.Models.DeleteObjectModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectModelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT_MODEL = 0;
  private static final int METHODID_GET_OBJECT_MODEL = 1;
  private static final int METHODID_UPDATE_OBJECT_MODEL = 2;
  private static final int METHODID_DELETE_OBJECT_MODEL = 3;
  private static final int METHODID_FETCH_ALL_MODELS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVObjectModelsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVObjectModelsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OBJECT_MODEL:
          serviceImpl.createObjectModel((mruv.objects.Models.CreateObjectModelRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Models.CreateObjectModelResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_MODEL:
          serviceImpl.getObjectModel((mruv.objects.Models.GetObjectModelRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Models.GetObjectModelResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT_MODEL:
          serviceImpl.updateObjectModel((mruv.objects.Models.UpdateObjectModelRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Models.UpdateObjectModelResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_MODEL:
          serviceImpl.deleteObjectModel((mruv.objects.Models.DeleteObjectModelRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Models.DeleteObjectModelResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL_MODELS:
          serviceImpl.fetchAllModels((mruv.objects.Models.FetchAllModelsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Models.FetchAllModelsResponse>) responseObserver);
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

  private static abstract class MruVObjectModelsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVObjectModelsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.objects.Models.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVObjectModelsService");
    }
  }

  private static final class MruVObjectModelsServiceFileDescriptorSupplier
      extends MruVObjectModelsServiceBaseDescriptorSupplier {
    MruVObjectModelsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVObjectModelsServiceMethodDescriptorSupplier
      extends MruVObjectModelsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVObjectModelsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVObjectModelsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVObjectModelsServiceFileDescriptorSupplier())
              .addMethod(getCreateObjectModelMethod())
              .addMethod(getGetObjectModelMethod())
              .addMethod(getUpdateObjectModelMethod())
              .addMethod(getDeleteObjectModelMethod())
              .addMethod(getFetchAllModelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
