package com.tk16.microsrevices.books.application.ports.in.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class DeleteBookCommand {

  @Positive @NotNull long bookId;

  public DeleteBookCommand() {}

  public DeleteBookCommand(long bookId) {
    this.bookId = bookId;
  }

  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }
}
