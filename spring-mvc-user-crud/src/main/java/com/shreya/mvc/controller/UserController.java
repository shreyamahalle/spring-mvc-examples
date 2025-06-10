package com.shreya.mvc.controller;

import com.shreya.mvc.model.User;
import com.shreya.mvc.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserRepository userRepo = new UserRepository();

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/users")
    public String list(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute User user) {
        userRepo.save(user);
        return "redirect:/users";
    }
}
