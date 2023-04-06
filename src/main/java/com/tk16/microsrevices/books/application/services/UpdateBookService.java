package com.tk16.microsrevices.books.application.services;

import com.tk16.microsrevices.books.application.ports.in.UpdateBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.models.UpdateBookCommand;
import com.tk16.microsrevices.books.application.ports.out.LoadBookPort;
import com.tk16.microsrevices.books.application.ports.out.UpdateBookPort;
import com.tk16.microsrevices.books.domain.Book;
import com.tk16.microsrevices.common.UseCase;

@UseCase
public class UpdateBookService implements UpdateBookUseCase {

  private final UpdateBookPort updateBookPort;
  private final LoadBookPort loadBookPort;

  public UpdateBookService(UpdateBookPort updateBookPort, LoadBookPort loadBookPort) {
    this.updateBookPort = updateBookPort;
    this.loadBookPort = loadBookPort;
  }

  @Override
  public void updateBook(UpdateBookCommand updateBookCommand) {
    // check if already exists
    // update only if exists
    // business rule contraint
    var bookToBePersisted = UpdateBookCommandMapper.mapToBook(updateBookCommand);
    loadBookPort.validateAndGetBook(bookToBePersisted.getBookId().getBookId());
    updateBookPort.updateBook(bookToBePersisted);
  }
}

class UpdateBookCommandMapper {
  static Book mapToBook(UpdateBookCommand updateBookCommand) {
    return new Book(
        new Book.BookId(updateBookCommand.getBookId()),
        updateBookCommand.getTitle(),
        updateBookCommand.getDescription(),
        updateBookCommand.getAuthor(),
        updateBookCommand.getGenre(),
        updateBookCommand.getRating(),
        updateBookCommand.getPrice());
  }
}
