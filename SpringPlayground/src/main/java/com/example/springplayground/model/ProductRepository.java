package com.example.springplayground.model;
import com.example.springplayground.data.NameDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<NameDto> findAllByProductName();
}