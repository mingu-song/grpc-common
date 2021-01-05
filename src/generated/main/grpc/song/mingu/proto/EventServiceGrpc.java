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
    comments = "Source: EventProto.proto")
public final class EventServiceGrpc {

  private EventServiceGrpc() {}

  public static final String SERVICE_NAME = "song.mingu.event.EventService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getUnaryEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryEvent",
      requestType = song.mingu.proto.EventRequest.class,
      responseType = song.mingu.proto.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getUnaryEventMethod() {
    io.grpc.MethodDescriptor<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse> getUnaryEventMethod;
    if ((getUnaryEventMethod = EventServiceGrpc.getUnaryEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getUnaryEventMethod = EventServiceGrpc.getUnaryEventMethod) == null) {
          EventServiceGrpc.getUnaryEventMethod = getUnaryEventMethod =
              io.grpc.MethodDescriptor.<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("unaryEvent"))
              .build();
        }
      }
    }
    return getUnaryEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getServerStreamingEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStreamingEvent",
      requestType = song.mingu.proto.EventRequest.class,
      responseType = song.mingu.proto.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getServerStreamingEventMethod() {
    io.grpc.MethodDescriptor<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse> getServerStreamingEventMethod;
    if ((getServerStreamingEventMethod = EventServiceGrpc.getServerStreamingEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getServerStreamingEventMethod = EventServiceGrpc.getServerStreamingEventMethod) == null) {
          EventServiceGrpc.getServerStreamingEventMethod = getServerStreamingEventMethod =
              io.grpc.MethodDescriptor.<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverStreamingEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("serverStreamingEvent"))
              .build();
        }
      }
    }
    return getServerStreamingEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getClientStreamingEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStreamingEvent",
      requestType = song.mingu.proto.EventRequest.class,
      responseType = song.mingu.proto.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getClientStreamingEventMethod() {
    io.grpc.MethodDescriptor<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse> getClientStreamingEventMethod;
    if ((getClientStreamingEventMethod = EventServiceGrpc.getClientStreamingEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getClientStreamingEventMethod = EventServiceGrpc.getClientStreamingEventMethod) == null) {
          EventServiceGrpc.getClientStreamingEventMethod = getClientStreamingEventMethod =
              io.grpc.MethodDescriptor.<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientStreamingEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("clientStreamingEvent"))
              .build();
        }
      }
    }
    return getClientStreamingEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getBiStreamingEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "biStreamingEvent",
      requestType = song.mingu.proto.EventRequest.class,
      responseType = song.mingu.proto.EventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<song.mingu.proto.EventRequest,
      song.mingu.proto.EventResponse> getBiStreamingEventMethod() {
    io.grpc.MethodDescriptor<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse> getBiStreamingEventMethod;
    if ((getBiStreamingEventMethod = EventServiceGrpc.getBiStreamingEventMethod) == null) {
      synchronized (EventServiceGrpc.class) {
        if ((getBiStreamingEventMethod = EventServiceGrpc.getBiStreamingEventMethod) == null) {
          EventServiceGrpc.getBiStreamingEventMethod = getBiStreamingEventMethod =
              io.grpc.MethodDescriptor.<song.mingu.proto.EventRequest, song.mingu.proto.EventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "biStreamingEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  song.mingu.proto.EventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EventServiceMethodDescriptorSupplier("biStreamingEvent"))
              .build();
        }
      }
    }
    return getBiStreamingEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceStub>() {
        @java.lang.Override
        public EventServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceStub(channel, callOptions);
        }
      };
    return EventServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceBlockingStub>() {
        @java.lang.Override
        public EventServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceBlockingStub(channel, callOptions);
        }
      };
    return EventServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventServiceFutureStub>() {
        @java.lang.Override
        public EventServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventServiceFutureStub(channel, callOptions);
        }
      };
    return EventServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EventServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *서버(1) : 클라이언트(1)
     *서버(N) : 클라이언트(1)
     *서버(1) : 클라이언트(N)
     *서버(N) : 클라이언트(M)
     * </pre>
     */
    public void unaryEvent(song.mingu.proto.EventRequest request,
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUnaryEventMethod(), responseObserver);
    }

    /**
     */
    public void serverStreamingEvent(song.mingu.proto.EventRequest request,
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getServerStreamingEventMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<song.mingu.proto.EventRequest> clientStreamingEvent(
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientStreamingEventMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<song.mingu.proto.EventRequest> biStreamingEvent(
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiStreamingEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                song.mingu.proto.EventRequest,
                song.mingu.proto.EventResponse>(
                  this, METHODID_UNARY_EVENT)))
          .addMethod(
            getServerStreamingEventMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                song.mingu.proto.EventRequest,
                song.mingu.proto.EventResponse>(
                  this, METHODID_SERVER_STREAMING_EVENT)))
          .addMethod(
            getClientStreamingEventMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                song.mingu.proto.EventRequest,
                song.mingu.proto.EventResponse>(
                  this, METHODID_CLIENT_STREAMING_EVENT)))
          .addMethod(
            getBiStreamingEventMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                song.mingu.proto.EventRequest,
                song.mingu.proto.EventResponse>(
                  this, METHODID_BI_STREAMING_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class EventServiceStub extends io.grpc.stub.AbstractAsyncStub<EventServiceStub> {
    private EventServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *서버(1) : 클라이언트(1)
     *서버(N) : 클라이언트(1)
     *서버(1) : 클라이언트(N)
     *서버(N) : 클라이언트(M)
     * </pre>
     */
    public void unaryEvent(song.mingu.proto.EventRequest request,
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnaryEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serverStreamingEvent(song.mingu.proto.EventRequest request,
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerStreamingEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<song.mingu.proto.EventRequest> clientStreamingEvent(
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingEventMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<song.mingu.proto.EventRequest> biStreamingEvent(
        io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiStreamingEventMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EventServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventServiceBlockingStub> {
    private EventServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *서버(1) : 클라이언트(1)
     *서버(N) : 클라이언트(1)
     *서버(1) : 클라이언트(N)
     *서버(N) : 클라이언트(M)
     * </pre>
     */
    public song.mingu.proto.EventResponse unaryEvent(song.mingu.proto.EventRequest request) {
      return blockingUnaryCall(
          getChannel(), getUnaryEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<song.mingu.proto.EventResponse> serverStreamingEvent(
        song.mingu.proto.EventRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getServerStreamingEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EventServiceFutureStub> {
    private EventServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *서버(1) : 클라이언트(1)
     *서버(N) : 클라이언트(1)
     *서버(1) : 클라이언트(N)
     *서버(N) : 클라이언트(M)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<song.mingu.proto.EventResponse> unaryEvent(
        song.mingu.proto.EventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUnaryEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_EVENT = 0;
  private static final int METHODID_SERVER_STREAMING_EVENT = 1;
  private static final int METHODID_CLIENT_STREAMING_EVENT = 2;
  private static final int METHODID_BI_STREAMING_EVENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_EVENT:
          serviceImpl.unaryEvent((song.mingu.proto.EventRequest) request,
              (io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAMING_EVENT:
          serviceImpl.serverStreamingEvent((song.mingu.proto.EventRequest) request,
              (io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse>) responseObserver);
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
        case METHODID_CLIENT_STREAMING_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreamingEvent(
              (io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse>) responseObserver);
        case METHODID_BI_STREAMING_EVENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biStreamingEvent(
              (io.grpc.stub.StreamObserver<song.mingu.proto.EventResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return song.mingu.proto.EventProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventService");
    }
  }

  private static final class EventServiceFileDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier {
    EventServiceFileDescriptorSupplier() {}
  }

  private static final class EventServiceMethodDescriptorSupplier
      extends EventServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventServiceFileDescriptorSupplier())
              .addMethod(getUnaryEventMethod())
              .addMethod(getServerStreamingEventMethod())
              .addMethod(getClientStreamingEventMethod())
              .addMethod(getBiStreamingEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
