package com.dev.smartcash.Produto.application.service;

import com.dev.smartcash.Produto.application.api.ProdutoUsadoRequest;
import com.dev.smartcash.Produto.application.api.ProdutoUsadoResponse;

public interface ProdutoUsadoService {
    ProdutoUsadoResponse cadastraProduto(ProdutoUsadoRequest produtoUsadoRequest);
}
