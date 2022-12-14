package com.spring.ecommerce2.repository;

import com.spring.ecommerce2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}