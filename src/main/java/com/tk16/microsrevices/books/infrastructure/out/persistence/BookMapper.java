package com.tk16.microsrevices.books.infrastructure.out.persistence;

import com.tk16.microsrevices.books.domain.Book;

public class BookMapper {

  public static BookJpaEntity mapBookToEntity(Book book) {
    var entity = new BookJpaEntity();
    entity.setTitle(book.getTitle());
    entity.setRating(book.getRating());
    entity.setPrice(book.getPrice());
    entity.setGenre(book.getGenre());
    entity.setDescription(book.getDescription());
    entity.setAuthor(book.getAuthor());
    if (book.getBookId() != null) entity.setBookId(book.getBookId().getBookId());
    return entity;
  }

  public static Book mapEntityToBook(BookJpaEntity entity) {
    return new Book(
        new Book.BookId(entity.getBookId()),
        entity.getTitle(),
        entity.getDescription(),
        entity.getAuthor(),
        entity.getGenre(),
        entity.getRating(),
        entity.getPrice());
  }
}
