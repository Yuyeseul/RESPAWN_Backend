package com.shop.respawn.repository;

import com.shop.respawn.domain.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuyerRepository extends JpaRepository<Buyer, Long>, BuyerRepositoryCustom {

    List<Buyer> findByUsername(String username);

    Buyer findAuthByUsername(String username);

    Boolean existsByUsername(String username);
}
