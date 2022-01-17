package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, String> {





}
