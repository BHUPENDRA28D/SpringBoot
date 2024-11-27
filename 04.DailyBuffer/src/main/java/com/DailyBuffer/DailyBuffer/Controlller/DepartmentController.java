package com.DailyBuffer.DailyBuffer.Controlller;

import com.DailyBuffer.DailyBuffer.Entity.Department;
import com.DailyBuffer.DailyBuffer.Error.DepartmentNotFoundException;
import com.DailyBuffer.DailyBuffer.Service.DepartmentSercive;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
      private DepartmentSercive departmentSercive;

    private final Logger LOGGER =
            LoggerFactory.getLogger(DepartmentController.class);



    //1. To get insert the data in department table
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody  Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentSercive.saveDepartment(department);
    }

    //2.Method to get all the department of the table
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        return departmentSercive.fetchDepartmentList();
    }

    //3. fetch department by id.
    @GetMapping("/departments/{id}")
    public  Department fetchDepartmentById(@PathVariable("id") Long departmentId ) throws DepartmentNotFoundException {
        return departmentSercive.fetchDepartmentById(departmentId);
    }

    //4.Delete from the DepartmentById()
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){

       departmentSercive.deleteDepartmentById(departmentId);
        return "Department deleted Successfully !";

    }

    //5.Upadate the department
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id")  Long departmentId,@RequestBody  Department department){

         return departmentSercive.updateDepartment(departmentId,department);

    }
// method to find by name.
  @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentSercive.fetchDepartmentByName(departmentName);
    }


}
