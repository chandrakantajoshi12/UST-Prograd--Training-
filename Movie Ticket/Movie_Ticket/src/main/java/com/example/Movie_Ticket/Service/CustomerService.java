package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.CustomerRepository;
import com.example.Movie_Ticket.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CustomerService {

    @Autowired
    private CustomerRepository repository;
    private String emailId;


    public Customer save(Customer customer) {
        return repository.save(customer);
    }


    public Boolean exitsById(String emailId) {
        return repository.existsById(emailId);
    }


    public Customer findByEmailId(String emailId) {
        this.emailId = emailId;
        return  repository.getById(emailId);
    }


}

//    for (Movies movie : movieService.listAllMovies())
//    {
//        sout(movie);
//    }


