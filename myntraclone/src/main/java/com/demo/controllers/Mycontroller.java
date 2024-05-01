package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.beans.Productdetails;
import com.demo.service.productservice;

/**
 * 
 */
@Controller
public class Mycontroller {
	@Autowired
	productservice productservice;

	@RequestMapping("/form")
	public String form() {
		return "form";
	}

	@RequestMapping("/add")
	public String addproduct(@ModelAttribute("products") Productdetails p) {
		productservice.savedata(p);

		return "redirect:/form";
	}

	@RequestMapping("/viewproducts")
	public String viewproducts(Model m) {
		List<Productdetails> products = productservice.getall();
		m.addAttribute("products", products);

		return "viewproducts";
	}

	@GetMapping("/deleteproduct")
	public String deleteproduct(@RequestParam("id") int id) {
		Productdetails p = new Productdetails();
		p.setId(id);
		productservice.delete(p);
		return "redirect:/viewproducts";
	}

	@GetMapping("/updateproduct")
	public String updateproduct(@RequestParam("id") int id, Model m) {

		Productdetails p = productservice.getbyid(id);
		System.out.println(p.getDiscount());
		m.addAttribute("product", p);
		return "updateproducts";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute("product") Productdetails p) {
		productservice.updateproducts(p);
		return "redirect:/viewproducts";
	}

	@RequestMapping("/index")
	public String index(Model m) {
		List<Productdetails> p = productservice.products();
		List<Productdetails> p1 = productservice.productswo();
		m.addAttribute("products", p);
		m.addAttribute("product",p1);
		return "index";
	}
	@GetMapping("/viewfullproduct")
	public String viewfullproduct(@RequestParam("id") int id, Model m) {

		Productdetails p = productservice.getbyid(id);
		m.addAttribute("product", p);
		return "viewfullproduct";
	}
}
