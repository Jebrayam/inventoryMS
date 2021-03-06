package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Order;
import com.c4g6.inventoryMS.models.OrderProduct;
import com.c4g6.inventoryMS.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderProductRepository extends MongoRepository<OrderProduct, String> {
    List<Product> findByProduct (String product);
}
