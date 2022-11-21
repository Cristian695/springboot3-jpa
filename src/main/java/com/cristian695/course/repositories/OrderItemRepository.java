package com.cristian695.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian695.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
