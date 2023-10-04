package com.example.universitymanagement.controller;



import com.example.universitymanagement.model.Employee;
import com.example.universitymanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    @GetMapping("/api/employees")
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }

    @GetMapping("/api/employees/{employeeid}")
    public Employee getEmployeeById(@PathVariable Long employeeid) {
        return employeeService.getEmployeeById(employeeid);
    }

    @PostMapping("/api/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/api/employees/{employeeid}")
    public Employee updateEmployee(@PathVariable Long employeeid, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(employeeid, updatedEmployee);
    }

    @DeleteMapping("/api/employees/{employeeid}")
    public void deleteEmployee(@PathVariable Long employeeid) {
        employeeService.deleteEmployee(employeeid);
    }
}
