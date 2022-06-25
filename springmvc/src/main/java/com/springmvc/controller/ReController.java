package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@GetMapping("/one")
	public RedirectView one() {
		System.out.println("one");
		RedirectView view = new RedirectView();
		view.setUrl("enjoy");
//		return "redirect:/enjoy";  first mesthod
		return view;
	}
	
	@GetMapping("/enjoy")
	public String two() {
		System.out.println("second");
		return "contact";
	}

}
