package com.dev.smartcash.Companie.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companie")
public interface CompanieApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CompanieResponse cadastraCompanie(@RequestBody CompanieRequest companieRequeste);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<CompanieListResponse> getTodasCompanie();

}
