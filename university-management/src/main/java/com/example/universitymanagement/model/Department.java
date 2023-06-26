package com.example.universitymanagement.model;


import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String name;

    public Long getDepartmentId() {

        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {

        this.departmentId = departmentId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public University getUniversity() {

        return university;
    }

    public void setUniversity(University university) {

        this.university = university;
    }

//    @ManyToOne
//        @JoinColumn(name = "university_id")
        private University university;
}
