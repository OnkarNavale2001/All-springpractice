package com.demo.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.beans.User;

@Controller
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager; // Inject AuthenticationManager

    @Autowired
    public LoginController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }
    
    @GetMapping("/login")
    public String login(Model model) {
        // Add optional logic to pre-populate the form (e.g., with remembered email)
        return "login"; // Login JSP name
    }

    @PostMapping("/login") // Handle login form submission
    public String login(@ModelAttribute User user, BindingResult result, Model model, HttpServletRequest request) {
        // Implement robust validation (consider using @Valid annotation)
        if (result.hasErrors()) {
            return "login"; // Return to login page with validation errors
        }

        try {
            Authentication authentication = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword());
            authenticationManager.authenticate(authentication); // Perform authentication

            SecurityContextHolder.getContext().setAuthentication(authentication);
            User loggedInUser = (User) authentication.getPrincipal();

            if (loggedInUser.getRole().equals("USER")) {
                return "redirect:/user/home";
            } else if (loggedInUser.getRole().equals("ADMIN")) {
                return "redirect:/admin/home";
            } else {
                // Handle unexpected role (e.g., log a warning or redirect to a generic error page)
                return "redirect:/access-denied";
            }
        } catch (BadCredentialsException e) {
            model.addAttribute("error", "Invalid username or password!");
            return "login"; // Return to login page with error message
        } catch (AuthenticationException e) {
            // Handle other authentication exceptions (e.g., AccountNotFoundException)
            model.addAttribute("error", "Authentication failed!");
            return "login"; // Return to login page with generic error message (avoid revealing specifics)
        }
    }
}
