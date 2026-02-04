package com.example.student;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>();

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student Added Successfully";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
}
