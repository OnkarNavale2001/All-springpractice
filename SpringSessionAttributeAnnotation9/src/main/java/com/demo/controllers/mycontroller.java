package com.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {
	@RequestMapping("/aaa")
	public String hellopage(HttpSession session) {
		session.setAttribute("name", "omkar");
		return "home";
	}

}
