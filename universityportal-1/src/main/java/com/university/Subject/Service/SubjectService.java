package com.university.Subject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.Student.Entity.Student;
import com.university.Subject.Entity.Subject;
import com.university.Subject.Repository.SubjectRepository;
import com.university.Subject.SubjectDetails.SubjectDetails;
import com.university.Teacher.Entity.Teacher;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	public Subject saveSubject(Subject subjectObj) {
		return subjectRepository.save(subjectObj);
	}

	public List<Subject> getSubjectDetails(Long subjectId) {
		if (null != subjectId) {
			return subjectRepository.findAllBySubjectId(subjectId);
		} else {
			return subjectRepository.findAll();
		}
	}

	public void deleteSubject(Long subjectId) {
		subjectRepository.deleteById(subjectId);
	}

	public SubjectDetails getSubjectfullDetails(Long subjectId) {
//		List<Object> result = subjectRepository.findTeachersAndStudentsBySubjectId(subjectId);
//
//		System.out.println(result);
//        if (result != null && result.size() == 2) {
//            List<Teacher> teachers = (List<Teacher>) result.get(0);
//            List<Student> students = (List<Student>) result.get(1);
//           
//            return new SubjectDetails(teachers, students);
//        }

		List<Long> result = subjectRepository.findTeachersAndStudentsBySubjectId(subjectId);
		System.out.println(result);
		return new SubjectDetails(new ArrayList<>(), new ArrayList<>());

	}

}
