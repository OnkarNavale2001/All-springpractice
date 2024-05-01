package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.beans.Userdetails;
import com.demo.repo.userrepo;

@Controller
public class mycontroller {
	@Autowired
	userrepo re;

	@RequestMapping("/home")
	public String view() {
		return "home";
	}
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @GetMapping("/login")
	public String login() {
      
		return "login";
	}
	@PostMapping("/register")
	public String registerUser(@ModelAttribute("m") Userdetails u) {
        re.save(u);
		return "redirect:/login";
	}
	  @GetMapping("/admin/home")
	    public String adminHome() {
	        return "adminhome";
	    }
	    @GetMapping("/user/home")
	    public String userHome() {
	        return "userhome";
	    }
}
