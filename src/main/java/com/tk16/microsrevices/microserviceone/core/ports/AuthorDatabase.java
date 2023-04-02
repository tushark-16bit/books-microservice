package com.tk16.microsrevices.microserviceone.core.ports;

import com.tk16.microsrevices.microserviceone.core.model.Author;import jakarta.persistence.EntityNotFoundException;
import java.util.List;

public interface AuthorDatabase {

  List<Author> findAll();

  Author save(Author author);

  Author findById(Long id);

  default Author findAuthorById(Long id) {
    var foundAuthor = findById(id);
    if(foundAuthor==null) throw new EntityNotFoundException("Author Not found");
    return foundAuthor;
  }
}
