package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
