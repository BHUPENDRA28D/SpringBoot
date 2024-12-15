package com.springRest.springRest.Controller;

import com.springRest.springRest.Entity.Courses;
import com.springRest.springRest.Service.CourseService;
import com.springRest.springRest.Service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseServiceImpl courseService;
    @GetMapping("/home")
    public String home(){
        return "This it Home !";
    }

    // get all courses
    @GetMapping("/courses")
    public List<Courses> getAllCourser(){
       return courseService.getAllCourses();
    }
}
