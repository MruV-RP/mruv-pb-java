package mruv.gates;

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
 * The MruV gates service provides procedures for managing gates and moving objects groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: gates/gates.proto")
public final class MruVGatesServiceGrpc {

  private MruVGatesServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.gates.MruVGatesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.CreateGateRequest,
      mruv.gates.Gates.CreateGateResponse> getCreateGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGate",
      requestType = mruv.gates.Gates.CreateGateRequest.class,
      responseType = mruv.gates.Gates.CreateGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.CreateGateRequest,
      mruv.gates.Gates.CreateGateResponse> getCreateGateMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.CreateGateRequest, mruv.gates.Gates.CreateGateResponse> getCreateGateMethod;
    if ((getCreateGateMethod = MruVGatesServiceGrpc.getCreateGateMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getCreateGateMethod = MruVGatesServiceGrpc.getCreateGateMethod) == null) {
          MruVGatesServiceGrpc.getCreateGateMethod = getCreateGateMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.CreateGateRequest, mruv.gates.Gates.CreateGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.CreateGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.CreateGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("CreateGate"))
              .build();
        }
      }
    }
    return getCreateGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.GetGateRequest,
      mruv.gates.Gates.GetGateResponse> getGetGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGate",
      requestType = mruv.gates.Gates.GetGateRequest.class,
      responseType = mruv.gates.Gates.GetGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.GetGateRequest,
      mruv.gates.Gates.GetGateResponse> getGetGateMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.GetGateRequest, mruv.gates.Gates.GetGateResponse> getGetGateMethod;
    if ((getGetGateMethod = MruVGatesServiceGrpc.getGetGateMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getGetGateMethod = MruVGatesServiceGrpc.getGetGateMethod) == null) {
          MruVGatesServiceGrpc.getGetGateMethod = getGetGateMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.GetGateRequest, mruv.gates.Gates.GetGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.GetGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.GetGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("GetGate"))
              .build();
        }
      }
    }
    return getGetGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.UpdateGateRequest,
      mruv.gates.Gates.UpdateGateResponse> getUpdateGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGate",
      requestType = mruv.gates.Gates.UpdateGateRequest.class,
      responseType = mruv.gates.Gates.UpdateGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.UpdateGateRequest,
      mruv.gates.Gates.UpdateGateResponse> getUpdateGateMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.UpdateGateRequest, mruv.gates.Gates.UpdateGateResponse> getUpdateGateMethod;
    if ((getUpdateGateMethod = MruVGatesServiceGrpc.getUpdateGateMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getUpdateGateMethod = MruVGatesServiceGrpc.getUpdateGateMethod) == null) {
          MruVGatesServiceGrpc.getUpdateGateMethod = getUpdateGateMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.UpdateGateRequest, mruv.gates.Gates.UpdateGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.UpdateGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.UpdateGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("UpdateGate"))
              .build();
        }
      }
    }
    return getUpdateGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.DeleteGateRequest,
      mruv.gates.Gates.DeleteGateResponse> getDeleteGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGate",
      requestType = mruv.gates.Gates.DeleteGateRequest.class,
      responseType = mruv.gates.Gates.DeleteGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.DeleteGateRequest,
      mruv.gates.Gates.DeleteGateResponse> getDeleteGateMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.DeleteGateRequest, mruv.gates.Gates.DeleteGateResponse> getDeleteGateMethod;
    if ((getDeleteGateMethod = MruVGatesServiceGrpc.getDeleteGateMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getDeleteGateMethod = MruVGatesServiceGrpc.getDeleteGateMethod) == null) {
          MruVGatesServiceGrpc.getDeleteGateMethod = getDeleteGateMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.DeleteGateRequest, mruv.gates.Gates.DeleteGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.DeleteGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.DeleteGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("DeleteGate"))
              .build();
        }
      }
    }
    return getDeleteGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.LockRequest,
      mruv.gates.Gates.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = mruv.gates.Gates.LockRequest.class,
      responseType = mruv.gates.Gates.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.LockRequest,
      mruv.gates.Gates.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.LockRequest, mruv.gates.Gates.LockResponse> getLockMethod;
    if ((getLockMethod = MruVGatesServiceGrpc.getLockMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getLockMethod = MruVGatesServiceGrpc.getLockMethod) == null) {
          MruVGatesServiceGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.LockRequest, mruv.gates.Gates.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.UnlockRequest,
      mruv.gates.Gates.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = mruv.gates.Gates.UnlockRequest.class,
      responseType = mruv.gates.Gates.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.UnlockRequest,
      mruv.gates.Gates.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.UnlockRequest, mruv.gates.Gates.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = MruVGatesServiceGrpc.getUnlockMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getUnlockMethod = MruVGatesServiceGrpc.getUnlockMethod) == null) {
          MruVGatesServiceGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.UnlockRequest, mruv.gates.Gates.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.OpenRequest,
      mruv.gates.Gates.OpenResponse> getOpenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Open",
      requestType = mruv.gates.Gates.OpenRequest.class,
      responseType = mruv.gates.Gates.OpenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.OpenRequest,
      mruv.gates.Gates.OpenResponse> getOpenMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.OpenRequest, mruv.gates.Gates.OpenResponse> getOpenMethod;
    if ((getOpenMethod = MruVGatesServiceGrpc.getOpenMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getOpenMethod = MruVGatesServiceGrpc.getOpenMethod) == null) {
          MruVGatesServiceGrpc.getOpenMethod = getOpenMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.OpenRequest, mruv.gates.Gates.OpenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Open"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.OpenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.OpenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("Open"))
              .build();
        }
      }
    }
    return getOpenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.CloseRequest,
      mruv.gates.Gates.CloseResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Close",
      requestType = mruv.gates.Gates.CloseRequest.class,
      responseType = mruv.gates.Gates.CloseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.CloseRequest,
      mruv.gates.Gates.CloseResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.CloseRequest, mruv.gates.Gates.CloseResponse> getCloseMethod;
    if ((getCloseMethod = MruVGatesServiceGrpc.getCloseMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getCloseMethod = MruVGatesServiceGrpc.getCloseMethod) == null) {
          MruVGatesServiceGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.CloseRequest, mruv.gates.Gates.CloseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.CloseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.CloseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("Close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.FindNearestGateRequest,
      mruv.gates.Gates.FindNearestGateResponse> getFindNearestGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindNearestGate",
      requestType = mruv.gates.Gates.FindNearestGateRequest.class,
      responseType = mruv.gates.Gates.FindNearestGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.FindNearestGateRequest,
      mruv.gates.Gates.FindNearestGateResponse> getFindNearestGateMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.FindNearestGateRequest, mruv.gates.Gates.FindNearestGateResponse> getFindNearestGateMethod;
    if ((getFindNearestGateMethod = MruVGatesServiceGrpc.getFindNearestGateMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getFindNearestGateMethod = MruVGatesServiceGrpc.getFindNearestGateMethod) == null) {
          MruVGatesServiceGrpc.getFindNearestGateMethod = getFindNearestGateMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.FindNearestGateRequest, mruv.gates.Gates.FindNearestGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindNearestGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.FindNearestGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.FindNearestGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("FindNearestGate"))
              .build();
        }
      }
    }
    return getFindNearestGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.gates.Gates.FetchAllGatesRequest,
      mruv.gates.Gates.FetchAllGatesResponse> getFetchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAll",
      requestType = mruv.gates.Gates.FetchAllGatesRequest.class,
      responseType = mruv.gates.Gates.FetchAllGatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.gates.Gates.FetchAllGatesRequest,
      mruv.gates.Gates.FetchAllGatesResponse> getFetchAllMethod() {
    io.grpc.MethodDescriptor<mruv.gates.Gates.FetchAllGatesRequest, mruv.gates.Gates.FetchAllGatesResponse> getFetchAllMethod;
    if ((getFetchAllMethod = MruVGatesServiceGrpc.getFetchAllMethod) == null) {
      synchronized (MruVGatesServiceGrpc.class) {
        if ((getFetchAllMethod = MruVGatesServiceGrpc.getFetchAllMethod) == null) {
          MruVGatesServiceGrpc.getFetchAllMethod = getFetchAllMethod =
              io.grpc.MethodDescriptor.<mruv.gates.Gates.FetchAllGatesRequest, mruv.gates.Gates.FetchAllGatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.FetchAllGatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.gates.Gates.FetchAllGatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGatesServiceMethodDescriptorSupplier("FetchAll"))
              .build();
        }
      }
    }
    return getFetchAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVGatesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVGatesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVGatesServiceStub>() {
        @java.lang.Override
        public MruVGatesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVGatesServiceStub(channel, callOptions);
        }
      };
    return MruVGatesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVGatesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVGatesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVGatesServiceBlockingStub>() {
        @java.lang.Override
        public MruVGatesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVGatesServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVGatesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVGatesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVGatesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVGatesServiceFutureStub>() {
        @java.lang.Override
        public MruVGatesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVGatesServiceFutureStub(channel, callOptions);
        }
      };
    return MruVGatesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV gates service provides procedures for managing gates and moving objects groups.
   * </pre>
   */
  public static abstract class MruVGatesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a gate or a moving objects objects group.
     * </pre>
     */
    public void createGate(mruv.gates.Gates.CreateGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.CreateGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a gate or a moving objects objects group.
     * </pre>
     */
    public void getGate(mruv.gates.Gates.GetGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.GetGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a gate or a moving objects objects group.
     * </pre>
     */
    public void updateGate(mruv.gates.Gates.UpdateGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.UpdateGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a gate or a moving objects objects group.
     * </pre>
     */
    public void deleteGate(mruv.gates.Gates.DeleteGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.DeleteGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lock a gate. Locked gate cannot be opened.
     * </pre>
     */
    public void lock(mruv.gates.Gates.LockRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.LockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unload a gate, so it can be open.
     * </pre>
     */
    public void unlock(mruv.gates.Gates.UnlockRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.UnlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens a gate.
     * </pre>
     */
    public void open(mruv.gates.Gates.OpenRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.OpenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOpenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close a gate.
     * </pre>
     */
    public void close(mruv.gates.Gates.CloseRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.CloseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public void findNearestGate(mruv.gates.Gates.FindNearestGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.FindNearestGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindNearestGateMethod(), responseObserver);
    }

    /**
     */
    public void fetchAll(mruv.gates.Gates.FetchAllGatesRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.FetchAllGatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.CreateGateRequest,
                mruv.gates.Gates.CreateGateResponse>(
                  this, METHODID_CREATE_GATE)))
          .addMethod(
            getGetGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.GetGateRequest,
                mruv.gates.Gates.GetGateResponse>(
                  this, METHODID_GET_GATE)))
          .addMethod(
            getUpdateGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.UpdateGateRequest,
                mruv.gates.Gates.UpdateGateResponse>(
                  this, METHODID_UPDATE_GATE)))
          .addMethod(
            getDeleteGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.DeleteGateRequest,
                mruv.gates.Gates.DeleteGateResponse>(
                  this, METHODID_DELETE_GATE)))
          .addMethod(
            getLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.LockRequest,
                mruv.gates.Gates.LockResponse>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.UnlockRequest,
                mruv.gates.Gates.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .addMethod(
            getOpenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.OpenRequest,
                mruv.gates.Gates.OpenResponse>(
                  this, METHODID_OPEN)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.CloseRequest,
                mruv.gates.Gates.CloseResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getFindNearestGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.gates.Gates.FindNearestGateRequest,
                mruv.gates.Gates.FindNearestGateResponse>(
                  this, METHODID_FIND_NEAREST_GATE)))
          .addMethod(
            getFetchAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.gates.Gates.FetchAllGatesRequest,
                mruv.gates.Gates.FetchAllGatesResponse>(
                  this, METHODID_FETCH_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV gates service provides procedures for managing gates and moving objects groups.
   * </pre>
   */
  public static final class MruVGatesServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVGatesServiceStub> {
    private MruVGatesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVGatesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVGatesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a gate or a moving objects objects group.
     * </pre>
     */
    public void createGate(mruv.gates.Gates.CreateGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.CreateGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a gate or a moving objects objects group.
     * </pre>
     */
    public void getGate(mruv.gates.Gates.GetGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.GetGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a gate or a moving objects objects group.
     * </pre>
     */
    public void updateGate(mruv.gates.Gates.UpdateGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.UpdateGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a gate or a moving objects objects group.
     * </pre>
     */
    public void deleteGate(mruv.gates.Gates.DeleteGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.DeleteGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lock a gate. Locked gate cannot be opened.
     * </pre>
     */
    public void lock(mruv.gates.Gates.LockRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.LockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unload a gate, so it can be open.
     * </pre>
     */
    public void unlock(mruv.gates.Gates.UnlockRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.UnlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens a gate.
     * </pre>
     */
    public void open(mruv.gates.Gates.OpenRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.OpenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close a gate.
     * </pre>
     */
    public void close(mruv.gates.Gates.CloseRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.CloseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public void findNearestGate(mruv.gates.Gates.FindNearestGateRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.FindNearestGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindNearestGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchAll(mruv.gates.Gates.FetchAllGatesRequest request,
        io.grpc.stub.StreamObserver<mruv.gates.Gates.FetchAllGatesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV gates service provides procedures for managing gates and moving objects groups.
   * </pre>
   */
  public static final class MruVGatesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVGatesServiceBlockingStub> {
    private MruVGatesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVGatesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVGatesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a gate or a moving objects objects group.
     * </pre>
     */
    public mruv.gates.Gates.CreateGateResponse createGate(mruv.gates.Gates.CreateGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a gate or a moving objects objects group.
     * </pre>
     */
    public mruv.gates.Gates.GetGateResponse getGate(mruv.gates.Gates.GetGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a gate or a moving objects objects group.
     * </pre>
     */
    public mruv.gates.Gates.UpdateGateResponse updateGate(mruv.gates.Gates.UpdateGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a gate or a moving objects objects group.
     * </pre>
     */
    public mruv.gates.Gates.DeleteGateResponse deleteGate(mruv.gates.Gates.DeleteGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lock a gate. Locked gate cannot be opened.
     * </pre>
     */
    public mruv.gates.Gates.LockResponse lock(mruv.gates.Gates.LockRequest request) {
      return blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unload a gate, so it can be open.
     * </pre>
     */
    public mruv.gates.Gates.UnlockResponse unlock(mruv.gates.Gates.UnlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens a gate.
     * </pre>
     */
    public mruv.gates.Gates.OpenResponse open(mruv.gates.Gates.OpenRequest request) {
      return blockingUnaryCall(
          getChannel(), getOpenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close a gate.
     * </pre>
     */
    public mruv.gates.Gates.CloseResponse close(mruv.gates.Gates.CloseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public mruv.gates.Gates.FindNearestGateResponse findNearestGate(mruv.gates.Gates.FindNearestGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindNearestGateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<mruv.gates.Gates.FetchAllGatesResponse> fetchAll(
        mruv.gates.Gates.FetchAllGatesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV gates service provides procedures for managing gates and moving objects groups.
   * </pre>
   */
  public static final class MruVGatesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVGatesServiceFutureStub> {
    private MruVGatesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVGatesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVGatesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a gate or a moving objects objects group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.CreateGateResponse> createGate(
        mruv.gates.Gates.CreateGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a gate or a moving objects objects group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.GetGateResponse> getGate(
        mruv.gates.Gates.GetGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a gate or a moving objects objects group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.UpdateGateResponse> updateGate(
        mruv.gates.Gates.UpdateGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a gate or a moving objects objects group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.DeleteGateResponse> deleteGate(
        mruv.gates.Gates.DeleteGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lock a gate. Locked gate cannot be opened.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.LockResponse> lock(
        mruv.gates.Gates.LockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unload a gate, so it can be open.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.UnlockResponse> unlock(
        mruv.gates.Gates.UnlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens a gate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.OpenResponse> open(
        mruv.gates.Gates.OpenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOpenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close a gate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.CloseResponse> close(
        mruv.gates.Gates.CloseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.gates.Gates.FindNearestGateResponse> findNearestGate(
        mruv.gates.Gates.FindNearestGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindNearestGateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GATE = 0;
  private static final int METHODID_GET_GATE = 1;
  private static final int METHODID_UPDATE_GATE = 2;
  private static final int METHODID_DELETE_GATE = 3;
  private static final int METHODID_LOCK = 4;
  private static final int METHODID_UNLOCK = 5;
  private static final int METHODID_OPEN = 6;
  private static final int METHODID_CLOSE = 7;
  private static final int METHODID_FIND_NEAREST_GATE = 8;
  private static final int METHODID_FETCH_ALL = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVGatesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVGatesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_GATE:
          serviceImpl.createGate((mruv.gates.Gates.CreateGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.CreateGateResponse>) responseObserver);
          break;
        case METHODID_GET_GATE:
          serviceImpl.getGate((mruv.gates.Gates.GetGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.GetGateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GATE:
          serviceImpl.updateGate((mruv.gates.Gates.UpdateGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.UpdateGateResponse>) responseObserver);
          break;
        case METHODID_DELETE_GATE:
          serviceImpl.deleteGate((mruv.gates.Gates.DeleteGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.DeleteGateResponse>) responseObserver);
          break;
        case METHODID_LOCK:
          serviceImpl.lock((mruv.gates.Gates.LockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((mruv.gates.Gates.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.UnlockResponse>) responseObserver);
          break;
        case METHODID_OPEN:
          serviceImpl.open((mruv.gates.Gates.OpenRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.OpenResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((mruv.gates.Gates.CloseRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.CloseResponse>) responseObserver);
          break;
        case METHODID_FIND_NEAREST_GATE:
          serviceImpl.findNearestGate((mruv.gates.Gates.FindNearestGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.FindNearestGateResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL:
          serviceImpl.fetchAll((mruv.gates.Gates.FetchAllGatesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.gates.Gates.FetchAllGatesResponse>) responseObserver);
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

  private static abstract class MruVGatesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVGatesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.gates.Gates.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVGatesService");
    }
  }

  private static final class MruVGatesServiceFileDescriptorSupplier
      extends MruVGatesServiceBaseDescriptorSupplier {
    MruVGatesServiceFileDescriptorSupplier() {}
  }

  private static final class MruVGatesServiceMethodDescriptorSupplier
      extends MruVGatesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVGatesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVGatesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVGatesServiceFileDescriptorSupplier())
              .addMethod(getCreateGateMethod())
              .addMethod(getGetGateMethod())
              .addMethod(getUpdateGateMethod())
              .addMethod(getDeleteGateMethod())
              .addMethod(getLockMethod())
              .addMethod(getUnlockMethod())
              .addMethod(getOpenMethod())
              .addMethod(getCloseMethod())
              .addMethod(getFindNearestGateMethod())
              .addMethod(getFetchAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
