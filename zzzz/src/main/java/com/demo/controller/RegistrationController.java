package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.beans.User;
import com.demo.services.UserService;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("user", new User()); // Create empty User object for form
        return "register"; // Registration view template name
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, BindingResult result, Model model) {
        // ... (validation logic using @Valid and BindingResult)

        String role = user.getEmail().equals("admin@example.com") ? "ADMIN" : "USER"; // Set role based on email (for demo)
        user.setRole(role);
        userService.saveUser(user);

        return "redirect:/login"; // Redirect to login page after successful registration
    }
}
