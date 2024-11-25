package com.Employee.Employee.Controller;

import com.Employee.Employee.Employee;
import com.Employee.Employee.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServices services;

    // Endpoint to get all employees
    @GetMapping("/api/employees")
    public List<Employee> getAllEmployees() {
        return services.getAllEmployee();
    }

    // Endpoint to get an employee by ID
    @GetMapping("/api/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        Employee employee = services.getEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // Endpoint to add a new employee
    @PostMapping("/api/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        services.addEmployee(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    // Endpoint to update an existing employee
    @PutMapping("/api/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        updatedEmployee.setEmpId(id);
        services.updateEmployee(updatedEmployee);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }

    // Endpoint to delete an employee by ID
    @DeleteMapping("/api/employees/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable int id) {
        services.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
