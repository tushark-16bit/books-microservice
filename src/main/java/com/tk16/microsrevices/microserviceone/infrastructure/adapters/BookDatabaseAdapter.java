package com.tk16.microsrevices.microserviceone.infrastructure.adapters;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.ports.BookDatabase;
import com.tk16.microsrevices.microserviceone.infrastructure.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookDatabaseAdapter implements BookDatabase {

    @Autowired BookRepository bookRepository;

    @Override public Book save(Book book) {
        return null;
    }

    @Override public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override public List<Book> findByName(String name) {
        return bookRepository.findByTitleContainingIgnoreCase(name);
    }
}
