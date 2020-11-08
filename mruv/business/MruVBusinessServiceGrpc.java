package mruv.business;

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
 * The MruV business service provides procedures for managing businesses.
 * Business can be owned by a player or organisation. Every business have it's own group and products to sell.
 * Business can have rights to an estates.
 * Every business has its own type and depends on it, business provides different services.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: business/business.proto")
public final class MruVBusinessServiceGrpc {

  private MruVBusinessServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.business.MruVBusinessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.CreateBusinessRequest,
      mruv.business.BusinessOuterClass.CreateBusinessResponse> getCreateBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBusiness",
      requestType = mruv.business.BusinessOuterClass.CreateBusinessRequest.class,
      responseType = mruv.business.BusinessOuterClass.CreateBusinessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.CreateBusinessRequest,
      mruv.business.BusinessOuterClass.CreateBusinessResponse> getCreateBusinessMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.CreateBusinessRequest, mruv.business.BusinessOuterClass.CreateBusinessResponse> getCreateBusinessMethod;
    if ((getCreateBusinessMethod = MruVBusinessServiceGrpc.getCreateBusinessMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getCreateBusinessMethod = MruVBusinessServiceGrpc.getCreateBusinessMethod) == null) {
          MruVBusinessServiceGrpc.getCreateBusinessMethod = getCreateBusinessMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.CreateBusinessRequest, mruv.business.BusinessOuterClass.CreateBusinessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.CreateBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.CreateBusinessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("CreateBusiness"))
              .build();
        }
      }
    }
    return getCreateBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.GetBusinessRequest,
      mruv.business.BusinessOuterClass.Business> getGetBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBusiness",
      requestType = mruv.business.BusinessOuterClass.GetBusinessRequest.class,
      responseType = mruv.business.BusinessOuterClass.Business.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.GetBusinessRequest,
      mruv.business.BusinessOuterClass.Business> getGetBusinessMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.GetBusinessRequest, mruv.business.BusinessOuterClass.Business> getGetBusinessMethod;
    if ((getGetBusinessMethod = MruVBusinessServiceGrpc.getGetBusinessMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getGetBusinessMethod = MruVBusinessServiceGrpc.getGetBusinessMethod) == null) {
          MruVBusinessServiceGrpc.getGetBusinessMethod = getGetBusinessMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.GetBusinessRequest, mruv.business.BusinessOuterClass.Business>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.GetBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.Business.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("GetBusiness"))
              .build();
        }
      }
    }
    return getGetBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.UpdateBusinessRequest,
      mruv.business.BusinessOuterClass.Business> getUpdateBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBusiness",
      requestType = mruv.business.BusinessOuterClass.UpdateBusinessRequest.class,
      responseType = mruv.business.BusinessOuterClass.Business.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.UpdateBusinessRequest,
      mruv.business.BusinessOuterClass.Business> getUpdateBusinessMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.UpdateBusinessRequest, mruv.business.BusinessOuterClass.Business> getUpdateBusinessMethod;
    if ((getUpdateBusinessMethod = MruVBusinessServiceGrpc.getUpdateBusinessMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getUpdateBusinessMethod = MruVBusinessServiceGrpc.getUpdateBusinessMethod) == null) {
          MruVBusinessServiceGrpc.getUpdateBusinessMethod = getUpdateBusinessMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.UpdateBusinessRequest, mruv.business.BusinessOuterClass.Business>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.UpdateBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.Business.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("UpdateBusiness"))
              .build();
        }
      }
    }
    return getUpdateBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.DeleteBusinessRequest,
      mruv.business.BusinessOuterClass.DeleteBusinessResponse> getDeleteBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBusiness",
      requestType = mruv.business.BusinessOuterClass.DeleteBusinessRequest.class,
      responseType = mruv.business.BusinessOuterClass.DeleteBusinessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.DeleteBusinessRequest,
      mruv.business.BusinessOuterClass.DeleteBusinessResponse> getDeleteBusinessMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.DeleteBusinessRequest, mruv.business.BusinessOuterClass.DeleteBusinessResponse> getDeleteBusinessMethod;
    if ((getDeleteBusinessMethod = MruVBusinessServiceGrpc.getDeleteBusinessMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getDeleteBusinessMethod = MruVBusinessServiceGrpc.getDeleteBusinessMethod) == null) {
          MruVBusinessServiceGrpc.getDeleteBusinessMethod = getDeleteBusinessMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.DeleteBusinessRequest, mruv.business.BusinessOuterClass.DeleteBusinessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.DeleteBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.DeleteBusinessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("DeleteBusiness"))
              .build();
        }
      }
    }
    return getDeleteBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.AssignOwnerRequest,
      mruv.business.BusinessOuterClass.AssignOwnerResponse> getAssignOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignOwner",
      requestType = mruv.business.BusinessOuterClass.AssignOwnerRequest.class,
      responseType = mruv.business.BusinessOuterClass.AssignOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.AssignOwnerRequest,
      mruv.business.BusinessOuterClass.AssignOwnerResponse> getAssignOwnerMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.AssignOwnerRequest, mruv.business.BusinessOuterClass.AssignOwnerResponse> getAssignOwnerMethod;
    if ((getAssignOwnerMethod = MruVBusinessServiceGrpc.getAssignOwnerMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getAssignOwnerMethod = MruVBusinessServiceGrpc.getAssignOwnerMethod) == null) {
          MruVBusinessServiceGrpc.getAssignOwnerMethod = getAssignOwnerMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.AssignOwnerRequest, mruv.business.BusinessOuterClass.AssignOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.AssignOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.AssignOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("AssignOwner"))
              .build();
        }
      }
    }
    return getAssignOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.AssignEstateRequest,
      mruv.business.BusinessOuterClass.AssignEstateResponse> getAssignEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignEstate",
      requestType = mruv.business.BusinessOuterClass.AssignEstateRequest.class,
      responseType = mruv.business.BusinessOuterClass.AssignEstateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.AssignEstateRequest,
      mruv.business.BusinessOuterClass.AssignEstateResponse> getAssignEstateMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.AssignEstateRequest, mruv.business.BusinessOuterClass.AssignEstateResponse> getAssignEstateMethod;
    if ((getAssignEstateMethod = MruVBusinessServiceGrpc.getAssignEstateMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getAssignEstateMethod = MruVBusinessServiceGrpc.getAssignEstateMethod) == null) {
          MruVBusinessServiceGrpc.getAssignEstateMethod = getAssignEstateMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.AssignEstateRequest, mruv.business.BusinessOuterClass.AssignEstateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.AssignEstateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.AssignEstateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("AssignEstate"))
              .build();
        }
      }
    }
    return getAssignEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.UnassignEstateRequest,
      mruv.business.BusinessOuterClass.UnassignEstateResponse> getUnassignEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignEstate",
      requestType = mruv.business.BusinessOuterClass.UnassignEstateRequest.class,
      responseType = mruv.business.BusinessOuterClass.UnassignEstateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.UnassignEstateRequest,
      mruv.business.BusinessOuterClass.UnassignEstateResponse> getUnassignEstateMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.UnassignEstateRequest, mruv.business.BusinessOuterClass.UnassignEstateResponse> getUnassignEstateMethod;
    if ((getUnassignEstateMethod = MruVBusinessServiceGrpc.getUnassignEstateMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getUnassignEstateMethod = MruVBusinessServiceGrpc.getUnassignEstateMethod) == null) {
          MruVBusinessServiceGrpc.getUnassignEstateMethod = getUnassignEstateMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.UnassignEstateRequest, mruv.business.BusinessOuterClass.UnassignEstateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.UnassignEstateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.UnassignEstateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("UnassignEstate"))
              .build();
        }
      }
    }
    return getUnassignEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.BuyBusinessRequest,
      mruv.business.BusinessOuterClass.BuyBusinessResponse> getBuyBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyBusiness",
      requestType = mruv.business.BusinessOuterClass.BuyBusinessRequest.class,
      responseType = mruv.business.BusinessOuterClass.BuyBusinessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.BuyBusinessRequest,
      mruv.business.BusinessOuterClass.BuyBusinessResponse> getBuyBusinessMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.BuyBusinessRequest, mruv.business.BusinessOuterClass.BuyBusinessResponse> getBuyBusinessMethod;
    if ((getBuyBusinessMethod = MruVBusinessServiceGrpc.getBuyBusinessMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getBuyBusinessMethod = MruVBusinessServiceGrpc.getBuyBusinessMethod) == null) {
          MruVBusinessServiceGrpc.getBuyBusinessMethod = getBuyBusinessMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.BuyBusinessRequest, mruv.business.BusinessOuterClass.BuyBusinessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.BuyBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.BuyBusinessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("BuyBusiness"))
              .build();
        }
      }
    }
    return getBuyBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.WatchBusinessRequest,
      mruv.business.BusinessOuterClass.WatchBusinessResponse> getWatchBusinessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchBusiness",
      requestType = mruv.business.BusinessOuterClass.WatchBusinessRequest.class,
      responseType = mruv.business.BusinessOuterClass.WatchBusinessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.WatchBusinessRequest,
      mruv.business.BusinessOuterClass.WatchBusinessResponse> getWatchBusinessMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.WatchBusinessRequest, mruv.business.BusinessOuterClass.WatchBusinessResponse> getWatchBusinessMethod;
    if ((getWatchBusinessMethod = MruVBusinessServiceGrpc.getWatchBusinessMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getWatchBusinessMethod = MruVBusinessServiceGrpc.getWatchBusinessMethod) == null) {
          MruVBusinessServiceGrpc.getWatchBusinessMethod = getWatchBusinessMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.WatchBusinessRequest, mruv.business.BusinessOuterClass.WatchBusinessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchBusiness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.WatchBusinessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.WatchBusinessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("WatchBusiness"))
              .build();
        }
      }
    }
    return getWatchBusinessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.WatchBusinessesRequest,
      mruv.business.BusinessOuterClass.WatchBusinessesResponse> getWatchBusinessesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchBusinesses",
      requestType = mruv.business.BusinessOuterClass.WatchBusinessesRequest.class,
      responseType = mruv.business.BusinessOuterClass.WatchBusinessesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.WatchBusinessesRequest,
      mruv.business.BusinessOuterClass.WatchBusinessesResponse> getWatchBusinessesMethod() {
    io.grpc.MethodDescriptor<mruv.business.BusinessOuterClass.WatchBusinessesRequest, mruv.business.BusinessOuterClass.WatchBusinessesResponse> getWatchBusinessesMethod;
    if ((getWatchBusinessesMethod = MruVBusinessServiceGrpc.getWatchBusinessesMethod) == null) {
      synchronized (MruVBusinessServiceGrpc.class) {
        if ((getWatchBusinessesMethod = MruVBusinessServiceGrpc.getWatchBusinessesMethod) == null) {
          MruVBusinessServiceGrpc.getWatchBusinessesMethod = getWatchBusinessesMethod =
              io.grpc.MethodDescriptor.<mruv.business.BusinessOuterClass.WatchBusinessesRequest, mruv.business.BusinessOuterClass.WatchBusinessesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchBusinesses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.WatchBusinessesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.business.BusinessOuterClass.WatchBusinessesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVBusinessServiceMethodDescriptorSupplier("WatchBusinesses"))
              .build();
        }
      }
    }
    return getWatchBusinessesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVBusinessServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVBusinessServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVBusinessServiceStub>() {
        @java.lang.Override
        public MruVBusinessServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVBusinessServiceStub(channel, callOptions);
        }
      };
    return MruVBusinessServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVBusinessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVBusinessServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVBusinessServiceBlockingStub>() {
        @java.lang.Override
        public MruVBusinessServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVBusinessServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVBusinessServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVBusinessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVBusinessServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVBusinessServiceFutureStub>() {
        @java.lang.Override
        public MruVBusinessServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVBusinessServiceFutureStub(channel, callOptions);
        }
      };
    return MruVBusinessServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV business service provides procedures for managing businesses.
   * Business can be owned by a player or organisation. Every business have it's own group and products to sell.
   * Business can have rights to an estates.
   * Every business has its own type and depends on it, business provides different services.
   * </pre>
   */
  public static abstract class MruVBusinessServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a business.
     * </pre>
     */
    public void createBusiness(mruv.business.BusinessOuterClass.CreateBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.CreateBusinessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBusinessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a business.
     * </pre>
     */
    public void getBusiness(mruv.business.BusinessOuterClass.GetBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.Business> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBusinessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a business.
     * </pre>
     */
    public void updateBusiness(mruv.business.BusinessOuterClass.UpdateBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.Business> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBusinessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a business.
     * </pre>
     */
    public void deleteBusiness(mruv.business.BusinessOuterClass.DeleteBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.DeleteBusinessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBusinessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign a business owner.
     * </pre>
     */
    public void assignOwner(mruv.business.BusinessOuterClass.AssignOwnerRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.AssignOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign an estate to a business.
     * </pre>
     */
    public void assignEstate(mruv.business.BusinessOuterClass.AssignEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.AssignEstateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignEstateMethod(), responseObserver);
    }

    /**
     */
    public void unassignEstate(mruv.business.BusinessOuterClass.UnassignEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.UnassignEstateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignEstateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Buy a business.
     * </pre>
     */
    public void buyBusiness(mruv.business.BusinessOuterClass.BuyBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.BuyBusinessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyBusinessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to business events.
     * </pre>
     */
    public void watchBusiness(mruv.business.BusinessOuterClass.WatchBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.WatchBusinessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchBusinessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to all businesses events.
     * </pre>
     */
    public void watchBusinesses(mruv.business.BusinessOuterClass.WatchBusinessesRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.WatchBusinessesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchBusinessesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBusinessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.CreateBusinessRequest,
                mruv.business.BusinessOuterClass.CreateBusinessResponse>(
                  this, METHODID_CREATE_BUSINESS)))
          .addMethod(
            getGetBusinessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.GetBusinessRequest,
                mruv.business.BusinessOuterClass.Business>(
                  this, METHODID_GET_BUSINESS)))
          .addMethod(
            getUpdateBusinessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.UpdateBusinessRequest,
                mruv.business.BusinessOuterClass.Business>(
                  this, METHODID_UPDATE_BUSINESS)))
          .addMethod(
            getDeleteBusinessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.DeleteBusinessRequest,
                mruv.business.BusinessOuterClass.DeleteBusinessResponse>(
                  this, METHODID_DELETE_BUSINESS)))
          .addMethod(
            getAssignOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.AssignOwnerRequest,
                mruv.business.BusinessOuterClass.AssignOwnerResponse>(
                  this, METHODID_ASSIGN_OWNER)))
          .addMethod(
            getAssignEstateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.AssignEstateRequest,
                mruv.business.BusinessOuterClass.AssignEstateResponse>(
                  this, METHODID_ASSIGN_ESTATE)))
          .addMethod(
            getUnassignEstateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.UnassignEstateRequest,
                mruv.business.BusinessOuterClass.UnassignEstateResponse>(
                  this, METHODID_UNASSIGN_ESTATE)))
          .addMethod(
            getBuyBusinessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.BuyBusinessRequest,
                mruv.business.BusinessOuterClass.BuyBusinessResponse>(
                  this, METHODID_BUY_BUSINESS)))
          .addMethod(
            getWatchBusinessMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.WatchBusinessRequest,
                mruv.business.BusinessOuterClass.WatchBusinessResponse>(
                  this, METHODID_WATCH_BUSINESS)))
          .addMethod(
            getWatchBusinessesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.business.BusinessOuterClass.WatchBusinessesRequest,
                mruv.business.BusinessOuterClass.WatchBusinessesResponse>(
                  this, METHODID_WATCH_BUSINESSES)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV business service provides procedures for managing businesses.
   * Business can be owned by a player or organisation. Every business have it's own group and products to sell.
   * Business can have rights to an estates.
   * Every business has its own type and depends on it, business provides different services.
   * </pre>
   */
  public static final class MruVBusinessServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVBusinessServiceStub> {
    private MruVBusinessServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVBusinessServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVBusinessServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a business.
     * </pre>
     */
    public void createBusiness(mruv.business.BusinessOuterClass.CreateBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.CreateBusinessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a business.
     * </pre>
     */
    public void getBusiness(mruv.business.BusinessOuterClass.GetBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.Business> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a business.
     * </pre>
     */
    public void updateBusiness(mruv.business.BusinessOuterClass.UpdateBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.Business> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a business.
     * </pre>
     */
    public void deleteBusiness(mruv.business.BusinessOuterClass.DeleteBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.DeleteBusinessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign a business owner.
     * </pre>
     */
    public void assignOwner(mruv.business.BusinessOuterClass.AssignOwnerRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.AssignOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign an estate to a business.
     * </pre>
     */
    public void assignEstate(mruv.business.BusinessOuterClass.AssignEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.AssignEstateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unassignEstate(mruv.business.BusinessOuterClass.UnassignEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.UnassignEstateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Buy a business.
     * </pre>
     */
    public void buyBusiness(mruv.business.BusinessOuterClass.BuyBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.BuyBusinessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to business events.
     * </pre>
     */
    public void watchBusiness(mruv.business.BusinessOuterClass.WatchBusinessRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.WatchBusinessResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchBusinessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to all businesses events.
     * </pre>
     */
    public void watchBusinesses(mruv.business.BusinessOuterClass.WatchBusinessesRequest request,
        io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.WatchBusinessesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchBusinessesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV business service provides procedures for managing businesses.
   * Business can be owned by a player or organisation. Every business have it's own group and products to sell.
   * Business can have rights to an estates.
   * Every business has its own type and depends on it, business provides different services.
   * </pre>
   */
  public static final class MruVBusinessServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVBusinessServiceBlockingStub> {
    private MruVBusinessServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVBusinessServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVBusinessServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a business.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.CreateBusinessResponse createBusiness(mruv.business.BusinessOuterClass.CreateBusinessRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBusinessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a business.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.Business getBusiness(mruv.business.BusinessOuterClass.GetBusinessRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBusinessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a business.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.Business updateBusiness(mruv.business.BusinessOuterClass.UpdateBusinessRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBusinessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a business.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.DeleteBusinessResponse deleteBusiness(mruv.business.BusinessOuterClass.DeleteBusinessRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBusinessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign a business owner.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.AssignOwnerResponse assignOwner(mruv.business.BusinessOuterClass.AssignOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign an estate to a business.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.AssignEstateResponse assignEstate(mruv.business.BusinessOuterClass.AssignEstateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.business.BusinessOuterClass.UnassignEstateResponse unassignEstate(mruv.business.BusinessOuterClass.UnassignEstateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnassignEstateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Buy a business.
     * </pre>
     */
    public mruv.business.BusinessOuterClass.BuyBusinessResponse buyBusiness(mruv.business.BusinessOuterClass.BuyBusinessRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuyBusinessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to business events.
     * </pre>
     */
    public java.util.Iterator<mruv.business.BusinessOuterClass.WatchBusinessResponse> watchBusiness(
        mruv.business.BusinessOuterClass.WatchBusinessRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchBusinessMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to all businesses events.
     * </pre>
     */
    public java.util.Iterator<mruv.business.BusinessOuterClass.WatchBusinessesResponse> watchBusinesses(
        mruv.business.BusinessOuterClass.WatchBusinessesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchBusinessesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV business service provides procedures for managing businesses.
   * Business can be owned by a player or organisation. Every business have it's own group and products to sell.
   * Business can have rights to an estates.
   * Every business has its own type and depends on it, business provides different services.
   * </pre>
   */
  public static final class MruVBusinessServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVBusinessServiceFutureStub> {
    private MruVBusinessServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVBusinessServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVBusinessServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a business.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.CreateBusinessResponse> createBusiness(
        mruv.business.BusinessOuterClass.CreateBusinessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBusinessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a business.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.Business> getBusiness(
        mruv.business.BusinessOuterClass.GetBusinessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBusinessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a business.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.Business> updateBusiness(
        mruv.business.BusinessOuterClass.UpdateBusinessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBusinessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a business.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.DeleteBusinessResponse> deleteBusiness(
        mruv.business.BusinessOuterClass.DeleteBusinessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBusinessMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign a business owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.AssignOwnerResponse> assignOwner(
        mruv.business.BusinessOuterClass.AssignOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign an estate to a business.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.AssignEstateResponse> assignEstate(
        mruv.business.BusinessOuterClass.AssignEstateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.UnassignEstateResponse> unassignEstate(
        mruv.business.BusinessOuterClass.UnassignEstateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignEstateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Buy a business.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.business.BusinessOuterClass.BuyBusinessResponse> buyBusiness(
        mruv.business.BusinessOuterClass.BuyBusinessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyBusinessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BUSINESS = 0;
  private static final int METHODID_GET_BUSINESS = 1;
  private static final int METHODID_UPDATE_BUSINESS = 2;
  private static final int METHODID_DELETE_BUSINESS = 3;
  private static final int METHODID_ASSIGN_OWNER = 4;
  private static final int METHODID_ASSIGN_ESTATE = 5;
  private static final int METHODID_UNASSIGN_ESTATE = 6;
  private static final int METHODID_BUY_BUSINESS = 7;
  private static final int METHODID_WATCH_BUSINESS = 8;
  private static final int METHODID_WATCH_BUSINESSES = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVBusinessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVBusinessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BUSINESS:
          serviceImpl.createBusiness((mruv.business.BusinessOuterClass.CreateBusinessRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.CreateBusinessResponse>) responseObserver);
          break;
        case METHODID_GET_BUSINESS:
          serviceImpl.getBusiness((mruv.business.BusinessOuterClass.GetBusinessRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.Business>) responseObserver);
          break;
        case METHODID_UPDATE_BUSINESS:
          serviceImpl.updateBusiness((mruv.business.BusinessOuterClass.UpdateBusinessRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.Business>) responseObserver);
          break;
        case METHODID_DELETE_BUSINESS:
          serviceImpl.deleteBusiness((mruv.business.BusinessOuterClass.DeleteBusinessRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.DeleteBusinessResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_OWNER:
          serviceImpl.assignOwner((mruv.business.BusinessOuterClass.AssignOwnerRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.AssignOwnerResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ESTATE:
          serviceImpl.assignEstate((mruv.business.BusinessOuterClass.AssignEstateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.AssignEstateResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_ESTATE:
          serviceImpl.unassignEstate((mruv.business.BusinessOuterClass.UnassignEstateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.UnassignEstateResponse>) responseObserver);
          break;
        case METHODID_BUY_BUSINESS:
          serviceImpl.buyBusiness((mruv.business.BusinessOuterClass.BuyBusinessRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.BuyBusinessResponse>) responseObserver);
          break;
        case METHODID_WATCH_BUSINESS:
          serviceImpl.watchBusiness((mruv.business.BusinessOuterClass.WatchBusinessRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.WatchBusinessResponse>) responseObserver);
          break;
        case METHODID_WATCH_BUSINESSES:
          serviceImpl.watchBusinesses((mruv.business.BusinessOuterClass.WatchBusinessesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.business.BusinessOuterClass.WatchBusinessesResponse>) responseObserver);
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

  private static abstract class MruVBusinessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVBusinessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.business.BusinessOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVBusinessService");
    }
  }

  private static final class MruVBusinessServiceFileDescriptorSupplier
      extends MruVBusinessServiceBaseDescriptorSupplier {
    MruVBusinessServiceFileDescriptorSupplier() {}
  }

  private static final class MruVBusinessServiceMethodDescriptorSupplier
      extends MruVBusinessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVBusinessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVBusinessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVBusinessServiceFileDescriptorSupplier())
              .addMethod(getCreateBusinessMethod())
              .addMethod(getGetBusinessMethod())
              .addMethod(getUpdateBusinessMethod())
              .addMethod(getDeleteBusinessMethod())
              .addMethod(getAssignOwnerMethod())
              .addMethod(getAssignEstateMethod())
              .addMethod(getUnassignEstateMethod())
              .addMethod(getBuyBusinessMethod())
              .addMethod(getWatchBusinessMethod())
              .addMethod(getWatchBusinessesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
