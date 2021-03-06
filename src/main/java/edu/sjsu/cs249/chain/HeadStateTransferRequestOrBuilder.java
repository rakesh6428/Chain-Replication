// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package edu.sjsu.cs249.chain;

public interface HeadStateTransferRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adb.HeadStateTransferRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 src = 1;</code>
   */
  long getSrc();

  /**
   * <code>uint64 stateXid = 2;</code>
   */
  long getStateXid();

  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */
  int getStateCount();
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */
  boolean containsState(
      java.lang.String key);
  /**
   * Use {@link #getStateMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getState();
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getStateMap();
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */

  int getStateOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <code>map&lt;string, int32&gt; state = 3;</code>
   */

  int getStateOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  java.util.List<edu.sjsu.cs249.chain.HeadStateUpdateRequest> 
      getSentList();
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  edu.sjsu.cs249.chain.HeadStateUpdateRequest getSent(int index);
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  int getSentCount();
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  java.util.List<? extends edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder> 
      getSentOrBuilderList();
  /**
   * <code>repeated .adb.HeadStateUpdateRequest sent = 4;</code>
   */
  edu.sjsu.cs249.chain.HeadStateUpdateRequestOrBuilder getSentOrBuilder(
      int index);
}
