package com.gitlab.dmitriy_shkarpetin.services;

import com.gitlab.dmitriy_shkarpetin.forms.OrderForm;
import com.gitlab.dmitriy_shkarpetin.models.Order;

import java.util.List;

public interface OrdersService {
    void addOrder(OrderForm form);
    List<Order>  getAllOrders();
    List<Order> findByIdProduct(String productId);
    List<Order> findByIdCustomer(String customerId);
    void deleteOrder(Integer id);

    Order getOrder(Integer id);

    void updateOrder(Integer id, OrderForm form);
}
