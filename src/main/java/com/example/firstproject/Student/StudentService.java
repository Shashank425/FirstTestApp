package com.example.firstproject.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> getStudents(){
        Student stu = new Student(1L,"Henry","Matson",LocalDate.of(2000, Month.APRIL, 14),"henry.matson@gmail.com",32);
        return List.of(stu);
    }
}
