package mruv;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: characters/characters.proto")
public final class MruVCharactersServiceGrpc {

  private MruVCharactersServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.MruVCharactersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.Characters.CreateCharacterRequest,
      mruv.Characters.CreateCharacterResponse> getCreateCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCharacter",
      requestType = mruv.Characters.CreateCharacterRequest.class,
      responseType = mruv.Characters.CreateCharacterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Characters.CreateCharacterRequest,
      mruv.Characters.CreateCharacterResponse> getCreateCharacterMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.CreateCharacterRequest, mruv.Characters.CreateCharacterResponse> getCreateCharacterMethod;
    if ((getCreateCharacterMethod = MruVCharactersServiceGrpc.getCreateCharacterMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getCreateCharacterMethod = MruVCharactersServiceGrpc.getCreateCharacterMethod) == null) {
          MruVCharactersServiceGrpc.getCreateCharacterMethod = getCreateCharacterMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.CreateCharacterRequest, mruv.Characters.CreateCharacterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.CreateCharacterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.CreateCharacterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("CreateCharacter"))
              .build();
        }
      }
    }
    return getCreateCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Characters.GetCharacterRequest,
      mruv.Characters.GetCharacterResponse> getGetCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCharacter",
      requestType = mruv.Characters.GetCharacterRequest.class,
      responseType = mruv.Characters.GetCharacterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Characters.GetCharacterRequest,
      mruv.Characters.GetCharacterResponse> getGetCharacterMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.GetCharacterRequest, mruv.Characters.GetCharacterResponse> getGetCharacterMethod;
    if ((getGetCharacterMethod = MruVCharactersServiceGrpc.getGetCharacterMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getGetCharacterMethod = MruVCharactersServiceGrpc.getGetCharacterMethod) == null) {
          MruVCharactersServiceGrpc.getGetCharacterMethod = getGetCharacterMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.GetCharacterRequest, mruv.Characters.GetCharacterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.GetCharacterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.GetCharacterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("GetCharacter"))
              .build();
        }
      }
    }
    return getGetCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Characters.UpdateCharacterRequest,
      mruv.Characters.UpdateCharacterResponse> getUpdateCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCharacter",
      requestType = mruv.Characters.UpdateCharacterRequest.class,
      responseType = mruv.Characters.UpdateCharacterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Characters.UpdateCharacterRequest,
      mruv.Characters.UpdateCharacterResponse> getUpdateCharacterMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.UpdateCharacterRequest, mruv.Characters.UpdateCharacterResponse> getUpdateCharacterMethod;
    if ((getUpdateCharacterMethod = MruVCharactersServiceGrpc.getUpdateCharacterMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getUpdateCharacterMethod = MruVCharactersServiceGrpc.getUpdateCharacterMethod) == null) {
          MruVCharactersServiceGrpc.getUpdateCharacterMethod = getUpdateCharacterMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.UpdateCharacterRequest, mruv.Characters.UpdateCharacterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.UpdateCharacterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.UpdateCharacterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("UpdateCharacter"))
              .build();
        }
      }
    }
    return getUpdateCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Characters.DeleteCharacterRequest,
      mruv.Characters.DeleteCharacterResponse> getDeleteCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCharacter",
      requestType = mruv.Characters.DeleteCharacterRequest.class,
      responseType = mruv.Characters.DeleteCharacterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Characters.DeleteCharacterRequest,
      mruv.Characters.DeleteCharacterResponse> getDeleteCharacterMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.DeleteCharacterRequest, mruv.Characters.DeleteCharacterResponse> getDeleteCharacterMethod;
    if ((getDeleteCharacterMethod = MruVCharactersServiceGrpc.getDeleteCharacterMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getDeleteCharacterMethod = MruVCharactersServiceGrpc.getDeleteCharacterMethod) == null) {
          MruVCharactersServiceGrpc.getDeleteCharacterMethod = getDeleteCharacterMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.DeleteCharacterRequest, mruv.Characters.DeleteCharacterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.DeleteCharacterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.DeleteCharacterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("DeleteCharacter"))
              .build();
        }
      }
    }
    return getDeleteCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Characters.CharacterID,
      mruv.Characters.CharacterID> getPermanentCharacterKillMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PermanentCharacterKill",
      requestType = mruv.Characters.CharacterID.class,
      responseType = mruv.Characters.CharacterID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Characters.CharacterID,
      mruv.Characters.CharacterID> getPermanentCharacterKillMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.CharacterID, mruv.Characters.CharacterID> getPermanentCharacterKillMethod;
    if ((getPermanentCharacterKillMethod = MruVCharactersServiceGrpc.getPermanentCharacterKillMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getPermanentCharacterKillMethod = MruVCharactersServiceGrpc.getPermanentCharacterKillMethod) == null) {
          MruVCharactersServiceGrpc.getPermanentCharacterKillMethod = getPermanentCharacterKillMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.CharacterID, mruv.Characters.CharacterID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PermanentCharacterKill"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.CharacterID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.CharacterID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("PermanentCharacterKill"))
              .build();
        }
      }
    }
    return getPermanentCharacterKillMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Characters.ChangeClothesRequest,
      mruv.Characters.ChangeClothesResponse> getChangeClothesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeClothes",
      requestType = mruv.Characters.ChangeClothesRequest.class,
      responseType = mruv.Characters.ChangeClothesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Characters.ChangeClothesRequest,
      mruv.Characters.ChangeClothesResponse> getChangeClothesMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.ChangeClothesRequest, mruv.Characters.ChangeClothesResponse> getChangeClothesMethod;
    if ((getChangeClothesMethod = MruVCharactersServiceGrpc.getChangeClothesMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getChangeClothesMethod = MruVCharactersServiceGrpc.getChangeClothesMethod) == null) {
          MruVCharactersServiceGrpc.getChangeClothesMethod = getChangeClothesMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.ChangeClothesRequest, mruv.Characters.ChangeClothesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeClothes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.ChangeClothesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.ChangeClothesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("ChangeClothes"))
              .build();
        }
      }
    }
    return getChangeClothesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Characters.DeathStreamRequest,
      mruv.Characters.DeathStreamResponse> getDeathsStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeathsStream",
      requestType = mruv.Characters.DeathStreamRequest.class,
      responseType = mruv.Characters.DeathStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.Characters.DeathStreamRequest,
      mruv.Characters.DeathStreamResponse> getDeathsStreamMethod() {
    io.grpc.MethodDescriptor<mruv.Characters.DeathStreamRequest, mruv.Characters.DeathStreamResponse> getDeathsStreamMethod;
    if ((getDeathsStreamMethod = MruVCharactersServiceGrpc.getDeathsStreamMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getDeathsStreamMethod = MruVCharactersServiceGrpc.getDeathsStreamMethod) == null) {
          MruVCharactersServiceGrpc.getDeathsStreamMethod = getDeathsStreamMethod =
              io.grpc.MethodDescriptor.<mruv.Characters.DeathStreamRequest, mruv.Characters.DeathStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeathsStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.DeathStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Characters.DeathStreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("DeathsStream"))
              .build();
        }
      }
    }
    return getDeathsStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Health.ServiceStatusRequest,
      mruv.Health.ServiceStatusResponse> getGetServiceStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceStatus",
      requestType = mruv.Health.ServiceStatusRequest.class,
      responseType = mruv.Health.ServiceStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Health.ServiceStatusRequest,
      mruv.Health.ServiceStatusResponse> getGetServiceStatusMethod() {
    io.grpc.MethodDescriptor<mruv.Health.ServiceStatusRequest, mruv.Health.ServiceStatusResponse> getGetServiceStatusMethod;
    if ((getGetServiceStatusMethod = MruVCharactersServiceGrpc.getGetServiceStatusMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getGetServiceStatusMethod = MruVCharactersServiceGrpc.getGetServiceStatusMethod) == null) {
          MruVCharactersServiceGrpc.getGetServiceStatusMethod = getGetServiceStatusMethod =
              io.grpc.MethodDescriptor.<mruv.Health.ServiceStatusRequest, mruv.Health.ServiceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.ServiceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.ServiceStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("GetServiceStatus"))
              .build();
        }
      }
    }
    return getGetServiceStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Health.VersionRequest,
      mruv.Health.VersionResponse> getGetServiceVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceVersion",
      requestType = mruv.Health.VersionRequest.class,
      responseType = mruv.Health.VersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Health.VersionRequest,
      mruv.Health.VersionResponse> getGetServiceVersionMethod() {
    io.grpc.MethodDescriptor<mruv.Health.VersionRequest, mruv.Health.VersionResponse> getGetServiceVersionMethod;
    if ((getGetServiceVersionMethod = MruVCharactersServiceGrpc.getGetServiceVersionMethod) == null) {
      synchronized (MruVCharactersServiceGrpc.class) {
        if ((getGetServiceVersionMethod = MruVCharactersServiceGrpc.getGetServiceVersionMethod) == null) {
          MruVCharactersServiceGrpc.getGetServiceVersionMethod = getGetServiceVersionMethod =
              io.grpc.MethodDescriptor.<mruv.Health.VersionRequest, mruv.Health.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.VersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVCharactersServiceMethodDescriptorSupplier("GetServiceVersion"))
              .build();
        }
      }
    }
    return getGetServiceVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVCharactersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVCharactersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVCharactersServiceStub>() {
        @java.lang.Override
        public MruVCharactersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVCharactersServiceStub(channel, callOptions);
        }
      };
    return MruVCharactersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVCharactersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVCharactersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVCharactersServiceBlockingStub>() {
        @java.lang.Override
        public MruVCharactersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVCharactersServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVCharactersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVCharactersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVCharactersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVCharactersServiceFutureStub>() {
        @java.lang.Override
        public MruVCharactersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVCharactersServiceFutureStub(channel, callOptions);
        }
      };
    return MruVCharactersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MruVCharactersServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a character.
     * </pre>
     */
    public void createCharacter(mruv.Characters.CreateCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.CreateCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCharacterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a character.
     * </pre>
     */
    public void getCharacter(mruv.Characters.GetCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.GetCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCharacterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a character.
     * </pre>
     */
    public void updateCharacter(mruv.Characters.UpdateCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.UpdateCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCharacterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a character.
     * </pre>
     */
    public void deleteCharacter(mruv.Characters.DeleteCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.DeleteCharacterResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCharacterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Kill a character. A character that is killed cannot be played anymore.
     * </pre>
     */
    public void permanentCharacterKill(mruv.Characters.CharacterID request,
        io.grpc.stub.StreamObserver<mruv.Characters.CharacterID> responseObserver) {
      asyncUnimplementedUnaryCall(getPermanentCharacterKillMethod(), responseObserver);
    }

    /**
     * <pre>
     * Change player clothes.
     * </pre>
     */
    public void changeClothes(mruv.Characters.ChangeClothesRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.ChangeClothesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeClothesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream of deaths.
     * </pre>
     */
    public void deathsStream(mruv.Characters.DeathStreamRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.DeathStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeathsStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public void getServiceStatus(mruv.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.ServiceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceStatusMethod(), responseObserver);
    }

    /**
     */
    public void getServiceVersion(mruv.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.VersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceVersionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCharacterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Characters.CreateCharacterRequest,
                mruv.Characters.CreateCharacterResponse>(
                  this, METHODID_CREATE_CHARACTER)))
          .addMethod(
            getGetCharacterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Characters.GetCharacterRequest,
                mruv.Characters.GetCharacterResponse>(
                  this, METHODID_GET_CHARACTER)))
          .addMethod(
            getUpdateCharacterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Characters.UpdateCharacterRequest,
                mruv.Characters.UpdateCharacterResponse>(
                  this, METHODID_UPDATE_CHARACTER)))
          .addMethod(
            getDeleteCharacterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Characters.DeleteCharacterRequest,
                mruv.Characters.DeleteCharacterResponse>(
                  this, METHODID_DELETE_CHARACTER)))
          .addMethod(
            getPermanentCharacterKillMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Characters.CharacterID,
                mruv.Characters.CharacterID>(
                  this, METHODID_PERMANENT_CHARACTER_KILL)))
          .addMethod(
            getChangeClothesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Characters.ChangeClothesRequest,
                mruv.Characters.ChangeClothesResponse>(
                  this, METHODID_CHANGE_CLOTHES)))
          .addMethod(
            getDeathsStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.Characters.DeathStreamRequest,
                mruv.Characters.DeathStreamResponse>(
                  this, METHODID_DEATHS_STREAM)))
          .addMethod(
            getGetServiceStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Health.ServiceStatusRequest,
                mruv.Health.ServiceStatusResponse>(
                  this, METHODID_GET_SERVICE_STATUS)))
          .addMethod(
            getGetServiceVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Health.VersionRequest,
                mruv.Health.VersionResponse>(
                  this, METHODID_GET_SERVICE_VERSION)))
          .build();
    }
  }

  /**
   */
  public static final class MruVCharactersServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVCharactersServiceStub> {
    private MruVCharactersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVCharactersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVCharactersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a character.
     * </pre>
     */
    public void createCharacter(mruv.Characters.CreateCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.CreateCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a character.
     * </pre>
     */
    public void getCharacter(mruv.Characters.GetCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.GetCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a character.
     * </pre>
     */
    public void updateCharacter(mruv.Characters.UpdateCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.UpdateCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a character.
     * </pre>
     */
    public void deleteCharacter(mruv.Characters.DeleteCharacterRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.DeleteCharacterResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Kill a character. A character that is killed cannot be played anymore.
     * </pre>
     */
    public void permanentCharacterKill(mruv.Characters.CharacterID request,
        io.grpc.stub.StreamObserver<mruv.Characters.CharacterID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPermanentCharacterKillMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Change player clothes.
     * </pre>
     */
    public void changeClothes(mruv.Characters.ChangeClothesRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.ChangeClothesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeClothesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream of deaths.
     * </pre>
     */
    public void deathsStream(mruv.Characters.DeathStreamRequest request,
        io.grpc.stub.StreamObserver<mruv.Characters.DeathStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDeathsStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public void getServiceStatus(mruv.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.ServiceStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServiceVersion(mruv.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.VersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MruVCharactersServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVCharactersServiceBlockingStub> {
    private MruVCharactersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVCharactersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVCharactersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a character.
     * </pre>
     */
    public mruv.Characters.CreateCharacterResponse createCharacter(mruv.Characters.CreateCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCharacterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a character.
     * </pre>
     */
    public mruv.Characters.GetCharacterResponse getCharacter(mruv.Characters.GetCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCharacterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a character.
     * </pre>
     */
    public mruv.Characters.UpdateCharacterResponse updateCharacter(mruv.Characters.UpdateCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCharacterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a character.
     * </pre>
     */
    public mruv.Characters.DeleteCharacterResponse deleteCharacter(mruv.Characters.DeleteCharacterRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCharacterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Kill a character. A character that is killed cannot be played anymore.
     * </pre>
     */
    public mruv.Characters.CharacterID permanentCharacterKill(mruv.Characters.CharacterID request) {
      return blockingUnaryCall(
          getChannel(), getPermanentCharacterKillMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Change player clothes.
     * </pre>
     */
    public mruv.Characters.ChangeClothesResponse changeClothes(mruv.Characters.ChangeClothesRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangeClothesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Stream of deaths.
     * </pre>
     */
    public java.util.Iterator<mruv.Characters.DeathStreamResponse> deathsStream(
        mruv.Characters.DeathStreamRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDeathsStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public mruv.Health.ServiceStatusResponse getServiceStatus(mruv.Health.ServiceStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.Health.VersionResponse getServiceVersion(mruv.Health.VersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MruVCharactersServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVCharactersServiceFutureStub> {
    private MruVCharactersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVCharactersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVCharactersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a character.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Characters.CreateCharacterResponse> createCharacter(
        mruv.Characters.CreateCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCharacterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a character.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Characters.GetCharacterResponse> getCharacter(
        mruv.Characters.GetCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCharacterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a character.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Characters.UpdateCharacterResponse> updateCharacter(
        mruv.Characters.UpdateCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCharacterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a character.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Characters.DeleteCharacterResponse> deleteCharacter(
        mruv.Characters.DeleteCharacterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCharacterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Kill a character. A character that is killed cannot be played anymore.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Characters.CharacterID> permanentCharacterKill(
        mruv.Characters.CharacterID request) {
      return futureUnaryCall(
          getChannel().newCall(getPermanentCharacterKillMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Change player clothes.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Characters.ChangeClothesResponse> changeClothes(
        mruv.Characters.ChangeClothesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeClothesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Health.ServiceStatusResponse> getServiceStatus(
        mruv.Health.ServiceStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Health.VersionResponse> getServiceVersion(
        mruv.Health.VersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHARACTER = 0;
  private static final int METHODID_GET_CHARACTER = 1;
  private static final int METHODID_UPDATE_CHARACTER = 2;
  private static final int METHODID_DELETE_CHARACTER = 3;
  private static final int METHODID_PERMANENT_CHARACTER_KILL = 4;
  private static final int METHODID_CHANGE_CLOTHES = 5;
  private static final int METHODID_DEATHS_STREAM = 6;
  private static final int METHODID_GET_SERVICE_STATUS = 7;
  private static final int METHODID_GET_SERVICE_VERSION = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVCharactersServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVCharactersServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHARACTER:
          serviceImpl.createCharacter((mruv.Characters.CreateCharacterRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.CreateCharacterResponse>) responseObserver);
          break;
        case METHODID_GET_CHARACTER:
          serviceImpl.getCharacter((mruv.Characters.GetCharacterRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.GetCharacterResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CHARACTER:
          serviceImpl.updateCharacter((mruv.Characters.UpdateCharacterRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.UpdateCharacterResponse>) responseObserver);
          break;
        case METHODID_DELETE_CHARACTER:
          serviceImpl.deleteCharacter((mruv.Characters.DeleteCharacterRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.DeleteCharacterResponse>) responseObserver);
          break;
        case METHODID_PERMANENT_CHARACTER_KILL:
          serviceImpl.permanentCharacterKill((mruv.Characters.CharacterID) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.CharacterID>) responseObserver);
          break;
        case METHODID_CHANGE_CLOTHES:
          serviceImpl.changeClothes((mruv.Characters.ChangeClothesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.ChangeClothesResponse>) responseObserver);
          break;
        case METHODID_DEATHS_STREAM:
          serviceImpl.deathsStream((mruv.Characters.DeathStreamRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Characters.DeathStreamResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_STATUS:
          serviceImpl.getServiceStatus((mruv.Health.ServiceStatusRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Health.ServiceStatusResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_VERSION:
          serviceImpl.getServiceVersion((mruv.Health.VersionRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Health.VersionResponse>) responseObserver);
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

  private static abstract class MruVCharactersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVCharactersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.Characters.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVCharactersService");
    }
  }

  private static final class MruVCharactersServiceFileDescriptorSupplier
      extends MruVCharactersServiceBaseDescriptorSupplier {
    MruVCharactersServiceFileDescriptorSupplier() {}
  }

  private static final class MruVCharactersServiceMethodDescriptorSupplier
      extends MruVCharactersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVCharactersServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVCharactersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVCharactersServiceFileDescriptorSupplier())
              .addMethod(getCreateCharacterMethod())
              .addMethod(getGetCharacterMethod())
              .addMethod(getUpdateCharacterMethod())
              .addMethod(getDeleteCharacterMethod())
              .addMethod(getPermanentCharacterKillMethod())
              .addMethod(getChangeClothesMethod())
              .addMethod(getDeathsStreamMethod())
              .addMethod(getGetServiceStatusMethod())
              .addMethod(getGetServiceVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
