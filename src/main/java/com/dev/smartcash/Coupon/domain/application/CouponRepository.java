package com.dev.smartcash.Coupon.domain.application;


import com.dev.smartcash.Coupon.domain.Coupon;

public interface CouponRepository {
    Coupon save(Coupon coupon);
}
