package com.dev.smartcash.Coupon.application.api;

import com.dev.smartcash.Coupon.domain.Coupon;
import lombok.Value;

import java.util.UUID;
@Value
public class CouponListDTO {
    private UUID idCompanie;
    private String name;

    public CouponListDTO(Coupon coupon) {
        this.idCompanie = coupon.getIdCompanie();
        this.name = coupon.getName();
<<<<<<< HEAD:src/main/java/com/dev/smartcash/Coupon/application/api/CouponListDTO.java
=======
        this.statusFavorite = coupon.getStatus();
>>>>>>> develop:src/main/java/com/dev/smartcash/Coupon/application/api/CouponResponseDTO.java
    }
}
