package mruv.groups;

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
 * The MruV groups service provides procedures for managing groups.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: groups/groups.proto")
public final class MruVGroupsServiceGrpc {

  private MruVGroupsServiceGrpc() {}

  public static final String SERVICE_NAME = "mruv.groups.MruVGroupsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.CreateGroupRequest,
      mruv.groups.Groups.CreateGroupResponse> getCreateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateGroup",
      requestType = mruv.groups.Groups.CreateGroupRequest.class,
      responseType = mruv.groups.Groups.CreateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.CreateGroupRequest,
      mruv.groups.Groups.CreateGroupResponse> getCreateGroupMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.CreateGroupRequest, mruv.groups.Groups.CreateGroupResponse> getCreateGroupMethod;
    if ((getCreateGroupMethod = MruVGroupsServiceGrpc.getCreateGroupMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getCreateGroupMethod = MruVGroupsServiceGrpc.getCreateGroupMethod) == null) {
          MruVGroupsServiceGrpc.getCreateGroupMethod = getCreateGroupMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.CreateGroupRequest, mruv.groups.Groups.CreateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.CreateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.CreateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("CreateGroup"))
              .build();
        }
      }
    }
    return getCreateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.GetGroupRequest,
      mruv.groups.Groups.GetGroupResponse> getGetGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroup",
      requestType = mruv.groups.Groups.GetGroupRequest.class,
      responseType = mruv.groups.Groups.GetGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.GetGroupRequest,
      mruv.groups.Groups.GetGroupResponse> getGetGroupMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.GetGroupRequest, mruv.groups.Groups.GetGroupResponse> getGetGroupMethod;
    if ((getGetGroupMethod = MruVGroupsServiceGrpc.getGetGroupMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetGroupMethod = MruVGroupsServiceGrpc.getGetGroupMethod) == null) {
          MruVGroupsServiceGrpc.getGetGroupMethod = getGetGroupMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.GetGroupRequest, mruv.groups.Groups.GetGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetGroup"))
              .build();
        }
      }
    }
    return getGetGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.UpdateGroupRequest,
      mruv.groups.Groups.UpdateGroupResponse> getUpdateGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateGroup",
      requestType = mruv.groups.Groups.UpdateGroupRequest.class,
      responseType = mruv.groups.Groups.UpdateGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.UpdateGroupRequest,
      mruv.groups.Groups.UpdateGroupResponse> getUpdateGroupMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.UpdateGroupRequest, mruv.groups.Groups.UpdateGroupResponse> getUpdateGroupMethod;
    if ((getUpdateGroupMethod = MruVGroupsServiceGrpc.getUpdateGroupMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getUpdateGroupMethod = MruVGroupsServiceGrpc.getUpdateGroupMethod) == null) {
          MruVGroupsServiceGrpc.getUpdateGroupMethod = getUpdateGroupMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.UpdateGroupRequest, mruv.groups.Groups.UpdateGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.UpdateGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.UpdateGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("UpdateGroup"))
              .build();
        }
      }
    }
    return getUpdateGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.DeleteGroupRequest,
      mruv.groups.Groups.DeleteGroupResponse> getDeleteGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteGroup",
      requestType = mruv.groups.Groups.DeleteGroupRequest.class,
      responseType = mruv.groups.Groups.DeleteGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.DeleteGroupRequest,
      mruv.groups.Groups.DeleteGroupResponse> getDeleteGroupMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.DeleteGroupRequest, mruv.groups.Groups.DeleteGroupResponse> getDeleteGroupMethod;
    if ((getDeleteGroupMethod = MruVGroupsServiceGrpc.getDeleteGroupMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getDeleteGroupMethod = MruVGroupsServiceGrpc.getDeleteGroupMethod) == null) {
          MruVGroupsServiceGrpc.getDeleteGroupMethod = getDeleteGroupMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.DeleteGroupRequest, mruv.groups.Groups.DeleteGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.DeleteGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.DeleteGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("DeleteGroup"))
              .build();
        }
      }
    }
    return getDeleteGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.GetGroupsRequest,
      mruv.groups.Groups.GetGroupsResponse> getGetGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGroups",
      requestType = mruv.groups.Groups.GetGroupsRequest.class,
      responseType = mruv.groups.Groups.GetGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.GetGroupsRequest,
      mruv.groups.Groups.GetGroupsResponse> getGetGroupsMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.GetGroupsRequest, mruv.groups.Groups.GetGroupsResponse> getGetGroupsMethod;
    if ((getGetGroupsMethod = MruVGroupsServiceGrpc.getGetGroupsMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetGroupsMethod = MruVGroupsServiceGrpc.getGetGroupsMethod) == null) {
          MruVGroupsServiceGrpc.getGetGroupsMethod = getGetGroupsMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.GetGroupsRequest, mruv.groups.Groups.GetGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetGroups"))
              .build();
        }
      }
    }
    return getGetGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.AssignOwnerRequest,
      mruv.groups.Groups.AssignOwnerResponse> getAssignOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignOwner",
      requestType = mruv.groups.Groups.AssignOwnerRequest.class,
      responseType = mruv.groups.Groups.AssignOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.AssignOwnerRequest,
      mruv.groups.Groups.AssignOwnerResponse> getAssignOwnerMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.AssignOwnerRequest, mruv.groups.Groups.AssignOwnerResponse> getAssignOwnerMethod;
    if ((getAssignOwnerMethod = MruVGroupsServiceGrpc.getAssignOwnerMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getAssignOwnerMethod = MruVGroupsServiceGrpc.getAssignOwnerMethod) == null) {
          MruVGroupsServiceGrpc.getAssignOwnerMethod = getAssignOwnerMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.AssignOwnerRequest, mruv.groups.Groups.AssignOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AssignOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AssignOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("AssignOwner"))
              .build();
        }
      }
    }
    return getAssignOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.GetOwnerRequest,
      mruv.groups.Groups.GetOwnerResponse> getGetOwnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOwner",
      requestType = mruv.groups.Groups.GetOwnerRequest.class,
      responseType = mruv.groups.Groups.GetOwnerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.GetOwnerRequest,
      mruv.groups.Groups.GetOwnerResponse> getGetOwnerMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.GetOwnerRequest, mruv.groups.Groups.GetOwnerResponse> getGetOwnerMethod;
    if ((getGetOwnerMethod = MruVGroupsServiceGrpc.getGetOwnerMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetOwnerMethod = MruVGroupsServiceGrpc.getGetOwnerMethod) == null) {
          MruVGroupsServiceGrpc.getGetOwnerMethod = getGetOwnerMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.GetOwnerRequest, mruv.groups.Groups.GetOwnerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOwner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetOwnerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetOwnerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetOwner"))
              .build();
        }
      }
    }
    return getGetOwnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.AddMemberRequest,
      mruv.groups.Groups.AddMemberResponse> getAddMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMember",
      requestType = mruv.groups.Groups.AddMemberRequest.class,
      responseType = mruv.groups.Groups.AddMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.AddMemberRequest,
      mruv.groups.Groups.AddMemberResponse> getAddMemberMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.AddMemberRequest, mruv.groups.Groups.AddMemberResponse> getAddMemberMethod;
    if ((getAddMemberMethod = MruVGroupsServiceGrpc.getAddMemberMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getAddMemberMethod = MruVGroupsServiceGrpc.getAddMemberMethod) == null) {
          MruVGroupsServiceGrpc.getAddMemberMethod = getAddMemberMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.AddMemberRequest, mruv.groups.Groups.AddMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AddMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AddMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("AddMember"))
              .build();
        }
      }
    }
    return getAddMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.GetMembersRequest,
      mruv.groups.Groups.GetMembersResponse> getGetMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMembers",
      requestType = mruv.groups.Groups.GetMembersRequest.class,
      responseType = mruv.groups.Groups.GetMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.GetMembersRequest,
      mruv.groups.Groups.GetMembersResponse> getGetMembersMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.GetMembersRequest, mruv.groups.Groups.GetMembersResponse> getGetMembersMethod;
    if ((getGetMembersMethod = MruVGroupsServiceGrpc.getGetMembersMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetMembersMethod = MruVGroupsServiceGrpc.getGetMembersMethod) == null) {
          MruVGroupsServiceGrpc.getGetMembersMethod = getGetMembersMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.GetMembersRequest, mruv.groups.Groups.GetMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetMembers"))
              .build();
        }
      }
    }
    return getGetMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.RemoveMemberRequest,
      mruv.groups.Groups.RemoveMemberResponse> getRemoveMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveMember",
      requestType = mruv.groups.Groups.RemoveMemberRequest.class,
      responseType = mruv.groups.Groups.RemoveMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.RemoveMemberRequest,
      mruv.groups.Groups.RemoveMemberResponse> getRemoveMemberMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.RemoveMemberRequest, mruv.groups.Groups.RemoveMemberResponse> getRemoveMemberMethod;
    if ((getRemoveMemberMethod = MruVGroupsServiceGrpc.getRemoveMemberMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getRemoveMemberMethod = MruVGroupsServiceGrpc.getRemoveMemberMethod) == null) {
          MruVGroupsServiceGrpc.getRemoveMemberMethod = getRemoveMemberMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.RemoveMemberRequest, mruv.groups.Groups.RemoveMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.RemoveMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.RemoveMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("RemoveMember"))
              .build();
        }
      }
    }
    return getRemoveMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.AddPermissionRequest,
      mruv.groups.Groups.AddPermissionResponse> getAddPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPermission",
      requestType = mruv.groups.Groups.AddPermissionRequest.class,
      responseType = mruv.groups.Groups.AddPermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.AddPermissionRequest,
      mruv.groups.Groups.AddPermissionResponse> getAddPermissionMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.AddPermissionRequest, mruv.groups.Groups.AddPermissionResponse> getAddPermissionMethod;
    if ((getAddPermissionMethod = MruVGroupsServiceGrpc.getAddPermissionMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getAddPermissionMethod = MruVGroupsServiceGrpc.getAddPermissionMethod) == null) {
          MruVGroupsServiceGrpc.getAddPermissionMethod = getAddPermissionMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.AddPermissionRequest, mruv.groups.Groups.AddPermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AddPermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AddPermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("AddPermission"))
              .build();
        }
      }
    }
    return getAddPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.GetPermissionsRequest,
      mruv.groups.Groups.GetPermissionsResponse> getGetPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPermissions",
      requestType = mruv.groups.Groups.GetPermissionsRequest.class,
      responseType = mruv.groups.Groups.GetPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.GetPermissionsRequest,
      mruv.groups.Groups.GetPermissionsResponse> getGetPermissionsMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.GetPermissionsRequest, mruv.groups.Groups.GetPermissionsResponse> getGetPermissionsMethod;
    if ((getGetPermissionsMethod = MruVGroupsServiceGrpc.getGetPermissionsMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetPermissionsMethod = MruVGroupsServiceGrpc.getGetPermissionsMethod) == null) {
          MruVGroupsServiceGrpc.getGetPermissionsMethod = getGetPermissionsMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.GetPermissionsRequest, mruv.groups.Groups.GetPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetPermissions"))
              .build();
        }
      }
    }
    return getGetPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.RemovePermissionRequest,
      mruv.groups.Groups.RemovePermissionResponse> getRemovePermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemovePermission",
      requestType = mruv.groups.Groups.RemovePermissionRequest.class,
      responseType = mruv.groups.Groups.RemovePermissionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.RemovePermissionRequest,
      mruv.groups.Groups.RemovePermissionResponse> getRemovePermissionMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.RemovePermissionRequest, mruv.groups.Groups.RemovePermissionResponse> getRemovePermissionMethod;
    if ((getRemovePermissionMethod = MruVGroupsServiceGrpc.getRemovePermissionMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getRemovePermissionMethod = MruVGroupsServiceGrpc.getRemovePermissionMethod) == null) {
          MruVGroupsServiceGrpc.getRemovePermissionMethod = getRemovePermissionMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.RemovePermissionRequest, mruv.groups.Groups.RemovePermissionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemovePermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.RemovePermissionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.RemovePermissionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("RemovePermission"))
              .build();
        }
      }
    }
    return getRemovePermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.AddSubgroupRequest,
      mruv.groups.Groups.AddSubgroupResponse> getAddSubgroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSubgroup",
      requestType = mruv.groups.Groups.AddSubgroupRequest.class,
      responseType = mruv.groups.Groups.AddSubgroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.AddSubgroupRequest,
      mruv.groups.Groups.AddSubgroupResponse> getAddSubgroupMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.AddSubgroupRequest, mruv.groups.Groups.AddSubgroupResponse> getAddSubgroupMethod;
    if ((getAddSubgroupMethod = MruVGroupsServiceGrpc.getAddSubgroupMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getAddSubgroupMethod = MruVGroupsServiceGrpc.getAddSubgroupMethod) == null) {
          MruVGroupsServiceGrpc.getAddSubgroupMethod = getAddSubgroupMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.AddSubgroupRequest, mruv.groups.Groups.AddSubgroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSubgroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AddSubgroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.AddSubgroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("AddSubgroup"))
              .build();
        }
      }
    }
    return getAddSubgroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.GetSubgroupsRequest,
      mruv.groups.Groups.GetSubgroupsResponse> getGetSubgroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubgroups",
      requestType = mruv.groups.Groups.GetSubgroupsRequest.class,
      responseType = mruv.groups.Groups.GetSubgroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.GetSubgroupsRequest,
      mruv.groups.Groups.GetSubgroupsResponse> getGetSubgroupsMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.GetSubgroupsRequest, mruv.groups.Groups.GetSubgroupsResponse> getGetSubgroupsMethod;
    if ((getGetSubgroupsMethod = MruVGroupsServiceGrpc.getGetSubgroupsMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetSubgroupsMethod = MruVGroupsServiceGrpc.getGetSubgroupsMethod) == null) {
          MruVGroupsServiceGrpc.getGetSubgroupsMethod = getGetSubgroupsMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.GetSubgroupsRequest, mruv.groups.Groups.GetSubgroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubgroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetSubgroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.GetSubgroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetSubgroups"))
              .build();
        }
      }
    }
    return getGetSubgroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.RemoveSubgroupRequest,
      mruv.groups.Groups.RemoveSubgroupResponse> getRemoveSubgroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveSubgroup",
      requestType = mruv.groups.Groups.RemoveSubgroupRequest.class,
      responseType = mruv.groups.Groups.RemoveSubgroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.RemoveSubgroupRequest,
      mruv.groups.Groups.RemoveSubgroupResponse> getRemoveSubgroupMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.RemoveSubgroupRequest, mruv.groups.Groups.RemoveSubgroupResponse> getRemoveSubgroupMethod;
    if ((getRemoveSubgroupMethod = MruVGroupsServiceGrpc.getRemoveSubgroupMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getRemoveSubgroupMethod = MruVGroupsServiceGrpc.getRemoveSubgroupMethod) == null) {
          MruVGroupsServiceGrpc.getRemoveSubgroupMethod = getRemoveSubgroupMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.RemoveSubgroupRequest, mruv.groups.Groups.RemoveSubgroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveSubgroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.RemoveSubgroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.RemoveSubgroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("RemoveSubgroup"))
              .build();
        }
      }
    }
    return getRemoveSubgroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<mruv.groups.Groups.IsPermittedRequest,
      mruv.groups.Groups.IsPermittedResponse> getIsPermittedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsPermitted",
      requestType = mruv.groups.Groups.IsPermittedRequest.class,
      responseType = mruv.groups.Groups.IsPermittedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<mruv.groups.Groups.IsPermittedRequest,
      mruv.groups.Groups.IsPermittedResponse> getIsPermittedMethod() {
    io.grpc.MethodDescriptor<mruv.groups.Groups.IsPermittedRequest, mruv.groups.Groups.IsPermittedResponse> getIsPermittedMethod;
    if ((getIsPermittedMethod = MruVGroupsServiceGrpc.getIsPermittedMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getIsPermittedMethod = MruVGroupsServiceGrpc.getIsPermittedMethod) == null) {
          MruVGroupsServiceGrpc.getIsPermittedMethod = getIsPermittedMethod =
              io.grpc.MethodDescriptor.<mruv.groups.Groups.IsPermittedRequest, mruv.groups.Groups.IsPermittedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsPermitted"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.IsPermittedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.groups.Groups.IsPermittedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("IsPermitted"))
              .build();
        }
      }
    }
    return getIsPermittedMethod;
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
    if ((getGetServiceStatusMethod = MruVGroupsServiceGrpc.getGetServiceStatusMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetServiceStatusMethod = MruVGroupsServiceGrpc.getGetServiceStatusMethod) == null) {
          MruVGroupsServiceGrpc.getGetServiceStatusMethod = getGetServiceStatusMethod =
              io.grpc.MethodDescriptor.<mruv.common.Health.ServiceStatusRequest, mruv.common.Health.ServiceStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.ServiceStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.ServiceStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetServiceStatus"))
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
    if ((getGetServiceVersionMethod = MruVGroupsServiceGrpc.getGetServiceVersionMethod) == null) {
      synchronized (MruVGroupsServiceGrpc.class) {
        if ((getGetServiceVersionMethod = MruVGroupsServiceGrpc.getGetServiceVersionMethod) == null) {
          MruVGroupsServiceGrpc.getGetServiceVersionMethod = getGetServiceVersionMethod =
              io.grpc.MethodDescriptor.<mruv.common.Health.VersionRequest, mruv.common.Health.VersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.VersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  mruv.common.Health.VersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MruVGroupsServiceMethodDescriptorSupplier("GetServiceVersion"))
              .build();
        }
      }
    }
    return getGetServiceVersionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MruVGroupsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVGroupsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVGroupsServiceStub>() {
        @java.lang.Override
        public MruVGroupsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVGroupsServiceStub(channel, callOptions);
        }
      };
    return MruVGroupsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MruVGroupsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVGroupsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVGroupsServiceBlockingStub>() {
        @java.lang.Override
        public MruVGroupsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVGroupsServiceBlockingStub(channel, callOptions);
        }
      };
    return MruVGroupsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MruVGroupsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MruVGroupsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MruVGroupsServiceFutureStub>() {
        @java.lang.Override
        public MruVGroupsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MruVGroupsServiceFutureStub(channel, callOptions);
        }
      };
    return MruVGroupsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The MruV groups service provides procedures for managing groups.
   * </pre>
   */
  public static abstract class MruVGroupsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Create a group.
     * </pre>
     */
    public void createGroup(mruv.groups.Groups.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.CreateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a  group.
     * </pre>
     */
    public void getGroup(mruv.groups.Groups.GetGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a group.
     * </pre>
     */
    public void updateGroup(mruv.groups.Groups.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.UpdateGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a group.
     * </pre>
     */
    public void deleteGroup(mruv.groups.Groups.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.DeleteGroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all groups.
     * </pre>
     */
    public void getGroups(mruv.groups.Groups.GetGroupsRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetGroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Assign an owner. Group can have only one owner. Owner can be a player, a group or an account.
     * </pre>
     */
    public void assignOwner(mruv.groups.Groups.AssignOwnerRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AssignOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAssignOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get group owner.
     * </pre>
     */
    public void getOwner(mruv.groups.Groups.GetOwnerRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetOwnerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOwnerMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a group member.
     * </pre>
     */
    public void addMember(mruv.groups.Groups.AddMemberRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AddMemberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a group member.
     * </pre>
     */
    public void getMembers(mruv.groups.Groups.GetMembersRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetMembersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a group member.
     * </pre>
     */
    public void removeMember(mruv.groups.Groups.RemoveMemberRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.RemoveMemberResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a permission to a group.
     * </pre>
     */
    public void addPermission(mruv.groups.Groups.AddPermissionRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AddPermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all group permissions.
     * </pre>
     */
    public void getPermissions(mruv.groups.Groups.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetPermissionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPermissionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove group permission.
     * </pre>
     */
    public void removePermission(mruv.groups.Groups.RemovePermissionRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.RemovePermissionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemovePermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add a subgroup to a group.
     * </pre>
     */
    public void addSubgroup(mruv.groups.Groups.AddSubgroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AddSubgroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSubgroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all subgroups.
     * </pre>
     */
    public void getSubgroups(mruv.groups.Groups.GetSubgroupsRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetSubgroupsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSubgroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Remove a subgroup from group.
     * </pre>
     */
    public void removeSubgroup(mruv.groups.Groups.RemoveSubgroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.RemoveSubgroupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveSubgroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check is member of a group is permitted to do specific action.
     * </pre>
     */
    public void isPermitted(mruv.groups.Groups.IsPermittedRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.IsPermittedResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsPermittedMethod(), responseObserver);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public void getServiceStatus(mruv.common.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.ServiceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceStatusMethod(), responseObserver);
    }

    /**
     */
    public void getServiceVersion(mruv.common.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.VersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServiceVersionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.CreateGroupRequest,
                mruv.groups.Groups.CreateGroupResponse>(
                  this, METHODID_CREATE_GROUP)))
          .addMethod(
            getGetGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.GetGroupRequest,
                mruv.groups.Groups.GetGroupResponse>(
                  this, METHODID_GET_GROUP)))
          .addMethod(
            getUpdateGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.UpdateGroupRequest,
                mruv.groups.Groups.UpdateGroupResponse>(
                  this, METHODID_UPDATE_GROUP)))
          .addMethod(
            getDeleteGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.DeleteGroupRequest,
                mruv.groups.Groups.DeleteGroupResponse>(
                  this, METHODID_DELETE_GROUP)))
          .addMethod(
            getGetGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.GetGroupsRequest,
                mruv.groups.Groups.GetGroupsResponse>(
                  this, METHODID_GET_GROUPS)))
          .addMethod(
            getAssignOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.AssignOwnerRequest,
                mruv.groups.Groups.AssignOwnerResponse>(
                  this, METHODID_ASSIGN_OWNER)))
          .addMethod(
            getGetOwnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.GetOwnerRequest,
                mruv.groups.Groups.GetOwnerResponse>(
                  this, METHODID_GET_OWNER)))
          .addMethod(
            getAddMemberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.AddMemberRequest,
                mruv.groups.Groups.AddMemberResponse>(
                  this, METHODID_ADD_MEMBER)))
          .addMethod(
            getGetMembersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.GetMembersRequest,
                mruv.groups.Groups.GetMembersResponse>(
                  this, METHODID_GET_MEMBERS)))
          .addMethod(
            getRemoveMemberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.RemoveMemberRequest,
                mruv.groups.Groups.RemoveMemberResponse>(
                  this, METHODID_REMOVE_MEMBER)))
          .addMethod(
            getAddPermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.AddPermissionRequest,
                mruv.groups.Groups.AddPermissionResponse>(
                  this, METHODID_ADD_PERMISSION)))
          .addMethod(
            getGetPermissionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.GetPermissionsRequest,
                mruv.groups.Groups.GetPermissionsResponse>(
                  this, METHODID_GET_PERMISSIONS)))
          .addMethod(
            getRemovePermissionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.RemovePermissionRequest,
                mruv.groups.Groups.RemovePermissionResponse>(
                  this, METHODID_REMOVE_PERMISSION)))
          .addMethod(
            getAddSubgroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.AddSubgroupRequest,
                mruv.groups.Groups.AddSubgroupResponse>(
                  this, METHODID_ADD_SUBGROUP)))
          .addMethod(
            getGetSubgroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.GetSubgroupsRequest,
                mruv.groups.Groups.GetSubgroupsResponse>(
                  this, METHODID_GET_SUBGROUPS)))
          .addMethod(
            getRemoveSubgroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.RemoveSubgroupRequest,
                mruv.groups.Groups.RemoveSubgroupResponse>(
                  this, METHODID_REMOVE_SUBGROUP)))
          .addMethod(
            getIsPermittedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                mruv.groups.Groups.IsPermittedRequest,
                mruv.groups.Groups.IsPermittedResponse>(
                  this, METHODID_IS_PERMITTED)))
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
   * The MruV groups service provides procedures for managing groups.
   * </pre>
   */
  public static final class MruVGroupsServiceStub extends io.grpc.stub.AbstractAsyncStub<MruVGroupsServiceStub> {
    private MruVGroupsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVGroupsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVGroupsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a group.
     * </pre>
     */
    public void createGroup(mruv.groups.Groups.CreateGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.CreateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a  group.
     * </pre>
     */
    public void getGroup(mruv.groups.Groups.GetGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a group.
     * </pre>
     */
    public void updateGroup(mruv.groups.Groups.UpdateGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.UpdateGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a group.
     * </pre>
     */
    public void deleteGroup(mruv.groups.Groups.DeleteGroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.DeleteGroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all groups.
     * </pre>
     */
    public void getGroups(mruv.groups.Groups.GetGroupsRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetGroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Assign an owner. Group can have only one owner. Owner can be a player, a group or an account.
     * </pre>
     */
    public void assignOwner(mruv.groups.Groups.AssignOwnerRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AssignOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAssignOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get group owner.
     * </pre>
     */
    public void getOwner(mruv.groups.Groups.GetOwnerRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetOwnerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a group member.
     * </pre>
     */
    public void addMember(mruv.groups.Groups.AddMemberRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AddMemberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a group member.
     * </pre>
     */
    public void getMembers(mruv.groups.Groups.GetMembersRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetMembersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a group member.
     * </pre>
     */
    public void removeMember(mruv.groups.Groups.RemoveMemberRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.RemoveMemberResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a permission to a group.
     * </pre>
     */
    public void addPermission(mruv.groups.Groups.AddPermissionRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AddPermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all group permissions.
     * </pre>
     */
    public void getPermissions(mruv.groups.Groups.GetPermissionsRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetPermissionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove group permission.
     * </pre>
     */
    public void removePermission(mruv.groups.Groups.RemovePermissionRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.RemovePermissionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemovePermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add a subgroup to a group.
     * </pre>
     */
    public void addSubgroup(mruv.groups.Groups.AddSubgroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.AddSubgroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSubgroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all subgroups.
     * </pre>
     */
    public void getSubgroups(mruv.groups.Groups.GetSubgroupsRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.GetSubgroupsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSubgroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Remove a subgroup from group.
     * </pre>
     */
    public void removeSubgroup(mruv.groups.Groups.RemoveSubgroupRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.RemoveSubgroupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveSubgroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check is member of a group is permitted to do specific action.
     * </pre>
     */
    public void isPermitted(mruv.groups.Groups.IsPermittedRequest request,
        io.grpc.stub.StreamObserver<mruv.groups.Groups.IsPermittedResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsPermittedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public void getServiceStatus(mruv.common.Health.ServiceStatusRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.ServiceStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServiceVersion(mruv.common.Health.VersionRequest request,
        io.grpc.stub.StreamObserver<mruv.common.Health.VersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The MruV groups service provides procedures for managing groups.
   * </pre>
   */
  public static final class MruVGroupsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MruVGroupsServiceBlockingStub> {
    private MruVGroupsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVGroupsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVGroupsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a group.
     * </pre>
     */
    public mruv.groups.Groups.CreateGroupResponse createGroup(mruv.groups.Groups.CreateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a  group.
     * </pre>
     */
    public mruv.groups.Groups.GetGroupResponse getGroup(mruv.groups.Groups.GetGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a group.
     * </pre>
     */
    public mruv.groups.Groups.UpdateGroupResponse updateGroup(mruv.groups.Groups.UpdateGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a group.
     * </pre>
     */
    public mruv.groups.Groups.DeleteGroupResponse deleteGroup(mruv.groups.Groups.DeleteGroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all groups.
     * </pre>
     */
    public mruv.groups.Groups.GetGroupsResponse getGroups(mruv.groups.Groups.GetGroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Assign an owner. Group can have only one owner. Owner can be a player, a group or an account.
     * </pre>
     */
    public mruv.groups.Groups.AssignOwnerResponse assignOwner(mruv.groups.Groups.AssignOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAssignOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get group owner.
     * </pre>
     */
    public mruv.groups.Groups.GetOwnerResponse getOwner(mruv.groups.Groups.GetOwnerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOwnerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a group member.
     * </pre>
     */
    public mruv.groups.Groups.AddMemberResponse addMember(mruv.groups.Groups.AddMemberRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a group member.
     * </pre>
     */
    public mruv.groups.Groups.GetMembersResponse getMembers(mruv.groups.Groups.GetMembersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a group member.
     * </pre>
     */
    public mruv.groups.Groups.RemoveMemberResponse removeMember(mruv.groups.Groups.RemoveMemberRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a permission to a group.
     * </pre>
     */
    public mruv.groups.Groups.AddPermissionResponse addPermission(mruv.groups.Groups.AddPermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all group permissions.
     * </pre>
     */
    public mruv.groups.Groups.GetPermissionsResponse getPermissions(mruv.groups.Groups.GetPermissionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPermissionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove group permission.
     * </pre>
     */
    public mruv.groups.Groups.RemovePermissionResponse removePermission(mruv.groups.Groups.RemovePermissionRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemovePermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add a subgroup to a group.
     * </pre>
     */
    public mruv.groups.Groups.AddSubgroupResponse addSubgroup(mruv.groups.Groups.AddSubgroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddSubgroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all subgroups.
     * </pre>
     */
    public mruv.groups.Groups.GetSubgroupsResponse getSubgroups(mruv.groups.Groups.GetSubgroupsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSubgroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Remove a subgroup from group.
     * </pre>
     */
    public mruv.groups.Groups.RemoveSubgroupResponse removeSubgroup(mruv.groups.Groups.RemoveSubgroupRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveSubgroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check is member of a group is permitted to do specific action.
     * </pre>
     */
    public mruv.groups.Groups.IsPermittedResponse isPermitted(mruv.groups.Groups.IsPermittedRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsPermittedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public mruv.common.Health.ServiceStatusResponse getServiceStatus(mruv.common.Health.ServiceStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public mruv.common.Health.VersionResponse getServiceVersion(mruv.common.Health.VersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServiceVersionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The MruV groups service provides procedures for managing groups.
   * </pre>
   */
  public static final class MruVGroupsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MruVGroupsServiceFutureStub> {
    private MruVGroupsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MruVGroupsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MruVGroupsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.CreateGroupResponse> createGroup(
        mruv.groups.Groups.CreateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a  group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.GetGroupResponse> getGroup(
        mruv.groups.Groups.GetGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.UpdateGroupResponse> updateGroup(
        mruv.groups.Groups.UpdateGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.DeleteGroupResponse> deleteGroup(
        mruv.groups.Groups.DeleteGroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all groups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.GetGroupsResponse> getGroups(
        mruv.groups.Groups.GetGroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Assign an owner. Group can have only one owner. Owner can be a player, a group or an account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.AssignOwnerResponse> assignOwner(
        mruv.groups.Groups.AssignOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAssignOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get group owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.GetOwnerResponse> getOwner(
        mruv.groups.Groups.GetOwnerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOwnerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a group member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.AddMemberResponse> addMember(
        mruv.groups.Groups.AddMemberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a group member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.GetMembersResponse> getMembers(
        mruv.groups.Groups.GetMembersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a group member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.RemoveMemberResponse> removeMember(
        mruv.groups.Groups.RemoveMemberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a permission to a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.AddPermissionResponse> addPermission(
        mruv.groups.Groups.AddPermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all group permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.GetPermissionsResponse> getPermissions(
        mruv.groups.Groups.GetPermissionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPermissionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove group permission.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.RemovePermissionResponse> removePermission(
        mruv.groups.Groups.RemovePermissionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemovePermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add a subgroup to a group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.AddSubgroupResponse> addSubgroup(
        mruv.groups.Groups.AddSubgroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSubgroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all subgroups.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.GetSubgroupsResponse> getSubgroups(
        mruv.groups.Groups.GetSubgroupsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSubgroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Remove a subgroup from group.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.RemoveSubgroupResponse> removeSubgroup(
        mruv.groups.Groups.RemoveSubgroupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveSubgroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check is member of a group is permitted to do specific action.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.groups.Groups.IsPermittedResponse> isPermitted(
        mruv.groups.Groups.IsPermittedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsPermittedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Service status
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.common.Health.ServiceStatusResponse> getServiceStatus(
        mruv.common.Health.ServiceStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mruv.common.Health.VersionResponse> getServiceVersion(
        mruv.common.Health.VersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServiceVersionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_GROUP = 0;
  private static final int METHODID_GET_GROUP = 1;
  private static final int METHODID_UPDATE_GROUP = 2;
  private static final int METHODID_DELETE_GROUP = 3;
  private static final int METHODID_GET_GROUPS = 4;
  private static final int METHODID_ASSIGN_OWNER = 5;
  private static final int METHODID_GET_OWNER = 6;
  private static final int METHODID_ADD_MEMBER = 7;
  private static final int METHODID_GET_MEMBERS = 8;
  private static final int METHODID_REMOVE_MEMBER = 9;
  private static final int METHODID_ADD_PERMISSION = 10;
  private static final int METHODID_GET_PERMISSIONS = 11;
  private static final int METHODID_REMOVE_PERMISSION = 12;
  private static final int METHODID_ADD_SUBGROUP = 13;
  private static final int METHODID_GET_SUBGROUPS = 14;
  private static final int METHODID_REMOVE_SUBGROUP = 15;
  private static final int METHODID_IS_PERMITTED = 16;
  private static final int METHODID_GET_SERVICE_STATUS = 17;
  private static final int METHODID_GET_SERVICE_VERSION = 18;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MruVGroupsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MruVGroupsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_GROUP:
          serviceImpl.createGroup((mruv.groups.Groups.CreateGroupRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.CreateGroupResponse>) responseObserver);
          break;
        case METHODID_GET_GROUP:
          serviceImpl.getGroup((mruv.groups.Groups.GetGroupRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.GetGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_GROUP:
          serviceImpl.updateGroup((mruv.groups.Groups.UpdateGroupRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.UpdateGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_GROUP:
          serviceImpl.deleteGroup((mruv.groups.Groups.DeleteGroupRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.DeleteGroupResponse>) responseObserver);
          break;
        case METHODID_GET_GROUPS:
          serviceImpl.getGroups((mruv.groups.Groups.GetGroupsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.GetGroupsResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_OWNER:
          serviceImpl.assignOwner((mruv.groups.Groups.AssignOwnerRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.AssignOwnerResponse>) responseObserver);
          break;
        case METHODID_GET_OWNER:
          serviceImpl.getOwner((mruv.groups.Groups.GetOwnerRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.GetOwnerResponse>) responseObserver);
          break;
        case METHODID_ADD_MEMBER:
          serviceImpl.addMember((mruv.groups.Groups.AddMemberRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.AddMemberResponse>) responseObserver);
          break;
        case METHODID_GET_MEMBERS:
          serviceImpl.getMembers((mruv.groups.Groups.GetMembersRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.GetMembersResponse>) responseObserver);
          break;
        case METHODID_REMOVE_MEMBER:
          serviceImpl.removeMember((mruv.groups.Groups.RemoveMemberRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.RemoveMemberResponse>) responseObserver);
          break;
        case METHODID_ADD_PERMISSION:
          serviceImpl.addPermission((mruv.groups.Groups.AddPermissionRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.AddPermissionResponse>) responseObserver);
          break;
        case METHODID_GET_PERMISSIONS:
          serviceImpl.getPermissions((mruv.groups.Groups.GetPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.GetPermissionsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_PERMISSION:
          serviceImpl.removePermission((mruv.groups.Groups.RemovePermissionRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.RemovePermissionResponse>) responseObserver);
          break;
        case METHODID_ADD_SUBGROUP:
          serviceImpl.addSubgroup((mruv.groups.Groups.AddSubgroupRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.AddSubgroupResponse>) responseObserver);
          break;
        case METHODID_GET_SUBGROUPS:
          serviceImpl.getSubgroups((mruv.groups.Groups.GetSubgroupsRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.GetSubgroupsResponse>) responseObserver);
          break;
        case METHODID_REMOVE_SUBGROUP:
          serviceImpl.removeSubgroup((mruv.groups.Groups.RemoveSubgroupRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.RemoveSubgroupResponse>) responseObserver);
          break;
        case METHODID_IS_PERMITTED:
          serviceImpl.isPermitted((mruv.groups.Groups.IsPermittedRequest) request,
              (io.grpc.stub.StreamObserver<mruv.groups.Groups.IsPermittedResponse>) responseObserver);
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

  private static abstract class MruVGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MruVGroupsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mruv.groups.Groups.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MruVGroupsService");
    }
  }

  private static final class MruVGroupsServiceFileDescriptorSupplier
      extends MruVGroupsServiceBaseDescriptorSupplier {
    MruVGroupsServiceFileDescriptorSupplier() {}
  }

  private static final class MruVGroupsServiceMethodDescriptorSupplier
      extends MruVGroupsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MruVGroupsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MruVGroupsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MruVGroupsServiceFileDescriptorSupplier())
              .addMethod(getCreateGroupMethod())
              .addMethod(getGetGroupMethod())
              .addMethod(getUpdateGroupMethod())
              .addMethod(getDeleteGroupMethod())
              .addMethod(getGetGroupsMethod())
              .addMethod(getAssignOwnerMethod())
              .addMethod(getGetOwnerMethod())
              .addMethod(getAddMemberMethod())
              .addMethod(getGetMembersMethod())
              .addMethod(getRemoveMemberMethod())
              .addMethod(getAddPermissionMethod())
              .addMethod(getGetPermissionsMethod())
              .addMethod(getRemovePermissionMethod())
              .addMethod(getAddSubgroupMethod())
              .addMethod(getGetSubgroupsMethod())
              .addMethod(getRemoveSubgroupMethod())
              .addMethod(getIsPermittedMethod())
              .addMethod(getGetServiceStatusMethod())
              .addMethod(getGetServiceVersionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
