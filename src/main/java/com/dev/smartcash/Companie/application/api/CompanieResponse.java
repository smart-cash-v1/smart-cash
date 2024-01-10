package com.dev.smartcash.Companie.application.api;

import com.dev.smartcash.Companie.domain.Companie;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class CompanieResponse {
    private UUID idCompanie;

    public CompanieResponse(Companie companie) {
        this.idCompanie = companie.getIdCompanie();
    }
}
