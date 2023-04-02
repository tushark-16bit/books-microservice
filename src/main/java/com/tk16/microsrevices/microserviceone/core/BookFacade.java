package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.ports.BookDatabase;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookFacade {

  @Autowired BookDatabase bookDatabase;

  public List<Book> findAll() {
    return bookDatabase.findAll();
  }

  public Book findById(Long id) {
    return bookDatabase.findBookById(id);
  }

  public Book addBook(Book book) {
    return bookDatabase.save(book);
  }

  public List<Book> findByName(String name) {
    return bookDatabase.findBookByName(name);
  }
}
