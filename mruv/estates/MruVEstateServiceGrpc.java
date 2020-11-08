package mruv.estates;

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
 * The MruV estate service provides procedures for managing buildings and other estates.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: estates/estates.proto")
public final class MruVEstateServiceGrpc {

  private MruVEstateServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.estates.MruVEstateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.CreateEstateRequest,
      mruv.estates.Estates.CreateEstateResponse> getCreateEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEstate",
      requestType = mruv.estates.Estates.CreateEstateRequest.class,
      responseType = mruv.estates.Estates.CreateEstateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.CreateEstateRequest,
      mruv.estates.Estates.CreateEstateResponse> getCreateEstateMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.CreateEstateRequest, mruv.estates.Estates.CreateEstateResponse> getCreateEstateMethod;
    if ((getCreateEstateMethod = MruVEstateServiceGrpc.getCreateEstateMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getCreateEstateMethod = MruVEstateServiceGrpc.getCreateEstateMethod) == null) {
          MruVEstateServiceGrpc.getCreateEstateMethod = getCreateEstateMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.CreateEstateRequest, mruv.estates.Estates.CreateEstateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.CreateEstateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.CreateEstateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("CreateEstate"))
              .build();
        }
      }
    }
    return getCreateEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateRequest,
      mruv.estates.Estates.Estate> getGetEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEstate",
      requestType = mruv.estates.Estates.GetEstateRequest.class,
      responseType = mruv.estates.Estates.Estate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateRequest,
      mruv.estates.Estates.Estate> getGetEstateMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateRequest, mruv.estates.Estates.Estate> getGetEstateMethod;
    if ((getGetEstateMethod = MruVEstateServiceGrpc.getGetEstateMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getGetEstateMethod = MruVEstateServiceGrpc.getGetEstateMethod) == null) {
          MruVEstateServiceGrpc.getGetEstateMethod = getGetEstateMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.GetEstateRequest, mruv.estates.Estates.Estate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.Estate.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("GetEstate"))
              .build();
        }
      }
    }
    return getGetEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.UpdateEstateRequest,
      mruv.estates.Estates.UpdateEstateResponse> getUpdateEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEstate",
      requestType = mruv.estates.Estates.UpdateEstateRequest.class,
      responseType = mruv.estates.Estates.UpdateEstateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.UpdateEstateRequest,
      mruv.estates.Estates.UpdateEstateResponse> getUpdateEstateMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.UpdateEstateRequest, mruv.estates.Estates.UpdateEstateResponse> getUpdateEstateMethod;
    if ((getUpdateEstateMethod = MruVEstateServiceGrpc.getUpdateEstateMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getUpdateEstateMethod = MruVEstateServiceGrpc.getUpdateEstateMethod) == null) {
          MruVEstateServiceGrpc.getUpdateEstateMethod = getUpdateEstateMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.UpdateEstateRequest, mruv.estates.Estates.UpdateEstateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.UpdateEstateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.UpdateEstateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("UpdateEstate"))
              .build();
        }
      }
    }
    return getUpdateEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.DeleteEstateRequest,
      mruv.estates.Estates.DeleteEstateResponse> getDeleteEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEstate",
      requestType = mruv.estates.Estates.DeleteEstateRequest.class,
      responseType = mruv.estates.Estates.DeleteEstateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.DeleteEstateRequest,
      mruv.estates.Estates.DeleteEstateResponse> getDeleteEstateMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.DeleteEstateRequest, mruv.estates.Estates.DeleteEstateResponse> getDeleteEstateMethod;
    if ((getDeleteEstateMethod = MruVEstateServiceGrpc.getDeleteEstateMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getDeleteEstateMethod = MruVEstateServiceGrpc.getDeleteEstateMethod) == null) {
          MruVEstateServiceGrpc.getDeleteEstateMethod = getDeleteEstateMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.DeleteEstateRequest, mruv.estates.Estates.DeleteEstateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.DeleteEstateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.DeleteEstateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("DeleteEstate"))
              .build();
        }
      }
    }
    return getDeleteEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstatesRequest,
      mruv.estates.Estates.GetEstatesResponse> getGetEstatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEstates",
      requestType = mruv.estates.Estates.GetEstatesRequest.class,
      responseType = mruv.estates.Estates.GetEstatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstatesRequest,
      mruv.estates.Estates.GetEstatesResponse> getGetEstatesMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstatesRequest, mruv.estates.Estates.GetEstatesResponse> getGetEstatesMethod;
    if ((getGetEstatesMethod = MruVEstateServiceGrpc.getGetEstatesMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getGetEstatesMethod = MruVEstateServiceGrpc.getGetEstatesMethod) == null) {
          MruVEstateServiceGrpc.getGetEstatesMethod = getGetEstatesMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.GetEstatesRequest, mruv.estates.Estates.GetEstatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEstates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("GetEstates"))
              .build();
        }
      }
    }
    return getGetEstatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.AddGateRequest,
      mruv.estates.Estates.AddGateResponse> getAddGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddGate",
      requestType = mruv.estates.Estates.AddGateRequest.class,
      responseType = mruv.estates.Estates.AddGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.AddGateRequest,
      mruv.estates.Estates.AddGateResponse> getAddGateMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.AddGateRequest, mruv.estates.Estates.AddGateResponse> getAddGateMethod;
    if ((getAddGateMethod = MruVEstateServiceGrpc.getAddGateMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getAddGateMethod = MruVEstateServiceGrpc.getAddGateMethod) == null) {
          MruVEstateServiceGrpc.getAddGateMethod = getAddGateMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.AddGateRequest, mruv.estates.Estates.AddGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.AddGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.AddGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("AddGate"))
              .build();
        }
      }
    }
    return getAddGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.RemoveGateRequest,
      mruv.estates.Estates.RemoveGateResponse> getRemoveGateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveGate",
      requestType = mruv.estates.Estates.RemoveGateRequest.class,
      responseType = mruv.estates.Estates.RemoveGateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.RemoveGateRequest,
      mruv.estates.Estates.RemoveGateResponse> getRemoveGateMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.RemoveGateRequest, mruv.estates.Estates.RemoveGateResponse> getRemoveGateMethod;
    if ((getRemoveGateMethod = MruVEstateServiceGrpc.getRemoveGateMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getRemoveGateMethod = MruVEstateServiceGrpc.getRemoveGateMethod) == null) {
          MruVEstateServiceGrpc.getRemoveGateMethod = getRemoveGateMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.RemoveGateRequest, mruv.estates.Estates.RemoveGateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveGate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.RemoveGateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.RemoveGateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("RemoveGate"))
              .build();
        }
      }
    }
    return getRemoveGateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateGatesRequest,
      mruv.estates.Estates.GetEstateGatesResponse> getGetEstateGatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEstateGates",
      requestType = mruv.estates.Estates.GetEstateGatesRequest.class,
      responseType = mruv.estates.Estates.GetEstateGatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateGatesRequest,
      mruv.estates.Estates.GetEstateGatesResponse> getGetEstateGatesMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateGatesRequest, mruv.estates.Estates.GetEstateGatesResponse> getGetEstateGatesMethod;
    if ((getGetEstateGatesMethod = MruVEstateServiceGrpc.getGetEstateGatesMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getGetEstateGatesMethod = MruVEstateServiceGrpc.getGetEstateGatesMethod) == null) {
          MruVEstateServiceGrpc.getGetEstateGatesMethod = getGetEstateGatesMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.GetEstateGatesRequest, mruv.estates.Estates.GetEstateGatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEstateGates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstateGatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstateGatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("GetEstateGates"))
              .build();
        }
      }
    }
    return getGetEstateGatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.AddEntranceRequest,
      mruv.estates.Estates.AddEntranceResponse> getAddEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddEntrance",
      requestType = mruv.estates.Estates.AddEntranceRequest.class,
      responseType = mruv.estates.Estates.AddEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.AddEntranceRequest,
      mruv.estates.Estates.AddEntranceResponse> getAddEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.AddEntranceRequest, mruv.estates.Estates.AddEntranceResponse> getAddEntranceMethod;
    if ((getAddEntranceMethod = MruVEstateServiceGrpc.getAddEntranceMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getAddEntranceMethod = MruVEstateServiceGrpc.getAddEntranceMethod) == null) {
          MruVEstateServiceGrpc.getAddEntranceMethod = getAddEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.AddEntranceRequest, mruv.estates.Estates.AddEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.AddEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.AddEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("AddEntrance"))
              .build();
        }
      }
    }
    return getAddEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.RemoveEntranceRequest,
      mruv.estates.Estates.RemoveEntranceResponse> getRemoveEntranceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEntrance",
      requestType = mruv.estates.Estates.RemoveEntranceRequest.class,
      responseType = mruv.estates.Estates.RemoveEntranceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.RemoveEntranceRequest,
      mruv.estates.Estates.RemoveEntranceResponse> getRemoveEntranceMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.RemoveEntranceRequest, mruv.estates.Estates.RemoveEntranceResponse> getRemoveEntranceMethod;
    if ((getRemoveEntranceMethod = MruVEstateServiceGrpc.getRemoveEntranceMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getRemoveEntranceMethod = MruVEstateServiceGrpc.getRemoveEntranceMethod) == null) {
          MruVEstateServiceGrpc.getRemoveEntranceMethod = getRemoveEntranceMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.RemoveEntranceRequest, mruv.estates.Estates.RemoveEntranceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEntrance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.RemoveEntranceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.RemoveEntranceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("RemoveEntrance"))
              .build();
        }
      }
    }
    return getRemoveEntranceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateEntrancesRequest,
      mruv.estates.Estates.GetEstateEntrancesResponse> getGetEstateEntrancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEstateEntrances",
      requestType = mruv.estates.Estates.GetEstateEntrancesRequest.class,
      responseType = mruv.estates.Estates.GetEstateEntrancesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateEntrancesRequest,
      mruv.estates.Estates.GetEstateEntrancesResponse> getGetEstateEntrancesMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.GetEstateEntrancesRequest, mruv.estates.Estates.GetEstateEntrancesResponse> getGetEstateEntrancesMethod;
    if ((getGetEstateEntrancesMethod = MruVEstateServiceGrpc.getGetEstateEntrancesMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getGetEstateEntrancesMethod = MruVEstateServiceGrpc.getGetEstateEntrancesMethod) == null) {
          MruVEstateServiceGrpc.getGetEstateEntrancesMethod = getGetEstateEntrancesMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.GetEstateEntrancesRequest, mruv.estates.Estates.GetEstateEntrancesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEstateEntrances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstateEntrancesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.GetEstateEntrancesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("GetEstateEntrances"))
              .build();
        }
      }
    }
    return getGetEstateEntrancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.estates.Estates.FetchAllEstatesRequest,
      mruv.estates.Estates.FetchAllEstatesResponse> getFetchAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAll",
      requestType = mruv.estates.Estates.FetchAllEstatesRequest.class,
      responseType = mruv.estates.Estates.FetchAllEstatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.estates.Estates.FetchAllEstatesRequest,
      mruv.estates.Estates.FetchAllEstatesResponse> getFetchAllMethod() {
    io.grpc.MethodDescriptor<mruv.estates.Estates.FetchAllEstatesRequest, mruv.estates.Estates.FetchAllEstatesResponse> getFetchAllMethod;
    if ((getFetchAllMethod = MruVEstateServiceGrpc.getFetchAllMethod) == null) {
      synchronized (MruVEstateServiceGrpc.class) {
        if ((getFetchAllMethod = MruVEstateServiceGrpc.getFetchAllMethod) == null) {
          MruVEstateServiceGrpc.getFetchAllMethod = getFetchAllMethod =
              io.grpc.MethodDescriptor.<mruv.estates.Estates.FetchAllEstatesRequest, mruv.estates.Estates.FetchAllEstatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.FetchAllEstatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.estates.Estates.FetchAllEstatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVEstateServiceMethodDescriptorSupplier("FetchAll"))
              .build();
        }
      }
    }
    return getFetchAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVEstateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEstateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEstateServiceStub>() {
        @java.lang.Override
        public MruVEstateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEstateServiceStub(channel, callOptions);
        }
      };
    return MruVEstateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVEstateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEstateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEstateServiceBlockingStub>() {
        @java.lang.Override
        public MruVEstateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEstateServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVEstateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVEstateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVEstateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVEstateServiceFutureStub>() {
        @java.lang.Override
        public MruVEstateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVEstateServiceFutureStub(channel, callOptions);
        }
      };
    return MruVEstateServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV estate service provides procedures for managing buildings and other estates.
   * </pre>
   */
  public static abstract class MruVEstateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create real estate.
     * </pre>
     */
    public void createEstate(mruv.estates.Estates.CreateEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.CreateEstateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEstateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get real estate.
     * </pre>
     */
    public void getEstate(mruv.estates.Estates.GetEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.Estate> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEstateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update real estate.
     * </pre>
     */
    public void updateEstate(mruv.estates.Estates.UpdateEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.UpdateEstateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEstateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete real estate.
     * </pre>
     */
    public void deleteEstate(mruv.estates.Estates.DeleteEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.DeleteEstateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEstateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all created real estates.
     * </pre>
     */
    public void getEstates(mruv.estates.Estates.GetEstatesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEstatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a gate to an estate.
     * </pre>
     */
    public void addGate(mruv.estates.Estates.AddGateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.AddGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a gate from estate.
     * </pre>
     */
    public void removeGate(mruv.estates.Estates.RemoveGateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.RemoveGateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveGateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all estate gates.
     * </pre>
     */
    public void getEstateGates(mruv.estates.Estates.GetEstateGatesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstateGatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEstateGatesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add an entrance to estate.
     * </pre>
     */
    public void addEntrance(mruv.estates.Estates.AddEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.AddEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove an entrance from estate.
     * </pre>
     */
    public void removeEntrance(mruv.estates.Estates.RemoveEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.RemoveEntranceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveEntranceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all estate entrances.
     * </pre>
     */
    public void getEstateEntrances(mruv.estates.Estates.GetEstateEntrancesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstateEntrancesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEstateEntrancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get full estates data
     * </pre>
     */
    public void fetchAll(mruv.estates.Estates.FetchAllEstatesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.FetchAllEstatesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateEstateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.CreateEstateRequest,
                mruv.estates.Estates.CreateEstateResponse>(
                  this, METHODID_CREATE_ESTATE)))
          .addMethod(
            getGetEstateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.GetEstateRequest,
                mruv.estates.Estates.Estate>(
                  this, METHODID_GET_ESTATE)))
          .addMethod(
            getUpdateEstateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.UpdateEstateRequest,
                mruv.estates.Estates.UpdateEstateResponse>(
                  this, METHODID_UPDATE_ESTATE)))
          .addMethod(
            getDeleteEstateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.DeleteEstateRequest,
                mruv.estates.Estates.DeleteEstateResponse>(
                  this, METHODID_DELETE_ESTATE)))
          .addMethod(
            getGetEstatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.GetEstatesRequest,
                mruv.estates.Estates.GetEstatesResponse>(
                  this, METHODID_GET_ESTATES)))
          .addMethod(
            getAddGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.AddGateRequest,
                mruv.estates.Estates.AddGateResponse>(
                  this, METHODID_ADD_GATE)))
          .addMethod(
            getRemoveGateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.RemoveGateRequest,
                mruv.estates.Estates.RemoveGateResponse>(
                  this, METHODID_REMOVE_GATE)))
          .addMethod(
            getGetEstateGatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.GetEstateGatesRequest,
                mruv.estates.Estates.GetEstateGatesResponse>(
                  this, METHODID_GET_ESTATE_GATES)))
          .addMethod(
            getAddEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.AddEntranceRequest,
                mruv.estates.Estates.AddEntranceResponse>(
                  this, METHODID_ADD_ENTRANCE)))
          .addMethod(
            getRemoveEntranceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.RemoveEntranceRequest,
                mruv.estates.Estates.RemoveEntranceResponse>(
                  this, METHODID_REMOVE_ENTRANCE)))
          .addMethod(
            getGetEstateEntrancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.estates.Estates.GetEstateEntrancesRequest,
                mruv.estates.Estates.GetEstateEntrancesResponse>(
                  this, METHODID_GET_ESTATE_ENTRANCES)))
          .addMethod(
            getFetchAllMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.estates.Estates.FetchAllEstatesRequest,
                mruv.estates.Estates.FetchAllEstatesResponse>(
                  this, METHODID_FETCH_ALL)))
          .build();
    }
  }

  /**
   * <pre>
   * The MruV estate service provides procedures for managing buildings and other estates.
   * </pre>
   */
  public static final class MruVEstateServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVEstateServiceStub> {
    private MruVEstateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEstateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEstateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create real estate.
     * </pre>
     */
    public void createEstate(mruv.estates.Estates.CreateEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.CreateEstateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get real estate.
     * </pre>
     */
    public void getEstate(mruv.estates.Estates.GetEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.Estate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update real estate.
     * </pre>
     */
    public void updateEstate(mruv.estates.Estates.UpdateEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.UpdateEstateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete real estate.
     * </pre>
     */
    public void deleteEstate(mruv.estates.Estates.DeleteEstateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.DeleteEstateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all created real estates.
     * </pre>
     */
    public void getEstates(mruv.estates.Estates.GetEstatesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEstatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a gate to an estate.
     * </pre>
     */
    public void addGate(mruv.estates.Estates.AddGateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.AddGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a gate from estate.
     * </pre>
     */
    public void removeGate(mruv.estates.Estates.RemoveGateRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.RemoveGateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveGateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all estate gates.
     * </pre>
     */
    public void getEstateGates(mruv.estates.Estates.GetEstateGatesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstateGatesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEstateGatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add an entrance to estate.
     * </pre>
     */
    public void addEntrance(mruv.estates.Estates.AddEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.AddEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove an entrance from estate.
     * </pre>
     */
    public void removeEntrance(mruv.estates.Estates.RemoveEntranceRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.RemoveEntranceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveEntranceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all estate entrances.
     * </pre>
     */
    public void getEstateEntrances(mruv.estates.Estates.GetEstateEntrancesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstateEntrancesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEstateEntrancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get full estates data
     * </pre>
     */
    public void fetchAll(mruv.estates.Estates.FetchAllEstatesRequest request,
        io.grpc.stub.StreamObserver<mruv.estates.Estates.FetchAllEstatesResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV estate service provides procedures for managing buildings and other estates.
   * </pre>
   */
  public static final class MruVEstateServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVEstateServiceBlockingStub> {
    private MruVEstateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEstateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEstateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create real estate.
     * </pre>
     */
    public mruv.estates.Estates.CreateEstateResponse createEstate(mruv.estates.Estates.CreateEstateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEstateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get real estate.
     * </pre>
     */
    public mruv.estates.Estates.Estate getEstate(mruv.estates.Estates.GetEstateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEstateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update real estate.
     * </pre>
     */
    public mruv.estates.Estates.UpdateEstateResponse updateEstate(mruv.estates.Estates.UpdateEstateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEstateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete real estate.
     * </pre>
     */
    public mruv.estates.Estates.DeleteEstateResponse deleteEstate(mruv.estates.Estates.DeleteEstateRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEstateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all created real estates.
     * </pre>
     */
    public mruv.estates.Estates.GetEstatesResponse getEstates(mruv.estates.Estates.GetEstatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEstatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a gate to an estate.
     * </pre>
     */
    public mruv.estates.Estates.AddGateResponse addGate(mruv.estates.Estates.AddGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a gate from estate.
     * </pre>
     */
    public mruv.estates.Estates.RemoveGateResponse removeGate(mruv.estates.Estates.RemoveGateRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveGateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all estate gates.
     * </pre>
     */
    public mruv.estates.Estates.GetEstateGatesResponse getEstateGates(mruv.estates.Estates.GetEstateGatesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEstateGatesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add an entrance to estate.
     * </pre>
     */
    public mruv.estates.Estates.AddEntranceResponse addEntrance(mruv.estates.Estates.AddEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove an entrance from estate.
     * </pre>
     */
    public mruv.estates.Estates.RemoveEntranceResponse removeEntrance(mruv.estates.Estates.RemoveEntranceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveEntranceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all estate entrances.
     * </pre>
     */
    public mruv.estates.Estates.GetEstateEntrancesResponse getEstateEntrances(mruv.estates.Estates.GetEstateEntrancesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEstateEntrancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get full estates data
     * </pre>
     */
    public java.util.Iterator<mruv.estates.Estates.FetchAllEstatesResponse> fetchAll(
        mruv.estates.Estates.FetchAllEstatesRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV estate service provides procedures for managing buildings and other estates.
   * </pre>
   */
  public static final class MruVEstateServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVEstateServiceFutureStub> {
    private MruVEstateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVEstateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVEstateServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create real estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.CreateEstateResponse> createEstate(
        mruv.estates.Estates.CreateEstateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEstateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get real estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.Estate> getEstate(
        mruv.estates.Estates.GetEstateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEstateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update real estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.UpdateEstateResponse> updateEstate(
        mruv.estates.Estates.UpdateEstateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEstateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete real estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.DeleteEstateResponse> deleteEstate(
        mruv.estates.Estates.DeleteEstateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEstateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all created real estates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.GetEstatesResponse> getEstates(
        mruv.estates.Estates.GetEstatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEstatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a gate to an estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.AddGateResponse> addGate(
        mruv.estates.Estates.AddGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a gate from estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.RemoveGateResponse> removeGate(
        mruv.estates.Estates.RemoveGateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveGateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all estate gates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.GetEstateGatesResponse> getEstateGates(
        mruv.estates.Estates.GetEstateGatesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEstateGatesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add an entrance to estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.AddEntranceResponse> addEntrance(
        mruv.estates.Estates.AddEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove an entrance from estate.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.RemoveEntranceResponse> removeEntrance(
        mruv.estates.Estates.RemoveEntranceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveEntranceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all estate entrances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.estates.Estates.GetEstateEntrancesResponse> getEstateEntrances(
        mruv.estates.Estates.GetEstateEntrancesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEstateEntrancesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ESTATE = 0;
  private static final int METHODID_GET_ESTATE = 1;
  private static final int METHODID_UPDATE_ESTATE = 2;
  private static final int METHODID_DELETE_ESTATE = 3;
  private static final int METHODID_GET_ESTATES = 4;
  private static final int METHODID_ADD_GATE = 5;
  private static final int METHODID_REMOVE_GATE = 6;
  private static final int METHODID_GET_ESTATE_GATES = 7;
  private static final int METHODID_ADD_ENTRANCE = 8;
  private static final int METHODID_REMOVE_ENTRANCE = 9;
  private static final int METHODID_GET_ESTATE_ENTRANCES = 10;
  private static final int METHODID_FETCH_ALL = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVEstateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVEstateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ESTATE:
          serviceImpl.createEstate((mruv.estates.Estates.CreateEstateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.CreateEstateResponse>) responseObserver);
          break;
        case METHODID_GET_ESTATE:
          serviceImpl.getEstate((mruv.estates.Estates.GetEstateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.Estate>) responseObserver);
          break;
        case METHODID_UPDATE_ESTATE:
          serviceImpl.updateEstate((mruv.estates.Estates.UpdateEstateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.UpdateEstateResponse>) responseObserver);
          break;
        case METHODID_DELETE_ESTATE:
          serviceImpl.deleteEstate((mruv.estates.Estates.DeleteEstateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.DeleteEstateResponse>) responseObserver);
          break;
        case METHODID_GET_ESTATES:
          serviceImpl.getEstates((mruv.estates.Estates.GetEstatesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstatesResponse>) responseObserver);
          break;
        case METHODID_ADD_GATE:
          serviceImpl.addGate((mruv.estates.Estates.AddGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.AddGateResponse>) responseObserver);
          break;
        case METHODID_REMOVE_GATE:
          serviceImpl.removeGate((mruv.estates.Estates.RemoveGateRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.RemoveGateResponse>) responseObserver);
          break;
        case METHODID_GET_ESTATE_GATES:
          serviceImpl.getEstateGates((mruv.estates.Estates.GetEstateGatesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstateGatesResponse>) responseObserver);
          break;
        case METHODID_ADD_ENTRANCE:
          serviceImpl.addEntrance((mruv.estates.Estates.AddEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.AddEntranceResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ENTRANCE:
          serviceImpl.removeEntrance((mruv.estates.Estates.RemoveEntranceRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.RemoveEntranceResponse>) responseObserver);
          break;
        case METHODID_GET_ESTATE_ENTRANCES:
          serviceImpl.getEstateEntrances((mruv.estates.Estates.GetEstateEntrancesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.GetEstateEntrancesResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL:
          serviceImpl.fetchAll((mruv.estates.Estates.FetchAllEstatesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.estates.Estates.FetchAllEstatesResponse>) responseObserver);
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

  private static abstract class MruVEstateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVEstateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.estates.Estates.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVEstateService");
    }
  }

  private static final class MruVEstateServiceFileDescriptorSupplier
      extends MruVEstateServiceBaseDescriptorSupplier {
    MruVEstateServiceFileDescriptorSupplier() {}
  }

  private static final class MruVEstateServiceMethodDescriptorSupplier
      extends MruVEstateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVEstateServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVEstateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVEstateServiceFileDescriptorSupplier())
              .addMethod(getCreateEstateMethod())
              .addMethod(getGetEstateMethod())
              .addMethod(getUpdateEstateMethod())
              .addMethod(getDeleteEstateMethod())
              .addMethod(getGetEstatesMethod())
              .addMethod(getAddGateMethod())
              .addMethod(getRemoveGateMethod())
              .addMethod(getGetEstateGatesMethod())
              .addMethod(getAddEntranceMethod())
              .addMethod(getRemoveEntranceMethod())
              .addMethod(getGetEstateEntrancesMethod())
              .addMethod(getFetchAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
