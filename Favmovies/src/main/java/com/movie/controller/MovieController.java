package com.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import com.movie.model.Movie;
import com.movie.repository.MovieRepository;

@RestController
	@RequestMapping("/movie")
	public class MovieController {

	    @Autowired
	    MovieRepository movieRepository;

	    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void create(@RequestBody Movie movie) {
	        movieRepository.save(movie);
	    }

	    @RequestMapping(value = "/{id}") 
	    public Movie read(@PathVariable String id) {
	        return movieRepository.findOne(id);
	    }

	    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void update(@RequestBody Movie movie) {
	        movieRepository.save(movie);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	        movieRepository.delete(id); 
	    }
	  
}
