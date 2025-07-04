package com.shreya.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/") // For /
    public String home() {
        return "hello";
    }

    @RequestMapping("/hello") // For /hello
    public String showHelloPage() {
        return "hello";
    }
}
