package com.example.luncher

data class CourseInfo(val id: String, val title: String)

data class NoteInfo(var courseInfo: CourseInfo, val title: String, val text: String)
