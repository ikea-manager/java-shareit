package ru.practicum.shareit.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BookingAlreadyApprovedException extends RuntimeException {

  public BookingAlreadyApprovedException(String message) {
    super(message);
  }
}
