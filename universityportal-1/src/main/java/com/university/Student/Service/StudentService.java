package com.university.Student.Service;

import com.university.Subject.Entity.*;
import com.university.Subject.Repository.SubjectRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.Student.Entity.Student;
import com.university.Student.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
    private StudentRepository studentRepository;

    public void saveStudent(Student studentObj) {
        studentRepository.save(studentObj);
    }

    public List<Student> getStudentDetails(Long student_id) {
        if (null != student_id) {
            return studentRepository.findAllByStudent_Id(student_id);
        } else {
            return studentRepository.findAll();
        }
    }

    public void deleteStudent(Long student_id) {
        studentRepository.deleteById(student_id);
    }

    public Student assignSubjectToStudent(Long student_id, Long subject_id) {
        Set<com.university.Subject.Entity.Subject> subjectSet = null;
        Student student = studentRepository.findById(student_id).get();
        Subject subject = new Subject();
        subjectSet =  student.getAssignedSubjects();
        subjectSet.add(subject);
        student.setAssignedSubjects(subjectSet);
        return studentRepository.save(student);
    }
}


