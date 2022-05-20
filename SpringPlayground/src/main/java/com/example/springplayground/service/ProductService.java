package com.example.springplayground.service;


import com.example.springplayground.data.ProductDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public String addProduct(ProductDto productDto) {
        productRepository.save(ProductEntity.builder()
                .productName(productDto.getProductName())
                .price(productDto.getPrice())
                .count(productDto.getCount())
                .build());
        return "상품이 추가되었습니다.";
    }

}
