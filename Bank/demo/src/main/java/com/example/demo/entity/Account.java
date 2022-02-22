package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Account {


    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column(nullable = false)
    private String branch;
    @Column(nullable = false)
    private Double balance = 0.0;
   // private Double balance = ;
    @OneToOne(mappedBy = "account")
    private  Customer customer;
    public  Account(){}




    public Account(  String branch, Double balance) {

      //  this.accountNumber = accountNumber;
        this.branch = branch;
        this.balance = balance;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public  Double withdrawAmount(double withdrawAmount){
        if(balance >=withdrawAmount){
            balance = balance -withdrawAmount;
        }
        else {
            System.out.println("Insufficient Amount");
        }
        return balance;
    }
    public  double depositeAmount(double depositeamount){
       balance = balance + depositeamount;
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}

