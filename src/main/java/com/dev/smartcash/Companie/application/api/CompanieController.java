package com.dev.smartcash.Companie.application.api;

import com.dev.smartcash.Companie.application.service.CompanieService;
import com.dev.smartcash.Companie.domain.Companie;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Log4j2
@RequiredArgsConstructor
@RestController
public class CompanieController implements CompanieApi {
    private final CompanieService companieService;

    @Override
    public CompanieResponse cadastraCompanie(CompanieRequest companieRequest) {
        log.info("[inicia] CompanieController - cadastraCompanie");
        CompanieResponse companieCadastrada = companieService.cadastraCompanie(companieRequest);
        log.info("[finaliza] CompanieController - cadastraCompanie");
        return companieCadastrada;
    }

    @Override
    public List<CompanieListResponse> getTodasCompanie() {
        log.info("[inicia] CompanieController - getTodasCompanie");
        List<CompanieListResponse> todasComnpanie = companieService.buscaTodasCompanie();
        log.info("[finaliza] CompanieController - getTodasCompanie");
        return todasComnpanie;
    }

    @Override
    public CompanieDetalhadoResponse buscaCompaniePorId(UUID idCompanie) {
        log.info("[inicia] CompanieController - buscaCompaniePorId");
        CompanieDetalhadoResponse companieDetalhada = companieService.buscaCompaniePorID(idCompanie);
        log.info("[finaliza] CompanieController - buscaCompaniePorId");
        return companieDetalhada;
    }

    @Override
    public void deletaCompanieComId(UUID idCompanie) {
        log.info("[inicia] CompanieController - deletaCompanieComId");
        companieService.deletaCompanieComId(idCompanie);
        log.info("[finaliza] CompanieController - deletaCompanieComId");
    }

    @Override
    public Page<CompanieListResponse> getTodasCompaniePaginado(Pageable pageable) {
        log.info("[inicia] CompanieController - getTodasCompaniePaginado");
        Page<CompanieListResponse> todasCompanie = companieService.buscaTodasCompaniePaginada(pageable);
        log.info("[finaliza] CompanieController - getTodasCompaniePaginado");
        return todasCompanie;
    }
}
