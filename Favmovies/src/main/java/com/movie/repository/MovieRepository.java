package com.movie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.movie.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

    public Movie findOneByName(String id);

}