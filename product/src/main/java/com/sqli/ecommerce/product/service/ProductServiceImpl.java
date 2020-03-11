package com.sqli.ecommerce.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sqli.ecommerce.product.model.Product;
import com.sqli.ecommerce.product.store.ProductStore;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductStore productStore;

    @Autowired
    public ProductServiceImpl(ProductStore productStore) {
        this.productStore = productStore;
    }

    @Override
    public Product addProduct(Product product) {
        productStore.addProduct(product);
        return product;
    }

    @Override
    public List<Product> findProducts() {
        return productStore.findProducts();
    }

    @Override
    public Product findProductsById(final int id) {
            return productStore.findProductById(id).orElseThrow(() ->new RuntimeException("No product found"));

    }

}
