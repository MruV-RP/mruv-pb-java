package mruv.accounts;

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
 * The MruV accounts service provides procedures for managing players accounts.
 * This service is an additional/intermediary service between the ORY Kratos &amp; ORY Hydra service.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: accounts/accounts.proto")
public final class MruVAccountsServiceGrpc {

  private MruVAccountsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.accounts.MruVAccountsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.accounts.Accounts.RegisterAccountRequest,
      mruv.accounts.Accounts.RegisterAccountResponse> getRegisterAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterAccount",
      requestType = mruv.accounts.Accounts.RegisterAccountRequest.class,
      responseType = mruv.accounts.Accounts.RegisterAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.accounts.Accounts.RegisterAccountRequest,
      mruv.accounts.Accounts.RegisterAccountResponse> getRegisterAccountMethod() {
    io.grpc.MethodDescriptor<mruv.accounts.Accounts.RegisterAccountRequest, mruv.accounts.Accounts.RegisterAccountResponse> getRegisterAccountMethod;
    if ((getRegisterAccountMethod = MruVAccountsServiceGrpc.getRegisterAccountMethod) == null) {
      synchronized (MruVAccountsServiceGrpc.class) {
        if ((getRegisterAccountMethod = MruVAccountsServiceGrpc.getRegisterAccountMethod) == null) {
          MruVAccountsServiceGrpc.getRegisterAccountMethod = getRegisterAccountMethod =
              io.grpc.MethodDescriptor.<mruv.accounts.Accounts.RegisterAccountRequest, mruv.accounts.Accounts.RegisterAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.RegisterAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.RegisterAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVAccountsServiceMethodDescriptorSupplier("RegisterAccount"))
              .build();
        }
      }
    }
    return getRegisterAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.accounts.Accounts.LogInRequest,
      mruv.accounts.Accounts.LogInResponse> getLogInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogIn",
      requestType = mruv.accounts.Accounts.LogInRequest.class,
      responseType = mruv.accounts.Accounts.LogInResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.accounts.Accounts.LogInRequest,
      mruv.accounts.Accounts.LogInResponse> getLogInMethod() {
    io.grpc.MethodDescriptor<mruv.accounts.Accounts.LogInRequest, mruv.accounts.Accounts.LogInResponse> getLogInMethod;
    if ((getLogInMethod = MruVAccountsServiceGrpc.getLogInMethod) == null) {
      synchronized (MruVAccountsServiceGrpc.class) {
        if ((getLogInMethod = MruVAccountsServiceGrpc.getLogInMethod) == null) {
          MruVAccountsServiceGrpc.getLogInMethod = getLogInMethod =
              io.grpc.MethodDescriptor.<mruv.accounts.Accounts.LogInRequest, mruv.accounts.Accounts.LogInResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.LogInRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.LogInResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVAccountsServiceMethodDescriptorSupplier("LogIn"))
              .build();
        }
      }
    }
    return getLogInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.accounts.Accounts.IsAccountExistRequest,
      mruv.accounts.Accounts.IsAccountExistResponse> getIsAccountExistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsAccountExist",
      requestType = mruv.accounts.Accounts.IsAccountExistRequest.class,
      responseType = mruv.accounts.Accounts.IsAccountExistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.accounts.Accounts.IsAccountExistRequest,
      mruv.accounts.Accounts.IsAccountExistResponse> getIsAccountExistMethod() {
    io.grpc.MethodDescriptor<mruv.accounts.Accounts.IsAccountExistRequest, mruv.accounts.Accounts.IsAccountExistResponse> getIsAccountExistMethod;
    if ((getIsAccountExistMethod = MruVAccountsServiceGrpc.getIsAccountExistMethod) == null) {
      synchronized (MruVAccountsServiceGrpc.class) {
        if ((getIsAccountExistMethod = MruVAccountsServiceGrpc.getIsAccountExistMethod) == null) {
          MruVAccountsServiceGrpc.getIsAccountExistMethod = getIsAccountExistMethod =
              io.grpc.MethodDescriptor.<mruv.accounts.Accounts.IsAccountExistRequest, mruv.accounts.Accounts.IsAccountExistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsAccountExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.IsAccountExistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.IsAccountExistResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVAccountsServiceMethodDescriptorSupplier("IsAccountExist"))
              .build();
        }
      }
    }
    return getIsAccountExistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.accounts.Accounts.GetAccountRequest,
      mruv.accounts.Accounts.GetAccountResponse> getGetAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccount",
      requestType = mruv.accounts.Accounts.GetAccountRequest.class,
      responseType = mruv.accounts.Accounts.GetAccountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.accounts.Accounts.GetAccountRequest,
      mruv.accounts.Accounts.GetAccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<mruv.accounts.Accounts.GetAccountRequest, mruv.accounts.Accounts.GetAccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = MruVAccountsServiceGrpc.getGetAccountMethod) == null) {
      synchronized (MruVAccountsServiceGrpc.class) {
        if ((getGetAccountMethod = MruVAccountsServiceGrpc.getGetAccountMethod) == null) {
          MruVAccountsServiceGrpc.getGetAccountMethod = getGetAccountMethod =
              io.grpc.MethodDescriptor.<mruv.accounts.Accounts.GetAccountRequest, mruv.accounts.Accounts.GetAccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.GetAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.GetAccountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVAccountsServiceMethodDescriptorSupplier("GetAccount"))
              .build();
        }
      }
    }
    return getGetAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.accounts.Accounts.GetAccountCharactersRequest,
      mruv.accounts.Accounts.GetAccountCharactersResponse> getGetAccountCharactersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountCharacters",
      requestType = mruv.accounts.Accounts.GetAccountCharactersRequest.class,
      responseType = mruv.accounts.Accounts.GetAccountCharactersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.accounts.Accounts.GetAccountCharactersRequest,
      mruv.accounts.Accounts.GetAccountCharactersResponse> getGetAccountCharactersMethod() {
    io.grpc.MethodDescriptor<mruv.accounts.Accounts.GetAccountCharactersRequest, mruv.accounts.Accounts.GetAccountCharactersResponse> getGetAccountCharactersMethod;
    if ((getGetAccountCharactersMethod = MruVAccountsServiceGrpc.getGetAccountCharactersMethod) == null) {
      synchronized (MruVAccountsServiceGrpc.class) {
        if ((getGetAccountCharactersMethod = MruVAccountsServiceGrpc.getGetAccountCharactersMethod) == null) {
          MruVAccountsServiceGrpc.getGetAccountCharactersMethod = getGetAccountCharactersMethod =
              io.grpc.MethodDescriptor.<mruv.accounts.Accounts.GetAccountCharactersRequest, mruv.accounts.Accounts.GetAccountCharactersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountCharacters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.GetAccountCharactersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.accounts.Accounts.GetAccountCharactersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVAccountsServiceMethodDescriptorSupplier("GetAccountCharacters"))
              .build();
        }
      }
    }
    return getGetAccountCharactersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVAccountsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVAccountsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVAccountsServiceStub>() {
        @java.lang.Override
        public MruVAccountsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVAccountsServiceStub(channel, callOptions);
        }
      };
    return MruVAccountsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVAccountsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVAccountsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVAccountsServiceBlockingStub>() {
        @java.lang.Override
        public MruVAccountsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVAccountsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVAccountsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVAccountsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVAccountsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVAccountsServiceFutureStub>() {
        @java.lang.Override
        public MruVAccountsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVAccountsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVAccountsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV accounts service provides procedures for managing players accounts.
   * This service is an additional/intermediary service between the ORY Kratos &amp; ORY Hydra service.
   * </pre>
   */
  public static abstract class MruVAccountsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register a new account.
     * </pre>
     */
    public void registerAccount(mruv.accounts.Accounts.RegisterAccountRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.RegisterAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sign into an existing account.
     * </pre>
     */
    public void logIn(mruv.accounts.Accounts.LogInRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.LogInResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogInMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check, is account with specified login exist. If yes, it returns account id.
     * </pre>
     */
    public void isAccountExist(mruv.accounts.Accounts.IsAccountExistRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.IsAccountExistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsAccountExistMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an account.
     * </pre>
     */
    public void getAccount(mruv.accounts.Accounts.GetAccountRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.GetAccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an account characters.
     * </pre>
     */
    public void getAccountCharacters(mruv.accounts.Accounts.GetAccountCharactersRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.GetAccountCharactersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountCharactersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.accounts.Accounts.RegisterAccountRequest,
                mruv.accounts.Accounts.RegisterAccountResponse>(
                  this, METHODID_REGISTER_ACCOUNT)))
          .addMethod(
            getLogInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.accounts.Accounts.LogInRequest,
                mruv.accounts.Accounts.LogInResponse>(
                  this, METHODID_LOG_IN)))
          .addMethod(
            getIsAccountExistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.accounts.Accounts.IsAccountExistRequest,
                mruv.accounts.Accounts.IsAccountExistResponse>(
                  this, METHODID_IS_ACCOUNT_EXIST)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.accounts.Accounts.GetAccountRequest,
                mruv.accounts.Accounts.GetAccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetAccountCharactersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.accounts.Accounts.GetAccountCharactersRequest,
                mruv.accounts.Accounts.GetAccountCharactersResponse>(
                  this, METHODID_GET_ACCOUNT_CHARACTERS)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV accounts service provides procedures for managing players accounts.
   * This service is an additional/intermediary service between the ORY Kratos &amp; ORY Hydra service.
   * </pre>
   */
  public static final class MruVAccountsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVAccountsServiceStub> {
    private MruVAccountsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVAccountsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVAccountsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new account.
     * </pre>
     */
    public void registerAccount(mruv.accounts.Accounts.RegisterAccountRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.RegisterAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sign into an existing account.
     * </pre>
     */
    public void logIn(mruv.accounts.Accounts.LogInRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.LogInResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check, is account with specified login exist. If yes, it returns account id.
     * </pre>
     */
    public void isAccountExist(mruv.accounts.Accounts.IsAccountExistRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.IsAccountExistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsAccountExistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an account.
     * </pre>
     */
    public void getAccount(mruv.accounts.Accounts.GetAccountRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.GetAccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an account characters.
     * </pre>
     */
    public void getAccountCharacters(mruv.accounts.Accounts.GetAccountCharactersRequest request,
        io.grpc.stub.StreamObserver<mruv.accounts.Accounts.GetAccountCharactersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountCharactersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV accounts service provides procedures for managing players accounts.
   * This service is an additional/intermediary service between the ORY Kratos &amp; ORY Hydra service.
   * </pre>
   */
  public static final class MruVAccountsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVAccountsServiceBlockingStub> {
    private MruVAccountsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVAccountsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVAccountsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new account.
     * </pre>
     */
    public mruv.accounts.Accounts.RegisterAccountResponse registerAccount(mruv.accounts.Accounts.RegisterAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sign into an existing account.
     * </pre>
     */
    public mruv.accounts.Accounts.LogInResponse logIn(mruv.accounts.Accounts.LogInRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check, is account with specified login exist. If yes, it returns account id.
     * </pre>
     */
    public mruv.accounts.Accounts.IsAccountExistResponse isAccountExist(mruv.accounts.Accounts.IsAccountExistRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsAccountExistMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an account.
     * </pre>
     */
    public mruv.accounts.Accounts.GetAccountResponse getAccount(mruv.accounts.Accounts.GetAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an account characters.
     * </pre>
     */
    public mruv.accounts.Accounts.GetAccountCharactersResponse getAccountCharacters(mruv.accounts.Accounts.GetAccountCharactersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountCharactersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV accounts service provides procedures for managing players accounts.
   * This service is an additional/intermediary service between the ORY Kratos &amp; ORY Hydra service.
   * </pre>
   */
  public static final class MruVAccountsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVAccountsServiceFutureStub> {
    private MruVAccountsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVAccountsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVAccountsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.accounts.Accounts.RegisterAccountResponse> registerAccount(
        mruv.accounts.Accounts.RegisterAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sign into an existing account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.accounts.Accounts.LogInResponse> logIn(
        mruv.accounts.Accounts.LogInRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check, is account with specified login exist. If yes, it returns account id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.accounts.Accounts.IsAccountExistResponse> isAccountExist(
        mruv.accounts.Accounts.IsAccountExistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsAccountExistMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.accounts.Accounts.GetAccountResponse> getAccount(
        mruv.accounts.Accounts.GetAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an account characters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.accounts.Accounts.GetAccountCharactersResponse> getAccountCharacters(
        mruv.accounts.Accounts.GetAccountCharactersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountCharactersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_ACCOUNT = 0;
  private static final int METHODID_LOG_IN = 1;
  private static final int METHODID_IS_ACCOUNT_EXIST = 2;
  private static final int METHODID_GET_ACCOUNT = 3;
  private static final int METHODID_GET_ACCOUNT_CHARACTERS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVAccountsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVAccountsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_ACCOUNT:
          serviceImpl.registerAccount((mruv.accounts.Accounts.RegisterAccountRequest) request,
              (io.grpc.stub.StreamObserver<mruv.accounts.Accounts.RegisterAccountResponse>) responseObserver);
          break;
        case METHODID_LOG_IN:
          serviceImpl.logIn((mruv.accounts.Accounts.LogInRequest) request,
              (io.grpc.stub.StreamObserver<mruv.accounts.Accounts.LogInResponse>) responseObserver);
          break;
        case METHODID_IS_ACCOUNT_EXIST:
          serviceImpl.isAccountExist((mruv.accounts.Accounts.IsAccountExistRequest) request,
              (io.grpc.stub.StreamObserver<mruv.accounts.Accounts.IsAccountExistResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((mruv.accounts.Accounts.GetAccountRequest) request,
              (io.grpc.stub.StreamObserver<mruv.accounts.Accounts.GetAccountResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_CHARACTERS:
          serviceImpl.getAccountCharacters((mruv.accounts.Accounts.GetAccountCharactersRequest) request,
              (io.grpc.stub.StreamObserver<mruv.accounts.Accounts.GetAccountCharactersResponse>) responseObserver);
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

  private static abstract class MruVAccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVAccountsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.accounts.Accounts.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVAccountsService");
    }
  }

  private static final class MruVAccountsServiceFileDescriptorSupplier
      extends MruVAccountsServiceBaseDescriptorSupplier {
    MruVAccountsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVAccountsServiceMethodDescriptorSupplier
      extends MruVAccountsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVAccountsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVAccountsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVAccountsServiceFileDescriptorSupplier())
              .addMethod(getRegisterAccountMethod())
              .addMethod(getLogInMethod())
              .addMethod(getIsAccountExistMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetAccountCharactersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
