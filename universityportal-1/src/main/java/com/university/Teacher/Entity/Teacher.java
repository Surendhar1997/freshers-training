package com.university.Teacher.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.university.Subject.Entity.Subject;

import lombok.Data;

@Entity
@Data
public class Teacher {
	
		private String teacherName;

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long teacherId;



		@ManyToMany
		@JoinTable(name = "teacher_subject", joinColumns = @JoinColumn(name = "teacher_id"), inverseJoinColumns = @JoinColumn(name = "subject_id"))

		private Set<Subject> assignedSubjects = new HashSet();

		

		public void removeSubject(Subject subject) {
			// TODO Auto-generated method stub
		        if (assignedSubjects != null) {
		            assignedSubjects.remove(subject);
		        }
		}
	}

