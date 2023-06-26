package com.example.universitymanagement.service;
import com.example.universitymanagement.model.Employee;
import com.example.universitymanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.persistence.EntityNotFoundException;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with ID: " + employeeId));
    }

    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {
        Employee employee = getEmployeeById(employeeId);
        employee.setName(updatedEmployee.getName());
        employee.setPosition(updatedEmployee.getPosition());
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId) {

        employeeRepository.deleteById(employeeId);
    }
}
