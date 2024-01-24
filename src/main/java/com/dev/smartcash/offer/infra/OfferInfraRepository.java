package com.dev.smartcash.offer.infra;

import com.dev.smartcash.handler.APIException;
import com.dev.smartcash.offer.application.repository.OfferRepository;
import com.dev.smartcash.offer.domain.Offer;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
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
    public Offer getOfferById(UUID idOffer) {
        log.info("[start] OfferInfraRepository - getOfferById");
        Offer offer = offerSpringDataJPARepository.findById(idOffer)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Offer not found"));
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

    @Override
    public void deleteOffer(Offer offer) {
        log.info("[start] OfferInfraRepository - deleteOffer");
        offerSpringDataJPARepository.delete(offer);
        log.info("[finish] OfferInfraRepository - deleteOffer");
    }
//
    @Override
    public List<Offer> generateReport() {
        log.info("[start] OfferInfraRepository - generateReport");
        List<Offer> generalReport = offerSpringDataJPARepository.findAllReport();
        log.info("[finish] OfferInfraRepository - generateReport");
        return generalReport.subList(0,Math.min(5, generalReport.size()));
    }
}
