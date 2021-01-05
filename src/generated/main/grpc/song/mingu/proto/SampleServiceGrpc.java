package song.mingu.proto;

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
    value = "by gRPC proto compiler (version 1.34.1)",
    comments = "Source: SampleProto.proto")
public final class SampleServiceGrpc {

  private SampleServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.sample.SampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<song.mingu.proto.SampleRequest,
      song.mingu.proto.SampleResponse> getSampleCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SampleCall",
      requestType = song.mingu.proto.SampleRequest.class,
      responseType = song.mingu.proto.SampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<song.mingu.proto.SampleRequest,
      song.mingu.proto.SampleResponse> getSampleCallMethod() {
    io.grpc.MethodDescriptor<song.mingu.proto.SampleRequest, song.mingu.proto.SampleResponse> getSampleCallMethod;
    if ((getSampleCallMethod = SampleServiceGrpc.getSampleCallMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getSampleCallMethod = SampleServiceGrpc.getSampleCallMethod) == null) {
          SampleServiceGrpc.getSampleCallMethod = getSampleCallMethod =
              io.grpc.MethodDescriptor.<song.mingu.proto.SampleRequest, song.mingu.proto.SampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SampleCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.SampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.SampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("SampleCall"))
              .build();
        }
      }
    }
    return getSampleCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceStub>() {
        @java.lang.Override
        public SampleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceStub(channel, callOptions);
        }
      };
    return SampleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceBlockingStub>() {
        @java.lang.Override
        public SampleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceBlockingStub(channel, callOptions);
        }
      };
    return SampleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceFutureStub>() {
        @java.lang.Override
        public SampleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceFutureStub(channel, callOptions);
        }
      };
    return SampleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SampleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sampleCall(song.mingu.proto.SampleRequest request,
        io.grpc.stub.StreamObserver<song.mingu.proto.SampleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSampleCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSampleCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                song.mingu.proto.SampleRequest,
                song.mingu.proto.SampleResponse>(
                  this, METHODID_SAMPLE_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class SampleServiceStub extends io.grpc.stub.AbstractAsyncStub<SampleServiceStub> {
    private SampleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void sampleCall(song.mingu.proto.SampleRequest request,
        io.grpc.stub.StreamObserver<song.mingu.proto.SampleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSampleCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SampleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SampleServiceBlockingStub> {
    private SampleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public song.mingu.proto.SampleResponse sampleCall(song.mingu.proto.SampleRequest request) {
      return blockingUnaryCall(
          getChannel(), getSampleCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SampleServiceFutureStub> {
    private SampleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<song.mingu.proto.SampleResponse> sampleCall(
        song.mingu.proto.SampleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSampleCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAMPLE_CALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAMPLE_CALL:
          serviceImpl.sampleCall((song.mingu.proto.SampleRequest) request,
              (io.grpc.stub.StreamObserver<song.mingu.proto.SampleResponse>) responseObserver);
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

  private static abstract class SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return song.mingu.proto.SampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SampleService");
    }
  }

  private static final class SampleServiceFileDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier {
    SampleServiceFileDescriptorSupplier() {}
  }

  private static final class SampleServiceMethodDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleServiceFileDescriptorSupplier())
              .addMethod(getSampleCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
