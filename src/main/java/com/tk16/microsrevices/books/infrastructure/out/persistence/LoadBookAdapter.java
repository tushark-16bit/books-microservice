package com.tk16.microsrevices.books.infrastructure.out.persistence;

import com.tk16.microsrevices.books.application.ports.out.LoadBookPort;
import com.tk16.microsrevices.books.domain.Book;
import com.tk16.microsrevices.common.PersistenceAdapter;
import java.util.List;

@PersistenceAdapter
public class LoadBookAdapter implements LoadBookPort {

  private final BookRepository repository;

  public LoadBookAdapter(BookRepository repository) {
    this.repository = repository;
  }

  @Override
  public Book getBookOrNull(long bookId) {
    var found = repository.findById(bookId);
    return found.isEmpty() ? null : BookMapper.mapEntityToBook(found.get());
  }

  @Override
  public List<Book> getAllBooks() {
    var entities = repository.findAll();
    return entities.stream().map(BookMapper::mapEntityToBook).toList();
  }
}
