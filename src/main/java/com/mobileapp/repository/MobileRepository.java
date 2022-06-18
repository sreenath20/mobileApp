package com.mobileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileapp.entity.Mobile;
@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{

}
