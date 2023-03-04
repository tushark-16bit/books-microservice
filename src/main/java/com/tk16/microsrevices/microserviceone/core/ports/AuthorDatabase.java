package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import reactor.core.publisher.Mono;

public interface AuthorDatabase {

    Mono<Long> save(Author author);
}
