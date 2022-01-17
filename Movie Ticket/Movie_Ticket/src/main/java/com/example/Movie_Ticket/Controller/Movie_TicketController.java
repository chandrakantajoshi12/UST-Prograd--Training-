package com.example.Movie_Ticket.Controller;

import com.example.Movie_Ticket.Service.BookedSeatsService;
import com.example.Movie_Ticket.Service.CustomerService;
import com.example.Movie_Ticket.Service.MovieService;
import com.example.Movie_Ticket.Service.ShowsMovieService;
import com.example.Movie_Ticket.entity.BookedSeats;
import com.example.Movie_Ticket.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class Movie_TicketController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private  ShowsMovieService showsMovieService;

    @Autowired
    private BookedSeatsService bookedSeatService;

    @RequestMapping("/")
    public String Home() {

        return "Home";
    }

    @RequestMapping("/register")
    public String register() {

        return "register";
    }

    @RequestMapping("/login")
    public String login() {

        return "login";
    }
    @RequestMapping("/movie")
    public  String movie(){
        return  "movie";
    }

     @RequestMapping("/showsMovie")
     public  String showsMovie(){
        return  "showsMovie";
     }

    @PostMapping("/register")
    public String register(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String userName = request.getParameter("userName");
        String address = request.getParameter("address");
        Double phone = Double.parseDouble(request.getParameter("phone"));
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");
        Customer customer = new Customer( name,userName, address, phone, emailId, password);
        customerService.save(customer);
        model.addAttribute("message", "Registration Successfully");

        return "register";
    }

    @PostMapping("/movie")
    public String Home(HttpServletRequest request, Model model) {
        String emailId = request.getParameter("emailId");
        String password = request.getParameter("password");
        Customer customer;
        if (customerService.exitsById(emailId)){
                       customer = customerService.findByEmailId(emailId);
                       if (password.equals(customer.getPassword())){
                           model.addAttribute("emailId",emailId);
                        model.addAttribute("movies",movieService.movieList());
                        return "movie";
            }
                       else{
                           model.addAttribute("message", "Invalid Password");

                return "login";
            }
        }
        else{
            model.addAttribute("message","Invalid UserName");

           return  "login";
       }

       }
      @GetMapping("/movie/{movieId}")
        public  String movie(@PathVariable Long movieId, Model model){

       model.addAttribute("showsMovies", showsMovieService.showDetails(movieId));
       //model.addAttribute("showsMovies",showsMovieService.getById(movieId));
       return  "showsMovie";
      }
//   @GetMapping("/hello")
//    public  String hello(){
//
//       System.out.println(showsMovieService.showDetails(Long.parseLong("1")).toString());
//       return  "login";
//   }

    @PostMapping("/booked/{shows}")
    public String booked(@PathVariable Long shows, Model model) {
//        model.addAttribute("userName", userName);
        model.addAttribute("shows", shows);
        return "booked";
    }
    @GetMapping("/showsMovie/{Id}")
    public String seats(@PathVariable Long Id, Model model) {
        model.addAttribute("shows", Id);

        return "seat";
    }

    @GetMapping("/{emailId}/myBookings")
    public String myBookings(@PathVariable String  emailId, Model model) {
        model.addAttribute("emailId", bookedSeatService.findByCustomerEmailId(emailId));
        return "myBookings";
    }
//    @GetMapping("/seat/{id}")
//    public String seats(@PathVariable Long id, Model model) {
//        model.addAttribute("shows", id);
////        model.addAttribute("userName", userName);
//        return "seat";
//    }


//    @PostMapping("/booked/{shows}")
//    public String seatBooked(@PathVariable Long shows, HttpServletRequest request, Model model) {
//        String bookSeats = request.getParameter("bookedSeats");
//        String[] bookedSeat = bookSeats.split(",");
//        for (String seat : bookedSeat) {
//            BookedSeats bookedSeats = bookedSeatService.getBySeatAndShowsMovieId(seat,shows);
//            if (!(Objects.isNull(bookedSeats))){
//                model.addAttribute("message", bookSeats + " Seat is already booked. Please choose another seat");
//                return "seats";
//            }
}
