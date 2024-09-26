package com.ecommerce.inventory.infraestructure.item.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.inventory.infraestructure.item.persistence.ItemEntity;

public interface IJpaRepositoryItem extends JpaRepository<ItemEntity, String> {
  Optional<ItemEntity> findByProductId(String productId);
}
