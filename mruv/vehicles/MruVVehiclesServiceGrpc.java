package mruv.vehicles;

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
 * The MruV vehicles service provides procedures for managing vehicles.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: vehicles/vehicles.proto")
public final class MruVVehiclesServiceGrpc {

  private MruVVehiclesServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.vehicles.MruVVehiclesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.CreateVehicleRequest,
      mruv.vehicles.Vehicles.CreateVehicleResponse> getCreateVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVehicle",
      requestType = mruv.vehicles.Vehicles.CreateVehicleRequest.class,
      responseType = mruv.vehicles.Vehicles.CreateVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.CreateVehicleRequest,
      mruv.vehicles.Vehicles.CreateVehicleResponse> getCreateVehicleMethod() {
    io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.CreateVehicleRequest, mruv.vehicles.Vehicles.CreateVehicleResponse> getCreateVehicleMethod;
    if ((getCreateVehicleMethod = MruVVehiclesServiceGrpc.getCreateVehicleMethod) == null) {
      synchronized (MruVVehiclesServiceGrpc.class) {
        if ((getCreateVehicleMethod = MruVVehiclesServiceGrpc.getCreateVehicleMethod) == null) {
          MruVVehiclesServiceGrpc.getCreateVehicleMethod = getCreateVehicleMethod =
              io.grpc.MethodDescriptor.<mruv.vehicles.Vehicles.CreateVehicleRequest, mruv.vehicles.Vehicles.CreateVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.CreateVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.CreateVehicleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVVehiclesServiceMethodDescriptorSupplier("CreateVehicle"))
              .build();
        }
      }
    }
    return getCreateVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.GetVehicleRequest,
      mruv.vehicles.Vehicles.GetVehicleResponse> getGetVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVehicle",
      requestType = mruv.vehicles.Vehicles.GetVehicleRequest.class,
      responseType = mruv.vehicles.Vehicles.GetVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.GetVehicleRequest,
      mruv.vehicles.Vehicles.GetVehicleResponse> getGetVehicleMethod() {
    io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.GetVehicleRequest, mruv.vehicles.Vehicles.GetVehicleResponse> getGetVehicleMethod;
    if ((getGetVehicleMethod = MruVVehiclesServiceGrpc.getGetVehicleMethod) == null) {
      synchronized (MruVVehiclesServiceGrpc.class) {
        if ((getGetVehicleMethod = MruVVehiclesServiceGrpc.getGetVehicleMethod) == null) {
          MruVVehiclesServiceGrpc.getGetVehicleMethod = getGetVehicleMethod =
              io.grpc.MethodDescriptor.<mruv.vehicles.Vehicles.GetVehicleRequest, mruv.vehicles.Vehicles.GetVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.GetVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.GetVehicleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVVehiclesServiceMethodDescriptorSupplier("GetVehicle"))
              .build();
        }
      }
    }
    return getGetVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.UpdateVehicleRequest,
      mruv.vehicles.Vehicles.UpdateVehicleResponse> getUpdateVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVehicle",
      requestType = mruv.vehicles.Vehicles.UpdateVehicleRequest.class,
      responseType = mruv.vehicles.Vehicles.UpdateVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.UpdateVehicleRequest,
      mruv.vehicles.Vehicles.UpdateVehicleResponse> getUpdateVehicleMethod() {
    io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.UpdateVehicleRequest, mruv.vehicles.Vehicles.UpdateVehicleResponse> getUpdateVehicleMethod;
    if ((getUpdateVehicleMethod = MruVVehiclesServiceGrpc.getUpdateVehicleMethod) == null) {
      synchronized (MruVVehiclesServiceGrpc.class) {
        if ((getUpdateVehicleMethod = MruVVehiclesServiceGrpc.getUpdateVehicleMethod) == null) {
          MruVVehiclesServiceGrpc.getUpdateVehicleMethod = getUpdateVehicleMethod =
              io.grpc.MethodDescriptor.<mruv.vehicles.Vehicles.UpdateVehicleRequest, mruv.vehicles.Vehicles.UpdateVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.UpdateVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.UpdateVehicleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVVehiclesServiceMethodDescriptorSupplier("UpdateVehicle"))
              .build();
        }
      }
    }
    return getUpdateVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.DeleteVehicleRequest,
      mruv.vehicles.Vehicles.DeleteVehicleResponse> getDeleteVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVehicle",
      requestType = mruv.vehicles.Vehicles.DeleteVehicleRequest.class,
      responseType = mruv.vehicles.Vehicles.DeleteVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.DeleteVehicleRequest,
      mruv.vehicles.Vehicles.DeleteVehicleResponse> getDeleteVehicleMethod() {
    io.grpc.MethodDescriptor<mruv.vehicles.Vehicles.DeleteVehicleRequest, mruv.vehicles.Vehicles.DeleteVehicleResponse> getDeleteVehicleMethod;
    if ((getDeleteVehicleMethod = MruVVehiclesServiceGrpc.getDeleteVehicleMethod) == null) {
      synchronized (MruVVehiclesServiceGrpc.class) {
        if ((getDeleteVehicleMethod = MruVVehiclesServiceGrpc.getDeleteVehicleMethod) == null) {
          MruVVehiclesServiceGrpc.getDeleteVehicleMethod = getDeleteVehicleMethod =
              io.grpc.MethodDescriptor.<mruv.vehicles.Vehicles.DeleteVehicleRequest, mruv.vehicles.Vehicles.DeleteVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.DeleteVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.vehicles.Vehicles.DeleteVehicleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVVehiclesServiceMethodDescriptorSupplier("DeleteVehicle"))
              .build();
        }
      }
    }
    return getDeleteVehicleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVVehiclesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVVehiclesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVVehiclesServiceStub>() {
        @java.lang.Override
        public MruVVehiclesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVVehiclesServiceStub(channel, callOptions);
        }
      };
    return MruVVehiclesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVVehiclesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVVehiclesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVVehiclesServiceBlockingStub>() {
        @java.lang.Override
        public MruVVehiclesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVVehiclesServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVVehiclesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVVehiclesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVVehiclesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVVehiclesServiceFutureStub>() {
        @java.lang.Override
        public MruVVehiclesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVVehiclesServiceFutureStub(channel, callOptions);
        }
      };
    return MruVVehiclesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV vehicles service provides procedures for managing vehicles.
   * </pre>
   */
  public static abstract class MruVVehiclesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a vehicle.
     * </pre>
     */
    public void createVehicle(mruv.vehicles.Vehicles.CreateVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.CreateVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVehicleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a vehicle.
     * </pre>
     */
    public void getVehicle(mruv.vehicles.Vehicles.GetVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.GetVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a vehicle.
     * </pre>
     */
    public void updateVehicle(mruv.vehicles.Vehicles.UpdateVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.UpdateVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVehicleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a vehicle.
     * </pre>
     */
    public void deleteVehicle(mruv.vehicles.Vehicles.DeleteVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.DeleteVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVehicleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.vehicles.Vehicles.CreateVehicleRequest,
                mruv.vehicles.Vehicles.CreateVehicleResponse>(
                  this, METHODID_CREATE_VEHICLE)))
          .addMethod(
            getGetVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.vehicles.Vehicles.GetVehicleRequest,
                mruv.vehicles.Vehicles.GetVehicleResponse>(
                  this, METHODID_GET_VEHICLE)))
          .addMethod(
            getUpdateVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.vehicles.Vehicles.UpdateVehicleRequest,
                mruv.vehicles.Vehicles.UpdateVehicleResponse>(
                  this, METHODID_UPDATE_VEHICLE)))
          .addMethod(
            getDeleteVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.vehicles.Vehicles.DeleteVehicleRequest,
                mruv.vehicles.Vehicles.DeleteVehicleResponse>(
                  this, METHODID_DELETE_VEHICLE)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV vehicles service provides procedures for managing vehicles.
   * </pre>
   */
  public static final class MruVVehiclesServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVVehiclesServiceStub> {
    private MruVVehiclesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVVehiclesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVVehiclesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a vehicle.
     * </pre>
     */
    public void createVehicle(mruv.vehicles.Vehicles.CreateVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.CreateVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a vehicle.
     * </pre>
     */
    public void getVehicle(mruv.vehicles.Vehicles.GetVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.GetVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a vehicle.
     * </pre>
     */
    public void updateVehicle(mruv.vehicles.Vehicles.UpdateVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.UpdateVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a vehicle.
     * </pre>
     */
    public void deleteVehicle(mruv.vehicles.Vehicles.DeleteVehicleRequest request,
        io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.DeleteVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVehicleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV vehicles service provides procedures for managing vehicles.
   * </pre>
   */
  public static final class MruVVehiclesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVVehiclesServiceBlockingStub> {
    private MruVVehiclesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVVehiclesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVVehiclesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a vehicle.
     * </pre>
     */
    public mruv.vehicles.Vehicles.CreateVehicleResponse createVehicle(mruv.vehicles.Vehicles.CreateVehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVehicleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a vehicle.
     * </pre>
     */
    public mruv.vehicles.Vehicles.GetVehicleResponse getVehicle(mruv.vehicles.Vehicles.GetVehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a vehicle.
     * </pre>
     */
    public mruv.vehicles.Vehicles.UpdateVehicleResponse updateVehicle(mruv.vehicles.Vehicles.UpdateVehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVehicleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a vehicle.
     * </pre>
     */
    public mruv.vehicles.Vehicles.DeleteVehicleResponse deleteVehicle(mruv.vehicles.Vehicles.DeleteVehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVehicleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV vehicles service provides procedures for managing vehicles.
   * </pre>
   */
  public static final class MruVVehiclesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVVehiclesServiceFutureStub> {
    private MruVVehiclesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVVehiclesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVVehiclesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.vehicles.Vehicles.CreateVehicleResponse> createVehicle(
        mruv.vehicles.Vehicles.CreateVehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVehicleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.vehicles.Vehicles.GetVehicleResponse> getVehicle(
        mruv.vehicles.Vehicles.GetVehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.vehicles.Vehicles.UpdateVehicleResponse> updateVehicle(
        mruv.vehicles.Vehicles.UpdateVehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVehicleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a vehicle.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.vehicles.Vehicles.DeleteVehicleResponse> deleteVehicle(
        mruv.vehicles.Vehicles.DeleteVehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVehicleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VEHICLE = 0;
  private static final int METHODID_GET_VEHICLE = 1;
  private static final int METHODID_UPDATE_VEHICLE = 2;
  private static final int METHODID_DELETE_VEHICLE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVVehiclesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVVehiclesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_VEHICLE:
          serviceImpl.createVehicle((mruv.vehicles.Vehicles.CreateVehicleRequest) request,
              (io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.CreateVehicleResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICLE:
          serviceImpl.getVehicle((mruv.vehicles.Vehicles.GetVehicleRequest) request,
              (io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.GetVehicleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_VEHICLE:
          serviceImpl.updateVehicle((mruv.vehicles.Vehicles.UpdateVehicleRequest) request,
              (io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.UpdateVehicleResponse>) responseObserver);
          break;
        case METHODID_DELETE_VEHICLE:
          serviceImpl.deleteVehicle((mruv.vehicles.Vehicles.DeleteVehicleRequest) request,
              (io.grpc.stub.StreamObserver<mruv.vehicles.Vehicles.DeleteVehicleResponse>) responseObserver);
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

  private static abstract class MruVVehiclesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVVehiclesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.vehicles.Vehicles.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVVehiclesService");
    }
  }

  private static final class MruVVehiclesServiceFileDescriptorSupplier
      extends MruVVehiclesServiceBaseDescriptorSupplier {
    MruVVehiclesServiceFileDescriptorSupplier() {}
  }

  private static final class MruVVehiclesServiceMethodDescriptorSupplier
      extends MruVVehiclesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVVehiclesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVVehiclesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVVehiclesServiceFileDescriptorSupplier())
              .addMethod(getCreateVehicleMethod())
              .addMethod(getGetVehicleMethod())
              .addMethod(getUpdateVehicleMethod())
              .addMethod(getDeleteVehicleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
