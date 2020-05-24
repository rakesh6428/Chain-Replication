package edu.sjsu.cs249.chain;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: chain.proto")
public final class HeadChainReplicaGrpc {

  private HeadChainReplicaGrpc() {}

  public static final String SERVICE_NAME = "adb.HeadChainReplica";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.HeadStateUpdateRequest,
      edu.sjsu.cs249.chain.ChainResponse> getProposeStateUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "proposeStateUpdate",
      requestType = edu.sjsu.cs249.chain.HeadStateUpdateRequest.class,
      responseType = edu.sjsu.cs249.chain.ChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.HeadStateUpdateRequest,
      edu.sjsu.cs249.chain.ChainResponse> getProposeStateUpdateMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.HeadStateUpdateRequest, edu.sjsu.cs249.chain.ChainResponse> getProposeStateUpdateMethod;
    if ((getProposeStateUpdateMethod = HeadChainReplicaGrpc.getProposeStateUpdateMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getProposeStateUpdateMethod = HeadChainReplicaGrpc.getProposeStateUpdateMethod) == null) {
          HeadChainReplicaGrpc.getProposeStateUpdateMethod = getProposeStateUpdateMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.HeadStateUpdateRequest, edu.sjsu.cs249.chain.ChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "proposeStateUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.HeadStateUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.ChainResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("proposeStateUpdate"))
                  .build();
          }
        }
     }
     return getProposeStateUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.LatestXidRequest,
      edu.sjsu.cs249.chain.LatestXidResponse> getGetLatestXidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLatestXid",
      requestType = edu.sjsu.cs249.chain.LatestXidRequest.class,
      responseType = edu.sjsu.cs249.chain.LatestXidResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.LatestXidRequest,
      edu.sjsu.cs249.chain.LatestXidResponse> getGetLatestXidMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.LatestXidRequest, edu.sjsu.cs249.chain.LatestXidResponse> getGetLatestXidMethod;
    if ((getGetLatestXidMethod = HeadChainReplicaGrpc.getGetLatestXidMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getGetLatestXidMethod = HeadChainReplicaGrpc.getGetLatestXidMethod) == null) {
          HeadChainReplicaGrpc.getGetLatestXidMethod = getGetLatestXidMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.LatestXidRequest, edu.sjsu.cs249.chain.LatestXidResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "getLatestXid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.LatestXidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.LatestXidResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("getLatestXid"))
                  .build();
          }
        }
     }
     return getGetLatestXidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.HeadStateTransferRequest,
      edu.sjsu.cs249.chain.ChainResponse> getStateTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stateTransfer",
      requestType = edu.sjsu.cs249.chain.HeadStateTransferRequest.class,
      responseType = edu.sjsu.cs249.chain.ChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.HeadStateTransferRequest,
      edu.sjsu.cs249.chain.ChainResponse> getStateTransferMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.HeadStateTransferRequest, edu.sjsu.cs249.chain.ChainResponse> getStateTransferMethod;
    if ((getStateTransferMethod = HeadChainReplicaGrpc.getStateTransferMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getStateTransferMethod = HeadChainReplicaGrpc.getStateTransferMethod) == null) {
          HeadChainReplicaGrpc.getStateTransferMethod = getStateTransferMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.HeadStateTransferRequest, edu.sjsu.cs249.chain.ChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "stateTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.HeadStateTransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.ChainResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("stateTransfer"))
                  .build();
          }
        }
     }
     return getStateTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.IncrementRequest,
      edu.sjsu.cs249.chain.HeadResponse> getIncrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increment",
      requestType = edu.sjsu.cs249.chain.IncrementRequest.class,
      responseType = edu.sjsu.cs249.chain.HeadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.IncrementRequest,
      edu.sjsu.cs249.chain.HeadResponse> getIncrementMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.IncrementRequest, edu.sjsu.cs249.chain.HeadResponse> getIncrementMethod;
    if ((getIncrementMethod = HeadChainReplicaGrpc.getIncrementMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getIncrementMethod = HeadChainReplicaGrpc.getIncrementMethod) == null) {
          HeadChainReplicaGrpc.getIncrementMethod = getIncrementMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.IncrementRequest, edu.sjsu.cs249.chain.HeadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.IncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.HeadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("increment"))
                  .build();
          }
        }
     }
     return getIncrementMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.DeleteRequest,
      edu.sjsu.cs249.chain.HeadResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = edu.sjsu.cs249.chain.DeleteRequest.class,
      responseType = edu.sjsu.cs249.chain.HeadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.DeleteRequest,
      edu.sjsu.cs249.chain.HeadResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.DeleteRequest, edu.sjsu.cs249.chain.HeadResponse> getDeleteMethod;
    if ((getDeleteMethod = HeadChainReplicaGrpc.getDeleteMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getDeleteMethod = HeadChainReplicaGrpc.getDeleteMethod) == null) {
          HeadChainReplicaGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.DeleteRequest, edu.sjsu.cs249.chain.HeadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.HeadResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.GetRequest,
      edu.sjsu.cs249.chain.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = edu.sjsu.cs249.chain.GetRequest.class,
      responseType = edu.sjsu.cs249.chain.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.GetRequest,
      edu.sjsu.cs249.chain.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.GetRequest, edu.sjsu.cs249.chain.GetResponse> getGetMethod;
    if ((getGetMethod = HeadChainReplicaGrpc.getGetMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getGetMethod = HeadChainReplicaGrpc.getGetMethod) == null) {
          HeadChainReplicaGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.GetRequest, edu.sjsu.cs249.chain.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.XidProcessedRequest,
      edu.sjsu.cs249.chain.ChainResponse> getXidProcessedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "xidProcessed",
      requestType = edu.sjsu.cs249.chain.XidProcessedRequest.class,
      responseType = edu.sjsu.cs249.chain.ChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.XidProcessedRequest,
      edu.sjsu.cs249.chain.ChainResponse> getXidProcessedMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.XidProcessedRequest, edu.sjsu.cs249.chain.ChainResponse> getXidProcessedMethod;
    if ((getXidProcessedMethod = HeadChainReplicaGrpc.getXidProcessedMethod) == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        if ((getXidProcessedMethod = HeadChainReplicaGrpc.getXidProcessedMethod) == null) {
          HeadChainReplicaGrpc.getXidProcessedMethod = getXidProcessedMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.XidProcessedRequest, edu.sjsu.cs249.chain.ChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.HeadChainReplica", "xidProcessed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.XidProcessedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.ChainResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeadChainReplicaMethodDescriptorSupplier("xidProcessed"))
                  .build();
          }
        }
     }
     return getXidProcessedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeadChainReplicaStub newStub(io.grpc.Channel channel) {
    return new HeadChainReplicaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeadChainReplicaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeadChainReplicaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeadChainReplicaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeadChainReplicaFutureStub(channel);
  }

  /**
   */
  public static abstract class HeadChainReplicaImplBase implements io.grpc.BindableService {

    /**
     */
    public void proposeStateUpdate(edu.sjsu.cs249.chain.HeadStateUpdateRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProposeStateUpdateMethod(), responseObserver);
    }

    /**
     */
    public void getLatestXid(edu.sjsu.cs249.chain.LatestXidRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.LatestXidResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLatestXidMethod(), responseObserver);
    }

    /**
     */
    public void stateTransfer(edu.sjsu.cs249.chain.HeadStateTransferRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStateTransferMethod(), responseObserver);
    }

    /**
     */
    public void increment(edu.sjsu.cs249.chain.IncrementRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.HeadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementMethod(), responseObserver);
    }

    /**
     */
    public void delete(edu.sjsu.cs249.chain.DeleteRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.HeadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void get(edu.sjsu.cs249.chain.GetRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void xidProcessed(edu.sjsu.cs249.chain.XidProcessedRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getXidProcessedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProposeStateUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.HeadStateUpdateRequest,
                edu.sjsu.cs249.chain.ChainResponse>(
                  this, METHODID_PROPOSE_STATE_UPDATE)))
          .addMethod(
            getGetLatestXidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.LatestXidRequest,
                edu.sjsu.cs249.chain.LatestXidResponse>(
                  this, METHODID_GET_LATEST_XID)))
          .addMethod(
            getStateTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.HeadStateTransferRequest,
                edu.sjsu.cs249.chain.ChainResponse>(
                  this, METHODID_STATE_TRANSFER)))
          .addMethod(
            getIncrementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.IncrementRequest,
                edu.sjsu.cs249.chain.HeadResponse>(
                  this, METHODID_INCREMENT)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.DeleteRequest,
                edu.sjsu.cs249.chain.HeadResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.GetRequest,
                edu.sjsu.cs249.chain.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getXidProcessedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.XidProcessedRequest,
                edu.sjsu.cs249.chain.ChainResponse>(
                  this, METHODID_XID_PROCESSED)))
          .build();
    }
  }

  /**
   */
  public static final class HeadChainReplicaStub extends io.grpc.stub.AbstractStub<HeadChainReplicaStub> {
    private HeadChainReplicaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeadChainReplicaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeadChainReplicaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeadChainReplicaStub(channel, callOptions);
    }

    /**
     */
    public void proposeStateUpdate(edu.sjsu.cs249.chain.HeadStateUpdateRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProposeStateUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLatestXid(edu.sjsu.cs249.chain.LatestXidRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.LatestXidResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLatestXidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stateTransfer(edu.sjsu.cs249.chain.HeadStateTransferRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStateTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void increment(edu.sjsu.cs249.chain.IncrementRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.HeadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(edu.sjsu.cs249.chain.DeleteRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.HeadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(edu.sjsu.cs249.chain.GetRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void xidProcessed(edu.sjsu.cs249.chain.XidProcessedRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getXidProcessedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeadChainReplicaBlockingStub extends io.grpc.stub.AbstractStub<HeadChainReplicaBlockingStub> {
    private HeadChainReplicaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeadChainReplicaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeadChainReplicaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeadChainReplicaBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.sjsu.cs249.chain.ChainResponse proposeStateUpdate(edu.sjsu.cs249.chain.HeadStateUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getProposeStateUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.chain.LatestXidResponse getLatestXid(edu.sjsu.cs249.chain.LatestXidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLatestXidMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.chain.ChainResponse stateTransfer(edu.sjsu.cs249.chain.HeadStateTransferRequest request) {
      return blockingUnaryCall(
          getChannel(), getStateTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.chain.HeadResponse increment(edu.sjsu.cs249.chain.IncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.chain.HeadResponse delete(edu.sjsu.cs249.chain.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.chain.GetResponse get(edu.sjsu.cs249.chain.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public edu.sjsu.cs249.chain.ChainResponse xidProcessed(edu.sjsu.cs249.chain.XidProcessedRequest request) {
      return blockingUnaryCall(
          getChannel(), getXidProcessedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeadChainReplicaFutureStub extends io.grpc.stub.AbstractStub<HeadChainReplicaFutureStub> {
    private HeadChainReplicaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeadChainReplicaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeadChainReplicaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeadChainReplicaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.ChainResponse> proposeStateUpdate(
        edu.sjsu.cs249.chain.HeadStateUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProposeStateUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.LatestXidResponse> getLatestXid(
        edu.sjsu.cs249.chain.LatestXidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLatestXidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.ChainResponse> stateTransfer(
        edu.sjsu.cs249.chain.HeadStateTransferRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStateTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.HeadResponse> increment(
        edu.sjsu.cs249.chain.IncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.HeadResponse> delete(
        edu.sjsu.cs249.chain.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.GetResponse> get(
        edu.sjsu.cs249.chain.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.ChainResponse> xidProcessed(
        edu.sjsu.cs249.chain.XidProcessedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getXidProcessedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROPOSE_STATE_UPDATE = 0;
  private static final int METHODID_GET_LATEST_XID = 1;
  private static final int METHODID_STATE_TRANSFER = 2;
  private static final int METHODID_INCREMENT = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_GET = 5;
  private static final int METHODID_XID_PROCESSED = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeadChainReplicaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeadChainReplicaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROPOSE_STATE_UPDATE:
          serviceImpl.proposeStateUpdate((edu.sjsu.cs249.chain.HeadStateUpdateRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse>) responseObserver);
          break;
        case METHODID_GET_LATEST_XID:
          serviceImpl.getLatestXid((edu.sjsu.cs249.chain.LatestXidRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.LatestXidResponse>) responseObserver);
          break;
        case METHODID_STATE_TRANSFER:
          serviceImpl.stateTransfer((edu.sjsu.cs249.chain.HeadStateTransferRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse>) responseObserver);
          break;
        case METHODID_INCREMENT:
          serviceImpl.increment((edu.sjsu.cs249.chain.IncrementRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.HeadResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((edu.sjsu.cs249.chain.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.HeadResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((edu.sjsu.cs249.chain.GetRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.GetResponse>) responseObserver);
          break;
        case METHODID_XID_PROCESSED:
          serviceImpl.xidProcessed((edu.sjsu.cs249.chain.XidProcessedRequest) request,
              (io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HeadChainReplicaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeadChainReplicaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.sjsu.cs249.chain.Chain.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeadChainReplica");
    }
  }

  private static final class HeadChainReplicaFileDescriptorSupplier
      extends HeadChainReplicaBaseDescriptorSupplier {
    HeadChainReplicaFileDescriptorSupplier() {}
  }

  private static final class HeadChainReplicaMethodDescriptorSupplier
      extends HeadChainReplicaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeadChainReplicaMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HeadChainReplicaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeadChainReplicaFileDescriptorSupplier())
              .addMethod(getProposeStateUpdateMethod())
              .addMethod(getGetLatestXidMethod())
              .addMethod(getStateTransferMethod())
              .addMethod(getIncrementMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getXidProcessedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
