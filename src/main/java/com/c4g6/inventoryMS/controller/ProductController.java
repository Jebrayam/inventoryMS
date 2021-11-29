package com.c4g6.inventoryMS.controller;

import com.c4g6.inventoryMS.models.Product;
import com.c4g6.inventoryMS.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @PostMapping("/products")
    Product newProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/products/all")
    List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/categories/{category}")
    List<Product> getProductsByCategory(@PathVariable String category){
        return productRepository.findByCategory(category);
    }

    @GetMapping("/products/{name}")
    Product getProduct(@PathVariable String name){
        return productRepository.findByName(name);
    }

    @PutMapping("/products/update/{name}")
    Product updateProduct(@RequestBody Product upProduct, @PathVariable String name){
        Product product = productRepository.findByName(name);
        product.setCategory(upProduct.getCategory());
        product.setDescription(upProduct.getDescription());
        product.setName(upProduct.getName());
        product.setPrice(upProduct.getPrice());
        return productRepository.save(product);
    }

    @DeleteMapping("/products/delete/{name}")
    void deleteProduct(@PathVariable String name){
        Product product = productRepository.findByName(name);
        productRepository.deleteById(product.getId());
    }
}
