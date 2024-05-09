package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.repository.IMovieRepository;
import com.dh.catalogservice.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class MovieServiceImpl implements MovieService {
    private IMovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(IMovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }
    @Override
    public List<Movie> getMoviesByGenre(String genre, Boolean throwError) throws RuntimeException {
        if (throwError) {
            throw new RuntimeException();
        }
        return movieRepository.findByGenre(genre);
    }

}
