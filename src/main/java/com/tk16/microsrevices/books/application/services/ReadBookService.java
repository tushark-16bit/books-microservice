package com.tk16.microsrevices.books.application.services;

import com.tk16.microsrevices.books.application.ports.in.ReadBookUseCase;
import com.tk16.microsrevices.books.application.ports.out.LoadBookPort;
import com.tk16.microsrevices.books.domain.Book;
import com.tk16.microsrevices.common.UseCase;
import jakarta.transaction.Transactional;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@UseCase
@Transactional
public class ReadBookService implements ReadBookUseCase {
  Logger logger = LoggerFactory.getLogger(ReadBookService.class);

  private final LoadBookPort loadBookPort;

  public ReadBookService(LoadBookPort loadBookPort) {
    this.loadBookPort = loadBookPort;
  }

  @Override
  public Book readBook(Long bookId) {
    logger.info("Book Id received: {}", bookId);
    return loadBookPort.validateAndGetBook(bookId);
  }

  @Override
  public List<Book> readAllBooks() {
    return loadBookPort.getAllBooks();
  }
}
