package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Author;

public interface AuthorDatabase {

    Long save(Author author);

    Author findById(Long id);
}
