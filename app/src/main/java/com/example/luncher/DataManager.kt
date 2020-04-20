package com.example.luncher

class DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        createCourses()
    }

    private fun createCourses() {
        var course = CourseInfo("responsive_websites", "Responsive Websites")

        courses.set(course.id, course)

        course = CourseInfo(title = "HTTP Methods", id = "http_methods")
        courses.set(course.id, course)

        course = CourseInfo(id = "css_grids", title = "CSS Grids")
        courses.set(course.id, course)

        course = CourseInfo("html_101", "HTML 101")
        courses.set(course.id, course)
    }

}