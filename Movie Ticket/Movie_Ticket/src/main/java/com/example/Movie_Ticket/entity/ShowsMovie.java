package com.example.Movie_Ticket.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


import java.sql.Date;
import java.sql.Time;

@Entity
public class ShowsMovie{
    @Id
    @GeneratedValue
    private  Long Id ;
    private  String movieName;
    private Date date;
    private Time time;
    public ShowsMovie() {}

    public ShowsMovie(Long id, String movieName, Date date, Time time, Movie movie) {
        Id = id;
        this.movieName = movieName;
        this.date = date;
        this.time = time;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "ShowsMovie{" +
                "Id=" + Id +
                ", movieName='" + movieName + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", movie=" + movie +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public Movie getMovie() {
        return movie;
    }

    @JsonIgnore
     @ManyToOne
     @JoinColumn(name="movieId",nullable = false)
     private Movie movie;

    public ShowsMovie(String movieName, Date date, Time time) {
        this.movieName = movieName;
        this.date = date;
        this.time = time;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
