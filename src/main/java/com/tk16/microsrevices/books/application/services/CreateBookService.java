package com.tk16.microsrevices.books.application.services;

import com.tk16.microsrevices.books.application.ports.in.CreateBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.models.CreateBookCommand;
import com.tk16.microsrevices.books.application.ports.out.UpdateBookPort;
import com.tk16.microsrevices.books.domain.Book;
import com.tk16.microsrevices.common.UseCase;

@UseCase
class CreateBookService implements CreateBookUseCase {

  private final UpdateBookPort updateBookPort;

  public CreateBookService(UpdateBookPort updateBookPort) {
    this.updateBookPort = updateBookPort;
  }

  @Override
  public void createBook(CreateBookCommand createBookCommand) {

    var bookToBeSaved = CreateBookCommandMapper.mapToBook(createBookCommand);
    updateBookPort.createBook(bookToBeSaved);
  }
}

class CreateBookCommandMapper {
  static Book mapToBook(CreateBookCommand createBookCommand) {
    return new Book(
        createBookCommand.getTitle(),
        createBookCommand.getDescription(),
        createBookCommand.getAuthor(),
        createBookCommand.getGenre(),
        createBookCommand.getRating(),
        createBookCommand.getPrice());
  }
}
