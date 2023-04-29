package ru.practicum.shareit.request.model;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.model.User;
import ru.practicum.shareit.utils.literal.JpaMappingDetails;

@Entity
@Data
@Table(name = JpaMappingDetails.ITEM_REQUESTS_TABLE)
@RequiredArgsConstructor
public class ItemRequest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = JpaMappingDetails.ID, nullable = false)
  private Long id;

  @Column(name = JpaMappingDetails.DESCRIPTION)
  private String description;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  @JoinColumn(name = JpaMappingDetails.REQUESTOR_ID)
  private User requestor;

  @Column(name = JpaMappingDetails.CREATED)
  private LocalDateTime created;

  @OneToOne(mappedBy = JpaMappingDetails.REQUEST, fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  private Item item;
}
