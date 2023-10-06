package com.university.Subject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.university.Subject.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
	List<Subject> findAllBySubjectId(Long subjectId);

	@Query(value = "SELECT ss.studentId from student_subject ss where ss.subject_id = ?'subject_id'", nativeQuery = true)
	List<Long> findTeachersAndStudentsBySubjectId(@Param("subject_id") Long subject_id);

}
