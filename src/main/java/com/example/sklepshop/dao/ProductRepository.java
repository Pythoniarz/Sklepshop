package com.example.sklepshop.dao;

import com.example.sklepshop.service.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
