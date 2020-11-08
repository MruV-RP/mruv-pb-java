package mruv.jobs;

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
 * The MruV jobs service provides procedures for managing jobs.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: jobs/jobs.proto")
public final class MruVJobsServiceGrpc {

  private MruVJobsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.jobs.MruVJobsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.jobs.Jobs.CreateJobRequest,
      mruv.jobs.Jobs.CreateJobResponse> getCreateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateJob",
      requestType = mruv.jobs.Jobs.CreateJobRequest.class,
      responseType = mruv.jobs.Jobs.CreateJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.jobs.Jobs.CreateJobRequest,
      mruv.jobs.Jobs.CreateJobResponse> getCreateJobMethod() {
    io.grpc.MethodDescriptor<mruv.jobs.Jobs.CreateJobRequest, mruv.jobs.Jobs.CreateJobResponse> getCreateJobMethod;
    if ((getCreateJobMethod = MruVJobsServiceGrpc.getCreateJobMethod) == null) {
      synchronized (MruVJobsServiceGrpc.class) {
        if ((getCreateJobMethod = MruVJobsServiceGrpc.getCreateJobMethod) == null) {
          MruVJobsServiceGrpc.getCreateJobMethod = getCreateJobMethod =
              io.grpc.MethodDescriptor.<mruv.jobs.Jobs.CreateJobRequest, mruv.jobs.Jobs.CreateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.CreateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.CreateJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVJobsServiceMethodDescriptorSupplier("CreateJob"))
              .build();
        }
      }
    }
    return getCreateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.jobs.Jobs.GetJobRequest,
      mruv.jobs.Jobs.GetJobResponse> getGetJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetJob",
      requestType = mruv.jobs.Jobs.GetJobRequest.class,
      responseType = mruv.jobs.Jobs.GetJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.jobs.Jobs.GetJobRequest,
      mruv.jobs.Jobs.GetJobResponse> getGetJobMethod() {
    io.grpc.MethodDescriptor<mruv.jobs.Jobs.GetJobRequest, mruv.jobs.Jobs.GetJobResponse> getGetJobMethod;
    if ((getGetJobMethod = MruVJobsServiceGrpc.getGetJobMethod) == null) {
      synchronized (MruVJobsServiceGrpc.class) {
        if ((getGetJobMethod = MruVJobsServiceGrpc.getGetJobMethod) == null) {
          MruVJobsServiceGrpc.getGetJobMethod = getGetJobMethod =
              io.grpc.MethodDescriptor.<mruv.jobs.Jobs.GetJobRequest, mruv.jobs.Jobs.GetJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.GetJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.GetJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVJobsServiceMethodDescriptorSupplier("GetJob"))
              .build();
        }
      }
    }
    return getGetJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.jobs.Jobs.UpdateJobRequest,
      mruv.jobs.Jobs.UpdateJobResponse> getUpdateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateJob",
      requestType = mruv.jobs.Jobs.UpdateJobRequest.class,
      responseType = mruv.jobs.Jobs.UpdateJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.jobs.Jobs.UpdateJobRequest,
      mruv.jobs.Jobs.UpdateJobResponse> getUpdateJobMethod() {
    io.grpc.MethodDescriptor<mruv.jobs.Jobs.UpdateJobRequest, mruv.jobs.Jobs.UpdateJobResponse> getUpdateJobMethod;
    if ((getUpdateJobMethod = MruVJobsServiceGrpc.getUpdateJobMethod) == null) {
      synchronized (MruVJobsServiceGrpc.class) {
        if ((getUpdateJobMethod = MruVJobsServiceGrpc.getUpdateJobMethod) == null) {
          MruVJobsServiceGrpc.getUpdateJobMethod = getUpdateJobMethod =
              io.grpc.MethodDescriptor.<mruv.jobs.Jobs.UpdateJobRequest, mruv.jobs.Jobs.UpdateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.UpdateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.UpdateJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVJobsServiceMethodDescriptorSupplier("UpdateJob"))
              .build();
        }
      }
    }
    return getUpdateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.jobs.Jobs.DeleteJobRequest,
      mruv.jobs.Jobs.DeleteJobResponse> getDeleteJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteJob",
      requestType = mruv.jobs.Jobs.DeleteJobRequest.class,
      responseType = mruv.jobs.Jobs.DeleteJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.jobs.Jobs.DeleteJobRequest,
      mruv.jobs.Jobs.DeleteJobResponse> getDeleteJobMethod() {
    io.grpc.MethodDescriptor<mruv.jobs.Jobs.DeleteJobRequest, mruv.jobs.Jobs.DeleteJobResponse> getDeleteJobMethod;
    if ((getDeleteJobMethod = MruVJobsServiceGrpc.getDeleteJobMethod) == null) {
      synchronized (MruVJobsServiceGrpc.class) {
        if ((getDeleteJobMethod = MruVJobsServiceGrpc.getDeleteJobMethod) == null) {
          MruVJobsServiceGrpc.getDeleteJobMethod = getDeleteJobMethod =
              io.grpc.MethodDescriptor.<mruv.jobs.Jobs.DeleteJobRequest, mruv.jobs.Jobs.DeleteJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.DeleteJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.jobs.Jobs.DeleteJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVJobsServiceMethodDescriptorSupplier("DeleteJob"))
              .build();
        }
      }
    }
    return getDeleteJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVJobsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVJobsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVJobsServiceStub>() {
        @java.lang.Override
        public MruVJobsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVJobsServiceStub(channel, callOptions);
        }
      };
    return MruVJobsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVJobsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVJobsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVJobsServiceBlockingStub>() {
        @java.lang.Override
        public MruVJobsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVJobsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVJobsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVJobsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVJobsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVJobsServiceFutureStub>() {
        @java.lang.Override
        public MruVJobsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVJobsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVJobsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing jobs.
   * </pre>
   */
  public static abstract class MruVJobsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a job.
     * </pre>
     */
    public void createJob(mruv.jobs.Jobs.CreateJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.CreateJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a job.
     * </pre>
     */
    public void getJob(mruv.jobs.Jobs.GetJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.GetJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a job.
     * </pre>
     */
    public void updateJob(mruv.jobs.Jobs.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.UpdateJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a job.
     * </pre>
     */
    public void deleteJob(mruv.jobs.Jobs.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.DeleteJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.jobs.Jobs.CreateJobRequest,
                mruv.jobs.Jobs.CreateJobResponse>(
                  this, METHODID_CREATE_JOB)))
          .addMethod(
            getGetJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.jobs.Jobs.GetJobRequest,
                mruv.jobs.Jobs.GetJobResponse>(
                  this, METHODID_GET_JOB)))
          .addMethod(
            getUpdateJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.jobs.Jobs.UpdateJobRequest,
                mruv.jobs.Jobs.UpdateJobResponse>(
                  this, METHODID_UPDATE_JOB)))
          .addMethod(
            getDeleteJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.jobs.Jobs.DeleteJobRequest,
                mruv.jobs.Jobs.DeleteJobResponse>(
                  this, METHODID_DELETE_JOB)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing jobs.
   * </pre>
   */
  public static final class MruVJobsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVJobsServiceStub> {
    private MruVJobsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVJobsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVJobsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a job.
     * </pre>
     */
    public void createJob(mruv.jobs.Jobs.CreateJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.CreateJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a job.
     * </pre>
     */
    public void getJob(mruv.jobs.Jobs.GetJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.GetJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a job.
     * </pre>
     */
    public void updateJob(mruv.jobs.Jobs.UpdateJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.UpdateJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a job.
     * </pre>
     */
    public void deleteJob(mruv.jobs.Jobs.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<mruv.jobs.Jobs.DeleteJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing jobs.
   * </pre>
   */
  public static final class MruVJobsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVJobsServiceBlockingStub> {
    private MruVJobsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVJobsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVJobsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a job.
     * </pre>
     */
    public mruv.jobs.Jobs.CreateJobResponse createJob(mruv.jobs.Jobs.CreateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a job.
     * </pre>
     */
    public mruv.jobs.Jobs.GetJobResponse getJob(mruv.jobs.Jobs.GetJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a job.
     * </pre>
     */
    public mruv.jobs.Jobs.UpdateJobResponse updateJob(mruv.jobs.Jobs.UpdateJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a job.
     * </pre>
     */
    public mruv.jobs.Jobs.DeleteJobResponse deleteJob(mruv.jobs.Jobs.DeleteJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV jobs service provides procedures for managing jobs.
   * </pre>
   */
  public static final class MruVJobsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVJobsServiceFutureStub> {
    private MruVJobsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVJobsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVJobsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.jobs.Jobs.CreateJobResponse> createJob(
        mruv.jobs.Jobs.CreateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.jobs.Jobs.GetJobResponse> getJob(
        mruv.jobs.Jobs.GetJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.jobs.Jobs.UpdateJobResponse> updateJob(
        mruv.jobs.Jobs.UpdateJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.jobs.Jobs.DeleteJobResponse> deleteJob(
        mruv.jobs.Jobs.DeleteJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_JOB = 0;
  private static final int METHODID_GET_JOB = 1;
  private static final int METHODID_UPDATE_JOB = 2;
  private static final int METHODID_DELETE_JOB = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVJobsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVJobsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_JOB:
          serviceImpl.createJob((mruv.jobs.Jobs.CreateJobRequest) request,
              (io.grpc.stub.StreamObserver<mruv.jobs.Jobs.CreateJobResponse>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((mruv.jobs.Jobs.GetJobRequest) request,
              (io.grpc.stub.StreamObserver<mruv.jobs.Jobs.GetJobResponse>) responseObserver);
          break;
        case METHODID_UPDATE_JOB:
          serviceImpl.updateJob((mruv.jobs.Jobs.UpdateJobRequest) request,
              (io.grpc.stub.StreamObserver<mruv.jobs.Jobs.UpdateJobResponse>) responseObserver);
          break;
        case METHODID_DELETE_JOB:
          serviceImpl.deleteJob((mruv.jobs.Jobs.DeleteJobRequest) request,
              (io.grpc.stub.StreamObserver<mruv.jobs.Jobs.DeleteJobResponse>) responseObserver);
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

  private static abstract class MruVJobsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVJobsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.jobs.Jobs.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVJobsService");
    }
  }

  private static final class MruVJobsServiceFileDescriptorSupplier
      extends MruVJobsServiceBaseDescriptorSupplier {
    MruVJobsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVJobsServiceMethodDescriptorSupplier
      extends MruVJobsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVJobsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVJobsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVJobsServiceFileDescriptorSupplier())
              .addMethod(getCreateJobMethod())
              .addMethod(getGetJobMethod())
              .addMethod(getUpdateJobMethod())
              .addMethod(getDeleteJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
