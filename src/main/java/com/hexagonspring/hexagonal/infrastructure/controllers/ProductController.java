package com.hexagonspring.hexagonal.infrastructure.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonspring.hexagonal.application.service.product.IProductService;
import com.hexagonspring.hexagonal.domain.entities.Product;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> list(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> show(@PathVariable Long id){
        return productService.findById(id);
    }
}
