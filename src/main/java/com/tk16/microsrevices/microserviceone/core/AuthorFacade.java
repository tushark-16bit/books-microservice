package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class AuthorFacade {

    @Autowired AuthorDatabase database;
    public Mono<Long> addToAuthors(Author author) {
        return database.save(author);
    }
}
