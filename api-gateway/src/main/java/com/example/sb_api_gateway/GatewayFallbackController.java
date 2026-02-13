package com.example.sb_api_gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class GatewayFallbackController {

    @GetMapping("/product")
    public ResponseEntity<Map<String, Object>> productFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Product Service is currently unavailable");
        response.put("status", 503);
        response.put("timestamp", Instant.now());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }

    @GetMapping("/order")
    public ResponseEntity<Map<String, Object>> orderFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Order Service is currently unavailable");
        response.put("status", 503);
        response.put("timestamp", Instant.now());
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(response);
    }
}
