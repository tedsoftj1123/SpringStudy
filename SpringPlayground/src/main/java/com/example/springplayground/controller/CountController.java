package com.example.springplayground.controller;

import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CountController {
    private final ProductRepository productRepository;

    @PutMapping("/count")
    public Optional<ProductEntity> addCount(@RequestParam Long id, @RequestBody ProductEntity productEntity) {
        Optional<ProductEntity> updateCount = productRepository.findById(id);

        updateCount.ifPresent(selectProduct->{
            selectProduct.setProduct_count(productEntity.getProduct_count());

            productRepository.save(selectProduct);
        });
        return updateCount;
    }
}