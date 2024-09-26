package com.ecommerce.inventory.infraestructure.item.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.inventory.application.item.dto.CreateItemDto;
import com.ecommerce.inventory.application.item.dto.ItemDetailsDto;
import com.ecommerce.inventory.application.item.service.IItemService;

@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
  private final IItemService itemService;

  public ItemController(IItemService itemService) {
    this.itemService = itemService;
  }

  @PostMapping("/create")
  public ItemDetailsDto createItem(CreateItemDto itemDto) {
    return itemService.createItem(itemDto);
  }
}
