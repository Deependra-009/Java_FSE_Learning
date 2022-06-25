package com.menuitemservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menuitemservice.service.MenuItemService;

import entity.MenuItem;

@RestController
//@RequestMapping("/menuitem")
public class MenuItemController {
	
	@Autowired
	MenuItemService service; 
	
//	@GetMapping("/movie/{movieId}")
	@GetMapping("/menuitem")
	public List<MenuItem> getMenuItem(){
		return service.getMenuItem();
	}
	
}
