package com.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.beans.Userdetails;
import com.demo.service.Userservice;

@Controller
public class Usercontroller {
	@Autowired
	Userservice userservice;

	@RequestMapping("/register")
	public String user(@ModelAttribute("userdetails") Userdetails u) {

		userservice.saveuser(u);
		return "register";
	}

	@PostMapping("/registerdetails")
	public String userregistration(@ModelAttribute("userdetails") Userdetails u, HttpSession session) {
		if (userservice.saveuser(u)) {
			session.setAttribute("succ", "Register Successfully");
			return "redirect:/register";
		} else {
			return "redirect:/register";
		}

	}

}
