package com.tk16.microsrevices.microserviceone.core;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import com.tk16.microsrevices.microserviceone.core.model.Genre;
import com.tk16.microsrevices.microserviceone.core.ports.GenreDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreFacade {

    @Autowired GenreDatabase database;

        public Genre addToGenres(Genre genre) {
            return database.save(genre);
        }

        public List<Genre> findAllGenres() {
            return database.findAll();
        }

        public Genre findGenreById(Long id) {
            var foundGenre = database.findById(id);
            if(foundGenre == null) throw new RuntimeException("Not found");
            return foundGenre;
        }

        public List<Book> findBooksByGenreId(Long id) {
            var foundGenre = database.findById(id);
            if(foundGenre == null) throw new RuntimeException("Not found");
            return foundGenre.getBooks();
        }
}
