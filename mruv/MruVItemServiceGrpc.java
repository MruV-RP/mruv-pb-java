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
 * <pre>
 * The MruV items service provides procedures for managing items and containers
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: items/items.proto")
public final class MruVItemServiceGrpc {

  private MruVItemServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.MruVItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.Item,
      mruv.ItemsModel.ItemID> getCreateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateItem",
      requestType = mruv.ItemsModel.Item.class,
      responseType = mruv.ItemsModel.ItemID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.Item,
      mruv.ItemsModel.ItemID> getCreateItemMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.Item, mruv.ItemsModel.ItemID> getCreateItemMethod;
    if ((getCreateItemMethod = MruVItemServiceGrpc.getCreateItemMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getCreateItemMethod = MruVItemServiceGrpc.getCreateItemMethod) == null) {
          MruVItemServiceGrpc.getCreateItemMethod = getCreateItemMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.Item, mruv.ItemsModel.ItemID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.Item.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("CreateItem"))
              .build();
        }
      }
    }
    return getCreateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ItemID,
      mruv.ItemsModel.Item> getGetItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItem",
      requestType = mruv.ItemsModel.ItemID.class,
      responseType = mruv.ItemsModel.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ItemID,
      mruv.ItemsModel.Item> getGetItemMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ItemID, mruv.ItemsModel.Item> getGetItemMethod;
    if ((getGetItemMethod = MruVItemServiceGrpc.getGetItemMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetItemMethod = MruVItemServiceGrpc.getGetItemMethod) == null) {
          MruVItemServiceGrpc.getGetItemMethod = getGetItemMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ItemID, mruv.ItemsModel.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.Item.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetItem"))
              .build();
        }
      }
    }
    return getGetItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ItemID,
      mruv.ItemsModel.ItemID> getDeleteItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteItem",
      requestType = mruv.ItemsModel.ItemID.class,
      responseType = mruv.ItemsModel.ItemID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ItemID,
      mruv.ItemsModel.ItemID> getDeleteItemMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ItemID, mruv.ItemsModel.ItemID> getDeleteItemMethod;
    if ((getDeleteItemMethod = MruVItemServiceGrpc.getDeleteItemMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getDeleteItemMethod = MruVItemServiceGrpc.getDeleteItemMethod) == null) {
          MruVItemServiceGrpc.getDeleteItemMethod = getDeleteItemMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ItemID, mruv.ItemsModel.ItemID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("DeleteItem"))
              .build();
        }
      }
    }
    return getDeleteItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.GetItemsRequest,
      mruv.Items.GetItemsResponse> getGetItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItems",
      requestType = mruv.Items.GetItemsRequest.class,
      responseType = mruv.Items.GetItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.GetItemsRequest,
      mruv.Items.GetItemsResponse> getGetItemsMethod() {
    io.grpc.MethodDescriptor<mruv.Items.GetItemsRequest, mruv.Items.GetItemsResponse> getGetItemsMethod;
    if ((getGetItemsMethod = MruVItemServiceGrpc.getGetItemsMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetItemsMethod = MruVItemServiceGrpc.getGetItemsMethod) == null) {
          MruVItemServiceGrpc.getGetItemsMethod = getGetItemsMethod =
              io.grpc.MethodDescriptor.<mruv.Items.GetItemsRequest, mruv.Items.GetItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetItems"))
              .build();
        }
      }
    }
    return getGetItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ItemType,
      mruv.ItemsModel.ItemTypeID> getCreateItemTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateItemType",
      requestType = mruv.ItemsModel.ItemType.class,
      responseType = mruv.ItemsModel.ItemTypeID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ItemType,
      mruv.ItemsModel.ItemTypeID> getCreateItemTypeMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ItemType, mruv.ItemsModel.ItemTypeID> getCreateItemTypeMethod;
    if ((getCreateItemTypeMethod = MruVItemServiceGrpc.getCreateItemTypeMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getCreateItemTypeMethod = MruVItemServiceGrpc.getCreateItemTypeMethod) == null) {
          MruVItemServiceGrpc.getCreateItemTypeMethod = getCreateItemTypeMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ItemType, mruv.ItemsModel.ItemTypeID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateItemType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemTypeID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("CreateItemType"))
              .build();
        }
      }
    }
    return getCreateItemTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ItemTypeID,
      mruv.ItemsModel.ItemType> getGetItemTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemType",
      requestType = mruv.ItemsModel.ItemTypeID.class,
      responseType = mruv.ItemsModel.ItemType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ItemTypeID,
      mruv.ItemsModel.ItemType> getGetItemTypeMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ItemTypeID, mruv.ItemsModel.ItemType> getGetItemTypeMethod;
    if ((getGetItemTypeMethod = MruVItemServiceGrpc.getGetItemTypeMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetItemTypeMethod = MruVItemServiceGrpc.getGetItemTypeMethod) == null) {
          MruVItemServiceGrpc.getGetItemTypeMethod = getGetItemTypeMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ItemTypeID, mruv.ItemsModel.ItemType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItemType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemTypeID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemType.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetItemType"))
              .build();
        }
      }
    }
    return getGetItemTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ItemTypeID,
      mruv.ItemsModel.ItemTypeID> getDeleteItemTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteItemType",
      requestType = mruv.ItemsModel.ItemTypeID.class,
      responseType = mruv.ItemsModel.ItemTypeID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ItemTypeID,
      mruv.ItemsModel.ItemTypeID> getDeleteItemTypeMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ItemTypeID, mruv.ItemsModel.ItemTypeID> getDeleteItemTypeMethod;
    if ((getDeleteItemTypeMethod = MruVItemServiceGrpc.getDeleteItemTypeMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getDeleteItemTypeMethod = MruVItemServiceGrpc.getDeleteItemTypeMethod) == null) {
          MruVItemServiceGrpc.getDeleteItemTypeMethod = getDeleteItemTypeMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ItemTypeID, mruv.ItemsModel.ItemTypeID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteItemType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemTypeID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ItemTypeID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("DeleteItemType"))
              .build();
        }
      }
    }
    return getDeleteItemTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.GetItemTypesRequest,
      mruv.Items.GetItemTypesResponse> getGetItemTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemTypes",
      requestType = mruv.Items.GetItemTypesRequest.class,
      responseType = mruv.Items.GetItemTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.GetItemTypesRequest,
      mruv.Items.GetItemTypesResponse> getGetItemTypesMethod() {
    io.grpc.MethodDescriptor<mruv.Items.GetItemTypesRequest, mruv.Items.GetItemTypesResponse> getGetItemTypesMethod;
    if ((getGetItemTypesMethod = MruVItemServiceGrpc.getGetItemTypesMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetItemTypesMethod = MruVItemServiceGrpc.getGetItemTypesMethod) == null) {
          MruVItemServiceGrpc.getGetItemTypesMethod = getGetItemTypesMethod =
              io.grpc.MethodDescriptor.<mruv.Items.GetItemTypesRequest, mruv.Items.GetItemTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItemTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetItemTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetItemTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetItemTypes"))
              .build();
        }
      }
    }
    return getGetItemTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.Container,
      mruv.ItemsModel.ContainerID> getCreateContainerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContainer",
      requestType = mruv.ItemsModel.Container.class,
      responseType = mruv.ItemsModel.ContainerID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.Container,
      mruv.ItemsModel.ContainerID> getCreateContainerMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.Container, mruv.ItemsModel.ContainerID> getCreateContainerMethod;
    if ((getCreateContainerMethod = MruVItemServiceGrpc.getCreateContainerMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getCreateContainerMethod = MruVItemServiceGrpc.getCreateContainerMethod) == null) {
          MruVItemServiceGrpc.getCreateContainerMethod = getCreateContainerMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.Container, mruv.ItemsModel.ContainerID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateContainer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.Container.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("CreateContainer"))
              .build();
        }
      }
    }
    return getCreateContainerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerID,
      mruv.ItemsModel.Container> getGetContainerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContainer",
      requestType = mruv.ItemsModel.ContainerID.class,
      responseType = mruv.ItemsModel.Container.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerID,
      mruv.ItemsModel.Container> getGetContainerMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerID, mruv.ItemsModel.Container> getGetContainerMethod;
    if ((getGetContainerMethod = MruVItemServiceGrpc.getGetContainerMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetContainerMethod = MruVItemServiceGrpc.getGetContainerMethod) == null) {
          MruVItemServiceGrpc.getGetContainerMethod = getGetContainerMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ContainerID, mruv.ItemsModel.Container>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContainer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.Container.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetContainer"))
              .build();
        }
      }
    }
    return getGetContainerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerID,
      mruv.ItemsModel.ContainerID> getDeleteContainerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContainer",
      requestType = mruv.ItemsModel.ContainerID.class,
      responseType = mruv.ItemsModel.ContainerID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerID,
      mruv.ItemsModel.ContainerID> getDeleteContainerMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerID, mruv.ItemsModel.ContainerID> getDeleteContainerMethod;
    if ((getDeleteContainerMethod = MruVItemServiceGrpc.getDeleteContainerMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getDeleteContainerMethod = MruVItemServiceGrpc.getDeleteContainerMethod) == null) {
          MruVItemServiceGrpc.getDeleteContainerMethod = getDeleteContainerMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ContainerID, mruv.ItemsModel.ContainerID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContainer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("DeleteContainer"))
              .build();
        }
      }
    }
    return getDeleteContainerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.GetContainersRequest,
      mruv.Items.GetContainersResponse> getGetContainersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContainers",
      requestType = mruv.Items.GetContainersRequest.class,
      responseType = mruv.Items.GetContainersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.GetContainersRequest,
      mruv.Items.GetContainersResponse> getGetContainersMethod() {
    io.grpc.MethodDescriptor<mruv.Items.GetContainersRequest, mruv.Items.GetContainersResponse> getGetContainersMethod;
    if ((getGetContainersMethod = MruVItemServiceGrpc.getGetContainersMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetContainersMethod = MruVItemServiceGrpc.getGetContainersMethod) == null) {
          MruVItemServiceGrpc.getGetContainersMethod = getGetContainersMethod =
              io.grpc.MethodDescriptor.<mruv.Items.GetContainersRequest, mruv.Items.GetContainersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContainers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetContainersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetContainersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetContainers"))
              .build();
        }
      }
    }
    return getGetContainersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerType,
      mruv.ItemsModel.ContainerTypeID> getCreateContainerTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateContainerType",
      requestType = mruv.ItemsModel.ContainerType.class,
      responseType = mruv.ItemsModel.ContainerTypeID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerType,
      mruv.ItemsModel.ContainerTypeID> getCreateContainerTypeMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerType, mruv.ItemsModel.ContainerTypeID> getCreateContainerTypeMethod;
    if ((getCreateContainerTypeMethod = MruVItemServiceGrpc.getCreateContainerTypeMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getCreateContainerTypeMethod = MruVItemServiceGrpc.getCreateContainerTypeMethod) == null) {
          MruVItemServiceGrpc.getCreateContainerTypeMethod = getCreateContainerTypeMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ContainerType, mruv.ItemsModel.ContainerTypeID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateContainerType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerTypeID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("CreateContainerType"))
              .build();
        }
      }
    }
    return getCreateContainerTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerTypeID,
      mruv.ItemsModel.ContainerType> getGetContainerTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContainerType",
      requestType = mruv.ItemsModel.ContainerTypeID.class,
      responseType = mruv.ItemsModel.ContainerType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerTypeID,
      mruv.ItemsModel.ContainerType> getGetContainerTypeMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerTypeID, mruv.ItemsModel.ContainerType> getGetContainerTypeMethod;
    if ((getGetContainerTypeMethod = MruVItemServiceGrpc.getGetContainerTypeMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetContainerTypeMethod = MruVItemServiceGrpc.getGetContainerTypeMethod) == null) {
          MruVItemServiceGrpc.getGetContainerTypeMethod = getGetContainerTypeMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ContainerTypeID, mruv.ItemsModel.ContainerType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContainerType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerTypeID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerType.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetContainerType"))
              .build();
        }
      }
    }
    return getGetContainerTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerTypeID,
      mruv.ItemsModel.ContainerTypeID> getDeleteContainerTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteContainerType",
      requestType = mruv.ItemsModel.ContainerTypeID.class,
      responseType = mruv.ItemsModel.ContainerTypeID.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerTypeID,
      mruv.ItemsModel.ContainerTypeID> getDeleteContainerTypeMethod() {
    io.grpc.MethodDescriptor<mruv.ItemsModel.ContainerTypeID, mruv.ItemsModel.ContainerTypeID> getDeleteContainerTypeMethod;
    if ((getDeleteContainerTypeMethod = MruVItemServiceGrpc.getDeleteContainerTypeMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getDeleteContainerTypeMethod = MruVItemServiceGrpc.getDeleteContainerTypeMethod) == null) {
          MruVItemServiceGrpc.getDeleteContainerTypeMethod = getDeleteContainerTypeMethod =
              io.grpc.MethodDescriptor.<mruv.ItemsModel.ContainerTypeID, mruv.ItemsModel.ContainerTypeID>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteContainerType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerTypeID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.ContainerTypeID.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("DeleteContainerType"))
              .build();
        }
      }
    }
    return getDeleteContainerTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.GetContainerTypesRequest,
      mruv.Items.GetContainerTypesResponse> getGetContainerTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContainerTypes",
      requestType = mruv.Items.GetContainerTypesRequest.class,
      responseType = mruv.Items.GetContainerTypesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.GetContainerTypesRequest,
      mruv.Items.GetContainerTypesResponse> getGetContainerTypesMethod() {
    io.grpc.MethodDescriptor<mruv.Items.GetContainerTypesRequest, mruv.Items.GetContainerTypesResponse> getGetContainerTypesMethod;
    if ((getGetContainerTypesMethod = MruVItemServiceGrpc.getGetContainerTypesMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetContainerTypesMethod = MruVItemServiceGrpc.getGetContainerTypesMethod) == null) {
          MruVItemServiceGrpc.getGetContainerTypesMethod = getGetContainerTypesMethod =
              io.grpc.MethodDescriptor.<mruv.Items.GetContainerTypesRequest, mruv.Items.GetContainerTypesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContainerTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetContainerTypesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetContainerTypesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetContainerTypes"))
              .build();
        }
      }
    }
    return getGetContainerTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.GetContainerItemsRequest,
      mruv.Items.GetContainerItemsResponse> getGetContainerItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContainerItems",
      requestType = mruv.Items.GetContainerItemsRequest.class,
      responseType = mruv.Items.GetContainerItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.GetContainerItemsRequest,
      mruv.Items.GetContainerItemsResponse> getGetContainerItemsMethod() {
    io.grpc.MethodDescriptor<mruv.Items.GetContainerItemsRequest, mruv.Items.GetContainerItemsResponse> getGetContainerItemsMethod;
    if ((getGetContainerItemsMethod = MruVItemServiceGrpc.getGetContainerItemsMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetContainerItemsMethod = MruVItemServiceGrpc.getGetContainerItemsMethod) == null) {
          MruVItemServiceGrpc.getGetContainerItemsMethod = getGetContainerItemsMethod =
              io.grpc.MethodDescriptor.<mruv.Items.GetContainerItemsRequest, mruv.Items.GetContainerItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContainerItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetContainerItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetContainerItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetContainerItems"))
              .build();
        }
      }
    }
    return getGetContainerItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.PullItemRequest,
      mruv.ItemsModel.Item> getPullItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PullItem",
      requestType = mruv.Items.PullItemRequest.class,
      responseType = mruv.ItemsModel.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.PullItemRequest,
      mruv.ItemsModel.Item> getPullItemMethod() {
    io.grpc.MethodDescriptor<mruv.Items.PullItemRequest, mruv.ItemsModel.Item> getPullItemMethod;
    if ((getPullItemMethod = MruVItemServiceGrpc.getPullItemMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getPullItemMethod = MruVItemServiceGrpc.getPullItemMethod) == null) {
          MruVItemServiceGrpc.getPullItemMethod = getPullItemMethod =
              io.grpc.MethodDescriptor.<mruv.Items.PullItemRequest, mruv.ItemsModel.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PullItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.PullItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.ItemsModel.Item.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("PullItem"))
              .build();
        }
      }
    }
    return getPullItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.PutItemRequest,
      mruv.Items.PutItemResponse> getPutItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutItem",
      requestType = mruv.Items.PutItemRequest.class,
      responseType = mruv.Items.PutItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.PutItemRequest,
      mruv.Items.PutItemResponse> getPutItemMethod() {
    io.grpc.MethodDescriptor<mruv.Items.PutItemRequest, mruv.Items.PutItemResponse> getPutItemMethod;
    if ((getPutItemMethod = MruVItemServiceGrpc.getPutItemMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getPutItemMethod = MruVItemServiceGrpc.getPutItemMethod) == null) {
          MruVItemServiceGrpc.getPutItemMethod = getPutItemMethod =
              io.grpc.MethodDescriptor.<mruv.Items.PutItemRequest, mruv.Items.PutItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.PutItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.PutItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("PutItem"))
              .build();
        }
      }
    }
    return getPutItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.SortItemsRequest,
      mruv.Items.SortItemsResponse> getSortItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SortItems",
      requestType = mruv.Items.SortItemsRequest.class,
      responseType = mruv.Items.SortItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.SortItemsRequest,
      mruv.Items.SortItemsResponse> getSortItemsMethod() {
    io.grpc.MethodDescriptor<mruv.Items.SortItemsRequest, mruv.Items.SortItemsResponse> getSortItemsMethod;
    if ((getSortItemsMethod = MruVItemServiceGrpc.getSortItemsMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getSortItemsMethod = MruVItemServiceGrpc.getSortItemsMethod) == null) {
          MruVItemServiceGrpc.getSortItemsMethod = getSortItemsMethod =
              io.grpc.MethodDescriptor.<mruv.Items.SortItemsRequest, mruv.Items.SortItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SortItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.SortItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.SortItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("SortItems"))
              .build();
        }
      }
    }
    return getSortItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.GetNearestItemsRequest,
      mruv.Items.GetNearestItemsResponse> getGetNearestItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNearestItems",
      requestType = mruv.Items.GetNearestItemsRequest.class,
      responseType = mruv.Items.GetNearestItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.GetNearestItemsRequest,
      mruv.Items.GetNearestItemsResponse> getGetNearestItemsMethod() {
    io.grpc.MethodDescriptor<mruv.Items.GetNearestItemsRequest, mruv.Items.GetNearestItemsResponse> getGetNearestItemsMethod;
    if ((getGetNearestItemsMethod = MruVItemServiceGrpc.getGetNearestItemsMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetNearestItemsMethod = MruVItemServiceGrpc.getGetNearestItemsMethod) == null) {
          MruVItemServiceGrpc.getGetNearestItemsMethod = getGetNearestItemsMethod =
              io.grpc.MethodDescriptor.<mruv.Items.GetNearestItemsRequest, mruv.Items.GetNearestItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNearestItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetNearestItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.GetNearestItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetNearestItems"))
              .build();
        }
      }
    }
    return getGetNearestItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.Items.UseItemRequest,
      mruv.Items.UseItemResponse> getUseItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UseItem",
      requestType = mruv.Items.UseItemRequest.class,
      responseType = mruv.Items.UseItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.Items.UseItemRequest,
      mruv.Items.UseItemResponse> getUseItemMethod() {
    io.grpc.MethodDescriptor<mruv.Items.UseItemRequest, mruv.Items.UseItemResponse> getUseItemMethod;
    if ((getUseItemMethod = MruVItemServiceGrpc.getUseItemMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getUseItemMethod = MruVItemServiceGrpc.getUseItemMethod) == null) {
          MruVItemServiceGrpc.getUseItemMethod = getUseItemMethod =
              io.grpc.MethodDescriptor.<mruv.Items.UseItemRequest, mruv.Items.UseItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UseItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.UseItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Items.UseItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("UseItem"))
              .build();
        }
      }
    }
    return getUseItemMethod;
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
    if ((getGetServiceStatusMethod = MruVItemServiceGrpc.getGetServiceStatusMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetServiceStatusMethod = MruVItemServiceGrpc.getGetServiceStatusMethod) == null) {
          MruVItemServiceGrpc.getGetServiceStatusMethod = getGetServiceStatusMethod =
              io.grpc.MethodDescriptor.<mruv.Health.ServiceStatusRequest, mruv.Health.ServiceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.ServiceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.ServiceStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetServiceStatus"))
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
    if ((getGetServiceVersionMethod = MruVItemServiceGrpc.getGetServiceVersionMethod) == null) {
      synchronized (MruVItemServiceGrpc.class) {
        if ((getGetServiceVersionMethod = MruVItemServiceGrpc.getGetServiceVersionMethod) == null) {
          MruVItemServiceGrpc.getGetServiceVersionMethod = getGetServiceVersionMethod =
              io.grpc.MethodDescriptor.<mruv.Health.VersionRequest, mruv.Health.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.VersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.Health.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVItemServiceMethodDescriptorSupplier("GetServiceVersion"))
              .build();
        }
      }
    }
    return getGetServiceVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVItemServiceStub>() {
        @java.lang.Override
        public MruVItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVItemServiceStub(channel, callOptions);
        }
      };
    return MruVItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVItemServiceBlockingStub>() {
        @java.lang.Override
        public MruVItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVItemServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVItemServiceFutureStub>() {
        @java.lang.Override
        public MruVItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVItemServiceFutureStub(channel, callOptions);
        }
      };
    return MruVItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV items service provides procedures for managing items and containers
   * </pre>
   */
  public static abstract class MruVItemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create new item.
     * </pre>
     */
    public void createItem(mruv.ItemsModel.Item request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemID> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get item by id.
     * </pre>
     */
    public void getItem(mruv.ItemsModel.ItemID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete item by id.
     * </pre>
     */
    public void deleteItem(mruv.ItemsModel.ItemID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemID> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all items.
     * </pre>
     */
    public void getItems(mruv.Items.GetItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create item type.
     * </pre>
     */
    public void createItemType(mruv.ItemsModel.ItemType request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemTypeID> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateItemTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get item type by id.
     * </pre>
     */
    public void getItemType(mruv.ItemsModel.ItemTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete item type by id.
     * </pre>
     */
    public void deleteItemType(mruv.ItemsModel.ItemTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemTypeID> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteItemTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets all item types.
     * </pre>
     */
    public void getItemTypes(mruv.Items.GetItemTypesRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetItemTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create container.
     * </pre>
     */
    public void createContainer(mruv.ItemsModel.Container request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerID> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateContainerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get container by id.
     * </pre>
     */
    public void getContainer(mruv.ItemsModel.ContainerID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.Container> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContainerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete container by id.
     * </pre>
     */
    public void deleteContainer(mruv.ItemsModel.ContainerID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerID> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteContainerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all containers.
     * </pre>
     */
    public void getContainers(mruv.Items.GetContainersRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetContainersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContainersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a container type.
     * </pre>
     */
    public void createContainerType(mruv.ItemsModel.ContainerType request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerTypeID> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateContainerTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a container type by id.
     * </pre>
     */
    public void getContainerType(mruv.ItemsModel.ContainerTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContainerTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a container type by id.
     * </pre>
     */
    public void deleteContainerType(mruv.ItemsModel.ContainerTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerTypeID> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteContainerTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all container types.
     * </pre>
     */
    public void getContainerTypes(mruv.Items.GetContainerTypesRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetContainerTypesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContainerTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get items inside a container.
     * </pre>
     */
    public void getContainerItems(mruv.Items.GetContainerItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetContainerItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContainerItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pull an item from container.
     * </pre>
     */
    public void pullItem(mruv.Items.PullItemRequest request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.Item> responseObserver) {
      asyncUnimplementedUnaryCall(getPullItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Put an item into container.
     * </pre>
     */
    public void putItem(mruv.Items.PutItemRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.PutItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sort items inside container.
     * This procedure change order of items inside container.
     * </pre>
     */
    public void sortItems(mruv.Items.SortItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.SortItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSortItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves from the container the list of items nearest to the given position.
     * </pre>
     */
    public void getNearestItems(mruv.Items.GetNearestItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetNearestItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNearestItemsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Trigger action associated with the item usage.
     * </pre>
     */
    public void useItem(mruv.Items.UseItemRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.UseItemResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUseItemMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get service health status.
     * </pre>
     */
    public void getServiceStatus(mruv.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.ServiceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get service current version.
     * </pre>
     */
    public void getServiceVersion(mruv.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.VersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceVersionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.Item,
                mruv.ItemsModel.ItemID>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getGetItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ItemID,
                mruv.ItemsModel.Item>(
                  this, METHODID_GET_ITEM)))
          .addMethod(
            getDeleteItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ItemID,
                mruv.ItemsModel.ItemID>(
                  this, METHODID_DELETE_ITEM)))
          .addMethod(
            getGetItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.GetItemsRequest,
                mruv.Items.GetItemsResponse>(
                  this, METHODID_GET_ITEMS)))
          .addMethod(
            getCreateItemTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ItemType,
                mruv.ItemsModel.ItemTypeID>(
                  this, METHODID_CREATE_ITEM_TYPE)))
          .addMethod(
            getGetItemTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ItemTypeID,
                mruv.ItemsModel.ItemType>(
                  this, METHODID_GET_ITEM_TYPE)))
          .addMethod(
            getDeleteItemTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ItemTypeID,
                mruv.ItemsModel.ItemTypeID>(
                  this, METHODID_DELETE_ITEM_TYPE)))
          .addMethod(
            getGetItemTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.GetItemTypesRequest,
                mruv.Items.GetItemTypesResponse>(
                  this, METHODID_GET_ITEM_TYPES)))
          .addMethod(
            getCreateContainerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.Container,
                mruv.ItemsModel.ContainerID>(
                  this, METHODID_CREATE_CONTAINER)))
          .addMethod(
            getGetContainerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ContainerID,
                mruv.ItemsModel.Container>(
                  this, METHODID_GET_CONTAINER)))
          .addMethod(
            getDeleteContainerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ContainerID,
                mruv.ItemsModel.ContainerID>(
                  this, METHODID_DELETE_CONTAINER)))
          .addMethod(
            getGetContainersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.GetContainersRequest,
                mruv.Items.GetContainersResponse>(
                  this, METHODID_GET_CONTAINERS)))
          .addMethod(
            getCreateContainerTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ContainerType,
                mruv.ItemsModel.ContainerTypeID>(
                  this, METHODID_CREATE_CONTAINER_TYPE)))
          .addMethod(
            getGetContainerTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ContainerTypeID,
                mruv.ItemsModel.ContainerType>(
                  this, METHODID_GET_CONTAINER_TYPE)))
          .addMethod(
            getDeleteContainerTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.ItemsModel.ContainerTypeID,
                mruv.ItemsModel.ContainerTypeID>(
                  this, METHODID_DELETE_CONTAINER_TYPE)))
          .addMethod(
            getGetContainerTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.GetContainerTypesRequest,
                mruv.Items.GetContainerTypesResponse>(
                  this, METHODID_GET_CONTAINER_TYPES)))
          .addMethod(
            getGetContainerItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.GetContainerItemsRequest,
                mruv.Items.GetContainerItemsResponse>(
                  this, METHODID_GET_CONTAINER_ITEMS)))
          .addMethod(
            getPullItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.PullItemRequest,
                mruv.ItemsModel.Item>(
                  this, METHODID_PULL_ITEM)))
          .addMethod(
            getPutItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.PutItemRequest,
                mruv.Items.PutItemResponse>(
                  this, METHODID_PUT_ITEM)))
          .addMethod(
            getSortItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.SortItemsRequest,
                mruv.Items.SortItemsResponse>(
                  this, METHODID_SORT_ITEMS)))
          .addMethod(
            getGetNearestItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.GetNearestItemsRequest,
                mruv.Items.GetNearestItemsResponse>(
                  this, METHODID_GET_NEAREST_ITEMS)))
          .addMethod(
            getUseItemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.Items.UseItemRequest,
                mruv.Items.UseItemResponse>(
                  this, METHODID_USE_ITEM)))
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
   * <pre>
   * The MruV items service provides procedures for managing items and containers
   * </pre>
   */
  public static final class MruVItemServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVItemServiceStub> {
    private MruVItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new item.
     * </pre>
     */
    public void createItem(mruv.ItemsModel.Item request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get item by id.
     * </pre>
     */
    public void getItem(mruv.ItemsModel.ItemID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.Item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete item by id.
     * </pre>
     */
    public void deleteItem(mruv.ItemsModel.ItemID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all items.
     * </pre>
     */
    public void getItems(mruv.Items.GetItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create item type.
     * </pre>
     */
    public void createItemType(mruv.ItemsModel.ItemType request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemTypeID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateItemTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get item type by id.
     * </pre>
     */
    public void getItemType(mruv.ItemsModel.ItemTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete item type by id.
     * </pre>
     */
    public void deleteItemType(mruv.ItemsModel.ItemTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemTypeID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteItemTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets all item types.
     * </pre>
     */
    public void getItemTypes(mruv.Items.GetItemTypesRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetItemTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create container.
     * </pre>
     */
    public void createContainer(mruv.ItemsModel.Container request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateContainerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get container by id.
     * </pre>
     */
    public void getContainer(mruv.ItemsModel.ContainerID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.Container> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContainerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete container by id.
     * </pre>
     */
    public void deleteContainer(mruv.ItemsModel.ContainerID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteContainerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all containers.
     * </pre>
     */
    public void getContainers(mruv.Items.GetContainersRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetContainersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContainersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a container type.
     * </pre>
     */
    public void createContainerType(mruv.ItemsModel.ContainerType request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerTypeID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateContainerTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a container type by id.
     * </pre>
     */
    public void getContainerType(mruv.ItemsModel.ContainerTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContainerTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a container type by id.
     * </pre>
     */
    public void deleteContainerType(mruv.ItemsModel.ContainerTypeID request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerTypeID> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteContainerTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all container types.
     * </pre>
     */
    public void getContainerTypes(mruv.Items.GetContainerTypesRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetContainerTypesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContainerTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get items inside a container.
     * </pre>
     */
    public void getContainerItems(mruv.Items.GetContainerItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetContainerItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContainerItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pull an item from container.
     * </pre>
     */
    public void pullItem(mruv.Items.PullItemRequest request,
        io.grpc.stub.StreamObserver<mruv.ItemsModel.Item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPullItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Put an item into container.
     * </pre>
     */
    public void putItem(mruv.Items.PutItemRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.PutItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sort items inside container.
     * This procedure change order of items inside container.
     * </pre>
     */
    public void sortItems(mruv.Items.SortItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.SortItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSortItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves from the container the list of items nearest to the given position.
     * </pre>
     */
    public void getNearestItems(mruv.Items.GetNearestItemsRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.GetNearestItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNearestItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Trigger action associated with the item usage.
     * </pre>
     */
    public void useItem(mruv.Items.UseItemRequest request,
        io.grpc.stub.StreamObserver<mruv.Items.UseItemResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUseItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get service health status.
     * </pre>
     */
    public void getServiceStatus(mruv.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.ServiceStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get service current version.
     * </pre>
     */
    public void getServiceVersion(mruv.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.Health.VersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV items service provides procedures for managing items and containers
   * </pre>
   */
  public static final class MruVItemServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVItemServiceBlockingStub> {
    private MruVItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new item.
     * </pre>
     */
    public mruv.ItemsModel.ItemID createItem(mruv.ItemsModel.Item request) {
      return blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get item by id.
     * </pre>
     */
    public mruv.ItemsModel.Item getItem(mruv.ItemsModel.ItemID request) {
      return blockingUnaryCall(
          getChannel(), getGetItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete item by id.
     * </pre>
     */
    public mruv.ItemsModel.ItemID deleteItem(mruv.ItemsModel.ItemID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all items.
     * </pre>
     */
    public mruv.Items.GetItemsResponse getItems(mruv.Items.GetItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create item type.
     * </pre>
     */
    public mruv.ItemsModel.ItemTypeID createItemType(mruv.ItemsModel.ItemType request) {
      return blockingUnaryCall(
          getChannel(), getCreateItemTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get item type by id.
     * </pre>
     */
    public mruv.ItemsModel.ItemType getItemType(mruv.ItemsModel.ItemTypeID request) {
      return blockingUnaryCall(
          getChannel(), getGetItemTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete item type by id.
     * </pre>
     */
    public mruv.ItemsModel.ItemTypeID deleteItemType(mruv.ItemsModel.ItemTypeID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteItemTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets all item types.
     * </pre>
     */
    public mruv.Items.GetItemTypesResponse getItemTypes(mruv.Items.GetItemTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetItemTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create container.
     * </pre>
     */
    public mruv.ItemsModel.ContainerID createContainer(mruv.ItemsModel.Container request) {
      return blockingUnaryCall(
          getChannel(), getCreateContainerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get container by id.
     * </pre>
     */
    public mruv.ItemsModel.Container getContainer(mruv.ItemsModel.ContainerID request) {
      return blockingUnaryCall(
          getChannel(), getGetContainerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete container by id.
     * </pre>
     */
    public mruv.ItemsModel.ContainerID deleteContainer(mruv.ItemsModel.ContainerID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteContainerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all containers.
     * </pre>
     */
    public mruv.Items.GetContainersResponse getContainers(mruv.Items.GetContainersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContainersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a container type.
     * </pre>
     */
    public mruv.ItemsModel.ContainerTypeID createContainerType(mruv.ItemsModel.ContainerType request) {
      return blockingUnaryCall(
          getChannel(), getCreateContainerTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a container type by id.
     * </pre>
     */
    public mruv.ItemsModel.ContainerType getContainerType(mruv.ItemsModel.ContainerTypeID request) {
      return blockingUnaryCall(
          getChannel(), getGetContainerTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a container type by id.
     * </pre>
     */
    public mruv.ItemsModel.ContainerTypeID deleteContainerType(mruv.ItemsModel.ContainerTypeID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteContainerTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all container types.
     * </pre>
     */
    public mruv.Items.GetContainerTypesResponse getContainerTypes(mruv.Items.GetContainerTypesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContainerTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get items inside a container.
     * </pre>
     */
    public mruv.Items.GetContainerItemsResponse getContainerItems(mruv.Items.GetContainerItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetContainerItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pull an item from container.
     * </pre>
     */
    public mruv.ItemsModel.Item pullItem(mruv.Items.PullItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getPullItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Put an item into container.
     * </pre>
     */
    public mruv.Items.PutItemResponse putItem(mruv.Items.PutItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sort items inside container.
     * This procedure change order of items inside container.
     * </pre>
     */
    public mruv.Items.SortItemsResponse sortItems(mruv.Items.SortItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSortItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves from the container the list of items nearest to the given position.
     * </pre>
     */
    public mruv.Items.GetNearestItemsResponse getNearestItems(mruv.Items.GetNearestItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNearestItemsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Trigger action associated with the item usage.
     * </pre>
     */
    public mruv.Items.UseItemResponse useItem(mruv.Items.UseItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getUseItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get service health status.
     * </pre>
     */
    public mruv.Health.ServiceStatusResponse getServiceStatus(mruv.Health.ServiceStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get service current version.
     * </pre>
     */
    public mruv.Health.VersionResponse getServiceVersion(mruv.Health.VersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV items service provides procedures for managing items and containers
   * </pre>
   */
  public static final class MruVItemServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVItemServiceFutureStub> {
    private MruVItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create new item.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ItemID> createItem(
        mruv.ItemsModel.Item request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get item by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.Item> getItem(
        mruv.ItemsModel.ItemID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete item by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ItemID> deleteItem(
        mruv.ItemsModel.ItemID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all items.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.GetItemsResponse> getItems(
        mruv.Items.GetItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create item type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ItemTypeID> createItemType(
        mruv.ItemsModel.ItemType request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateItemTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get item type by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ItemType> getItemType(
        mruv.ItemsModel.ItemTypeID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete item type by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ItemTypeID> deleteItemType(
        mruv.ItemsModel.ItemTypeID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteItemTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets all item types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.GetItemTypesResponse> getItemTypes(
        mruv.Items.GetItemTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ContainerID> createContainer(
        mruv.ItemsModel.Container request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateContainerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get container by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.Container> getContainer(
        mruv.ItemsModel.ContainerID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContainerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete container by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ContainerID> deleteContainer(
        mruv.ItemsModel.ContainerID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteContainerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all containers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.GetContainersResponse> getContainers(
        mruv.Items.GetContainersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContainersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a container type.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ContainerTypeID> createContainerType(
        mruv.ItemsModel.ContainerType request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateContainerTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a container type by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ContainerType> getContainerType(
        mruv.ItemsModel.ContainerTypeID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContainerTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a container type by id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.ContainerTypeID> deleteContainerType(
        mruv.ItemsModel.ContainerTypeID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteContainerTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all container types.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.GetContainerTypesResponse> getContainerTypes(
        mruv.Items.GetContainerTypesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContainerTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get items inside a container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.GetContainerItemsResponse> getContainerItems(
        mruv.Items.GetContainerItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContainerItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pull an item from container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.ItemsModel.Item> pullItem(
        mruv.Items.PullItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPullItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Put an item into container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.PutItemResponse> putItem(
        mruv.Items.PutItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sort items inside container.
     * This procedure change order of items inside container.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.SortItemsResponse> sortItems(
        mruv.Items.SortItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSortItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves from the container the list of items nearest to the given position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.GetNearestItemsResponse> getNearestItems(
        mruv.Items.GetNearestItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNearestItemsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Trigger action associated with the item usage.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Items.UseItemResponse> useItem(
        mruv.Items.UseItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUseItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get service health status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Health.ServiceStatusResponse> getServiceStatus(
        mruv.Health.ServiceStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get service current version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.Health.VersionResponse> getServiceVersion(
        mruv.Health.VersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ITEM = 0;
  private static final int METHODID_GET_ITEM = 1;
  private static final int METHODID_DELETE_ITEM = 2;
  private static final int METHODID_GET_ITEMS = 3;
  private static final int METHODID_CREATE_ITEM_TYPE = 4;
  private static final int METHODID_GET_ITEM_TYPE = 5;
  private static final int METHODID_DELETE_ITEM_TYPE = 6;
  private static final int METHODID_GET_ITEM_TYPES = 7;
  private static final int METHODID_CREATE_CONTAINER = 8;
  private static final int METHODID_GET_CONTAINER = 9;
  private static final int METHODID_DELETE_CONTAINER = 10;
  private static final int METHODID_GET_CONTAINERS = 11;
  private static final int METHODID_CREATE_CONTAINER_TYPE = 12;
  private static final int METHODID_GET_CONTAINER_TYPE = 13;
  private static final int METHODID_DELETE_CONTAINER_TYPE = 14;
  private static final int METHODID_GET_CONTAINER_TYPES = 15;
  private static final int METHODID_GET_CONTAINER_ITEMS = 16;
  private static final int METHODID_PULL_ITEM = 17;
  private static final int METHODID_PUT_ITEM = 18;
  private static final int METHODID_SORT_ITEMS = 19;
  private static final int METHODID_GET_NEAREST_ITEMS = 20;
  private static final int METHODID_USE_ITEM = 21;
  private static final int METHODID_GET_SERVICE_STATUS = 22;
  private static final int METHODID_GET_SERVICE_VERSION = 23;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((mruv.ItemsModel.Item) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemID>) responseObserver);
          break;
        case METHODID_GET_ITEM:
          serviceImpl.getItem((mruv.ItemsModel.ItemID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.Item>) responseObserver);
          break;
        case METHODID_DELETE_ITEM:
          serviceImpl.deleteItem((mruv.ItemsModel.ItemID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemID>) responseObserver);
          break;
        case METHODID_GET_ITEMS:
          serviceImpl.getItems((mruv.Items.GetItemsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.GetItemsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ITEM_TYPE:
          serviceImpl.createItemType((mruv.ItemsModel.ItemType) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemTypeID>) responseObserver);
          break;
        case METHODID_GET_ITEM_TYPE:
          serviceImpl.getItemType((mruv.ItemsModel.ItemTypeID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemType>) responseObserver);
          break;
        case METHODID_DELETE_ITEM_TYPE:
          serviceImpl.deleteItemType((mruv.ItemsModel.ItemTypeID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ItemTypeID>) responseObserver);
          break;
        case METHODID_GET_ITEM_TYPES:
          serviceImpl.getItemTypes((mruv.Items.GetItemTypesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.GetItemTypesResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONTAINER:
          serviceImpl.createContainer((mruv.ItemsModel.Container) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerID>) responseObserver);
          break;
        case METHODID_GET_CONTAINER:
          serviceImpl.getContainer((mruv.ItemsModel.ContainerID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.Container>) responseObserver);
          break;
        case METHODID_DELETE_CONTAINER:
          serviceImpl.deleteContainer((mruv.ItemsModel.ContainerID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerID>) responseObserver);
          break;
        case METHODID_GET_CONTAINERS:
          serviceImpl.getContainers((mruv.Items.GetContainersRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.GetContainersResponse>) responseObserver);
          break;
        case METHODID_CREATE_CONTAINER_TYPE:
          serviceImpl.createContainerType((mruv.ItemsModel.ContainerType) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerTypeID>) responseObserver);
          break;
        case METHODID_GET_CONTAINER_TYPE:
          serviceImpl.getContainerType((mruv.ItemsModel.ContainerTypeID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerType>) responseObserver);
          break;
        case METHODID_DELETE_CONTAINER_TYPE:
          serviceImpl.deleteContainerType((mruv.ItemsModel.ContainerTypeID) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.ContainerTypeID>) responseObserver);
          break;
        case METHODID_GET_CONTAINER_TYPES:
          serviceImpl.getContainerTypes((mruv.Items.GetContainerTypesRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.GetContainerTypesResponse>) responseObserver);
          break;
        case METHODID_GET_CONTAINER_ITEMS:
          serviceImpl.getContainerItems((mruv.Items.GetContainerItemsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.GetContainerItemsResponse>) responseObserver);
          break;
        case METHODID_PULL_ITEM:
          serviceImpl.pullItem((mruv.Items.PullItemRequest) request,
              (io.grpc.stub.StreamObserver<mruv.ItemsModel.Item>) responseObserver);
          break;
        case METHODID_PUT_ITEM:
          serviceImpl.putItem((mruv.Items.PutItemRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.PutItemResponse>) responseObserver);
          break;
        case METHODID_SORT_ITEMS:
          serviceImpl.sortItems((mruv.Items.SortItemsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.SortItemsResponse>) responseObserver);
          break;
        case METHODID_GET_NEAREST_ITEMS:
          serviceImpl.getNearestItems((mruv.Items.GetNearestItemsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.GetNearestItemsResponse>) responseObserver);
          break;
        case METHODID_USE_ITEM:
          serviceImpl.useItem((mruv.Items.UseItemRequest) request,
              (io.grpc.stub.StreamObserver<mruv.Items.UseItemResponse>) responseObserver);
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

  private static abstract class MruVItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.Items.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVItemService");
    }
  }

  private static final class MruVItemServiceFileDescriptorSupplier
      extends MruVItemServiceBaseDescriptorSupplier {
    MruVItemServiceFileDescriptorSupplier() {}
  }

  private static final class MruVItemServiceMethodDescriptorSupplier
      extends MruVItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVItemServiceFileDescriptorSupplier())
              .addMethod(getCreateItemMethod())
              .addMethod(getGetItemMethod())
              .addMethod(getDeleteItemMethod())
              .addMethod(getGetItemsMethod())
              .addMethod(getCreateItemTypeMethod())
              .addMethod(getGetItemTypeMethod())
              .addMethod(getDeleteItemTypeMethod())
              .addMethod(getGetItemTypesMethod())
              .addMethod(getCreateContainerMethod())
              .addMethod(getGetContainerMethod())
              .addMethod(getDeleteContainerMethod())
              .addMethod(getGetContainersMethod())
              .addMethod(getCreateContainerTypeMethod())
              .addMethod(getGetContainerTypeMethod())
              .addMethod(getDeleteContainerTypeMethod())
              .addMethod(getGetContainerTypesMethod())
              .addMethod(getGetContainerItemsMethod())
              .addMethod(getPullItemMethod())
              .addMethod(getPutItemMethod())
              .addMethod(getSortItemsMethod())
              .addMethod(getGetNearestItemsMethod())
              .addMethod(getUseItemMethod())
              .addMethod(getGetServiceStatusMethod())
              .addMethod(getGetServiceVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
