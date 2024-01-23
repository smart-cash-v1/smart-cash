package com.dev.smartcash.offer.infra;

import com.dev.smartcash.offer.domain.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface OfferSpringDataJPARepository extends JpaRepository<Offer, UUID> {
}
