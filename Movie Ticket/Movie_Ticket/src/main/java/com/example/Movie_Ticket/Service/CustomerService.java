package com.example.Movie_Ticket.Service;

import com.example.Movie_Ticket.Repository.CustomerRepository;
import com.example.Movie_Ticket.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Boolean existsById(String userName){
        return customerRepository.existsById(userName);
    }

    public Customer findCustomerByUserName(String userName){
        return customerRepository.getById(userName);
    }
}
