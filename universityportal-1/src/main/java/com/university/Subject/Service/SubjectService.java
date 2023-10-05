package com.university.Subject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.Subject.Entity.Subject;
import com.university.Subject.Repository.SubjectRepository;


@Service
public class SubjectService {

	@Autowired
    private SubjectRepository subjectRepository;

    public  Subject saveSubject(Subject subjectObj) {
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
}


