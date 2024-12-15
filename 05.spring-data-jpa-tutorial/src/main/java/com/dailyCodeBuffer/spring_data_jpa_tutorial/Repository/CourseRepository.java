package com.dailyCodeBuffer.spring_data_jpa_tutorial.Repository;

import com.dailyCodeBuffer.spring_data_jpa_tutorial.Entity.Course;
import com.dailyCodeBuffer.spring_data_jpa_tutorial.Entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
