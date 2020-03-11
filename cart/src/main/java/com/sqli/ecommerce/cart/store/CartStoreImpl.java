package com.sqli.ecommerce.cart.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.sqli.ecommerce.cart.model.Cart;
import com.sqli.ecommerce.cart.model.CartLine;

@Component
public class CartStoreImpl implements CartStore{

    private final List<Cart> carts;

    public CartStoreImpl() {
        this.carts = new ArrayList<>();
    }


    @Override
    public Cart addCart(Cart cart) {
        carts.add(cart);
        return cart;
    }

    @Override
    public List<Cart> findCarts() {
        return carts;
    }

    @Override
    public Optional<Cart> findCartById(int id) {
        return carts.stream().filter(cart -> cart.getId() == id).findAny();
    }

}
