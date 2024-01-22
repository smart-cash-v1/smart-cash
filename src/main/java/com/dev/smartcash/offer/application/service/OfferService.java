package com.dev.smartcash.offer.application.service;

import com.dev.smartcash.offer.application.api.OfferRequest;
import com.dev.smartcash.offer.application.api.OfferResponse;

public interface OfferService {
    OfferResponse newOffer(OfferRequest offerRequest);
}
