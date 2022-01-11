// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addresslivros.proto

package com.livros.protos;

/**
 * <pre>
 * Our address book file is just one of these.
 * </pre>
 *
 * Protobuf type {@code tutorial.AddressLivros}
 */
public final class AddressLivros extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.AddressLivros)
    AddressLivrosOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressLivros.newBuilder() to construct.
  private AddressLivros(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressLivros() {
    livro_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressLivros();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressLivros(
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
              livro_ = new java.util.ArrayList<com.livros.protos.Livro>();
              mutable_bitField0_ |= 0x00000001;
            }
            livro_.add(
                input.readMessage(com.livros.protos.Livro.parser(), extensionRegistry));
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
        livro_ = java.util.Collections.unmodifiableList(livro_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.livros.protos.AddressLivrosProtos.internal_static_tutorial_AddressLivros_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.livros.protos.AddressLivrosProtos.internal_static_tutorial_AddressLivros_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.livros.protos.AddressLivros.class, com.livros.protos.AddressLivros.Builder.class);
  }

  public static final int LIVRO_FIELD_NUMBER = 1;
  private java.util.List<com.livros.protos.Livro> livro_;
  /**
   * <code>repeated .tutorial.Livro livro = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.livros.protos.Livro> getLivroList() {
    return livro_;
  }
  /**
   * <code>repeated .tutorial.Livro livro = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.livros.protos.LivroOrBuilder> 
      getLivroOrBuilderList() {
    return livro_;
  }
  /**
   * <code>repeated .tutorial.Livro livro = 1;</code>
   */
  @java.lang.Override
  public int getLivroCount() {
    return livro_.size();
  }
  /**
   * <code>repeated .tutorial.Livro livro = 1;</code>
   */
  @java.lang.Override
  public com.livros.protos.Livro getLivro(int index) {
    return livro_.get(index);
  }
  /**
   * <code>repeated .tutorial.Livro livro = 1;</code>
   */
  @java.lang.Override
  public com.livros.protos.LivroOrBuilder getLivroOrBuilder(
      int index) {
    return livro_.get(index);
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
    for (int i = 0; i < livro_.size(); i++) {
      output.writeMessage(1, livro_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < livro_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, livro_.get(i));
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
    if (!(obj instanceof com.livros.protos.AddressLivros)) {
      return super.equals(obj);
    }
    com.livros.protos.AddressLivros other = (com.livros.protos.AddressLivros) obj;

    if (!getLivroList()
        .equals(other.getLivroList())) return false;
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
    if (getLivroCount() > 0) {
      hash = (37 * hash) + LIVRO_FIELD_NUMBER;
      hash = (53 * hash) + getLivroList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.livros.protos.AddressLivros parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.livros.protos.AddressLivros parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.livros.protos.AddressLivros parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.livros.protos.AddressLivros parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.livros.protos.AddressLivros parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.livros.protos.AddressLivros parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.livros.protos.AddressLivros parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.livros.protos.AddressLivros parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.livros.protos.AddressLivros parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.livros.protos.AddressLivros parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.livros.protos.AddressLivros parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.livros.protos.AddressLivros parseFrom(
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
  public static Builder newBuilder(com.livros.protos.AddressLivros prototype) {
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
   * Protobuf type {@code tutorial.AddressLivros}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.AddressLivros)
      com.livros.protos.AddressLivrosOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.livros.protos.AddressLivrosProtos.internal_static_tutorial_AddressLivros_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.livros.protos.AddressLivrosProtos.internal_static_tutorial_AddressLivros_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.livros.protos.AddressLivros.class, com.livros.protos.AddressLivros.Builder.class);
    }

    // Construct using com.livros.protos.AddressLivros.newBuilder()
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
        getLivroFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (livroBuilder_ == null) {
        livro_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        livroBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.livros.protos.AddressLivrosProtos.internal_static_tutorial_AddressLivros_descriptor;
    }

    @java.lang.Override
    public com.livros.protos.AddressLivros getDefaultInstanceForType() {
      return com.livros.protos.AddressLivros.getDefaultInstance();
    }

    @java.lang.Override
    public com.livros.protos.AddressLivros build() {
      com.livros.protos.AddressLivros result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.livros.protos.AddressLivros buildPartial() {
      com.livros.protos.AddressLivros result = new com.livros.protos.AddressLivros(this);
      int from_bitField0_ = bitField0_;
      if (livroBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          livro_ = java.util.Collections.unmodifiableList(livro_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.livro_ = livro_;
      } else {
        result.livro_ = livroBuilder_.build();
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
      if (other instanceof com.livros.protos.AddressLivros) {
        return mergeFrom((com.livros.protos.AddressLivros)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.livros.protos.AddressLivros other) {
      if (other == com.livros.protos.AddressLivros.getDefaultInstance()) return this;
      if (livroBuilder_ == null) {
        if (!other.livro_.isEmpty()) {
          if (livro_.isEmpty()) {
            livro_ = other.livro_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLivroIsMutable();
            livro_.addAll(other.livro_);
          }
          onChanged();
        }
      } else {
        if (!other.livro_.isEmpty()) {
          if (livroBuilder_.isEmpty()) {
            livroBuilder_.dispose();
            livroBuilder_ = null;
            livro_ = other.livro_;
            bitField0_ = (bitField0_ & ~0x00000001);
            livroBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLivroFieldBuilder() : null;
          } else {
            livroBuilder_.addAllMessages(other.livro_);
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
      com.livros.protos.AddressLivros parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.livros.protos.AddressLivros) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.livros.protos.Livro> livro_ =
      java.util.Collections.emptyList();
    private void ensureLivroIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        livro_ = new java.util.ArrayList<com.livros.protos.Livro>(livro_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.livros.protos.Livro, com.livros.protos.Livro.Builder, com.livros.protos.LivroOrBuilder> livroBuilder_;

    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public java.util.List<com.livros.protos.Livro> getLivroList() {
      if (livroBuilder_ == null) {
        return java.util.Collections.unmodifiableList(livro_);
      } else {
        return livroBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public int getLivroCount() {
      if (livroBuilder_ == null) {
        return livro_.size();
      } else {
        return livroBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public com.livros.protos.Livro getLivro(int index) {
      if (livroBuilder_ == null) {
        return livro_.get(index);
      } else {
        return livroBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder setLivro(
        int index, com.livros.protos.Livro value) {
      if (livroBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLivroIsMutable();
        livro_.set(index, value);
        onChanged();
      } else {
        livroBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder setLivro(
        int index, com.livros.protos.Livro.Builder builderForValue) {
      if (livroBuilder_ == null) {
        ensureLivroIsMutable();
        livro_.set(index, builderForValue.build());
        onChanged();
      } else {
        livroBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder addLivro(com.livros.protos.Livro value) {
      if (livroBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLivroIsMutable();
        livro_.add(value);
        onChanged();
      } else {
        livroBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder addLivro(
        int index, com.livros.protos.Livro value) {
      if (livroBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLivroIsMutable();
        livro_.add(index, value);
        onChanged();
      } else {
        livroBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder addLivro(
        com.livros.protos.Livro.Builder builderForValue) {
      if (livroBuilder_ == null) {
        ensureLivroIsMutable();
        livro_.add(builderForValue.build());
        onChanged();
      } else {
        livroBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder addLivro(
        int index, com.livros.protos.Livro.Builder builderForValue) {
      if (livroBuilder_ == null) {
        ensureLivroIsMutable();
        livro_.add(index, builderForValue.build());
        onChanged();
      } else {
        livroBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder addAllLivro(
        java.lang.Iterable<? extends com.livros.protos.Livro> values) {
      if (livroBuilder_ == null) {
        ensureLivroIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, livro_);
        onChanged();
      } else {
        livroBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder clearLivro() {
      if (livroBuilder_ == null) {
        livro_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        livroBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public Builder removeLivro(int index) {
      if (livroBuilder_ == null) {
        ensureLivroIsMutable();
        livro_.remove(index);
        onChanged();
      } else {
        livroBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public com.livros.protos.Livro.Builder getLivroBuilder(
        int index) {
      return getLivroFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public com.livros.protos.LivroOrBuilder getLivroOrBuilder(
        int index) {
      if (livroBuilder_ == null) {
        return livro_.get(index);  } else {
        return livroBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public java.util.List<? extends com.livros.protos.LivroOrBuilder> 
         getLivroOrBuilderList() {
      if (livroBuilder_ != null) {
        return livroBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(livro_);
      }
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public com.livros.protos.Livro.Builder addLivroBuilder() {
      return getLivroFieldBuilder().addBuilder(
          com.livros.protos.Livro.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public com.livros.protos.Livro.Builder addLivroBuilder(
        int index) {
      return getLivroFieldBuilder().addBuilder(
          index, com.livros.protos.Livro.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.Livro livro = 1;</code>
     */
    public java.util.List<com.livros.protos.Livro.Builder> 
         getLivroBuilderList() {
      return getLivroFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.livros.protos.Livro, com.livros.protos.Livro.Builder, com.livros.protos.LivroOrBuilder> 
        getLivroFieldBuilder() {
      if (livroBuilder_ == null) {
        livroBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.livros.protos.Livro, com.livros.protos.Livro.Builder, com.livros.protos.LivroOrBuilder>(
                livro_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        livro_ = null;
      }
      return livroBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tutorial.AddressLivros)
  }

  // @@protoc_insertion_point(class_scope:tutorial.AddressLivros)
  private static final com.livros.protos.AddressLivros DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.livros.protos.AddressLivros();
  }

  public static com.livros.protos.AddressLivros getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressLivros>
      PARSER = new com.google.protobuf.AbstractParser<AddressLivros>() {
    @java.lang.Override
    public AddressLivros parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressLivros(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressLivros> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressLivros> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.livros.protos.AddressLivros getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
