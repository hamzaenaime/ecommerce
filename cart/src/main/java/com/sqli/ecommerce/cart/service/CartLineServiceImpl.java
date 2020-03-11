package com.sqli.ecommerce.cart.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sqli.ecommerce.cart.model.CartLine;
@Service
public class CartLineServiceImpl implements CartLineService {
    private final RestTemplate restTemplate;
    public CartLineServiceImpl() {
        restTemplate = new RestTemplate();
    }

    @Override
    public CartLine getCartLine(int id) {
        String url= "http://localhost:8080/products/"+id;
        ResponseEntity<CartLine> response = restTemplate.getForEntity(url, CartLine.class);
        return response.getBody();
    }
}
