package com.shreya.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/controllerManagement")
public class HelloController {

    @GetMapping("/hello")
    public  String sayHello(){
        return "Hello from Spring Boot!!!!!!!!!";
    }
}
