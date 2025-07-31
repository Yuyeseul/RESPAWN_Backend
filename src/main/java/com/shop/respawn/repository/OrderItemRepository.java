package com.shop.respawn.repository;

import com.shop.respawn.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

    List<OrderItem> findAllByItemIdIn(List<String> itemIds);
}
