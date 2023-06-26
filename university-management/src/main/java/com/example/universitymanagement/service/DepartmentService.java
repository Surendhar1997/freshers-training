package com.example.universitymanagement.service;


import com.example.universitymanagement.model.Department;
import com.example.universitymanagement.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getAllDepartments() {

        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId)
                .orElseThrow(() -> new EntityNotFoundException("Department not found with ID: " + departmentId));
    }

    public Department createDepartment(Department department) {

        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long departmentId, Department updatedDepartment) {
        Department department = getDepartmentById(departmentId);
        department.setName(updatedDepartment.getName());
        return departmentRepository.save(department);
    }

    public void deleteDepartment(Long departmentId) {

        departmentRepository.deleteById(departmentId);
    }
}
