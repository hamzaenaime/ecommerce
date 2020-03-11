package com.sqli.ecommerce.cart.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final int id;
    private final List<CartLine> cartLines;

    public Cart(int id, List<CartLine> cartLines) {
        this.id = id;
        this.cartLines = new ArrayList<>();
    }

    public void addCartLine(final CartLine cartLine) {
        this.cartLines.add(cartLine);
    }

    public int getId() {
        return id;
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }
}
