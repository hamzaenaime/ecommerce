package com.sqli.ecommerce.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sqli.ecommerce.product.model.Product;
import com.sqli.ecommerce.product.service.ProductService;

@RestController
public class ProductController {
    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<?> products(){
        return new ResponseEntity<>(productService.findProducts(), HttpStatus.OK);
    }


    @GetMapping("/products/{id}")
    public ResponseEntity<?> productById(@PathVariable final int id){
        return new ResponseEntity<>(productService.findProductsById(id),HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<?> productById(@RequestBody final Product product){
        return new ResponseEntity<>(productService.addProduct(product),HttpStatus.OK);
    }
}
