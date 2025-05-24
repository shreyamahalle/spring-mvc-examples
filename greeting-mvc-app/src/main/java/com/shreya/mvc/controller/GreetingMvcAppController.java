package com.shreya.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;

@Controller
public class GreetingMvcAppController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/welcome";  // redirect root to /welcome
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";  // returns /WEB-INF/views/welcome.jsp
    }

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", getGreetingMessage());
        return "greeting";
    }

    private String getGreetingMessage() {
        int hour = LocalTime.now().getHour();
        if (hour < 12) return "Good Morning";
        else if (hour < 18) return "Good Afternoon";
        else return "Good Evening";
    }
}
