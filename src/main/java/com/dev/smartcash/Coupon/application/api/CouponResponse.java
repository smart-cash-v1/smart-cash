package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class CouponResponse {
    private UUID idCoupon;

    public CouponResponse(Coupon coupon) {
        this.idCoupon = coupon.getIdCoupon();
    }
}
