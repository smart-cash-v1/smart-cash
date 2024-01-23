package com.dev.smartcash.offer.application.repository;

import com.dev.smartcash.offer.domain.Offer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface OfferRepository {
    Offer save(Offer offer);
    Optional<Object> getOfferById(UUID idOffer);
    Page<Offer> getGeneralOffer(Pageable pageable);
}
