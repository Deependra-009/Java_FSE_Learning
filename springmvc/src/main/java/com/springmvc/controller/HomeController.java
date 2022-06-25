package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("key","deependra");
		List<String> list=new ArrayList<String>();
		list.add("deepu");
		list.add("ayush");
		list.add("naman");
		model.addAttribute("list",list);
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}

}
