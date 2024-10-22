package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentsController {

    private Student studentAlfa = new Student(1, "Alfa", 20);

    @RequestMapping("/students")
    public List<Student> retrieveAllStudents() {
        return Arrays.asList(
                studentAlfa,
                new Student(2, "Beta", 21)
        );
    }
}
