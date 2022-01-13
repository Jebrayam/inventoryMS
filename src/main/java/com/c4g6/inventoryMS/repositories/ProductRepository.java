package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Category;
import com.c4g6.inventoryMS.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByCategory (String category);
    Product findByName(String name);
}
