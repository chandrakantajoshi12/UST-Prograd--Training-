package com.example.Movie_Ticket.Repository;


import com.example.Movie_Ticket.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
