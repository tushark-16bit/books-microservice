package com.tk16.microsrevices.microserviceone.infrastructure.repositories;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
