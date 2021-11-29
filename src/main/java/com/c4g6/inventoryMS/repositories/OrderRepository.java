package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Order;
import com.c4g6.inventoryMS.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findByDate (Date date);
    List<Order> findByUsername (String username);
    Order findOrderById (String id);
}
