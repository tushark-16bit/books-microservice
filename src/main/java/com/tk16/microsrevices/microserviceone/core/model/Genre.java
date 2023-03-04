package com.tk16.microsrevices.microserviceone.core.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long genreId;
    private String genreName;
    @OneToMany(mappedBy = "genre", fetch = FetchType.LAZY)
    private List<Book> books;

    public Genre() {
    }

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(
            List<Book> books) {
        this.books = books;
    }
}
