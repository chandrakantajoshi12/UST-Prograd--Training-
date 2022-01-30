package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
