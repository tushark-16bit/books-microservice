package com.tk16.microsrevices.books.application.ports.in;

import com.tk16.microsrevices.books.application.ports.in.models.CreateBookCommand;
import com.tk16.microsrevices.books.domain.Book;

public interface CreateBookUseCase {
  // verify that the book does not already exist
  Book createBook(CreateBookCommand createBookCommand);
}
