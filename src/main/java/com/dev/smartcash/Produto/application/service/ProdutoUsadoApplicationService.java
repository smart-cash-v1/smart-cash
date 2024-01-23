package com.dev.smartcash.Produto.application.service;

import com.dev.smartcash.Produto.application.api.ProdutoUsadoRequest;
import com.dev.smartcash.Produto.application.api.ProdutoUsadoResponse;
import com.dev.smartcash.Produto.application.repository.ProdutoUsadoRepository;
import com.dev.smartcash.Produto.domain.ProdutoUsado;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class ProdutoUsadoApplicationService implements ProdutoUsadoService {
    private final ProdutoUsadoRepository produtoUsadoRepository;

    @Override
    public ProdutoUsadoResponse cadastraProduto(ProdutoUsadoRequest produtoUsadoRequest) {
        log.info("[inicia]  ProdutoUsadoApplicationService  - cadastraProduto");
        ProdutoUsado produtoUsado = produtoUsadoRepository.salva(new ProdutoUsado(produtoUsadoRequest));
        log.info("[finaliza]  ProdutoUsadoApplicationService  - cadastraProduto");
        return new ProdutoUsadoResponse(produtoUsado);
    }
}
