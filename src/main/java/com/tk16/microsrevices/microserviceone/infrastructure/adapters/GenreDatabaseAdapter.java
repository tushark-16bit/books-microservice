package com.tk16.microsrevices.microserviceone.infrastructure.adapters;

import com.tk16.microsrevices.microserviceone.core.model.Genre;
import com.tk16.microsrevices.microserviceone.core.ports.GenreDatabase;
import com.tk16.microsrevices.microserviceone.infrastructure.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;

@Component
public class GenreDatabaseAdapter implements GenreDatabase {

    @Autowired GenreRepository repository;

    @Override public Genre save(Genre genre) {
        return repository.save(genre);
    }

    @Override public Genre findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override public List<Genre> findAll() {
        return repository.findAll();
    }
}
