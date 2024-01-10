package com.dev.smartcash.Companie.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}

