package com.tk16.microsrevices.books.application.ports.in.models;

import jakarta.validation.constraints.Positive;

public class ReadBookQuery {
  @Positive Long bookId;

  public ReadBookQuery() {}

  public ReadBookQuery(Long bookId) {
    this.bookId = bookId;
  }

  public long getBookId() {
    return bookId;
  }

  public void setBookId(Long bookId) {
    this.bookId = bookId;
  }
}
