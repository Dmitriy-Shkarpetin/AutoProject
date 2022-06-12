package com.gitlab.dmitriy_shkarpetin.forms;

import lombok.Data;

@Data
public class ProductForm {
    String description;
    Double price;
    Integer quantity;
}
