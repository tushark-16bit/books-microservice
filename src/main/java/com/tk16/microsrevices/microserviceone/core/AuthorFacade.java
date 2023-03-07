package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AuthorFacade {

    @Autowired AuthorDatabase database;
    public Author addToAuthors(Author author) {
        return database.save(author);
    }

    public List<Author> findAllAuthors() {
        return database.findAll();
    }

    public Author findAuthorById(Long id) {
        return database.findById(id);
    }

    public List<Book> getBooksByAuthorId(Long id) {
        var foundAuthor = database.findById(id);
        if (foundAuthor==null) throw new NoSuchElementException();
        return foundAuthor.getAuthoredBooks();
    }
}
