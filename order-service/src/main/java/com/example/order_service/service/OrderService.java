package com.example.order_service.service;

import com.example.order_service.client.ProductClient;
import com.example.order_service.dto.OrderRequest;
import com.example.order_service.dto.ProductDTO;
import com.example.order_service.entity.Order;
//import com.example.order_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final ProductClient productClient;
    /*private final OrderRepository orderRepository;*/

    public OrderService(ProductClient productClient) {
        this.productClient = productClient;
    }

    public List<ProductDTO> fetchProducts() {
        return productClient.getProducts();
    }

    public ProductDTO getProductById(Long id) {
        return productClient.getProductById(id);
    }

    /*public Order createOrder(OrderRequest orderRequest) {
        ProductDTO product = productClient.getProducts().stream().filter(p -> p.getId().equals(orderRequest.getProductId())).findFirst().orElseThrow(() -> new RuntimeException("Product not found"));

        Order order = new Order();
        order.setProductId(product.getId());
        order.setProductName(product.getName());
        order.setPrice(product.getPrice());
        order.setQuantity(orderRequest.getQuantity());
        order.setTotalAmount(product.getPrice() * orderRequest.getQuantity());

        return orderRepository.save(order);
    }*/
}
