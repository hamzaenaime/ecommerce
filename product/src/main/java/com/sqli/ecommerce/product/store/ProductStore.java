package com.sqli.ecommerce.product.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.sqli.ecommerce.product.model.Product;

public interface ProductStore {

    void addProduct(final Product product);

    List<Product> findProducts();

    Optional<Product> findProductById(final int id);
}
