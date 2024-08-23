package com.hexagonspring.hexagonal.infrastructure.repository.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexagonspring.hexagonal.application.service.product.IProductService;
import com.hexagonspring.hexagonal.domain.entities.Product;

@Service
public class ProductAdapter implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

}
