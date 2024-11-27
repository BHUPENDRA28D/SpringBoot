package com.DailyBuffer.DailyBuffer.Service;

import com.DailyBuffer.DailyBuffer.Entity.Department;
import com.DailyBuffer.DailyBuffer.Error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentSercive {




    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);

//    Department fetchDepartmentByName(String name);
}
