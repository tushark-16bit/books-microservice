package com.tk16.microsrevices.books.application.ports.in;

import com.tk16.microsrevices.books.application.ports.in.models.UpdateBookCommand;

public interface UpdateBookUseCase {

  void updateBook(UpdateBookCommand updateBookCommand);
}
