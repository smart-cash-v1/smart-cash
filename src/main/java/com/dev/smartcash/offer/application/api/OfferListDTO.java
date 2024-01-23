package com.dev.smartcash.offer.application.api;

import com.dev.smartcash.offer.domain.Offer;
import lombok.Value;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;

@Value
public class OfferListDTO {

    private String name;
    private BigDecimal price;
    private String linkUrl;
    private String imageUrl;


    public OfferListDTO(Offer offer) {
        this.name = offer.getName();
        this.price = offer.getPrice();
        this.linkUrl = offer.getLinkUrl();
        this.imageUrl = offer.getImageUrl();
    }

}
