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
public final class TailClientGrpc {

  private TailClientGrpc() {}

  public static final String SERVICE_NAME = "adb.TailClient";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.CxidProcessedRequest,
      edu.sjsu.cs249.chain.ChainResponse> getCxidProcessedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cxidProcessed",
      requestType = edu.sjsu.cs249.chain.CxidProcessedRequest.class,
      responseType = edu.sjsu.cs249.chain.ChainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.CxidProcessedRequest,
      edu.sjsu.cs249.chain.ChainResponse> getCxidProcessedMethod() {
    io.grpc.MethodDescriptor<edu.sjsu.cs249.chain.CxidProcessedRequest, edu.sjsu.cs249.chain.ChainResponse> getCxidProcessedMethod;
    if ((getCxidProcessedMethod = TailClientGrpc.getCxidProcessedMethod) == null) {
      synchronized (TailClientGrpc.class) {
        if ((getCxidProcessedMethod = TailClientGrpc.getCxidProcessedMethod) == null) {
          TailClientGrpc.getCxidProcessedMethod = getCxidProcessedMethod = 
              io.grpc.MethodDescriptor.<edu.sjsu.cs249.chain.CxidProcessedRequest, edu.sjsu.cs249.chain.ChainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "adb.TailClient", "cxidProcessed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.CxidProcessedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  edu.sjsu.cs249.chain.ChainResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TailClientMethodDescriptorSupplier("cxidProcessed"))
                  .build();
          }
        }
     }
     return getCxidProcessedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TailClientStub newStub(io.grpc.Channel channel) {
    return new TailClientStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TailClientBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TailClientBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TailClientFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TailClientFutureStub(channel);
  }

  /**
   */
  public static abstract class TailClientImplBase implements io.grpc.BindableService {

    /**
     */
    public void cxidProcessed(edu.sjsu.cs249.chain.CxidProcessedRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCxidProcessedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCxidProcessedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                edu.sjsu.cs249.chain.CxidProcessedRequest,
                edu.sjsu.cs249.chain.ChainResponse>(
                  this, METHODID_CXID_PROCESSED)))
          .build();
    }
  }

  /**
   */
  public static final class TailClientStub extends io.grpc.stub.AbstractStub<TailClientStub> {
    private TailClientStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TailClientStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TailClientStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TailClientStub(channel, callOptions);
    }

    /**
     */
    public void cxidProcessed(edu.sjsu.cs249.chain.CxidProcessedRequest request,
        io.grpc.stub.StreamObserver<edu.sjsu.cs249.chain.ChainResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCxidProcessedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TailClientBlockingStub extends io.grpc.stub.AbstractStub<TailClientBlockingStub> {
    private TailClientBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TailClientBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TailClientBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TailClientBlockingStub(channel, callOptions);
    }

    /**
     */
    public edu.sjsu.cs249.chain.ChainResponse cxidProcessed(edu.sjsu.cs249.chain.CxidProcessedRequest request) {
      return blockingUnaryCall(
          getChannel(), getCxidProcessedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TailClientFutureStub extends io.grpc.stub.AbstractStub<TailClientFutureStub> {
    private TailClientFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TailClientFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TailClientFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TailClientFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<edu.sjsu.cs249.chain.ChainResponse> cxidProcessed(
        edu.sjsu.cs249.chain.CxidProcessedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCxidProcessedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CXID_PROCESSED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TailClientImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TailClientImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CXID_PROCESSED:
          serviceImpl.cxidProcessed((edu.sjsu.cs249.chain.CxidProcessedRequest) request,
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

  private static abstract class TailClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TailClientBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return edu.sjsu.cs249.chain.Chain.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TailClient");
    }
  }

  private static final class TailClientFileDescriptorSupplier
      extends TailClientBaseDescriptorSupplier {
    TailClientFileDescriptorSupplier() {}
  }

  private static final class TailClientMethodDescriptorSupplier
      extends TailClientBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TailClientMethodDescriptorSupplier(String methodName) {
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
      synchronized (TailClientGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TailClientFileDescriptorSupplier())
              .addMethod(getCxidProcessedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
