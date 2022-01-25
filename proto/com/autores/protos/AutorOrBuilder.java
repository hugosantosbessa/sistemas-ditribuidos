// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Autores.proto

package com.autores.protos;

public interface AutorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.Autor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Unique ID number for this person.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Unique ID number for this person.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string email = 3;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 3;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string cpf = 4;</code>
   * @return The cpf.
   */
  java.lang.String getCpf();
  /**
   * <code>string cpf = 4;</code>
   * @return The bytes for cpf.
   */
  com.google.protobuf.ByteString
      getCpfBytes();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 5;</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5;</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();
}
