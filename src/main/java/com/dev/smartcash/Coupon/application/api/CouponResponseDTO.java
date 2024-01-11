package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.Coupon.domain.StatusFavorite;
import lombok.Value;

import java.util.UUID;
@Value
public class CouponResponseDTO {
    private UUID idCompanie;
    private String name;
    private StatusFavorite statusFavorite;

    public CouponResponseDTO(Coupon coupon) {
        this.idCompanie = coupon.getIdCompanie();
        this.name = coupon.getName();
        this.statusFavorite = coupon.getStatusFavorite();
    }
}
