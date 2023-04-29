package ru.practicum.shareit.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@RequiredArgsConstructor
public class JsonEntitySerializer {

  private final ObjectMapper objectMapper;

  public <T> String serializeObjectToJson(T object) {
    try {
      return objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException exception) {
      log.error("JsonProcessingException caught!");
      return "";
    }
  }

  public <T> T serializeJsonToObject(String json, Class<T> tClass) {
    try {
      return objectMapper.readValue(json, tClass);
    } catch (JsonProcessingException exception) {
      log.error("JsonProcessingException caught!");
      return null;
    }
  }
}
