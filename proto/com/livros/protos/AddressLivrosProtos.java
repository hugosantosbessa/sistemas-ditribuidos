// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addresslivros.proto

package com.livros.protos;

public final class AddressLivrosProtos {
  private AddressLivrosProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Livro_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Livro_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressLivros_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressLivros_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023addresslivros.proto\022\010tutorial\032\037google/" +
      "protobuf/timestamp.proto\"u\n\005Livro\022\016\n\006cod" +
      "igo\030\001 \001(\005\022\013\n\003qtd\030\002 \001(\005\022\r\n\005autor\030\003 \001(\t\022\016\n" +
      "\006genero\030\004 \001(\t\0220\n\014last_updated\030\005 \001(\0132\032.go" +
      "ogle.protobuf.Timestamp\"/\n\rAddressLivros" +
      "\022\036\n\005livro\030\001 \003(\0132\017.tutorial.LivroB^\n\021com." +
      "livros.protosB\023AddressLivrosProtosP\001Z\t.." +
      "/livros\252\002&Google.Protobuf.Examples.Addre" +
      "ssLivrosb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tutorial_Livro_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Livro_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Livro_descriptor,
        new java.lang.String[] { "Codigo", "Qtd", "Autor", "Genero", "LastUpdated", });
    internal_static_tutorial_AddressLivros_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressLivros_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressLivros_descriptor,
        new java.lang.String[] { "Livro", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}