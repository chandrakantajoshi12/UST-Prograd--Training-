package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    List<Movie> findByMovieId(Long movieId);

    Movie getByMovieId(Long movieId);
}
