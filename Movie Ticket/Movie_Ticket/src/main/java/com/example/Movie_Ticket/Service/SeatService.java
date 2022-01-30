package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.SeatsRepository;
import com.example.Movie_Ticket.entity.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatsRepository seatsRepository;

    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}
