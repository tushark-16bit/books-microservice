package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.ports.AuthorDatabase;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorFacade {

  @Autowired AuthorDatabase database;

  public Author addToAuthors(Author author) {
    return database.save(author);
  }

  public List<Author> findAllAuthors() {
    return database.findAll();
  }

  public Author findAuthorById(Long id) {
    return database.findAuthorById(id);
  }

  // TODO: test this
  public List<Book> getBooksByAuthorId(Long id) {
    var foundAuthor = database.findAuthorById(id);
    return foundAuthor.getAuthoredBooks();
  }
}
