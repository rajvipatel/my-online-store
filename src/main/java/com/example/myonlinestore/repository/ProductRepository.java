package com.example.myonlinestore.repository;

import com.example.myonlinestore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Added a comment for GitPush
public interface ProductRepository extends JpaRepository<Product, Long> {
}