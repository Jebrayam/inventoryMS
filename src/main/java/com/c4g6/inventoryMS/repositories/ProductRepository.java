package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Category;
import com.c4g6.inventoryMS.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    List<Product> findByCategory (Category category);
}
