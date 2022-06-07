package com.example.springplayground.controller;
import com.example.springplayground.data.TestDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductNameMapping;
import com.example.springplayground.service.ReadService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ReadController {

    private final ReadService readService;

    public ReadController(ReadService readService) {
        this.readService = readService;
    }

    @GetMapping("test/{id}")
    public TestDto get(@PathVariable Long id) {
        return readService.get(id);
    }

    @GetMapping("/showlist")
    public List<ProductEntity> show() {
        return readService.showList();
    }

    @GetMapping("/showname")
    public List<ProductNameMapping> showName() {
        return readService.showName();
    }
}
