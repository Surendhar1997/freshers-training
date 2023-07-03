package com.example.universitymanagement.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Course")
@Table(name = "courses")
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long 
	serialVersionUID = -8925575346024884314L;

	@Id
	@Column(name = "courseid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseid;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "departmentid")
	private Department departmentid;

//	@JoinTable(name = "employeecourses", joinColumns = { @JoinColumn(name = "courseid") }, inverseJoinColumns = {
//			@JoinColumn(name = "employeeid") }
//	)
//	@ManyToMany(cascade = CascadeType.ALL)
	@ManyToMany(mappedBy = "courses")
	private Set<Employee> employees;

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

	public Department getDepartmentid() {
		return departmentid;
	}
	
	public void setDepartmentId(Department departmentid) {

        this.departmentid = departmentid;
    }

	public Set<Employee> getEmployees() {
		return employees;
	}

}
