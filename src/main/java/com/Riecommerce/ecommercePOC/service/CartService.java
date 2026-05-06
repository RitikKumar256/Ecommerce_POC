package com.Riecommerce.ecommercePOC.service;

import com.Riecommerce.ecommercePOC.exception.ProductException;
import com.Riecommerce.ecommercePOC.model.Cart;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.request.AddItemRequest;

public interface CartService {

    public Cart createCart(User user);
    public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
    public Cart findUserCart(Long userId);

}