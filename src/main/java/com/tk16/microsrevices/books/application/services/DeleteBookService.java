package com.tk16.microsrevices.books.application.services;

import com.tk16.microsrevices.books.application.ports.in.DeleteBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.models.DeleteBookCommand;
import com.tk16.microsrevices.books.application.ports.out.LoadBookPort;
import com.tk16.microsrevices.books.application.ports.out.UpdateBookPort;
import com.tk16.microsrevices.common.UseCase;
import jakarta.persistence.EntityNotFoundException;

@UseCase
public class DeleteBookService implements DeleteBookUseCase {

  private final LoadBookPort loadBookPort;
  private final UpdateBookPort updateBookPort;

  public DeleteBookService(LoadBookPort loadBookPort, UpdateBookPort updateBookPort) {
    this.loadBookPort = loadBookPort;
    this.updateBookPort = updateBookPort;
  }

  @Override
  public void deleteBook(DeleteBookCommand deleteBookCommand) {
    // check if persisted
    // if not, throw error, else remove
    var persisted = loadBookPort.getBookOrNull(deleteBookCommand.getBookId());
    if (persisted == null)
      throw new EntityNotFoundException("Book to be " + "deleted is not present in DB");
    updateBookPort.deleteBook(deleteBookCommand.getBookId());
  }
}
