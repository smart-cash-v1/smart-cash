package com.dev.smartcash.Companie.application.repository;

import com.dev.smartcash.Companie.application.api.CompanieApi;
import com.dev.smartcash.Companie.domain.Companie;

import java.util.List;

public interface CompanieRepository {
    Companie salva(Companie companie);

    List<Companie> buscaTodasCpmanie();

    boolean existsByName(String name);
}
