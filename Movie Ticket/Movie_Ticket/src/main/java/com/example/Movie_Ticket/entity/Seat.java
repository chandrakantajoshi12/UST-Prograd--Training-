package com.example.Movie_Ticket.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public  class Seat {
    @Id
    @GeneratedValue
    private  Long id;
    private  String seats;
    private  Double price;

    public Seat() {
    }

    public Seat(Long id, String seats, Double price) {
        this.id = id;
        this.seats = seats;
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}