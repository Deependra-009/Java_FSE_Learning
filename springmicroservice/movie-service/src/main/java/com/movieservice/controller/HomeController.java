package com.movieservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class HomeController {
	
	@GetMapping("/web")
	public String home() {
		System.out.println("hello");
		return "home";
	}

}
