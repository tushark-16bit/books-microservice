package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.model.Genre;

import java.util.List;

public interface BookDatabase {

    Book save(Book book);

    List<Book> findAll();

    Book findById(Long id);

    List<Book> findByGenre(Genre genre);

    List<Book> findByAuthor(Long authorId);
}
