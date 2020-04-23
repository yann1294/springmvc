package com.salazard.springframework.springmvc.services;

import com.salazard.springframework.springmvc.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer, Customer> customers;

    public CustomerServiceImpl() {
        loadCustomers();
    }

    public void loadCustomers(){

        customers = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Doe");
        customer1.setLastName("John");
        customer1.setAddressOne("Russia");
        customer1.setAddressTwo("Moscow");
        customer1.setPhoneNumber("123456");
        customer1.setCity("Bangalore");
        customer1.setState("Karnataka");
        customer1.setEmail("test@gmail.com");
        customer1.setZipCode("33006");
        customer1.setPhoneNumber("12345789");

        customers.put(1, customer1);


        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Doe");
        customer2.setLastName("John");
        customer2.setAddressOne("Russia");
        customer2.setAddressTwo("Moscow");
        customer2.setPhoneNumber("123456");
        customer2.setCity("Bangalore");
        customer2.setState("Karnataka");
        customer2.setEmail("test@gmail.com");
        customer2.setZipCode("33006");
        customer2.setPhoneNumber("12344560");

        customers.put(2, customer2);


        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("Doe");
        customer3.setLastName("John");
        customer3.setAddressOne("Russia");
        customer3.setAddressTwo("Moscow");
        customer3.setPhoneNumber("123456");
        customer3.setCity("Bangalore");
        customer3.setState("Karnataka");
        customer3.setEmail("test@gmail.com");
        customer3.setZipCode("33006");
        customer3.setPhoneNumber("1234566");

        customers.put(3, customer3);


        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("Doe");
        customer4.setLastName("John");
        customer4.setAddressOne("Russia");
        customer4.setAddressTwo("Moscow");
        customer4.setPhoneNumber("123456");
        customer4.setCity("Bangalore");
        customer4.setState("Karnataka");
        customer4.setEmail("test@gmail.com");
        customer4.setZipCode("33006");
        customer4.setPhoneNumber("1234567");

        customers.put(4, customer4);


        Customer customer5 = new Customer();
        customer5.setId(5);
        customer5.setFirstName("Doe");
        customer5.setLastName("John");
        customer5.setAddressOne("Russia");
        customer5.setAddressTwo("Moscow");
        customer5.setPhoneNumber("123456");
        customer5.setCity("Bangalore");
        customer5.setState("Karnataka");
        customer5.setEmail("test@gmail.com");
        customer5.setZipCode("33006");
        customer5.setPhoneNumber("34256193");

        customers.put(5, customer5);
    }

    @Override
    public List<Customer> listAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customers.get(id);
    }
}
