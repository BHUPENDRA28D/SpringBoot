package com.Employee.Employee.DAO;

import com.Employee.Employee.Employee;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class EmployeeDao {

    // In Dao we do database related coding.

    List<Employee> empList = Arrays.asList(
            new Employee(101, "Software Developer", "Rashi Kutiya", 29, 125400.54),
            new Employee(102, "Software Developer", "Amit Sharma", 31, 130500.00),
            new Employee(103, "Data Scientist", "Neha Verma", 27, 145200.30),
            new Employee(104, "System Analyst", "Rajesh Kumar", 35, 138000.45),
            new Employee(105, "Project Manager", "Anjali Singh", 42, 158500.75),
            new Employee(106, "UI/UX Designer", "Priya Gupta", 26, 114000.80),
            new Employee(107, "Database Administrator", "Vikram Patel", 34, 128700.90),
            new Employee(108, "DevOps Engineer", "Meera Sinha", 30, 135600.20),
            new Employee(109, "Network Engineer", "Rahul Jain", 28, 122300.65),
            new Employee(110, "QA Tester", "Sakshi Rao", 25, 119400.50),
            new Employee(111, "Software Developer", "Karan Mehta", 32, 132500.45),
            new Employee(112, "Data Analyst", "Swati Desai", 29, 127800.30),
            new Employee(113, "System Architect", "Ravi Malhotra", 40, 142300.75),
            new Employee(114, "Product Manager", "Nisha Kapoor", 38, 154400.55),
            new Employee(115, "Technical Writer", "Ankit Agarwal", 33, 118900.35),
            new Employee(116, "Cyber Security Specialist", "Manish Tiwari", 36, 149700.10),
            new Employee(117, "Cloud Engineer", "Sonal Gupta", 28, 125600.40),
            new Employee(118, "Front-end Developer", "Abhishek Roy", 27, 123800.25),
            new Employee(119, "Backend Developer", "Pooja Verma", 31, 129900.80),
            new Employee(120, "AI Engineer", "Nitin Saxena", 29, 148200.70),
            new Employee(121, "Mobile App Developer", "Aarav Yadav", 26, 120400.85),
            new Employee(122, "Business Analyst", "Ritika Kapoor", 34, 134200.90)
    );

    // Method to get all employees
    public List<Employee> getAllEmp() {
        return empList;
    }

    // Method to get employee by ID
    public Employee getEmployeeById(int id) {
        for (Employee e : empList) {
            if (e.getEmpId() == id) {
                return e;
            }
        }
        return null;
    }

    // Method to delete an employee by ID
    public boolean deleteById(int id) {
        return empList.removeIf(emp -> emp.getEmpId() == id);
    }

    // Method to add a new employee
    public void addEmployee(Employee employee) {
        empList.add(employee);
    }

    // Method to update an existing employee
    public void updateEmployee(Employee updatedEmployee) {
        for (Employee e : empList) {
            if (e.getEmpId() == updatedEmployee.getEmpId()) {
                e.setEmpName(updatedEmployee.getEmpName());
                e.setEmpRole(updatedEmployee.getEmpRole());
                e.setEmpAge(updatedEmployee.getEmpAge());
                e.setEmpSalary(updatedEmployee.getEmpSalary());
                break;
            }
        }


    }
}
