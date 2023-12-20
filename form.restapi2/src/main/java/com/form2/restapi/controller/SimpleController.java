package com.form2.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.form2.restapi.entities.Product;
import com.form2.restapi.services.ProductService;

@Controller
public class SimpleController {
	
	@Autowired
	private ProductService ps;

@RequestMapping("/form")	
 public String form() {
	 
	 return "form";
 }
	
@PostMapping("/addproduct")
public String addproduct(@ModelAttribute Product p) {
	
	ps.addproduct(p);
	
	return "success";
	
}
	

}
