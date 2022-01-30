package com.example.Movie_Ticket.Repository;

import com.example.Movie_Ticket.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
