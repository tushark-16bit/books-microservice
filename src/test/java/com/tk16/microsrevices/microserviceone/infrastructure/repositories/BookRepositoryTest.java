package com.tk16.microsrevices.microserviceone.infrastructure.repositories;

import static org.junit.jupiter.api.Assertions.*;

import com.tk16.microsrevices.microserviceone.core.model.Book;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class BookRepositoryTest {

  @Autowired BookRepository repository;
  static Book sampleBook =
      new Book(1L, "Harry Puttar", "Amazing", Double.parseDouble("4.0"), BigDecimal.valueOf(400));

  @Test
  void findByTitleContainingIgnoreCase() {

    repository.save(sampleBook);
    assertFalse(repository.findByTitleContainingIgnoreCase("harry").isEmpty());
  }
}
