package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends MongoRepository<Order, Integer> {
    List<Order> findByDate (Date date);
}
