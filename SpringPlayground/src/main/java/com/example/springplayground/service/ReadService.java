package com.example.springplayground.service;
import com.example.springplayground.data.TestDto;
import com.example.springplayground.model.ProductEntity;
import com.example.springplayground.model.ProductNameMapping;
import com.example.springplayground.model.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ReadService {

    private final ProductRepository productRepository;
    public List<ProductEntity> showList() {
        return productRepository.findAll();
    }
    public Optional<ProductEntity> showProduct(Long id) {
        return productRepository.findById(id);
    }

    public List<ProductNameMapping> showName() {
        return productRepository.findAllBy();
    }

    public TestDto get(Long id) {
        return productRepository.findById(id)
                .map(a -> TestDto.builder()
                        .test(a.getProductName())
                        .build())
                .orElseThrow(RuntimeException::new);
    }
}
