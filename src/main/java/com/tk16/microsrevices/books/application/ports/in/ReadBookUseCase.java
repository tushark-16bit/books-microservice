package com.tk16.microsrevices.books.application.ports.in;

import com.tk16.microsrevices.books.domain.Book;
import java.util.List;

public interface ReadBookUseCase {

  Book readBook(Long bookId);

  List<Book> readAllBooks();
}
