// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AppSystem.proto

package ds.examples.appsystem;

public final class AppSystemServiceImp {
  private AppSystemServiceImp() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appsystem_HeatRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appsystem_HeatRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appsystem_HeatReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appsystem_HeatReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_appsystem_WindowReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_appsystem_WindowReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017AppSystem.proto\022\tappsystem\"+\n\013HeatRequ" +
      "est\022\014\n\004temp\030\001 \001(\005\022\016\n\006number\030\002 \001(\005\"\034\n\tHea" +
      "tReply\022\017\n\007message\030\001 \001(\t\"\032\n\013WindowReply\022\013" +
      "\n\003val\030\001 \001(\0052K\n\022AppSystemGreetings\0225\n\003app" +
      "\022\026.appsystem.HeatRequest\032\024.appsystem.Hea" +
      "tReply\"\0002M\n\023HeatSystemGreetings\0226\n\004heat\022" +
      "\026.appsystem.HeatRequest\032\024.appsystem.Heat" +
      "Reply\"\000B.\n\025ds.examples.appsystemB\023AppSys" +
      "temServiceImpP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_appsystem_HeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_appsystem_HeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appsystem_HeatRequest_descriptor,
        new java.lang.String[] { "Temp", "Number", });
    internal_static_appsystem_HeatReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_appsystem_HeatReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appsystem_HeatReply_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_appsystem_WindowReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_appsystem_WindowReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_appsystem_WindowReply_descriptor,
        new java.lang.String[] { "Val", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
