package com.dev.smartcash.Companie.application.repository;

import com.dev.smartcash.Companie.application.api.CompanieApi;
import com.dev.smartcash.Companie.domain.Companie;

import java.util.List;
import java.util.UUID;

public interface CompanieRepository {
    Companie salva(Companie companie);

    List<Companie> buscaTodasCpmanie();

    boolean existsByName(String name);

    Companie buscaCompaniePorId(UUID idCompanie);

    void deletaCompanieComId(Companie companie);
}
