package com.demo.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserHomeController {

    @GetMapping("/home")
    public String userHome(Model model, Principal principal) {
        // Access user information
        String username = principal.getName(); // Get username from principal object
        
        // Retrieve user-specific data (optional)
        // User user = userService.findByEmail(username); // Example using user email
        
        model.addAttribute("username", username); // Add user information to model for JSP access
        return "user_home"; // User home JSP name
    }
}
