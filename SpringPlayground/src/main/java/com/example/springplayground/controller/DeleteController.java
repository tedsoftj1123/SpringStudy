package com.example.springplayground.controller;

import com.example.springplayground.service.DeleteService;
import com.example.springplayground.service.ReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeleteController {

    private final DeleteService deleteService;
    @DeleteMapping("/product/delete")
    public void deleteProduct(@RequestParam Long id) {
            deleteService.deleteProduct(id);
    }
}
