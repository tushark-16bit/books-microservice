package com.tk16.microsrevices.books.infrastructure.out.persistence;

import com.tk16.microsrevices.books.application.ports.out.LoadBookPort;
import com.tk16.microsrevices.books.application.ports.out.UpdateBookPort;
import com.tk16.microsrevices.books.domain.Book;
import com.tk16.microsrevices.common.PersistenceAdapter;

@PersistenceAdapter
public class UpdateBookAdapter implements UpdateBookPort {

  private final BookRepository repository;
  private final LoadBookPort loadBookPort;

  public UpdateBookAdapter(BookRepository repository, LoadBookPort loadBookPort) {
    this.repository = repository;
    this.loadBookPort = loadBookPort;
  }

  @Override
  public Book createBook(Book book) {
    var bookToBePersisted = BookMapper.mapBookToEntity(book);
    var persistedBook = repository.save(bookToBePersisted);
    return BookMapper.mapEntityToBook(persistedBook);
  }

  @Override
  public void updateBook(Book book) {
    var bookToBePersisted = BookMapper.mapBookToEntity(book);
    repository.save(bookToBePersisted);
  }

  @Override
  public void deleteBook(Long bookId) {
    repository.deleteById(bookId);
  }
}
