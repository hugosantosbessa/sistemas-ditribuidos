// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Emprestimo.proto

package com.emprestimos.protos;

public interface EmprestimoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.Emprestimo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string codigo = 2;</code>
   * @return The codigo.
   */
  java.lang.String getCodigo();
  /**
   * <code>string codigo = 2;</code>
   * @return The bytes for codigo.
   */
  com.google.protobuf.ByteString
      getCodigoBytes();

  /**
   * <code>string quantidade = 3;</code>
   * @return The quantidade.
   */
  java.lang.String getQuantidade();
  /**
   * <code>string quantidade = 3;</code>
   * @return The bytes for quantidade.
   */
  com.google.protobuf.ByteString
      getQuantidadeBytes();

  /**
   * <code>string dataReserva = 4;</code>
   * @return The dataReserva.
   */
  java.lang.String getDataReserva();
  /**
   * <code>string dataReserva = 4;</code>
   * @return The bytes for dataReserva.
   */
  com.google.protobuf.ByteString
      getDataReservaBytes();

  /**
   * <code>string dataEntrega = 5;</code>
   * @return The dataEntrega.
   */
  java.lang.String getDataEntrega();
  /**
   * <code>string dataEntrega = 5;</code>
   * @return The bytes for dataEntrega.
   */
  com.google.protobuf.ByteString
      getDataEntregaBytes();

  /**
   * <code>.google.protobuf.Timestamp last_updated = 6;</code>
   * @return Whether the lastUpdated field is set.
   */
  boolean hasLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6;</code>
   * @return The lastUpdated.
   */
  com.google.protobuf.Timestamp getLastUpdated();
  /**
   * <code>.google.protobuf.Timestamp last_updated = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedOrBuilder();
}
