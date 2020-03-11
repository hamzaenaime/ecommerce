package com.sqli.ecommerce.cart.store;

import java.util.List;
import java.util.Optional;

import com.sqli.ecommerce.cart.model.Cart;

public interface CartStore {
    Cart addCart(final Cart cart);

    List<Cart> findCarts();

    Optional<Cart> findCartById(final int id);
}
