package com.hexagonspring.hexagonal.application.service.product;

import java.util.List;
import java.util.Optional;

import com.hexagonspring.hexagonal.domain.entities.Product;

public interface IProductService {
    Optional<Product> findById(Long id);
    List<Product> getAll();
    Product save(Product product);
}
