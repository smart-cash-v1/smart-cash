package com.dev.smartcash.offer.application.repository;

import com.dev.smartcash.offer.domain.Offer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface OfferRepository {
    Offer save(Offer offer);
    Offer getOfferById(UUID idOffer);
    Page<Offer> getGeneralOffer(Pageable pageable);
    void deleteOffer(Offer offer);
//
    List<Offer> generateReport();
}
