package com.c4g6.inventoryMS.controller;

import com.c4g6.inventoryMS.exceptions.CategoryNotFoundException;
import com.c4g6.inventoryMS.models.Category;
import com.c4g6.inventoryMS.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @PostMapping("/categories")
    Category newCategory(@RequestBody Category category){
        return categoryRepository.save(category);
    }

    @GetMapping("/categories/all")
    List<Category> getCategories(){
        return  categoryRepository.findAll();
    }

    @GetMapping("/categories/{name}")
    Category getCategory(@PathVariable String name){
        return categoryRepository.findById(name)
                .orElseThrow(() -> new CategoryNotFoundException("Category not founded: " + name));
    }
}
