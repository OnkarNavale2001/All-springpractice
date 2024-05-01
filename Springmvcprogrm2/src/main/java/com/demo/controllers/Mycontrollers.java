package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontrollers {
	@RequestMapping("/home")
	public String homepage(Model m) {
		m.addAttribute("name","omkar");
		
		return "home";
	}
	@RequestMapping("/login")
	public String loginString()
	{
		return "login";
	}
}
