package com.form.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.form.login.entities.User;
import com.form.login.services.UserService;
import com.form.login.services.UserServiceImpl;

@Controller
public class SimpleController {
    
	@Autowired
	private UserService us;
	
@RequestMapping("/login")
public String openlogin() {
	
	return "login";	
}


@PostMapping("/adduser")
public String postlogindata(@ModelAttribute User u) {
	
	us.adduser(u);
	return "welcome";
	
}

@GetMapping("/welcome")
public String getuser(Model m) {
	
   List<User> users =us.getusers();
   m.addAttribute("user",users);
   
   return "welcome";
	
}

}
