package com.dev.smartcash.offer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OfferSpringDataJPARepository extends JpaRepository<Offer, UUID> {
}
