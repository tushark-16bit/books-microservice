package com.tk16.microsrevices.books.application.ports.in;

import com.tk16.microsrevices.books.application.ports.in.models.DeleteBookCommand;

public interface DeleteBookUseCase {

  void deleteBook(DeleteBookCommand deleteBookCommand);
}
