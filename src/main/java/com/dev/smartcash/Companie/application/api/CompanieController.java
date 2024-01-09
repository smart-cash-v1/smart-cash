package com.dev.smartcash.Companie.application.api;

import com.dev.smartcash.Companie.application.service.CompanieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
