package com.dev.smartcash.offer.application.repository;

import com.dev.smartcash.offer.domain.Offer;

public interface OfferRepository {
    Offer save(Offer offer);
}
