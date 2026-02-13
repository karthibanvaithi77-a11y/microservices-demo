package com.example.order_service.client;

import com.example.order_service.dto.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductClientFallback implements ProductClient {

    @Override
    public List<ProductDTO> getProducts() {
        return List.of(
                new ProductDTO(0L, "Fallback Product", 0.0)
        );
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return new ProductDTO(id, "Unknown", 0.0);
    }
}