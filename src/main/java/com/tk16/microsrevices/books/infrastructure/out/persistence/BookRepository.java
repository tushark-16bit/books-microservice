package com.tk16.microsrevices.books.infrastructure.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookJpaEntity, Long> {}
