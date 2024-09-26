package com.ecommerce.inventory.infraestructure.item.mapper;

import com.ecommerce.inventory.domain.model.item.Item;
import com.ecommerce.inventory.infraestructure.item.persistence.ItemEntity;

public interface IMapperItemEntityModel {
  Item toModel(ItemEntity itemEntity);
  ItemEntity toEntity(Item item);
}
