package mruv.entrances;

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
 * The MruV entrances service provides procedures for managing an entrances to estates and teleportation to locations.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: entrances/entrances.proto")
public final class MruVEntrancesServiceGrpc {

  private MruVEntrancesServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.entrances.MruVEntrancesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.CreateEntranceRequest,
      mruv.entrances.Entrances.CreateEntranceResponse> getCreateEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEntrance",
      requestType = mruv.entrances.Entrances.CreateEntranceRequest.class,
      responseType = mruv.entrances.Entrances.CreateEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.CreateEntranceRequest,
      mruv.entrances.Entrances.CreateEntranceResponse> getCreateEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.CreateEntranceRequest, mruv.entrances.Entrances.CreateEntranceResponse> getCreateEntranceMethod;
    if ((getCreateEntranceMethod = MruVEntrancesServiceGrpc.getCreateEntranceMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getCreateEntranceMethod = MruVEntrancesServiceGrpc.getCreateEntranceMethod) == null) {
          MruVEntrancesServiceGrpc.getCreateEntranceMethod = getCreateEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.CreateEntranceRequest, mruv.entrances.Entrances.CreateEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.CreateEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.CreateEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("CreateEntrance"))
              .build();
        }
      }
    }
    return getCreateEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.GetEntranceRequest,
      mruv.entrances.Entrances.GetEntranceResponse> getGetEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEntrance",
      requestType = mruv.entrances.Entrances.GetEntranceRequest.class,
      responseType = mruv.entrances.Entrances.GetEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.GetEntranceRequest,
      mruv.entrances.Entrances.GetEntranceResponse> getGetEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.GetEntranceRequest, mruv.entrances.Entrances.GetEntranceResponse> getGetEntranceMethod;
    if ((getGetEntranceMethod = MruVEntrancesServiceGrpc.getGetEntranceMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getGetEntranceMethod = MruVEntrancesServiceGrpc.getGetEntranceMethod) == null) {
          MruVEntrancesServiceGrpc.getGetEntranceMethod = getGetEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.GetEntranceRequest, mruv.entrances.Entrances.GetEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.GetEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.GetEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("GetEntrance"))
              .build();
        }
      }
    }
    return getGetEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.UpdateEntranceRequest,
      mruv.entrances.Entrances.UpdateEntranceResponse> getUpdateEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEntrance",
      requestType = mruv.entrances.Entrances.UpdateEntranceRequest.class,
      responseType = mruv.entrances.Entrances.UpdateEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.UpdateEntranceRequest,
      mruv.entrances.Entrances.UpdateEntranceResponse> getUpdateEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.UpdateEntranceRequest, mruv.entrances.Entrances.UpdateEntranceResponse> getUpdateEntranceMethod;
    if ((getUpdateEntranceMethod = MruVEntrancesServiceGrpc.getUpdateEntranceMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getUpdateEntranceMethod = MruVEntrancesServiceGrpc.getUpdateEntranceMethod) == null) {
          MruVEntrancesServiceGrpc.getUpdateEntranceMethod = getUpdateEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.UpdateEntranceRequest, mruv.entrances.Entrances.UpdateEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.UpdateEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.UpdateEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("UpdateEntrance"))
              .build();
        }
      }
    }
    return getUpdateEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.DeleteEntranceRequest,
      mruv.entrances.Entrances.DeleteEntranceResponse> getDeleteEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEntrance",
      requestType = mruv.entrances.Entrances.DeleteEntranceRequest.class,
      responseType = mruv.entrances.Entrances.DeleteEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.DeleteEntranceRequest,
      mruv.entrances.Entrances.DeleteEntranceResponse> getDeleteEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.DeleteEntranceRequest, mruv.entrances.Entrances.DeleteEntranceResponse> getDeleteEntranceMethod;
    if ((getDeleteEntranceMethod = MruVEntrancesServiceGrpc.getDeleteEntranceMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getDeleteEntranceMethod = MruVEntrancesServiceGrpc.getDeleteEntranceMethod) == null) {
          MruVEntrancesServiceGrpc.getDeleteEntranceMethod = getDeleteEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.DeleteEntranceRequest, mruv.entrances.Entrances.DeleteEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.DeleteEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.DeleteEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("DeleteEntrance"))
              .build();
        }
      }
    }
    return getDeleteEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.LockRequest,
      mruv.entrances.Entrances.LockResponse> getLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Lock",
      requestType = mruv.entrances.Entrances.LockRequest.class,
      responseType = mruv.entrances.Entrances.LockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.LockRequest,
      mruv.entrances.Entrances.LockResponse> getLockMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.LockRequest, mruv.entrances.Entrances.LockResponse> getLockMethod;
    if ((getLockMethod = MruVEntrancesServiceGrpc.getLockMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getLockMethod = MruVEntrancesServiceGrpc.getLockMethod) == null) {
          MruVEntrancesServiceGrpc.getLockMethod = getLockMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.LockRequest, mruv.entrances.Entrances.LockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Lock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.LockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.LockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("Lock"))
              .build();
        }
      }
    }
    return getLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.UnlockRequest,
      mruv.entrances.Entrances.UnlockResponse> getUnlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Unlock",
      requestType = mruv.entrances.Entrances.UnlockRequest.class,
      responseType = mruv.entrances.Entrances.UnlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.UnlockRequest,
      mruv.entrances.Entrances.UnlockResponse> getUnlockMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.UnlockRequest, mruv.entrances.Entrances.UnlockResponse> getUnlockMethod;
    if ((getUnlockMethod = MruVEntrancesServiceGrpc.getUnlockMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getUnlockMethod = MruVEntrancesServiceGrpc.getUnlockMethod) == null) {
          MruVEntrancesServiceGrpc.getUnlockMethod = getUnlockMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.UnlockRequest, mruv.entrances.Entrances.UnlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Unlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.UnlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.UnlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("Unlock"))
              .build();
        }
      }
    }
    return getUnlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.FindNearestEntranceRequest,
      mruv.entrances.Entrances.FindNearestEntranceResponse> getFindNearestEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindNearestEntrance",
      requestType = mruv.entrances.Entrances.FindNearestEntranceRequest.class,
      responseType = mruv.entrances.Entrances.FindNearestEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.FindNearestEntranceRequest,
      mruv.entrances.Entrances.FindNearestEntranceResponse> getFindNearestEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.FindNearestEntranceRequest, mruv.entrances.Entrances.FindNearestEntranceResponse> getFindNearestEntranceMethod;
    if ((getFindNearestEntranceMethod = MruVEntrancesServiceGrpc.getFindNearestEntranceMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getFindNearestEntranceMethod = MruVEntrancesServiceGrpc.getFindNearestEntranceMethod) == null) {
          MruVEntrancesServiceGrpc.getFindNearestEntranceMethod = getFindNearestEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.FindNearestEntranceRequest, mruv.entrances.Entrances.FindNearestEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindNearestEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.FindNearestEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.FindNearestEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("FindNearestEntrance"))
              .build();
        }
      }
    }
    return getFindNearestEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.EnterRequest,
      mruv.entrances.Entrances.EnterResponse> getEnterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enter",
      requestType = mruv.entrances.Entrances.EnterRequest.class,
      responseType = mruv.entrances.Entrances.EnterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.EnterRequest,
      mruv.entrances.Entrances.EnterResponse> getEnterMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.EnterRequest, mruv.entrances.Entrances.EnterResponse> getEnterMethod;
    if ((getEnterMethod = MruVEntrancesServiceGrpc.getEnterMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getEnterMethod = MruVEntrancesServiceGrpc.getEnterMethod) == null) {
          MruVEntrancesServiceGrpc.getEnterMethod = getEnterMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.EnterRequest, mruv.entrances.Entrances.EnterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.EnterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.EnterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("Enter"))
              .build();
        }
      }
    }
    return getEnterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.ExitRequest,
      mruv.entrances.Entrances.ExitResponse> getExitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exit",
      requestType = mruv.entrances.Entrances.ExitRequest.class,
      responseType = mruv.entrances.Entrances.ExitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.ExitRequest,
      mruv.entrances.Entrances.ExitResponse> getExitMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.ExitRequest, mruv.entrances.Entrances.ExitResponse> getExitMethod;
    if ((getExitMethod = MruVEntrancesServiceGrpc.getExitMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getExitMethod = MruVEntrancesServiceGrpc.getExitMethod) == null) {
          MruVEntrancesServiceGrpc.getExitMethod = getExitMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.ExitRequest, mruv.entrances.Entrances.ExitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.ExitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.ExitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("Exit"))
              .build();
        }
      }
    }
    return getExitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.entrances.Entrances.FetchAllEntrancesRequest,
      mruv.entrances.Entrances.FetchAllEntrancesResponse> getFetchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAll",
      requestType = mruv.entrances.Entrances.FetchAllEntrancesRequest.class,
      responseType = mruv.entrances.Entrances.FetchAllEntrancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.entrances.Entrances.FetchAllEntrancesRequest,
      mruv.entrances.Entrances.FetchAllEntrancesResponse> getFetchAllMethod() {
    io.grpc.MethodDescriptor<mruv.entrances.Entrances.FetchAllEntrancesRequest, mruv.entrances.Entrances.FetchAllEntrancesResponse> getFetchAllMethod;
    if ((getFetchAllMethod = MruVEntrancesServiceGrpc.getFetchAllMethod) == null) {
      synchronized (MruVEntrancesServiceGrpc.class) {
        if ((getFetchAllMethod = MruVEntrancesServiceGrpc.getFetchAllMethod) == null) {
          MruVEntrancesServiceGrpc.getFetchAllMethod = getFetchAllMethod =
              io.grpc.MethodDescriptor.<mruv.entrances.Entrances.FetchAllEntrancesRequest, mruv.entrances.Entrances.FetchAllEntrancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.FetchAllEntrancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.entrances.Entrances.FetchAllEntrancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEntrancesServiceMethodDescriptorSupplier("FetchAll"))
              .build();
        }
      }
    }
    return getFetchAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVEntrancesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEntrancesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEntrancesServiceStub>() {
        @java.lang.Override
        public MruVEntrancesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEntrancesServiceStub(channel, callOptions);
        }
      };
    return MruVEntrancesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVEntrancesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEntrancesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEntrancesServiceBlockingStub>() {
        @java.lang.Override
        public MruVEntrancesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEntrancesServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVEntrancesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVEntrancesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEntrancesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEntrancesServiceFutureStub>() {
        @java.lang.Override
        public MruVEntrancesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEntrancesServiceFutureStub(channel, callOptions);
        }
      };
    return MruVEntrancesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an entrances to estates and teleportation to locations.
   * </pre>
   */
  public static abstract class MruVEntrancesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an entrance to building or teleport to location.
     * </pre>
     */
    public void createEntrance(mruv.entrances.Entrances.CreateEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.CreateEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an entrance to building or a teleport to location.
     * </pre>
     */
    public void getEntrance(mruv.entrances.Entrances.GetEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.GetEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an entrance to building or a teleport to location.
     * </pre>
     */
    public void updateEntrance(mruv.entrances.Entrances.UpdateEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.UpdateEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an entrance to building or a teleport to location.
     * </pre>
     */
    public void deleteEntrance(mruv.entrances.Entrances.DeleteEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.DeleteEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lock entrance.
     * </pre>
     */
    public void lock(mruv.entrances.Entrances.LockRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.LockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unload entrance.
     * </pre>
     */
    public void unlock(mruv.entrances.Entrances.UnlockRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.UnlockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnlockMethod(), responseObserver);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public void findNearestEntrance(mruv.entrances.Entrances.FindNearestEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.FindNearestEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindNearestEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enter an entrance (player teleport from in spot position to out spot position).
     * </pre>
     */
    public void enter(mruv.entrances.Entrances.EnterRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.EnterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEnterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Exit from entrance (player teleport from out spot position to in spot position).
     * </pre>
     */
    public void exit(mruv.entrances.Entrances.ExitRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.ExitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExitMethod(), responseObserver);
    }

    /**
     */
    public void fetchAll(mruv.entrances.Entrances.FetchAllEntrancesRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.FetchAllEntrancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.CreateEntranceRequest,
                mruv.entrances.Entrances.CreateEntranceResponse>(
                  this, METHODID_CREATE_ENTRANCE)))
          .addMethod(
            getGetEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.GetEntranceRequest,
                mruv.entrances.Entrances.GetEntranceResponse>(
                  this, METHODID_GET_ENTRANCE)))
          .addMethod(
            getUpdateEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.UpdateEntranceRequest,
                mruv.entrances.Entrances.UpdateEntranceResponse>(
                  this, METHODID_UPDATE_ENTRANCE)))
          .addMethod(
            getDeleteEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.DeleteEntranceRequest,
                mruv.entrances.Entrances.DeleteEntranceResponse>(
                  this, METHODID_DELETE_ENTRANCE)))
          .addMethod(
            getLockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.LockRequest,
                mruv.entrances.Entrances.LockResponse>(
                  this, METHODID_LOCK)))
          .addMethod(
            getUnlockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.UnlockRequest,
                mruv.entrances.Entrances.UnlockResponse>(
                  this, METHODID_UNLOCK)))
          .addMethod(
            getFindNearestEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.FindNearestEntranceRequest,
                mruv.entrances.Entrances.FindNearestEntranceResponse>(
                  this, METHODID_FIND_NEAREST_ENTRANCE)))
          .addMethod(
            getEnterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.EnterRequest,
                mruv.entrances.Entrances.EnterResponse>(
                  this, METHODID_ENTER)))
          .addMethod(
            getExitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.entrances.Entrances.ExitRequest,
                mruv.entrances.Entrances.ExitResponse>(
                  this, METHODID_EXIT)))
          .addMethod(
            getFetchAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.entrances.Entrances.FetchAllEntrancesRequest,
                mruv.entrances.Entrances.FetchAllEntrancesResponse>(
                  this, METHODID_FETCH_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an entrances to estates and teleportation to locations.
   * </pre>
   */
  public static final class MruVEntrancesServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVEntrancesServiceStub> {
    private MruVEntrancesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEntrancesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEntrancesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an entrance to building or teleport to location.
     * </pre>
     */
    public void createEntrance(mruv.entrances.Entrances.CreateEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.CreateEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an entrance to building or a teleport to location.
     * </pre>
     */
    public void getEntrance(mruv.entrances.Entrances.GetEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.GetEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an entrance to building or a teleport to location.
     * </pre>
     */
    public void updateEntrance(mruv.entrances.Entrances.UpdateEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.UpdateEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an entrance to building or a teleport to location.
     * </pre>
     */
    public void deleteEntrance(mruv.entrances.Entrances.DeleteEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.DeleteEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lock entrance.
     * </pre>
     */
    public void lock(mruv.entrances.Entrances.LockRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.LockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unload entrance.
     * </pre>
     */
    public void unlock(mruv.entrances.Entrances.UnlockRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.UnlockResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public void findNearestEntrance(mruv.entrances.Entrances.FindNearestEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.FindNearestEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindNearestEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enter an entrance (player teleport from in spot position to out spot position).
     * </pre>
     */
    public void enter(mruv.entrances.Entrances.EnterRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.EnterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Exit from entrance (player teleport from out spot position to in spot position).
     * </pre>
     */
    public void exit(mruv.entrances.Entrances.ExitRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.ExitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchAll(mruv.entrances.Entrances.FetchAllEntrancesRequest request,
        io.grpc.stub.StreamObserver<mruv.entrances.Entrances.FetchAllEntrancesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an entrances to estates and teleportation to locations.
   * </pre>
   */
  public static final class MruVEntrancesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVEntrancesServiceBlockingStub> {
    private MruVEntrancesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEntrancesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEntrancesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an entrance to building or teleport to location.
     * </pre>
     */
    public mruv.entrances.Entrances.CreateEntranceResponse createEntrance(mruv.entrances.Entrances.CreateEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an entrance to building or a teleport to location.
     * </pre>
     */
    public mruv.entrances.Entrances.GetEntranceResponse getEntrance(mruv.entrances.Entrances.GetEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an entrance to building or a teleport to location.
     * </pre>
     */
    public mruv.entrances.Entrances.UpdateEntranceResponse updateEntrance(mruv.entrances.Entrances.UpdateEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an entrance to building or a teleport to location.
     * </pre>
     */
    public mruv.entrances.Entrances.DeleteEntranceResponse deleteEntrance(mruv.entrances.Entrances.DeleteEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lock entrance.
     * </pre>
     */
    public mruv.entrances.Entrances.LockResponse lock(mruv.entrances.Entrances.LockRequest request) {
      return blockingUnaryCall(
          getChannel(), getLockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unload entrance.
     * </pre>
     */
    public mruv.entrances.Entrances.UnlockResponse unlock(mruv.entrances.Entrances.UnlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnlockMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public mruv.entrances.Entrances.FindNearestEntranceResponse findNearestEntrance(mruv.entrances.Entrances.FindNearestEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getFindNearestEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enter an entrance (player teleport from in spot position to out spot position).
     * </pre>
     */
    public mruv.entrances.Entrances.EnterResponse enter(mruv.entrances.Entrances.EnterRequest request) {
      return blockingUnaryCall(
          getChannel(), getEnterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Exit from entrance (player teleport from out spot position to in spot position).
     * </pre>
     */
    public mruv.entrances.Entrances.ExitResponse exit(mruv.entrances.Entrances.ExitRequest request) {
      return blockingUnaryCall(
          getChannel(), getExitMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<mruv.entrances.Entrances.FetchAllEntrancesResponse> fetchAll(
        mruv.entrances.Entrances.FetchAllEntrancesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an entrances to estates and teleportation to locations.
   * </pre>
   */
  public static final class MruVEntrancesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVEntrancesServiceFutureStub> {
    private MruVEntrancesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEntrancesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEntrancesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an entrance to building or teleport to location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.CreateEntranceResponse> createEntrance(
        mruv.entrances.Entrances.CreateEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an entrance to building or a teleport to location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.GetEntranceResponse> getEntrance(
        mruv.entrances.Entrances.GetEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an entrance to building or a teleport to location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.UpdateEntranceResponse> updateEntrance(
        mruv.entrances.Entrances.UpdateEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an entrance to building or a teleport to location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.DeleteEntranceResponse> deleteEntrance(
        mruv.entrances.Entrances.DeleteEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lock entrance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.LockResponse> lock(
        mruv.entrances.Entrances.LockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unload entrance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.UnlockResponse> unlock(
        mruv.entrances.Entrances.UnlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnlockMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Find gate that is closest to a specific position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.FindNearestEntranceResponse> findNearestEntrance(
        mruv.entrances.Entrances.FindNearestEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFindNearestEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enter an entrance (player teleport from in spot position to out spot position).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.EnterResponse> enter(
        mruv.entrances.Entrances.EnterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEnterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Exit from entrance (player teleport from out spot position to in spot position).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.entrances.Entrances.ExitResponse> exit(
        mruv.entrances.Entrances.ExitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExitMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ENTRANCE = 0;
  private static final int METHODID_GET_ENTRANCE = 1;
  private static final int METHODID_UPDATE_ENTRANCE = 2;
  private static final int METHODID_DELETE_ENTRANCE = 3;
  private static final int METHODID_LOCK = 4;
  private static final int METHODID_UNLOCK = 5;
  private static final int METHODID_FIND_NEAREST_ENTRANCE = 6;
  private static final int METHODID_ENTER = 7;
  private static final int METHODID_EXIT = 8;
  private static final int METHODID_FETCH_ALL = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVEntrancesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVEntrancesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ENTRANCE:
          serviceImpl.createEntrance((mruv.entrances.Entrances.CreateEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.CreateEntranceResponse>) responseObserver);
          break;
        case METHODID_GET_ENTRANCE:
          serviceImpl.getEntrance((mruv.entrances.Entrances.GetEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.GetEntranceResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENTRANCE:
          serviceImpl.updateEntrance((mruv.entrances.Entrances.UpdateEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.UpdateEntranceResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENTRANCE:
          serviceImpl.deleteEntrance((mruv.entrances.Entrances.DeleteEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.DeleteEntranceResponse>) responseObserver);
          break;
        case METHODID_LOCK:
          serviceImpl.lock((mruv.entrances.Entrances.LockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.LockResponse>) responseObserver);
          break;
        case METHODID_UNLOCK:
          serviceImpl.unlock((mruv.entrances.Entrances.UnlockRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.UnlockResponse>) responseObserver);
          break;
        case METHODID_FIND_NEAREST_ENTRANCE:
          serviceImpl.findNearestEntrance((mruv.entrances.Entrances.FindNearestEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.FindNearestEntranceResponse>) responseObserver);
          break;
        case METHODID_ENTER:
          serviceImpl.enter((mruv.entrances.Entrances.EnterRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.EnterResponse>) responseObserver);
          break;
        case METHODID_EXIT:
          serviceImpl.exit((mruv.entrances.Entrances.ExitRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.ExitResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL:
          serviceImpl.fetchAll((mruv.entrances.Entrances.FetchAllEntrancesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.entrances.Entrances.FetchAllEntrancesResponse>) responseObserver);
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

  private static abstract class MruVEntrancesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVEntrancesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.entrances.Entrances.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVEntrancesService");
    }
  }

  private static final class MruVEntrancesServiceFileDescriptorSupplier
      extends MruVEntrancesServiceBaseDescriptorSupplier {
    MruVEntrancesServiceFileDescriptorSupplier() {}
  }

  private static final class MruVEntrancesServiceMethodDescriptorSupplier
      extends MruVEntrancesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVEntrancesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVEntrancesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVEntrancesServiceFileDescriptorSupplier())
              .addMethod(getCreateEntranceMethod())
              .addMethod(getGetEntranceMethod())
              .addMethod(getUpdateEntranceMethod())
              .addMethod(getDeleteEntranceMethod())
              .addMethod(getLockMethod())
              .addMethod(getUnlockMethod())
              .addMethod(getFindNearestEntranceMethod())
              .addMethod(getEnterMethod())
              .addMethod(getExitMethod())
              .addMethod(getFetchAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
