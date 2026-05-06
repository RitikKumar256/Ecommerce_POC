package com.Riecommerce.ecommercePOC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Riecommerce.ecommercePOC.exception.OrderException;
import com.Riecommerce.ecommercePOC.model.Address;
import com.Riecommerce.ecommercePOC.model.Order;
import com.Riecommerce.ecommercePOC.model.User;
import com.Riecommerce.ecommercePOC.repository.CartRepository;

@Service
public class OrderServiceImplementation implements OrderService {

    private CartRepository cartRepository;
    private CartService cartItemService;
    private ProductService productService;

    public OrderServiceImplementation(CartRepository cartRepository,CartService cartItemService
            ,ProductService productService) {
        this.cartItemService=cartItemService;
        this.cartRepository=cartRepository;
        this.productService=productService;
    }
    @Override
    public Order createOrder(User user, Address shippingAddress) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order findOrderById(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> userOrderHistory(Long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order placedOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order confirmedOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order shippedOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order deliveredOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Order cancledOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) throws OrderException {
        // TODO Auto-generated method stub

    }

}

