package com.dev.smartcash.offer.application.service;

import com.dev.smartcash.handler.APIException;
import com.dev.smartcash.offer.application.api.OfferListDTO;
import com.dev.smartcash.offer.application.api.OfferRequest;
import com.dev.smartcash.offer.application.api.OfferResponse;
import com.dev.smartcash.offer.application.api.OfferUpDateRequest;
import com.dev.smartcash.offer.application.repository.OfferRepository;
import com.dev.smartcash.offer.domain.Offer;
import com.dev.smartcash.offer.domain.StatusOffer;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class OfferApplicationService implements OfferService{

    private final OfferRepository offerRepository;

    @Override
    public OfferResponse newOffer(OfferRequest offerRequest) {
        log.info("[start] OfferApplicationService - createdOffer");
        int tamanhoMaximo = 3000;
        String linkUrlAumentada = offerRequest.getLinkUrl().length() > tamanhoMaximo ?
                offerRequest.getLinkUrl().substring(0, tamanhoMaximo) : offerRequest.getLinkUrl();
        Offer offer = offerRepository.save(new Offer(offerRequest));
        log.info("[finish] OfferApplicationService - createdOffer");
        return new OfferResponse(offer);
    }

    @Override
    public OfferListDTO getOfferById(UUID idOffer) {
        log.info("[start] OfferApplicationService - getOfferById");
        Offer offer = offerRepository.getOfferById(idOffer);
        log.info("[finish] OfferApplicationService - getOfferById");
        return new OfferListDTO(offer);
    }

    @Override
    public Page<OfferListDTO> getGeneralOffer(Pageable pageable) {
        log.info("[start] OfferApplicationService - getGeneralOffer");
        Page<Offer> offers = offerRepository.getGeneralOffer(pageable);
        log.info("[finish] OfferApplicationService - getGeneralOffer");
        return offers.map(OfferListDTO::new);
    }

    @Override
    public void upDateOffer(UUID idOffer, OfferUpDateRequest offerUpDateRequest) {
        log.info("[start] OfferApplicationService - upDateOffer");
        Offer offer = offerRepository.getOfferById(idOffer);
        offer.upDate(offerUpDateRequest);
        offerRepository.save(offer);
        log.info("[finish] OfferApplicationService - upDateOffer");
    }

    @Override
    public void deleteOffer(UUID idOffer) {
        log.info("[start] OfferApplicationService - deleteOffer");
        Offer offer = offerRepository.getOfferById(idOffer);
        offerRepository.deleteOffer(offer);
        log.info("[finish] OfferApplicationService - deleteOffer");
    }

    @Override
    public void changeStatusToSaved(UUID idOffer) {
        log.info("[start] OfferApplicationService - changeStatusToSaved");
        Offer offer = offerRepository.getOfferById(idOffer);
        offer.setStatus(StatusOffer.SAVED);
        offerRepository.save(offer);
        log.info("[finish] OfferApplicationService - changeStatusToSaved");
    }

    @Override
    public void changeStatusToNotSaved(UUID idOffer) {
        log.info("[start] OfferApplicationService - changeStatusToNotSaved");
        Offer offer = offerRepository.getOfferById(idOffer);
        offer.setStatus(StatusOffer.NOT_SAVED);
        offerRepository.save(offer);
        log.info("[finish] OfferApplicationService - changeStatusToNotSaved");
    }
}