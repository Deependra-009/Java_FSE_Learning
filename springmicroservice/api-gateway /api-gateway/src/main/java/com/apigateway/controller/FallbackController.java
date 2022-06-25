package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class FallbackController {
	
	@GetMapping("/movieserviceFallback")
	public String movieservicefallback() {
		return "Movie service at this time";
	}
	
	@GetMapping("/menuitemserviceFallback")
	public String menuitemfallback() {
		return "menuitem service at this time";
	}
	
	
}
