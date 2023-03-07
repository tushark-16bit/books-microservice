package com.tk16.microsrevices.microserviceone.application;

import com.tk16.microsrevices.microserviceone.core.GenreFacade;
import com.tk16.microsrevices.microserviceone.core.model.Author;
import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.model.Genre;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {

    @Autowired GenreFacade genreFacade;

    @PostMapping(value = "/user/genre", consumes =
            MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Genre addGenre(@Valid @RequestBody Genre genre) {
        return genreFacade.addToGenres(genre);
    }

    @ResponseStatus(HttpStatus.OK) @GetMapping("/user/genre")
    public List<Genre> getAllGenres() {
        return genreFacade.findAllGenres();
    }

    @ResponseStatus(HttpStatus.OK) @GetMapping("/user/genre/{id}")
    public Genre getGenreById(@PathVariable Long id) {
        return genreFacade.findGenreById(id);
    }

    @ResponseStatus(HttpStatus.OK) @GetMapping("/user/genre/{id}/book")
    public List<Book> getBooksByGenreId(@PathVariable Long id) {
        return genreFacade.findBooksByGenreId(id);
    }
}
