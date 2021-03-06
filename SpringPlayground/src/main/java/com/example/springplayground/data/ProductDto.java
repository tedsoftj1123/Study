package com.example.springplayground.data;



import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductDto {

    private String productName;

    private Long productPrice;

    private Long productCount;
}
