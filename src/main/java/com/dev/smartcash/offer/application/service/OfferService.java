package com.dev.smartcash.offer.application.service;

import com.dev.smartcash.offer.application.api.OfferListDTO;
import com.dev.smartcash.offer.application.api.OfferRequest;
import com.dev.smartcash.offer.application.api.OfferResponse;
import com.dev.smartcash.offer.application.api.OfferUpDateRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface OfferService {
    OfferResponse newOffer(OfferRequest offerRequest);
    OfferListDTO getOfferById(UUID idOffer);
    Page<OfferListDTO> getGeneralOffer(Pageable pageable);
    void upDateOffer(UUID idOffer, OfferUpDateRequest offerUpDateRequest);
    void deleteOffer(UUID idOffer);
    void changeStatusToSaved(UUID idOffer);
    void changeStatusToNotSaved(UUID idOffer);
}
