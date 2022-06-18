package com.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mobileapp.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
