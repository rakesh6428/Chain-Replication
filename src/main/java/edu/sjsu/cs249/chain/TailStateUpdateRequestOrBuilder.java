// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package edu.sjsu.cs249.chain;

public interface TailStateUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adb.TailStateUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 src = 1;</code>
   */
  long getSrc();

  /**
   * <code>uint64 xid = 2;</code>
   */
  long getXid();

  /**
   * <code>string key = 3;</code>
   */
  java.lang.String getKey();
  /**
   * <code>string key = 3;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>int32 value = 4;</code>
   */
  int getValue();

  /**
   * <code>string host = 5;</code>
   */
  java.lang.String getHost();
  /**
   * <code>string host = 5;</code>
   */
  com.google.protobuf.ByteString
      getHostBytes();

  /**
   * <code>int32 port = 6;</code>
   */
  int getPort();

  /**
   * <code>int32 cxid = 7;</code>
   */
  int getCxid();
}
