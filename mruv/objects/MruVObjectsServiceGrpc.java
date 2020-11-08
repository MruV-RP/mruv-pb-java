package mruv.objects;

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
 *The MruV objects service provides procedures for game objects.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: objects/objects.proto")
public final class MruVObjectsServiceGrpc {

  private MruVObjectsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.objects.MruVObjectsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.CreateObjectRequest,
      mruv.objects.Objects.CreateObjectResponse> getCreateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateObject",
      requestType = mruv.objects.Objects.CreateObjectRequest.class,
      responseType = mruv.objects.Objects.CreateObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.CreateObjectRequest,
      mruv.objects.Objects.CreateObjectResponse> getCreateObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.CreateObjectRequest, mruv.objects.Objects.CreateObjectResponse> getCreateObjectMethod;
    if ((getCreateObjectMethod = MruVObjectsServiceGrpc.getCreateObjectMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getCreateObjectMethod = MruVObjectsServiceGrpc.getCreateObjectMethod) == null) {
          MruVObjectsServiceGrpc.getCreateObjectMethod = getCreateObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.CreateObjectRequest, mruv.objects.Objects.CreateObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.CreateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.CreateObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("CreateObject"))
              .build();
        }
      }
    }
    return getCreateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectRequest,
      mruv.objects.Objects.GetObjectResponse> getGetObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObject",
      requestType = mruv.objects.Objects.GetObjectRequest.class,
      responseType = mruv.objects.Objects.GetObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectRequest,
      mruv.objects.Objects.GetObjectResponse> getGetObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectRequest, mruv.objects.Objects.GetObjectResponse> getGetObjectMethod;
    if ((getGetObjectMethod = MruVObjectsServiceGrpc.getGetObjectMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getGetObjectMethod = MruVObjectsServiceGrpc.getGetObjectMethod) == null) {
          MruVObjectsServiceGrpc.getGetObjectMethod = getGetObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.GetObjectRequest, mruv.objects.Objects.GetObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("GetObject"))
              .build();
        }
      }
    }
    return getGetObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.UpdateObjectRequest,
      mruv.objects.Objects.UpdateObjectResponse> getUpdateObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateObject",
      requestType = mruv.objects.Objects.UpdateObjectRequest.class,
      responseType = mruv.objects.Objects.UpdateObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.UpdateObjectRequest,
      mruv.objects.Objects.UpdateObjectResponse> getUpdateObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.UpdateObjectRequest, mruv.objects.Objects.UpdateObjectResponse> getUpdateObjectMethod;
    if ((getUpdateObjectMethod = MruVObjectsServiceGrpc.getUpdateObjectMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getUpdateObjectMethod = MruVObjectsServiceGrpc.getUpdateObjectMethod) == null) {
          MruVObjectsServiceGrpc.getUpdateObjectMethod = getUpdateObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.UpdateObjectRequest, mruv.objects.Objects.UpdateObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.UpdateObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.UpdateObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("UpdateObject"))
              .build();
        }
      }
    }
    return getUpdateObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectRequest,
      mruv.objects.Objects.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = mruv.objects.Objects.DeleteObjectRequest.class,
      responseType = mruv.objects.Objects.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectRequest,
      mruv.objects.Objects.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectRequest, mruv.objects.Objects.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = MruVObjectsServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getDeleteObjectMethod = MruVObjectsServiceGrpc.getDeleteObjectMethod) == null) {
          MruVObjectsServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.DeleteObjectRequest, mruv.objects.Objects.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.AddObjectMaterialRequest,
      mruv.objects.Objects.AddObjectMaterialResponse> getAddObjectMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddObjectMaterial",
      requestType = mruv.objects.Objects.AddObjectMaterialRequest.class,
      responseType = mruv.objects.Objects.AddObjectMaterialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.AddObjectMaterialRequest,
      mruv.objects.Objects.AddObjectMaterialResponse> getAddObjectMaterialMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.AddObjectMaterialRequest, mruv.objects.Objects.AddObjectMaterialResponse> getAddObjectMaterialMethod;
    if ((getAddObjectMaterialMethod = MruVObjectsServiceGrpc.getAddObjectMaterialMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getAddObjectMaterialMethod = MruVObjectsServiceGrpc.getAddObjectMaterialMethod) == null) {
          MruVObjectsServiceGrpc.getAddObjectMaterialMethod = getAddObjectMaterialMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.AddObjectMaterialRequest, mruv.objects.Objects.AddObjectMaterialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddObjectMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.AddObjectMaterialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.AddObjectMaterialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("AddObjectMaterial"))
              .build();
        }
      }
    }
    return getAddObjectMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectMaterialsRequest,
      mruv.objects.Objects.GetObjectMaterialsResponse> getGetObjectMaterialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectMaterials",
      requestType = mruv.objects.Objects.GetObjectMaterialsRequest.class,
      responseType = mruv.objects.Objects.GetObjectMaterialsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectMaterialsRequest,
      mruv.objects.Objects.GetObjectMaterialsResponse> getGetObjectMaterialsMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectMaterialsRequest, mruv.objects.Objects.GetObjectMaterialsResponse> getGetObjectMaterialsMethod;
    if ((getGetObjectMaterialsMethod = MruVObjectsServiceGrpc.getGetObjectMaterialsMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getGetObjectMaterialsMethod = MruVObjectsServiceGrpc.getGetObjectMaterialsMethod) == null) {
          MruVObjectsServiceGrpc.getGetObjectMaterialsMethod = getGetObjectMaterialsMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.GetObjectMaterialsRequest, mruv.objects.Objects.GetObjectMaterialsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectMaterials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetObjectMaterialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetObjectMaterialsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("GetObjectMaterials"))
              .build();
        }
      }
    }
    return getGetObjectMaterialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectMaterialRequest,
      mruv.objects.Objects.DeleteObjectMaterialResponse> getDeleteObjectMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectMaterial",
      requestType = mruv.objects.Objects.DeleteObjectMaterialRequest.class,
      responseType = mruv.objects.Objects.DeleteObjectMaterialResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectMaterialRequest,
      mruv.objects.Objects.DeleteObjectMaterialResponse> getDeleteObjectMaterialMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectMaterialRequest, mruv.objects.Objects.DeleteObjectMaterialResponse> getDeleteObjectMaterialMethod;
    if ((getDeleteObjectMaterialMethod = MruVObjectsServiceGrpc.getDeleteObjectMaterialMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getDeleteObjectMaterialMethod = MruVObjectsServiceGrpc.getDeleteObjectMaterialMethod) == null) {
          MruVObjectsServiceGrpc.getDeleteObjectMaterialMethod = getDeleteObjectMaterialMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.DeleteObjectMaterialRequest, mruv.objects.Objects.DeleteObjectMaterialResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteObjectMaterialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteObjectMaterialResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("DeleteObjectMaterial"))
              .build();
        }
      }
    }
    return getDeleteObjectMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.AddObjectMaterialTextRequest,
      mruv.objects.Objects.AddObjectMaterialTextResponse> getAddObjectMaterialTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddObjectMaterialText",
      requestType = mruv.objects.Objects.AddObjectMaterialTextRequest.class,
      responseType = mruv.objects.Objects.AddObjectMaterialTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.AddObjectMaterialTextRequest,
      mruv.objects.Objects.AddObjectMaterialTextResponse> getAddObjectMaterialTextMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.AddObjectMaterialTextRequest, mruv.objects.Objects.AddObjectMaterialTextResponse> getAddObjectMaterialTextMethod;
    if ((getAddObjectMaterialTextMethod = MruVObjectsServiceGrpc.getAddObjectMaterialTextMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getAddObjectMaterialTextMethod = MruVObjectsServiceGrpc.getAddObjectMaterialTextMethod) == null) {
          MruVObjectsServiceGrpc.getAddObjectMaterialTextMethod = getAddObjectMaterialTextMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.AddObjectMaterialTextRequest, mruv.objects.Objects.AddObjectMaterialTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddObjectMaterialText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.AddObjectMaterialTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.AddObjectMaterialTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("AddObjectMaterialText"))
              .build();
        }
      }
    }
    return getAddObjectMaterialTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectMaterialTextsRequest,
      mruv.objects.Objects.GetObjectMaterialTextsResponse> getGetObjectMaterialTextsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetObjectMaterialTexts",
      requestType = mruv.objects.Objects.GetObjectMaterialTextsRequest.class,
      responseType = mruv.objects.Objects.GetObjectMaterialTextsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectMaterialTextsRequest,
      mruv.objects.Objects.GetObjectMaterialTextsResponse> getGetObjectMaterialTextsMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.GetObjectMaterialTextsRequest, mruv.objects.Objects.GetObjectMaterialTextsResponse> getGetObjectMaterialTextsMethod;
    if ((getGetObjectMaterialTextsMethod = MruVObjectsServiceGrpc.getGetObjectMaterialTextsMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getGetObjectMaterialTextsMethod = MruVObjectsServiceGrpc.getGetObjectMaterialTextsMethod) == null) {
          MruVObjectsServiceGrpc.getGetObjectMaterialTextsMethod = getGetObjectMaterialTextsMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.GetObjectMaterialTextsRequest, mruv.objects.Objects.GetObjectMaterialTextsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetObjectMaterialTexts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetObjectMaterialTextsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetObjectMaterialTextsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("GetObjectMaterialTexts"))
              .build();
        }
      }
    }
    return getGetObjectMaterialTextsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectMaterialTextRequest,
      mruv.objects.Objects.DeleteObjectMaterialTextResponse> getDeleteObjectMaterialTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObjectMaterialText",
      requestType = mruv.objects.Objects.DeleteObjectMaterialTextRequest.class,
      responseType = mruv.objects.Objects.DeleteObjectMaterialTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectMaterialTextRequest,
      mruv.objects.Objects.DeleteObjectMaterialTextResponse> getDeleteObjectMaterialTextMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteObjectMaterialTextRequest, mruv.objects.Objects.DeleteObjectMaterialTextResponse> getDeleteObjectMaterialTextMethod;
    if ((getDeleteObjectMaterialTextMethod = MruVObjectsServiceGrpc.getDeleteObjectMaterialTextMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getDeleteObjectMaterialTextMethod = MruVObjectsServiceGrpc.getDeleteObjectMaterialTextMethod) == null) {
          MruVObjectsServiceGrpc.getDeleteObjectMaterialTextMethod = getDeleteObjectMaterialTextMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.DeleteObjectMaterialTextRequest, mruv.objects.Objects.DeleteObjectMaterialTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObjectMaterialText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteObjectMaterialTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteObjectMaterialTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("DeleteObjectMaterialText"))
              .build();
        }
      }
    }
    return getDeleteObjectMaterialTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.AddRemoveBuildingRequest,
      mruv.objects.Objects.AddRemoveBuildingResponse> getAddRemoveBuildingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddRemoveBuilding",
      requestType = mruv.objects.Objects.AddRemoveBuildingRequest.class,
      responseType = mruv.objects.Objects.AddRemoveBuildingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.AddRemoveBuildingRequest,
      mruv.objects.Objects.AddRemoveBuildingResponse> getAddRemoveBuildingMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.AddRemoveBuildingRequest, mruv.objects.Objects.AddRemoveBuildingResponse> getAddRemoveBuildingMethod;
    if ((getAddRemoveBuildingMethod = MruVObjectsServiceGrpc.getAddRemoveBuildingMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getAddRemoveBuildingMethod = MruVObjectsServiceGrpc.getAddRemoveBuildingMethod) == null) {
          MruVObjectsServiceGrpc.getAddRemoveBuildingMethod = getAddRemoveBuildingMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.AddRemoveBuildingRequest, mruv.objects.Objects.AddRemoveBuildingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddRemoveBuilding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.AddRemoveBuildingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.AddRemoveBuildingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("AddRemoveBuilding"))
              .build();
        }
      }
    }
    return getAddRemoveBuildingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.GetRemovedBuildingsRequest,
      mruv.objects.Objects.GetRemovedBuildingsResponse> getGetRemovedBuildingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRemovedBuildings",
      requestType = mruv.objects.Objects.GetRemovedBuildingsRequest.class,
      responseType = mruv.objects.Objects.GetRemovedBuildingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.GetRemovedBuildingsRequest,
      mruv.objects.Objects.GetRemovedBuildingsResponse> getGetRemovedBuildingsMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.GetRemovedBuildingsRequest, mruv.objects.Objects.GetRemovedBuildingsResponse> getGetRemovedBuildingsMethod;
    if ((getGetRemovedBuildingsMethod = MruVObjectsServiceGrpc.getGetRemovedBuildingsMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getGetRemovedBuildingsMethod = MruVObjectsServiceGrpc.getGetRemovedBuildingsMethod) == null) {
          MruVObjectsServiceGrpc.getGetRemovedBuildingsMethod = getGetRemovedBuildingsMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.GetRemovedBuildingsRequest, mruv.objects.Objects.GetRemovedBuildingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRemovedBuildings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetRemovedBuildingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.GetRemovedBuildingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("GetRemovedBuildings"))
              .build();
        }
      }
    }
    return getGetRemovedBuildingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteRemoveBuildingRequest,
      mruv.objects.Objects.DeleteRemoveBuildingResponse> getDeleteRemoveBuildingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRemoveBuilding",
      requestType = mruv.objects.Objects.DeleteRemoveBuildingRequest.class,
      responseType = mruv.objects.Objects.DeleteRemoveBuildingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteRemoveBuildingRequest,
      mruv.objects.Objects.DeleteRemoveBuildingResponse> getDeleteRemoveBuildingMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.DeleteRemoveBuildingRequest, mruv.objects.Objects.DeleteRemoveBuildingResponse> getDeleteRemoveBuildingMethod;
    if ((getDeleteRemoveBuildingMethod = MruVObjectsServiceGrpc.getDeleteRemoveBuildingMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getDeleteRemoveBuildingMethod = MruVObjectsServiceGrpc.getDeleteRemoveBuildingMethod) == null) {
          MruVObjectsServiceGrpc.getDeleteRemoveBuildingMethod = getDeleteRemoveBuildingMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.DeleteRemoveBuildingRequest, mruv.objects.Objects.DeleteRemoveBuildingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRemoveBuilding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteRemoveBuildingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.DeleteRemoveBuildingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("DeleteRemoveBuilding"))
              .build();
        }
      }
    }
    return getDeleteRemoveBuildingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.objects.Objects.FetchAllObjectsRequest,
      mruv.objects.Objects.FetchAllObjectsResponse> getFetchAllObjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FetchAllObjects",
      requestType = mruv.objects.Objects.FetchAllObjectsRequest.class,
      responseType = mruv.objects.Objects.FetchAllObjectsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<mruv.objects.Objects.FetchAllObjectsRequest,
      mruv.objects.Objects.FetchAllObjectsResponse> getFetchAllObjectsMethod() {
    io.grpc.MethodDescriptor<mruv.objects.Objects.FetchAllObjectsRequest, mruv.objects.Objects.FetchAllObjectsResponse> getFetchAllObjectsMethod;
    if ((getFetchAllObjectsMethod = MruVObjectsServiceGrpc.getFetchAllObjectsMethod) == null) {
      synchronized (MruVObjectsServiceGrpc.class) {
        if ((getFetchAllObjectsMethod = MruVObjectsServiceGrpc.getFetchAllObjectsMethod) == null) {
          MruVObjectsServiceGrpc.getFetchAllObjectsMethod = getFetchAllObjectsMethod =
              io.grpc.MethodDescriptor.<mruv.objects.Objects.FetchAllObjectsRequest, mruv.objects.Objects.FetchAllObjectsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FetchAllObjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.FetchAllObjectsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.objects.Objects.FetchAllObjectsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVObjectsServiceMethodDescriptorSupplier("FetchAllObjects"))
              .build();
        }
      }
    }
    return getFetchAllObjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVObjectsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVObjectsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVObjectsServiceStub>() {
        @java.lang.Override
        public MruVObjectsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVObjectsServiceStub(channel, callOptions);
        }
      };
    return MruVObjectsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVObjectsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVObjectsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVObjectsServiceBlockingStub>() {
        @java.lang.Override
        public MruVObjectsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVObjectsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVObjectsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVObjectsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVObjectsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVObjectsServiceFutureStub>() {
        @java.lang.Override
        public MruVObjectsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVObjectsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVObjectsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game objects.
   * </pre>
   */
  public static abstract class MruVObjectsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create an object.
     * </pre>
     */
    public void createObject(mruv.objects.Objects.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.CreateObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get an object.
     * </pre>
     */
    public void getObject(mruv.objects.Objects.GetObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an object.
     * </pre>
     */
    public void updateObject(mruv.objects.Objects.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.UpdateObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an object.
     * </pre>
     */
    public void deleteObject(mruv.objects.Objects.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a material to existing object.
     * </pre>
     */
    public void addObjectMaterial(mruv.objects.Objects.AddObjectMaterialRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.AddObjectMaterialResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddObjectMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all object materials.
     * </pre>
     */
    public void getObjectMaterials(mruv.objects.Objects.GetObjectMaterialsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectMaterialsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMaterialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a material assigned to an object.
     * </pre>
     */
    public void deleteObjectMaterial(mruv.objects.Objects.DeleteObjectMaterialRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectMaterialResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a material text to existing object.
     * </pre>
     */
    public void addObjectMaterialText(mruv.objects.Objects.AddObjectMaterialTextRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.AddObjectMaterialTextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddObjectMaterialTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all object material texts.
     * </pre>
     */
    public void getObjectMaterialTexts(mruv.objects.Objects.GetObjectMaterialTextsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectMaterialTextsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetObjectMaterialTextsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a material text assigned to an object.
     * </pre>
     */
    public void deleteObjectMaterialText(mruv.objects.Objects.DeleteObjectMaterialTextRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectMaterialTextResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteObjectMaterialTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a object from GTA SA map.
     * </pre>
     */
    public void addRemoveBuilding(mruv.objects.Objects.AddRemoveBuildingRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.AddRemoveBuildingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddRemoveBuildingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all removed objects.
     * </pre>
     */
    public void getRemovedBuildings(mruv.objects.Objects.GetRemovedBuildingsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetRemovedBuildingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRemovedBuildingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete removed buildings.
     * </pre>
     */
    public void deleteRemoveBuilding(mruv.objects.Objects.DeleteRemoveBuildingRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteRemoveBuildingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRemoveBuildingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch all existing objects.
     * </pre>
     */
    public void fetchAllObjects(mruv.objects.Objects.FetchAllObjectsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.FetchAllObjectsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchAllObjectsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.CreateObjectRequest,
                mruv.objects.Objects.CreateObjectResponse>(
                  this, METHODID_CREATE_OBJECT)))
          .addMethod(
            getGetObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.GetObjectRequest,
                mruv.objects.Objects.GetObjectResponse>(
                  this, METHODID_GET_OBJECT)))
          .addMethod(
            getUpdateObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.UpdateObjectRequest,
                mruv.objects.Objects.UpdateObjectResponse>(
                  this, METHODID_UPDATE_OBJECT)))
          .addMethod(
            getDeleteObjectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.DeleteObjectRequest,
                mruv.objects.Objects.DeleteObjectResponse>(
                  this, METHODID_DELETE_OBJECT)))
          .addMethod(
            getAddObjectMaterialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.AddObjectMaterialRequest,
                mruv.objects.Objects.AddObjectMaterialResponse>(
                  this, METHODID_ADD_OBJECT_MATERIAL)))
          .addMethod(
            getGetObjectMaterialsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.GetObjectMaterialsRequest,
                mruv.objects.Objects.GetObjectMaterialsResponse>(
                  this, METHODID_GET_OBJECT_MATERIALS)))
          .addMethod(
            getDeleteObjectMaterialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.DeleteObjectMaterialRequest,
                mruv.objects.Objects.DeleteObjectMaterialResponse>(
                  this, METHODID_DELETE_OBJECT_MATERIAL)))
          .addMethod(
            getAddObjectMaterialTextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.AddObjectMaterialTextRequest,
                mruv.objects.Objects.AddObjectMaterialTextResponse>(
                  this, METHODID_ADD_OBJECT_MATERIAL_TEXT)))
          .addMethod(
            getGetObjectMaterialTextsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.GetObjectMaterialTextsRequest,
                mruv.objects.Objects.GetObjectMaterialTextsResponse>(
                  this, METHODID_GET_OBJECT_MATERIAL_TEXTS)))
          .addMethod(
            getDeleteObjectMaterialTextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.DeleteObjectMaterialTextRequest,
                mruv.objects.Objects.DeleteObjectMaterialTextResponse>(
                  this, METHODID_DELETE_OBJECT_MATERIAL_TEXT)))
          .addMethod(
            getAddRemoveBuildingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.AddRemoveBuildingRequest,
                mruv.objects.Objects.AddRemoveBuildingResponse>(
                  this, METHODID_ADD_REMOVE_BUILDING)))
          .addMethod(
            getGetRemovedBuildingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.GetRemovedBuildingsRequest,
                mruv.objects.Objects.GetRemovedBuildingsResponse>(
                  this, METHODID_GET_REMOVED_BUILDINGS)))
          .addMethod(
            getDeleteRemoveBuildingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.objects.Objects.DeleteRemoveBuildingRequest,
                mruv.objects.Objects.DeleteRemoveBuildingResponse>(
                  this, METHODID_DELETE_REMOVE_BUILDING)))
          .addMethod(
            getFetchAllObjectsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                mruv.objects.Objects.FetchAllObjectsRequest,
                mruv.objects.Objects.FetchAllObjectsResponse>(
                  this, METHODID_FETCH_ALL_OBJECTS)))
          .build();
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game objects.
   * </pre>
   */
  public static final class MruVObjectsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVObjectsServiceStub> {
    private MruVObjectsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVObjectsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVObjectsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an object.
     * </pre>
     */
    public void createObject(mruv.objects.Objects.CreateObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.CreateObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get an object.
     * </pre>
     */
    public void getObject(mruv.objects.Objects.GetObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an object.
     * </pre>
     */
    public void updateObject(mruv.objects.Objects.UpdateObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.UpdateObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an object.
     * </pre>
     */
    public void deleteObject(mruv.objects.Objects.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a material to existing object.
     * </pre>
     */
    public void addObjectMaterial(mruv.objects.Objects.AddObjectMaterialRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.AddObjectMaterialResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddObjectMaterialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all object materials.
     * </pre>
     */
    public void getObjectMaterials(mruv.objects.Objects.GetObjectMaterialsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectMaterialsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMaterialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a material assigned to an object.
     * </pre>
     */
    public void deleteObjectMaterial(mruv.objects.Objects.DeleteObjectMaterialRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectMaterialResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMaterialMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a material text to existing object.
     * </pre>
     */
    public void addObjectMaterialText(mruv.objects.Objects.AddObjectMaterialTextRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.AddObjectMaterialTextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddObjectMaterialTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all object material texts.
     * </pre>
     */
    public void getObjectMaterialTexts(mruv.objects.Objects.GetObjectMaterialTextsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectMaterialTextsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetObjectMaterialTextsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a material text assigned to an object.
     * </pre>
     */
    public void deleteObjectMaterialText(mruv.objects.Objects.DeleteObjectMaterialTextRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectMaterialTextResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMaterialTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a object from GTA SA map.
     * </pre>
     */
    public void addRemoveBuilding(mruv.objects.Objects.AddRemoveBuildingRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.AddRemoveBuildingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddRemoveBuildingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all removed objects.
     * </pre>
     */
    public void getRemovedBuildings(mruv.objects.Objects.GetRemovedBuildingsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.GetRemovedBuildingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRemovedBuildingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete removed buildings.
     * </pre>
     */
    public void deleteRemoveBuilding(mruv.objects.Objects.DeleteRemoveBuildingRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteRemoveBuildingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRemoveBuildingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch all existing objects.
     * </pre>
     */
    public void fetchAllObjects(mruv.objects.Objects.FetchAllObjectsRequest request,
        io.grpc.stub.StreamObserver<mruv.objects.Objects.FetchAllObjectsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFetchAllObjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game objects.
   * </pre>
   */
  public static final class MruVObjectsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVObjectsServiceBlockingStub> {
    private MruVObjectsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVObjectsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVObjectsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an object.
     * </pre>
     */
    public mruv.objects.Objects.CreateObjectResponse createObject(mruv.objects.Objects.CreateObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get an object.
     * </pre>
     */
    public mruv.objects.Objects.GetObjectResponse getObject(mruv.objects.Objects.GetObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an object.
     * </pre>
     */
    public mruv.objects.Objects.UpdateObjectResponse updateObject(mruv.objects.Objects.UpdateObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an object.
     * </pre>
     */
    public mruv.objects.Objects.DeleteObjectResponse deleteObject(mruv.objects.Objects.DeleteObjectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a material to existing object.
     * </pre>
     */
    public mruv.objects.Objects.AddObjectMaterialResponse addObjectMaterial(mruv.objects.Objects.AddObjectMaterialRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddObjectMaterialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all object materials.
     * </pre>
     */
    public mruv.objects.Objects.GetObjectMaterialsResponse getObjectMaterials(mruv.objects.Objects.GetObjectMaterialsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMaterialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a material assigned to an object.
     * </pre>
     */
    public mruv.objects.Objects.DeleteObjectMaterialResponse deleteObjectMaterial(mruv.objects.Objects.DeleteObjectMaterialRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectMaterialMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a material text to existing object.
     * </pre>
     */
    public mruv.objects.Objects.AddObjectMaterialTextResponse addObjectMaterialText(mruv.objects.Objects.AddObjectMaterialTextRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddObjectMaterialTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all object material texts.
     * </pre>
     */
    public mruv.objects.Objects.GetObjectMaterialTextsResponse getObjectMaterialTexts(mruv.objects.Objects.GetObjectMaterialTextsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetObjectMaterialTextsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a material text assigned to an object.
     * </pre>
     */
    public mruv.objects.Objects.DeleteObjectMaterialTextResponse deleteObjectMaterialText(mruv.objects.Objects.DeleteObjectMaterialTextRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteObjectMaterialTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a object from GTA SA map.
     * </pre>
     */
    public mruv.objects.Objects.AddRemoveBuildingResponse addRemoveBuilding(mruv.objects.Objects.AddRemoveBuildingRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddRemoveBuildingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all removed objects.
     * </pre>
     */
    public mruv.objects.Objects.GetRemovedBuildingsResponse getRemovedBuildings(mruv.objects.Objects.GetRemovedBuildingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRemovedBuildingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete removed buildings.
     * </pre>
     */
    public mruv.objects.Objects.DeleteRemoveBuildingResponse deleteRemoveBuilding(mruv.objects.Objects.DeleteRemoveBuildingRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRemoveBuildingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch all existing objects.
     * </pre>
     */
    public java.util.Iterator<mruv.objects.Objects.FetchAllObjectsResponse> fetchAllObjects(
        mruv.objects.Objects.FetchAllObjectsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getFetchAllObjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *The MruV objects service provides procedures for game objects.
   * </pre>
   */
  public static final class MruVObjectsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVObjectsServiceFutureStub> {
    private MruVObjectsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVObjectsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVObjectsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.CreateObjectResponse> createObject(
        mruv.objects.Objects.CreateObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.GetObjectResponse> getObject(
        mruv.objects.Objects.GetObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.UpdateObjectResponse> updateObject(
        mruv.objects.Objects.UpdateObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.DeleteObjectResponse> deleteObject(
        mruv.objects.Objects.DeleteObjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a material to existing object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.AddObjectMaterialResponse> addObjectMaterial(
        mruv.objects.Objects.AddObjectMaterialRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddObjectMaterialMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all object materials.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.GetObjectMaterialsResponse> getObjectMaterials(
        mruv.objects.Objects.GetObjectMaterialsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMaterialsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a material assigned to an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.DeleteObjectMaterialResponse> deleteObjectMaterial(
        mruv.objects.Objects.DeleteObjectMaterialRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectMaterialMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a material text to existing object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.AddObjectMaterialTextResponse> addObjectMaterialText(
        mruv.objects.Objects.AddObjectMaterialTextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddObjectMaterialTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all object material texts.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.GetObjectMaterialTextsResponse> getObjectMaterialTexts(
        mruv.objects.Objects.GetObjectMaterialTextsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetObjectMaterialTextsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a material text assigned to an object.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.DeleteObjectMaterialTextResponse> deleteObjectMaterialText(
        mruv.objects.Objects.DeleteObjectMaterialTextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteObjectMaterialTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a object from GTA SA map.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.AddRemoveBuildingResponse> addRemoveBuilding(
        mruv.objects.Objects.AddRemoveBuildingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddRemoveBuildingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all removed objects.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.GetRemovedBuildingsResponse> getRemovedBuildings(
        mruv.objects.Objects.GetRemovedBuildingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRemovedBuildingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete removed buildings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.objects.Objects.DeleteRemoveBuildingResponse> deleteRemoveBuilding(
        mruv.objects.Objects.DeleteRemoveBuildingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRemoveBuildingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_OBJECT = 0;
  private static final int METHODID_GET_OBJECT = 1;
  private static final int METHODID_UPDATE_OBJECT = 2;
  private static final int METHODID_DELETE_OBJECT = 3;
  private static final int METHODID_ADD_OBJECT_MATERIAL = 4;
  private static final int METHODID_GET_OBJECT_MATERIALS = 5;
  private static final int METHODID_DELETE_OBJECT_MATERIAL = 6;
  private static final int METHODID_ADD_OBJECT_MATERIAL_TEXT = 7;
  private static final int METHODID_GET_OBJECT_MATERIAL_TEXTS = 8;
  private static final int METHODID_DELETE_OBJECT_MATERIAL_TEXT = 9;
  private static final int METHODID_ADD_REMOVE_BUILDING = 10;
  private static final int METHODID_GET_REMOVED_BUILDINGS = 11;
  private static final int METHODID_DELETE_REMOVE_BUILDING = 12;
  private static final int METHODID_FETCH_ALL_OBJECTS = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVObjectsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVObjectsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_OBJECT:
          serviceImpl.createObject((mruv.objects.Objects.CreateObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.CreateObjectResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT:
          serviceImpl.getObject((mruv.objects.Objects.GetObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectResponse>) responseObserver);
          break;
        case METHODID_UPDATE_OBJECT:
          serviceImpl.updateObject((mruv.objects.Objects.UpdateObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.UpdateObjectResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((mruv.objects.Objects.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_ADD_OBJECT_MATERIAL:
          serviceImpl.addObjectMaterial((mruv.objects.Objects.AddObjectMaterialRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.AddObjectMaterialResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_MATERIALS:
          serviceImpl.getObjectMaterials((mruv.objects.Objects.GetObjectMaterialsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectMaterialsResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_MATERIAL:
          serviceImpl.deleteObjectMaterial((mruv.objects.Objects.DeleteObjectMaterialRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectMaterialResponse>) responseObserver);
          break;
        case METHODID_ADD_OBJECT_MATERIAL_TEXT:
          serviceImpl.addObjectMaterialText((mruv.objects.Objects.AddObjectMaterialTextRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.AddObjectMaterialTextResponse>) responseObserver);
          break;
        case METHODID_GET_OBJECT_MATERIAL_TEXTS:
          serviceImpl.getObjectMaterialTexts((mruv.objects.Objects.GetObjectMaterialTextsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.GetObjectMaterialTextsResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT_MATERIAL_TEXT:
          serviceImpl.deleteObjectMaterialText((mruv.objects.Objects.DeleteObjectMaterialTextRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteObjectMaterialTextResponse>) responseObserver);
          break;
        case METHODID_ADD_REMOVE_BUILDING:
          serviceImpl.addRemoveBuilding((mruv.objects.Objects.AddRemoveBuildingRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.AddRemoveBuildingResponse>) responseObserver);
          break;
        case METHODID_GET_REMOVED_BUILDINGS:
          serviceImpl.getRemovedBuildings((mruv.objects.Objects.GetRemovedBuildingsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.GetRemovedBuildingsResponse>) responseObserver);
          break;
        case METHODID_DELETE_REMOVE_BUILDING:
          serviceImpl.deleteRemoveBuilding((mruv.objects.Objects.DeleteRemoveBuildingRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.DeleteRemoveBuildingResponse>) responseObserver);
          break;
        case METHODID_FETCH_ALL_OBJECTS:
          serviceImpl.fetchAllObjects((mruv.objects.Objects.FetchAllObjectsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.objects.Objects.FetchAllObjectsResponse>) responseObserver);
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

  private static abstract class MruVObjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVObjectsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.objects.Objects.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVObjectsService");
    }
  }

  private static final class MruVObjectsServiceFileDescriptorSupplier
      extends MruVObjectsServiceBaseDescriptorSupplier {
    MruVObjectsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVObjectsServiceMethodDescriptorSupplier
      extends MruVObjectsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVObjectsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVObjectsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVObjectsServiceFileDescriptorSupplier())
              .addMethod(getCreateObjectMethod())
              .addMethod(getGetObjectMethod())
              .addMethod(getUpdateObjectMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getAddObjectMaterialMethod())
              .addMethod(getGetObjectMaterialsMethod())
              .addMethod(getDeleteObjectMaterialMethod())
              .addMethod(getAddObjectMaterialTextMethod())
              .addMethod(getGetObjectMaterialTextsMethod())
              .addMethod(getDeleteObjectMaterialTextMethod())
              .addMethod(getAddRemoveBuildingMethod())
              .addMethod(getGetRemovedBuildingsMethod())
              .addMethod(getDeleteRemoveBuildingMethod())
              .addMethod(getFetchAllObjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
