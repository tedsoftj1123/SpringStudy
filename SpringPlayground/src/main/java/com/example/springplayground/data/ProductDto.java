package com.example.springplayground.data;



import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductDto {

    private String product_name;

    private Long product_price;

    private Long product_count;
}
