package com.ecommerce.inventory.infraestructure.item.mapper;

import com.ecommerce.inventory.domain.model.item.Item;
import com.ecommerce.inventory.infraestructure.item.persistence.ItemEntity;

public class MapperItemEntityModel implements IMapperItemEntityModel {

  @Override
  public Item toModel(ItemEntity itemEntity) {
    return Item.builder()
      .productId(itemEntity.getProductId())
      .stock(itemEntity.getStock())
      .status(itemEntity.getStatus())
      .lastUpdated(itemEntity.getLastUpdated())
      .build();

  }

  @Override
  public ItemEntity toEntity(Item item) {
    return ItemEntity.builder()
      .productId(item.getProductId())
      .stock(item.getStock())
      .status(item.getStatus())
      .lastUpdated(item.getLastUpdated())
      .build();
  }
  
}
