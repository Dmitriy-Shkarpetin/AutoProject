package com.gitlab.dmitriy_shkarpetin.forms;

import com.gitlab.dmitriy_shkarpetin.models.Customer;
import com.gitlab.dmitriy_shkarpetin.models.Product;
import lombok.Data;
import java.sql.Date;

@Data
public class OrderForm {
    Integer id;
    private Integer product_id;
    Product product;
    private Integer customer_id;
    Customer customer;
    Date order_date;
    Integer quantity;
}
