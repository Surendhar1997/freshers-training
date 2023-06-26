package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Course;
import com.example.universitymanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {

        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {

        return courseService.getAllCourses();
    }

    @GetMapping("/{courseId}")
    public Course getCourseById(@PathVariable Long courseId) {

        return courseService.getCourseById(courseId);
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {

        return courseService.createCourse(course);
    }

    @PutMapping("/{courseId}")
    public Course updateCourse(@PathVariable Long courseId, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(courseId, updatedCourse);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Long courseId) {

        courseService.deleteCourse(courseId);
    }
}
