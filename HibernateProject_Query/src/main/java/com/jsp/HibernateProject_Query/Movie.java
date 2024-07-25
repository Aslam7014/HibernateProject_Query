package com.jsp.HibernateProject_Query;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String genere;
	private String director;
	private int boxOfficeCollection;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getBoxOfficeCollection() {
		return boxOfficeCollection;
	}
	public void setBoxOfficeCollection(int boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}
}
