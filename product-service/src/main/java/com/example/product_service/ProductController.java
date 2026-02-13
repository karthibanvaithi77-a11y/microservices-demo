package com.example.product_service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<Product> getAll() {
        return List.of(
                new Product(1L, "Fallback Product", 10.0)
        );
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return new Product(1L, "Product", 100.0);
    }

}
