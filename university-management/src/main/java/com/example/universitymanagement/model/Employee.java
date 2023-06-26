package com.example.universitymanagement.model;
import javax.persistence.*;
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String name;
    private String position;

    public Long getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {

        this.employeeId = employeeId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPosition() {

        return position;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {

        this.department = department;
    }

//    @ManyToOne
//    @JoinColumn(name = "department_id")
    private Department department;

}
