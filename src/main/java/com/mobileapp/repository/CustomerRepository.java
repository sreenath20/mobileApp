package com.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileapp.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
