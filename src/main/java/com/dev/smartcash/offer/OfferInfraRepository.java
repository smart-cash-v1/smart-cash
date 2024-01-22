package com.dev.smartcash.offer;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class OfferInfraRepository implements OfferRepository{

    private final OfferSpringDataJPARepository offerSpringDataJPARepository;

    @Override
    public Offer save(Offer offer) {
        log.info("[start] OfferInfraRepository - save");
        offerSpringDataJPARepository.save(offer);
        log.info("[finish] OfferInfraRepository - save");
        return offer;
    }
}
