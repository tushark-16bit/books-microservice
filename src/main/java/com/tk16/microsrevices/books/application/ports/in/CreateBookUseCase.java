package com.tk16.microsrevices.books.application.ports.in;

import com.tk16.microsrevices.books.application.ports.in.models.CreateBookCommand;

public interface CreateBookUseCase {
  // verify that the book does not already exist
  void createBook(CreateBookCommand createBookCommand);
}
