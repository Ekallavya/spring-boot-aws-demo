package com.universe.opensky.controller;

import com.universe.opensky.dto.Product;
import com.universe.opensky.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return product;
    }

    @GetMapping("/getProudct/{id}")
    public Product retrieveProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @DeleteMapping("/delete/{id}")
    public void removeProduct(Long id) {
        productService.removeProduct(id);
    }

}
