package com.neueda.events_api.controller;


import com.neueda.events_api.entity.Customer;
import com.neueda.events_api.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id){
        return customerService.getCustomer(id);
    }

//    @PostMapping
//    public void createCustomer(@RequestBody String firstName, @RequestBody String lastName){
//        customerService.createCustomer(firstName, lastName);
//    }
}
