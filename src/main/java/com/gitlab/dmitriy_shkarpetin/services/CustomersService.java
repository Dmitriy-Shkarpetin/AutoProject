package com.gitlab.dmitriy_shkarpetin.services;

import com.gitlab.dmitriy_shkarpetin.forms.CustomerForm;
import com.gitlab.dmitriy_shkarpetin.models.Customer;

import java.util.List;
import java.util.Set;

public interface CustomersService {
    void addCustomer(CustomerForm form);
    List<Customer> getAllCustomers();


    void deleteCustomer(Integer customerId);

    Customer getCustomer(Integer customer_id);

    void updateCustomer(Integer customerId, CustomerForm form);
}
