package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.Coupon;
import com.dev.smartcash.Coupon.domain.StatusFavorite;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class CouponListDTO {
    private UUID idCompanie;
    private String name;
    private StatusFavorite status;

    public CouponListDTO(Coupon coupon) {
        this.idCompanie = coupon.getIdCompanie();
        this.name = coupon.getName();
        this.status = coupon.getStatus();
    }

    public static List<CouponListDTO> converte(List<Coupon> coupons) {
        return coupons.stream()
                .map(CouponListDTO::new)
                .collect(Collectors.toList());
    }
}
