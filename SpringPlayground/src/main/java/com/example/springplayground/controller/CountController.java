package com.example.springplayground.controller;

import com.example.springplayground.data.ProductDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.service.CountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CountController {
    private final CountService countService;
    @PutMapping("/count")
    public Optional<ProductEntity> count(@RequestParam Long id,@RequestBody ProductDto productDto) {
        return countService.addCount(productDto, id);
    }
}