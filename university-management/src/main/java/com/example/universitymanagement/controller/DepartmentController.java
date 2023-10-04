package com.example.universitymanagement.controller;



import com.example.universitymanagement.model.Department;
import com.example.universitymanagement.service.DepartmentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
//@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }

    @GetMapping("/api/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/api/departments/{departmentid}")
    public Department getDepartmentById(@PathVariable Long departmentid) {
        return departmentService.getDepartmentById(departmentid);
    }

    @PostMapping("/api/department")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @PutMapping("/api/departments/{departmentid}")
    public Department updateDepartment(@PathVariable Long departmentid, @RequestBody Department updatedDepartment) {
        return departmentService.updateDepartment(departmentid, updatedDepartment);
    }

    @DeleteMapping("/api/departments/{departmentid}")
    public void deleteDepartment(@PathVariable Long departmentid) {
        departmentService.deleteDepartment(departmentid);
    }
}
