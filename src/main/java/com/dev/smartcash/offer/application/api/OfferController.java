package com.dev.smartcash.offer.application.api;

import com.dev.smartcash.offer.application.service.OfferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class OfferController implements OfferAPI{

    private final OfferService offerService;

    @Override
    public OfferResponse createdOffer(OfferRequest offerRequest) {
        log.info("[start] OfferController - createdOffer");
        OfferResponse offerCreated = offerService.newOffer(offerRequest);
        log.info("[finish] OfferController - createdOffer");
        return offerCreated;
    }

    @Override
    public OfferListDTO getOfferById(UUID idOffer) {
        log.info("[start] OfferController - getOfferById");
        OfferListDTO offer = offerService.getOfferById(idOffer);
        log.info("[finish] OfferController - getOfferById");
        return offer;
    }
}
