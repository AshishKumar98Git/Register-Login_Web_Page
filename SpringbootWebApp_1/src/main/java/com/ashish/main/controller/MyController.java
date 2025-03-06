package com.ashish.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashish.main.entities.User;
import com.ashish.main.service.UserService;

@Controller // mark a class as Spring MVC Controller, which handle the http request and return view or data.
public class MyController {  //Controller class is used to manage the web request and responses. It handles user input, processes data, and return the view or other responses
	
	@Autowired
	private UserService userService;
							 //It will map the register.jpa file, Even providing this when we will click the register link in the index page, it will not direct to the register page.
	@GetMapping("/regPage")  //To connect with register.jsp page, we have to View resolver. It configure the prefix and suffix for jsp path.(in appication.properties)
	public String openRegPage(Model model) {
		
		model.addAttribute("user", new User());	
		return "register"; //Here we have to provide the view resolver in the application.properties
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user, Model model) {
		
		boolean status = userService.registerUser(user);
		
		if(status) {
			
			model.addAttribute("Successfull", "User data register successfully");	
		}
		else {
			model.addAttribute("ErrorMsg", "User data not register");
		}
		return "register";
	}
	
	@GetMapping("/loginPage")  //To connect with register.jsp page, we have to View resolver. It configure the prefix and suffix for jsp path.(in appication.properties)
	public String openLoginPage(Model model) {
		
		model.addAttribute("user", new User());	
		return "login"; //Here we have to provide the view resolver in the application.properties
	}
	
	@PostMapping("/loginForm")
	public String sumitLoginForm(@ModelAttribute("user") User user, Model model) {
		
		User validUser = userService.loginUser(user.getEmail(), user.getPassword());
		
		if(validUser != null) {
			model.addAttribute("modelName", validUser.getName());
			return "profile";
		}
		else {
			model.addAttribute("ErrorMsg", "Email and Password not matched");
			return "login";
		}
	}
}
