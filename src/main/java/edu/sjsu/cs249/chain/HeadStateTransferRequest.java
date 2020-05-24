// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package edu.sjsu.cs249.chain;

/**
 * Protobuf type {@code adb.HeadStateTransferRequest}
 */
public  final class HeadStateTransferRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adb.HeadStateTransferRequest)
    HeadStateTransferRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeadStateTransferRequest.newBuilder() to construct.
  private HeadStateTransferRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeadStateTransferRequest() {
    src_ = 0L;
    stateXid_ = 0L;
    sent_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeadStateTransferRequest(
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
          case 8: {

            src_ = input.readUInt64();
            break;
          }
          case 16: {

            stateXid_ = input.readUInt64();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              state_ = com.google.protobuf.MapField.newMapField(
                  StateDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
            state__ = input.readMessage(
                StateDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            state_.getMutableMap().put(
                state__.getKey(), state__.getValue());
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              sent_ = new java.util.ArrayList<edu.sjsu.cs249.chain.HeadStateUpdateRequest>();
              mutable_bitField0_ |= 0x00000008;
            }
            sent_.add(
                input.readMessage(edu.sjsu.cs249.chain.HeadStateUpdateRequest.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        sent_ = java.util.Collections.unmodifiableList(sent_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.sjsu.cs249.chain.Chain.internal_static_adb_HeadStateTransferRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetState();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.sjsu.cs249.chain.Chain.internal_static_adb_HeadStateTransferRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.sjsu.cs249.chain.HeadStateTransferRequest.class, edu.sjsu.cs249.chain.HeadStateTransferRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SRC_FIELD_NUMBER = 1;
  private long src_;
  /**
   * <code>uint64 src = 1;</code>
   */
  public long getSrc() {
    return src_;
  }

  public static final int STATEXID_FIELD_NUMBER = 2;
  private long stateXid_;
  /**
   * <code>uint64 stateXid = 2;</code>
   */
  public long getStateXid() {
    return stateXid_;
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private static final class StateDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Integer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Integer>newDefaultInstance(
                edu.sjsu.cs249.chain.Chain.internal_static_adb_HeadStateTransferRequest_StateEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT32,
                0);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Integer> state_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
  internalGetState() {
    if (state_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StateDefaultEntryHolder.defaultEntry);
    }
    return state_;
  }

  public int getStateCount() {
    return internalGetState().getMap().size();
  }
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */

  public boolean containsState(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetState().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStateMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Integer> getState() {
    return getStateMap();
  }
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Integer> getStateMap() {
    return internalGetState().getMap();
  }
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */

  public int getStateOrDefault(
      java.lang.String key,
      int defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetState().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */

  public int getStateOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Integer> map =
        internalGetState().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SENT_FIELD_NUMBER = 4;
  private java.util.List<edu.sjsu.cs249.chain.HeadStateUpdateRequest> sent_;
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  public java.util.List<edu.sjsu.cs249.chain.HeadStateUpdateRequest> getSentList() {
    return sent_;
  }
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  public java.util.List<? extends edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder> 
      getSentOrBuilderList() {
    return sent_;
  }
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  public int getSentCount() {
    return sent_.size();
  }
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  public edu.sjsu.cs249.chain.HeadStateUpdateRequest getSent(int index) {
    return sent_.get(index);
  }
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  public edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder getSentOrBuilder(
      int index) {
    return sent_.get(index);
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
    if (src_ != 0L) {
      output.writeUInt64(1, src_);
    }
    if (stateXid_ != 0L) {
      output.writeUInt64(2, stateXid_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetState(),
        StateDefaultEntryHolder.defaultEntry,
        3);
    for (int i = 0; i < sent_.size(); i++) {
      output.writeMessage(4, sent_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (src_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, src_);
    }
    if (stateXid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, stateXid_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry
         : internalGetState().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Integer>
      state__ = StateDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, state__);
    }
    for (int i = 0; i < sent_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, sent_.get(i));
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
    if (!(obj instanceof edu.sjsu.cs249.chain.HeadStateTransferRequest)) {
      return super.equals(obj);
    }
    edu.sjsu.cs249.chain.HeadStateTransferRequest other = (edu.sjsu.cs249.chain.HeadStateTransferRequest) obj;

    boolean result = true;
    result = result && (getSrc()
        == other.getSrc());
    result = result && (getStateXid()
        == other.getStateXid());
    result = result && internalGetState().equals(
        other.internalGetState());
    result = result && getSentList()
        .equals(other.getSentList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SRC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSrc());
    hash = (37 * hash) + STATEXID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStateXid());
    if (!internalGetState().getMap().isEmpty()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetState().hashCode();
    }
    if (getSentCount() > 0) {
      hash = (37 * hash) + SENT_FIELD_NUMBER;
      hash = (53 * hash) + getSentList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.sjsu.cs249.chain.HeadStateTransferRequest parseFrom(
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
  public static Builder newBuilder(edu.sjsu.cs249.chain.HeadStateTransferRequest prototype) {
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
   * Protobuf type {@code adb.HeadStateTransferRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adb.HeadStateTransferRequest)
      edu.sjsu.cs249.chain.HeadStateTransferRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.sjsu.cs249.chain.Chain.internal_static_adb_HeadStateTransferRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetState();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableState();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.sjsu.cs249.chain.Chain.internal_static_adb_HeadStateTransferRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.sjsu.cs249.chain.HeadStateTransferRequest.class, edu.sjsu.cs249.chain.HeadStateTransferRequest.Builder.class);
    }

    // Construct using edu.sjsu.cs249.chain.HeadStateTransferRequest.newBuilder()
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
        getSentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      src_ = 0L;

      stateXid_ = 0L;

      internalGetMutableState().clear();
      if (sentBuilder_ == null) {
        sent_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        sentBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.sjsu.cs249.chain.Chain.internal_static_adb_HeadStateTransferRequest_descriptor;
    }

    @java.lang.Override
    public edu.sjsu.cs249.chain.HeadStateTransferRequest getDefaultInstanceForType() {
      return edu.sjsu.cs249.chain.HeadStateTransferRequest.getDefaultInstance();
    }

    @java.lang.Override
    public edu.sjsu.cs249.chain.HeadStateTransferRequest build() {
      edu.sjsu.cs249.chain.HeadStateTransferRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.sjsu.cs249.chain.HeadStateTransferRequest buildPartial() {
      edu.sjsu.cs249.chain.HeadStateTransferRequest result = new edu.sjsu.cs249.chain.HeadStateTransferRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.src_ = src_;
      result.stateXid_ = stateXid_;
      result.state_ = internalGetState();
      result.state_.makeImmutable();
      if (sentBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          sent_ = java.util.Collections.unmodifiableList(sent_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.sent_ = sent_;
      } else {
        result.sent_ = sentBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.sjsu.cs249.chain.HeadStateTransferRequest) {
        return mergeFrom((edu.sjsu.cs249.chain.HeadStateTransferRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.sjsu.cs249.chain.HeadStateTransferRequest other) {
      if (other == edu.sjsu.cs249.chain.HeadStateTransferRequest.getDefaultInstance()) return this;
      if (other.getSrc() != 0L) {
        setSrc(other.getSrc());
      }
      if (other.getStateXid() != 0L) {
        setStateXid(other.getStateXid());
      }
      internalGetMutableState().mergeFrom(
          other.internalGetState());
      if (sentBuilder_ == null) {
        if (!other.sent_.isEmpty()) {
          if (sent_.isEmpty()) {
            sent_ = other.sent_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureSentIsMutable();
            sent_.addAll(other.sent_);
          }
          onChanged();
        }
      } else {
        if (!other.sent_.isEmpty()) {
          if (sentBuilder_.isEmpty()) {
            sentBuilder_.dispose();
            sentBuilder_ = null;
            sent_ = other.sent_;
            bitField0_ = (bitField0_ & ~0x00000008);
            sentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSentFieldBuilder() : null;
          } else {
            sentBuilder_.addAllMessages(other.sent_);
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
      edu.sjsu.cs249.chain.HeadStateTransferRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (edu.sjsu.cs249.chain.HeadStateTransferRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long src_ ;
    /**
     * <code>uint64 src = 1;</code>
     */
    public long getSrc() {
      return src_;
    }
    /**
     * <code>uint64 src = 1;</code>
     */
    public Builder setSrc(long value) {
      
      src_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 src = 1;</code>
     */
    public Builder clearSrc() {
      
      src_ = 0L;
      onChanged();
      return this;
    }

    private long stateXid_ ;
    /**
     * <code>uint64 stateXid = 2;</code>
     */
    public long getStateXid() {
      return stateXid_;
    }
    /**
     * <code>uint64 stateXid = 2;</code>
     */
    public Builder setStateXid(long value) {
      
      stateXid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 stateXid = 2;</code>
     */
    public Builder clearStateXid() {
      
      stateXid_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Integer> state_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetState() {
      if (state_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StateDefaultEntryHolder.defaultEntry);
      }
      return state_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Integer>
    internalGetMutableState() {
      onChanged();;
      if (state_ == null) {
        state_ = com.google.protobuf.MapField.newMapField(
            StateDefaultEntryHolder.defaultEntry);
      }
      if (!state_.isMutable()) {
        state_ = state_.copy();
      }
      return state_;
    }

    public int getStateCount() {
      return internalGetState().getMap().size();
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */

    public boolean containsState(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetState().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStateMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer> getState() {
      return getStateMap();
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Integer> getStateMap() {
      return internalGetState().getMap();
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */

    public int getStateOrDefault(
        java.lang.String key,
        int defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetState().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */

    public int getStateOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Integer> map =
          internalGetState().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearState() {
      internalGetMutableState().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */

    public Builder removeState(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableState().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Integer>
    getMutableState() {
      return internalGetMutableState().getMutableMap();
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */
    public Builder putState(
        java.lang.String key,
        int value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      internalGetMutableState().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, int32&gt; state = 3;</code>
     */

    public Builder putAllState(
        java.util.Map<java.lang.String, java.lang.Integer> values) {
      internalGetMutableState().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.util.List<edu.sjsu.cs249.chain.HeadStateUpdateRequest> sent_ =
      java.util.Collections.emptyList();
    private void ensureSentIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        sent_ = new java.util.ArrayList<edu.sjsu.cs249.chain.HeadStateUpdateRequest>(sent_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.sjsu.cs249.chain.HeadStateUpdateRequest, edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder, edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder> sentBuilder_;

    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public java.util.List<edu.sjsu.cs249.chain.HeadStateUpdateRequest> getSentList() {
      if (sentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sent_);
      } else {
        return sentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public int getSentCount() {
      if (sentBuilder_ == null) {
        return sent_.size();
      } else {
        return sentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public edu.sjsu.cs249.chain.HeadStateUpdateRequest getSent(int index) {
      if (sentBuilder_ == null) {
        return sent_.get(index);
      } else {
        return sentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder setSent(
        int index, edu.sjsu.cs249.chain.HeadStateUpdateRequest value) {
      if (sentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSentIsMutable();
        sent_.set(index, value);
        onChanged();
      } else {
        sentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder setSent(
        int index, edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder builderForValue) {
      if (sentBuilder_ == null) {
        ensureSentIsMutable();
        sent_.set(index, builderForValue.build());
        onChanged();
      } else {
        sentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder addSent(edu.sjsu.cs249.chain.HeadStateUpdateRequest value) {
      if (sentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSentIsMutable();
        sent_.add(value);
        onChanged();
      } else {
        sentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder addSent(
        int index, edu.sjsu.cs249.chain.HeadStateUpdateRequest value) {
      if (sentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSentIsMutable();
        sent_.add(index, value);
        onChanged();
      } else {
        sentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder addSent(
        edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder builderForValue) {
      if (sentBuilder_ == null) {
        ensureSentIsMutable();
        sent_.add(builderForValue.build());
        onChanged();
      } else {
        sentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder addSent(
        int index, edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder builderForValue) {
      if (sentBuilder_ == null) {
        ensureSentIsMutable();
        sent_.add(index, builderForValue.build());
        onChanged();
      } else {
        sentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder addAllSent(
        java.lang.Iterable<? extends edu.sjsu.cs249.chain.HeadStateUpdateRequest> values) {
      if (sentBuilder_ == null) {
        ensureSentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sent_);
        onChanged();
      } else {
        sentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder clearSent() {
      if (sentBuilder_ == null) {
        sent_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        sentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public Builder removeSent(int index) {
      if (sentBuilder_ == null) {
        ensureSentIsMutable();
        sent_.remove(index);
        onChanged();
      } else {
        sentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder getSentBuilder(
        int index) {
      return getSentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder getSentOrBuilder(
        int index) {
      if (sentBuilder_ == null) {
        return sent_.get(index);  } else {
        return sentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public java.util.List<? extends edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder> 
         getSentOrBuilderList() {
      if (sentBuilder_ != null) {
        return sentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sent_);
      }
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder addSentBuilder() {
      return getSentFieldBuilder().addBuilder(
          edu.sjsu.cs249.chain.HeadStateUpdateRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder addSentBuilder(
        int index) {
      return getSentFieldBuilder().addBuilder(
          index, edu.sjsu.cs249.chain.HeadStateUpdateRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
     */
    public java.util.List<edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder> 
         getSentBuilderList() {
      return getSentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        edu.sjsu.cs249.chain.HeadStateUpdateRequest, edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder, edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder> 
        getSentFieldBuilder() {
      if (sentBuilder_ == null) {
        sentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            edu.sjsu.cs249.chain.HeadStateUpdateRequest, edu.sjsu.cs249.chain.HeadStateUpdateRequest.Builder, edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder>(
                sent_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        sent_ = null;
      }
      return sentBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:adb.HeadStateTransferRequest)
  }

  // @@protoc_insertion_point(class_scope:adb.HeadStateTransferRequest)
  private static final edu.sjsu.cs249.chain.HeadStateTransferRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.sjsu.cs249.chain.HeadStateTransferRequest();
  }

  public static edu.sjsu.cs249.chain.HeadStateTransferRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeadStateTransferRequest>
      PARSER = new com.google.protobuf.AbstractParser<HeadStateTransferRequest>() {
    @java.lang.Override
    public HeadStateTransferRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeadStateTransferRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeadStateTransferRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeadStateTransferRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.sjsu.cs249.chain.HeadStateTransferRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

