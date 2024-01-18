package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.StatusFavorite;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@ToString
public class CouponRequest {
    @Column(columnDefinition = "uuid", name = "companie",  nullable = false)
    private UUID idCompanie;
    @NotBlank
    private String name;
    private String descricaoCoupon;
}
