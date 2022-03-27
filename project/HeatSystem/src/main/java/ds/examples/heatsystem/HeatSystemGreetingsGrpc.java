package ds.examples.heatsystem;

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
    comments = "Source: HeatSystem.proto")
public final class HeatSystemGreetingsGrpc {

  private HeatSystemGreetingsGrpc() {}

  public static final String SERVICE_NAME = "heatsystem.HeatSystemGreetings";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.examples.heatsystem.HeatRequest,
      ds.examples.heatsystem.HeatReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello",
      requestType = ds.examples.heatsystem.HeatRequest.class,
      responseType = ds.examples.heatsystem.HeatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.examples.heatsystem.HeatRequest,
      ds.examples.heatsystem.HeatReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<ds.examples.heatsystem.HeatRequest, ds.examples.heatsystem.HeatReply> getSayHelloMethod;
    if ((getSayHelloMethod = HeatSystemGreetingsGrpc.getSayHelloMethod) == null) {
      synchronized (HeatSystemGreetingsGrpc.class) {
        if ((getSayHelloMethod = HeatSystemGreetingsGrpc.getSayHelloMethod) == null) {
          HeatSystemGreetingsGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<ds.examples.heatsystem.HeatRequest, ds.examples.heatsystem.HeatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heatsystem.HeatSystemGreetings", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.examples.heatsystem.HeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.examples.heatsystem.HeatReply.getDefaultInstance()))
                  .setSchemaDescriptor(new HeatSystemGreetingsMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatSystemGreetingsStub newStub(io.grpc.Channel channel) {
    return new HeatSystemGreetingsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatSystemGreetingsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeatSystemGreetingsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatSystemGreetingsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeatSystemGreetingsFutureStub(channel);
  }

  /**
   */
  public static abstract class HeatSystemGreetingsImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(ds.examples.heatsystem.HeatRequest request,
        io.grpc.stub.StreamObserver<ds.examples.heatsystem.HeatReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.examples.heatsystem.HeatRequest,
                ds.examples.heatsystem.HeatReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HeatSystemGreetingsStub extends io.grpc.stub.AbstractStub<HeatSystemGreetingsStub> {
    private HeatSystemGreetingsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatSystemGreetingsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatSystemGreetingsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatSystemGreetingsStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(ds.examples.heatsystem.HeatRequest request,
        io.grpc.stub.StreamObserver<ds.examples.heatsystem.HeatReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeatSystemGreetingsBlockingStub extends io.grpc.stub.AbstractStub<HeatSystemGreetingsBlockingStub> {
    private HeatSystemGreetingsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatSystemGreetingsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatSystemGreetingsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatSystemGreetingsBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.examples.heatsystem.HeatReply sayHello(ds.examples.heatsystem.HeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeatSystemGreetingsFutureStub extends io.grpc.stub.AbstractStub<HeatSystemGreetingsFutureStub> {
    private HeatSystemGreetingsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeatSystemGreetingsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatSystemGreetingsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeatSystemGreetingsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.examples.heatsystem.HeatReply> sayHello(
        ds.examples.heatsystem.HeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatSystemGreetingsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatSystemGreetingsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((ds.examples.heatsystem.HeatRequest) request,
              (io.grpc.stub.StreamObserver<ds.examples.heatsystem.HeatReply>) responseObserver);
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

  private static abstract class HeatSystemGreetingsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeatSystemGreetingsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.examples.heatsystem.HeatSystemServiceImp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeatSystemGreetings");
    }
  }

  private static final class HeatSystemGreetingsFileDescriptorSupplier
      extends HeatSystemGreetingsBaseDescriptorSupplier {
    HeatSystemGreetingsFileDescriptorSupplier() {}
  }

  private static final class HeatSystemGreetingsMethodDescriptorSupplier
      extends HeatSystemGreetingsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeatSystemGreetingsMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeatSystemGreetingsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeatSystemGreetingsFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
