package com.ecommerce.inventory.application.item.dto;

import com.ecommerce.inventory.domain.enumerate.ItemStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ItemDetailsDto {
  private String productId;
  private int stock;
  private ItemStatus status;
}
