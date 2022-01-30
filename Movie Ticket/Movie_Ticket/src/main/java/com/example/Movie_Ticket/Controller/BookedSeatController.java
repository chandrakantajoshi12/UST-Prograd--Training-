package com.example.Movie_Ticket.Controller;


import com.example.Movie_Ticket.Service.BookedSeatService;
import com.example.Movie_Ticket.Service.CustomerService;
import com.example.Movie_Ticket.Service.MovieShowsService;
import com.example.Movie_Ticket.Service.SeatService;
import com.example.Movie_Ticket.entity.BookedSeats;
import com.example.Movie_Ticket.entity.Seats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class BookedSeatController {
     @Autowired
    private BookedSeatService bookedSeatService;
    @Autowired
    private SeatService seatService;
    @Autowired
    private MovieShowsService movieShowsService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{userName}/seats/{id}")
    public String seats(@PathVariable String userName, @PathVariable Long id, Model model) {
        model.addAttribute("shows", id);
        model.addAttribute("userName", userName);
        return "seats";
    }

    @GetMapping("/{userName}/booked/{shows}")
    public String booked(@PathVariable String userName, @PathVariable Long shows, Model model) {
        model.addAttribute("userName", userName);
        model.addAttribute("shows", shows);
        return "booked";
    }

    @PostMapping("/{userName}/booked/{shows}")
    public String seatBooked(@PathVariable String userName, @PathVariable Long shows, HttpServletRequest request, Model model) {
        String bookSeats = request.getParameter("bookedSeats");
        String[] bookedSeat = bookSeats.split(",");
        for (String seat : bookedSeat) {
            BookedSeats bookedSeats = bookedSeatService.getBySeatsAndMovieShowsId(seat, shows);
            if (!(Objects.isNull(bookedSeats))) {
                model.addAttribute("message", bookSeats + " Seat is already booked. Please choose another seat");
                return "seats";
            }
        }
        for (String seat : bookedSeat) {
            Seats seats = seatService.getBySeats(seat);
            BookedSeats bookedSeats = new BookedSeats(seats.getSeats(), seats.getPrice());
            bookedSeats.setMovieShows(movieShowsService.getById(shows));
            bookedSeats.setCustomer(customerService.findCustomerByUserName(userName));
           bookedSeatService.saveSeat(bookedSeats);
        }
        return "booked";
    }

    @GetMapping("/{userName}/myBookings")
    public String myBookings(@PathVariable String userName, Model model) {
        model.addAttribute("userName", bookedSeatService.findByCustomerUserName(userName));
        return "myBookings";
    }
}
