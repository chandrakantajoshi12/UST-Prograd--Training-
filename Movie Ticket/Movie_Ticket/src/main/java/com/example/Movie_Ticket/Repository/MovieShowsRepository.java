package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.MovieShows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieShowsRepository extends JpaRepository<MovieShows, Long> {
    public List<MovieShows> findByMovieMovieId(Long MovieId);
}
