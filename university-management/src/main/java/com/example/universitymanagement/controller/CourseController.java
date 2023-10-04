package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Course;
import com.example.universitymanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {

        this.courseService = courseService;
    }

    @GetMapping("/api/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/api/courses/{courseid}")
    public Course getCourseById(@PathVariable Long courseid) {

        return courseService.getCourseById(courseid);
    }

    @PostMapping("/api/course")
    public Course createCourse(@RequestBody Course course) {

        return courseService.createCourse(course);
    }

    @PutMapping("/api/courses/{courseid}")
    public Course updateCourse(@PathVariable Long courseid, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(courseid, updatedCourse);
    }
    
    @DeleteMapping("/api/courses/{courseid}")
    public void deleteCourse(@PathVariable Long courseid) {
        courseService.deleteCourse(courseid);
    }
}
