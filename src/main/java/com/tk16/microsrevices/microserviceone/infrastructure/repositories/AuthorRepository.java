package com.tk16.microsrevices.microserviceone.infrastructure.repositories;

import com.tk16.microsrevices.microserviceone.core.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

  Author findFirstByFullName(String fullName);
}
