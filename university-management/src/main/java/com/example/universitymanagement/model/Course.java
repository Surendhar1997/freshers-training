package com.example.universitymanagement.model;


import javax.persistence.*;

@Entity
@Table(name = "courses")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String title;
    private String description;

    public Long getCourseId() {

        return courseId;
    }

    public void setCourseId(Long courseId) {

        this.courseId = courseId;
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

    public Employee getInstructor() {

        return instructor;
    }

    public void setInstructor(Employee instructor) {

        this.instructor = instructor;
    }

//    @ManyToOne
//    @JoinColumn(name = "instructor_id")
    private Employee instructor;


}
