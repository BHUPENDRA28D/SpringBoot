package com.dailyCodeBuffer.spring_data_jpa_tutorial.Repository;

import com.dailyCodeBuffer.spring_data_jpa_tutorial.Entity.CourseMaterial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {

}
