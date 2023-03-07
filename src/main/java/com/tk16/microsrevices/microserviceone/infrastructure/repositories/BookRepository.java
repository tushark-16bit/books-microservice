package com.tk16.microsrevices.microserviceone.infrastructure.repositories;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

  List<Book> findByTitleContainingIgnoreCase(String name);
}
