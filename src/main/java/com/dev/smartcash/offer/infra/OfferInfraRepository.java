package com.dev.smartcash.offer.infra;

import com.dev.smartcash.offer.application.repository.OfferRepository;
import com.dev.smartcash.offer.domain.Offer;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class OfferInfraRepository implements OfferRepository {

    private final OfferSpringDataJPARepository offerSpringDataJPARepository;

    @Override
    public Offer save(Offer offer) {
        log.info("[start] OfferInfraRepository - save");
        offerSpringDataJPARepository.save(offer);
        log.info("[finish] OfferInfraRepository - save");
        return offer;
    }

    @Override
    public Optional<Object> getOfferById(UUID idOffer) {
        log.info("[start] OfferInfraRepository - getOfferById");
        Optional<Object> offer = offerSpringDataJPARepository.findByIdOffer(idOffer);
        log.info("[finish] OfferInfraRepository - getOfferById");
        return offer;
    }

    @Override
    public Page<Offer> getGeneralOffer(Pageable pageable) {
        log.info("[start] OfferInfraRepository - getGeneralOffer");
        Page<Offer> generalOffer = offerSpringDataJPARepository.findAll(pageable);
        log.info("[finish] OfferInfraRepository - getGeneralOffer");
        return generalOffer;
    }
}
