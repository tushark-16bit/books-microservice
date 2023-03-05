package com.tk16.microsrevices.microserviceone.infrastructure.adapters;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import com.tk16.microsrevices.microserviceone.infrastructure.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorDatabaseAdapter implements AuthorDatabase {

    @Autowired
    AuthorRepository repository;

    @Override public Author save(Author author) {
        return repository.save(author);
    }

    @Override public Author findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override public Author findByName(String name) {
        return repository.findFirstByFullName(name);
    }

    @Override public List<Author> findAll() {
        return repository.findAll();
    }
}
