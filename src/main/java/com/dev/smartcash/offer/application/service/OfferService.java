package com.dev.smartcash.offer.application.service;

import com.dev.smartcash.offer.application.api.OfferListDTO;
import com.dev.smartcash.offer.application.api.OfferRequest;
import com.dev.smartcash.offer.application.api.OfferResponse;

import java.util.UUID;

public interface OfferService {
    OfferResponse newOffer(OfferRequest offerRequest);
    OfferListDTO getOfferById(UUID idOffer);
}
