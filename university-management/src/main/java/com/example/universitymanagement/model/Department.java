package com.example.universitymanagement.model;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Department")
@Table(name = "departments")
public class Department  implements Serializable{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 5119983946909971315L;

	@Id
    @Column(name = "departmentid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentid;
    
    @Column(name = "name")
    private String name;
    
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Course> courses;
    

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
    
//    @OneToMany(mappedBy = "departments", cascade = CascadeType.ALL, orphanRemoval = true)    
//
//    private List<Course> courses = new ArrayList<>();

   
}
