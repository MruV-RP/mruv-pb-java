package mruv.offers;

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
 * The MruV offers service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: offers/offers.proto")
public final class MruVOffersServiceGrpc {

  private MruVOffersServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.offers.MruVOffersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.offers.Offers.CreateOfferRequest,
      mruv.offers.Offers.CreateOfferResponse> getCreateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOffer",
      requestType = mruv.offers.Offers.CreateOfferRequest.class,
      responseType = mruv.offers.Offers.CreateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.offers.Offers.CreateOfferRequest,
      mruv.offers.Offers.CreateOfferResponse> getCreateOfferMethod() {
    io.grpc.MethodDescriptor<mruv.offers.Offers.CreateOfferRequest, mruv.offers.Offers.CreateOfferResponse> getCreateOfferMethod;
    if ((getCreateOfferMethod = MruVOffersServiceGrpc.getCreateOfferMethod) == null) {
      synchronized (MruVOffersServiceGrpc.class) {
        if ((getCreateOfferMethod = MruVOffersServiceGrpc.getCreateOfferMethod) == null) {
          MruVOffersServiceGrpc.getCreateOfferMethod = getCreateOfferMethod =
              io.grpc.MethodDescriptor.<mruv.offers.Offers.CreateOfferRequest, mruv.offers.Offers.CreateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.CreateOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.CreateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOffersServiceMethodDescriptorSupplier("CreateOffer"))
              .build();
        }
      }
    }
    return getCreateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.offers.Offers.GetOfferRequest,
      mruv.offers.Offers.GetOfferResponse> getGetOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOffer",
      requestType = mruv.offers.Offers.GetOfferRequest.class,
      responseType = mruv.offers.Offers.GetOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.offers.Offers.GetOfferRequest,
      mruv.offers.Offers.GetOfferResponse> getGetOfferMethod() {
    io.grpc.MethodDescriptor<mruv.offers.Offers.GetOfferRequest, mruv.offers.Offers.GetOfferResponse> getGetOfferMethod;
    if ((getGetOfferMethod = MruVOffersServiceGrpc.getGetOfferMethod) == null) {
      synchronized (MruVOffersServiceGrpc.class) {
        if ((getGetOfferMethod = MruVOffersServiceGrpc.getGetOfferMethod) == null) {
          MruVOffersServiceGrpc.getGetOfferMethod = getGetOfferMethod =
              io.grpc.MethodDescriptor.<mruv.offers.Offers.GetOfferRequest, mruv.offers.Offers.GetOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.GetOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.GetOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOffersServiceMethodDescriptorSupplier("GetOffer"))
              .build();
        }
      }
    }
    return getGetOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.offers.Offers.UpdateOfferRequest,
      mruv.offers.Offers.UpdateOfferResponse> getUpdateOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOffer",
      requestType = mruv.offers.Offers.UpdateOfferRequest.class,
      responseType = mruv.offers.Offers.UpdateOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.offers.Offers.UpdateOfferRequest,
      mruv.offers.Offers.UpdateOfferResponse> getUpdateOfferMethod() {
    io.grpc.MethodDescriptor<mruv.offers.Offers.UpdateOfferRequest, mruv.offers.Offers.UpdateOfferResponse> getUpdateOfferMethod;
    if ((getUpdateOfferMethod = MruVOffersServiceGrpc.getUpdateOfferMethod) == null) {
      synchronized (MruVOffersServiceGrpc.class) {
        if ((getUpdateOfferMethod = MruVOffersServiceGrpc.getUpdateOfferMethod) == null) {
          MruVOffersServiceGrpc.getUpdateOfferMethod = getUpdateOfferMethod =
              io.grpc.MethodDescriptor.<mruv.offers.Offers.UpdateOfferRequest, mruv.offers.Offers.UpdateOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.UpdateOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.UpdateOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOffersServiceMethodDescriptorSupplier("UpdateOffer"))
              .build();
        }
      }
    }
    return getUpdateOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.offers.Offers.DeleteOfferRequest,
      mruv.offers.Offers.DeleteOfferResponse> getDeleteOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOffer",
      requestType = mruv.offers.Offers.DeleteOfferRequest.class,
      responseType = mruv.offers.Offers.DeleteOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.offers.Offers.DeleteOfferRequest,
      mruv.offers.Offers.DeleteOfferResponse> getDeleteOfferMethod() {
    io.grpc.MethodDescriptor<mruv.offers.Offers.DeleteOfferRequest, mruv.offers.Offers.DeleteOfferResponse> getDeleteOfferMethod;
    if ((getDeleteOfferMethod = MruVOffersServiceGrpc.getDeleteOfferMethod) == null) {
      synchronized (MruVOffersServiceGrpc.class) {
        if ((getDeleteOfferMethod = MruVOffersServiceGrpc.getDeleteOfferMethod) == null) {
          MruVOffersServiceGrpc.getDeleteOfferMethod = getDeleteOfferMethod =
              io.grpc.MethodDescriptor.<mruv.offers.Offers.DeleteOfferRequest, mruv.offers.Offers.DeleteOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.DeleteOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.DeleteOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOffersServiceMethodDescriptorSupplier("DeleteOffer"))
              .build();
        }
      }
    }
    return getDeleteOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.offers.Offers.AcceptOfferRequest,
      mruv.offers.Offers.AcceptOfferResponse> getAcceptOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AcceptOffer",
      requestType = mruv.offers.Offers.AcceptOfferRequest.class,
      responseType = mruv.offers.Offers.AcceptOfferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.offers.Offers.AcceptOfferRequest,
      mruv.offers.Offers.AcceptOfferResponse> getAcceptOfferMethod() {
    io.grpc.MethodDescriptor<mruv.offers.Offers.AcceptOfferRequest, mruv.offers.Offers.AcceptOfferResponse> getAcceptOfferMethod;
    if ((getAcceptOfferMethod = MruVOffersServiceGrpc.getAcceptOfferMethod) == null) {
      synchronized (MruVOffersServiceGrpc.class) {
        if ((getAcceptOfferMethod = MruVOffersServiceGrpc.getAcceptOfferMethod) == null) {
          MruVOffersServiceGrpc.getAcceptOfferMethod = getAcceptOfferMethod =
              io.grpc.MethodDescriptor.<mruv.offers.Offers.AcceptOfferRequest, mruv.offers.Offers.AcceptOfferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AcceptOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.AcceptOfferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.offers.Offers.AcceptOfferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOffersServiceMethodDescriptorSupplier("AcceptOffer"))
              .build();
        }
      }
    }
    return getAcceptOfferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVOffersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVOffersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVOffersServiceStub>() {
        @java.lang.Override
        public MruVOffersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVOffersServiceStub(channel, callOptions);
        }
      };
    return MruVOffersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVOffersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVOffersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVOffersServiceBlockingStub>() {
        @java.lang.Override
        public MruVOffersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVOffersServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVOffersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVOffersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVOffersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVOffersServiceFutureStub>() {
        @java.lang.Override
        public MruVOffersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVOffersServiceFutureStub(channel, callOptions);
        }
      };
    return MruVOffersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV offers service.
   * </pre>
   */
  public static abstract class MruVOffersServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an offer.
     * </pre>
     */
    public void createOffer(mruv.offers.Offers.CreateOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.CreateOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOfferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an offer.
     * </pre>
     */
    public void getOffer(mruv.offers.Offers.GetOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.GetOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOfferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an offer.
     * </pre>
     */
    public void updateOffer(mruv.offers.Offers.UpdateOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.UpdateOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOfferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an offer.
     * </pre>
     */
    public void deleteOffer(mruv.offers.Offers.DeleteOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.DeleteOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOfferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accept an offer and proceed transaction.
     * </pre>
     */
    public void acceptOffer(mruv.offers.Offers.AcceptOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.AcceptOfferResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptOfferMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.offers.Offers.CreateOfferRequest,
                mruv.offers.Offers.CreateOfferResponse>(
                  this, METHODID_CREATE_OFFER)))
          .addMethod(
            getGetOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.offers.Offers.GetOfferRequest,
                mruv.offers.Offers.GetOfferResponse>(
                  this, METHODID_GET_OFFER)))
          .addMethod(
            getUpdateOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.offers.Offers.UpdateOfferRequest,
                mruv.offers.Offers.UpdateOfferResponse>(
                  this, METHODID_UPDATE_OFFER)))
          .addMethod(
            getDeleteOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.offers.Offers.DeleteOfferRequest,
                mruv.offers.Offers.DeleteOfferResponse>(
                  this, METHODID_DELETE_OFFER)))
          .addMethod(
            getAcceptOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.offers.Offers.AcceptOfferRequest,
                mruv.offers.Offers.AcceptOfferResponse>(
                  this, METHODID_ACCEPT_OFFER)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV offers service.
   * </pre>
   */
  public static final class MruVOffersServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVOffersServiceStub> {
    private MruVOffersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVOffersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVOffersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an offer.
     * </pre>
     */
    public void createOffer(mruv.offers.Offers.CreateOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.CreateOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an offer.
     * </pre>
     */
    public void getOffer(mruv.offers.Offers.GetOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.GetOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an offer.
     * </pre>
     */
    public void updateOffer(mruv.offers.Offers.UpdateOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.UpdateOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an offer.
     * </pre>
     */
    public void deleteOffer(mruv.offers.Offers.DeleteOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.DeleteOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Accept an offer and proceed transaction.
     * </pre>
     */
    public void acceptOffer(mruv.offers.Offers.AcceptOfferRequest request,
        io.grpc.stub.StreamObserver<mruv.offers.Offers.AcceptOfferResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptOfferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV offers service.
   * </pre>
   */
  public static final class MruVOffersServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVOffersServiceBlockingStub> {
    private MruVOffersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVOffersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVOffersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an offer.
     * </pre>
     */
    public mruv.offers.Offers.CreateOfferResponse createOffer(mruv.offers.Offers.CreateOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOfferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an offer.
     * </pre>
     */
    public mruv.offers.Offers.GetOfferResponse getOffer(mruv.offers.Offers.GetOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOfferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an offer.
     * </pre>
     */
    public mruv.offers.Offers.UpdateOfferResponse updateOffer(mruv.offers.Offers.UpdateOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOfferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an offer.
     * </pre>
     */
    public mruv.offers.Offers.DeleteOfferResponse deleteOffer(mruv.offers.Offers.DeleteOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOfferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Accept an offer and proceed transaction.
     * </pre>
     */
    public mruv.offers.Offers.AcceptOfferResponse acceptOffer(mruv.offers.Offers.AcceptOfferRequest request) {
      return blockingUnaryCall(
          getChannel(), getAcceptOfferMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV offers service.
   * </pre>
   */
  public static final class MruVOffersServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVOffersServiceFutureStub> {
    private MruVOffersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVOffersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVOffersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an offer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.offers.Offers.CreateOfferResponse> createOffer(
        mruv.offers.Offers.CreateOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOfferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an offer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.offers.Offers.GetOfferResponse> getOffer(
        mruv.offers.Offers.GetOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOfferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an offer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.offers.Offers.UpdateOfferResponse> updateOffer(
        mruv.offers.Offers.UpdateOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOfferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an offer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.offers.Offers.DeleteOfferResponse> deleteOffer(
        mruv.offers.Offers.DeleteOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOfferMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Accept an offer and proceed transaction.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.offers.Offers.AcceptOfferResponse> acceptOffer(
        mruv.offers.Offers.AcceptOfferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptOfferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OFFER = 0;
  private static final int METHODID_GET_OFFER = 1;
  private static final int METHODID_UPDATE_OFFER = 2;
  private static final int METHODID_DELETE_OFFER = 3;
  private static final int METHODID_ACCEPT_OFFER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVOffersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVOffersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OFFER:
          serviceImpl.createOffer((mruv.offers.Offers.CreateOfferRequest) request,
              (io.grpc.stub.StreamObserver<mruv.offers.Offers.CreateOfferResponse>) responseObserver);
          break;
        case METHODID_GET_OFFER:
          serviceImpl.getOffer((mruv.offers.Offers.GetOfferRequest) request,
              (io.grpc.stub.StreamObserver<mruv.offers.Offers.GetOfferResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OFFER:
          serviceImpl.updateOffer((mruv.offers.Offers.UpdateOfferRequest) request,
              (io.grpc.stub.StreamObserver<mruv.offers.Offers.UpdateOfferResponse>) responseObserver);
          break;
        case METHODID_DELETE_OFFER:
          serviceImpl.deleteOffer((mruv.offers.Offers.DeleteOfferRequest) request,
              (io.grpc.stub.StreamObserver<mruv.offers.Offers.DeleteOfferResponse>) responseObserver);
          break;
        case METHODID_ACCEPT_OFFER:
          serviceImpl.acceptOffer((mruv.offers.Offers.AcceptOfferRequest) request,
              (io.grpc.stub.StreamObserver<mruv.offers.Offers.AcceptOfferResponse>) responseObserver);
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

  private static abstract class MruVOffersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVOffersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.offers.Offers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVOffersService");
    }
  }

  private static final class MruVOffersServiceFileDescriptorSupplier
      extends MruVOffersServiceBaseDescriptorSupplier {
    MruVOffersServiceFileDescriptorSupplier() {}
  }

  private static final class MruVOffersServiceMethodDescriptorSupplier
      extends MruVOffersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVOffersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVOffersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVOffersServiceFileDescriptorSupplier())
              .addMethod(getCreateOfferMethod())
              .addMethod(getGetOfferMethod())
              .addMethod(getUpdateOfferMethod())
              .addMethod(getDeleteOfferMethod())
              .addMethod(getAcceptOfferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
