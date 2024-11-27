package com.DailyBuffer.DailyBuffer.Service;

import com.DailyBuffer.DailyBuffer.Entity.Department;
import com.DailyBuffer.DailyBuffer.Repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentSerciveTest {

    @Autowired
    private  DepartmentSercive departmentSercive;
    @MockitoBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {

        Department department  = Department.builder()
                .departmentName("ECE")
                .departmentAddress("Jaipure")
                .departmentCode("EC-05")
                .departmentId(1L)
                .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("ECE"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("Get Data based on valide Department name")

    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName ="ECE";
        Department found =
                departmentSercive.fetchDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());
    }
}