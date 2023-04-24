package com.tk16.microsrevices.books.application.ports.in.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

public class CreateBookCommand {

  @NotNull String title;
  @NotNull String author;
  @NotNull String genre;
  @NotNull String description;
  @Positive double rating;
  @Positive BigDecimal price;

  public CreateBookCommand() {}

  public CreateBookCommand(
      String title,
      String author,
      String genre,
      String description,
      double rating,
      BigDecimal price) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.description = description;
    this.rating = rating;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
