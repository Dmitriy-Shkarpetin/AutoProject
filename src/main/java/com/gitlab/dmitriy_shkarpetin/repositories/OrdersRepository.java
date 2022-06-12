package com.gitlab.dmitriy_shkarpetin.repositories;

import com.gitlab.dmitriy_shkarpetin.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Order, Integer> {
    List<Order> findAll();
}
