package com.tk16.microsrevices.microserviceone.infrastructure.adapters;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.ports.BookDatabase;
import com.tk16.microsrevices.microserviceone.infrastructure.repositories.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDatabaseAdapter implements BookDatabase {

  @Autowired BookRepository bookRepository;

  @Override
  public Book save(Book book) {
    return bookRepository.save(book);
  }

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public Book findById(Long id) {
    return bookRepository.findById(id).orElse(null);
  }

  @Override
  public List<Book> findByName(String name) {
    return bookRepository.findByTitleContainingIgnoreCase(name);
  }
}
