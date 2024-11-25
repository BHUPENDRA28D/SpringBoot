package com.Employee.Employee.Services;

import com.Employee.Employee.DAO.EmployeeDao;
import com.Employee.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class EmployeeServices {

    @Autowired
    private EmployeeDao dao;

    // Method to get all employees
    public List<Employee> getAllEmployee() {
        return dao.getAllEmp();
    }

    // Method to get employee by ID
    public Employee getEmployeeById(int id) {
        Employee employee = dao.getEmployeeById(id);
        if (employee == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
        return employee;
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        dao.addEmployee(employee);
    }

    // Method to update an existing employee
    public void updateEmployee(Employee updatedEmployee) {
        Employee existingEmployee = dao.getEmployeeById(updatedEmployee.getEmpId());
        if (existingEmployee == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
        dao.updateEmployee(updatedEmployee);
    }

    // Method to delete an employee by ID
    public void deleteEmployee(int id) {
        boolean isDeleted = dao.deleteById(id);
        if (!isDeleted) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }


}
