package com.sqli.ecommerce.product.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sqli.ecommerce.product.model.Product;
@Component
public class ProductStoreImpl implements ProductStore{

    private final List<Product> products;

    public ProductStoreImpl() {
        this.products = new ArrayList<>();
    }

    public void addProduct(final Product product){
        this.products.add(product);
    }

    public List<Product> findProducts(){
        return this.products;
    }

    public Optional<Product> findProductById(final int id){
        return this.products
            .stream()
            .filter(product -> product.getId() == id)
            .findAny();
    }
}
