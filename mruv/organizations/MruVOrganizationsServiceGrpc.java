package mruv.organizations;

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
 * The MruV jobs service provides procedures for managing organizations and fractions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: organizations/organizations.proto")
public final class MruVOrganizationsServiceGrpc {

  private MruVOrganizationsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.organizations.MruVOrganizationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.organizations.Organizations.CreateOrganizationRequest,
      mruv.organizations.Organizations.CreateOrganizationResponse> getCreateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrganization",
      requestType = mruv.organizations.Organizations.CreateOrganizationRequest.class,
      responseType = mruv.organizations.Organizations.CreateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.organizations.Organizations.CreateOrganizationRequest,
      mruv.organizations.Organizations.CreateOrganizationResponse> getCreateOrganizationMethod() {
    io.grpc.MethodDescriptor<mruv.organizations.Organizations.CreateOrganizationRequest, mruv.organizations.Organizations.CreateOrganizationResponse> getCreateOrganizationMethod;
    if ((getCreateOrganizationMethod = MruVOrganizationsServiceGrpc.getCreateOrganizationMethod) == null) {
      synchronized (MruVOrganizationsServiceGrpc.class) {
        if ((getCreateOrganizationMethod = MruVOrganizationsServiceGrpc.getCreateOrganizationMethod) == null) {
          MruVOrganizationsServiceGrpc.getCreateOrganizationMethod = getCreateOrganizationMethod =
              io.grpc.MethodDescriptor.<mruv.organizations.Organizations.CreateOrganizationRequest, mruv.organizations.Organizations.CreateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.CreateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.CreateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOrganizationsServiceMethodDescriptorSupplier("CreateOrganization"))
              .build();
        }
      }
    }
    return getCreateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.organizations.Organizations.GetOrganizationRequest,
      mruv.organizations.Organizations.GetOrganizationResponse> getGetOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrganization",
      requestType = mruv.organizations.Organizations.GetOrganizationRequest.class,
      responseType = mruv.organizations.Organizations.GetOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.organizations.Organizations.GetOrganizationRequest,
      mruv.organizations.Organizations.GetOrganizationResponse> getGetOrganizationMethod() {
    io.grpc.MethodDescriptor<mruv.organizations.Organizations.GetOrganizationRequest, mruv.organizations.Organizations.GetOrganizationResponse> getGetOrganizationMethod;
    if ((getGetOrganizationMethod = MruVOrganizationsServiceGrpc.getGetOrganizationMethod) == null) {
      synchronized (MruVOrganizationsServiceGrpc.class) {
        if ((getGetOrganizationMethod = MruVOrganizationsServiceGrpc.getGetOrganizationMethod) == null) {
          MruVOrganizationsServiceGrpc.getGetOrganizationMethod = getGetOrganizationMethod =
              io.grpc.MethodDescriptor.<mruv.organizations.Organizations.GetOrganizationRequest, mruv.organizations.Organizations.GetOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.GetOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.GetOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOrganizationsServiceMethodDescriptorSupplier("GetOrganization"))
              .build();
        }
      }
    }
    return getGetOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.organizations.Organizations.UpdateOrganizationRequest,
      mruv.organizations.Organizations.UpdateOrganizationResponse> getUpdateOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateOrganization",
      requestType = mruv.organizations.Organizations.UpdateOrganizationRequest.class,
      responseType = mruv.organizations.Organizations.UpdateOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.organizations.Organizations.UpdateOrganizationRequest,
      mruv.organizations.Organizations.UpdateOrganizationResponse> getUpdateOrganizationMethod() {
    io.grpc.MethodDescriptor<mruv.organizations.Organizations.UpdateOrganizationRequest, mruv.organizations.Organizations.UpdateOrganizationResponse> getUpdateOrganizationMethod;
    if ((getUpdateOrganizationMethod = MruVOrganizationsServiceGrpc.getUpdateOrganizationMethod) == null) {
      synchronized (MruVOrganizationsServiceGrpc.class) {
        if ((getUpdateOrganizationMethod = MruVOrganizationsServiceGrpc.getUpdateOrganizationMethod) == null) {
          MruVOrganizationsServiceGrpc.getUpdateOrganizationMethod = getUpdateOrganizationMethod =
              io.grpc.MethodDescriptor.<mruv.organizations.Organizations.UpdateOrganizationRequest, mruv.organizations.Organizations.UpdateOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.UpdateOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.UpdateOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOrganizationsServiceMethodDescriptorSupplier("UpdateOrganization"))
              .build();
        }
      }
    }
    return getUpdateOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.organizations.Organizations.DeleteOrganizationRequest,
      mruv.organizations.Organizations.DeleteOrganizationResponse> getDeleteOrganizationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteOrganization",
      requestType = mruv.organizations.Organizations.DeleteOrganizationRequest.class,
      responseType = mruv.organizations.Organizations.DeleteOrganizationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.organizations.Organizations.DeleteOrganizationRequest,
      mruv.organizations.Organizations.DeleteOrganizationResponse> getDeleteOrganizationMethod() {
    io.grpc.MethodDescriptor<mruv.organizations.Organizations.DeleteOrganizationRequest, mruv.organizations.Organizations.DeleteOrganizationResponse> getDeleteOrganizationMethod;
    if ((getDeleteOrganizationMethod = MruVOrganizationsServiceGrpc.getDeleteOrganizationMethod) == null) {
      synchronized (MruVOrganizationsServiceGrpc.class) {
        if ((getDeleteOrganizationMethod = MruVOrganizationsServiceGrpc.getDeleteOrganizationMethod) == null) {
          MruVOrganizationsServiceGrpc.getDeleteOrganizationMethod = getDeleteOrganizationMethod =
              io.grpc.MethodDescriptor.<mruv.organizations.Organizations.DeleteOrganizationRequest, mruv.organizations.Organizations.DeleteOrganizationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteOrganization"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.DeleteOrganizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.DeleteOrganizationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOrganizationsServiceMethodDescriptorSupplier("DeleteOrganization"))
              .build();
        }
      }
    }
    return getDeleteOrganizationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.organizations.Organizations.AssignLeaderRequest,
      mruv.organizations.Organizations.AssignLeaderResponse> getAssignLeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignLeader",
      requestType = mruv.organizations.Organizations.AssignLeaderRequest.class,
      responseType = mruv.organizations.Organizations.AssignLeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.organizations.Organizations.AssignLeaderRequest,
      mruv.organizations.Organizations.AssignLeaderResponse> getAssignLeaderMethod() {
    io.grpc.MethodDescriptor<mruv.organizations.Organizations.AssignLeaderRequest, mruv.organizations.Organizations.AssignLeaderResponse> getAssignLeaderMethod;
    if ((getAssignLeaderMethod = MruVOrganizationsServiceGrpc.getAssignLeaderMethod) == null) {
      synchronized (MruVOrganizationsServiceGrpc.class) {
        if ((getAssignLeaderMethod = MruVOrganizationsServiceGrpc.getAssignLeaderMethod) == null) {
          MruVOrganizationsServiceGrpc.getAssignLeaderMethod = getAssignLeaderMethod =
              io.grpc.MethodDescriptor.<mruv.organizations.Organizations.AssignLeaderRequest, mruv.organizations.Organizations.AssignLeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignLeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.AssignLeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.AssignLeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOrganizationsServiceMethodDescriptorSupplier("AssignLeader"))
              .build();
        }
      }
    }
    return getAssignLeaderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.organizations.Organizations.UnassignLeaderRequest,
      mruv.organizations.Organizations.UnassignLeaderResponse> getUnassignLeaderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnassignLeader",
      requestType = mruv.organizations.Organizations.UnassignLeaderRequest.class,
      responseType = mruv.organizations.Organizations.UnassignLeaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.organizations.Organizations.UnassignLeaderRequest,
      mruv.organizations.Organizations.UnassignLeaderResponse> getUnassignLeaderMethod() {
    io.grpc.MethodDescriptor<mruv.organizations.Organizations.UnassignLeaderRequest, mruv.organizations.Organizations.UnassignLeaderResponse> getUnassignLeaderMethod;
    if ((getUnassignLeaderMethod = MruVOrganizationsServiceGrpc.getUnassignLeaderMethod) == null) {
      synchronized (MruVOrganizationsServiceGrpc.class) {
        if ((getUnassignLeaderMethod = MruVOrganizationsServiceGrpc.getUnassignLeaderMethod) == null) {
          MruVOrganizationsServiceGrpc.getUnassignLeaderMethod = getUnassignLeaderMethod =
              io.grpc.MethodDescriptor.<mruv.organizations.Organizations.UnassignLeaderRequest, mruv.organizations.Organizations.UnassignLeaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnassignLeader"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.UnassignLeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.organizations.Organizations.UnassignLeaderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVOrganizationsServiceMethodDescriptorSupplier("UnassignLeader"))
              .build();
        }
      }
    }
    return getUnassignLeaderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVOrganizationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVOrganizationsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVOrganizationsServiceStub>() {
        @java.lang.Override
        public MruVOrganizationsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVOrganizationsServiceStub(channel, callOptions);
        }
      };
    return MruVOrganizationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVOrganizationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVOrganizationsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVOrganizationsServiceBlockingStub>() {
        @java.lang.Override
        public MruVOrganizationsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVOrganizationsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVOrganizationsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVOrganizationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVOrganizationsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVOrganizationsServiceFutureStub>() {
        @java.lang.Override
        public MruVOrganizationsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVOrganizationsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVOrganizationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing organizations and fractions.
   * </pre>
   */
  public static abstract class MruVOrganizationsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a organization.
     * </pre>
     */
    public void createOrganization(mruv.organizations.Organizations.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.CreateOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get organization.
     * </pre>
     */
    public void getOrganization(mruv.organizations.Organizations.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.GetOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update organization.
     * </pre>
     */
    public void updateOrganization(mruv.organizations.Organizations.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.UpdateOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete organization.
     * </pre>
     */
    public void deleteOrganization(mruv.organizations.Organizations.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.DeleteOrganizationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteOrganizationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign an organization leader. Leader is a main administrator of a organization, have all rights to manage organization.
     * If the organization leader already exists, the leader will be overwritten.
     * </pre>
     */
    public void assignLeader(mruv.organizations.Organizations.AssignLeaderRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.AssignLeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignLeaderMethod(), responseObserver);
    }

    /**
     */
    public void unassignLeader(mruv.organizations.Organizations.UnassignLeaderRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.UnassignLeaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnassignLeaderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.organizations.Organizations.CreateOrganizationRequest,
                mruv.organizations.Organizations.CreateOrganizationResponse>(
                  this, METHODID_CREATE_ORGANIZATION)))
          .addMethod(
            getGetOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.organizations.Organizations.GetOrganizationRequest,
                mruv.organizations.Organizations.GetOrganizationResponse>(
                  this, METHODID_GET_ORGANIZATION)))
          .addMethod(
            getUpdateOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.organizations.Organizations.UpdateOrganizationRequest,
                mruv.organizations.Organizations.UpdateOrganizationResponse>(
                  this, METHODID_UPDATE_ORGANIZATION)))
          .addMethod(
            getDeleteOrganizationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.organizations.Organizations.DeleteOrganizationRequest,
                mruv.organizations.Organizations.DeleteOrganizationResponse>(
                  this, METHODID_DELETE_ORGANIZATION)))
          .addMethod(
            getAssignLeaderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.organizations.Organizations.AssignLeaderRequest,
                mruv.organizations.Organizations.AssignLeaderResponse>(
                  this, METHODID_ASSIGN_LEADER)))
          .addMethod(
            getUnassignLeaderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.organizations.Organizations.UnassignLeaderRequest,
                mruv.organizations.Organizations.UnassignLeaderResponse>(
                  this, METHODID_UNASSIGN_LEADER)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing organizations and fractions.
   * </pre>
   */
  public static final class MruVOrganizationsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVOrganizationsServiceStub> {
    private MruVOrganizationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVOrganizationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVOrganizationsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a organization.
     * </pre>
     */
    public void createOrganization(mruv.organizations.Organizations.CreateOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.CreateOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get organization.
     * </pre>
     */
    public void getOrganization(mruv.organizations.Organizations.GetOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.GetOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update organization.
     * </pre>
     */
    public void updateOrganization(mruv.organizations.Organizations.UpdateOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.UpdateOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete organization.
     * </pre>
     */
    public void deleteOrganization(mruv.organizations.Organizations.DeleteOrganizationRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.DeleteOrganizationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign an organization leader. Leader is a main administrator of a organization, have all rights to manage organization.
     * If the organization leader already exists, the leader will be overwritten.
     * </pre>
     */
    public void assignLeader(mruv.organizations.Organizations.AssignLeaderRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.AssignLeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignLeaderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unassignLeader(mruv.organizations.Organizations.UnassignLeaderRequest request,
        io.grpc.stub.StreamObserver<mruv.organizations.Organizations.UnassignLeaderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnassignLeaderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing organizations and fractions.
   * </pre>
   */
  public static final class MruVOrganizationsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVOrganizationsServiceBlockingStub> {
    private MruVOrganizationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVOrganizationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVOrganizationsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a organization.
     * </pre>
     */
    public mruv.organizations.Organizations.CreateOrganizationResponse createOrganization(mruv.organizations.Organizations.CreateOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get organization.
     * </pre>
     */
    public mruv.organizations.Organizations.GetOrganizationResponse getOrganization(mruv.organizations.Organizations.GetOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update organization.
     * </pre>
     */
    public mruv.organizations.Organizations.UpdateOrganizationResponse updateOrganization(mruv.organizations.Organizations.UpdateOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete organization.
     * </pre>
     */
    public mruv.organizations.Organizations.DeleteOrganizationResponse deleteOrganization(mruv.organizations.Organizations.DeleteOrganizationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteOrganizationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign an organization leader. Leader is a main administrator of a organization, have all rights to manage organization.
     * If the organization leader already exists, the leader will be overwritten.
     * </pre>
     */
    public mruv.organizations.Organizations.AssignLeaderResponse assignLeader(mruv.organizations.Organizations.AssignLeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignLeaderMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.organizations.Organizations.UnassignLeaderResponse unassignLeader(mruv.organizations.Organizations.UnassignLeaderRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnassignLeaderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing organizations and fractions.
   * </pre>
   */
  public static final class MruVOrganizationsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVOrganizationsServiceFutureStub> {
    private MruVOrganizationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVOrganizationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVOrganizationsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.organizations.Organizations.CreateOrganizationResponse> createOrganization(
        mruv.organizations.Organizations.CreateOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.organizations.Organizations.GetOrganizationResponse> getOrganization(
        mruv.organizations.Organizations.GetOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.organizations.Organizations.UpdateOrganizationResponse> updateOrganization(
        mruv.organizations.Organizations.UpdateOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete organization.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.organizations.Organizations.DeleteOrganizationResponse> deleteOrganization(
        mruv.organizations.Organizations.DeleteOrganizationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteOrganizationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign an organization leader. Leader is a main administrator of a organization, have all rights to manage organization.
     * If the organization leader already exists, the leader will be overwritten.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.organizations.Organizations.AssignLeaderResponse> assignLeader(
        mruv.organizations.Organizations.AssignLeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignLeaderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.organizations.Organizations.UnassignLeaderResponse> unassignLeader(
        mruv.organizations.Organizations.UnassignLeaderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnassignLeaderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORGANIZATION = 0;
  private static final int METHODID_GET_ORGANIZATION = 1;
  private static final int METHODID_UPDATE_ORGANIZATION = 2;
  private static final int METHODID_DELETE_ORGANIZATION = 3;
  private static final int METHODID_ASSIGN_LEADER = 4;
  private static final int METHODID_UNASSIGN_LEADER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVOrganizationsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVOrganizationsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORGANIZATION:
          serviceImpl.createOrganization((mruv.organizations.Organizations.CreateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<mruv.organizations.Organizations.CreateOrganizationResponse>) responseObserver);
          break;
        case METHODID_GET_ORGANIZATION:
          serviceImpl.getOrganization((mruv.organizations.Organizations.GetOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<mruv.organizations.Organizations.GetOrganizationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ORGANIZATION:
          serviceImpl.updateOrganization((mruv.organizations.Organizations.UpdateOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<mruv.organizations.Organizations.UpdateOrganizationResponse>) responseObserver);
          break;
        case METHODID_DELETE_ORGANIZATION:
          serviceImpl.deleteOrganization((mruv.organizations.Organizations.DeleteOrganizationRequest) request,
              (io.grpc.stub.StreamObserver<mruv.organizations.Organizations.DeleteOrganizationResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_LEADER:
          serviceImpl.assignLeader((mruv.organizations.Organizations.AssignLeaderRequest) request,
              (io.grpc.stub.StreamObserver<mruv.organizations.Organizations.AssignLeaderResponse>) responseObserver);
          break;
        case METHODID_UNASSIGN_LEADER:
          serviceImpl.unassignLeader((mruv.organizations.Organizations.UnassignLeaderRequest) request,
              (io.grpc.stub.StreamObserver<mruv.organizations.Organizations.UnassignLeaderResponse>) responseObserver);
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

  private static abstract class MruVOrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVOrganizationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.organizations.Organizations.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVOrganizationsService");
    }
  }

  private static final class MruVOrganizationsServiceFileDescriptorSupplier
      extends MruVOrganizationsServiceBaseDescriptorSupplier {
    MruVOrganizationsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVOrganizationsServiceMethodDescriptorSupplier
      extends MruVOrganizationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVOrganizationsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVOrganizationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVOrganizationsServiceFileDescriptorSupplier())
              .addMethod(getCreateOrganizationMethod())
              .addMethod(getGetOrganizationMethod())
              .addMethod(getUpdateOrganizationMethod())
              .addMethod(getDeleteOrganizationMethod())
              .addMethod(getAssignLeaderMethod())
              .addMethod(getUnassignLeaderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
