package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.application.exception.BookEntityNotFoundException;import com.tk16.microsrevices.microserviceone.core.model.Book;import jakarta.persistence.EntityNotFoundException;
import java.util.List;

public interface BookDatabase {

  Book save(Book book);

  List<Book> findAll();

  Book findById(Long id);

  List<Book> findByName(String name);

  default Book findBookById(Long id) {
    var bookFound = findById(id);
    if (bookFound == null) throw new BookEntityNotFoundException("Book searched " +
            "for is not found");
    return bookFound;
  }

  default List<Book> findBookByName(String name) {
    var bookFound = findByName(name);
    if (bookFound == null) throw new BookEntityNotFoundException("Book searched " +
            "for is not found");
    return bookFound;
  }
}
