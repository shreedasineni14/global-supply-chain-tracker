package com.supplychain.tracker.controller;

import com.supplychain.tracker.exception.ResourceNotFoundException;
import com.supplychain.tracker.model.Order;
import com.supplychain.tracker.model.OrderStatus;
import com.supplychain.tracker.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{trackingNumber}")
    public Order getByTrackingNumber(@PathVariable String trackingNumber) {
        return orderRepository.findByTrackingNumber(trackingNumber);
    }
    
    @PutMapping("/{id}/status")
    public Order updateOrderStatus(
            @PathVariable Long id,
            @RequestParam OrderStatus status) {

        Order order = orderRepository.findById(id)
        		.orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));

        order.setStatus(status);
        return orderRepository.save(order);
    }

}
