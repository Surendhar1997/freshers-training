package com.example.universitymanagement.service;

import javax.persistence.EntityNotFoundException;
import com.example.universitymanagement.model.Course;
import com.example.universitymanagement.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {

        this.courseRepository = courseRepository;
    }

    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    public Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow(() -> new EntityNotFoundException("Course not found with ID: " + courseId));
    }

    public Course createCourse(Course course) {

        return courseRepository.save(course);
    }

    public Course updateCourse(Long courseId, Course updatedCourse) {
        Course course = getCourseById(courseId);
        course.setTitle(updatedCourse.getTitle());
        course.setDescription(updatedCourse.getDescription());
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId) {

        courseRepository.deleteById(courseId);
    }
}
