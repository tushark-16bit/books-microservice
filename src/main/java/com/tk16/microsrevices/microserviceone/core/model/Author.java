package com.tk16.microsrevices.microserviceone.core.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long authorId;
    private String fullName;
    @OneToMany(mappedBy = "author",fetch = FetchType.LAZY)
    private List<Book> authoredBooks;

    public Author() {
    }

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Book> getAuthoredBooks() {
        return authoredBooks;
    }

    public void setAuthoredBooks(
            List<Book> authoredBooks) {
        this.authoredBooks = authoredBooks;
    }
}
