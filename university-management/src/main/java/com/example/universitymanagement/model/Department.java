package com.example.universitymanagement.model;


import jakarta.persistence.*;

@Entity(name = "Department")
@Table(name = "departments")
public class Department {
    @Id
//    @Column(name = "departmentid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentid;
    
//    @Column(name = "name")
    private String name;

    public Long getDepartmentId() {

        return departmentid;
    }

    public void setDepartmentId(Long departmentid) {

        this.departmentid = departmentid;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

   
}
