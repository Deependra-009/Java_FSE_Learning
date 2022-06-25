package com.springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.modal.User;
import com.springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@PostMapping("/processform")
	public String handleForm(@ModelAttribute("user") User user,Model model ) {
			System.out.println(user);
			if(user.getUsername().isBlank() || user.getPassword().isBlank() || user.getEmail().isBlank()) {
				model.addAttribute("errormsg","Fill All Details");
				return "redirect:/contact";
			}
			int createdUser=this.userService.createUser(user);
			model.addAttribute("msg","User created with id "+createdUser);
			this.userService.createUser(user);
		
		return "success";
	}

}
