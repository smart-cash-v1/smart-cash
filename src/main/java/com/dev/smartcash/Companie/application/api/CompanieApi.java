package com.dev.smartcash.Companie.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companie")
public interface CompanieApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CompanieResponse cadastraCompanie(@RequestBody CompanieRequest companieRequeste);
}
