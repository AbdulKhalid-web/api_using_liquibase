package com.example.demo23;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<product, Integer> {

}
