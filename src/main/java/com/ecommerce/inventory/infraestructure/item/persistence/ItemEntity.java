package com.ecommerce.inventory.infraestructure.item.persistence;

import java.time.LocalDateTime;
import org.springframework.data.annotation.LastModifiedDate;
import com.ecommerce.inventory.domain.enumerate.ItemStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "\"Item\"")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemEntity {
  @Id
  private String productId;

  private Integer stock;

  @Enumerated(EnumType.ORDINAL) 
  private ItemStatus status;

  @LastModifiedDate
  private LocalDateTime lastUpdated;
}
