package com.Riecommerce.ecommercePOC.service;

import com.Riecommerce.ecommercePOC.exception.CartItemException;
import com.Riecommerce.ecommercePOC.exception.UserException;
import com.Riecommerce.ecommercePOC.model.Cart;
import com.Riecommerce.ecommercePOC.model.CartItem;
import com.Riecommerce.ecommercePOC.model.Product;

public interface CartItemService {

    public CartItem createCartItem(CartItem cartItem);

    public CartItem updateCartItem(Long userId,Long id,CartItem cartItem)throws CartItemException,UserException;

    public CartItem isCarItemExist(Cart cart,Product product,String size,Long userId);

    public void removeCartItem(Long userId,Long cartItemId)throws CartItemException,UserException;

    public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
