package com.DailyBuffer.DailyBuffer.Repository;

import com.DailyBuffer.DailyBuffer.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
//
    public  Department findByDepartmentName(String departmentName);
    public  Department findByDepartmentNameIgnoreCase(String departmentName);
}
