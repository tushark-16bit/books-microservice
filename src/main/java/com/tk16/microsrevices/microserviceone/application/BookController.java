package com.tk16.microsrevices.microserviceone.application;

import com.tk16.microsrevices.microserviceone.core.BookFacade;
import com.tk16.microsrevices.microserviceone.core.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController public class BookController {

    @Autowired BookFacade bookFacade;

    @GetMapping("/user/book") public List<Book> getAllBooks() {
        return bookFacade.findAll();
    }
}
