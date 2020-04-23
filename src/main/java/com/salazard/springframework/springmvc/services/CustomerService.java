package com.salazard.springframework.springmvc.services;

import com.salazard.springframework.springmvc.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveOrUpdate(Customer customer);
}
