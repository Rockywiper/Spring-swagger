package com.amazonOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amazonOrder.model.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

}
