package com.tk16.microsrevices.books.infrastructure.in.web.controller;

import com.tk16.microsrevices.books.application.ports.in.CreateBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.DeleteBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.UpdateBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.models.CreateBookCommand;
import com.tk16.microsrevices.books.application.ports.in.models.DeleteBookCommand;
import com.tk16.microsrevices.books.application.ports.in.models.UpdateBookCommand;
import com.tk16.microsrevices.books.domain.Book;
import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/update")
@RateLimiter(name = "default")
@Bulkhead(name = "default")
@PreAuthorize("hasAuthority('OIDC_USER')")
public class UpdateBookController {

  private final CreateBookUseCase createBookUseCase;
  private final UpdateBookUseCase updateBookUseCase;
  private final DeleteBookUseCase deleteBookUseCase;

  public UpdateBookController(
      CreateBookUseCase createBookUseCase,
      UpdateBookUseCase updateBookUseCase,
      DeleteBookUseCase deleteBookUseCase) {
    this.createBookUseCase = createBookUseCase;
    this.updateBookUseCase = updateBookUseCase;
    this.deleteBookUseCase = deleteBookUseCase;
  }

  @PostMapping
  public ResponseEntity<Book> createNewBook(
      @Valid @RequestBody CreateBookCommand createBookCommand) {
    var bookCreated = createBookUseCase.createBook(createBookCommand);
    return new ResponseEntity<>(bookCreated, HttpStatus.CREATED);
  }

  @PatchMapping
  public void updateBook(@Valid @RequestBody UpdateBookCommand updateBookCommand) {
    updateBookUseCase.updateBook(updateBookCommand);
  }

  @DeleteMapping
  public void deleteBook(@Valid @RequestBody DeleteBookCommand deleteBookCommand) {
    deleteBookUseCase.deleteBook(deleteBookCommand);
  }
}
