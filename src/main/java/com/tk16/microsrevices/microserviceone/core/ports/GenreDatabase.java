package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Genre;
import reactor.core.publisher.Mono;

public interface GenreDatabase {

    Mono<Long> save(Genre genre);
}
