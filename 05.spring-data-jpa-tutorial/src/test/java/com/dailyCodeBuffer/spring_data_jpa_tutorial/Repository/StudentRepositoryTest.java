package com.dailyCodeBuffer.spring_data_jpa_tutorial.Repository;

import com.dailyCodeBuffer.spring_data_jpa_tutorial.Entity.Guardian;
import com.dailyCodeBuffer.spring_data_jpa_tutorial.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


//@DataJpaTest
@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;
@Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("shabbir@gmail.com")
                .firstName("Shabbir")
                .lastName("Dawoodi")
                //.guardianName("Nikhil")
                //.guardianEmail("nikhil@gmail.com")
                //.guardianMobile("9999999999")
                .build();

        studentRepository.save(student);
    }

    @Test

        public void saveStudentWithGuardian() {

            Guardian guardian = Guardian.builder()
                    .email("nikhil@gmail.com")
                    .name("Nikhil")
                    .mobile("9999956324")
                    .build();

            Student student = Student.builder()
                    .firstName("Shivam")
                    .emailId("shivam@gmail.com")
                    .lastName("Kumar")
                    .guardian(guardian)
                    .build();

            studentRepository.save(student);



    }

    @Test
    public void printAllStudent(){
        List<Student> studentList = studentRepository.findAll();
       System.out.println("Student List = "+studentList);

}

@Test
    public  void printStudentByFirstName(){
    List<Student> studentList = studentRepository.findByFirstName("shivam");
    System.out.println("Student List = "+studentList);

}

@Test
    public  void printStudentByEmailAddress(){
    Student student = studentRepository.getStudentByEmailAdress(
            "shabbir@gmail.com"
    );

    System.out.println("========================== xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxStudent  = " + student);
}

    @Test
    public  void printStudentFirstNameByEmailAddress(){
        String firstName = studentRepository.getStudentFirstNameByEmailAdress(
                "shabbir@gmail.com"
        );

        System.out.println("========================== xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n Student  = " + firstName );
    }

    @Test
    public  void printStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAdressNative(
                "shabbir@gmail.com"
        );

        System.out.println("========================== xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxStudent  = " + student);
    }



    @Test
    public void updateStudentNameByEmailIdTest() {
        studentRepository.updateStudentNameByEmailId(
                "shabbir dawoodi",
                "shabbir@gmail.com");
    }

}