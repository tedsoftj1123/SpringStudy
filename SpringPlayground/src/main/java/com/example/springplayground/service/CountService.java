package com.example.springplayground.service;


import com.example.springplayground.data.ProductDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountService {

    private final ProductRepository productRepository;

    public Optional<ProductEntity> addCount(ProductDto productDto, Long id) {
        Optional<ProductEntity> updateCount = productRepository.findById(id);

        updateCount.ifPresent(selectProduct->{
            selectProduct.setProductCount(productDto.getProductCount());

            productRepository.save(selectProduct);
        });
        return updateCount;
    }
}
