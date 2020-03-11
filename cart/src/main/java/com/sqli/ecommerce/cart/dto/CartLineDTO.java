package com.sqli.ecommerce.cart.dto;

public class CartLineDTO {
    private final int idProduct;
    private final int quantity;

    public CartLineDTO(int idProduct, int quantity) {
        this.idProduct = idProduct;
        this.quantity = quantity;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}
