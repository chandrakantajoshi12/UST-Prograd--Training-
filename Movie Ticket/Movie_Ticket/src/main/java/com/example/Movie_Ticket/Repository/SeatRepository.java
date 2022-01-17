package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository  extends JpaRepository<Seat, Long> {

}
