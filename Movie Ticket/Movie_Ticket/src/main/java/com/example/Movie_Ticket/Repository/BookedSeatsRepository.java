package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatsRepository extends JpaRepository<BookedSeats, Long> {


    BookedSeats getBySeatsAndShowsMovieId(String seats, Long Id);

    List<BookedSeats> findByCustomerEmailId(String emailId);

}




