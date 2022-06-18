package com.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileapp.entity.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
