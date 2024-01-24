package com.dev.smartcash.offer.application.api;

import com.dev.smartcash.offer.domain.Offer;
import lombok.Value;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Value
public class OfferListReport {


    private String name;
    private BigDecimal price;
    private String linkUrl;
    private String imageUrl;

    public OfferListReport(Offer offer) {
        this.name = offer.getName();
        this.price = offer.getPrice();
        this.linkUrl = offer.getLinkUrl();
        this.imageUrl = offer.getImageUrl();
    }

    public static List<OfferListReport> converte(List<Offer> report) {
        return report.stream()
                .map(OfferListReport::new)
                .collect(Collectors.toList());
    }
}
