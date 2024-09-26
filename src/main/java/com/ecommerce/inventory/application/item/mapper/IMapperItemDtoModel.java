package com.ecommerce.inventory.application.item.mapper;

import com.ecommerce.inventory.application.item.dto.CreateItemDto;
import com.ecommerce.inventory.application.item.dto.ItemDetailsDto;
import com.ecommerce.inventory.domain.model.item.Item;

public interface IMapperItemDtoModel {
  Item toModel(CreateItemDto createItemDto);
  ItemDetailsDto toDto(Item item);
}
