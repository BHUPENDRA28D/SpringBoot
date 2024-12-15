package com.springRest.springRest.Service;

import com.springRest.springRest.Entity.Courses;

import java.util.Arrays;
import java.util.List;

public class CourseServiceImpl implements CourseService {

    List<Courses> list = Arrays.asList(
            new Courses(1L, "Java", "Java Complete for Beginners"),
            new Courses(2L, "Web Dev", "Full Stack Development course for Students"),
            new Courses(3L, "Python", "Python for Data Science"),
            new Courses(4L, "Mobile Dev", "Android Development"),
            new Courses(5L, "Data Science", "Machine Learning Basics"),
            new Courses(6L, "AI", "Introduction to Artificial Intelligence"),
            new Courses(7L, "Cloud", "Cloud Computing with AWS"),
            new Courses(8L, "DevOps", "DevOps for Professionals"),
            new Courses(9L, "Cyber Security", "Ethical Hacking and Pen Testing"),
            new Courses(10L, "UI/UX", "User Interface and User Experience Design")
    );

    @Override
    public List<Courses> getAllCourses() {
        // Add your implementation here
        return list;
    }
}
