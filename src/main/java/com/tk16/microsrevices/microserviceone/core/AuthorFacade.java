package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorFacade {

    @Autowired AuthorDatabase database;
    public Long addToAuthors(Author author) {
        return database.save(author);
    }

    public Author findAuthorById(Long id) {
        return database.findById(id);
    }
}
