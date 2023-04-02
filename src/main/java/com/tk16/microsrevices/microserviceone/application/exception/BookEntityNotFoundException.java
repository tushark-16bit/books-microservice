package com.tk16.microsrevices.microserviceone.application.exception;

import jakarta.persistence.EntityNotFoundException;


public class BookEntityNotFoundException extends EntityNotFoundException {
  public BookEntityNotFoundException(String message) {
        super(message);
    }
}
