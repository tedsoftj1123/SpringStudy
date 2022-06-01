package com.example.springplayground.data;

import lombok.Data;

@Data
public class NameDto {

    private String product_name;

    private Long product_price;

    private Long product_count;
}
