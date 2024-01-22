package com.dev.smartcash.offer;

import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class OfferResponse {
    private UUID idOffer;

    public OfferResponse(Offer offer) {
        this.idOffer = offer.getIdOffer();
    }
}
