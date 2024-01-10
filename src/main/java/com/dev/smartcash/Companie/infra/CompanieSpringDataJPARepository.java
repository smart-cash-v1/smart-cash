package com.dev.smartcash.Companie.infra;

import com.dev.smartcash.Companie.domain.Companie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanieSpringDataJPARepository extends JpaRepository<Companie, UUID> {
    boolean existsByName(String name);
}
