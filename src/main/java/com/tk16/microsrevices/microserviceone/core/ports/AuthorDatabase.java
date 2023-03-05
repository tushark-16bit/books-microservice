package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Author;

import java.util.List;

public interface AuthorDatabase {

    List<Author> findAll();

    Author save(Author author);

    Author findById(Long id);

    Author findByName(String name);
}
