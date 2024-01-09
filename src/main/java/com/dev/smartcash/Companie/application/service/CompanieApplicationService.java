package com.dev.smartcash.Companie.application.service;

import com.dev.smartcash.Companie.application.api.CompanieApi;
import com.dev.smartcash.Companie.application.api.CompanieRequest;
import com.dev.smartcash.Companie.application.api.CompanieResponse;
import com.dev.smartcash.Companie.application.repository.CompanieRepository;
import com.dev.smartcash.Companie.domain.Companie;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class CompanieApplicationService implements CompanieService {
    private final CompanieRepository companieRepository;

    @Override
    public CompanieResponse cadastraCompanie(CompanieRequest companieRequest) {
        log.info("[inicia] CompanieApplicationService - cadastraCompanie");
        Companie companie = companieRepository.salva(new Companie(companieRequest));
        log.info("[finaliza] CompanieApplicationService - cadastraCompanie");
        return new CompanieResponse(companie);
    }
}

