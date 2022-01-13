package com.c4g6.inventoryMS.repositories;

import com.c4g6.inventoryMS.models.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> { }
