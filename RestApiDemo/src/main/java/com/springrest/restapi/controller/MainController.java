package com.springrest.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.restapi.entities.Courses;
import com.springrest.restapi.services.CourceService;
import com.springrest.restapi.services.CourceServiceImpl;

@RestController
public class MainController {
	
	@Autowired
	public CourceServiceImpl courceservice;
	
	@GetMapping("/home")
    public String home() {
		
		return "this is home";
		
	}
	
	@GetMapping("/courses")
	public List<Courses> courses() {
		
		return courceservice.courcelist();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses course(@PathVariable String courseId) {
		
		return courceservice.cource(Integer.parseInt(courseId));
		
	}
	
	@PostMapping("/courses")
	public Courses addcourses(@RequestBody Courses c) {
		
		
		return courceservice.addcourse(c);
		
	}
		
	@PutMapping("/courses")
	public Courses updatecourses(@RequestBody Courses c) {
		
		return courceservice.updatecourse(c);
	}
	
	
 }
