package com.ecommerce.inventory.domain.model.item.port;

import java.util.List;
import com.ecommerce.inventory.domain.model.item.Item;

public interface IItemRepository {
  Item save(Item item);
  Item findByProductId(String productId);
  List<Item> findAll();
}
