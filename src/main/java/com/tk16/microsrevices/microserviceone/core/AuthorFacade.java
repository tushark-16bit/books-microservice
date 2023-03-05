package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Author findAuthorByName(String name) {return database.findByName(name);}
}
