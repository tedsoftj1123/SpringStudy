package com.example.springplayground.controller;

import com.example.springplayground.data.NameDto;
import com.example.springplayground.data.ProductDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.service.ReadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Controller
public class ReadController {

    private final ReadService readService;

    public ReadController(ReadService readService) {
        this.readService = readService;
    }

    @GetMapping("/showlist")
    public List<ProductEntity> show(ProductDto productDto) {
        return readService.showList();
    }

    @PostMapping("/showname")
    public String showName(@RequestBody NameDto nameDto) {
        return readService.showName(nameDto);

    }
}
