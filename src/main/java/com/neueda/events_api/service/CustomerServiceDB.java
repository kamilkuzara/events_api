package com.neueda.events_api.service;

import com.neueda.events_api.entity.CustomerRepository;
import com.neueda.events_api.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Service
@Profile("db")
public class CustomerServiceDB implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceDB(CustomerRepository customerRepository){
      this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomer(Integer id){
      return customerRepository.findById(id).orElse(null);
    }

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }
}
