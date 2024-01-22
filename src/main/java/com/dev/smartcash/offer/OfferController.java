package com.dev.smartcash.offer;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
