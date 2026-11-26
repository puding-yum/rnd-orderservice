package com.pudingyum.rnd.orderservice.order;

import java.math.BigDecimal;
import java.time.Instant;

public record OrderResponse(
        Long id,
        String customerId,
        String productId,
        int quantity,
        BigDecimal unitPrice,
        BigDecimal totalPrice,
        String status,
        Instant createdAt) {

    static OrderResponse from(Order order) {
        return new OrderResponse(
                order.getId(), order.getCustomerId(), order.getProductId(), order.getQuantity(),
                order.getUnitPrice(), order.getTotalPrice(), order.getStatus(), order.getCreatedAt());
    }
}
