package com.ecommerce.inventory.infraestructure.item.adapter;

import java.util.List;
import com.ecommerce.inventory.domain.constant.Constant;
import com.ecommerce.inventory.domain.exception.NotFoundException;
import com.ecommerce.inventory.domain.model.item.Item;
import com.ecommerce.inventory.domain.model.item.port.IItemRepository;
import com.ecommerce.inventory.infraestructure.item.dao.IJpaRepositoryItem;
import com.ecommerce.inventory.infraestructure.item.mapper.IMapperItemEntityModel;
import com.ecommerce.inventory.infraestructure.item.persistence.ItemEntity;

public class ItemAdapter implements IItemRepository {

  private final IMapperItemEntityModel mapperItemEntityModel;
  private final IJpaRepositoryItem repositoryItem;

  public ItemAdapter(IMapperItemEntityModel mapperItemEntityModel, IJpaRepositoryItem repositoryItem) {
    this.mapperItemEntityModel = mapperItemEntityModel;
    this.repositoryItem = repositoryItem;
  }

  @Override
  public Item save(Item item) {
    ItemEntity itemEntity = mapperItemEntityModel.toEntity(item);
    ItemEntity savedItemEntity = repositoryItem.save(itemEntity);
    return mapperItemEntityModel.toModel(savedItemEntity);
  }

  @Override
  public Item findByProductId(String productId) {
    ItemEntity itemEntity = repositoryItem.findByProductId(productId)
        .orElseThrow(() -> new NotFoundException(Constant.ITEM_NOT_FOUND));
    return mapperItemEntityModel.toModel(itemEntity);
  }

  @Override
  public List<Item> findAll() {
    List<ItemEntity> itemEntities = repositoryItem.findAll();
    return itemEntities.stream()
        .map(mapperItemEntityModel::toModel)
        .toList();
  }
  
}
