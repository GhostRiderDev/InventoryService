package com.ecommerce.inventory.domain.exception;

import com.ecommerce.inventory.domain.constant.Constant;

public class NotFoundException extends RuntimeException {
  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException() {
    super(Constant.DEFAULT_NOT_FOUND_MESSAGE);
  }
}
