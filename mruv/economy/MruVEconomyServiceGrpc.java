package mruv.economy;

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
 * The MruV economy service provides procedures for managing prices and economy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: economy/economy.proto")
public final class MruVEconomyServiceGrpc {

  private MruVEconomyServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.economy.MruVEconomyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.RegisterProductRequest,
      mruv.economy.Economy.RegisterProductResponse> getRegisterProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterProduct",
      requestType = mruv.economy.Economy.RegisterProductRequest.class,
      responseType = mruv.economy.Economy.RegisterProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.RegisterProductRequest,
      mruv.economy.Economy.RegisterProductResponse> getRegisterProductMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.RegisterProductRequest, mruv.economy.Economy.RegisterProductResponse> getRegisterProductMethod;
    if ((getRegisterProductMethod = MruVEconomyServiceGrpc.getRegisterProductMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getRegisterProductMethod = MruVEconomyServiceGrpc.getRegisterProductMethod) == null) {
          MruVEconomyServiceGrpc.getRegisterProductMethod = getRegisterProductMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.RegisterProductRequest, mruv.economy.Economy.RegisterProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.RegisterProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.RegisterProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("RegisterProduct"))
              .build();
        }
      }
    }
    return getRegisterProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.GetProductRequest,
      mruv.economy.Economy.GetProductResponse> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = mruv.economy.Economy.GetProductRequest.class,
      responseType = mruv.economy.Economy.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.GetProductRequest,
      mruv.economy.Economy.GetProductResponse> getGetProductMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.GetProductRequest, mruv.economy.Economy.GetProductResponse> getGetProductMethod;
    if ((getGetProductMethod = MruVEconomyServiceGrpc.getGetProductMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getGetProductMethod = MruVEconomyServiceGrpc.getGetProductMethod) == null) {
          MruVEconomyServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.GetProductRequest, mruv.economy.Economy.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.GetProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("GetProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.UpdateProductRequest,
      mruv.economy.Economy.UpdateProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = mruv.economy.Economy.UpdateProductRequest.class,
      responseType = mruv.economy.Economy.UpdateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.UpdateProductRequest,
      mruv.economy.Economy.UpdateProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.UpdateProductRequest, mruv.economy.Economy.UpdateProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = MruVEconomyServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getUpdateProductMethod = MruVEconomyServiceGrpc.getUpdateProductMethod) == null) {
          MruVEconomyServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.UpdateProductRequest, mruv.economy.Economy.UpdateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.UpdateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.DeleteProductRequest,
      mruv.economy.Economy.DeleteProductResponse> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = mruv.economy.Economy.DeleteProductRequest.class,
      responseType = mruv.economy.Economy.DeleteProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.DeleteProductRequest,
      mruv.economy.Economy.DeleteProductResponse> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.DeleteProductRequest, mruv.economy.Economy.DeleteProductResponse> getDeleteProductMethod;
    if ((getDeleteProductMethod = MruVEconomyServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getDeleteProductMethod = MruVEconomyServiceGrpc.getDeleteProductMethod) == null) {
          MruVEconomyServiceGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.DeleteProductRequest, mruv.economy.Economy.DeleteProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.DeleteProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.DeleteProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("DeleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.UpdatePriceRequest,
      mruv.economy.Economy.UpdatePriceResponse> getUpdatePriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePrice",
      requestType = mruv.economy.Economy.UpdatePriceRequest.class,
      responseType = mruv.economy.Economy.UpdatePriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.UpdatePriceRequest,
      mruv.economy.Economy.UpdatePriceResponse> getUpdatePriceMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.UpdatePriceRequest, mruv.economy.Economy.UpdatePriceResponse> getUpdatePriceMethod;
    if ((getUpdatePriceMethod = MruVEconomyServiceGrpc.getUpdatePriceMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getUpdatePriceMethod = MruVEconomyServiceGrpc.getUpdatePriceMethod) == null) {
          MruVEconomyServiceGrpc.getUpdatePriceMethod = getUpdatePriceMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.UpdatePriceRequest, mruv.economy.Economy.UpdatePriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.UpdatePriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.UpdatePriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("UpdatePrice"))
              .build();
        }
      }
    }
    return getUpdatePriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.GetPriceRequest,
      mruv.economy.Economy.GetPriceResponse> getGetPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPrice",
      requestType = mruv.economy.Economy.GetPriceRequest.class,
      responseType = mruv.economy.Economy.GetPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.GetPriceRequest,
      mruv.economy.Economy.GetPriceResponse> getGetPriceMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.GetPriceRequest, mruv.economy.Economy.GetPriceResponse> getGetPriceMethod;
    if ((getGetPriceMethod = MruVEconomyServiceGrpc.getGetPriceMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getGetPriceMethod = MruVEconomyServiceGrpc.getGetPriceMethod) == null) {
          MruVEconomyServiceGrpc.getGetPriceMethod = getGetPriceMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.GetPriceRequest, mruv.economy.Economy.GetPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.GetPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.GetPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("GetPrice"))
              .build();
        }
      }
    }
    return getGetPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.BuyProductRequest,
      mruv.economy.Economy.BuyProductResponse> getBuyProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BuyProduct",
      requestType = mruv.economy.Economy.BuyProductRequest.class,
      responseType = mruv.economy.Economy.BuyProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.BuyProductRequest,
      mruv.economy.Economy.BuyProductResponse> getBuyProductMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.BuyProductRequest, mruv.economy.Economy.BuyProductResponse> getBuyProductMethod;
    if ((getBuyProductMethod = MruVEconomyServiceGrpc.getBuyProductMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getBuyProductMethod = MruVEconomyServiceGrpc.getBuyProductMethod) == null) {
          MruVEconomyServiceGrpc.getBuyProductMethod = getBuyProductMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.BuyProductRequest, mruv.economy.Economy.BuyProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BuyProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.BuyProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.BuyProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("BuyProduct"))
              .build();
        }
      }
    }
    return getBuyProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.WatchProductRequest,
      mruv.economy.Economy.WatchProductResponse> getWatchProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchProduct",
      requestType = mruv.economy.Economy.WatchProductRequest.class,
      responseType = mruv.economy.Economy.WatchProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.WatchProductRequest,
      mruv.economy.Economy.WatchProductResponse> getWatchProductMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.WatchProductRequest, mruv.economy.Economy.WatchProductResponse> getWatchProductMethod;
    if ((getWatchProductMethod = MruVEconomyServiceGrpc.getWatchProductMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getWatchProductMethod = MruVEconomyServiceGrpc.getWatchProductMethod) == null) {
          MruVEconomyServiceGrpc.getWatchProductMethod = getWatchProductMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.WatchProductRequest, mruv.economy.Economy.WatchProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.WatchProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.WatchProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("WatchProduct"))
              .build();
        }
      }
    }
    return getWatchProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.economy.Economy.WatchPriceRequest,
      mruv.economy.Economy.WatchPriceResponse> getWatchPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchPrice",
      requestType = mruv.economy.Economy.WatchPriceRequest.class,
      responseType = mruv.economy.Economy.WatchPriceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.economy.Economy.WatchPriceRequest,
      mruv.economy.Economy.WatchPriceResponse> getWatchPriceMethod() {
    io.grpc.MethodDescriptor<mruv.economy.Economy.WatchPriceRequest, mruv.economy.Economy.WatchPriceResponse> getWatchPriceMethod;
    if ((getWatchPriceMethod = MruVEconomyServiceGrpc.getWatchPriceMethod) == null) {
      synchronized (MruVEconomyServiceGrpc.class) {
        if ((getWatchPriceMethod = MruVEconomyServiceGrpc.getWatchPriceMethod) == null) {
          MruVEconomyServiceGrpc.getWatchPriceMethod = getWatchPriceMethod =
              io.grpc.MethodDescriptor.<mruv.economy.Economy.WatchPriceRequest, mruv.economy.Economy.WatchPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.WatchPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.economy.Economy.WatchPriceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEconomyServiceMethodDescriptorSupplier("WatchPrice"))
              .build();
        }
      }
    }
    return getWatchPriceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVEconomyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEconomyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEconomyServiceStub>() {
        @java.lang.Override
        public MruVEconomyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEconomyServiceStub(channel, callOptions);
        }
      };
    return MruVEconomyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVEconomyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEconomyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEconomyServiceBlockingStub>() {
        @java.lang.Override
        public MruVEconomyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEconomyServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVEconomyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVEconomyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEconomyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEconomyServiceFutureStub>() {
        @java.lang.Override
        public MruVEconomyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEconomyServiceFutureStub(channel, callOptions);
        }
      };
    return MruVEconomyServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV economy service provides procedures for managing prices and economy.
   * </pre>
   */
  public static abstract class MruVEconomyServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register price in economy system.
     * </pre>
     */
    public void registerProduct(mruv.economy.Economy.RegisterProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.RegisterProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get product information.
     * </pre>
     */
    public void getProduct(mruv.economy.Economy.GetProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.GetProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update product information.
     * </pre>
     */
    public void updateProduct(mruv.economy.Economy.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.UpdateProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(mruv.economy.Economy.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.DeleteProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update product price.
     * </pre>
     */
    public void updatePrice(mruv.economy.Economy.UpdatePriceRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.UpdatePriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get current value for registered price.
     * </pre>
     */
    public void getPrice(mruv.economy.Economy.GetPriceRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.GetPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPriceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Send information to the system, that the product has been purchased.
     * This rpc call can affect a product price.
     * </pre>
     */
    public void buyProduct(mruv.economy.Economy.BuyProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.BuyProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBuyProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to events related to a product.
     * </pre>
     */
    public void watchProduct(mruv.economy.Economy.WatchProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.WatchProductResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Subscribe to product price changes.
     * </pre>
     */
    public void watchPrice(mruv.economy.Economy.WatchPriceRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.WatchPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWatchPriceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.RegisterProductRequest,
                mruv.economy.Economy.RegisterProductResponse>(
                  this, METHODID_REGISTER_PRODUCT)))
          .addMethod(
            getGetProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.GetProductRequest,
                mruv.economy.Economy.GetProductResponse>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.UpdateProductRequest,
                mruv.economy.Economy.UpdateProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getDeleteProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.DeleteProductRequest,
                mruv.economy.Economy.DeleteProductResponse>(
                  this, METHODID_DELETE_PRODUCT)))
          .addMethod(
            getUpdatePriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.UpdatePriceRequest,
                mruv.economy.Economy.UpdatePriceResponse>(
                  this, METHODID_UPDATE_PRICE)))
          .addMethod(
            getGetPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.GetPriceRequest,
                mruv.economy.Economy.GetPriceResponse>(
                  this, METHODID_GET_PRICE)))
          .addMethod(
            getBuyProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.economy.Economy.BuyProductRequest,
                mruv.economy.Economy.BuyProductResponse>(
                  this, METHODID_BUY_PRODUCT)))
          .addMethod(
            getWatchProductMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Economy.WatchProductRequest,
                mruv.economy.Economy.WatchProductResponse>(
                  this, METHODID_WATCH_PRODUCT)))
          .addMethod(
            getWatchPriceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.economy.Economy.WatchPriceRequest,
                mruv.economy.Economy.WatchPriceResponse>(
                  this, METHODID_WATCH_PRICE)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV economy service provides procedures for managing prices and economy.
   * </pre>
   */
  public static final class MruVEconomyServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVEconomyServiceStub> {
    private MruVEconomyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEconomyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEconomyServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register price in economy system.
     * </pre>
     */
    public void registerProduct(mruv.economy.Economy.RegisterProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.RegisterProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get product information.
     * </pre>
     */
    public void getProduct(mruv.economy.Economy.GetProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.GetProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update product information.
     * </pre>
     */
    public void updateProduct(mruv.economy.Economy.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.UpdateProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(mruv.economy.Economy.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.DeleteProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update product price.
     * </pre>
     */
    public void updatePrice(mruv.economy.Economy.UpdatePriceRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.UpdatePriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get current value for registered price.
     * </pre>
     */
    public void getPrice(mruv.economy.Economy.GetPriceRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.GetPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Send information to the system, that the product has been purchased.
     * This rpc call can affect a product price.
     * </pre>
     */
    public void buyProduct(mruv.economy.Economy.BuyProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.BuyProductResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBuyProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to events related to a product.
     * </pre>
     */
    public void watchProduct(mruv.economy.Economy.WatchProductRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.WatchProductResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Subscribe to product price changes.
     * </pre>
     */
    public void watchPrice(mruv.economy.Economy.WatchPriceRequest request,
        io.grpc.stub.StreamObserver<mruv.economy.Economy.WatchPriceResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWatchPriceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV economy service provides procedures for managing prices and economy.
   * </pre>
   */
  public static final class MruVEconomyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVEconomyServiceBlockingStub> {
    private MruVEconomyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEconomyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEconomyServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register price in economy system.
     * </pre>
     */
    public mruv.economy.Economy.RegisterProductResponse registerProduct(mruv.economy.Economy.RegisterProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get product information.
     * </pre>
     */
    public mruv.economy.Economy.GetProductResponse getProduct(mruv.economy.Economy.GetProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update product information.
     * </pre>
     */
    public mruv.economy.Economy.UpdateProductResponse updateProduct(mruv.economy.Economy.UpdateProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.economy.Economy.DeleteProductResponse deleteProduct(mruv.economy.Economy.DeleteProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update product price.
     * </pre>
     */
    public mruv.economy.Economy.UpdatePriceResponse updatePrice(mruv.economy.Economy.UpdatePriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get current value for registered price.
     * </pre>
     */
    public mruv.economy.Economy.GetPriceResponse getPrice(mruv.economy.Economy.GetPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPriceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Send information to the system, that the product has been purchased.
     * This rpc call can affect a product price.
     * </pre>
     */
    public mruv.economy.Economy.BuyProductResponse buyProduct(mruv.economy.Economy.BuyProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getBuyProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to events related to a product.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Economy.WatchProductResponse> watchProduct(
        mruv.economy.Economy.WatchProductRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Subscribe to product price changes.
     * </pre>
     */
    public java.util.Iterator<mruv.economy.Economy.WatchPriceResponse> watchPrice(
        mruv.economy.Economy.WatchPriceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWatchPriceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV economy service provides procedures for managing prices and economy.
   * </pre>
   */
  public static final class MruVEconomyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVEconomyServiceFutureStub> {
    private MruVEconomyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEconomyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEconomyServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register price in economy system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.RegisterProductResponse> registerProduct(
        mruv.economy.Economy.RegisterProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get product information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.GetProductResponse> getProduct(
        mruv.economy.Economy.GetProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update product information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.UpdateProductResponse> updateProduct(
        mruv.economy.Economy.UpdateProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.DeleteProductResponse> deleteProduct(
        mruv.economy.Economy.DeleteProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update product price.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.UpdatePriceResponse> updatePrice(
        mruv.economy.Economy.UpdatePriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get current value for registered price.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.GetPriceResponse> getPrice(
        mruv.economy.Economy.GetPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPriceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Send information to the system, that the product has been purchased.
     * This rpc call can affect a product price.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.economy.Economy.BuyProductResponse> buyProduct(
        mruv.economy.Economy.BuyProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBuyProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;
  private static final int METHODID_DELETE_PRODUCT = 3;
  private static final int METHODID_UPDATE_PRICE = 4;
  private static final int METHODID_GET_PRICE = 5;
  private static final int METHODID_BUY_PRODUCT = 6;
  private static final int METHODID_WATCH_PRODUCT = 7;
  private static final int METHODID_WATCH_PRICE = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVEconomyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVEconomyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_PRODUCT:
          serviceImpl.registerProduct((mruv.economy.Economy.RegisterProductRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.RegisterProductResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((mruv.economy.Economy.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.GetProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((mruv.economy.Economy.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.UpdateProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((mruv.economy.Economy.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.DeleteProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRICE:
          serviceImpl.updatePrice((mruv.economy.Economy.UpdatePriceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.UpdatePriceResponse>) responseObserver);
          break;
        case METHODID_GET_PRICE:
          serviceImpl.getPrice((mruv.economy.Economy.GetPriceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.GetPriceResponse>) responseObserver);
          break;
        case METHODID_BUY_PRODUCT:
          serviceImpl.buyProduct((mruv.economy.Economy.BuyProductRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.BuyProductResponse>) responseObserver);
          break;
        case METHODID_WATCH_PRODUCT:
          serviceImpl.watchProduct((mruv.economy.Economy.WatchProductRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.WatchProductResponse>) responseObserver);
          break;
        case METHODID_WATCH_PRICE:
          serviceImpl.watchPrice((mruv.economy.Economy.WatchPriceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.economy.Economy.WatchPriceResponse>) responseObserver);
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

  private static abstract class MruVEconomyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVEconomyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.economy.Economy.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVEconomyService");
    }
  }

  private static final class MruVEconomyServiceFileDescriptorSupplier
      extends MruVEconomyServiceBaseDescriptorSupplier {
    MruVEconomyServiceFileDescriptorSupplier() {}
  }

  private static final class MruVEconomyServiceMethodDescriptorSupplier
      extends MruVEconomyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVEconomyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVEconomyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVEconomyServiceFileDescriptorSupplier())
              .addMethod(getRegisterProductMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getDeleteProductMethod())
              .addMethod(getUpdatePriceMethod())
              .addMethod(getGetPriceMethod())
              .addMethod(getBuyProductMethod())
              .addMethod(getWatchProductMethod())
              .addMethod(getWatchPriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
