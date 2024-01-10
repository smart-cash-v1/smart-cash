package com.dev.smartcash.Companie.infra;

import com.dev.smartcash.Companie.application.repository.CompanieRepository;
import com.dev.smartcash.Companie.domain.Companie;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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
        log.info("[inicia] CompanieApplicationRepository - existsByName -  - ");
        boolean nameExists = companieSpringDataJPARepository.existsByName(name);
        log.info("[finaliza] CompanieApplicationRepository - existsByName -  - ");
        return nameExists;
    }
}
