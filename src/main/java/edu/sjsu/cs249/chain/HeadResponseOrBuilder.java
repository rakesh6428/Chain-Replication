// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chain.proto

package edu.sjsu.cs249.chain;

public interface HeadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adb.HeadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * rc = 0 means success, rc = 1 i'm not the head
   * </pre>
   *
   * <code>uint32 rc = 1;</code>
   */
  int getRc();
}
