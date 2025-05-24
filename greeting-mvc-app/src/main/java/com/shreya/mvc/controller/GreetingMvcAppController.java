package com.shreya.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;

@Controller
public class GreetingMvcAppController {

    @RequestMapping("/welcome")
    public String welcomePage() {
        return "index"; // loads index.jsp from /WEB-INF/views/
    }

    @RequestMapping("/greeting")
    public String showGreetingPage(Model model) {
        model.addAttribute("message", getGreetingMessage());
        return "greeting"; // loads greeting.jsp from /WEB-INF/views/
    }

    private String getGreetingMessage() {
        int hour = LocalTime.now().getHour();
        if (hour < 12) return "Good Morning";
        else if (hour < 18) return "Good Afternoon";
        else return "Good Evening";
    }
}
