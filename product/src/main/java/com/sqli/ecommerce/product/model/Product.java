package com.sqli.ecommerce.product.model;

import java.util.UUID;

public class Product {

    private final int id;
    private final String name;
    private final String description;
    private final double price;

    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
