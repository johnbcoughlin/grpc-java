// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qpstest.proto

package io.grpc.testing;

public interface ServerStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.testing.ServerStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional double time_elapsed = 1;</code>
   *
   * <pre>
   * wall clock time
   * </pre>
   */
  double getTimeElapsed();

  /**
   * <code>optional double time_user = 2;</code>
   *
   * <pre>
   * user time used by the server process and threads
   * </pre>
   */
  double getTimeUser();

  /**
   * <code>optional double time_system = 3;</code>
   *
   * <pre>
   * server time used by the server process and all threads
   * </pre>
   */
  double getTimeSystem();
}
