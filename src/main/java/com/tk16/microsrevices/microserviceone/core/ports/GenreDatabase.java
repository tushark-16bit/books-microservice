package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Genre;import jakarta.persistence.EntityNotFoundException;
import java.util.List;

public interface GenreDatabase {

  Genre save(Genre genre);

  Genre findById(Long id);

  List<Genre> findAll();

  default Genre findGenreById(Long id) {
    var foundGenre = findById(id);
    if(foundGenre==null) throw new EntityNotFoundException("Genre not found");
    return foundGenre;
  }
}
