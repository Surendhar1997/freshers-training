package com.university.Subject.SubjectDetails;
import java.util.List;

import com.university.Student.Entity.Student;
import com.university.Teacher.Entity.Teacher;

import lombok.Data;

@Data
public class SubjectDetails{

	    private List<Student> students;
	    private List<Teacher> teachers;

	    public SubjectDetails(List<Teacher> teachers, List<Student> students) {
	        this.teachers = teachers;
	        this.students = students;
	    }

	 
	}

