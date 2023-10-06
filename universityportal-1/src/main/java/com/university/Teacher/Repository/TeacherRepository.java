package com.university.Teacher.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.Teacher.Entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher,Long>{



	List<Teacher> findAllByTeacherId(Long teacherId);
		
	List<Teacher> findAllByTeacherIdIsNull();


}
