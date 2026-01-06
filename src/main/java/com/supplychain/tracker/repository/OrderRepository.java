package com.supplychain.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.supplychain.tracker.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByTrackingNumber(String trackingNumber);
}
