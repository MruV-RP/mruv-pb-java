package mruv.spots;

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
 * The MruV spots service provides procedures for managing spots.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: spots/spots.proto")
public final class MruVSpotsServiceGrpc {

  private MruVSpotsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.spots.MruVSpotsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.spots.Spots.CreateSpotRequest,
      mruv.spots.Spots.CreateSpotResponse> getCreateSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSpot",
      requestType = mruv.spots.Spots.CreateSpotRequest.class,
      responseType = mruv.spots.Spots.CreateSpotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.spots.Spots.CreateSpotRequest,
      mruv.spots.Spots.CreateSpotResponse> getCreateSpotMethod() {
    io.grpc.MethodDescriptor<mruv.spots.Spots.CreateSpotRequest, mruv.spots.Spots.CreateSpotResponse> getCreateSpotMethod;
    if ((getCreateSpotMethod = MruVSpotsServiceGrpc.getCreateSpotMethod) == null) {
      synchronized (MruVSpotsServiceGrpc.class) {
        if ((getCreateSpotMethod = MruVSpotsServiceGrpc.getCreateSpotMethod) == null) {
          MruVSpotsServiceGrpc.getCreateSpotMethod = getCreateSpotMethod =
              io.grpc.MethodDescriptor.<mruv.spots.Spots.CreateSpotRequest, mruv.spots.Spots.CreateSpotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.CreateSpotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.CreateSpotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVSpotsServiceMethodDescriptorSupplier("CreateSpot"))
              .build();
        }
      }
    }
    return getCreateSpotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.spots.Spots.GetSpotRequest,
      mruv.spots.Spots.GetSpotResponse> getGetSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSpot",
      requestType = mruv.spots.Spots.GetSpotRequest.class,
      responseType = mruv.spots.Spots.GetSpotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.spots.Spots.GetSpotRequest,
      mruv.spots.Spots.GetSpotResponse> getGetSpotMethod() {
    io.grpc.MethodDescriptor<mruv.spots.Spots.GetSpotRequest, mruv.spots.Spots.GetSpotResponse> getGetSpotMethod;
    if ((getGetSpotMethod = MruVSpotsServiceGrpc.getGetSpotMethod) == null) {
      synchronized (MruVSpotsServiceGrpc.class) {
        if ((getGetSpotMethod = MruVSpotsServiceGrpc.getGetSpotMethod) == null) {
          MruVSpotsServiceGrpc.getGetSpotMethod = getGetSpotMethod =
              io.grpc.MethodDescriptor.<mruv.spots.Spots.GetSpotRequest, mruv.spots.Spots.GetSpotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.GetSpotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.GetSpotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVSpotsServiceMethodDescriptorSupplier("GetSpot"))
              .build();
        }
      }
    }
    return getGetSpotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.spots.Spots.UpdateSpotRequest,
      mruv.spots.Spots.UpdateSpotResponse> getUpdateSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSpot",
      requestType = mruv.spots.Spots.UpdateSpotRequest.class,
      responseType = mruv.spots.Spots.UpdateSpotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.spots.Spots.UpdateSpotRequest,
      mruv.spots.Spots.UpdateSpotResponse> getUpdateSpotMethod() {
    io.grpc.MethodDescriptor<mruv.spots.Spots.UpdateSpotRequest, mruv.spots.Spots.UpdateSpotResponse> getUpdateSpotMethod;
    if ((getUpdateSpotMethod = MruVSpotsServiceGrpc.getUpdateSpotMethod) == null) {
      synchronized (MruVSpotsServiceGrpc.class) {
        if ((getUpdateSpotMethod = MruVSpotsServiceGrpc.getUpdateSpotMethod) == null) {
          MruVSpotsServiceGrpc.getUpdateSpotMethod = getUpdateSpotMethod =
              io.grpc.MethodDescriptor.<mruv.spots.Spots.UpdateSpotRequest, mruv.spots.Spots.UpdateSpotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.UpdateSpotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.UpdateSpotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVSpotsServiceMethodDescriptorSupplier("UpdateSpot"))
              .build();
        }
      }
    }
    return getUpdateSpotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.spots.Spots.DeleteSpotRequest,
      mruv.spots.Spots.DeleteSpotResponse> getDeleteSpotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSpot",
      requestType = mruv.spots.Spots.DeleteSpotRequest.class,
      responseType = mruv.spots.Spots.DeleteSpotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.spots.Spots.DeleteSpotRequest,
      mruv.spots.Spots.DeleteSpotResponse> getDeleteSpotMethod() {
    io.grpc.MethodDescriptor<mruv.spots.Spots.DeleteSpotRequest, mruv.spots.Spots.DeleteSpotResponse> getDeleteSpotMethod;
    if ((getDeleteSpotMethod = MruVSpotsServiceGrpc.getDeleteSpotMethod) == null) {
      synchronized (MruVSpotsServiceGrpc.class) {
        if ((getDeleteSpotMethod = MruVSpotsServiceGrpc.getDeleteSpotMethod) == null) {
          MruVSpotsServiceGrpc.getDeleteSpotMethod = getDeleteSpotMethod =
              io.grpc.MethodDescriptor.<mruv.spots.Spots.DeleteSpotRequest, mruv.spots.Spots.DeleteSpotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSpot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.DeleteSpotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.DeleteSpotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVSpotsServiceMethodDescriptorSupplier("DeleteSpot"))
              .build();
        }
      }
    }
    return getDeleteSpotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.spots.Spots.FetchAllSpotsRequest,
      mruv.spots.Spots.FetchAllSpotsResponse> getFetchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAll",
      requestType = mruv.spots.Spots.FetchAllSpotsRequest.class,
      responseType = mruv.spots.Spots.FetchAllSpotsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.spots.Spots.FetchAllSpotsRequest,
      mruv.spots.Spots.FetchAllSpotsResponse> getFetchAllMethod() {
    io.grpc.MethodDescriptor<mruv.spots.Spots.FetchAllSpotsRequest, mruv.spots.Spots.FetchAllSpotsResponse> getFetchAllMethod;
    if ((getFetchAllMethod = MruVSpotsServiceGrpc.getFetchAllMethod) == null) {
      synchronized (MruVSpotsServiceGrpc.class) {
        if ((getFetchAllMethod = MruVSpotsServiceGrpc.getFetchAllMethod) == null) {
          MruVSpotsServiceGrpc.getFetchAllMethod = getFetchAllMethod =
              io.grpc.MethodDescriptor.<mruv.spots.Spots.FetchAllSpotsRequest, mruv.spots.Spots.FetchAllSpotsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.FetchAllSpotsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.spots.Spots.FetchAllSpotsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVSpotsServiceMethodDescriptorSupplier("FetchAll"))
              .build();
        }
      }
    }
    return getFetchAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVSpotsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVSpotsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVSpotsServiceStub>() {
        @java.lang.Override
        public MruVSpotsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVSpotsServiceStub(channel, callOptions);
        }
      };
    return MruVSpotsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVSpotsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVSpotsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVSpotsServiceBlockingStub>() {
        @java.lang.Override
        public MruVSpotsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVSpotsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVSpotsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVSpotsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVSpotsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVSpotsServiceFutureStub>() {
        @java.lang.Override
        public MruVSpotsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVSpotsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVSpotsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV spots service provides procedures for managing spots.
   * </pre>
   */
  public static abstract class MruVSpotsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a spot.
     * </pre>
     */
    public void createSpot(mruv.spots.Spots.CreateSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.CreateSpotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateSpotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a spot.
     * </pre>
     */
    public void getSpot(mruv.spots.Spots.GetSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.GetSpotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSpotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a spot.
     * </pre>
     */
    public void updateSpot(mruv.spots.Spots.UpdateSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.UpdateSpotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSpotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a spot.
     * </pre>
     */
    public void deleteSpot(mruv.spots.Spots.DeleteSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.DeleteSpotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSpotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch all spots.
     * </pre>
     */
    public void fetchAll(mruv.spots.Spots.FetchAllSpotsRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.FetchAllSpotsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSpotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.spots.Spots.CreateSpotRequest,
                mruv.spots.Spots.CreateSpotResponse>(
                  this, METHODID_CREATE_SPOT)))
          .addMethod(
            getGetSpotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.spots.Spots.GetSpotRequest,
                mruv.spots.Spots.GetSpotResponse>(
                  this, METHODID_GET_SPOT)))
          .addMethod(
            getUpdateSpotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.spots.Spots.UpdateSpotRequest,
                mruv.spots.Spots.UpdateSpotResponse>(
                  this, METHODID_UPDATE_SPOT)))
          .addMethod(
            getDeleteSpotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.spots.Spots.DeleteSpotRequest,
                mruv.spots.Spots.DeleteSpotResponse>(
                  this, METHODID_DELETE_SPOT)))
          .addMethod(
            getFetchAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.spots.Spots.FetchAllSpotsRequest,
                mruv.spots.Spots.FetchAllSpotsResponse>(
                  this, METHODID_FETCH_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV spots service provides procedures for managing spots.
   * </pre>
   */
  public static final class MruVSpotsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVSpotsServiceStub> {
    private MruVSpotsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVSpotsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVSpotsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a spot.
     * </pre>
     */
    public void createSpot(mruv.spots.Spots.CreateSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.CreateSpotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateSpotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a spot.
     * </pre>
     */
    public void getSpot(mruv.spots.Spots.GetSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.GetSpotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSpotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a spot.
     * </pre>
     */
    public void updateSpot(mruv.spots.Spots.UpdateSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.UpdateSpotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSpotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a spot.
     * </pre>
     */
    public void deleteSpot(mruv.spots.Spots.DeleteSpotRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.DeleteSpotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSpotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch all spots.
     * </pre>
     */
    public void fetchAll(mruv.spots.Spots.FetchAllSpotsRequest request,
        io.grpc.stub.StreamObserver<mruv.spots.Spots.FetchAllSpotsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV spots service provides procedures for managing spots.
   * </pre>
   */
  public static final class MruVSpotsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVSpotsServiceBlockingStub> {
    private MruVSpotsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVSpotsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVSpotsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a spot.
     * </pre>
     */
    public mruv.spots.Spots.CreateSpotResponse createSpot(mruv.spots.Spots.CreateSpotRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateSpotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a spot.
     * </pre>
     */
    public mruv.spots.Spots.GetSpotResponse getSpot(mruv.spots.Spots.GetSpotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSpotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a spot.
     * </pre>
     */
    public mruv.spots.Spots.UpdateSpotResponse updateSpot(mruv.spots.Spots.UpdateSpotRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSpotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a spot.
     * </pre>
     */
    public mruv.spots.Spots.DeleteSpotResponse deleteSpot(mruv.spots.Spots.DeleteSpotRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSpotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch all spots.
     * </pre>
     */
    public java.util.Iterator<mruv.spots.Spots.FetchAllSpotsResponse> fetchAll(
        mruv.spots.Spots.FetchAllSpotsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV spots service provides procedures for managing spots.
   * </pre>
   */
  public static final class MruVSpotsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVSpotsServiceFutureStub> {
    private MruVSpotsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVSpotsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVSpotsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a spot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.spots.Spots.CreateSpotResponse> createSpot(
        mruv.spots.Spots.CreateSpotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateSpotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a spot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.spots.Spots.GetSpotResponse> getSpot(
        mruv.spots.Spots.GetSpotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSpotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a spot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.spots.Spots.UpdateSpotResponse> updateSpot(
        mruv.spots.Spots.UpdateSpotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSpotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a spot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.spots.Spots.DeleteSpotResponse> deleteSpot(
        mruv.spots.Spots.DeleteSpotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSpotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SPOT = 0;
  private static final int METHODID_GET_SPOT = 1;
  private static final int METHODID_UPDATE_SPOT = 2;
  private static final int METHODID_DELETE_SPOT = 3;
  private static final int METHODID_FETCH_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVSpotsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVSpotsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SPOT:
          serviceImpl.createSpot((mruv.spots.Spots.CreateSpotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.spots.Spots.CreateSpotResponse>) responseObserver);
          break;
        case METHODID_GET_SPOT:
          serviceImpl.getSpot((mruv.spots.Spots.GetSpotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.spots.Spots.GetSpotResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SPOT:
          serviceImpl.updateSpot((mruv.spots.Spots.UpdateSpotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.spots.Spots.UpdateSpotResponse>) responseObserver);
          break;
        case METHODID_DELETE_SPOT:
          serviceImpl.deleteSpot((mruv.spots.Spots.DeleteSpotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.spots.Spots.DeleteSpotResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL:
          serviceImpl.fetchAll((mruv.spots.Spots.FetchAllSpotsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.spots.Spots.FetchAllSpotsResponse>) responseObserver);
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

  private static abstract class MruVSpotsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVSpotsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.spots.Spots.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVSpotsService");
    }
  }

  private static final class MruVSpotsServiceFileDescriptorSupplier
      extends MruVSpotsServiceBaseDescriptorSupplier {
    MruVSpotsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVSpotsServiceMethodDescriptorSupplier
      extends MruVSpotsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVSpotsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVSpotsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVSpotsServiceFileDescriptorSupplier())
              .addMethod(getCreateSpotMethod())
              .addMethod(getGetSpotMethod())
              .addMethod(getUpdateSpotMethod())
              .addMethod(getDeleteSpotMethod())
              .addMethod(getFetchAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
