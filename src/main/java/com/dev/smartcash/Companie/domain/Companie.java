package com.dev.smartcash.Companie.domain;

import com.dev.smartcash.Companie.application.api.CompanieRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Companie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCompanie", updatable = false, unique = true, nullable = false)
    private UUID idCompanie;
    private String urlLogo;
    @NotBlank
    @Column(unique = true)
    private String name;
    private LocalDateTime dataCadastro;

    public Companie(CompanieRequest companieRequeste) {
        this.urlLogo = companieRequeste.getUrlLogo();
        this.name = companieRequeste.getName();
        this.dataCadastro = LocalDateTime.now();
    }
}
