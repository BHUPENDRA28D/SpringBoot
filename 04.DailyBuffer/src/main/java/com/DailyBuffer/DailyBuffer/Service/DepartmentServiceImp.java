package com.DailyBuffer.DailyBuffer.Service;

import com.DailyBuffer.DailyBuffer.Entity.Department;
import com.DailyBuffer.DailyBuffer.Repository.DepartmentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;


@Service
public class DepartmentServiceImp implements DepartmentSercive {

    @Autowired
    private DepartmentRepository  departmentRepository;
    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);

    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId)
                .orElseThrow(() -> new EntityNotFoundException("Department not   found"));
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department depDB = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())  && !"".equalsIgnoreCase(department.getDepartmentName())   ){
            depDB.setDepartmentName(department.getDepartmentName());

        }


        if(Objects.nonNull(department.getDepartmentAddress())  && !"".equalsIgnoreCase(department.getDepartmentAddress())   ){
            depDB.setDepartmentAddress(department.getDepartmentAddress());

        }

        if(Objects.nonNull(department.getDepartmentCode())  && !"".equalsIgnoreCase(department.getDepartmentCode())   ){
            depDB.setDepartmentCode(department.getDepartmentCode());

        }

        return departmentRepository.save(depDB);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
