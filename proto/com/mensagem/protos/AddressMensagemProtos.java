// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Mensagem.proto

package com.mensagem.protos;

public final class AddressMensagemProtos {
  private AddressMensagemProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Mensagem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Mensagem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressMensagem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressMensagem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Mensagem.proto\022\010tutorial\032\037google/proto" +
      "buf/timestamp.proto\"\242\001\n\010Mensagem\022\023\n\013mess" +
      "ageType\030\001 \001(\005\022\022\n\nrequest_id\030\002 \001(\005\022\030\n\020obj" +
      "ect_reference\030\003 \001(\t\022\016\n\006method\030\004 \001(\t\022\021\n\ta" +
      "rguments\030\005 \001(\014\0220\n\014last_updated\030\006 \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\"7\n\017AddressMensa" +
      "gem\022$\n\010mensagem\030\001 \003(\0132\022.tutorial.Mensage" +
      "mBf\n\023com.mensagem.protosB\025AddressMensage" +
      "mProtosP\001Z\013../mensagem\252\002(Google.Protobuf" +
      ".Examples.AddressMensagemb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tutorial_Mensagem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Mensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Mensagem_descriptor,
        new java.lang.String[] { "MessageType", "RequestId", "ObjectReference", "Method", "Arguments", "LastUpdated", });
    internal_static_tutorial_AddressMensagem_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressMensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressMensagem_descriptor,
        new java.lang.String[] { "Mensagem", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}