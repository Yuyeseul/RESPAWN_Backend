package com.shop.respawn.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.*;

@Entity
@Table(name = "cart")
@Getter @Setter
public class Cart {

    @Id @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "buyer_id")
    private Buyer buyer; //주문 회원

    @OneToMany(mappedBy = "cart", cascade = ALL, orphanRemoval = true)
    private List<CartItem> cartItems = new ArrayList<>();


    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
        cartItem.assignCart(this);  // 양방향 연관 관계 세팅
    }
}
