package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.StatusFavorite;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@ToString
public class CouponRequest {
    @Column(columnDefinition = "uuid", name = "companie",  nullable = false)
    private UUID idCompanie;
    @NotBlank
    private String name;
    @NotNull
    @Size(min = 10, max = 350, message = "O campo deve ter entre 10 e 350 caracteres")
    private String descricaoCoupon;
}
