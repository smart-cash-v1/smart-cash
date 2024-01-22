package com.dev.smartcash.offer;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@ToString
public class OfferRequest {
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    @NotBlank
    private String linkUrl;
    @NotBlank
    private String imageUrl;
}
