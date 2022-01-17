package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.ShowsMovieRepository;
import com.example.Movie_Ticket.entity.ShowsMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class ShowsMovieService {
    @Autowired
    private ShowsMovieRepository showsMovieRepository;

    public List<ShowsMovie> showDetails(Long movieId){
        return  showsMovieRepository.findByMovieMovieId(movieId);
    }
    public  ShowsMovie getById(Long Id){
        return  showsMovieRepository.getById(Id);
    }
}