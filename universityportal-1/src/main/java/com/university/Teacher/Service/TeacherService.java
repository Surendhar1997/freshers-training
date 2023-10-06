package com.university.Teacher.Service;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.Student.Entity.Student;
import com.university.Student.Repository.StudentRepository;
import com.university.Subject.Entity.Subject;
import com.university.Subject.Repository.SubjectRepository;
import com.university.Teacher.Entity.Teacher;
import com.university.Teacher.Repository.TeacherRepository;


@Service
public class TeacherService {
	

		@Autowired
	    private TeacherRepository teacherRepository;

		@Autowired
		private SubjectRepository subjectRepository;
		
		
	    public Teacher saveTeacher(Teacher teacherObj) {
	        return teacherRepository.save(teacherObj);
	    }

	    public List<Teacher> getTeacherDetails(Long teacherId) {
	        if (null != teacherId) {
	            return teacherRepository.findAllByTeacherId(teacherId);
	        } else {
	            return teacherRepository.findAll();
	        }
	    }

	    
	    public Teacher assignSubjectToTeacher(Long teacherId, Long subjectId) {
	        Set<com.university.Subject.Entity.Subject> subjectSet = null;
	        Teacher teacher = teacherRepository.findById(teacherId).get();
	        Subject subject = subjectRepository.findById(subjectId).get();
	        subjectSet =  teacher.getAssignedSubjects();
	        subjectSet.add(subject);
	        teacher.setAssignedSubjects(subjectSet);
	        return teacherRepository.save(teacher);
	    }

	    public Teacher removeSubjectFromTeacher(Long teacherId, Long subjectId) {
	       Teacher teacher = teacherRepository.findById(teacherId).get();
	        Subject subject = subjectRepository.findById(subjectId).get();
	        teacher.removeSubject(subject);
	        teacherRepository.save(teacher);

	        return teacher;
	    }


	
	}



