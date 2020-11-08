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
 *The MruV objects service provides procedures for movable game objects.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: objects/movable.proto")
public final class MruVMovableObjectsServiceGrpc {

  private MruVMovableObjectsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.objects.MruVMovableObjectsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.CreateMovableObjectRequest,
      mruv.objects.Movable.CreateMovableObjectResponse> getCreateMovableObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMovableObject",
      requestType = mruv.objects.Movable.CreateMovableObjectRequest.class,
      responseType = mruv.objects.Movable.CreateMovableObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.CreateMovableObjectRequest,
      mruv.objects.Movable.CreateMovableObjectResponse> getCreateMovableObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.CreateMovableObjectRequest, mruv.objects.Movable.CreateMovableObjectResponse> getCreateMovableObjectMethod;
    if ((getCreateMovableObjectMethod = MruVMovableObjectsServiceGrpc.getCreateMovableObjectMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getCreateMovableObjectMethod = MruVMovableObjectsServiceGrpc.getCreateMovableObjectMethod) == null) {
          MruVMovableObjectsServiceGrpc.getCreateMovableObjectMethod = getCreateMovableObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.CreateMovableObjectRequest, mruv.objects.Movable.CreateMovableObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMovableObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.CreateMovableObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.CreateMovableObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("CreateMovableObject"))
              .build();
        }
      }
    }
    return getCreateMovableObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.GetMovableObjectRequest,
      mruv.objects.Movable.GetMovableObjectResponse> getGetMovableObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovableObject",
      requestType = mruv.objects.Movable.GetMovableObjectRequest.class,
      responseType = mruv.objects.Movable.GetMovableObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.GetMovableObjectRequest,
      mruv.objects.Movable.GetMovableObjectResponse> getGetMovableObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.GetMovableObjectRequest, mruv.objects.Movable.GetMovableObjectResponse> getGetMovableObjectMethod;
    if ((getGetMovableObjectMethod = MruVMovableObjectsServiceGrpc.getGetMovableObjectMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getGetMovableObjectMethod = MruVMovableObjectsServiceGrpc.getGetMovableObjectMethod) == null) {
          MruVMovableObjectsServiceGrpc.getGetMovableObjectMethod = getGetMovableObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.GetMovableObjectRequest, mruv.objects.Movable.GetMovableObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMovableObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.GetMovableObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.GetMovableObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("GetMovableObject"))
              .build();
        }
      }
    }
    return getGetMovableObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.UpdateMovableObjectRequest,
      mruv.objects.Movable.UpdateMovableObjectResponse> getUpdateMovableObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMovableObject",
      requestType = mruv.objects.Movable.UpdateMovableObjectRequest.class,
      responseType = mruv.objects.Movable.UpdateMovableObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.UpdateMovableObjectRequest,
      mruv.objects.Movable.UpdateMovableObjectResponse> getUpdateMovableObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.UpdateMovableObjectRequest, mruv.objects.Movable.UpdateMovableObjectResponse> getUpdateMovableObjectMethod;
    if ((getUpdateMovableObjectMethod = MruVMovableObjectsServiceGrpc.getUpdateMovableObjectMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getUpdateMovableObjectMethod = MruVMovableObjectsServiceGrpc.getUpdateMovableObjectMethod) == null) {
          MruVMovableObjectsServiceGrpc.getUpdateMovableObjectMethod = getUpdateMovableObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.UpdateMovableObjectRequest, mruv.objects.Movable.UpdateMovableObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMovableObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.UpdateMovableObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.UpdateMovableObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("UpdateMovableObject"))
              .build();
        }
      }
    }
    return getUpdateMovableObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.DeleteMovableObjectRequest,
      mruv.objects.Movable.DeleteMovableObjectResponse> getDeleteMovableObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMovableObject",
      requestType = mruv.objects.Movable.DeleteMovableObjectRequest.class,
      responseType = mruv.objects.Movable.DeleteMovableObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.DeleteMovableObjectRequest,
      mruv.objects.Movable.DeleteMovableObjectResponse> getDeleteMovableObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.DeleteMovableObjectRequest, mruv.objects.Movable.DeleteMovableObjectResponse> getDeleteMovableObjectMethod;
    if ((getDeleteMovableObjectMethod = MruVMovableObjectsServiceGrpc.getDeleteMovableObjectMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getDeleteMovableObjectMethod = MruVMovableObjectsServiceGrpc.getDeleteMovableObjectMethod) == null) {
          MruVMovableObjectsServiceGrpc.getDeleteMovableObjectMethod = getDeleteMovableObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.DeleteMovableObjectRequest, mruv.objects.Movable.DeleteMovableObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMovableObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.DeleteMovableObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.DeleteMovableObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("DeleteMovableObject"))
              .build();
        }
      }
    }
    return getDeleteMovableObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectRequest,
      mruv.objects.Movable.MoveObjectResponse> getMoveObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveObject",
      requestType = mruv.objects.Movable.MoveObjectRequest.class,
      responseType = mruv.objects.Movable.MoveObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectRequest,
      mruv.objects.Movable.MoveObjectResponse> getMoveObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectRequest, mruv.objects.Movable.MoveObjectResponse> getMoveObjectMethod;
    if ((getMoveObjectMethod = MruVMovableObjectsServiceGrpc.getMoveObjectMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getMoveObjectMethod = MruVMovableObjectsServiceGrpc.getMoveObjectMethod) == null) {
          MruVMovableObjectsServiceGrpc.getMoveObjectMethod = getMoveObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.MoveObjectRequest, mruv.objects.Movable.MoveObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.MoveObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.MoveObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("MoveObject"))
              .build();
        }
      }
    }
    return getMoveObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectNextRequest,
      mruv.objects.Movable.MoveObjectNextResponse> getMoveObjectNextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveObjectNext",
      requestType = mruv.objects.Movable.MoveObjectNextRequest.class,
      responseType = mruv.objects.Movable.MoveObjectNextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectNextRequest,
      mruv.objects.Movable.MoveObjectNextResponse> getMoveObjectNextMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectNextRequest, mruv.objects.Movable.MoveObjectNextResponse> getMoveObjectNextMethod;
    if ((getMoveObjectNextMethod = MruVMovableObjectsServiceGrpc.getMoveObjectNextMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getMoveObjectNextMethod = MruVMovableObjectsServiceGrpc.getMoveObjectNextMethod) == null) {
          MruVMovableObjectsServiceGrpc.getMoveObjectNextMethod = getMoveObjectNextMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.MoveObjectNextRequest, mruv.objects.Movable.MoveObjectNextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveObjectNext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.MoveObjectNextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.MoveObjectNextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("MoveObjectNext"))
              .build();
        }
      }
    }
    return getMoveObjectNextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectPreviousRequest,
      mruv.objects.Movable.MoveObjectPreviousResponse> getMoveObjectPreviousMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveObjectPrevious",
      requestType = mruv.objects.Movable.MoveObjectPreviousRequest.class,
      responseType = mruv.objects.Movable.MoveObjectPreviousResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectPreviousRequest,
      mruv.objects.Movable.MoveObjectPreviousResponse> getMoveObjectPreviousMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.MoveObjectPreviousRequest, mruv.objects.Movable.MoveObjectPreviousResponse> getMoveObjectPreviousMethod;
    if ((getMoveObjectPreviousMethod = MruVMovableObjectsServiceGrpc.getMoveObjectPreviousMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getMoveObjectPreviousMethod = MruVMovableObjectsServiceGrpc.getMoveObjectPreviousMethod) == null) {
          MruVMovableObjectsServiceGrpc.getMoveObjectPreviousMethod = getMoveObjectPreviousMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.MoveObjectPreviousRequest, mruv.objects.Movable.MoveObjectPreviousResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveObjectPrevious"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.MoveObjectPreviousRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.MoveObjectPreviousResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("MoveObjectPrevious"))
              .build();
        }
      }
    }
    return getMoveObjectPreviousMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Movable.FetchAllMovableObjectsRequest,
      mruv.objects.Movable.FetchAllMovableObjectsResponse> getFetchAllMovableObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAllMovableObjects",
      requestType = mruv.objects.Movable.FetchAllMovableObjectsRequest.class,
      responseType = mruv.objects.Movable.FetchAllMovableObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.objects.Movable.FetchAllMovableObjectsRequest,
      mruv.objects.Movable.FetchAllMovableObjectsResponse> getFetchAllMovableObjectsMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Movable.FetchAllMovableObjectsRequest, mruv.objects.Movable.FetchAllMovableObjectsResponse> getFetchAllMovableObjectsMethod;
    if ((getFetchAllMovableObjectsMethod = MruVMovableObjectsServiceGrpc.getFetchAllMovableObjectsMethod) == null) {
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        if ((getFetchAllMovableObjectsMethod = MruVMovableObjectsServiceGrpc.getFetchAllMovableObjectsMethod) == null) {
          MruVMovableObjectsServiceGrpc.getFetchAllMovableObjectsMethod = getFetchAllMovableObjectsMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Movable.FetchAllMovableObjectsRequest, mruv.objects.Movable.FetchAllMovableObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAllMovableObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.FetchAllMovableObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Movable.FetchAllMovableObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVMovableObjectsServiceMethodDescriptorSupplier("FetchAllMovableObjects"))
              .build();
        }
      }
    }
    return getFetchAllMovableObjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVMovableObjectsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVMovableObjectsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVMovableObjectsServiceStub>() {
        @java.lang.Override
        public MruVMovableObjectsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVMovableObjectsServiceStub(channel, callOptions);
        }
      };
    return MruVMovableObjectsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVMovableObjectsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVMovableObjectsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVMovableObjectsServiceBlockingStub>() {
        @java.lang.Override
        public MruVMovableObjectsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVMovableObjectsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVMovableObjectsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVMovableObjectsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVMovableObjectsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVMovableObjectsServiceFutureStub>() {
        @java.lang.Override
        public MruVMovableObjectsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVMovableObjectsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVMovableObjectsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for movable game objects.
   * </pre>
   */
  public static abstract class MruVMovableObjectsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a movable object.
     * </pre>
     */
    public void createMovableObject(mruv.objects.Movable.CreateMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.CreateMovableObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMovableObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a movable object.
     * </pre>
     */
    public void getMovableObject(mruv.objects.Movable.GetMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.GetMovableObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMovableObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a movable object.
     * </pre>
     */
    public void updateMovableObject(mruv.objects.Movable.UpdateMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.UpdateMovableObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMovableObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a movable object.
     * </pre>
     */
    public void deleteMovableObject(mruv.objects.Movable.DeleteMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.DeleteMovableObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMovableObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move an object to other state.
     * </pre>
     */
    public void moveObject(mruv.objects.Movable.MoveObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move an object to next state.
     * </pre>
     */
    public void moveObjectNext(mruv.objects.Movable.MoveObjectNextRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectNextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveObjectNextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move an object to previous state.
     * </pre>
     */
    public void moveObjectPrevious(mruv.objects.Movable.MoveObjectPreviousRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectPreviousResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMoveObjectPreviousMethod(), responseObserver);
    }

    /**
     */
    public void fetchAllMovableObjects(mruv.objects.Movable.FetchAllMovableObjectsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.FetchAllMovableObjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllMovableObjectsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMovableObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.CreateMovableObjectRequest,
                mruv.objects.Movable.CreateMovableObjectResponse>(
                  this, METHODID_CREATE_MOVABLE_OBJECT)))
          .addMethod(
            getGetMovableObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.GetMovableObjectRequest,
                mruv.objects.Movable.GetMovableObjectResponse>(
                  this, METHODID_GET_MOVABLE_OBJECT)))
          .addMethod(
            getUpdateMovableObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.UpdateMovableObjectRequest,
                mruv.objects.Movable.UpdateMovableObjectResponse>(
                  this, METHODID_UPDATE_MOVABLE_OBJECT)))
          .addMethod(
            getDeleteMovableObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.DeleteMovableObjectRequest,
                mruv.objects.Movable.DeleteMovableObjectResponse>(
                  this, METHODID_DELETE_MOVABLE_OBJECT)))
          .addMethod(
            getMoveObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.MoveObjectRequest,
                mruv.objects.Movable.MoveObjectResponse>(
                  this, METHODID_MOVE_OBJECT)))
          .addMethod(
            getMoveObjectNextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.MoveObjectNextRequest,
                mruv.objects.Movable.MoveObjectNextResponse>(
                  this, METHODID_MOVE_OBJECT_NEXT)))
          .addMethod(
            getMoveObjectPreviousMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Movable.MoveObjectPreviousRequest,
                mruv.objects.Movable.MoveObjectPreviousResponse>(
                  this, METHODID_MOVE_OBJECT_PREVIOUS)))
          .addMethod(
            getFetchAllMovableObjectsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.objects.Movable.FetchAllMovableObjectsRequest,
                mruv.objects.Movable.FetchAllMovableObjectsResponse>(
                  this, METHODID_FETCH_ALL_MOVABLE_OBJECTS)))
          .build();
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for movable game objects.
   * </pre>
   */
  public static final class MruVMovableObjectsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVMovableObjectsServiceStub> {
    private MruVMovableObjectsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVMovableObjectsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVMovableObjectsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a movable object.
     * </pre>
     */
    public void createMovableObject(mruv.objects.Movable.CreateMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.CreateMovableObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMovableObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a movable object.
     * </pre>
     */
    public void getMovableObject(mruv.objects.Movable.GetMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.GetMovableObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMovableObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a movable object.
     * </pre>
     */
    public void updateMovableObject(mruv.objects.Movable.UpdateMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.UpdateMovableObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMovableObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a movable object.
     * </pre>
     */
    public void deleteMovableObject(mruv.objects.Movable.DeleteMovableObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.DeleteMovableObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMovableObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move an object to other state.
     * </pre>
     */
    public void moveObject(mruv.objects.Movable.MoveObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move an object to next state.
     * </pre>
     */
    public void moveObjectNext(mruv.objects.Movable.MoveObjectNextRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectNextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveObjectNextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move an object to previous state.
     * </pre>
     */
    public void moveObjectPrevious(mruv.objects.Movable.MoveObjectPreviousRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectPreviousResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMoveObjectPreviousMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchAllMovableObjects(mruv.objects.Movable.FetchAllMovableObjectsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Movable.FetchAllMovableObjectsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllMovableObjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for movable game objects.
   * </pre>
   */
  public static final class MruVMovableObjectsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVMovableObjectsServiceBlockingStub> {
    private MruVMovableObjectsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVMovableObjectsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVMovableObjectsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a movable object.
     * </pre>
     */
    public mruv.objects.Movable.CreateMovableObjectResponse createMovableObject(mruv.objects.Movable.CreateMovableObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMovableObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a movable object.
     * </pre>
     */
    public mruv.objects.Movable.GetMovableObjectResponse getMovableObject(mruv.objects.Movable.GetMovableObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMovableObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a movable object.
     * </pre>
     */
    public mruv.objects.Movable.UpdateMovableObjectResponse updateMovableObject(mruv.objects.Movable.UpdateMovableObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMovableObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a movable object.
     * </pre>
     */
    public mruv.objects.Movable.DeleteMovableObjectResponse deleteMovableObject(mruv.objects.Movable.DeleteMovableObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMovableObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move an object to other state.
     * </pre>
     */
    public mruv.objects.Movable.MoveObjectResponse moveObject(mruv.objects.Movable.MoveObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move an object to next state.
     * </pre>
     */
    public mruv.objects.Movable.MoveObjectNextResponse moveObjectNext(mruv.objects.Movable.MoveObjectNextRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveObjectNextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move an object to previous state.
     * </pre>
     */
    public mruv.objects.Movable.MoveObjectPreviousResponse moveObjectPrevious(mruv.objects.Movable.MoveObjectPreviousRequest request) {
      return blockingUnaryCall(
          getChannel(), getMoveObjectPreviousMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<mruv.objects.Movable.FetchAllMovableObjectsResponse> fetchAllMovableObjects(
        mruv.objects.Movable.FetchAllMovableObjectsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllMovableObjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for movable game objects.
   * </pre>
   */
  public static final class MruVMovableObjectsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVMovableObjectsServiceFutureStub> {
    private MruVMovableObjectsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVMovableObjectsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVMovableObjectsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a movable object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.CreateMovableObjectResponse> createMovableObject(
        mruv.objects.Movable.CreateMovableObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMovableObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a movable object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.GetMovableObjectResponse> getMovableObject(
        mruv.objects.Movable.GetMovableObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMovableObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a movable object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.UpdateMovableObjectResponse> updateMovableObject(
        mruv.objects.Movable.UpdateMovableObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMovableObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a movable object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.DeleteMovableObjectResponse> deleteMovableObject(
        mruv.objects.Movable.DeleteMovableObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMovableObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move an object to other state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.MoveObjectResponse> moveObject(
        mruv.objects.Movable.MoveObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move an object to next state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.MoveObjectNextResponse> moveObjectNext(
        mruv.objects.Movable.MoveObjectNextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveObjectNextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move an object to previous state.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Movable.MoveObjectPreviousResponse> moveObjectPrevious(
        mruv.objects.Movable.MoveObjectPreviousRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMoveObjectPreviousMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MOVABLE_OBJECT = 0;
  private static final int METHODID_GET_MOVABLE_OBJECT = 1;
  private static final int METHODID_UPDATE_MOVABLE_OBJECT = 2;
  private static final int METHODID_DELETE_MOVABLE_OBJECT = 3;
  private static final int METHODID_MOVE_OBJECT = 4;
  private static final int METHODID_MOVE_OBJECT_NEXT = 5;
  private static final int METHODID_MOVE_OBJECT_PREVIOUS = 6;
  private static final int METHODID_FETCH_ALL_MOVABLE_OBJECTS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVMovableObjectsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVMovableObjectsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MOVABLE_OBJECT:
          serviceImpl.createMovableObject((mruv.objects.Movable.CreateMovableObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.CreateMovableObjectResponse>) responseObserver);
          break;
        case METHODID_GET_MOVABLE_OBJECT:
          serviceImpl.getMovableObject((mruv.objects.Movable.GetMovableObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.GetMovableObjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOVABLE_OBJECT:
          serviceImpl.updateMovableObject((mruv.objects.Movable.UpdateMovableObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.UpdateMovableObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_MOVABLE_OBJECT:
          serviceImpl.deleteMovableObject((mruv.objects.Movable.DeleteMovableObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.DeleteMovableObjectResponse>) responseObserver);
          break;
        case METHODID_MOVE_OBJECT:
          serviceImpl.moveObject((mruv.objects.Movable.MoveObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectResponse>) responseObserver);
          break;
        case METHODID_MOVE_OBJECT_NEXT:
          serviceImpl.moveObjectNext((mruv.objects.Movable.MoveObjectNextRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectNextResponse>) responseObserver);
          break;
        case METHODID_MOVE_OBJECT_PREVIOUS:
          serviceImpl.moveObjectPrevious((mruv.objects.Movable.MoveObjectPreviousRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.MoveObjectPreviousResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL_MOVABLE_OBJECTS:
          serviceImpl.fetchAllMovableObjects((mruv.objects.Movable.FetchAllMovableObjectsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Movable.FetchAllMovableObjectsResponse>) responseObserver);
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

  private static abstract class MruVMovableObjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVMovableObjectsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.objects.Movable.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVMovableObjectsService");
    }
  }

  private static final class MruVMovableObjectsServiceFileDescriptorSupplier
      extends MruVMovableObjectsServiceBaseDescriptorSupplier {
    MruVMovableObjectsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVMovableObjectsServiceMethodDescriptorSupplier
      extends MruVMovableObjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVMovableObjectsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVMovableObjectsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVMovableObjectsServiceFileDescriptorSupplier())
              .addMethod(getCreateMovableObjectMethod())
              .addMethod(getGetMovableObjectMethod())
              .addMethod(getUpdateMovableObjectMethod())
              .addMethod(getDeleteMovableObjectMethod())
              .addMethod(getMoveObjectMethod())
              .addMethod(getMoveObjectNextMethod())
              .addMethod(getMoveObjectPreviousMethod())
              .addMethod(getFetchAllMovableObjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
