package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.ports.BookDatabase;
import com.tk16.microsrevices.microserviceone.core.ports.GenreDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookFacade {

    @Autowired BookDatabase bookDatabase;

    @Autowired GenreDatabase genreDatabase;

    public List<Book> findAll() {
        return bookDatabase.findAll();
    }
}
