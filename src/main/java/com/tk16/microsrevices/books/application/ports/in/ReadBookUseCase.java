package com.tk16.microsrevices.books.application.ports.in;

import com.tk16.microsrevices.books.application.ports.in.models.ReadBookQuery;
import com.tk16.microsrevices.books.domain.Book;
import java.util.List;

public interface ReadBookUseCase {

  Book readBook(ReadBookQuery readBookQuery);

  List<Book> readAllBooks();
}
