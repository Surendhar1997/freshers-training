package com.university.Student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.Student.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{



	List<Student> findAllByStudentId(Long studentId);
		
	List<Student> findAllByStudentIdIsNull();
	}

	


