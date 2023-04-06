package com.tk16.microsrevices.books.application.ports.out;

import com.tk16.microsrevices.books.domain.Book;

public interface UpdateBookPort {

  // create
  void createBook(Book book);

  // update
  void updateBook(Book book);

  // delete
  void deleteBook(Long bookId);
}
