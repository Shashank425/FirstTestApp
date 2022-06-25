package com.example.firstproject.Student;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @Autowired
    private StudentService studentService;

    @GetMapping("/api/student")
    public List<Student> getStudents(){

       return studentService.getStudents();
    }
}
