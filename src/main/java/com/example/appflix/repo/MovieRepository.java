package com.example.appflix.repo;

import com.example.appflix.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MovieRepository extends MongoRepository<Movie, String> {
//    @Query("{title:'?0'}")
//    Movie findByTitle(String title);
    @Query("{id: ?0}")
    Movie findOne(String id);

    @Query(value="{genres: ?0}", fields="{title: 1, poster: 1}")
    List<Movie> findAll(String genre);

    public long count();
}
