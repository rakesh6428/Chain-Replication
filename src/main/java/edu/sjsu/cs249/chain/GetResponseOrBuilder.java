// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package edu.sjsu.cs249.chain;

public interface GetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adb.GetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * rc = 0 means success, rc = 1 i'm not the tail, rc = 2 key doesn't exist
   * </pre>
   *
   * <code>uint32 rc = 1;</code>
   */
  int getRc();

  /**
   * <code>int32 value = 2;</code>
   */
  int getValue();
}
