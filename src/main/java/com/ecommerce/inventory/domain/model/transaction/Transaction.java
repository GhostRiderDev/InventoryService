package com.ecommerce.inventory.domain.model.transaction;

import java.time.LocalDateTime;
import com.ecommerce.inventory.domain.enumerate.TransactionType;

public class Transaction {
  private String id;
  private String itemId;
  private int quantity;
  private TransactionType type;
  private LocalDateTime timestamp;
  private String orderId;

  public Transaction(String id, String itemId, int quantity, TransactionType type, LocalDateTime timestamp, String orderId) {
    this.id = id;
    this.itemId = itemId;
    this.quantity = quantity;
    this.type = type;
    this.timestamp = timestamp;
    this.orderId = orderId;
  }

  public String getId() {
    return id;
  }

  public String getItemId() {
    return itemId;
  }

  public int getQuantity() {
    return quantity;
  }

  public TransactionType getType() {
    return type;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

}
