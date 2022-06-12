package com.gitlab.dmitriy_shkarpetin.forms;

import com.gitlab.dmitriy_shkarpetin.models.Product;
import lombok.Data;

@Data
public class PartForm {
    private Integer product_id;
    private Product product;
    private String description;
    private double price;
    private Integer quantity;
}