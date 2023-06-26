package com.example.universitymanagement.model;
import javax.persistence.*;
@Entity
@Table(name = "universities")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long universityId;

    private String name;
    private String location;

    public Long getUniversityId() {

        return universityId;
    }

    public void setUniversityId(Long universityId) {

        this.universityId = universityId;
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




