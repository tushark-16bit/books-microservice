package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Genre;

public interface GenreDatabase {

    Long save(Genre genre);
}
