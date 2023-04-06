package com.tk16.microsrevices.books.infrastructure.in.web.controller;

import com.tk16.microsrevices.books.application.ports.in.ReadBookUseCase;
import com.tk16.microsrevices.books.application.ports.in.models.ReadBookQuery;
import com.tk16.microsrevices.books.domain.Book;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/read")
public class ReadBookController {

  private final ReadBookUseCase readBookUseCase;

  public ReadBookController(ReadBookUseCase readBookUseCase) {
    this.readBookUseCase = readBookUseCase;
  }

  @GetMapping
  public Book readBookDetails(@Valid @RequestBody ReadBookQuery query) {
    return readBookUseCase.readBook(query);
  }

  @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Book> readAllBooks() {
    return readBookUseCase.readAllBooks();
  }
}
