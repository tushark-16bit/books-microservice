package com.tk16.microsrevices.microserviceone.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long authorId;
    private String fullName;
    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Book> authoredBooks;

    public Author() {
    }

    public Author(long authorId, String fullName) {
        this.authorId = authorId;
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

    @Override public boolean equals(Object obj) {

        if(obj instanceof Author) {
            var object = (Author) obj;
            if(object.getAuthorId() == this.authorId &&
            object.fullName.equals(this.fullName)) return true;
        }
        return false;
    }
}
