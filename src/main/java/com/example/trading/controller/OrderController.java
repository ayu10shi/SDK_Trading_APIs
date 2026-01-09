package com.example.trading.controller;

import com.example.trading.model.Order;
import com.example.trading.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/orders")
    public Order placeOrder(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable String id) {
        return service.getOrder(id);
    }
}
