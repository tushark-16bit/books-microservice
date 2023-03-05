package com.tk16.microsrevices.microserviceone.core.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Entity
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long genreId;
    @NotBlank(message = "Name must not be blank")
    @Size(min = 2, max = 30)
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
