package com.tk16.microsrevices.microserviceone.core.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private long bookId;

  @Size(min = 2, max = 50)
  private String title;

  @Size(min = 5, max = 50)
  private String description;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "author_id")
  @NotNull
  private Author author;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "genre_id")
  @NotNull
  private Genre genre;

  @Positive private double rating;
  @Positive private BigDecimal price;

  public Book() {}

  public Book(Long bookId, String title, String description, double rating, BigDecimal price) {
    this.bookId = bookId;
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
