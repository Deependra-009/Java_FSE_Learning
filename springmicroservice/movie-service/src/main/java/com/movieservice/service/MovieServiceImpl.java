package com.movieservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movieservice.entity.Movie;

@Service
public class MovieServiceImpl implements MovieService {

//	Fake movie list
	
	List<Movie> list = List.of(
			new Movie("1","RRR"),
			new Movie("2","bhool bhulayia"),
			new Movie("3","PK")		
			
			);

	@Override
	public Movie getMovie(String id) {

		return list.stream().filter(movie-> movie.getMovieId().equals(id)).findAny().orElse(null);
	}

}
