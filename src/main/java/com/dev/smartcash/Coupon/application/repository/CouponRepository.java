package com.dev.smartcash.Coupon.application.repository;


import com.dev.smartcash.Coupon.domain.Coupon;

import java.util.List;
import java.util.UUID;

public interface CouponRepository {
    Coupon save(Coupon coupon);
    Coupon getCouponById(UUID idCoupon);
    List<Coupon> getAllCoupons();
}
