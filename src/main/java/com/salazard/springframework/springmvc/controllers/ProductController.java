package com.salazard.springframework.springmvc.controllers;

import com.salazard.springframework.springmvc.domain.Product;
import com.salazard.springframework.springmvc.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String listProducts(Model model){

        model.addAttribute("products", productService.listAllProducts());

        return "products";
    }

    @RequestMapping("/product/{id}")
    public String getProduct(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProductById(id));

        return "product";
    }

    @RequestMapping("/product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("product", productService.getProductById(id));

        return "productform";
    }

    @RequestMapping("/product/new")
    public String newProduct(Model model){
        model.addAttribute("product", new Product());

        return "productform";
    }

    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveOrUpdateProduct(Product product){
       Product saveProduct = productService.saveOrUpdate(product);
       return "redirect:/product/" + saveProduct.getId();
    }

    @RequestMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){

        productService.deleteProduct(id);

        return "redirect:/products";
    }
}
