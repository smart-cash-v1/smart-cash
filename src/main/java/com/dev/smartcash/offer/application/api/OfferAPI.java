package com.dev.smartcash.offer.application.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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


}
