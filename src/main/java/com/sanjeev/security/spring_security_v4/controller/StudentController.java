package com.sanjeev.security.spring_security_v4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/health")
    public String sayHello(){
        return "Application is running";
    }

    @GetMapping("/students")
    public String getStudentDetails(){
        return "Student details loading....";
    }



}
