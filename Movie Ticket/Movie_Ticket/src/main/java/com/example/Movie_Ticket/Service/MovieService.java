package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.MovieRepository;
import com.example.Movie_Ticket.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository repository;

    public List<Movie> movieList() {
        return  repository.findAll() ;
    }

    public Movie getByMovieId(Long movieId){

        return repository.getByMovieId(movieId);
    }
}
