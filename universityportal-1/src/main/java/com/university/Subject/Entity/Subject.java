package com.university.Subject.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.university.Student.Entity.Student;


import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "SUBJECT")

public class Subject {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long subjectId;
	    private String subjectName;

	    @JsonIgnore
	    @ManyToMany(mappedBy = "assignedSubjects")
	    private Set<Student> studentSet = new HashSet<>();
	}

 