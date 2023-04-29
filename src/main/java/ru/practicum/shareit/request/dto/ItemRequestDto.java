package ru.practicum.shareit.request.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.practicum.shareit.request.utils.literal.RequestDtoJsonProperty;

@Data
@RequiredArgsConstructor
public class ItemRequestDto {

  @JsonProperty(RequestDtoJsonProperty.ID)
  private Long id;

  @JsonProperty(RequestDtoJsonProperty.DESCRIPTION)
  private String description;

  @JsonProperty(RequestDtoJsonProperty.REQUESTOR_ID)
  private Long requestorId;

  @JsonProperty(RequestDtoJsonProperty.CREATED)
  private String created;

  @JsonProperty(RequestDtoJsonProperty.ITEM_ID)
  private Long itemId;
}
