package com.example.luncher

class CourseInfo(val id: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

class NoteInfo(var courseInfo: CourseInfo, val title: String, val text: String)
