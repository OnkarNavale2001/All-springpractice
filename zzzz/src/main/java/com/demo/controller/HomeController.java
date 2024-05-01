package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HomeController {

    @GetMapping("/home")
    public String userHome() {
        return "user_home"; // User home view template name
    }

   
}
