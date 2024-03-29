package com.dev.smartcash.Companie.application.service;

import com.dev.smartcash.Companie.application.api.*;
import com.dev.smartcash.Companie.application.repository.CompanieRepository;
import com.dev.smartcash.Companie.domain.Companie;
import com.dev.smartcash.handler.CompanieNotFoundException;
import com.dev.smartcash.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        if (StringUtils.isBlank(companieRequest.getName())) {
            String errorMessage = "O campo 'name' não pode ser vazio.";
            log.error(errorMessage);
            throw APIException.build(HttpStatus.BAD_REQUEST, errorMessage);
        }
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
        log.info("[inicia] CompanieApplicationService - buscaTodasCompanie");
        List<Companie> companies = companieRepository.buscaTodasCpmanie();
        log.info("[finaliza] CompanieApplicationService - buscaTodasCompanie");
        return CompanieListResponse.converte(companies);
    }

    @Override
    public CompanieDetalhadoResponse buscaCompaniePorID(UUID idCompanie) {
        log.info("[inicia] CompanieApplicationService - buscaCompaniePorID");
        Companie companie = companieRepository.buscaCompaniePorId(idCompanie);
        log.info("[finaliza] CompanieApplicationService - buscaCompaniePorID");
        return new CompanieDetalhadoResponse(companie);
    }

    @Override
    public void deletaCompanieComId(UUID idCompanie) {
        log.info("[inicia] CompanieApplicationService - deletaCompanieComId");
        if (!companieRepository.existsById(idCompanie)) {
            throw new CompanieNotFoundException("Empresa não encontrada com o ID fornecido.");
        }
        companieRepository.deletaCompanieComId(idCompanie);
        log.info("[finaliza] CompanieApplicationService - deletaCompanieComId");
    }
    @Override
    public Page<CompanieListResponse> buscaTodasCompaniePaginada(Pageable pageable) {
        log.info("[inicia] CompanieApplicationService - buscaTodasCompaniePaginada ");
        Page<Companie> companies = companieRepository.buscaTodasCompaniePaginada(pageable);
        log.info("[finaliza] CompanieApplicationService - buscaTodasCompaniePaginada");
        return companies.map(CompanieListResponse::new);
    }
}
