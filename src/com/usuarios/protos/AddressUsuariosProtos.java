// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: address_usuarios.proto

package com.usuarios.protos;

public final class AddressUsuariosProtos {
  private AddressUsuariosProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Usuario_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Usuario_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Usuario_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Usuario_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressUsuarios_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressUsuarios_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026address_usuarios.proto\022\010tutorial\032\037goog" +
      "le/protobuf/timestamp.proto\"\227\002\n\007Usuario\022" +
      "\014\n\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t" +
      "\022\013\n\003cpf\030\004 \001(\005\022-\n\006phones\030\005 \003(\0132\035.tutorial" +
      ".Usuario.PhoneNumber\0220\n\014last_updated\030\006 \001" +
      "(\0132\032.google.protobuf.Timestamp\032H\n\013PhoneN" +
      "umber\022\016\n\006number\030\001 \001(\t\022)\n\004type\030\002 \001(\0162\033.tu" +
      "torial.Usuario.PhoneType\"+\n\tPhoneType\022\n\n" +
      "\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002\"5\n\017Address" +
      "Usuarios\022\"\n\007usuario\030\001 \003(\0132\021.tutorial.Usu" +
      "arioBf\n\023com.usuarios.protosB\025AddressUsua" +
      "riosProtosP\001Z\013../usuarios\252\002(Google.Proto" +
      "buf.Examples.AddressUsuariosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tutorial_Usuario_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Usuario_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Usuario_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Cpf", "Phones", "LastUpdated", });
    internal_static_tutorial_Usuario_PhoneNumber_descriptor =
      internal_static_tutorial_Usuario_descriptor.getNestedTypes().get(0);
    internal_static_tutorial_Usuario_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Usuario_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_tutorial_AddressUsuarios_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressUsuarios_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressUsuarios_descriptor,
        new java.lang.String[] { "Usuario", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
