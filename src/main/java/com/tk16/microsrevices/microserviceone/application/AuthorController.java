package com.tk16.microsrevices.microserviceone.application;

import com.tk16.microsrevices.microserviceone.core.AuthorFacade;
import com.tk16.microsrevices.microserviceone.core.model.Author;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController public class AuthorController {

    @Autowired AuthorFacade authorFacade;

    @PostMapping(value = "/user/author", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Author addAuthor(@Valid @RequestBody Author author) {
        return authorFacade.addToAuthors(author);
    }

    @ResponseStatus(HttpStatus.OK) @GetMapping("/user/author")
    public List<Author> getAllAuthors() {
        return authorFacade.findAllAuthors();
    }

    @ResponseStatus(HttpStatus.OK) @GetMapping("/user/author/{id}")
    public Author getAuthorById(@RequestParam Long id) {
        return authorFacade.findAuthorById(id);
    }
}
