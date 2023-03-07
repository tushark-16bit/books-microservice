package com.tk16.microsrevices.microserviceone.application;

import com.tk16.microsrevices.microserviceone.core.BookFacade;
import com.tk16.microsrevices.microserviceone.core.model.Book;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController public class BookController {

    @Autowired BookFacade bookFacade;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/book") public List<Book> getAllBooks() {
        return bookFacade.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/user/book") public Book saveBook(@RequestBody @Valid Book book) {
        return bookFacade.addBook(book);
    }

    @GetMapping("/user/book/{id}") public Book findById(@PathVariable Long id) {
        return bookFacade.findById(id);
    }
}
