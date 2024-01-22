package com.dev.smartcash.offer.domain;

import com.dev.smartcash.offer.application.api.OfferRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idOffer;
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    @NotBlank
    private String linkUrl;
    @NotBlank
    private String imageUrl;

    public Offer(OfferRequest offerRequest) {
        this.name = offerRequest.getName();
        this.price = offerRequest.getPrice();
        this.linkUrl = offerRequest.getLinkUrl();
        this.imageUrl = offerRequest.getImageUrl();
    }
}
