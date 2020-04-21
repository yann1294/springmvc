package com.salazard.springframework.springmvc.services;

import com.salazard.springframework.springmvc.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);
}
