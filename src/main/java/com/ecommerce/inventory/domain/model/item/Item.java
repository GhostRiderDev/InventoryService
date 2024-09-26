package com.ecommerce.inventory.domain.model.item;

import java.time.LocalDateTime;
import com.ecommerce.inventory.domain.enumerate.ItemStatus;

public class Item {
  private String productId;
  private Integer stock;
  private ItemStatus status;
  private LocalDateTime lastUpdated;

  public Item(String productId, Integer stock, ItemStatus status, LocalDateTime lastUpdated) {
    this.productId = productId;
    this.stock = stock;
    this.status = status;
    this.lastUpdated = lastUpdated;
  }


  public String getProductId() {
    return productId;
  }

  public int getStock() {
    return stock;
  }

  public ItemStatus getStatus() {
    return status;
  }

  public LocalDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public void setStatus(ItemStatus status) {
    this.status = status;
  }

  public void setLastUpdated(LocalDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public void increaseStock(int quantity) {
    this.stock += quantity;
  }

  public void decreaseStock(int quantity) {
    this.stock -= quantity;
  }

  public void updateStatus(ItemStatus status) {
    this.status = status;
  }

  public void updateLastUpdated() {
    this.lastUpdated = LocalDateTime.now();
  }

  public boolean isAvailable() {
    return this.status == ItemStatus.AVAILABLE;
  }

  public boolean isOutOfStock() {
    return this.status == ItemStatus.OUT_OF_STOCK;
  }

  public boolean isDiscontinued() {
    return this.status == ItemStatus.DISCONTINUED;
  }

  public boolean hasEnoughStock(int quantity) {
    return this.stock >= quantity;
  }

  public static ItemBuilder builder() {
    return new ItemBuilder();
  }

  public static class ItemBuilder {
    private String productId;
    private int stock;
    private ItemStatus status;
    private LocalDateTime lastUpdated;



    public ItemBuilder productId(String productId) {
      this.productId = productId;
      return this;
    }

    public ItemBuilder stock(int stock) {
      this.stock = stock;
      return this;
    }

    public ItemBuilder status(ItemStatus status) {
      this.status = status;
      return this;
    }

    public ItemBuilder lastUpdated(LocalDateTime lastUpdated) {
      this.lastUpdated = lastUpdated;
      return this;
    }

    public Item build() {
      return new Item( productId, stock, status, lastUpdated);
    }
  }
}
