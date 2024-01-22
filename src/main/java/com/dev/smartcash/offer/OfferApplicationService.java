package com.dev.smartcash.offer;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

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
}
