package com.tk16.microsrevices.microserviceone.infrastructure.repositories;

import com.tk16.microsrevices.microserviceone.core.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {}
