package com.dailyCodeBuffer.spring_data_jpa_tutorial.Repository;

import com.dailyCodeBuffer.spring_data_jpa_tutorial.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

 //custom methode

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameContaining(String name);

    List<Student> findByLastNameNotNull();

    List<Student> findByGuardianName(String guardianName);

    @Query("select s from Student s where s.emailId = ?1")  // JPQL QUERY
    Student getStudentByEmailAdress(String EmailId);


    // JPQL QUERY for only one attribute

    @Query("select s.firstName from Student s where s.emailId = ?1")
    String getStudentFirstNameByEmailAdress(String EmailId);

    //Native sql query
    @Query(
            value = "select *from tbl_student s where s.email_address =?1",
            nativeQuery = true
    )
    Student getStudentByEmailAdressNative(String emailId);



    //Native sql query Named parameter values
    @Query(
            value = "select *from tbl_student s where s.email_address = :emailId",
            nativeQuery = true
    )
    Student getStudentByEmailAdressNativeNameParam(@Param("emailId") String emailId);


    @Modifying
    @Transactional
    @Query(
            value = "update tbl_student set first_name = ?1 where email_address = ?2",
            nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName, String emailId);

}
