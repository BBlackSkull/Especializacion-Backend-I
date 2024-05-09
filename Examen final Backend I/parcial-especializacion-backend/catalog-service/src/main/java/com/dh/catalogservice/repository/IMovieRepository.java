package com.dh.catalogservice.repository;

import com.dh.catalogservice.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IMovieRepository extends MongoRepository<Movie, Long> {
    List<Movie> findByGenre(String genre);

}
