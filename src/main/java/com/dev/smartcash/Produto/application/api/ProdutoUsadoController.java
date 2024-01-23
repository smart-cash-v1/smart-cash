package com.dev.smartcash.Produto.application.api;

import com.dev.smartcash.Produto.application.service.ProdutoUsadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ProdutoUsadoController implements ProdutoUsadoApi {
    private final ProdutoUsadoService produtoUsadoService;

    @Override
    public ProdutoUsadoResponse cadastraProduto(ProdutoUsadoRequest produtoUsadoRequest) {
        log.info("[inicia] ProdutoUsadoController - cadastraProduto");
        ProdutoUsadoResponse produtoCadastrado = produtoUsadoService.cadastraProduto(produtoUsadoRequest);
        log.info("[finaliza] ProdutoUsadoController - cadastraProduto");
        return produtoCadastrado;
    }
}
