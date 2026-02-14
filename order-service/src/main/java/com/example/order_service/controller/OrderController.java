package com.example.order_service.controller;

import com.example.order_service.client.ProductClient;
import com.example.order_service.dto.OrderRequest;
import com.example.order_service.dto.ProductDTO;
import com.example.order_service.entity.Order;
import com.example.order_service.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/products")
    public List<ProductDTO> fetchProducts() {
        return orderService.fetchProducts();
    }

    @GetMapping("/products/{id}")
    public ProductDTO getProductById(@PathVariable Long id) {
        return orderService.getProductById(id);
    }

    @PostMapping("/create")
    public String placeOrder() {
        return "Order placed";
    }

    /*@GetMapping
    public String testOrder() {
        return "Order Service is working";
    }*/
}
