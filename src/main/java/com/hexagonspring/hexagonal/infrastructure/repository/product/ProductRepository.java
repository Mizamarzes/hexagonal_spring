package com.hexagonspring.hexagonal.infrastructure.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexagonspring.hexagonal.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
