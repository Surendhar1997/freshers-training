package com.example.universitymanagement.repository;
import com.example.universitymanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
