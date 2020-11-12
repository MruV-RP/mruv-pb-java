package mruv.devtools;

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
 * The MruV developer tools service for mruv-devtools package.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: devtools/devtools.proto")
public final class MruVDevToolsServiceGrpc {

  private MruVDevToolsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.devtools.MruVDevToolsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetPositionsRequest,
      mruv.devtools.Devtools.GetPositionsResponse> getGetPositionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPositions",
      requestType = mruv.devtools.Devtools.GetPositionsRequest.class,
      responseType = mruv.devtools.Devtools.GetPositionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetPositionsRequest,
      mruv.devtools.Devtools.GetPositionsResponse> getGetPositionsMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetPositionsRequest, mruv.devtools.Devtools.GetPositionsResponse> getGetPositionsMethod;
    if ((getGetPositionsMethod = MruVDevToolsServiceGrpc.getGetPositionsMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getGetPositionsMethod = MruVDevToolsServiceGrpc.getGetPositionsMethod) == null) {
          MruVDevToolsServiceGrpc.getGetPositionsMethod = getGetPositionsMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.GetPositionsRequest, mruv.devtools.Devtools.GetPositionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPositions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetPositionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetPositionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("GetPositions"))
              .build();
        }
      }
    }
    return getGetPositionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.SavePositionRequest,
      mruv.devtools.Devtools.SavePositionResponse> getSavePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SavePosition",
      requestType = mruv.devtools.Devtools.SavePositionRequest.class,
      responseType = mruv.devtools.Devtools.SavePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.SavePositionRequest,
      mruv.devtools.Devtools.SavePositionResponse> getSavePositionMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.SavePositionRequest, mruv.devtools.Devtools.SavePositionResponse> getSavePositionMethod;
    if ((getSavePositionMethod = MruVDevToolsServiceGrpc.getSavePositionMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getSavePositionMethod = MruVDevToolsServiceGrpc.getSavePositionMethod) == null) {
          MruVDevToolsServiceGrpc.getSavePositionMethod = getSavePositionMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.SavePositionRequest, mruv.devtools.Devtools.SavePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SavePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.SavePositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.SavePositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("SavePosition"))
              .build();
        }
      }
    }
    return getSavePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.DeletePositionRequest,
      mruv.devtools.Devtools.DeletePositionResponse> getDeletePositionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePosition",
      requestType = mruv.devtools.Devtools.DeletePositionRequest.class,
      responseType = mruv.devtools.Devtools.DeletePositionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.DeletePositionRequest,
      mruv.devtools.Devtools.DeletePositionResponse> getDeletePositionMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.DeletePositionRequest, mruv.devtools.Devtools.DeletePositionResponse> getDeletePositionMethod;
    if ((getDeletePositionMethod = MruVDevToolsServiceGrpc.getDeletePositionMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getDeletePositionMethod = MruVDevToolsServiceGrpc.getDeletePositionMethod) == null) {
          MruVDevToolsServiceGrpc.getDeletePositionMethod = getDeletePositionMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.DeletePositionRequest, mruv.devtools.Devtools.DeletePositionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePosition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.DeletePositionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.DeletePositionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("DeletePosition"))
              .build();
        }
      }
    }
    return getDeletePositionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetOutfitsRequest,
      mruv.devtools.Devtools.GetOutfitsResponse> getGetOutfitsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOutfits",
      requestType = mruv.devtools.Devtools.GetOutfitsRequest.class,
      responseType = mruv.devtools.Devtools.GetOutfitsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetOutfitsRequest,
      mruv.devtools.Devtools.GetOutfitsResponse> getGetOutfitsMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetOutfitsRequest, mruv.devtools.Devtools.GetOutfitsResponse> getGetOutfitsMethod;
    if ((getGetOutfitsMethod = MruVDevToolsServiceGrpc.getGetOutfitsMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getGetOutfitsMethod = MruVDevToolsServiceGrpc.getGetOutfitsMethod) == null) {
          MruVDevToolsServiceGrpc.getGetOutfitsMethod = getGetOutfitsMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.GetOutfitsRequest, mruv.devtools.Devtools.GetOutfitsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOutfits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetOutfitsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetOutfitsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("GetOutfits"))
              .build();
        }
      }
    }
    return getGetOutfitsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.SaveOutfitRequest,
      mruv.devtools.Devtools.SaveOutfitResponse> getSaveOutfitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveOutfit",
      requestType = mruv.devtools.Devtools.SaveOutfitRequest.class,
      responseType = mruv.devtools.Devtools.SaveOutfitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.SaveOutfitRequest,
      mruv.devtools.Devtools.SaveOutfitResponse> getSaveOutfitMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.SaveOutfitRequest, mruv.devtools.Devtools.SaveOutfitResponse> getSaveOutfitMethod;
    if ((getSaveOutfitMethod = MruVDevToolsServiceGrpc.getSaveOutfitMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getSaveOutfitMethod = MruVDevToolsServiceGrpc.getSaveOutfitMethod) == null) {
          MruVDevToolsServiceGrpc.getSaveOutfitMethod = getSaveOutfitMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.SaveOutfitRequest, mruv.devtools.Devtools.SaveOutfitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveOutfit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.SaveOutfitRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.SaveOutfitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("SaveOutfit"))
              .build();
        }
      }
    }
    return getSaveOutfitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetAnimationsRequest,
      mruv.devtools.Devtools.GetAnimationsResponse> getGetAnimationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimations",
      requestType = mruv.devtools.Devtools.GetAnimationsRequest.class,
      responseType = mruv.devtools.Devtools.GetAnimationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetAnimationsRequest,
      mruv.devtools.Devtools.GetAnimationsResponse> getGetAnimationsMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetAnimationsRequest, mruv.devtools.Devtools.GetAnimationsResponse> getGetAnimationsMethod;
    if ((getGetAnimationsMethod = MruVDevToolsServiceGrpc.getGetAnimationsMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getGetAnimationsMethod = MruVDevToolsServiceGrpc.getGetAnimationsMethod) == null) {
          MruVDevToolsServiceGrpc.getGetAnimationsMethod = getGetAnimationsMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.GetAnimationsRequest, mruv.devtools.Devtools.GetAnimationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetAnimationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetAnimationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("GetAnimations"))
              .build();
        }
      }
    }
    return getGetAnimationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetAnimationRequest,
      mruv.devtools.Devtools.GetAnimationResponse> getGetAnimationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnimation",
      requestType = mruv.devtools.Devtools.GetAnimationRequest.class,
      responseType = mruv.devtools.Devtools.GetAnimationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetAnimationRequest,
      mruv.devtools.Devtools.GetAnimationResponse> getGetAnimationMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.GetAnimationRequest, mruv.devtools.Devtools.GetAnimationResponse> getGetAnimationMethod;
    if ((getGetAnimationMethod = MruVDevToolsServiceGrpc.getGetAnimationMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getGetAnimationMethod = MruVDevToolsServiceGrpc.getGetAnimationMethod) == null) {
          MruVDevToolsServiceGrpc.getGetAnimationMethod = getGetAnimationMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.GetAnimationRequest, mruv.devtools.Devtools.GetAnimationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnimation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetAnimationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.GetAnimationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("GetAnimation"))
              .build();
        }
      }
    }
    return getGetAnimationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.devtools.Devtools.SaveAnimationRequest,
      mruv.devtools.Devtools.SaveAnimationResponse> getSaveAnimationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAnimation",
      requestType = mruv.devtools.Devtools.SaveAnimationRequest.class,
      responseType = mruv.devtools.Devtools.SaveAnimationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.devtools.Devtools.SaveAnimationRequest,
      mruv.devtools.Devtools.SaveAnimationResponse> getSaveAnimationMethod() {
    io.grpc.MethodDescriptor<mruv.devtools.Devtools.SaveAnimationRequest, mruv.devtools.Devtools.SaveAnimationResponse> getSaveAnimationMethod;
    if ((getSaveAnimationMethod = MruVDevToolsServiceGrpc.getSaveAnimationMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getSaveAnimationMethod = MruVDevToolsServiceGrpc.getSaveAnimationMethod) == null) {
          MruVDevToolsServiceGrpc.getSaveAnimationMethod = getSaveAnimationMethod =
              io.grpc.MethodDescriptor.<mruv.devtools.Devtools.SaveAnimationRequest, mruv.devtools.Devtools.SaveAnimationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveAnimation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.SaveAnimationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.devtools.Devtools.SaveAnimationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("SaveAnimation"))
              .build();
        }
      }
    }
    return getSaveAnimationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.common.Health.ServiceStatusRequest,
      mruv.common.Health.ServiceStatusResponse> getGetServiceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceStatus",
      requestType = mruv.common.Health.ServiceStatusRequest.class,
      responseType = mruv.common.Health.ServiceStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.common.Health.ServiceStatusRequest,
      mruv.common.Health.ServiceStatusResponse> getGetServiceStatusMethod() {
    io.grpc.MethodDescriptor<mruv.common.Health.ServiceStatusRequest, mruv.common.Health.ServiceStatusResponse> getGetServiceStatusMethod;
    if ((getGetServiceStatusMethod = MruVDevToolsServiceGrpc.getGetServiceStatusMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getGetServiceStatusMethod = MruVDevToolsServiceGrpc.getGetServiceStatusMethod) == null) {
          MruVDevToolsServiceGrpc.getGetServiceStatusMethod = getGetServiceStatusMethod =
              io.grpc.MethodDescriptor.<mruv.common.Health.ServiceStatusRequest, mruv.common.Health.ServiceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.ServiceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.ServiceStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("GetServiceStatus"))
              .build();
        }
      }
    }
    return getGetServiceStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.common.Health.VersionRequest,
      mruv.common.Health.VersionResponse> getGetServiceVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceVersion",
      requestType = mruv.common.Health.VersionRequest.class,
      responseType = mruv.common.Health.VersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.common.Health.VersionRequest,
      mruv.common.Health.VersionResponse> getGetServiceVersionMethod() {
    io.grpc.MethodDescriptor<mruv.common.Health.VersionRequest, mruv.common.Health.VersionResponse> getGetServiceVersionMethod;
    if ((getGetServiceVersionMethod = MruVDevToolsServiceGrpc.getGetServiceVersionMethod) == null) {
      synchronized (MruVDevToolsServiceGrpc.class) {
        if ((getGetServiceVersionMethod = MruVDevToolsServiceGrpc.getGetServiceVersionMethod) == null) {
          MruVDevToolsServiceGrpc.getGetServiceVersionMethod = getGetServiceVersionMethod =
              io.grpc.MethodDescriptor.<mruv.common.Health.VersionRequest, mruv.common.Health.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.VersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVDevToolsServiceMethodDescriptorSupplier("GetServiceVersion"))
              .build();
        }
      }
    }
    return getGetServiceVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVDevToolsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVDevToolsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVDevToolsServiceStub>() {
        @java.lang.Override
        public MruVDevToolsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVDevToolsServiceStub(channel, callOptions);
        }
      };
    return MruVDevToolsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVDevToolsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVDevToolsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVDevToolsServiceBlockingStub>() {
        @java.lang.Override
        public MruVDevToolsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVDevToolsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVDevToolsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVDevToolsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVDevToolsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVDevToolsServiceFutureStub>() {
        @java.lang.Override
        public MruVDevToolsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVDevToolsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVDevToolsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV developer tools service for mruv-devtools package.
   * </pre>
   */
  public static abstract class MruVDevToolsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get saved positions.
     * </pre>
     */
    public void getPositions(mruv.devtools.Devtools.GetPositionsRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetPositionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPositionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Save position.
     * </pre>
     */
    public void savePosition(mruv.devtools.Devtools.SavePositionRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SavePositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete position.
     * </pre>
     */
    public void deletePosition(mruv.devtools.Devtools.DeletePositionRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.DeletePositionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePositionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get saved outfit.
     * </pre>
     */
    public void getOutfits(mruv.devtools.Devtools.GetOutfitsRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetOutfitsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOutfitsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Save outfit.
     * </pre>
     */
    public void saveOutfit(mruv.devtools.Devtools.SaveOutfitRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SaveOutfitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveOutfitMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all saved animations.
     * </pre>
     */
    public void getAnimations(mruv.devtools.Devtools.GetAnimationsRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetAnimationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnimationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get saved animation by name.
     * </pre>
     */
    public void getAnimation(mruv.devtools.Devtools.GetAnimationRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetAnimationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnimationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Save animation.
     * </pre>
     */
    public void saveAnimation(mruv.devtools.Devtools.SaveAnimationRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SaveAnimationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAnimationMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get service status.
     * </pre>
     */
    public void getServiceStatus(mruv.common.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.ServiceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get service version.
     * </pre>
     */
    public void getServiceVersion(mruv.common.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.VersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceVersionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPositionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.GetPositionsRequest,
                mruv.devtools.Devtools.GetPositionsResponse>(
                  this, METHODID_GET_POSITIONS)))
          .addMethod(
            getSavePositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.SavePositionRequest,
                mruv.devtools.Devtools.SavePositionResponse>(
                  this, METHODID_SAVE_POSITION)))
          .addMethod(
            getDeletePositionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.DeletePositionRequest,
                mruv.devtools.Devtools.DeletePositionResponse>(
                  this, METHODID_DELETE_POSITION)))
          .addMethod(
            getGetOutfitsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.GetOutfitsRequest,
                mruv.devtools.Devtools.GetOutfitsResponse>(
                  this, METHODID_GET_OUTFITS)))
          .addMethod(
            getSaveOutfitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.SaveOutfitRequest,
                mruv.devtools.Devtools.SaveOutfitResponse>(
                  this, METHODID_SAVE_OUTFIT)))
          .addMethod(
            getGetAnimationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.GetAnimationsRequest,
                mruv.devtools.Devtools.GetAnimationsResponse>(
                  this, METHODID_GET_ANIMATIONS)))
          .addMethod(
            getGetAnimationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.GetAnimationRequest,
                mruv.devtools.Devtools.GetAnimationResponse>(
                  this, METHODID_GET_ANIMATION)))
          .addMethod(
            getSaveAnimationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.devtools.Devtools.SaveAnimationRequest,
                mruv.devtools.Devtools.SaveAnimationResponse>(
                  this, METHODID_SAVE_ANIMATION)))
          .addMethod(
            getGetServiceStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.common.Health.ServiceStatusRequest,
                mruv.common.Health.ServiceStatusResponse>(
                  this, METHODID_GET_SERVICE_STATUS)))
          .addMethod(
            getGetServiceVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.common.Health.VersionRequest,
                mruv.common.Health.VersionResponse>(
                  this, METHODID_GET_SERVICE_VERSION)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV developer tools service for mruv-devtools package.
   * </pre>
   */
  public static final class MruVDevToolsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVDevToolsServiceStub> {
    private MruVDevToolsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVDevToolsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVDevToolsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get saved positions.
     * </pre>
     */
    public void getPositions(mruv.devtools.Devtools.GetPositionsRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetPositionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPositionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save position.
     * </pre>
     */
    public void savePosition(mruv.devtools.Devtools.SavePositionRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SavePositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete position.
     * </pre>
     */
    public void deletePosition(mruv.devtools.Devtools.DeletePositionRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.DeletePositionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePositionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get saved outfit.
     * </pre>
     */
    public void getOutfits(mruv.devtools.Devtools.GetOutfitsRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetOutfitsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOutfitsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save outfit.
     * </pre>
     */
    public void saveOutfit(mruv.devtools.Devtools.SaveOutfitRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SaveOutfitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveOutfitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all saved animations.
     * </pre>
     */
    public void getAnimations(mruv.devtools.Devtools.GetAnimationsRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetAnimationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnimationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get saved animation by name.
     * </pre>
     */
    public void getAnimation(mruv.devtools.Devtools.GetAnimationRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetAnimationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnimationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save animation.
     * </pre>
     */
    public void saveAnimation(mruv.devtools.Devtools.SaveAnimationRequest request,
        io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SaveAnimationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAnimationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get service status.
     * </pre>
     */
    public void getServiceStatus(mruv.common.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.ServiceStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get service version.
     * </pre>
     */
    public void getServiceVersion(mruv.common.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.VersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV developer tools service for mruv-devtools package.
   * </pre>
   */
  public static final class MruVDevToolsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVDevToolsServiceBlockingStub> {
    private MruVDevToolsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVDevToolsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVDevToolsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get saved positions.
     * </pre>
     */
    public mruv.devtools.Devtools.GetPositionsResponse getPositions(mruv.devtools.Devtools.GetPositionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPositionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Save position.
     * </pre>
     */
    public mruv.devtools.Devtools.SavePositionResponse savePosition(mruv.devtools.Devtools.SavePositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSavePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete position.
     * </pre>
     */
    public mruv.devtools.Devtools.DeletePositionResponse deletePosition(mruv.devtools.Devtools.DeletePositionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePositionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get saved outfit.
     * </pre>
     */
    public mruv.devtools.Devtools.GetOutfitsResponse getOutfits(mruv.devtools.Devtools.GetOutfitsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOutfitsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Save outfit.
     * </pre>
     */
    public mruv.devtools.Devtools.SaveOutfitResponse saveOutfit(mruv.devtools.Devtools.SaveOutfitRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveOutfitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all saved animations.
     * </pre>
     */
    public mruv.devtools.Devtools.GetAnimationsResponse getAnimations(mruv.devtools.Devtools.GetAnimationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnimationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get saved animation by name.
     * </pre>
     */
    public mruv.devtools.Devtools.GetAnimationResponse getAnimation(mruv.devtools.Devtools.GetAnimationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnimationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Save animation.
     * </pre>
     */
    public mruv.devtools.Devtools.SaveAnimationResponse saveAnimation(mruv.devtools.Devtools.SaveAnimationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveAnimationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get service status.
     * </pre>
     */
    public mruv.common.Health.ServiceStatusResponse getServiceStatus(mruv.common.Health.ServiceStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get service version.
     * </pre>
     */
    public mruv.common.Health.VersionResponse getServiceVersion(mruv.common.Health.VersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV developer tools service for mruv-devtools package.
   * </pre>
   */
  public static final class MruVDevToolsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVDevToolsServiceFutureStub> {
    private MruVDevToolsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVDevToolsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVDevToolsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get saved positions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.GetPositionsResponse> getPositions(
        mruv.devtools.Devtools.GetPositionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPositionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Save position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.SavePositionResponse> savePosition(
        mruv.devtools.Devtools.SavePositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.DeletePositionResponse> deletePosition(
        mruv.devtools.Devtools.DeletePositionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePositionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get saved outfit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.GetOutfitsResponse> getOutfits(
        mruv.devtools.Devtools.GetOutfitsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOutfitsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Save outfit.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.SaveOutfitResponse> saveOutfit(
        mruv.devtools.Devtools.SaveOutfitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveOutfitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all saved animations.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.GetAnimationsResponse> getAnimations(
        mruv.devtools.Devtools.GetAnimationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnimationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get saved animation by name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.GetAnimationResponse> getAnimation(
        mruv.devtools.Devtools.GetAnimationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnimationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Save animation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.devtools.Devtools.SaveAnimationResponse> saveAnimation(
        mruv.devtools.Devtools.SaveAnimationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAnimationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get service status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.common.Health.ServiceStatusResponse> getServiceStatus(
        mruv.common.Health.ServiceStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get service version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.common.Health.VersionResponse> getServiceVersion(
        mruv.common.Health.VersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POSITIONS = 0;
  private static final int METHODID_SAVE_POSITION = 1;
  private static final int METHODID_DELETE_POSITION = 2;
  private static final int METHODID_GET_OUTFITS = 3;
  private static final int METHODID_SAVE_OUTFIT = 4;
  private static final int METHODID_GET_ANIMATIONS = 5;
  private static final int METHODID_GET_ANIMATION = 6;
  private static final int METHODID_SAVE_ANIMATION = 7;
  private static final int METHODID_GET_SERVICE_STATUS = 8;
  private static final int METHODID_GET_SERVICE_VERSION = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVDevToolsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVDevToolsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_POSITIONS:
          serviceImpl.getPositions((mruv.devtools.Devtools.GetPositionsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetPositionsResponse>) responseObserver);
          break;
        case METHODID_SAVE_POSITION:
          serviceImpl.savePosition((mruv.devtools.Devtools.SavePositionRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SavePositionResponse>) responseObserver);
          break;
        case METHODID_DELETE_POSITION:
          serviceImpl.deletePosition((mruv.devtools.Devtools.DeletePositionRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.DeletePositionResponse>) responseObserver);
          break;
        case METHODID_GET_OUTFITS:
          serviceImpl.getOutfits((mruv.devtools.Devtools.GetOutfitsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetOutfitsResponse>) responseObserver);
          break;
        case METHODID_SAVE_OUTFIT:
          serviceImpl.saveOutfit((mruv.devtools.Devtools.SaveOutfitRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SaveOutfitResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMATIONS:
          serviceImpl.getAnimations((mruv.devtools.Devtools.GetAnimationsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetAnimationsResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMATION:
          serviceImpl.getAnimation((mruv.devtools.Devtools.GetAnimationRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.GetAnimationResponse>) responseObserver);
          break;
        case METHODID_SAVE_ANIMATION:
          serviceImpl.saveAnimation((mruv.devtools.Devtools.SaveAnimationRequest) request,
              (io.grpc.stub.StreamObserver<mruv.devtools.Devtools.SaveAnimationResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_STATUS:
          serviceImpl.getServiceStatus((mruv.common.Health.ServiceStatusRequest) request,
              (io.grpc.stub.StreamObserver<mruv.common.Health.ServiceStatusResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_VERSION:
          serviceImpl.getServiceVersion((mruv.common.Health.VersionRequest) request,
              (io.grpc.stub.StreamObserver<mruv.common.Health.VersionResponse>) responseObserver);
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

  private static abstract class MruVDevToolsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVDevToolsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.devtools.Devtools.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVDevToolsService");
    }
  }

  private static final class MruVDevToolsServiceFileDescriptorSupplier
      extends MruVDevToolsServiceBaseDescriptorSupplier {
    MruVDevToolsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVDevToolsServiceMethodDescriptorSupplier
      extends MruVDevToolsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVDevToolsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVDevToolsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVDevToolsServiceFileDescriptorSupplier())
              .addMethod(getGetPositionsMethod())
              .addMethod(getSavePositionMethod())
              .addMethod(getDeletePositionMethod())
              .addMethod(getGetOutfitsMethod())
              .addMethod(getSaveOutfitMethod())
              .addMethod(getGetAnimationsMethod())
              .addMethod(getGetAnimationMethod())
              .addMethod(getSaveAnimationMethod())
              .addMethod(getGetServiceStatusMethod())
              .addMethod(getGetServiceVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
