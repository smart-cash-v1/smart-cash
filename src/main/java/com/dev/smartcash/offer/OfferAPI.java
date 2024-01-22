package com.dev.smartcash.offer;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/offer")
@Tag(name = "Offer", description = "Endpoints Relacionados Ofertas.")
public interface OfferAPI {

    @PostMapping
    @Operation(summary = "Cadastra Ofertas",
            description = "Este endpoint cria Ofertas")
    @ResponseStatus(code = HttpStatus.CREATED)
    OfferResponse createdOffer(@RequestBody @Valid OfferRequest offerRequest);

}
