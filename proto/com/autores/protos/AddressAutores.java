// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Autores.proto

package com.autores.protos;

/**
 * <pre>
 * Our address book file is just one of these.
 * </pre>
 *
 * Protobuf type {@code tutorial.AddressAutores}
 */
public final class AddressAutores extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.AddressAutores)
    AddressAutoresOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressAutores.newBuilder() to construct.
  private AddressAutores(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressAutores() {
    autor_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressAutores();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressAutores(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              autor_ = new java.util.ArrayList<com.autores.protos.Autor>();
              mutable_bitField0_ |= 0x00000001;
            }
            autor_.add(
                input.readMessage(com.autores.protos.Autor.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        autor_ = java.util.Collections.unmodifiableList(autor_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.autores.protos.AddressAutoresProtos.internal_static_tutorial_AddressAutores_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.autores.protos.AddressAutoresProtos.internal_static_tutorial_AddressAutores_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.autores.protos.AddressAutores.class, com.autores.protos.AddressAutores.Builder.class);
  }

  public static final int AUTOR_FIELD_NUMBER = 1;
  private java.util.List<com.autores.protos.Autor> autor_;
  /**
   * <code>repeated .tutorial.Autor autor = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.autores.protos.Autor> getAutorList() {
    return autor_;
  }
  /**
   * <code>repeated .tutorial.Autor autor = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.autores.protos.AutorOrBuilder> 
      getAutorOrBuilderList() {
    return autor_;
  }
  /**
   * <code>repeated .tutorial.Autor autor = 1;</code>
   */
  @java.lang.Override
  public int getAutorCount() {
    return autor_.size();
  }
  /**
   * <code>repeated .tutorial.Autor autor = 1;</code>
   */
  @java.lang.Override
  public com.autores.protos.Autor getAutor(int index) {
    return autor_.get(index);
  }
  /**
   * <code>repeated .tutorial.Autor autor = 1;</code>
   */
  @java.lang.Override
  public com.autores.protos.AutorOrBuilder getAutorOrBuilder(
      int index) {
    return autor_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < autor_.size(); i++) {
      output.writeMessage(1, autor_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < autor_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, autor_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.autores.protos.AddressAutores)) {
      return super.equals(obj);
    }
    com.autores.protos.AddressAutores other = (com.autores.protos.AddressAutores) obj;

    if (!getAutorList()
        .equals(other.getAutorList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAutorCount() > 0) {
      hash = (37 * hash) + AUTOR_FIELD_NUMBER;
      hash = (53 * hash) + getAutorList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.autores.protos.AddressAutores parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.autores.protos.AddressAutores parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.autores.protos.AddressAutores parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.autores.protos.AddressAutores parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.autores.protos.AddressAutores parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.autores.protos.AddressAutores parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.autores.protos.AddressAutores prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Our address book file is just one of these.
   * </pre>
   *
   * Protobuf type {@code tutorial.AddressAutores}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.AddressAutores)
      com.autores.protos.AddressAutoresOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.autores.protos.AddressAutoresProtos.internal_static_tutorial_AddressAutores_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.autores.protos.AddressAutoresProtos.internal_static_tutorial_AddressAutores_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.autores.protos.AddressAutores.class, com.autores.protos.AddressAutores.Builder.class);
    }

    // Construct using com.autores.protos.AddressAutores.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAutorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (autorBuilder_ == null) {
        autor_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        autorBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.autores.protos.AddressAutoresProtos.internal_static_tutorial_AddressAutores_descriptor;
    }

    @java.lang.Override
    public com.autores.protos.AddressAutores getDefaultInstanceForType() {
      return com.autores.protos.AddressAutores.getDefaultInstance();
    }

    @java.lang.Override
    public com.autores.protos.AddressAutores build() {
      com.autores.protos.AddressAutores result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.autores.protos.AddressAutores buildPartial() {
      com.autores.protos.AddressAutores result = new com.autores.protos.AddressAutores(this);
      int from_bitField0_ = bitField0_;
      if (autorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          autor_ = java.util.Collections.unmodifiableList(autor_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.autor_ = autor_;
      } else {
        result.autor_ = autorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.autores.protos.AddressAutores) {
        return mergeFrom((com.autores.protos.AddressAutores)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.autores.protos.AddressAutores other) {
      if (other == com.autores.protos.AddressAutores.getDefaultInstance()) return this;
      if (autorBuilder_ == null) {
        if (!other.autor_.isEmpty()) {
          if (autor_.isEmpty()) {
            autor_ = other.autor_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAutorIsMutable();
            autor_.addAll(other.autor_);
          }
          onChanged();
        }
      } else {
        if (!other.autor_.isEmpty()) {
          if (autorBuilder_.isEmpty()) {
            autorBuilder_.dispose();
            autorBuilder_ = null;
            autor_ = other.autor_;
            bitField0_ = (bitField0_ & ~0x00000001);
            autorBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAutorFieldBuilder() : null;
          } else {
            autorBuilder_.addAllMessages(other.autor_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.autores.protos.AddressAutores parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.autores.protos.AddressAutores) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.autores.protos.Autor> autor_ =
      java.util.Collections.emptyList();
    private void ensureAutorIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        autor_ = new java.util.ArrayList<com.autores.protos.Autor>(autor_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.autores.protos.Autor, com.autores.protos.Autor.Builder, com.autores.protos.AutorOrBuilder> autorBuilder_;

    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public java.util.List<com.autores.protos.Autor> getAutorList() {
      if (autorBuilder_ == null) {
        return java.util.Collections.unmodifiableList(autor_);
      } else {
        return autorBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public int getAutorCount() {
      if (autorBuilder_ == null) {
        return autor_.size();
      } else {
        return autorBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public com.autores.protos.Autor getAutor(int index) {
      if (autorBuilder_ == null) {
        return autor_.get(index);
      } else {
        return autorBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder setAutor(
        int index, com.autores.protos.Autor value) {
      if (autorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAutorIsMutable();
        autor_.set(index, value);
        onChanged();
      } else {
        autorBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder setAutor(
        int index, com.autores.protos.Autor.Builder builderForValue) {
      if (autorBuilder_ == null) {
        ensureAutorIsMutable();
        autor_.set(index, builderForValue.build());
        onChanged();
      } else {
        autorBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder addAutor(com.autores.protos.Autor value) {
      if (autorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAutorIsMutable();
        autor_.add(value);
        onChanged();
      } else {
        autorBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder addAutor(
        int index, com.autores.protos.Autor value) {
      if (autorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAutorIsMutable();
        autor_.add(index, value);
        onChanged();
      } else {
        autorBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder addAutor(
        com.autores.protos.Autor.Builder builderForValue) {
      if (autorBuilder_ == null) {
        ensureAutorIsMutable();
        autor_.add(builderForValue.build());
        onChanged();
      } else {
        autorBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder addAutor(
        int index, com.autores.protos.Autor.Builder builderForValue) {
      if (autorBuilder_ == null) {
        ensureAutorIsMutable();
        autor_.add(index, builderForValue.build());
        onChanged();
      } else {
        autorBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder addAllAutor(
        java.lang.Iterable<? extends com.autores.protos.Autor> values) {
      if (autorBuilder_ == null) {
        ensureAutorIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, autor_);
        onChanged();
      } else {
        autorBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder clearAutor() {
      if (autorBuilder_ == null) {
        autor_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        autorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public Builder removeAutor(int index) {
      if (autorBuilder_ == null) {
        ensureAutorIsMutable();
        autor_.remove(index);
        onChanged();
      } else {
        autorBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public com.autores.protos.Autor.Builder getAutorBuilder(
        int index) {
      return getAutorFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public com.autores.protos.AutorOrBuilder getAutorOrBuilder(
        int index) {
      if (autorBuilder_ == null) {
        return autor_.get(index);  } else {
        return autorBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public java.util.List<? extends com.autores.protos.AutorOrBuilder> 
         getAutorOrBuilderList() {
      if (autorBuilder_ != null) {
        return autorBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(autor_);
      }
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public com.autores.protos.Autor.Builder addAutorBuilder() {
      return getAutorFieldBuilder().addBuilder(
          com.autores.protos.Autor.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public com.autores.protos.Autor.Builder addAutorBuilder(
        int index) {
      return getAutorFieldBuilder().addBuilder(
          index, com.autores.protos.Autor.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.Autor autor = 1;</code>
     */
    public java.util.List<com.autores.protos.Autor.Builder> 
         getAutorBuilderList() {
      return getAutorFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.autores.protos.Autor, com.autores.protos.Autor.Builder, com.autores.protos.AutorOrBuilder> 
        getAutorFieldBuilder() {
      if (autorBuilder_ == null) {
        autorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.autores.protos.Autor, com.autores.protos.Autor.Builder, com.autores.protos.AutorOrBuilder>(
                autor_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        autor_ = null;
      }
      return autorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tutorial.AddressAutores)
  }

  // @@protoc_insertion_point(class_scope:tutorial.AddressAutores)
  private static final com.autores.protos.AddressAutores DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.autores.protos.AddressAutores();
  }

  public static com.autores.protos.AddressAutores getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressAutores>
      PARSER = new com.google.protobuf.AbstractParser<AddressAutores>() {
    @java.lang.Override
    public AddressAutores parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressAutores(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressAutores> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressAutores> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.autores.protos.AddressAutores getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

