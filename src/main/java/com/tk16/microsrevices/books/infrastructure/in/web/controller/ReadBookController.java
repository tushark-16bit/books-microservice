package com.tk16.microsrevices.books.infrastructure.in.web.controller;

import com.tk16.microsrevices.books.application.ports.in.ReadBookUseCase;
import com.tk16.microsrevices.books.domain.Book;
import java.util.List;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/read")
@Retry(name = "read-book")
@RateLimiter(name = "default")
@Bulkhead(name = "default")
public class ReadBookController {

  private final ReadBookUseCase readBookUseCase;

  public ReadBookController(ReadBookUseCase readBookUseCase) {
    this.readBookUseCase = readBookUseCase;
  }

  @GetMapping("/{bookId}")
  public Book readBookDetails(@PathVariable Long bookId) {
    return readBookUseCase.readBook(bookId);
  }

  @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Book> readAllBooks() {
    return readBookUseCase.readAllBooks();
  }
}
