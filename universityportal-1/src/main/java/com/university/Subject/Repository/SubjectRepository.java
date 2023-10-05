package com.university.Subject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.university.Subject.Entity.Subject;


public interface SubjectRepository extends JpaRepository<Subject, Long> {
    List<Subject> findAllBySubjectId(Long subjectId);
} 