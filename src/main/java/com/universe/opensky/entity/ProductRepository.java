package com.universe.opensky.entity;

import com.universe.opensky.dto.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {

     Map<Long, Product> products = new HashMap<Long, Product>() ;

    {
         Product product1 = new Product(1L,"Apple",50L);
         Product product2 = new Product(2L,"Banana",60L);
         Product product3 = new Product(3L,"Orange",70L);
         Product product4 = new Product(4L,"Grapes",80L);
        Product product5 = new Product(5L,"Kiwi",91L);
        Product product6 = new Product(6L,"Pineapple",92L);
        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
        products.put(product4.getId(), product4);
        products.put(product5.getId(), product5);

    }

    public Product getProduct(Long id) {
        return products.get(id);
    }
    public List<Product> getProducts() {
        return new ArrayList<>(products.values());
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public void removeProduct(Long id) {
        products.remove(id);
    }
}
