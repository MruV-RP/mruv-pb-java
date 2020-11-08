package mruv.houses;

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
 * The MruV houses service provides procedures for managing houses.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: houses/houses.proto")
public final class MruVHousesServiceGrpc {

  private MruVHousesServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.houses.MruVHousesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.houses.Houses.CreateHouseRequest,
      mruv.houses.Houses.CreateHouseResponse> getCreateHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateHouse",
      requestType = mruv.houses.Houses.CreateHouseRequest.class,
      responseType = mruv.houses.Houses.CreateHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.houses.Houses.CreateHouseRequest,
      mruv.houses.Houses.CreateHouseResponse> getCreateHouseMethod() {
    io.grpc.MethodDescriptor<mruv.houses.Houses.CreateHouseRequest, mruv.houses.Houses.CreateHouseResponse> getCreateHouseMethod;
    if ((getCreateHouseMethod = MruVHousesServiceGrpc.getCreateHouseMethod) == null) {
      synchronized (MruVHousesServiceGrpc.class) {
        if ((getCreateHouseMethod = MruVHousesServiceGrpc.getCreateHouseMethod) == null) {
          MruVHousesServiceGrpc.getCreateHouseMethod = getCreateHouseMethod =
              io.grpc.MethodDescriptor.<mruv.houses.Houses.CreateHouseRequest, mruv.houses.Houses.CreateHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.CreateHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.CreateHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVHousesServiceMethodDescriptorSupplier("CreateHouse"))
              .build();
        }
      }
    }
    return getCreateHouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.houses.Houses.GetHouseRequest,
      mruv.houses.Houses.GetHouseResponse> getGetHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHouse",
      requestType = mruv.houses.Houses.GetHouseRequest.class,
      responseType = mruv.houses.Houses.GetHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.houses.Houses.GetHouseRequest,
      mruv.houses.Houses.GetHouseResponse> getGetHouseMethod() {
    io.grpc.MethodDescriptor<mruv.houses.Houses.GetHouseRequest, mruv.houses.Houses.GetHouseResponse> getGetHouseMethod;
    if ((getGetHouseMethod = MruVHousesServiceGrpc.getGetHouseMethod) == null) {
      synchronized (MruVHousesServiceGrpc.class) {
        if ((getGetHouseMethod = MruVHousesServiceGrpc.getGetHouseMethod) == null) {
          MruVHousesServiceGrpc.getGetHouseMethod = getGetHouseMethod =
              io.grpc.MethodDescriptor.<mruv.houses.Houses.GetHouseRequest, mruv.houses.Houses.GetHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.GetHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.GetHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVHousesServiceMethodDescriptorSupplier("GetHouse"))
              .build();
        }
      }
    }
    return getGetHouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.houses.Houses.UpdateHouseRequest,
      mruv.houses.Houses.UpdateHouseResponse> getUpdateHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateHouse",
      requestType = mruv.houses.Houses.UpdateHouseRequest.class,
      responseType = mruv.houses.Houses.UpdateHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.houses.Houses.UpdateHouseRequest,
      mruv.houses.Houses.UpdateHouseResponse> getUpdateHouseMethod() {
    io.grpc.MethodDescriptor<mruv.houses.Houses.UpdateHouseRequest, mruv.houses.Houses.UpdateHouseResponse> getUpdateHouseMethod;
    if ((getUpdateHouseMethod = MruVHousesServiceGrpc.getUpdateHouseMethod) == null) {
      synchronized (MruVHousesServiceGrpc.class) {
        if ((getUpdateHouseMethod = MruVHousesServiceGrpc.getUpdateHouseMethod) == null) {
          MruVHousesServiceGrpc.getUpdateHouseMethod = getUpdateHouseMethod =
              io.grpc.MethodDescriptor.<mruv.houses.Houses.UpdateHouseRequest, mruv.houses.Houses.UpdateHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.UpdateHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.UpdateHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVHousesServiceMethodDescriptorSupplier("UpdateHouse"))
              .build();
        }
      }
    }
    return getUpdateHouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.houses.Houses.DeleteHouseRequest,
      mruv.houses.Houses.DeleteHouseResponse> getDeleteHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteHouse",
      requestType = mruv.houses.Houses.DeleteHouseRequest.class,
      responseType = mruv.houses.Houses.DeleteHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.houses.Houses.DeleteHouseRequest,
      mruv.houses.Houses.DeleteHouseResponse> getDeleteHouseMethod() {
    io.grpc.MethodDescriptor<mruv.houses.Houses.DeleteHouseRequest, mruv.houses.Houses.DeleteHouseResponse> getDeleteHouseMethod;
    if ((getDeleteHouseMethod = MruVHousesServiceGrpc.getDeleteHouseMethod) == null) {
      synchronized (MruVHousesServiceGrpc.class) {
        if ((getDeleteHouseMethod = MruVHousesServiceGrpc.getDeleteHouseMethod) == null) {
          MruVHousesServiceGrpc.getDeleteHouseMethod = getDeleteHouseMethod =
              io.grpc.MethodDescriptor.<mruv.houses.Houses.DeleteHouseRequest, mruv.houses.Houses.DeleteHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.DeleteHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.houses.Houses.DeleteHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVHousesServiceMethodDescriptorSupplier("DeleteHouse"))
              .build();
        }
      }
    }
    return getDeleteHouseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVHousesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVHousesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVHousesServiceStub>() {
        @java.lang.Override
        public MruVHousesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVHousesServiceStub(channel, callOptions);
        }
      };
    return MruVHousesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVHousesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVHousesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVHousesServiceBlockingStub>() {
        @java.lang.Override
        public MruVHousesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVHousesServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVHousesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVHousesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVHousesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVHousesServiceFutureStub>() {
        @java.lang.Override
        public MruVHousesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVHousesServiceFutureStub(channel, callOptions);
        }
      };
    return MruVHousesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV houses service provides procedures for managing houses.
   * </pre>
   */
  public static abstract class MruVHousesServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a house.
     * </pre>
     */
    public void createHouse(mruv.houses.Houses.CreateHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.CreateHouseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateHouseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a house.
     * </pre>
     */
    public void getHouse(mruv.houses.Houses.GetHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.GetHouseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetHouseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a house.
     * </pre>
     */
    public void updateHouse(mruv.houses.Houses.UpdateHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.UpdateHouseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateHouseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a house.
     * </pre>
     */
    public void deleteHouse(mruv.houses.Houses.DeleteHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.DeleteHouseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteHouseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateHouseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.houses.Houses.CreateHouseRequest,
                mruv.houses.Houses.CreateHouseResponse>(
                  this, METHODID_CREATE_HOUSE)))
          .addMethod(
            getGetHouseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.houses.Houses.GetHouseRequest,
                mruv.houses.Houses.GetHouseResponse>(
                  this, METHODID_GET_HOUSE)))
          .addMethod(
            getUpdateHouseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.houses.Houses.UpdateHouseRequest,
                mruv.houses.Houses.UpdateHouseResponse>(
                  this, METHODID_UPDATE_HOUSE)))
          .addMethod(
            getDeleteHouseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.houses.Houses.DeleteHouseRequest,
                mruv.houses.Houses.DeleteHouseResponse>(
                  this, METHODID_DELETE_HOUSE)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV houses service provides procedures for managing houses.
   * </pre>
   */
  public static final class MruVHousesServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVHousesServiceStub> {
    private MruVHousesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVHousesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVHousesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a house.
     * </pre>
     */
    public void createHouse(mruv.houses.Houses.CreateHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.CreateHouseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateHouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a house.
     * </pre>
     */
    public void getHouse(mruv.houses.Houses.GetHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.GetHouseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetHouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a house.
     * </pre>
     */
    public void updateHouse(mruv.houses.Houses.UpdateHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.UpdateHouseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateHouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a house.
     * </pre>
     */
    public void deleteHouse(mruv.houses.Houses.DeleteHouseRequest request,
        io.grpc.stub.StreamObserver<mruv.houses.Houses.DeleteHouseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteHouseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV houses service provides procedures for managing houses.
   * </pre>
   */
  public static final class MruVHousesServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVHousesServiceBlockingStub> {
    private MruVHousesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVHousesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVHousesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a house.
     * </pre>
     */
    public mruv.houses.Houses.CreateHouseResponse createHouse(mruv.houses.Houses.CreateHouseRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateHouseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a house.
     * </pre>
     */
    public mruv.houses.Houses.GetHouseResponse getHouse(mruv.houses.Houses.GetHouseRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetHouseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a house.
     * </pre>
     */
    public mruv.houses.Houses.UpdateHouseResponse updateHouse(mruv.houses.Houses.UpdateHouseRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateHouseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a house.
     * </pre>
     */
    public mruv.houses.Houses.DeleteHouseResponse deleteHouse(mruv.houses.Houses.DeleteHouseRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteHouseMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV houses service provides procedures for managing houses.
   * </pre>
   */
  public static final class MruVHousesServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVHousesServiceFutureStub> {
    private MruVHousesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVHousesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVHousesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a house.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.houses.Houses.CreateHouseResponse> createHouse(
        mruv.houses.Houses.CreateHouseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateHouseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a house.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.houses.Houses.GetHouseResponse> getHouse(
        mruv.houses.Houses.GetHouseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetHouseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a house.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.houses.Houses.UpdateHouseResponse> updateHouse(
        mruv.houses.Houses.UpdateHouseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateHouseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a house.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.houses.Houses.DeleteHouseResponse> deleteHouse(
        mruv.houses.Houses.DeleteHouseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteHouseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_HOUSE = 0;
  private static final int METHODID_GET_HOUSE = 1;
  private static final int METHODID_UPDATE_HOUSE = 2;
  private static final int METHODID_DELETE_HOUSE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVHousesServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVHousesServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_HOUSE:
          serviceImpl.createHouse((mruv.houses.Houses.CreateHouseRequest) request,
              (io.grpc.stub.StreamObserver<mruv.houses.Houses.CreateHouseResponse>) responseObserver);
          break;
        case METHODID_GET_HOUSE:
          serviceImpl.getHouse((mruv.houses.Houses.GetHouseRequest) request,
              (io.grpc.stub.StreamObserver<mruv.houses.Houses.GetHouseResponse>) responseObserver);
          break;
        case METHODID_UPDATE_HOUSE:
          serviceImpl.updateHouse((mruv.houses.Houses.UpdateHouseRequest) request,
              (io.grpc.stub.StreamObserver<mruv.houses.Houses.UpdateHouseResponse>) responseObserver);
          break;
        case METHODID_DELETE_HOUSE:
          serviceImpl.deleteHouse((mruv.houses.Houses.DeleteHouseRequest) request,
              (io.grpc.stub.StreamObserver<mruv.houses.Houses.DeleteHouseResponse>) responseObserver);
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

  private static abstract class MruVHousesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVHousesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.houses.Houses.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVHousesService");
    }
  }

  private static final class MruVHousesServiceFileDescriptorSupplier
      extends MruVHousesServiceBaseDescriptorSupplier {
    MruVHousesServiceFileDescriptorSupplier() {}
  }

  private static final class MruVHousesServiceMethodDescriptorSupplier
      extends MruVHousesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVHousesServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVHousesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVHousesServiceFileDescriptorSupplier())
              .addMethod(getCreateHouseMethod())
              .addMethod(getGetHouseMethod())
              .addMethod(getUpdateHouseMethod())
              .addMethod(getDeleteHouseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
