package com.example.Movie_Ticket.Service;


import com.example.Movie_Ticket.Repository.MovieShowsRepository;
import com.example.Movie_Ticket.entity.MovieShows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowsService {
    @Autowired
    private MovieShowsRepository movieShowsRepository;

    public List<MovieShows> showsDetails(Long movieId){
        return movieShowsRepository.findByMovieMovieId(movieId);
    }

    public MovieShows getById(Long id){
        return movieShowsRepository.getById(id);
    }

}
