package com.tk16.microsrevices.microserviceone.infrastructure.adapters;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import com.tk16.microsrevices.microserviceone.infrastructure.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class AuthorDatabaseAdapter implements AuthorDatabase {

    @Autowired
    AuthorRepository repository;

    @Override public Mono<Long> save(Author author) {
        return repository.save(author)
                .map(Author::getAuthorId);
    }
}
