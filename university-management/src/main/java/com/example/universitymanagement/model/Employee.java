package com.example.universitymanagement.model;
import jakarta.persistence.*;

@Entity(name = "Employee")
@Table(name = "employees")
public class Employee {
	
    @Id
    @Column(name = "employeeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "position")
    private String position;

    public Long getEmployeeId() {

        return employeeid;
    }

    public void setEmployeeId(Long employeeid) {

        this.employeeid = employeeid;
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

}
