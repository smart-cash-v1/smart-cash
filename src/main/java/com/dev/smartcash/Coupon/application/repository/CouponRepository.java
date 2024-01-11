package com.dev.smartcash.Coupon.application.repository;


import com.dev.smartcash.Coupon.domain.Coupon;

import java.util.Optional;
import java.util.UUID;

public interface CouponRepository {
    Coupon save(Coupon coupon);
    Optional<Coupon> getCouponId(UUID idCompanie);
}
