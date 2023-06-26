package com.example.universitymanagement.model;

import jakarta.persistence.*;

@Entity(name = "Course")
@Table(name = "courses")
public class Course {

    @Id
    @Column(name = "courseid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseid;
    
    @Column(name = "title")
    private String title;
    
    @Column(name = "description")
    private String description;

    public Long getCourseId() {

        return courseid;
    }

    public void setCourseId(Long courseid) {

        this.courseid = courseid;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

}
