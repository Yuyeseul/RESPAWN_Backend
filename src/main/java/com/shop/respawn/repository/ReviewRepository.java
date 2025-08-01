package com.shop.respawn.repository;

import com.shop.respawn.domain.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, String> {
    // 특정 주문 아이템에 리뷰가 이미 있는지 체크
    Optional<Review> findByOrderItemId(String orderItemId);

    List<Review> findByOrderItemIdInOrderByCreatedDateDesc(List<String> orderItemIds);

    List<Review> findByItemIdOrderByCreatedDateDesc(String itemId);
}