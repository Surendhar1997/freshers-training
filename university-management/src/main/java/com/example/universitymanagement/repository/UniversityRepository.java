package com.example.universitymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.universitymanagement.model.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
