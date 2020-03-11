package com.sqli.ecommerce.product.service;

import java.util.List;

import com.sqli.ecommerce.product.model.Product;

public interface ProductService {
    Product addProduct(final Product product);

    List<Product> findProducts();

    Product findProductsById(final int id);


}
