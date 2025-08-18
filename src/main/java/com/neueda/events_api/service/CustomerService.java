package com.neueda.events_api.service;

import com.neueda.events_api.entity.Customer;

import java.util.List;


public interface CustomerService {
    public List<Customer> getAllCustomers();
    public Customer getCustomer(Integer id);
    public void createCustomer(Customer customer);
}
