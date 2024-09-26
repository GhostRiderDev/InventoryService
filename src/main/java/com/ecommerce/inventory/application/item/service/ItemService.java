package com.ecommerce.inventory.application.item.service;

import java.util.List;
import com.ecommerce.inventory.application.item.dto.CreateItemDto;
import com.ecommerce.inventory.application.item.dto.ItemDetailsDto;
import com.ecommerce.inventory.application.item.mapper.IMapperItemDtoModel;
import com.ecommerce.inventory.domain.model.item.Item;
import com.ecommerce.inventory.domain.model.item.port.IItemRepository;

public class ItemService implements IItemService {
  private final IMapperItemDtoModel mapperItemDtoModel;
  private final IItemRepository itemRepository;

  public ItemService(IMapperItemDtoModel mapperItemDtoModel, IItemRepository itemRepository) {
    this.mapperItemDtoModel = mapperItemDtoModel;
    this.itemRepository = itemRepository;
  }

  @Override
  public ItemDetailsDto createItem(CreateItemDto createItemDto) {
    Item item = mapperItemDtoModel.toModel(createItemDto);
    itemRepository.save(item);
    return mapperItemDtoModel.toDto(item);
  }

  @Override
  public ItemDetailsDto findItem(String productId) {
    Item item = itemRepository.findByProductId(productId);
    return mapperItemDtoModel.toDto(item);
  }

  @Override
  public List<ItemDetailsDto> findAllItems() {
    List<Item> items = itemRepository.findAll();
    return items.stream()
      .map(mapperItemDtoModel::toDto)
      .toList();
  }
  
}
