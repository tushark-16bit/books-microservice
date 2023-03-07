package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import java.util.List;

public interface BookDatabase {

  Book save(Book book);

  List<Book> findAll();

  Book findById(Long id);

  List<Book> findByName(String name);
}
