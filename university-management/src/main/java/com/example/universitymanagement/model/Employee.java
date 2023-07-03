package com.example.universitymanagement.model;

import java.io.Serializable;
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

@Entity(name = "Employee")
@Table(name = "employees")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8190319926710666246L;

	@Id
	@Column(name = "employeeid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeid;

	@Column(name = "name")
	private String name;

	@Column(name = "position")
	private String position;

	@ManyToOne
	@JoinColumn(name = "departmentid")
	private Department departmentid;

//	@ManyToMany(mappedBy = "employees",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "employeecourses", joinColumns = { @JoinColumn(name = "employeeid") }, inverseJoinColumns = {
			@JoinColumn(name = "courseid") })
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courses;

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

	public Department getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentId(Department departmentid) {

		this.departmentid = departmentid;
	}

//	public Set<Course> getCourses() {
//		return courses;
//	}
}
