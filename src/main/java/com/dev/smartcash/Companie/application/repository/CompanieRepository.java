package com.dev.smartcash.Companie.application.repository;

import com.dev.smartcash.Companie.domain.Companie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface CompanieRepository {
    Companie salva(Companie companie);

    List<Companie> buscaTodasCpmanie();

    boolean existsByName(String name);

    Companie buscaCompaniePorId(UUID idCompanie);

    void deletaCompanieComId(UUID companie);

    boolean existsById(UUID idCompanie);

    Page<Companie> buscaTodasCompaniePaginada(Pageable pageable);
}
