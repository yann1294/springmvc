package com.salazard.springframework.springmvc.controllers;

import com.salazard.springframework.springmvc.domain.Customer;
import com.salazard.springframework.springmvc.domain.Product;
import com.salazard.springframework.springmvc.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customers")
    public String listCustomers(Model model){
        model.addAttribute("customers", customerService.listAllCustomers());

        return "customers";
    }

    @RequestMapping("/customer/{id}")
    public String getCustomer(@PathVariable Integer id, Model model){
        model.addAttribute("customer", customerService.getCustomerById(id));

        return "customer";
    }

    @RequestMapping("/customer/edit/{id}")
    public String editCustomer(@PathVariable Integer id, Model model){

        model.addAttribute("customer", customerService.getCustomerById(id));

        return "customerform";
    }

    @RequestMapping("/customer/new")
    public String newCustomer(Model model){
        model.addAttribute("customer", new Customer());

        return "customerform";
    }

    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public String saveOrUpdateProduct(Customer customer){
        Customer saveProduct = customerService.saveOrUpdate(customer);
        return "redirect:/customer/" + saveProduct.getId();
    }
}
