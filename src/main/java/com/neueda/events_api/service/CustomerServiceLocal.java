package com.neueda.events_api.service;

import com.neueda.events_api.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CustomerServiceLocal implements CustomerService{
    private final List<Customer> customers = new ArrayList<>();

    public CustomerServiceLocal(){
        createCustomer("Steven", "Tyler");
        createCustomer("Steven", "Johnson");
    }

    public List<Customer> getAllCustomers(){
        return customers;
    }

    public Customer getCustomer(int id){
        return customers.get(id);
    }

    public void createCustomer(String firstName, String lastName){
        int id = customers.size();
        customers.add(new Customer(id, firstName, lastName));
    }
}
