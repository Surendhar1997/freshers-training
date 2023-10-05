package com.university.Student.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.university.Subject.Entity.Subject;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Student {
	private String studentName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;



	@ManyToMany
	@JoinTable(name = "student_subject", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))

	private Set<Subject> assignedSubjects = new HashSet();
}