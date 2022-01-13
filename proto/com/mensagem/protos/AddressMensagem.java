// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Mensagem.proto

package com.mensagem.protos;

/**
 * <pre>
 * Our address book file is just one of these.
 * </pre>
 *
 * Protobuf type {@code tutorial.AddressMensagem}
 */
public final class AddressMensagem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tutorial.AddressMensagem)
    AddressMensagemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressMensagem.newBuilder() to construct.
  private AddressMensagem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressMensagem() {
    mensagem_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressMensagem();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressMensagem(
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
              mensagem_ = new java.util.ArrayList<com.mensagem.protos.Mensagem>();
              mutable_bitField0_ |= 0x00000001;
            }
            mensagem_.add(
                input.readMessage(com.mensagem.protos.Mensagem.parser(), extensionRegistry));
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
        mensagem_ = java.util.Collections.unmodifiableList(mensagem_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mensagem.protos.AddressMensagemProtos.internal_static_tutorial_AddressMensagem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mensagem.protos.AddressMensagemProtos.internal_static_tutorial_AddressMensagem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mensagem.protos.AddressMensagem.class, com.mensagem.protos.AddressMensagem.Builder.class);
  }

  public static final int MENSAGEM_FIELD_NUMBER = 1;
  private java.util.List<com.mensagem.protos.Mensagem> mensagem_;
  /**
   * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.mensagem.protos.Mensagem> getMensagemList() {
    return mensagem_;
  }
  /**
   * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.mensagem.protos.MensagemOrBuilder> 
      getMensagemOrBuilderList() {
    return mensagem_;
  }
  /**
   * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
   */
  @java.lang.Override
  public int getMensagemCount() {
    return mensagem_.size();
  }
  /**
   * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
   */
  @java.lang.Override
  public com.mensagem.protos.Mensagem getMensagem(int index) {
    return mensagem_.get(index);
  }
  /**
   * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
   */
  @java.lang.Override
  public com.mensagem.protos.MensagemOrBuilder getMensagemOrBuilder(
      int index) {
    return mensagem_.get(index);
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
    for (int i = 0; i < mensagem_.size(); i++) {
      output.writeMessage(1, mensagem_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mensagem_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mensagem_.get(i));
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
    if (!(obj instanceof com.mensagem.protos.AddressMensagem)) {
      return super.equals(obj);
    }
    com.mensagem.protos.AddressMensagem other = (com.mensagem.protos.AddressMensagem) obj;

    if (!getMensagemList()
        .equals(other.getMensagemList())) return false;
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
    if (getMensagemCount() > 0) {
      hash = (37 * hash) + MENSAGEM_FIELD_NUMBER;
      hash = (53 * hash) + getMensagemList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mensagem.protos.AddressMensagem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mensagem.protos.AddressMensagem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mensagem.protos.AddressMensagem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mensagem.protos.AddressMensagem parseFrom(
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
  public static Builder newBuilder(com.mensagem.protos.AddressMensagem prototype) {
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
   * Protobuf type {@code tutorial.AddressMensagem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tutorial.AddressMensagem)
      com.mensagem.protos.AddressMensagemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mensagem.protos.AddressMensagemProtos.internal_static_tutorial_AddressMensagem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mensagem.protos.AddressMensagemProtos.internal_static_tutorial_AddressMensagem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mensagem.protos.AddressMensagem.class, com.mensagem.protos.AddressMensagem.Builder.class);
    }

    // Construct using com.mensagem.protos.AddressMensagem.newBuilder()
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
        getMensagemFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mensagemBuilder_ == null) {
        mensagem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mensagemBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mensagem.protos.AddressMensagemProtos.internal_static_tutorial_AddressMensagem_descriptor;
    }

    @java.lang.Override
    public com.mensagem.protos.AddressMensagem getDefaultInstanceForType() {
      return com.mensagem.protos.AddressMensagem.getDefaultInstance();
    }

    @java.lang.Override
    public com.mensagem.protos.AddressMensagem build() {
      com.mensagem.protos.AddressMensagem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mensagem.protos.AddressMensagem buildPartial() {
      com.mensagem.protos.AddressMensagem result = new com.mensagem.protos.AddressMensagem(this);
      int from_bitField0_ = bitField0_;
      if (mensagemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mensagem_ = java.util.Collections.unmodifiableList(mensagem_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mensagem_ = mensagem_;
      } else {
        result.mensagem_ = mensagemBuilder_.build();
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
      if (other instanceof com.mensagem.protos.AddressMensagem) {
        return mergeFrom((com.mensagem.protos.AddressMensagem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mensagem.protos.AddressMensagem other) {
      if (other == com.mensagem.protos.AddressMensagem.getDefaultInstance()) return this;
      if (mensagemBuilder_ == null) {
        if (!other.mensagem_.isEmpty()) {
          if (mensagem_.isEmpty()) {
            mensagem_ = other.mensagem_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMensagemIsMutable();
            mensagem_.addAll(other.mensagem_);
          }
          onChanged();
        }
      } else {
        if (!other.mensagem_.isEmpty()) {
          if (mensagemBuilder_.isEmpty()) {
            mensagemBuilder_.dispose();
            mensagemBuilder_ = null;
            mensagem_ = other.mensagem_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mensagemBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMensagemFieldBuilder() : null;
          } else {
            mensagemBuilder_.addAllMessages(other.mensagem_);
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
      com.mensagem.protos.AddressMensagem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mensagem.protos.AddressMensagem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.mensagem.protos.Mensagem> mensagem_ =
      java.util.Collections.emptyList();
    private void ensureMensagemIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mensagem_ = new java.util.ArrayList<com.mensagem.protos.Mensagem>(mensagem_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.mensagem.protos.Mensagem, com.mensagem.protos.Mensagem.Builder, com.mensagem.protos.MensagemOrBuilder> mensagemBuilder_;

    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public java.util.List<com.mensagem.protos.Mensagem> getMensagemList() {
      if (mensagemBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mensagem_);
      } else {
        return mensagemBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public int getMensagemCount() {
      if (mensagemBuilder_ == null) {
        return mensagem_.size();
      } else {
        return mensagemBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public com.mensagem.protos.Mensagem getMensagem(int index) {
      if (mensagemBuilder_ == null) {
        return mensagem_.get(index);
      } else {
        return mensagemBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder setMensagem(
        int index, com.mensagem.protos.Mensagem value) {
      if (mensagemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMensagemIsMutable();
        mensagem_.set(index, value);
        onChanged();
      } else {
        mensagemBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder setMensagem(
        int index, com.mensagem.protos.Mensagem.Builder builderForValue) {
      if (mensagemBuilder_ == null) {
        ensureMensagemIsMutable();
        mensagem_.set(index, builderForValue.build());
        onChanged();
      } else {
        mensagemBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder addMensagem(com.mensagem.protos.Mensagem value) {
      if (mensagemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMensagemIsMutable();
        mensagem_.add(value);
        onChanged();
      } else {
        mensagemBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder addMensagem(
        int index, com.mensagem.protos.Mensagem value) {
      if (mensagemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMensagemIsMutable();
        mensagem_.add(index, value);
        onChanged();
      } else {
        mensagemBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder addMensagem(
        com.mensagem.protos.Mensagem.Builder builderForValue) {
      if (mensagemBuilder_ == null) {
        ensureMensagemIsMutable();
        mensagem_.add(builderForValue.build());
        onChanged();
      } else {
        mensagemBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder addMensagem(
        int index, com.mensagem.protos.Mensagem.Builder builderForValue) {
      if (mensagemBuilder_ == null) {
        ensureMensagemIsMutable();
        mensagem_.add(index, builderForValue.build());
        onChanged();
      } else {
        mensagemBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder addAllMensagem(
        java.lang.Iterable<? extends com.mensagem.protos.Mensagem> values) {
      if (mensagemBuilder_ == null) {
        ensureMensagemIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mensagem_);
        onChanged();
      } else {
        mensagemBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder clearMensagem() {
      if (mensagemBuilder_ == null) {
        mensagem_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mensagemBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public Builder removeMensagem(int index) {
      if (mensagemBuilder_ == null) {
        ensureMensagemIsMutable();
        mensagem_.remove(index);
        onChanged();
      } else {
        mensagemBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public com.mensagem.protos.Mensagem.Builder getMensagemBuilder(
        int index) {
      return getMensagemFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public com.mensagem.protos.MensagemOrBuilder getMensagemOrBuilder(
        int index) {
      if (mensagemBuilder_ == null) {
        return mensagem_.get(index);  } else {
        return mensagemBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public java.util.List<? extends com.mensagem.protos.MensagemOrBuilder> 
         getMensagemOrBuilderList() {
      if (mensagemBuilder_ != null) {
        return mensagemBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mensagem_);
      }
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public com.mensagem.protos.Mensagem.Builder addMensagemBuilder() {
      return getMensagemFieldBuilder().addBuilder(
          com.mensagem.protos.Mensagem.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public com.mensagem.protos.Mensagem.Builder addMensagemBuilder(
        int index) {
      return getMensagemFieldBuilder().addBuilder(
          index, com.mensagem.protos.Mensagem.getDefaultInstance());
    }
    /**
     * <code>repeated .tutorial.Mensagem mensagem = 1;</code>
     */
    public java.util.List<com.mensagem.protos.Mensagem.Builder> 
         getMensagemBuilderList() {
      return getMensagemFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.mensagem.protos.Mensagem, com.mensagem.protos.Mensagem.Builder, com.mensagem.protos.MensagemOrBuilder> 
        getMensagemFieldBuilder() {
      if (mensagemBuilder_ == null) {
        mensagemBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.mensagem.protos.Mensagem, com.mensagem.protos.Mensagem.Builder, com.mensagem.protos.MensagemOrBuilder>(
                mensagem_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mensagem_ = null;
      }
      return mensagemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tutorial.AddressMensagem)
  }

  // @@protoc_insertion_point(class_scope:tutorial.AddressMensagem)
  private static final com.mensagem.protos.AddressMensagem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mensagem.protos.AddressMensagem();
  }

  public static com.mensagem.protos.AddressMensagem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddressMensagem>
      PARSER = new com.google.protobuf.AbstractParser<AddressMensagem>() {
    @java.lang.Override
    public AddressMensagem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddressMensagem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressMensagem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressMensagem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mensagem.protos.AddressMensagem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

