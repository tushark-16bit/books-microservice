package com.tk16.microsrevices.microserviceone.infrastructure.adapters;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import com.tk16.microsrevices.microserviceone.infrastructure.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorDatabaseAdapter implements AuthorDatabase {

    @Autowired
    AuthorRepository repository;

    @Override public Long save(Author author) {
        var savedEntity = repository.save(author);
        return savedEntity.getAuthorId();
    }

    @Override public Author findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
