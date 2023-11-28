package com.example.protobufserver.services

import com.example.protobufserver.proto.aikibo.CourseServiceTwoGrpc.CourseServiceTwoImplBase
import com.example.protobufserver.proto.aikibo.Training.CourseTwo
import com.example.protobufserver.repo.CourseRepo
import com.google.protobuf.Int32Value
import io.grpc.stub.StreamObserver
import net.devh.boot.grpc.server.service.GrpcService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired

@GrpcService
public class CourseService: CourseServiceTwoImplBase() {

    @Autowired
    lateinit var repo: CourseRepo
    val log = LoggerFactory.getLogger(CourseService::class.java)

    override fun getCourseById(id: Int32Value?, responseObserver: StreamObserver<CourseTwo>?) {
        log.info("masuk ke getCourseById()")
        var courses = repo.findById(id?.value)
        if(courses.isPresent) {
            responseObserver?.onNext(courses.get())
            responseObserver?.onCompleted()
        } else {
            responseObserver?.onError(Throwable("Data dengan id $id tidak ditemukan"))
        }
    }
}