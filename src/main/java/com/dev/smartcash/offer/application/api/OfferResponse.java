package com.dev.smartcash.offer.application.api;

import com.dev.smartcash.offer.domain.Offer;
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
