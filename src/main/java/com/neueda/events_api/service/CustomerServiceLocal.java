package com.neueda.events_api.service;

import com.neueda.events_api.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CustomerServiceLocal implements CustomerService{
    private final List<Customer> customers = new ArrayList<>();

    // public CustomerServiceLocal(){
    //     createCustomer("Steven", "Tyler", 32, "steventyler@gmail.com");
    //     createCustomer("Steven", "Johnson", 58, "bigjohn@outlook.com");

    // }

    public List<Customer> getAllCustomers(){
        return customers;
    }

    public Customer getCustomer(int id){
        return customers.get(id);
    }

    public void createCustomer(Customer customer){
        customers.add(customer);
    }

    public void deleteCustomer(int id){
        customers.remove(id);
    }
}
