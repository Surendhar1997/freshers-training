package com.university.Student.Service;

import com.university.Subject.Entity.*;
import com.university.Subject.Repository.SubjectRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.Student.Entity.Student;
import com.university.Student.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
    private StudentRepository studentRepository;

	@Autowired
	private SubjectRepository subjectRepository;
	
	
    public Student saveStudent(Student studentObj) {
        return studentRepository.save(studentObj);
    }

    public List<Student> getStudentDetails(Long studentId) {
        if (null != studentId) {
            return studentRepository.findAllByStudentId(studentId);
        } else {
            return studentRepository.findAll();
        }
    }

    public Student deleteStudent(Long studentId) {
        Optional<Student> studentOptional = studentRepository.findById(studentId);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            studentRepository.deleteById(studentId);
            return student;
        } else {
            // Handle the case where the student with the given ID does not exist
            throw new EntityNotFoundException("Student with ID " + studentId + " not found");
        }
    }


    public Student assignSubjectToStudent(Long studentId, Long subjectId) {
        Set<com.university.Subject.Entity.Subject> subjectSet = null;
        Student student = studentRepository.findById(studentId).get();
        Subject subject = subjectRepository.findById(subjectId).get();
        subjectSet =  student.getAssignedSubjects();
        subjectSet.add(subject);
        student.setAssignedSubjects(subjectSet);
        return studentRepository.save(student);
    }
}

