package com.dev.smartcash.offer.application.api;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class OfferUpDateRequest {
    private String name;
    private BigDecimal price;
    private String linkUrl;
    private String imageUrl;
}
