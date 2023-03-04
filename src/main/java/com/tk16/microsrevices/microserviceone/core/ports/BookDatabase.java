package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Book;

public interface BookDatabase {

    Long save(Book book);
}
