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
        productRepository.addProduct(product);
    }

    public Product getProduct(Long id) {
        return productRepository.getProduct(id);
    }
    public List<Product> getAllProducts() {
        return productRepository.getProducts();
    }

     public void removeProduct(Long id) {
        productRepository.removeProduct(id);
    }
}
