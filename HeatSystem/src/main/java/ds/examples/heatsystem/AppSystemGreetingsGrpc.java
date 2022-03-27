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
 * <pre>
 *this was me trying to make an app that could communicate to all the servers to controll them remotly but i relised this was not the way to do it
 *dont think what i intedned could be done with the knowledge i have
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: HeatSystem.proto")
public final class AppSystemGreetingsGrpc {

  private AppSystemGreetingsGrpc() {}

  public static final String SERVICE_NAME = "heatsystem.AppSystemGreetings";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ds.examples.heatsystem.HeatRequest,
      ds.examples.heatsystem.HeatReply> getAppSystemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "appSystem",
      requestType = ds.examples.heatsystem.HeatRequest.class,
      responseType = ds.examples.heatsystem.HeatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ds.examples.heatsystem.HeatRequest,
      ds.examples.heatsystem.HeatReply> getAppSystemMethod() {
    io.grpc.MethodDescriptor<ds.examples.heatsystem.HeatRequest, ds.examples.heatsystem.HeatReply> getAppSystemMethod;
    if ((getAppSystemMethod = AppSystemGreetingsGrpc.getAppSystemMethod) == null) {
      synchronized (AppSystemGreetingsGrpc.class) {
        if ((getAppSystemMethod = AppSystemGreetingsGrpc.getAppSystemMethod) == null) {
          AppSystemGreetingsGrpc.getAppSystemMethod = getAppSystemMethod = 
              io.grpc.MethodDescriptor.<ds.examples.heatsystem.HeatRequest, ds.examples.heatsystem.HeatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "heatsystem.AppSystemGreetings", "appSystem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.examples.heatsystem.HeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ds.examples.heatsystem.HeatReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AppSystemGreetingsMethodDescriptorSupplier("appSystem"))
                  .build();
          }
        }
     }
     return getAppSystemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppSystemGreetingsStub newStub(io.grpc.Channel channel) {
    return new AppSystemGreetingsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppSystemGreetingsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AppSystemGreetingsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppSystemGreetingsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AppSystemGreetingsFutureStub(channel);
  }

  /**
   * <pre>
   *this was me trying to make an app that could communicate to all the servers to controll them remotly but i relised this was not the way to do it
   *dont think what i intedned could be done with the knowledge i have
   * </pre>
   */
  public static abstract class AppSystemGreetingsImplBase implements io.grpc.BindableService {

    /**
     */
    public void appSystem(ds.examples.heatsystem.HeatRequest request,
        io.grpc.stub.StreamObserver<ds.examples.heatsystem.HeatReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAppSystemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAppSystemMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ds.examples.heatsystem.HeatRequest,
                ds.examples.heatsystem.HeatReply>(
                  this, METHODID_APP_SYSTEM)))
          .build();
    }
  }

  /**
   * <pre>
   *this was me trying to make an app that could communicate to all the servers to controll them remotly but i relised this was not the way to do it
   *dont think what i intedned could be done with the knowledge i have
   * </pre>
   */
  public static final class AppSystemGreetingsStub extends io.grpc.stub.AbstractStub<AppSystemGreetingsStub> {
    private AppSystemGreetingsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppSystemGreetingsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppSystemGreetingsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppSystemGreetingsStub(channel, callOptions);
    }

    /**
     */
    public void appSystem(ds.examples.heatsystem.HeatRequest request,
        io.grpc.stub.StreamObserver<ds.examples.heatsystem.HeatReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppSystemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *this was me trying to make an app that could communicate to all the servers to controll them remotly but i relised this was not the way to do it
   *dont think what i intedned could be done with the knowledge i have
   * </pre>
   */
  public static final class AppSystemGreetingsBlockingStub extends io.grpc.stub.AbstractStub<AppSystemGreetingsBlockingStub> {
    private AppSystemGreetingsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppSystemGreetingsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppSystemGreetingsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppSystemGreetingsBlockingStub(channel, callOptions);
    }

    /**
     */
    public ds.examples.heatsystem.HeatReply appSystem(ds.examples.heatsystem.HeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getAppSystemMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *this was me trying to make an app that could communicate to all the servers to controll them remotly but i relised this was not the way to do it
   *dont think what i intedned could be done with the knowledge i have
   * </pre>
   */
  public static final class AppSystemGreetingsFutureStub extends io.grpc.stub.AbstractStub<AppSystemGreetingsFutureStub> {
    private AppSystemGreetingsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AppSystemGreetingsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppSystemGreetingsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AppSystemGreetingsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ds.examples.heatsystem.HeatReply> appSystem(
        ds.examples.heatsystem.HeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAppSystemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APP_SYSTEM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppSystemGreetingsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppSystemGreetingsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APP_SYSTEM:
          serviceImpl.appSystem((ds.examples.heatsystem.HeatRequest) request,
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

  private static abstract class AppSystemGreetingsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppSystemGreetingsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ds.examples.heatsystem.HeatSystemServiceImp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppSystemGreetings");
    }
  }

  private static final class AppSystemGreetingsFileDescriptorSupplier
      extends AppSystemGreetingsBaseDescriptorSupplier {
    AppSystemGreetingsFileDescriptorSupplier() {}
  }

  private static final class AppSystemGreetingsMethodDescriptorSupplier
      extends AppSystemGreetingsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppSystemGreetingsMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppSystemGreetingsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppSystemGreetingsFileDescriptorSupplier())
              .addMethod(getAppSystemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
