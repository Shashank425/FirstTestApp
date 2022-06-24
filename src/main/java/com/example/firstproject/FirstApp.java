package com.example.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApp {
    
    @GetMapping("/")
    public String helloResponse(){
        return "Hello World";
    }
}
