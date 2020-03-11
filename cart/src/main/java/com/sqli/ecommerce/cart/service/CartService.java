package com.sqli.ecommerce.cart.service;

import java.util.List;

import com.sqli.ecommerce.cart.model.Cart;

public interface CartService {
    Cart addCart(final Cart cart);

    List<Cart> findCarts();

    Cart findCartById(final int id);
}
