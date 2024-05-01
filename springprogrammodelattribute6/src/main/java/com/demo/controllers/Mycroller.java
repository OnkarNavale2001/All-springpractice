package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.beans.Detaiils;

import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class Mycroller {
//	@RequestMapping("/submit")
//	public String openpage(@RequestParam("name") String name, @RequestParam("email") String email,
//			@RequestParam("password") String pass,Model m) {
//		
//		m.addAttribute("name", name);
//		m.addAttribute("email", email);
//		m.addAttribute("password", pass);
//		return "Show";
//	}
//	@RequestMapping("/submit")
//	public String requestMethodName(@ModelAttribute Detaiils d,Model m) {
//
//	m.addAttribute("data",d);
//	return "Show";
//	
//	}
	@RequestMapping("/submit")
  public String requestmathod(@ModelAttribute("d") Detaiils d)
  {
	  return "Show";  
  }
  
  
  
}
