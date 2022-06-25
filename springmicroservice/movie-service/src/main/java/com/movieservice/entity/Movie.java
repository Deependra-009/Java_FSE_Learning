package com.movieservice.entity;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String movieId;
	private String movieName;
	private List<MenuItem> menu=new ArrayList<>();

	public Movie(String movieId, String movieName, List<MenuItem> menu) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.menu = menu;
	}

	public Movie(String movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(List<MenuItem> menu) {
		this.menu = menu;
	}
	
	
	
}
