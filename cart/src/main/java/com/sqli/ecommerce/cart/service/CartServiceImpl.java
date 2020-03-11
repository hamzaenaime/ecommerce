package com.sqli.ecommerce.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqli.ecommerce.cart.model.Cart;
import com.sqli.ecommerce.cart.store.CartStore;

@Service
public class CartServiceImpl implements CartService {

    private final CartStore cartStore;

    @Autowired
    public CartServiceImpl(CartStore cartStore) {
        this.cartStore = cartStore;
    }

    @Override
    public Cart addCart(final Cart cart) {
        return cartStore.addCart(cart);
    }

    @Override
    public List<Cart> findCarts() {
        return cartStore.findCarts();
    }

    @Override
    public Cart findCartById(int id) {
        return cartStore.findCartById(id).orElseThrow(()-> new RuntimeException("No cart found for this id "+id));
    }
}
