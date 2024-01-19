package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.Coupon.domain.StatusFavorite;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@ToString
public class CouponDetailResponse {
    private UUID idCoupon;
    private UUID idCompanie;
    private String name;
    private String descricaoCoupon;
    private StatusFavorite status;

    public CouponDetailResponse(Coupon coupon) {
        this.idCoupon = coupon.getIdCoupon();
        this.idCompanie = coupon.getIdCompanie();
        this.name = coupon.getName();
        this.descricaoCoupon = coupon.getDescricaoCoupon();
        this.status = coupon.getStatus();
    }
}
