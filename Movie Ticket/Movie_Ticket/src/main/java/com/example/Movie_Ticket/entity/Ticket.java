package com.example.Movie_Ticket.entity;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(generator = "uuid")
    private  Integer ticketId;
    @Column(nullable = false)
    private  String userName;
    @Column(nullable = false)
    private  Integer noOfSeats;

    public  Ticket(){}

    public Ticket(String userName, Integer noOfSeats) {
        this.userName = userName;
        this.noOfSeats = noOfSeats;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
     }
