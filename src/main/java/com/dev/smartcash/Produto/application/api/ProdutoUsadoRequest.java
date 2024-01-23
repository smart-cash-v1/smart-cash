package com.dev.smartcash.Produto.application.api;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class ProdutoUsadoRequest {

    private String name;
    private BigDecimal price;
    private String phone;
    private String imageUrl;
    private String city;
}
