package com.dev.smartcash.offer.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/offer")
@Tag(name = "Offer", description = "Endpoints Relacionados Ofertas.")
public interface OfferAPI {

    @PostMapping
    @Operation(summary = "Cadastra Ofertas",
            description = "Este endpoint cria Ofertas")
    @ResponseStatus(code = HttpStatus.CREATED)
    OfferResponse createdOffer(@RequestBody @Valid OfferRequest offerRequest);

    @GetMapping(value = "/{idOffer}")
    @Operation(summary = "Detalha Oferta por ID da Oferta",
            description = "Este endpoint Detalha uma determinada Oferta.")
    @ResponseStatus(code = HttpStatus.OK)
    OfferListDTO getOfferById(@PathVariable UUID idOffer);

    @GetMapping
    @Operation(summary = "Retorna todas as Ofertas cadastradas paginadas",
            description = "Este endpoint recupera uma lista de todas as Ofertas cadastradas no Sistema.")
    @ResponseStatus(code = HttpStatus.OK)
    Page<OfferListDTO> getGeneralOffer(Pageable pageable);

    @PutMapping(value = "/{idOffer}")
    @Operation(summary = "Atualiza/Edita Ofertas",
            description = "Este endpoint Atualiza/Edita os campos da Oferta Criada, pelo ID.")
    @ResponseStatus(code = HttpStatus.OK)
    void upDateOffersById(@PathVariable UUID idOffer, @Valid @RequestBody OfferUpDateRequest offerUpDateRequest);

    @DeleteMapping(value = "/{idOffer}")
    @Operation(summary = "Deleta Ofertas",
            description = "Este endpoint Deleta as Oferta, pelo ID.")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteOfferById(@PathVariable UUID idOffer);


}
