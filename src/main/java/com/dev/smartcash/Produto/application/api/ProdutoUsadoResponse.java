package com.dev.smartcash.Produto.application.api;

import com.dev.smartcash.Produto.domain.ProdutoUsado;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@ToString
@Getter
public class ProdutoUsadoResponse {
    private UUID idProduto;

    public ProdutoUsadoResponse(ProdutoUsado produtoUsado) {
        this.idProduto = produtoUsado.getIdProduto();
    }
}
