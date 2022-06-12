package com.gitlab.dmitriy_shkarpetin.repositories;

import com.gitlab.dmitriy_shkarpetin.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    List<Product> findAll();
}
