package com.example.Movie_Ticket.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Customer {


    @Id
    @Column(nullable = false)
    private  String emailId;
    @Column(nullable = false)
    private  String userName;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private  String address;
    @Column(nullable = false)
    private  Double phone;

    @Column(nullable = false)
    private  String password;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }


       public Customer() {
//           this.customerId = customerId;
       }

       public Customer(String userName, String name, String address, Double phone, String emailId, String password) {
        this.userName = userName;
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.password = password;
        this.phone = phone;
    }


}
