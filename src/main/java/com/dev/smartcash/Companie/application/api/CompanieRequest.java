package com.dev.smartcash.Companie.application.api;

import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@ToString
public class CompanieRequest {
    private String urlLogo;
    @NotBlank
    private String name;
}
