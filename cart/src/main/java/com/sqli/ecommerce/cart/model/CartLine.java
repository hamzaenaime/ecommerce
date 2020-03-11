package com.sqli.ecommerce.cart.model;

public class CartLine {
    private final int id;
    private final double price;
    private int quantity;

    public CartLine(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
