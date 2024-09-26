package com.ecommerce.inventory.application.item.mapper;

import java.time.LocalDateTime;
import com.ecommerce.inventory.application.item.dto.CreateItemDto;
import com.ecommerce.inventory.application.item.dto.ItemDetailsDto;
import com.ecommerce.inventory.domain.model.item.Item;
import com.ecommerce.inventory.domain.enumerate.ItemStatus;

public class MapperItemDtoModel implements IMapperItemDtoModel {
  @Override
  public Item toModel(CreateItemDto createItemDto) {
    return Item.builder()
      .productId(createItemDto.getProductId())
      .stock(createItemDto.getIntialStock())
      .status(ItemStatus.AVAILABLE)
      .lastUpdated(LocalDateTime.now())
      .build();
  }

  @Override
  public ItemDetailsDto toDto(Item item) {
    return ItemDetailsDto.builder()
      .productId(item.getProductId())
      .stock(item.getStock())
      .status(item.getStatus())
      .build();
  }
  
}
