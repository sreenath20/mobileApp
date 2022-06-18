package com.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileapp.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
