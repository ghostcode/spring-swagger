package com.example.akc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    @GetMapping("/students")
    public String queryStudents(){
        return "students";
    }
}
