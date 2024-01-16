package com.dev.smartcash.Coupon.application.repository;


import com.dev.smartcash.Coupon.domain.Coupon;

import java.util.Optional;
import java.util.UUID;

public interface CouponRepository {
    Coupon save(Coupon coupon);
    Coupon getCouponById(UUID idCoupon);
    List<Coupon> getAllCoupons();
    Coupon getCompanieId(UUID idCompanie);
    void deleteCouponById(Coupon coupon);
    Optional<Coupon> getCouponById(UUID idCoupon);

}
