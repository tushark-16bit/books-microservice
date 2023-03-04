package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import reactor.core.publisher.Mono;

public interface BookDatabase {

    Mono<Long> save(Book book);
}
