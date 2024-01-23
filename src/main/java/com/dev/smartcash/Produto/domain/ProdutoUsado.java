package com.dev.smartcash.Produto.domain;

import com.dev.smartcash.Produto.application.api.ProdutoUsadoRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProdutoUsado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCompanie", updatable = false, unique = true, nullable = false)
    private UUID idProduto;
    @NotBlank
    private String name;
    @NotNull
    private BigDecimal price;
    @NotBlank
    private String phone;
    @NotBlank
    private String imageUrl;
    @NotBlank
    private String city;
    private LocalDateTime dataCadastro;

    public ProdutoUsado(ProdutoUsadoRequest produtoUsadoRequest) {
        this.name = produtoUsadoRequest.getName();
        this.price = produtoUsadoRequest.getPrice();
        this.phone = produtoUsadoRequest.getPhone();
        this.imageUrl = produtoUsadoRequest.getImageUrl();
        this.city = produtoUsadoRequest.getCity();
        this.dataCadastro = LocalDateTime.now();
    }

}
