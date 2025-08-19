package com.neueda.events_api.service;

import com.neueda.events_api.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

import java.util.List;
import java.util.ArrayList;

@Service
@Profile("local")
public class CustomerServiceLocal implements CustomerService{
    private final List<Customer> customers;

    public CustomerServiceLocal(List<Customer> customers){
        this.customers = customers;
    }

    public List<Customer> getAllCustomers(){
        return customers;
    }

    public Customer getCustomer(Integer id){
        return customers.get(id.intValue());
    }

    public void createCustomer(Customer customer){
        customers.add(customer);
    }
}
