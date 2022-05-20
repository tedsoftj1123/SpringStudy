package com.example.springplayground.controller;

import com.example.springplayground.data.ProductDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductRepository;
import com.example.springplayground.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CountController {

    private final ProductRepository productRepository;

    @PutMapping("/count")
    public String addCount(@RequestParam Long id, @RequestBody ProductEntity productEntity) {
        Optional<ProductEntity> updateProduct = productRepository.findById(id);

        updateProduct.ifPresent(selectProductEntity->{
            selectProductEntity.setProduct_count(productEntity.getProduct_count());

            productRepository.save(selectProductEntity);
        });
        return null;
    }
}
