package com.example.springplayground.service;
import com.example.springplayground.data.NameDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ReadService {

    private final ProductRepository productRepository;
    public List<ProductEntity> showList() {
        return productRepository.findAll();
    }


    public List<NameDto> showName() {
        return productRepository.findAll();
    }
}
