package com.cristian695.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian695.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
