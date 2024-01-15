package com.dev.smartcash.Companie.application.api;

import com.dev.smartcash.Companie.domain.Companie;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Value
public class CompanieDetalhadoResponse {
    private UUID idCompanie;
    private String urlLogo;
    @NotBlank
    private String name;

    public CompanieDetalhadoResponse(Companie companie) {
        this.idCompanie = companie.getIdCompanie();
        this.urlLogo = companie.getUrlLogo();
        this.name = companie.getName();
    }
}
