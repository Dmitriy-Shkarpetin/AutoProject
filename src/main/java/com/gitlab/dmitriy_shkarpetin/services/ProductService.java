package com.gitlab.dmitriy_shkarpetin.services;

import com.gitlab.dmitriy_shkarpetin.forms.CustomerForm;
import com.gitlab.dmitriy_shkarpetin.forms.ProductForm;
import com.gitlab.dmitriy_shkarpetin.models.Product;

import java.util.List;

public interface ProductService {
    void addProduct(ProductForm form);
    List<Product> getAllProducts();

    void deleteProduct(Integer productId);

    Product getProduct(Integer product_id);

    void updateProduct(Integer productId, ProductForm form);
}
