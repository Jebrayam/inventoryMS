package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Product;
import com.c4g6.inventoryMS.models.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock, Product> { }
