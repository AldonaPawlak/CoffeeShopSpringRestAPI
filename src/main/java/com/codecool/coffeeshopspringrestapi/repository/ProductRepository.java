package com.codecool.coffeeshopspringrestapi.repository;

import com.codecool.coffeeshopspringrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}