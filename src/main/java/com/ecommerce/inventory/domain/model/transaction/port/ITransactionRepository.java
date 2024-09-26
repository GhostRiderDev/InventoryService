package com.ecommerce.inventory.domain.model.transaction.port;

import java.util.List;
import com.ecommerce.inventory.domain.enumerate.TransactionType;
import com.ecommerce.inventory.domain.model.transaction.Transaction;

public interface ITransactionRepository {
  Transaction save(Transaction transaction);
  Transaction findById(String id);
  List<Transaction> findByOrderId(String orderId);
  List<Transaction> findByItemId(String itemId);
  List<Transaction> findByType(TransactionType type);
  List<Transaction> findAll();
}
