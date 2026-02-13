package com.example.order_service.client;

import com.example.order_service.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", fallback = ProductClientFallback.class)
public interface ProductClient {

    @GetMapping("/products")
    public List<ProductDTO> getProducts();

    @GetMapping("/products/{id}")
    public ProductDTO getProductById(@PathVariable Long id);
}
