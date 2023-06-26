package com.example.universitymanagement.model;
import jakarta.persistence.*;

@Entity(name = "University")
@Table(name = "universities")
public class University {

    @Id
    @Column(name = "universityid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long universityid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "location")
    private String location;

    public Long getUniversityId() {

        return universityid;
    }

    public void setUniversityId(Long universityid) {

        this.universityid = universityid;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLocation() {

        return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }
}




