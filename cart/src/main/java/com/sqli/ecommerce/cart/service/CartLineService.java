package com.sqli.ecommerce.cart.service;

import com.sqli.ecommerce.cart.model.CartLine;

public interface CartLineService {
    CartLine getCartLine(final int id);
}
