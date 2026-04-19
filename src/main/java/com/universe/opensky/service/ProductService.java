package com.universe.opensky.service;

import com.universe.opensky.dto.Product;
import com.universe.opensky.entity.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void addProduct(Product product) {
        System.out.println("addProduct called with: " + product);
        productRepository.addProduct(product);
    }

    public Product getProduct(Long id) {
        System.out.println("getProduct called with id: " + id);
        return productRepository.getProduct(id);
    }

    public List<Product> getAllProducts() {
        System.out.println("getAllProducts called");
        return productRepository.getProducts();
    }

    public void removeProduct(Long id) {
        System.out.println("removeProduct called with id: " + id);
        productRepository.removeProduct(id);
    }
}
