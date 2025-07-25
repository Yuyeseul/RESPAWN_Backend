package com.shop.respawn.repository;

import com.shop.respawn.domain.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuyerRepository extends JpaRepository<Buyer, Long>, BuyerRepositoryCustom {

    Buyer findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByPhoneNumber(String phoneNumber);

    Boolean existsByEmail(String email);

    Optional<Buyer> findOptionalByUsername(String username);
}
