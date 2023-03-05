package com.tk16.microsrevices.microserviceone.application;

import com.tk16.microsrevices.microserviceone.core.AuthorFacade;
import com.tk16.microsrevices.microserviceone.core.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired AuthorFacade authorFacade;

    @PostMapping(
            value = "/admin/author",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Author addAuthor(@RequestBody Author author) {
        return authorFacade.addToAuthors(author);
    }

//    @GetMapping(value = "/user/author/{id}")
//    public Author findAuthorById(@PathVariable Long id) {
//        return authorFacade.findAuthorById(id);
//    }
}
