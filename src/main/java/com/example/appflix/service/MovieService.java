package com.example.appflix.service;

import com.example.appflix.model.Movie;
import com.example.appflix.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMoviesByGenre(String genre){
        List<Movie> movies = movieRepository.findAll(genre);
        System.out.println("Movie count " + movies.stream().count());
        return movies;
    }

    public Movie getMovie(String id) {
        return movieRepository.findOne(id);
    }
}
