package com.dev.smartcash.Companie.application.api;

import com.dev.smartcash.Companie.domain.Companie;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class CompanieListResponse {
    private UUID idCompanie;
    private String urlLogo;
    @NotBlank
    private String name;

    public static List<CompanieListResponse> converte(List<Companie> companies) {
        return companies.stream()
                .map(CompanieListResponse::new)
                .collect(Collectors.toList());
    }

    public CompanieListResponse(Companie companie) {
        this.idCompanie = companie.getIdCompanie();
        this.urlLogo = companie.getUrlLogo();
        this.name = companie.getName();
    }
}
