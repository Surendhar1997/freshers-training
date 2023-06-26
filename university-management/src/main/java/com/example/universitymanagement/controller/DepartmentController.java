package com.example.universitymanagement.controller;



import com.example.universitymanagement.model.Department;
import com.example.universitymanagement.service.DepartmentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Department> getAllDepartments() {

        return departmentService.getAllDepartments();
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @PutMapping("/{departmentId}")
    public Department updateDepartment(@PathVariable Long departmentId, @RequestBody Department updatedDepartment) {
        return departmentService.updateDepartment(departmentId, updatedDepartment);
    }

    @DeleteMapping("/{departmentId}")
    public void deleteDepartment(@PathVariable Long departmentId) {

        departmentService.deleteDepartment(departmentId);
    }
}
