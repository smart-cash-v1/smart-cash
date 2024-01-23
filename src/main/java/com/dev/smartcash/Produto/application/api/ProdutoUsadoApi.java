package com.dev.smartcash.Produto.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/produto")
@Tag(name = "Companie", description = "Endpoints relacionados às informações dos produtos.")
public interface ProdutoUsadoApi {

    @PostMapping
    @Operation(summary = "Cadastra um produto",
            description = "Este endpoint cadastra um produto")
    @ResponseStatus(HttpStatus.CREATED)
    ProdutoUsadoResponse cadastraProduto(@RequestBody @Valid ProdutoUsadoRequest produtoUsadoRequest);

}
