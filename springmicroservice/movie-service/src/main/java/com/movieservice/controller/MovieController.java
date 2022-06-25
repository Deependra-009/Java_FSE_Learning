package com.movieservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movieservice.entity.MenuItem;
import com.movieservice.entity.Movie;
import com.movieservice.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String id) {
		
		Movie movie=this.service.getMovie(id);
		
		@SuppressWarnings("unchecked")
		List<MenuItem> list = this.restTemplate.getForObject("http://menuitem-service/menuitem", List.class);
		
		movie.setMenu(list);
		
		return movie;
		
	}

}
