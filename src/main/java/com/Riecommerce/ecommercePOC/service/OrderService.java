package com.Riecommerce.ecommercePOC.service;

import java.util.List;

import com.Riecommerce.ecommercePOC.exception.OrderException;
import com.Riecommerce.ecommercePOC.model.Address;
import com.Riecommerce.ecommercePOC.model.Order;
import com.Riecommerce.ecommercePOC.model.User;

public interface OrderService {
    public Order createOrder(User user,Address shippingAddress);
    public Order findOrderById(Long orderId) throws OrderException;

    public List<Order> userOrderHistory(Long userId);

    public Order placedOrder(Long orderId) throws OrderException;

    public Order confirmedOrder(Long orderId) throws OrderException;

    public Order shippedOrder(Long orderId) throws OrderException;

    public Order deliveredOrder(Long orderId) throws OrderException;

    public Order cancledOrder(Long orderId) throws OrderException;

    public List<Order> getAllOrders();

    public void deleteOrder(Long orderId) throws OrderException;




}

