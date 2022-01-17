package com.example.Movie_Ticket.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Entity
public class Movie {
    @Id
    @GeneratedValue(generator = "uuid")
    private Long movieId;
    @Column(nullable = false)
    private  String name;
   @Column(nullable = false)
   private  Integer rating;
    @Column(nullable = false)
    private Date releaseDate;
    @Column(nullable = false)
    private  String language;
   @OneToMany(mappedBy = "movie")
   private List<ShowsMovie> showsMovie;

    public Movie( String name, Integer rating, Date releaseDate , String language) {
//        this.movieId = movieId;
        this.name = name;
       this.rating = rating;
        this.releaseDate = releaseDate;
        this.language= language;

    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long Id) {
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }



    public Movie() {
    }

}
