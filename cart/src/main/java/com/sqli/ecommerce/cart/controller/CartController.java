package com.sqli.ecommerce.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sqli.ecommerce.cart.dto.CartLineDTO;
import com.sqli.ecommerce.cart.model.Cart;
import com.sqli.ecommerce.cart.model.CartLine;
import com.sqli.ecommerce.cart.service.CartLineService;
import com.sqli.ecommerce.cart.service.CartService;
@RestController
public class CartController {

    private final CartService cartService;
    private final CartLineService cartLineService;

    @Autowired
    public CartController(final CartService cartService,final CartLineService cartLineService) {
        this.cartService = cartService;
        this.cartLineService = cartLineService;
    }

    @GetMapping("/carts")
    public ResponseEntity<?> carts() {
        return new ResponseEntity<>(cartService.findCarts(), HttpStatus.OK);
    }


    @PostMapping("/carts")
    public ResponseEntity<?> addCart(@RequestBody final Cart cart){
        cartService.addCart(cart);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/carts/{id}/lines")
    public ResponseEntity<?> productById(@PathVariable final int id) {
        return new ResponseEntity<>(cartService.findCartById(id).getCartLines(), HttpStatus.OK);
    }

    @PostMapping("/carts/{id}/lines")
    public ResponseEntity<?> productById(@PathVariable final int id, @RequestBody final CartLineDTO cartLineDTO) {
        CartLine cartLine = fetchCartLine(cartLineDTO);
        addCartLineToCart(id, cartLine);
        return ResponseEntity
            .ok()
            .build();
    }

    private void addCartLineToCart(@PathVariable int id, CartLine cartLine) {
        cartService.findCartById(id).addCartLine(cartLine);
    }

    private CartLine fetchCartLine(@RequestBody CartLineDTO cartLineDTO) {
        CartLine cartLine = cartLineService.getCartLine(cartLineDTO.getIdProduct());
        cartLine.setQuantity(cartLineDTO.getQuantity());
        return cartLine;
    }
}
