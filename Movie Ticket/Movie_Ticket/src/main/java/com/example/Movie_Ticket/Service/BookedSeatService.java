package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.BookedSeatRepository;
import com.example.Movie_Ticket.entity.BookedSeats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class BookedSeatService {
    @Autowired
    private BookedSeatRepository bookedSeatRepository;

    public BookedSeats saveSeat(BookedSeats bookedSeats){
        return bookedSeatRepository.save(bookedSeats);
    }


    public BookedSeats getBySeatsAndMovieShowsId(String seats, Long id){
        return bookedSeatRepository.getBySeatsAndMovieShowsId(seats,id);
    }

    public List<BookedSeats> findByCustomerUserName(String userName){
        return bookedSeatRepository.findByCustomerUserName(userName);
    }

}


