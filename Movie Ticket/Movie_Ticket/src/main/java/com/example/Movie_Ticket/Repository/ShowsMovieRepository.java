package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.ShowsMovie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowsMovieRepository extends JpaRepository<ShowsMovie , Long> {


//    List<ShowsMovie> findByMovieId(Long movieId);

    List<ShowsMovie> findByMovieMovieId(Long movieId);
}