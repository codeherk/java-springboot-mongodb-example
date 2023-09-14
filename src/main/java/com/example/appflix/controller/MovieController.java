package com.example.appflix.controller;

import com.example.appflix.model.Movie;
import com.example.appflix.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    private final static Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    List<Movie> getMoviesByGenre(@RequestParam String genre){
        return movieService.getMoviesByGenre(genre);
    }

    @GetMapping("/movies/{id}")
    Movie getMovie(@PathVariable String id){
        return movieService.getMovie(id);
    }
}
