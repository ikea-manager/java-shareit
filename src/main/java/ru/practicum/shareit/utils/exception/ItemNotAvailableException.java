package ru.practicum.shareit.utils.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ItemNotAvailableException extends RuntimeException{
  public ItemNotAvailableException(String message){
    super(message);
  }
}
