package com.example.protobufserver.proto.aikibo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: training.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CourseServiceTwoGrpc {

  private CourseServiceTwoGrpc() {}

  public static final java.lang.String SERVICE_NAME = "tester.CourseServiceTwo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.protobufserver.proto.aikibo.Training.CourseTwo> getGetCourseByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCourseById",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.example.protobufserver.proto.aikibo.Training.CourseTwo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.protobufserver.proto.aikibo.Training.CourseTwo> getGetCourseByIdMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.example.protobufserver.proto.aikibo.Training.CourseTwo> getGetCourseByIdMethod;
    if ((getGetCourseByIdMethod = CourseServiceTwoGrpc.getGetCourseByIdMethod) == null) {
      synchronized (CourseServiceTwoGrpc.class) {
        if ((getGetCourseByIdMethod = CourseServiceTwoGrpc.getGetCourseByIdMethod) == null) {
          CourseServiceTwoGrpc.getGetCourseByIdMethod = getGetCourseByIdMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.example.protobufserver.proto.aikibo.Training.CourseTwo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCourseById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.protobufserver.proto.aikibo.Training.CourseTwo.getDefaultInstance()))
              .setSchemaDescriptor(new CourseServiceTwoMethodDescriptorSupplier("getCourseById"))
              .build();
        }
      }
    }
    return getGetCourseByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CourseServiceTwoStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseServiceTwoStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseServiceTwoStub>() {
        @java.lang.Override
        public CourseServiceTwoStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseServiceTwoStub(channel, callOptions);
        }
      };
    return CourseServiceTwoStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CourseServiceTwoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseServiceTwoBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseServiceTwoBlockingStub>() {
        @java.lang.Override
        public CourseServiceTwoBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseServiceTwoBlockingStub(channel, callOptions);
        }
      };
    return CourseServiceTwoBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CourseServiceTwoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseServiceTwoFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseServiceTwoFutureStub>() {
        @java.lang.Override
        public CourseServiceTwoFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseServiceTwoFutureStub(channel, callOptions);
        }
      };
    return CourseServiceTwoFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getCourseById(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.example.protobufserver.proto.aikibo.Training.CourseTwo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseByIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CourseServiceTwo.
   */
  public static abstract class CourseServiceTwoImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CourseServiceTwoGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CourseServiceTwo.
   */
  public static final class CourseServiceTwoStub
      extends io.grpc.stub.AbstractAsyncStub<CourseServiceTwoStub> {
    private CourseServiceTwoStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseServiceTwoStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseServiceTwoStub(channel, callOptions);
    }

    /**
     */
    public void getCourseById(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.example.protobufserver.proto.aikibo.Training.CourseTwo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CourseServiceTwo.
   */
  public static final class CourseServiceTwoBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CourseServiceTwoBlockingStub> {
    private CourseServiceTwoBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseServiceTwoBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseServiceTwoBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.protobufserver.proto.aikibo.Training.CourseTwo getCourseById(com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CourseServiceTwo.
   */
  public static final class CourseServiceTwoFutureStub
      extends io.grpc.stub.AbstractFutureStub<CourseServiceTwoFutureStub> {
    private CourseServiceTwoFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseServiceTwoFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseServiceTwoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.protobufserver.proto.aikibo.Training.CourseTwo> getCourseById(
        com.google.protobuf.Int32Value request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COURSE_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COURSE_BY_ID:
          serviceImpl.getCourseById((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<com.example.protobufserver.proto.aikibo.Training.CourseTwo>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetCourseByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Int32Value,
              com.example.protobufserver.proto.aikibo.Training.CourseTwo>(
                service, METHODID_GET_COURSE_BY_ID)))
        .build();
  }

  private static abstract class CourseServiceTwoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CourseServiceTwoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.protobufserver.proto.aikibo.Training.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CourseServiceTwo");
    }
  }

  private static final class CourseServiceTwoFileDescriptorSupplier
      extends CourseServiceTwoBaseDescriptorSupplier {
    CourseServiceTwoFileDescriptorSupplier() {}
  }

  private static final class CourseServiceTwoMethodDescriptorSupplier
      extends CourseServiceTwoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CourseServiceTwoMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CourseServiceTwoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CourseServiceTwoFileDescriptorSupplier())
              .addMethod(getGetCourseByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
