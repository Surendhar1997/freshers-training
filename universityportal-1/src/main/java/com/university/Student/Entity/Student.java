package com.university.Student.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.university.Subject.Entity.Subject;

import lombok.Data;

@Entity
@Data
public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long student_id;
	    private String student_name;

	    @ManyToMany
	    @JoinTable(name = "studentsubject",
	            joinColumns = @JoinColumn(name = "student_id"),
	            inverseJoinColumns = @JoinColumn(name = "subject_id")
	    )
	    private Set<Subject> assignedSubjects = new HashSet<>();

		public void setAssignedSubjects(Set<Subject> subjectSet) {
			// TODO Auto-generated method stub
			
		}

		public Set<Subject> getAssignedSubjects() {
			// TODO Auto-generated method stub
			return null;
		}
	}
