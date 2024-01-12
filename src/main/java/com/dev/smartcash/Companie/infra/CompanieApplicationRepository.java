package com.dev.smartcash.Companie.infra;

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
public class CompanieApplicationRepository implements CompanieRepository {

    private final CompanieSpringDataJPARepository companieSpringDataJPARepository;

    @Override
    public Companie salva(Companie companie) {
        log.info("[inicia] CompanieApplicationRepository - salva");
        companieSpringDataJPARepository.save(companie);
        log.info("[finaliza] CompanieApplicationRepository -salva ");
        return companie;
    }

    @Override
    public List<Companie> buscaTodasCpmanie() {
        log.info("[inicia] CompanieApplicationRepository - buscaTodasCpmanie - ");
        List<Companie> todasCompanie = companieSpringDataJPARepository.findAll();
        log.info("[finaliza] CompanieApplicationRepository - buscaTodasCpmanie - ");
        return todasCompanie;
    }

    @Override
    public boolean existsByName(String name) {
        log.info("[inicia] CompanieApplicationRepository - existsByName");
        boolean nameExists = companieSpringDataJPARepository.existsByName(name);
        log.info("[finaliza] CompanieApplicationRepository - existsByName -  - ");
        return nameExists;
    }

    @Override
    public Companie buscaCompaniePorId(UUID idCompanie) {
        log.info("[inicia] CompanieApplicationRepository - buscaCompaniePorId ");
        Companie companie = companieSpringDataJPARepository.findById(idCompanie)
                        .orElseThrow(()-> APIException.build(HttpStatus.NOT_FOUND, "Companie não encntrada"));
        log.info("[finaliza] CompanieApplicationRepository - buscaCompaniePorId ");
        return companie;
    }

    @Override
    public void deletaCompanieComId(UUID iDcompanie) {
        log.info("[inicia] CompanieApplicationRepository - deletaCompanieComId - ");
        companieSpringDataJPARepository.deleteById(iDcompanie);
        log.info("[finaliza] CompanieApplicationRepository - deletaCompanieComId - ");
    }

    @Override
    public boolean existsById(UUID idCompanie) {
        log.info("[inicia] CompanieApplicationRepository - existsById  - ");
        boolean exists = companieSpringDataJPARepository.existsById(idCompanie);
        log.info("[finaliza] CompanieApplicationRepository - existsById  - ");
        return exists;
    }
}
