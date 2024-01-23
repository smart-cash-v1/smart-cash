package com.dev.smartcash.offer.application.api;

import com.dev.smartcash.offer.domain.Offer;
import com.dev.smartcash.offer.domain.StatusOffer;
import lombok.Value;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.util.UUID;

@Value
public class OfferListDTO {

    private UUID idOffer;
    private String name;
    private BigDecimal price;
    private String linkUrl;
    private String imageUrl;
    private StatusOffer status;


    public OfferListDTO(Offer offer) {
        this.idOffer = offer.getIdOffer();
        this.name = offer.getName();
        this.price = offer.getPrice();
        this.linkUrl = offer.getLinkUrl();
        this.imageUrl = offer.getImageUrl();
        this.status = offer.getStatus();
    }

}
