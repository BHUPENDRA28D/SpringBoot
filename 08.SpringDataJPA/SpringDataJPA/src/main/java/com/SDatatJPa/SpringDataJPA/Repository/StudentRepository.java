package com.SDatatJPa.SpringDataJPA.Repository;

import com.SDatatJPa.SpringDataJPA.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface StudentRepository extends JpaRepository<String ,Long> {
}
