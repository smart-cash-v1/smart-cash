package com.dev.smartcash.offer.infra;

import com.dev.smartcash.offer.domain.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OfferSpringDataJPARepository extends JpaRepository<Offer, UUID> {

    @Query("SELECT o FROM Offer o ORDER BY o.price ASC")
    List<Offer> findAllReport();
}
