package com.example.springplayground.service;

import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeleteService {
    private final ProductRepository productRepository;

    public void deleteProduct(Long id) {
        Optional<ProductEntity> product = productRepository.findById(id);
        product.ifPresent(productRepository::delete);
    }
}
