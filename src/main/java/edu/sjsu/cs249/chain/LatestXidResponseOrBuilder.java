// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package edu.sjsu.cs249.chain;

public interface LatestXidResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adb.LatestXidResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * rc = 0 means success, rc = 1 i'm not the tail
   * </pre>
   *
   * <code>uint32 rc = 1;</code>
   */
  int getRc();

  /**
   * <code>uint64 xid = 2;</code>
   */
  long getXid();
}
