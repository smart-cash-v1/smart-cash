package com.dev.smartcash.Companie.application.service;

import com.dev.smartcash.Companie.application.api.*;
import com.dev.smartcash.Companie.application.repository.CompanieRepository;
import com.dev.smartcash.Companie.domain.Companie;
import com.dev.smartcash.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class CompanieApplicationService implements CompanieService {
    private final CompanieRepository companieRepository;

    @Override
    public CompanieResponse cadastraCompanie(CompanieRequest companieRequest) {
        log.info("[inicia] CompanieApplicationService - cadastraCompanie");
        if (companieRepository.existsByName(companieRequest.getName())){
            String errorMessage = "Já existe uma empresa cadastrada com o mesmo nome.";
            log.error(errorMessage);
            throw APIException.build(HttpStatus.BAD_REQUEST, errorMessage);
        }
        Companie companie = companieRepository.salva(new Companie(companieRequest));
        log.info("[finaliza] CompanieApplicationService - cadastraCompanie");
        return new CompanieResponse(companie);
    }

    @Override
    public List<CompanieListResponse> buscaTodasCompanie() {
        log.info("[inicia] CompanieApplicationService - buscaTodasCompanie ");
        List<Companie> companies = companieRepository.buscaTodasCpmanie();
        log.info("[finaliza] CompanieApplicationService - buscaTodasCompanie ");
        return CompanieListResponse.converte(companies);
    }

    @Override
    public CompanieDetalhadoResponse buscaCompaniePorID(UUID idCompanie) {
        log.info("[inicia] CompanieApplicationService - buscaCompaniePorID ");
        Companie companie = companieRepository.buscaCompaniePorId(idCompanie);
        log.info("[finaliza] CompanieApplicationService - buscaCompaniePorID");
        return new CompanieDetalhadoResponse(companie);
    }

    @Override
    public void deletaCompanieComId(UUID idCompanie) {
        log.info("[inicia] CompanieApplicationService - deletaCompanieComId ");
        Companie companie = companieRepository.buscaCompaniePorId(idCompanie);
        companieRepository.deletaCompanieComId(companie);
        log.info("[finaliza] CompanieApplicationService - deletaCompanieComId");
    }
}
