package com.example.protobufserver

import com.example.protobufserver.proto.aikibo.Training

class CourseRepository(
    private var courses: Map<Int, Training.CourseTwo>
) {

//    fun getCourse(id: Int) = this.courses.get(id)

}