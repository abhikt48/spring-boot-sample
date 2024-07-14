package com.abhi.springboot.spring_boot_sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "abhi.com"),
                new Course(2, "Azure", "abhi.com"),
                new Course(3, "Amazon", "abhi.com"),
                new Course(4, "Devops", "abhi.com")
        );
    }
}
