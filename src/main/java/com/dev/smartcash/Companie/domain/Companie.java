package com.dev.smartcash.Companie.domain;

import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Companie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idCompanie", updatable = false, unique = true, nullable = false)
    private UUID id;

    private String urlLogo;
    @NotBlank
    private String name;


}

