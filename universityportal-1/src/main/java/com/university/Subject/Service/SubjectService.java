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

    public void saveSubject(Subject subjectObj) {
    	subjectRepository.save(subjectObj);
    }

    public List<Subject> getSubjectDetails(Long subject_id) {
        if (null != subject_id) {
            return subjectRepository.findAllBySubject_Id(subject_id);
        } else {
            return subjectRepository.findAll();
        }
    }

    public void deleteSubject(Long subject_id) {
    	subjectRepository.deleteById(subject_id);
    }
}


