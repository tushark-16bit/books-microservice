package com.tk16.microsrevices.books.application.ports.out;

import com.tk16.microsrevices.books.domain.Book;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface LoadBookPort {

  Logger logger = LoggerFactory.getLogger(LoadBookPort.class);

  // should
  Book getBookOrNull(long bookId);

  List<Book> getAllBooks();

  // business rule to throw error if not found
  default Book validateAndGetBook(long bookId) {
    var found = getBookOrNull(bookId);
    logger.info("Book retrieved: {}", found);
    if (found == null) throw new EntityNotFoundException("Book not stored in " + "Database");
    return found;
  }
}
