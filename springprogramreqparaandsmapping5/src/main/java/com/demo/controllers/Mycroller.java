package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Mycroller {
	@RequestMapping("/submit")
	public String openpage(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String pass,Model m) {
		
		m.addAttribute("name", name);
		m.addAttribute("email", email);
		m.addAttribute("password", pass);
		return "Show";
	}
  
  
  
  
}
