package mruv.elevators;

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
 * The MruV entrances service provides procedures for managing an elevators.
 * Elevators allow all players in the elevator area to move between building floors.
 * Floor change is processed in following steps:
 * 1. Someone chooses a floor
 * 1. Doors closing event is fired
 * 2. Doors closed event is fired.
 * 3. Everyone in a elevator are registered as players, that will be teleported to chosen floor.
 * 4. X seconds delay (elevator is moving)
 * 5. Teleport players to other floor elevator
 * 6. Doors opening
 * 7. Doors opened - end
 * You can define a one-man pseudo-elevator where only point 5 is executed.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: elevators/elevators.proto")
public final class MruVElevatorsServiceGrpc {

  private MruVElevatorsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.elevators.MruVElevatorsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.elevators.Elevators.CreateElevatorRequest,
      mruv.elevators.Elevators.CreateElevatorResponse> getCreateElevatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateElevator",
      requestType = mruv.elevators.Elevators.CreateElevatorRequest.class,
      responseType = mruv.elevators.Elevators.CreateElevatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.elevators.Elevators.CreateElevatorRequest,
      mruv.elevators.Elevators.CreateElevatorResponse> getCreateElevatorMethod() {
    io.grpc.MethodDescriptor<mruv.elevators.Elevators.CreateElevatorRequest, mruv.elevators.Elevators.CreateElevatorResponse> getCreateElevatorMethod;
    if ((getCreateElevatorMethod = MruVElevatorsServiceGrpc.getCreateElevatorMethod) == null) {
      synchronized (MruVElevatorsServiceGrpc.class) {
        if ((getCreateElevatorMethod = MruVElevatorsServiceGrpc.getCreateElevatorMethod) == null) {
          MruVElevatorsServiceGrpc.getCreateElevatorMethod = getCreateElevatorMethod =
              io.grpc.MethodDescriptor.<mruv.elevators.Elevators.CreateElevatorRequest, mruv.elevators.Elevators.CreateElevatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateElevator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.CreateElevatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.CreateElevatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVElevatorsServiceMethodDescriptorSupplier("CreateElevator"))
              .build();
        }
      }
    }
    return getCreateElevatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.elevators.Elevators.GetElevatorRequest,
      mruv.elevators.Elevators.GetElevatorResponse> getGetElevatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElevator",
      requestType = mruv.elevators.Elevators.GetElevatorRequest.class,
      responseType = mruv.elevators.Elevators.GetElevatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.elevators.Elevators.GetElevatorRequest,
      mruv.elevators.Elevators.GetElevatorResponse> getGetElevatorMethod() {
    io.grpc.MethodDescriptor<mruv.elevators.Elevators.GetElevatorRequest, mruv.elevators.Elevators.GetElevatorResponse> getGetElevatorMethod;
    if ((getGetElevatorMethod = MruVElevatorsServiceGrpc.getGetElevatorMethod) == null) {
      synchronized (MruVElevatorsServiceGrpc.class) {
        if ((getGetElevatorMethod = MruVElevatorsServiceGrpc.getGetElevatorMethod) == null) {
          MruVElevatorsServiceGrpc.getGetElevatorMethod = getGetElevatorMethod =
              io.grpc.MethodDescriptor.<mruv.elevators.Elevators.GetElevatorRequest, mruv.elevators.Elevators.GetElevatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElevator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.GetElevatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.GetElevatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVElevatorsServiceMethodDescriptorSupplier("GetElevator"))
              .build();
        }
      }
    }
    return getGetElevatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.elevators.Elevators.UpdateElevatorRequest,
      mruv.elevators.Elevators.UpdateElevatorResponse> getUpdateElevatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateElevator",
      requestType = mruv.elevators.Elevators.UpdateElevatorRequest.class,
      responseType = mruv.elevators.Elevators.UpdateElevatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.elevators.Elevators.UpdateElevatorRequest,
      mruv.elevators.Elevators.UpdateElevatorResponse> getUpdateElevatorMethod() {
    io.grpc.MethodDescriptor<mruv.elevators.Elevators.UpdateElevatorRequest, mruv.elevators.Elevators.UpdateElevatorResponse> getUpdateElevatorMethod;
    if ((getUpdateElevatorMethod = MruVElevatorsServiceGrpc.getUpdateElevatorMethod) == null) {
      synchronized (MruVElevatorsServiceGrpc.class) {
        if ((getUpdateElevatorMethod = MruVElevatorsServiceGrpc.getUpdateElevatorMethod) == null) {
          MruVElevatorsServiceGrpc.getUpdateElevatorMethod = getUpdateElevatorMethod =
              io.grpc.MethodDescriptor.<mruv.elevators.Elevators.UpdateElevatorRequest, mruv.elevators.Elevators.UpdateElevatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateElevator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.UpdateElevatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.UpdateElevatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVElevatorsServiceMethodDescriptorSupplier("UpdateElevator"))
              .build();
        }
      }
    }
    return getUpdateElevatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.elevators.Elevators.DeleteElevatorRequest,
      mruv.elevators.Elevators.DeleteElevatorResponse> getDeleteElevatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteElevator",
      requestType = mruv.elevators.Elevators.DeleteElevatorRequest.class,
      responseType = mruv.elevators.Elevators.DeleteElevatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.elevators.Elevators.DeleteElevatorRequest,
      mruv.elevators.Elevators.DeleteElevatorResponse> getDeleteElevatorMethod() {
    io.grpc.MethodDescriptor<mruv.elevators.Elevators.DeleteElevatorRequest, mruv.elevators.Elevators.DeleteElevatorResponse> getDeleteElevatorMethod;
    if ((getDeleteElevatorMethod = MruVElevatorsServiceGrpc.getDeleteElevatorMethod) == null) {
      synchronized (MruVElevatorsServiceGrpc.class) {
        if ((getDeleteElevatorMethod = MruVElevatorsServiceGrpc.getDeleteElevatorMethod) == null) {
          MruVElevatorsServiceGrpc.getDeleteElevatorMethod = getDeleteElevatorMethod =
              io.grpc.MethodDescriptor.<mruv.elevators.Elevators.DeleteElevatorRequest, mruv.elevators.Elevators.DeleteElevatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteElevator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.DeleteElevatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.DeleteElevatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVElevatorsServiceMethodDescriptorSupplier("DeleteElevator"))
              .build();
        }
      }
    }
    return getDeleteElevatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.elevators.Elevators.GetElevatorFloorsRequest,
      mruv.elevators.Elevators.GetElevatorFloorsResponse> getGetElevatorFloorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetElevatorFloors",
      requestType = mruv.elevators.Elevators.GetElevatorFloorsRequest.class,
      responseType = mruv.elevators.Elevators.GetElevatorFloorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.elevators.Elevators.GetElevatorFloorsRequest,
      mruv.elevators.Elevators.GetElevatorFloorsResponse> getGetElevatorFloorsMethod() {
    io.grpc.MethodDescriptor<mruv.elevators.Elevators.GetElevatorFloorsRequest, mruv.elevators.Elevators.GetElevatorFloorsResponse> getGetElevatorFloorsMethod;
    if ((getGetElevatorFloorsMethod = MruVElevatorsServiceGrpc.getGetElevatorFloorsMethod) == null) {
      synchronized (MruVElevatorsServiceGrpc.class) {
        if ((getGetElevatorFloorsMethod = MruVElevatorsServiceGrpc.getGetElevatorFloorsMethod) == null) {
          MruVElevatorsServiceGrpc.getGetElevatorFloorsMethod = getGetElevatorFloorsMethod =
              io.grpc.MethodDescriptor.<mruv.elevators.Elevators.GetElevatorFloorsRequest, mruv.elevators.Elevators.GetElevatorFloorsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetElevatorFloors"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.GetElevatorFloorsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.elevators.Elevators.GetElevatorFloorsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVElevatorsServiceMethodDescriptorSupplier("GetElevatorFloors"))
              .build();
        }
      }
    }
    return getGetElevatorFloorsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVElevatorsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVElevatorsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVElevatorsServiceStub>() {
        @java.lang.Override
        public MruVElevatorsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVElevatorsServiceStub(channel, callOptions);
        }
      };
    return MruVElevatorsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVElevatorsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVElevatorsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVElevatorsServiceBlockingStub>() {
        @java.lang.Override
        public MruVElevatorsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVElevatorsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVElevatorsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVElevatorsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVElevatorsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVElevatorsServiceFutureStub>() {
        @java.lang.Override
        public MruVElevatorsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVElevatorsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVElevatorsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an elevators.
   * Elevators allow all players in the elevator area to move between building floors.
   * Floor change is processed in following steps:
   * 1. Someone chooses a floor
   * 1. Doors closing event is fired
   * 2. Doors closed event is fired.
   * 3. Everyone in a elevator are registered as players, that will be teleported to chosen floor.
   * 4. X seconds delay (elevator is moving)
   * 5. Teleport players to other floor elevator
   * 6. Doors opening
   * 7. Doors opened - end
   * You can define a one-man pseudo-elevator where only point 5 is executed.
   * </pre>
   */
  public static abstract class MruVElevatorsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an elevator.
     * </pre>
     */
    public void createElevator(mruv.elevators.Elevators.CreateElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.CreateElevatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateElevatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an elevator.
     * </pre>
     */
    public void getElevator(mruv.elevators.Elevators.GetElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.GetElevatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetElevatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an elevator.
     * </pre>
     */
    public void updateElevator(mruv.elevators.Elevators.UpdateElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.UpdateElevatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateElevatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an elevator.
     * </pre>
     */
    public void deleteElevator(mruv.elevators.Elevators.DeleteElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.DeleteElevatorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteElevatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get available elevator floors.
     * </pre>
     */
    public void getElevatorFloors(mruv.elevators.Elevators.GetElevatorFloorsRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.GetElevatorFloorsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetElevatorFloorsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateElevatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.elevators.Elevators.CreateElevatorRequest,
                mruv.elevators.Elevators.CreateElevatorResponse>(
                  this, METHODID_CREATE_ELEVATOR)))
          .addMethod(
            getGetElevatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.elevators.Elevators.GetElevatorRequest,
                mruv.elevators.Elevators.GetElevatorResponse>(
                  this, METHODID_GET_ELEVATOR)))
          .addMethod(
            getUpdateElevatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.elevators.Elevators.UpdateElevatorRequest,
                mruv.elevators.Elevators.UpdateElevatorResponse>(
                  this, METHODID_UPDATE_ELEVATOR)))
          .addMethod(
            getDeleteElevatorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.elevators.Elevators.DeleteElevatorRequest,
                mruv.elevators.Elevators.DeleteElevatorResponse>(
                  this, METHODID_DELETE_ELEVATOR)))
          .addMethod(
            getGetElevatorFloorsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.elevators.Elevators.GetElevatorFloorsRequest,
                mruv.elevators.Elevators.GetElevatorFloorsResponse>(
                  this, METHODID_GET_ELEVATOR_FLOORS)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an elevators.
   * Elevators allow all players in the elevator area to move between building floors.
   * Floor change is processed in following steps:
   * 1. Someone chooses a floor
   * 1. Doors closing event is fired
   * 2. Doors closed event is fired.
   * 3. Everyone in a elevator are registered as players, that will be teleported to chosen floor.
   * 4. X seconds delay (elevator is moving)
   * 5. Teleport players to other floor elevator
   * 6. Doors opening
   * 7. Doors opened - end
   * You can define a one-man pseudo-elevator where only point 5 is executed.
   * </pre>
   */
  public static final class MruVElevatorsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVElevatorsServiceStub> {
    private MruVElevatorsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVElevatorsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVElevatorsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an elevator.
     * </pre>
     */
    public void createElevator(mruv.elevators.Elevators.CreateElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.CreateElevatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateElevatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an elevator.
     * </pre>
     */
    public void getElevator(mruv.elevators.Elevators.GetElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.GetElevatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetElevatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an elevator.
     * </pre>
     */
    public void updateElevator(mruv.elevators.Elevators.UpdateElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.UpdateElevatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateElevatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an elevator.
     * </pre>
     */
    public void deleteElevator(mruv.elevators.Elevators.DeleteElevatorRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.DeleteElevatorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteElevatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get available elevator floors.
     * </pre>
     */
    public void getElevatorFloors(mruv.elevators.Elevators.GetElevatorFloorsRequest request,
        io.grpc.stub.StreamObserver<mruv.elevators.Elevators.GetElevatorFloorsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetElevatorFloorsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an elevators.
   * Elevators allow all players in the elevator area to move between building floors.
   * Floor change is processed in following steps:
   * 1. Someone chooses a floor
   * 1. Doors closing event is fired
   * 2. Doors closed event is fired.
   * 3. Everyone in a elevator are registered as players, that will be teleported to chosen floor.
   * 4. X seconds delay (elevator is moving)
   * 5. Teleport players to other floor elevator
   * 6. Doors opening
   * 7. Doors opened - end
   * You can define a one-man pseudo-elevator where only point 5 is executed.
   * </pre>
   */
  public static final class MruVElevatorsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVElevatorsServiceBlockingStub> {
    private MruVElevatorsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVElevatorsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVElevatorsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an elevator.
     * </pre>
     */
    public mruv.elevators.Elevators.CreateElevatorResponse createElevator(mruv.elevators.Elevators.CreateElevatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateElevatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an elevator.
     * </pre>
     */
    public mruv.elevators.Elevators.GetElevatorResponse getElevator(mruv.elevators.Elevators.GetElevatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetElevatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an elevator.
     * </pre>
     */
    public mruv.elevators.Elevators.UpdateElevatorResponse updateElevator(mruv.elevators.Elevators.UpdateElevatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateElevatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an elevator.
     * </pre>
     */
    public mruv.elevators.Elevators.DeleteElevatorResponse deleteElevator(mruv.elevators.Elevators.DeleteElevatorRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteElevatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get available elevator floors.
     * </pre>
     */
    public mruv.elevators.Elevators.GetElevatorFloorsResponse getElevatorFloors(mruv.elevators.Elevators.GetElevatorFloorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetElevatorFloorsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV entrances service provides procedures for managing an elevators.
   * Elevators allow all players in the elevator area to move between building floors.
   * Floor change is processed in following steps:
   * 1. Someone chooses a floor
   * 1. Doors closing event is fired
   * 2. Doors closed event is fired.
   * 3. Everyone in a elevator are registered as players, that will be teleported to chosen floor.
   * 4. X seconds delay (elevator is moving)
   * 5. Teleport players to other floor elevator
   * 6. Doors opening
   * 7. Doors opened - end
   * You can define a one-man pseudo-elevator where only point 5 is executed.
   * </pre>
   */
  public static final class MruVElevatorsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVElevatorsServiceFutureStub> {
    private MruVElevatorsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVElevatorsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVElevatorsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an elevator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.elevators.Elevators.CreateElevatorResponse> createElevator(
        mruv.elevators.Elevators.CreateElevatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateElevatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an elevator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.elevators.Elevators.GetElevatorResponse> getElevator(
        mruv.elevators.Elevators.GetElevatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetElevatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an elevator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.elevators.Elevators.UpdateElevatorResponse> updateElevator(
        mruv.elevators.Elevators.UpdateElevatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateElevatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an elevator.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.elevators.Elevators.DeleteElevatorResponse> deleteElevator(
        mruv.elevators.Elevators.DeleteElevatorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteElevatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get available elevator floors.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.elevators.Elevators.GetElevatorFloorsResponse> getElevatorFloors(
        mruv.elevators.Elevators.GetElevatorFloorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetElevatorFloorsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ELEVATOR = 0;
  private static final int METHODID_GET_ELEVATOR = 1;
  private static final int METHODID_UPDATE_ELEVATOR = 2;
  private static final int METHODID_DELETE_ELEVATOR = 3;
  private static final int METHODID_GET_ELEVATOR_FLOORS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVElevatorsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVElevatorsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ELEVATOR:
          serviceImpl.createElevator((mruv.elevators.Elevators.CreateElevatorRequest) request,
              (io.grpc.stub.StreamObserver<mruv.elevators.Elevators.CreateElevatorResponse>) responseObserver);
          break;
        case METHODID_GET_ELEVATOR:
          serviceImpl.getElevator((mruv.elevators.Elevators.GetElevatorRequest) request,
              (io.grpc.stub.StreamObserver<mruv.elevators.Elevators.GetElevatorResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ELEVATOR:
          serviceImpl.updateElevator((mruv.elevators.Elevators.UpdateElevatorRequest) request,
              (io.grpc.stub.StreamObserver<mruv.elevators.Elevators.UpdateElevatorResponse>) responseObserver);
          break;
        case METHODID_DELETE_ELEVATOR:
          serviceImpl.deleteElevator((mruv.elevators.Elevators.DeleteElevatorRequest) request,
              (io.grpc.stub.StreamObserver<mruv.elevators.Elevators.DeleteElevatorResponse>) responseObserver);
          break;
        case METHODID_GET_ELEVATOR_FLOORS:
          serviceImpl.getElevatorFloors((mruv.elevators.Elevators.GetElevatorFloorsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.elevators.Elevators.GetElevatorFloorsResponse>) responseObserver);
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

  private static abstract class MruVElevatorsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVElevatorsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.elevators.Elevators.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVElevatorsService");
    }
  }

  private static final class MruVElevatorsServiceFileDescriptorSupplier
      extends MruVElevatorsServiceBaseDescriptorSupplier {
    MruVElevatorsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVElevatorsServiceMethodDescriptorSupplier
      extends MruVElevatorsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVElevatorsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVElevatorsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVElevatorsServiceFileDescriptorSupplier())
              .addMethod(getCreateElevatorMethod())
              .addMethod(getGetElevatorMethod())
              .addMethod(getUpdateElevatorMethod())
              .addMethod(getDeleteElevatorMethod())
              .addMethod(getGetElevatorFloorsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
