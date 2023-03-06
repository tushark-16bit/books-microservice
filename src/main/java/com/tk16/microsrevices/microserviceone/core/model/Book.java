package com.tk16.microsrevices.microserviceone.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity public class Book {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) private long bookId;
    private String title;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER) private Author author;
    @ManyToOne(fetch = FetchType.EAGER) private Genre genre;
    private double rating;
    private BigDecimal price;

    public Book() {
    }

    public Book(String title, String description, double rating,
                BigDecimal price) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.price = price;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
