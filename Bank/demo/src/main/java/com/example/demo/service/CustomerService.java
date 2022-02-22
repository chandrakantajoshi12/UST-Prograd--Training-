package com.example.demo.service;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {

        return repository.save(customer);
    }
   public Boolean existsById(Long  ID){
        return  repository.existsById(ID);
   }

    public List<Customer> customerList() {
        return repository.findAll();
    }

    public Customer findById(Long ID) {

        return  repository.getById(ID);
    }
    public  Customer updateCustomer(Customer customer){
        return  repository.save(customer);
    }
}
