package com.tk16.microsrevices.microserviceone.infrastructure.repositories;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
