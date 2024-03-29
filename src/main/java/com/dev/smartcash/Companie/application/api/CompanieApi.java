package com.dev.smartcash.Companie.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/companie")
@Tag(name = "Companie", description = "Endpoints relacionados às informações das empresas.")
public interface CompanieApi {

    @PostMapping
    @Operation(summary = "Cadastra empresa",
            description = "Este endpoint cadastra uma nova empresa.")
    @ResponseStatus(HttpStatus.CREATED)
    CompanieResponse cadastraCompanie(@RequestBody CompanieRequest companieRequeste);

    @GetMapping("/all-companies")
    @Operation(summary = "Retorna todas as empresas cadastradas",
            description = "Este endpoint recupera uma lista de todas as empresas cadastradas no sistema.")
    @ResponseStatus(code = HttpStatus.OK)
    List<CompanieListResponse> getTodasCompanie();


    @GetMapping(value = "/{idCompanie}")
    @ResponseStatus(code = HttpStatus.OK)
    @Operation(summary = "Retorna uma empresa por ID",
            description = "Este endpoint recupera os detalhes de uma empresa específica com base no ID fornecido.")
    CompanieDetalhadoResponse buscaCompaniePorId(@PathVariable UUID idCompanie);


    @DeleteMapping(value = "/{idCompanie}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    @Operation(summary = "Deleta uma Companie com ID",
            description = "Este endpoint deleta uma Companie com base no ID fornecido.")
    void deletaCompanieComId(@PathVariable UUID idCompanie);

    @GetMapping("/all-companies-paginated")
    @Operation(summary = "Retorna todas as empresas cadastradas paginadas",
            description = "Este endpoint recupera uma lista de todas as empresas cadastradas no sistema com paginação.")
    @ResponseStatus(code = HttpStatus.OK)
    Page<CompanieListResponse> getTodasCompaniePaginado(Pageable pageable);
}
