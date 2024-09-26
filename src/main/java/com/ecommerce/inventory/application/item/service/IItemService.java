package com.ecommerce.inventory.application.item.service;

import java.util.List;
import com.ecommerce.inventory.application.item.dto.CreateItemDto;
import com.ecommerce.inventory.application.item.dto.ItemDetailsDto;

public interface IItemService {
  ItemDetailsDto createItem(CreateItemDto createItemDto);
  ItemDetailsDto findItem(String productId);
  List<ItemDetailsDto> findAllItems();
}
