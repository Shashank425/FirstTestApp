package com.example.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApp {
    
    @GetMapping("/hello")
    public String helloResponse(){
        return "Insects are the worst";
    }
}
