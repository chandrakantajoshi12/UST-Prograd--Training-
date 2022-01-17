package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.BookedSeatsRepository;
import com.example.Movie_Ticket.entity.BookedSeats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatsService {
    @Autowired
    private BookedSeatsRepository bookedSeatRepository;

    public BookedSeats saveSeat(BookedSeats bookedSeats){
        return bookedSeatRepository.save(bookedSeats);
    }


    public BookedSeats getBySeatsAndShowsMovieId(String seats, Long Id){
        return bookedSeatRepository.getBySeatsAndShowsMovieId(seats,Id);
    }

    public List<BookedSeats> findByCustomerEmailId(String emailId){
        return bookedSeatRepository.findByCustomerEmailId(emailId);
    }

//    public BookedSeats getBySeatAndShowsMovieId(String seat, Long shows) {
//    }
}
