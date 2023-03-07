package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Genre;
import java.util.List;

public interface GenreDatabase {

  Genre save(Genre genre);

  Genre findById(Long id);

  List<Genre> findAll();
}
