package mruv.plots;

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
 * The MruV plots service provides procedures for managing buildings plots and other areas.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: plots/plots.proto")
public final class MruVPlotsServiceGrpc {

  private MruVPlotsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.plots.MruVPlotsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.plots.Plots.CreatePlotRequest,
      mruv.plots.Plots.CreatePlotResponse> getCreatePlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlot",
      requestType = mruv.plots.Plots.CreatePlotRequest.class,
      responseType = mruv.plots.Plots.CreatePlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.plots.Plots.CreatePlotRequest,
      mruv.plots.Plots.CreatePlotResponse> getCreatePlotMethod() {
    io.grpc.MethodDescriptor<mruv.plots.Plots.CreatePlotRequest, mruv.plots.Plots.CreatePlotResponse> getCreatePlotMethod;
    if ((getCreatePlotMethod = MruVPlotsServiceGrpc.getCreatePlotMethod) == null) {
      synchronized (MruVPlotsServiceGrpc.class) {
        if ((getCreatePlotMethod = MruVPlotsServiceGrpc.getCreatePlotMethod) == null) {
          MruVPlotsServiceGrpc.getCreatePlotMethod = getCreatePlotMethod =
              io.grpc.MethodDescriptor.<mruv.plots.Plots.CreatePlotRequest, mruv.plots.Plots.CreatePlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.CreatePlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.CreatePlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPlotsServiceMethodDescriptorSupplier("CreatePlot"))
              .build();
        }
      }
    }
    return getCreatePlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.plots.Plots.GetPlotRequest,
      mruv.plots.Plots.GetPlotResponse> getGetPlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlot",
      requestType = mruv.plots.Plots.GetPlotRequest.class,
      responseType = mruv.plots.Plots.GetPlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.plots.Plots.GetPlotRequest,
      mruv.plots.Plots.GetPlotResponse> getGetPlotMethod() {
    io.grpc.MethodDescriptor<mruv.plots.Plots.GetPlotRequest, mruv.plots.Plots.GetPlotResponse> getGetPlotMethod;
    if ((getGetPlotMethod = MruVPlotsServiceGrpc.getGetPlotMethod) == null) {
      synchronized (MruVPlotsServiceGrpc.class) {
        if ((getGetPlotMethod = MruVPlotsServiceGrpc.getGetPlotMethod) == null) {
          MruVPlotsServiceGrpc.getGetPlotMethod = getGetPlotMethod =
              io.grpc.MethodDescriptor.<mruv.plots.Plots.GetPlotRequest, mruv.plots.Plots.GetPlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.GetPlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.GetPlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPlotsServiceMethodDescriptorSupplier("GetPlot"))
              .build();
        }
      }
    }
    return getGetPlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.plots.Plots.UpdatePlotRequest,
      mruv.plots.Plots.UpdatePlotResponse> getUpdatePlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlot",
      requestType = mruv.plots.Plots.UpdatePlotRequest.class,
      responseType = mruv.plots.Plots.UpdatePlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.plots.Plots.UpdatePlotRequest,
      mruv.plots.Plots.UpdatePlotResponse> getUpdatePlotMethod() {
    io.grpc.MethodDescriptor<mruv.plots.Plots.UpdatePlotRequest, mruv.plots.Plots.UpdatePlotResponse> getUpdatePlotMethod;
    if ((getUpdatePlotMethod = MruVPlotsServiceGrpc.getUpdatePlotMethod) == null) {
      synchronized (MruVPlotsServiceGrpc.class) {
        if ((getUpdatePlotMethod = MruVPlotsServiceGrpc.getUpdatePlotMethod) == null) {
          MruVPlotsServiceGrpc.getUpdatePlotMethod = getUpdatePlotMethod =
              io.grpc.MethodDescriptor.<mruv.plots.Plots.UpdatePlotRequest, mruv.plots.Plots.UpdatePlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.UpdatePlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.UpdatePlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPlotsServiceMethodDescriptorSupplier("UpdatePlot"))
              .build();
        }
      }
    }
    return getUpdatePlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.plots.Plots.DeletePlotRequest,
      mruv.plots.Plots.DeletePlotResponse> getDeletePlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePlot",
      requestType = mruv.plots.Plots.DeletePlotRequest.class,
      responseType = mruv.plots.Plots.DeletePlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.plots.Plots.DeletePlotRequest,
      mruv.plots.Plots.DeletePlotResponse> getDeletePlotMethod() {
    io.grpc.MethodDescriptor<mruv.plots.Plots.DeletePlotRequest, mruv.plots.Plots.DeletePlotResponse> getDeletePlotMethod;
    if ((getDeletePlotMethod = MruVPlotsServiceGrpc.getDeletePlotMethod) == null) {
      synchronized (MruVPlotsServiceGrpc.class) {
        if ((getDeletePlotMethod = MruVPlotsServiceGrpc.getDeletePlotMethod) == null) {
          MruVPlotsServiceGrpc.getDeletePlotMethod = getDeletePlotMethod =
              io.grpc.MethodDescriptor.<mruv.plots.Plots.DeletePlotRequest, mruv.plots.Plots.DeletePlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.DeletePlotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.plots.Plots.DeletePlotResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVPlotsServiceMethodDescriptorSupplier("DeletePlot"))
              .build();
        }
      }
    }
    return getDeletePlotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVPlotsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVPlotsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVPlotsServiceStub>() {
        @java.lang.Override
        public MruVPlotsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVPlotsServiceStub(channel, callOptions);
        }
      };
    return MruVPlotsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVPlotsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVPlotsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVPlotsServiceBlockingStub>() {
        @java.lang.Override
        public MruVPlotsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVPlotsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVPlotsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVPlotsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVPlotsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVPlotsServiceFutureStub>() {
        @java.lang.Override
        public MruVPlotsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVPlotsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVPlotsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV plots service provides procedures for managing buildings plots and other areas.
   * </pre>
   */
  public static abstract class MruVPlotsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a plot.
     * </pre>
     */
    public void createPlot(mruv.plots.Plots.CreatePlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.CreatePlotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePlotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a plot.
     * </pre>
     */
    public void getPlot(mruv.plots.Plots.GetPlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.GetPlotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPlotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a plot.
     * </pre>
     */
    public void updatePlot(mruv.plots.Plots.UpdatePlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.UpdatePlotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePlotMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a plot.
     * </pre>
     */
    public void deletePlot(mruv.plots.Plots.DeletePlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.DeletePlotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePlotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreatePlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.plots.Plots.CreatePlotRequest,
                mruv.plots.Plots.CreatePlotResponse>(
                  this, METHODID_CREATE_PLOT)))
          .addMethod(
            getGetPlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.plots.Plots.GetPlotRequest,
                mruv.plots.Plots.GetPlotResponse>(
                  this, METHODID_GET_PLOT)))
          .addMethod(
            getUpdatePlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.plots.Plots.UpdatePlotRequest,
                mruv.plots.Plots.UpdatePlotResponse>(
                  this, METHODID_UPDATE_PLOT)))
          .addMethod(
            getDeletePlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.plots.Plots.DeletePlotRequest,
                mruv.plots.Plots.DeletePlotResponse>(
                  this, METHODID_DELETE_PLOT)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV plots service provides procedures for managing buildings plots and other areas.
   * </pre>
   */
  public static final class MruVPlotsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVPlotsServiceStub> {
    private MruVPlotsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVPlotsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVPlotsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a plot.
     * </pre>
     */
    public void createPlot(mruv.plots.Plots.CreatePlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.CreatePlotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a plot.
     * </pre>
     */
    public void getPlot(mruv.plots.Plots.GetPlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.GetPlotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a plot.
     * </pre>
     */
    public void updatePlot(mruv.plots.Plots.UpdatePlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.UpdatePlotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a plot.
     * </pre>
     */
    public void deletePlot(mruv.plots.Plots.DeletePlotRequest request,
        io.grpc.stub.StreamObserver<mruv.plots.Plots.DeletePlotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePlotMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV plots service provides procedures for managing buildings plots and other areas.
   * </pre>
   */
  public static final class MruVPlotsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVPlotsServiceBlockingStub> {
    private MruVPlotsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVPlotsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVPlotsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a plot.
     * </pre>
     */
    public mruv.plots.Plots.CreatePlotResponse createPlot(mruv.plots.Plots.CreatePlotRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePlotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a plot.
     * </pre>
     */
    public mruv.plots.Plots.GetPlotResponse getPlot(mruv.plots.Plots.GetPlotRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPlotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a plot.
     * </pre>
     */
    public mruv.plots.Plots.UpdatePlotResponse updatePlot(mruv.plots.Plots.UpdatePlotRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePlotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a plot.
     * </pre>
     */
    public mruv.plots.Plots.DeletePlotResponse deletePlot(mruv.plots.Plots.DeletePlotRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePlotMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV plots service provides procedures for managing buildings plots and other areas.
   * </pre>
   */
  public static final class MruVPlotsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVPlotsServiceFutureStub> {
    private MruVPlotsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVPlotsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVPlotsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a plot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.plots.Plots.CreatePlotResponse> createPlot(
        mruv.plots.Plots.CreatePlotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePlotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a plot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.plots.Plots.GetPlotResponse> getPlot(
        mruv.plots.Plots.GetPlotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPlotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a plot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.plots.Plots.UpdatePlotResponse> updatePlot(
        mruv.plots.Plots.UpdatePlotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePlotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a plot.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.plots.Plots.DeletePlotResponse> deletePlot(
        mruv.plots.Plots.DeletePlotRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePlotMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PLOT = 0;
  private static final int METHODID_GET_PLOT = 1;
  private static final int METHODID_UPDATE_PLOT = 2;
  private static final int METHODID_DELETE_PLOT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVPlotsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVPlotsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PLOT:
          serviceImpl.createPlot((mruv.plots.Plots.CreatePlotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.plots.Plots.CreatePlotResponse>) responseObserver);
          break;
        case METHODID_GET_PLOT:
          serviceImpl.getPlot((mruv.plots.Plots.GetPlotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.plots.Plots.GetPlotResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLOT:
          serviceImpl.updatePlot((mruv.plots.Plots.UpdatePlotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.plots.Plots.UpdatePlotResponse>) responseObserver);
          break;
        case METHODID_DELETE_PLOT:
          serviceImpl.deletePlot((mruv.plots.Plots.DeletePlotRequest) request,
              (io.grpc.stub.StreamObserver<mruv.plots.Plots.DeletePlotResponse>) responseObserver);
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

  private static abstract class MruVPlotsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVPlotsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.plots.Plots.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVPlotsService");
    }
  }

  private static final class MruVPlotsServiceFileDescriptorSupplier
      extends MruVPlotsServiceBaseDescriptorSupplier {
    MruVPlotsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVPlotsServiceMethodDescriptorSupplier
      extends MruVPlotsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVPlotsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVPlotsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVPlotsServiceFileDescriptorSupplier())
              .addMethod(getCreatePlotMethod())
              .addMethod(getGetPlotMethod())
              .addMethod(getUpdatePlotMethod())
              .addMethod(getDeletePlotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
